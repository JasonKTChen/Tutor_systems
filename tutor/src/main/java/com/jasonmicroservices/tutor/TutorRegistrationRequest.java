package com.jasonmicroservices.tutor;

// mapping the post request (from Json)
public record TutorRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
