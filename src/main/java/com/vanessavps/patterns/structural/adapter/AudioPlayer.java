package com.vanessavps.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {

  @Override
  public String play(AudioType audioType, String fileName) {
    switch (audioType) {
      //originally the only audio type played by AudioPlayer
      case MP3:
        return "Playing mp3 file. Name: " + fileName;
      //New audio types supported by this AudioPlayer using the adapter
      case MP4:
      case VLC:
        MediaAdapter mediaAdapter = new MediaAdapter(audioType);
        return mediaAdapter.play(audioType, fileName);
      default:
        return "Invalid media. " + audioType + " format not supported";
    }
  }
}
