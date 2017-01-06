package auth_service.controllers;

import lombok.Data;

import java.util.Set;

/**
 * Created by ricardobaumann on 06/01/17.
 */
@Data
public class UserInputDTO {

    private String login;

    private String password;

    private Set<String> roles;

}
