package info.dvad.test.homeWork13;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.dvad.test.homeWork13.dtoUsers.DtoUser;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpDeletePutGetExample {
    //Тест Api при помощи JSONObject.
    @Test
    public static void putReque() {
        // Замените URL_API на ваш фактический URL API и ID на необходимый идентификатор
        String uurl = "https://fakerestapi.azurewebsites.net/api/v1";
        String endPoint = "/Users/4";
        final String apiUrl = uurl + endPoint;

        // Создание JSON-строки для отправки (в данном случае, предполагается, что у вас уже есть объект для обновления)
        String jsonToUpdate = "{\"id\":4,\"userName\":\"UpdatedUser\",\"password\":\"UpdatedPassword\"}";

        OkHttpClient client = new OkHttpClient();

        // Создание объекта Request с использованием Request.Builder
        Request request = new Request.Builder()
                .url(apiUrl)
                .put(RequestBody.create(MediaType.get("application/json") , jsonToUpdate))
                .build();

        try
            // Выполнение запроса
           (Response response = client.newCall(request).execute();){

            // Получение кода ответа
            int statusCode = response.code();
            System.out.println("Response Code: " + statusCode);

            // Утверждение (assert) кода ответа
            //assert statusCode == 200 : "Expected status code 200, but received: " + statusCode;
            int code = response.code();
            Assert.assertEquals(code , 200 , "Response code must be 200, but got " + code);

            // Опционально: получение тела ответа
            String responseBody = response.body().string();
            System.out.println("Response Body: " + responseBody);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @Test
        public void ApiUserGet() {
            final String uurl = "https://fakerestapi.azurewebsites.net/api/v1";
            String endPoint = "/Users";
            final String url = uurl + endPoint;
            OkHttpClient client = new OkHttpClient();
            System.out.println(url);

            Request request = new Request.Builder()
                    .url(url)
                    .header("accept" , "text/plain; v=1.0")
                    .build();
            try (Response response = client.newCall(request).execute()) {
                int code = response.code();
                Assert.assertEquals(code , 200 , "Response code must be 200, but got " + code);
                var mapper = new ObjectMapper();
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                DtoUser[] dtoUsers = mapper.readValue(response.body().string(), DtoUser[].class);
                Assert.assertEquals(dtoUsers.length,10);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    @Test
    public void deleteUsers() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        String uurl = "https://fakerestapi.azurewebsites.net/api/v1";
        String endPoint = "/Users/1";
        final String url = uurl + endPoint;

        Request request = new Request.Builder()
                .url(url)
                .method("DELETE" , RequestBody.create("" , MediaType.get("application/json")))
                .header("accept" , "*/*")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code , 200 , "Response code must be 200,but got "
                    + code );
           // String responseBody = response.body().string();
          //  System.out.println(responseBody);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
    

