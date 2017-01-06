package auth_service.security.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by ricardobaumann on 06/01/17.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
    Set<Role> findByNameIn(Set<String> roles);
}
