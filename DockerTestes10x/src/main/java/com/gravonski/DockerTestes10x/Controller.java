package com.gravonski.DockerTestes10x;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/docker")
    public String msg() {
        return "Aplicação Docker funcionando!";
    }
}
