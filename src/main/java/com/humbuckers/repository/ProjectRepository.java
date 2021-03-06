/**
 * 
 */
package com.humbuckers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.humbuckers.entity.Project;
import com.humbuckers.entity.Users;


/**
 * @author Affroz Khan
 *
 * 
 */
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
