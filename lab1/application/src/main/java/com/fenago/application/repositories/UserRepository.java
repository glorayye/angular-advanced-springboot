package com.fenago.application.repositories;

import com.fenago.application.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{}