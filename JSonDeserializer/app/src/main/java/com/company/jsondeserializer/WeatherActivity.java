package com.company.jsondeserializer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class WeatherActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        listView = findViewById(R.id.list1);

        String jsonString = "{\"list\":[{\"dt\":1471255200,\"temp\":{\"day\":30.04,\"min\":17.35,\"max\":30.04" +
                "},\"pressure\":1018.83,\"humidity\":35,\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"de" +
                "scription\":\"scattered clouds\",\"icon\":\"03d\"}],\"speed\":2.66, \"deg\":314," +
                "\"clouds\":48},{\"dt\":1471341600,\"temp\":{\"day\":29.48,\"min\":19.3,\"max\":29.95" +
                "},\"pressure\":1018.63,\"humidity\":100,\"weather\":[{\"id\":501,\"main\":\"Rain\",\"des" +
                "cription\":\"moderate rain\",\"icon\":\"10d\"}],\"speed\":2.46,\"deg\":28," +
                "\"clouds\":92,\"rain\":8.5},{\"dt\":1471428000,\"temp\":{\"day\":28.96,\"min\":17.84,\"m" +
                "ax\":297.54},\"pressure\":1012.1,\"humidity\":95,\"weather\":[{\"id\":501,\"main\":\"Ra" +
                "in\",\"description\":\"moderate rain\",\"icon\":\"10d\"}],\"speed\":2.27,\"deg\":118," +
                "\"clouds\":88,\"rain\":5.55},{\"dt\":1471514400,\"temp\":{\"day\":26.89,\"min\":17.84,\"" +
                "max\":28.95},\"pressure\":1014.27,\"humidity\":83,\"weather\":[{\"id\":500,\"main\":\"R" +
                "ain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"speed\":1.98,\"deg\":93," +
                "\"clouds\":20},{\"dt\":1471600800,\"temp\":{\"day\":30.04,\"min\":21.87,\"max\":30.04}," +
                "\"pressure\":1014.65,\"humidity\":0,\"weather\":[{\"id\":500,\"main\":\"Rain\",\"descrip" +
                "tion\":\"light rain\",\"icon\":\"10d\"}],\"speed\":1.66,\"deg\":194, \"clouds\":11," +
                "\"rain\":0.22},{\"dt\":1471687200,\"temp\":{\"day\":31.3,\"min\":22.56,\"max\":32.3},\"p" +
                "ressure\":1018.6,\"humidity\":0,\"weather\":[{\"id\":500,\"main\":\"Rain\",\"descriptio" +
                "n\":\"light rain\",\"icon\":\"10d\"}],\"speed\":1.69,\"deg\":180, \"clouds\":16," +
                "\"rain\":0.77} ,{\"dt\":1471773600,\"temp\":{\"day\":31.77,\"min\":21.67," +
                "\"max\":30.77},\"pressure\":1016.93,\"humidity\":0,\"weather\":[{\"id\":500,\"main\":\"R" +
                "ain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"speed\":2.49,\"deg\":227," +
                "\"clouds\":14,\"rain\":2.2}]}";

        final ObjectMapper mapper = new ObjectMapper();
        Lister weatherData;
        try {
            weatherData = mapper.readValue(jsonString, Lister.class );
        }
        catch (IOException e){
            weatherData = null;
        }
        if(weatherData!=null){
            String[] weatherStringArray = new String[weatherData.getList().size()];
            for(int i = 0; i < weatherStringArray.length; i++){
                Serializer ser = weatherData.getList().get(i);
                weatherStringArray[i] = Integer.toString(ser.getTemp().getMax()) + "/" + Integer.toString(ser.getTemp().getMin()) + ", " + ser.getWeather()[0].getMain() +
                        ", " + "Wind=" + ser.getSpeed();
            }
            ArrayAdapter<String> mAdapter = new ArrayAdapter<>(this,R.layout.activity_main,weatherStringArray);
            listView.setAdapter(mAdapter);
        }
    }
}
