package com.shiva.soapdemo.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.shivu.soap.gen.Country;
import com.shivu.soap.gen.Currency;
import com.shivu.soap.gen.GetCountryRequest;
import com.shivu.soap.gen.GetCountryResponse;

@Endpoint
public class CountryEndPoint {

    private static final String NAMESPACE_URI = "http://soap.shivu.com/gen";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {

        Country country = new Country();
        country.setName(request.getName());
        country.setCapital("aaa");
        country.setCurrency(Currency.EUR);
        country.setPopulation(100);

        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(country);

        return response;
    }
}
