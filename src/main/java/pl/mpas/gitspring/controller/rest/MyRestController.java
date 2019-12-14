package pl.mpas.gitspring.controller.rest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

@GetMapping("/name")
    String myName(){
    return "aga";
}

@GetMapping("/age")
    int getAge(){
    return 22;
}
}
