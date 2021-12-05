package com.inuxu.org.control;

import com.inuxu.org.Entity.User;
import com.inuxu.org.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id") long userId) {
		return userService.findUserId(userId);
	}


//    @RequestMapping("/user")
//    public String loginUser(@RequestBody User userRequests) {
//		String Status="FAILURE";
//		List<User> user = userService.findAll();
//		for (User other : user) {
//			if (other.equals(user)) {
//				Status="SUCCESS";
//				return Status;
//			}
//		}
//		return Status;
//	}
}
