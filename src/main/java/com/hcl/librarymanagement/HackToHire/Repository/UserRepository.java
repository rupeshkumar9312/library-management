package com.hcl.librarymanagement.HackToHire.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.librarymanagement.HackToHire.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
