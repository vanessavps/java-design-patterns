package com.vanessavps.patterns.structural.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AudioPlayerTest {

  @Test
  public void testMediaPlayerAdapter() {
    AudioPlayer audioPlayer = new AudioPlayer();

    assertEquals("Playing mp3 file. Name: Everybody.mp3",
                 audioPlayer.play(MediaPlayer.AudioType.MP3, "Everybody.mp3"));
    assertEquals("Playing mp4 file. Name: I want it that way.mp4",
                 audioPlayer.play(MediaPlayer.AudioType.MP4, "I want it that way.mp4"));
    assertEquals("Playing vlc file. Name: Incomplete.vlc",
                 audioPlayer.play(MediaPlayer.AudioType.VLC, "Incomplete.vlc"));
  }
}
