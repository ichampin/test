package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @PostMapping("/cache/{key}")
    public void setCacheValue(@PathVariable String key, @RequestBody String value) {
        cacheService.setValue(key, value);
    }

    @GetMapping("/cache/{key}")
    public String getCacheValue(@PathVariable String key) {
        return cacheService.getValue(key);
    }
}