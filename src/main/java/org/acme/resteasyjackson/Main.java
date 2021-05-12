package org.acme.resteasyjackson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.HttpParams;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException, URISyntaxException {
//        Scraper scraper = new Scraper();
//        List<Integer> ids = scraper.getRecipeIds();
//        Formatter formatter = new Formatter();
//        int i = 0;
//        for (int id : ids){
//            System.out.println(i);
//            System.out.println(id);
//            i++;
//            System.out.println(scraper.getDish(id).name);
//            System.out.println(scraper.getDish(id).ingredients.trim());
//
//        }
//        HttpClient client = HttpClientBuilder.create().build();
//        RequestConfig requestConfig = RequestConfig.custom()
//                .setConnectionRequestTimeout(1000).setConnectTimeout(1000).setSocketTimeout(1000).build();
//        HttpGet get = new HttpGet("http://dining.housing.wisc.edu/NetNutrition/1/NutritionDetail/ShowItemNutritionLabel");
//        URIBuilder builder = new URIBuilder("http://dining.housing.wisc.edu/NetNutrition/1/NutritionDetail/ShowItemNutritionLabel");
//        builder.setParameter("detailOid","396786173");
//        HttpPost post = new HttpPost(builder.build());
//        post.addHeader("Content-Type","application/x-www-form-urlencoded");
//        post.addHeader("Host","dining.housing.wisc.edu");
//        post.addHeader("Origin","http://dining.housing.wisc.edu");
//        post.addHeader("Cookie","ASP.NET_SessionId=11u3z5pwdex1tfalx5gvx1aa; CBORD.netnutrition2=NNexternalID=1; uw_madison_cookieconsent_timestamp=1619741024; uw_madison_cookieconsent_url=https://menus.housing.wisc.edu/");
//        post.setConfig(requestConfig);
//
//        HttpResponse response = client.execute(post);
//
//        String content = new BufferedReader(new InputStreamReader(response.getEntity().getContent())).lines().parallel()
//                .collect(Collectors.joining("\n"));
//
//        Document doc = Jsoup.parse(content);
//        System.out.println("A");
        double abc = 3.0/5;
        System.out.println(abc);
        int[] test = new int[5];
        System.out.println(test[-1]);
    }
}
