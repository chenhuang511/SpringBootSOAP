package vn.tecapro.example.playground.springboot.persistence;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import vn.tecapro.playground.schema.cities.City;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by HoangTD on 8/1/2016.
 */
@Component
public class CityRepository {
    static final Logger logger = LogManager.getLogger(CityRepository.class);

    private static final List<City> cities = new ArrayList<City>();

    @PostConstruct
    public void initData() {
        City neuruppin = new City();
        neuruppin.setName("Neuruppin");
        neuruppin.setCountry("Germany");
        neuruppin.setCode(16816);
        neuruppin.setPopulation(30000);
        neuruppin.setFounded(1256);
        cities.add(neuruppin);

        City paris = new City();
        paris.setName("Paris");
        paris.setCountry("France");
        paris.setCode(75001);
        paris.setPopulation(2250000);
        paris.setFounded(1256);
        cities.add(paris);
    }

    public City findCity(int code) {
        logger.info("searching city for: " + code);
        City result = null;
        for (City city : cities) {
            if (code == city.getCode()) {
                result = city;
            }
        }
        return result;
    }

    public String findCountry(String cityName) {
        logger.info("searching country for: " + cityName);
        String result = null;
        for (City city : cities) {
            if (cityName.equals(city.getName())) {
                result = city.getCountry();
            }
        }
        return result;
    }
}
