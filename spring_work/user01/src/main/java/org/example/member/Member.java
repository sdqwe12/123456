package org.example.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@ToString
@Setter
@Getter

public class Member {
    private int id;
    private String email;
    private String name;
    private String password;
    private String confirmPassword;
    private LocalDate localDate;

}
