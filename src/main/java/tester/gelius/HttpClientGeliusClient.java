package tester.gelius;


import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static tester.gelius.Urls.URI_BANK;
import static tester.gelius.Urls.URI_GET;
import static tester.gelius.Urls.URI_POST;

public class HttpClientGeliusClient implements GeliusClient {
    private static final HttpClient HTTP_CLIENT = HttpClients.createDefault();

    @Override
    public HttpResponse doGet(URI url) {
        HttpClient client = getHttpClient();
        HttpGet get = new HttpGet(url);

        try {
            return client.execute(get);
        } catch (IOException e) {
            throw new RuntimeException("Problems with GET", e);
        }
    }

    @Override
    public HttpResponse doPost(URI url, List<NameValuePair> pairList) {
        HttpClient client = getHttpClient();
        HttpPost post = new HttpPost(url);
        try {
            post.setEntity(new UrlEncodedFormEntity(pairList));
            return client.execute(post);

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);

        } catch (IOException e) {
            throw new RuntimeException("IOException", e);
        }
    }

    private static HttpClient getHttpClient() {
        return HTTP_CLIENT;
    }

}
