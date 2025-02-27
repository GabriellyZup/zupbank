package com.zup.zupbank.repositories;


import com.zup.zupbank.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class RoleRepository extends JpaRepository<Role,Long> {
}
