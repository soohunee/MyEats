package com.myeats.myeats.Service;

import com.fasterxml.jackson.core.JsonParser;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Service
public class SearchService {
    private final String restApiKey = "aeb12453ab196a43b83280df06264fa4";
    private String url = "https://dapi.kakao.com/v2/local/search/keyword.json";

    public void searchRestaurant(String keyword){
        try {
            String encodedKeyword = URLEncoder.encode(keyword, "UTF-8");
            url += "?query=" + encodedKeyword;
            url += "&category_group_code=FD6";
            URL obj = new URL(url);

            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();

            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "KakaoAK " + restApiKey); //header 에 값 셋팅

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));

            String readAPIResponse = " ";
            StringBuilder jsonString = new StringBuilder();
            while((readAPIResponse = in.readLine()) != null){
                jsonString.append(readAPIResponse);
            }
            System.out.println(jsonString);
            JsonParser jsonParser = new JsonParser();

            in.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
