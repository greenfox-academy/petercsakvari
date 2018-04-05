package com.greenfoxacademy.dependencies;

import org.springframework.stereotype.Component;

@Component("bluecolor")
public class BlueColor implements MyColor {

  @Override
  public String printColor() {
    return "It is blue in color...";
  }
}
