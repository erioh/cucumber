package tester.gelius;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.glassfish.jersey.client.JerseyClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

import static tester.gelius.Urls.URI_BANK;

public class JerseyGeliusClient implements GeliusClient {
    public static void main(String[] args) {
        GeliusClient client = new JerseyGeliusClient();
        client.doGet(URI_BANK);
    }
    @Override
    public HttpResponse doGet(URI url) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        Response invoke = target.request().buildGet().invoke();
        System.out.println(invoke.hasEntity());

        return null;
    }

    @Override
    public HttpResponse doPost(URI url, List<NameValuePair> pairList) {
        return null;
    }
}
