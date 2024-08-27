package com.example.sa_analyse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "la",produces = "application/json")
public class AnalyseController {



    @GetMapping
    public List<Object> search() {
        return List.of( new Sa(1,"Belle Etoile",1));
    }
}
