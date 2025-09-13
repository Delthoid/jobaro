package dev.delts.jobaro.repository;

import dev.delts.jobaro.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}
