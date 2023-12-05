package com.vskishan.facsimileserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/test-api")
  public String getHelloWorld(){
    return "Hello World!!";
  }

}
