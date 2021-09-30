package com.example.demo.generics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class Client <MsgType> {

  @Autowired
  private Message<MsgType> content;

  public Client() {
  }

  public Client(Message<MsgType> content) {
    this.content = content;
  }

  @EventListener(ContextRefreshedEvent.class)
  public void showMsg() {
    System.out.println(getClass().getSimpleName() + " is " + content.getMessage());
  }
}
