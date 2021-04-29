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
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {
        Scraper scraper = new Scraper();
        List<Integer> ids = scraper.getRecipeIds();
        Formatter formatter = new Formatter();
        int i = 0;
        for (int id : ids){
            System.out.println(i);
            System.out.println(id);
            i++;
            System.out.println(scraper.getDish(id).name);
            System.out.println(scraper.getDish(id).ingredients.trim());

        }

    }
}
