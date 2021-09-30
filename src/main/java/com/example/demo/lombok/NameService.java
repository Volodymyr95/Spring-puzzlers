package com.example.demo.lombok;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class NameService {

  @SneakyThrows
  public String getName(String name) {

    if ("test".equals(name)) {
      throw new MyRuntimeException();
    }
    return "Name";
  }

}
