package com.shivu.rest.controller;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    @Value("${ad.server.url}")
    private String server;

    // GET - http://localhost:8080/weather/
    @GetMapping("/")
    public String tempTdy() {
        return "20 Deg";
    }

    // GET - http://localhost:8080/weather/temp1
    @GetMapping("/temp1")
    public TempData tempTdy1() {
        return new TempData(12);
    }

    // GET - http://localhost:8080/weather/temp2
    @GetMapping(value = "/temp2", produces = "aplication/json")
    public @ResponseBody TempData tempTdy2() {
        return new TempData(12);
    }

    // GET - http://localhost:8080/weather/temp3
    @GetMapping(value = "/temp3", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody TempData tempTdy3() {
        return new TempData(12);
    }

    // GET - http://localhost:8080/weather/temp4
    public ResponseEntity<TempData> empTdy4() {
        TempData td = new TempData(12);
        return ResponseEntity.status(HttpStatus.OK).body(td);
    }

    // POST - http://localhost:8080/weather/save
    @GetMapping(value = "/save", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<TempData> temptdy4() {
        TempData td = new TempData();
        return ResponseEntity.status(HttpStatus.OK).body(td);
    }

    @GetMapping(value = "/ads", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Res> showAds() {
        Res res = new Res("success", "fetching ads from" + server);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

}
