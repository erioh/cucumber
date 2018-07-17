package nbu;

import com.fasterxml.jackson.databind.ObjectMapper;
import nbu.enity.CurrencyExchangeDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NbuClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?date=20180427&json");
        InputStream inputStream = url.openStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder json = new StringBuilder();
        for (String s = ""; s != null; ) {
            s = reader.readLine();
            json.append(s);

        }
        System.out.println(json);
        ObjectMapper mapper = new ObjectMapper();
        CurrencyExchangeDto[] currencyExchangeDtos = mapper.readValue(json.toString(), CurrencyExchangeDto[].class);
        for (CurrencyExchangeDto currencyExchangeDto : currencyExchangeDtos) {
            System.out.println(currencyExchangeDto);
        }


    }
}
