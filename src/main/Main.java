package main;

import br.com.Iphone.app.IphoneServices;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IphoneServices iphoneServices = new IphoneServices();

        // Interface Music Player
        iphoneServices.selectMusic();
        iphoneServices.play("Song");
        iphoneServices.pause();
        System.out.println();


        // Interface TelephoneHandset
        iphoneServices.call();
        iphoneServices.answer();
        iphoneServices.startVoiceCall();
        System.out.println();

        // Interface Internet Browser
        iphoneServices.addNewTab();
        iphoneServices.displayPage("www.google.com");
        iphoneServices.updatePage();


    }
}