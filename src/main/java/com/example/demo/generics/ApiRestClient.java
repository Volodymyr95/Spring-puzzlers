package com.example.demo.generics;

public class ApiRestClient<MsgType extends ParentMsg> extends Client<MsgType> {
  public ApiRestClient(Message<MsgType> content ) {
    super(content);
  }
}
