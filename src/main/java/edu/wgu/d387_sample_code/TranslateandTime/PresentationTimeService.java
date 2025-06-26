package edu.wgu.d387_sample_code.TranslateandTime;



import java.time.*;
import java.time.format.DateTimeFormatter;

    public class PresentationTimeService {

        public static String getPresentationTimes() {
            // Assume the presentation is at 3:00 PM ET
            ZonedDateTime easternTime = ZonedDateTime.of(
                    LocalDate.now(),
                    LocalTime.of(15, 0),
                    ZoneId.of("America/New_York")
            );

            ZonedDateTime mountainTime = easternTime.withZoneSameInstant(ZoneId.of("America/Denver"));
            ZonedDateTime utcTime = easternTime.withZoneSameInstant(ZoneId.of("UTC"));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

            return String.format(
                    "Live presentation time: %s ET | %s MT | %s UTC",
                    formatter.format(easternTime),
                    formatter.format(mountainTime),
                    formatter.format(utcTime)
            );
        }
    }

