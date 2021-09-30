package com.example.demo.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class Bucket <Type extends RedApple> {

  @Autowired
  private Type apple;

  @EventListener(ContextRefreshedEvent.class)
  public void showBuckets() {
    System.out.println(getClass().getSimpleName() + " is " + apple.getType());
  }


}
