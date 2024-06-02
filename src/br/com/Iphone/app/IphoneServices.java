package br.com.Iphone.app;

import br.com.Iphone.InternetBrowser.InternetBrowser;
import br.com.Iphone.musicPlayer.MusicPlayer;
import br.com.Iphone.telephoneHandset.TelephoneHandset;

public class IphoneServices implements MusicPlayer, TelephoneHandset, InternetBrowser {

    // Inherit methods of Interfaces

    @Override
    public void selectMusic() {
        MusicPlayer.super.selectMusic();
    }

    @Override
    public void play(String music) {
        MusicPlayer.super.play(music);
    }

    @Override
    public void pause() {
        MusicPlayer.super.pause();
    }

    @Override
    public void call() {
        TelephoneHandset.super.call();
    }

    @Override
    public void answer() {
        TelephoneHandset.super.answer();
    }

    @Override
    public void startVoiceCall() {
        TelephoneHandset.super.startVoiceCall();
    }

    @Override
    public void addNewTab() {
        InternetBrowser.super.addNewTab();
    }

    @Override
    public void displayPage(String url) {
        InternetBrowser.super.displayPage(url);
    }

    @Override
    public void updatePage() {
        InternetBrowser.super.updatePage();
    }
}
