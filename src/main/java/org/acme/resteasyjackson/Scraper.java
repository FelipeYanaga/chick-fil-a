package org.acme.resteasyjackson;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


import javax.sound.midi.SysexMessage;
import javax.swing.text.StyledDocument;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class Scraper{
    private Map<String, Dish> dishes = new HashMap<String, Dish>();

    public String[] test (String item) throws IOException {

        String url = "";
        if (item.equalsIgnoreCase("biscuit")){
            url = "https://www.chick-fil-a.com/menu/chick-fil-a-chicken-biscuit";
        }
        else{
            url = "https://www.chick-fil-a.com/menu/chick-fil-a-chicken-sandwich";
        }

        HttpClient client = HttpClientBuilder.create().build();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(1000).setConnectTimeout(1000).setSocketTimeout(1000).build();
        HttpGet get = new HttpGet(url);
        get.setConfig(requestConfig);
        HttpResponse response = client.execute(get);

        String content = new BufferedReader(new InputStreamReader(response.getEntity().getContent())).lines().parallel()
                .collect(Collectors.joining("\n"));

        Document doc = Jsoup.parse(content);
        Elements links = doc.getElementsByClass("p-nutri__content").select("p");

        String[] s = links.text().split(",");

        return s;

    }

    public List<Dish> unc() throws IOException{
        String url = "https://dining.unc.edu/locations/chase/?date=2021-04-27";
        HttpClient client = HttpClientBuilder.create().build();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(1000).setConnectTimeout(1000).setSocketTimeout(1000).build();
        HttpGet get = new HttpGet(url);
        get.setConfig(requestConfig);
        HttpResponse response = client.execute(get);

        String content = new BufferedReader(new InputStreamReader(response.getEntity().getContent())).lines().parallel()
                .collect(Collectors.joining("\n"));

        Document doc = Jsoup.parse(content);
        Elements links = doc.getElementsByAttribute("data-searchable");

        List<Dish> list = new ArrayList<>();

        for (Element link : links){
            String ingredients = link.attr("data-searchable");
            String ingredientName = link.selectFirst("a").text();
            dishes.put(ingredientName,Dish.of(ingredientName, ingredients));
            list.add(Dish.of(ingredientName, ingredients));
        }

        return list;
    }

}
