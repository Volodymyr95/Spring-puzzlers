package com.example.demo.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetNameController {

  @Autowired
  private NameService nameService;

  @GetMapping
  public String getName(@RequestParam String name) {

    String result = "";

    try {
      result = nameService.getName(name);
    } catch (RuntimeException e) {
      result = "Incorrect";
    }
    return result;

  }

}
