package com.hms;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.SQLOutput;

public class A {
    public static void main(String[] args) {
       // PasswordEncoder en = new BCryptPasswordEncoder();
        // System.out.println(en.encode("testing"));

        String enPwd = BCrypt.hashpw("testing", BCrypt.gensalt(4));
        System.out.println(enPwd);
    }
}
