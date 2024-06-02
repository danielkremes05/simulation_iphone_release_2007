package br.com.Iphone.musicPlayer;

public interface MusicPlayer {
//    Methods: play(), pause(), selectMusic(String music)

    public default void play(String music) {
        System.out.println("Play song" + music);
    }

    public default void pause() {
        System.out.println("Pause song");
    }

    public default void selectMusic() {
        System.out.println("Select music ");
    }

}
