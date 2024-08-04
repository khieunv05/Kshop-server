package com.vti.kshop.Repository;

import com.vti.kshop.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByType(Role.Type type);
}
