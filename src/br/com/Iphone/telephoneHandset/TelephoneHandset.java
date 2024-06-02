package br.com.Iphone.telephoneHandset;

public interface TelephoneHandset {
    //    Methods: call(String number), answer(), startVoiceCall()
    public default void call() {
        System.out.println("Call");
    }

    public default void answer() {
        System.out.println("Answer");
    }

    public default void startVoiceCall() {
        System.out.println("Start voice call");
    }

}
