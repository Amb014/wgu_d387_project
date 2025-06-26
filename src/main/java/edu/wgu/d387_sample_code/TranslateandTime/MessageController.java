package edu.wgu.d387_sample_code.TranslateandTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.ResourceBundle;

@RestController
public class MessageController {

    @GetMapping("/api/welcome")
    public String getWelcomeMessage(@RequestParam(defaultValue = "en") String lang) {
        Locale locale = new Locale(lang);
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString("welcome.message");
    }
}
