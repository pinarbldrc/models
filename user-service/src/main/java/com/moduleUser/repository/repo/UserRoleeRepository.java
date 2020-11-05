package com.moduleUser.repository.repo;

import com.moduleUser.repository.entity.Rolee;
import com.moduleUser.repository.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleeRepository extends JpaRepository<UserRole,Long> {

      List<UserRole> findByUserid (long userid);
      List<UserRole> findByRoleid (long roleid);
}
