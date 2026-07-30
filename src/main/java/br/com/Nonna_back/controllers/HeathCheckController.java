package br.com.Nonna_back.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HeathCheckController {
    @GetMapping("health-check/liveness")
    public String liveness()
            return "ok";
    }


}
