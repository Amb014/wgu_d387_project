package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.TranslateandTime.ShowMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);


		Locale english = Locale.ENGLISH;
		Locale french = Locale.FRENCH;

		// Create threads with different locales
		Thread threadEN = new Thread(new ShowMessage(english));
		Thread threadFR = new Thread(new ShowMessage(french));

		// Start both threads
		threadEN.start();
		threadFR.start();


	}


}