package com.example.demo.generics;

public class StructuredJsonMessage implements Message<Json> {

  @Override
  public String getMessage() {
    return "Structured Json Message";
  }
}
