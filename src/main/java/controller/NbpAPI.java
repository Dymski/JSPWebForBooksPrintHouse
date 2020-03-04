package controller;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NbpAPI {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static void main(String[] args) throws Exception {

        NbpAPI nbpAPI = new NbpAPI();

        nbpAPI.sendGet();

    }

    private void close() throws IOException {
        httpClient.close();
    }

    private void sendGet() throws Exception {
        HttpGet request = new HttpGet("http://api.nbp.pl/api/exchangerates/rates/a/gbp?format=json");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (Objects.nonNull(entity)) {
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }
        }
    }
}
