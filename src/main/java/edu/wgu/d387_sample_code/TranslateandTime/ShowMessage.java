package edu.wgu.d387_sample_code.TranslateandTime;



import java.util.Locale;
import java.util.ResourceBundle;



public class ShowMessage implements Runnable {
    private Locale locale;

    public ShowMessage(Locale locale) {
        this.locale = locale;
    }

    @Override
    public void run() {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        String message = bundle.getString("welcome.message");
        System.out.println("[" + locale.getDisplayLanguage() + "] " + message);
    }
}





