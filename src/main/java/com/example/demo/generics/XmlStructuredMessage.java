package com.example.demo.generics;

public class XmlStructuredMessage implements Message<ParentMsg> {

  @Override
  public String getMessage() {
    return "Xml Structured Message";
  }
}
