package com.inuxu.org.Service;

import com.inuxu.org.Entity.User;
import com.inuxu.org.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUserId(long userId){
        return userRepository.findUserId(userId);
    }

//    public Optional < User > getById(Long id) {
//        return userRepository.findById(id);
//    }
//
//    public void save(User newUser) {
//        userRepository.save(newUser);
//    }
//
//    public List < User > getAll() {
//        return userRepository.findAll();
//    }
//
//    public void delete(long id) {
//        userRepository.deleteById(id);
//    }

//    public String loginUser(Integer id) {
//        String Status="FAILURE";
//        User users = UserRepository.findAll();
//        for (User other : users) {
//            if (other.equals(user)) {
//                Status="SUCCESS";
//                return Status;
//            }
//        }
//        return Status;
//    }
}
