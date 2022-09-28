package ru.nikita.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.restapi.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}