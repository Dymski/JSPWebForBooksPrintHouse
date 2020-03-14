package controller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.util.Objects;

public class NbpAPI {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    private void close() throws IOException {
        httpClient.close();
    }

    private String sendGet() throws Exception {

        String result;
        HttpGet request = new HttpGet("http://api.nbp.pl/api/exchangerates/rates/a/gbp?format=json");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
//            Header headers = entity.getContentType();
//            System.out.println(headers);

            if (Objects.nonNull(entity)) {
                result = EntityUtils.toString(entity);
                httpClient.close();
                return result;
            }
        }

        httpClient.close();
        return null;
    }




}
