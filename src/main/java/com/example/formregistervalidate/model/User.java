package com.example.formregistervalidate.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    @Min(18)
    private int Age;

    @NotEmpty
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    private String numberPhone;

    @NotEmpty
    @Email
    private String email;


    public User() {
    }

    public @NotEmpty @Size(min = 5, max = 45) String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty @Size(min = 5, max = 45) String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty @Size(min = 5, max = 45) String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty @Size(min = 5, max = 45) String lastName) {
        this.lastName = lastName;
    }

    public @Min(18) int getAge() {
        return Age;
    }

    public void setAge(@Min(18) int age) {
        Age = age;
    }

    public @NotEmpty @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number") String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(@NotEmpty @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number") String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public @NotEmpty @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty @Email String email) {
        this.email = email;
    }
}
