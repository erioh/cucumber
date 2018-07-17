package tester.gelius;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

import java.net.URI;
import java.util.List;

public interface GeliusClient {
    HttpResponse doGet(URI url);

    HttpResponse doPost(URI url, List<NameValuePair> pairList);
}
