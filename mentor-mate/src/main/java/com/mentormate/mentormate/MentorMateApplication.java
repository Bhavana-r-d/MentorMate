package com.mentormate.mentormate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//public class MentorMateApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MentorMateApplication.class, args);
//	}

//}

@SpringBootApplication
@ComponentScan(basePackages = "com.mentormate.mentormate")
public class MentorMateApplication {
    public static void main(String[] args) {
        SpringApplication.run(MentorMateApplication.class, args);
    }
}
