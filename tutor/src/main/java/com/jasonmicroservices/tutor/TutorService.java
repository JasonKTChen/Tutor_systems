package com.jasonmicroservices.tutor;

import org.springframework.stereotype.Service;

@Service
public record TutorService(TutorRepository tutorRepository) {
    public void registerTutor(TutorRegistrationRequest request) {
        Tutor tutor = Tutor.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        tutorRepository.save(tutor);
    }
}
