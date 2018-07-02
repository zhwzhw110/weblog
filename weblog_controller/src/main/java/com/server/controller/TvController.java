package com.server.controller;

import com.domain.model.TvShows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/TV")
public class TvController {

    @GetMapping(value = "/sayHello")
    public Map<String,Object> sayHello(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","zhw");
        map.put("age",25);
        map.put("date",new Date());
        return map;
    }

    @GetMapping(value = "/tvshows")
    public List<TvShows> getTvshows(){
        List<TvShows> list = new ArrayList<TvShows>();

        TvShows tvShows1 = new TvShows("westWorld",1,new Date());
        TvShows tvShows2 = new TvShows("helloworld",3,new Date());
        TvShows tvShows3 = new TvShows("mylove",10,new Date());

        list.add(tvShows1);
        list.add(tvShows2);
        list.add(tvShows3);

        return list;
    }

}
