package tester.gelius;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static tester.gelius.Urls.URI_BANK;
import static tester.gelius.Urls.URI_GET;
import static tester.gelius.Urls.URI_POST;

public class Starter {
    public static void main(String[] args) throws IOException, URISyntaxException {
        GeliusClient client = new HttpClientGeliusClient();
        List<NameValuePair> pairList = new ArrayList<>();
        pairList.add(new BasicNameValuePair("username", "gelius_admin"));
        pairList.add(new BasicNameValuePair("password", "12345678"));


        client.doPost(URI_POST, pairList);
        client.doGet(URI_GET);

        HttpResponse httpResponse = client.doGet(URI_BANK);
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));

        String s = null;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
        reader.close();
    }
}
