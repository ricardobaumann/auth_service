package auth_service.controllers;

import auth_service.security.data.Role;
import auth_service.security.data.User;
import auth_service.services.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Set;

/**
 * Created by ricardobaumann on 05/01/17.
 */
@RestController
@RequestMapping(
        path = "/users")
public class UserController {

    @Autowired
    private UserCrudService userCrudService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User post(@RequestBody UserInputDTO userInputDTO) {
        User user = new User();
        user.setLogin(userInputDTO.getLogin());
        user.setName(userInputDTO.getLogin());
        user.setPassword(userInputDTO.getPassword());

        Set<Role> roles = userCrudService.fetchRoles(userInputDTO.getRoles());

        user.setRoles(roles);

        return userCrudService.save(user);
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}
