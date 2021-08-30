package com.vanessavps.patterns.structural.adapter;

//Interface to play the audio type we need
public interface MediaPlayer {
  enum AudioType {MP3, MP4, VLC}

  String play(AudioType audioType, String fileName);
}
