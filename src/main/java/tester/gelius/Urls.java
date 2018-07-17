package tester.gelius;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class Urls {
    public static final URI URI_POST;
    public static final URI URI_GET;
    public static final URI URI_BANK;


    static {
        try {
            URI_POST = new URIBuilder().setScheme("http").setHost("localhost").setPort(8080).setPath("login").build();
            URI_GET = new URIBuilder().setScheme("http").setHost("localhost").setPort(8080).setPath("index").build();
            URI_BANK = new URIBuilder().setScheme("https").setHost("bank.gov.ua")
                    .setPath("NBUStatService/v1/statdirectory/exchange")
                    .addParameter("date", "20180511")
                    .addParameter("json", null).build();
        } catch (URISyntaxException e) {
            throw new RuntimeException("Problems with URI", e);
        }
    }

}
