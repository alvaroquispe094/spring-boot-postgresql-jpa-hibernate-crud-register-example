/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.Libreria.repository;

import com.demo.Libreria.entities.User_roles;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Master
 */
@Transactional
public interface RoleRepository extends CrudRepository<User_roles,Integer>{
    
}
