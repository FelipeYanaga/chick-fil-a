package org.acme.resteasyjackson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {
        String url = "https://dining.unc.edu/wp-content/themes/nmc_dining/ajax-content/recipe.php?recipe=" + 10708;
        HttpClient client = HttpClientBuilder.create().build();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(3000).setConnectTimeout(3000).setSocketTimeout(3000).build();
        HttpGet get = new HttpGet(url);
        get.setConfig(requestConfig);
        HttpResponse response = client.execute(get);

        String content = new BufferedReader(new InputStreamReader(response.getEntity().getContent())).lines().parallel()
                .collect(Collectors.joining("\n"));

        Document doc = Jsoup.parse(content);
        List<Dish> list = new ArrayList<>();

        Element dishName = doc.selectFirst("h2");
        Elements links = doc.select("p").select("strong");

        String a = dishName.ownText();

        System.out.println(a);


    }
}
