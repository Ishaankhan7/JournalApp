package net.engineeringdigest.journalApp.api.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {

    private Current current;

    @Getter
    @Setter
    public class Current {
        private String observation_time;
        private int temperature;
        private int weather_code;
        private int pressure;
        private int precip;
        private int humidity;
        private int cloudcover;
        private int feelslike;

    }
}