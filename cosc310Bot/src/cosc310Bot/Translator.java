package cosc310Bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Translator {

    public static String translate(String languageFrom, String languageTo, String text) throws IOException {
        
        String urlStr = "https://script.google.com/macros/s/AKfycbwdB7XLqYLW3QJsHbTaAb0qmRRwqWrRhUnCtBBINbNur32hxUnpdNEX0aBhnMRYGH8g/exec?q=" + URLEncoder.encode(text, "UTF-8") +"&target=" + languageTo +"&source=" + languageFrom;
        URL url = new URL(urlStr);
        StringBuilder result = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader buff = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = buff.readLine()) != null) {
            result.append(inputLine);
        }
        buff.close();
        return result.toString();
    }
}
