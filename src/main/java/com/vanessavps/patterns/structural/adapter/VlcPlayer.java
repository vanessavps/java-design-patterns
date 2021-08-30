package com.vanessavps.patterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public String play(String fileName) {
    return "Playing vlc file. Name: " + fileName;
  }
}
