package com.lamda.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("proxy")
public class ProxyController {
    @Autowired Crawler crawler;
    @PostMapping("/access")
    public ArrayList<HashMap<String,String>> list(@RequestBody Crawler crawler){
        return crawler.bugsMusic();
    }
}
