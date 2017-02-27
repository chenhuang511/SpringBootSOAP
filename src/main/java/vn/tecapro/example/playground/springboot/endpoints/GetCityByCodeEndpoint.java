package vn.tecapro.example.playground.springboot.endpoints;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.tecapro.example.playground.springboot.persistence.CityRepository;
import vn.tecapro.playground.schema.cities.City;
import vn.tecapro.playground.schema.cities.GetCityByCodeRequest;
import vn.tecapro.playground.schema.cities.GetCityByCodeResponse;

/**
 * Created by HoangTD on 8/1/2016.
 */
public class GetCityByCodeEndpoint {
    static final Logger logger = LogManager.getLogger(GetCityByCodeEndpoint.class);

    CityRepository cityRepository;

    @Autowired
    public GetCityByCodeEndpoint(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @PayloadRoot(namespace = "http://tecapro.vn/playground/schema/cities", localPart = "getCityByCodeRequest")
    @ResponsePayload
    public GetCityByCodeResponse getCityByCode(@RequestPayload GetCityByCodeRequest request) {
        logger.info("entering endpoint");
        GetCityByCodeResponse response = new GetCityByCodeResponse();
        City city = cityRepository.findCity(request.getCode());
        response.setCity(city);
        return response;
    }
}
