package com.example.demo.student;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
