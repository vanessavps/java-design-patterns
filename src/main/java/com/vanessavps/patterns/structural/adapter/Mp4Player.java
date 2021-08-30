package com.vanessavps.patterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
  @Override
  public String play(String fileName) {
     return "Playing mp4 file. Name: " + fileName;
  }
}
