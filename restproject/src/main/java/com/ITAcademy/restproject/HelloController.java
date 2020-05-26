package com.ITAcademy.restproject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  private static final String template = "Hello, %s!";

  @GetMapping("/hello-world")
  @ResponseBody
  public Greeting sayHello(@RequestParam(name="name") String name) {
    return new Greeting(String.format(template, name));
  }

}
