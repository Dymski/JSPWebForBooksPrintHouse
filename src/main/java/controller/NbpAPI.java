package controller;

import org.apache.http.Header;
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

    public String sendGet(String currency) throws Exception {

        String result;
        HttpGet request = new HttpGet("http://api.nbp.pl/api/exchangerates/rates/a/"+currency+"?format=json");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();

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
