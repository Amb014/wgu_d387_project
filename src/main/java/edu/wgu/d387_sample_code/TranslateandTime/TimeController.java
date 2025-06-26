package edu.wgu.d387_sample_code.TranslateandTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimeController {

    @GetMapping("/api/presentation-time")
    public String getPresentationTime() {
        return PresentationTimeService.getPresentationTimes();
    }
}