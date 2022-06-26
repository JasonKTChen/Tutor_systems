package com.jasonmicroservices.tutor;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/tutors")
@AllArgsConstructor
public class TutorController {

    private final TutorService tutorService;

    @PostMapping
    public void registerTutor(@RequestBody TutorRegistrationRequest tutorRegistrationRequest){
        log.info("new tutor registration {}", tutorRegistrationRequest);
        tutorService.registerTutor(tutorRegistrationRequest);
    }
}
