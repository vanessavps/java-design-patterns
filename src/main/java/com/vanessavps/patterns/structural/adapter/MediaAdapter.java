package com.vanessavps.patterns.structural.adapter;

//The Adapter created based on audioType
public class MediaAdapter implements MediaPlayer {
  private final AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(AudioType audioType) {
    if (audioType.equals(AudioType.MP4)) {
      advancedMediaPlayer = new Mp4Player();
    } else {
      advancedMediaPlayer = new VlcPlayer();
    }
  }

  @Override
  public String play(AudioType audioType, String fileName) {
    return advancedMediaPlayer.play(fileName);
  }
}
