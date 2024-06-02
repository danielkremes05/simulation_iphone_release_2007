package iphone;

import br.com.Iphone.musicPlayer.MusicPlayer;

public class IphoneServices implements MusicPlayer {
    @Override
    public void selectMusic() {
        MusicPlayer.super.selectMusic();
    }

    @Override
    public void play() {
        MusicPlayer.super.play();
    }

    @Override
    public void pause() {
        MusicPlayer.super.pause();
    }
}
