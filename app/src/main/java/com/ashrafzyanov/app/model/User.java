package com.ashrafzyanov.app.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User extends BaseModel {

    private String firstName;
    private String lastName;
    private Date dateOfBord;
    private List<Credential> credentials;

    @Data
    public static class Credential {
        private String login;
        private String password;
    }

}
