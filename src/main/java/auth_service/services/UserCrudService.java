package auth_service.services;

import auth_service.security.data.Role;
import auth_service.security.data.RoleRepository;
import auth_service.security.data.User;
import auth_service.security.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.Set;

/**
 * Created by ricardobaumann on 06/01/17.
 */
@Service
public class UserCrudService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @RolesAllowed({"ROLE_ADMIN"})
    public User save(@Valid @Validated User user) {
        return userRepository.save(user);
    }

    public Set<Role> fetchRoles(Set<String> roles) {
        return roleRepository.findByNameIn(roles);
    }
}
