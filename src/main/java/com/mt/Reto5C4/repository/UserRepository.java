package com.mt.Reto5C4.repository;

import com.mt.Reto5C4.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mt.Reto5C4.crudRepository.UserCrudRepository;

/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;
    
    public List<User> getAll(){
        return userCrudRepository.findAll();
    }
    
    public Optional<User> getUser(Integer id){
        return userCrudRepository.findById(id);
    }
    
    public boolean ExisteEmail(String email){
        Optional<User> usuario = userCrudRepository.findByEmail(email);
         
        return !usuario.isEmpty();
    }
    
    public Optional<User> autenticarUser(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    
    public User save(User user){
        return userCrudRepository.save(user);
    }
    
    public void update(User user){
        userCrudRepository.save(user);
    }
    
    public void delete(User user){
        userCrudRepository.delete(user);
    }
    
    public List <User> findByMonthBirthtDay (String birthday){
        return  userCrudRepository.findByMonthBirthtDay(birthday);
    }
    
}
