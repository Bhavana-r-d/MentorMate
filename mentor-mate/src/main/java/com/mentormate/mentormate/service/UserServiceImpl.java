package com.mentormate.mentormate.service;
 
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
import org.springframework.beans.factory.annotation.Autowired;
 
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.model.User;
import com.mentormate.mentormate.repositories.UserRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
 
//@Service
//public class UserServiceImpl implements UserService{
//	
//	private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//	
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
 
//	@Override
//    public User registerUser(User user) {
//        // Validate input, perform any additional business logic, and set default role(s) if needed
//        Set<String> defaultRoles = new HashSet<>();
//        defaultRoles.add("ROLE_USER");
//        user.setRoles(defaultRoles);
//
//        // Encode the password before saving it to the database
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//        // Save the user to the database
//        return userRepository.save(user);
//    }
//
//	@Override
//	public List getAll( ) {
//		// TODO Auto-generated method stub
//		return userRepository.findAll();
//	}
//	@Override
//	public User save(User user) {
//	    // Additional logic if needed (e.g., validation)
//
//	    // Encode the password before saving it to the database
//	    user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//	    // Save the user to the database
//	    return userRepository.save(user);
//	}
//
//}
 
@Service
public class UserServiceImpl implements UserService {
 
	@Autowired
	private UserRepository userRepo;
	//private PasswordEncoder passwordEncoder;
 
//public UserServiceImpl(UserRepository userRepo, PasswordEncoder passwordEncoder) {
//		super();
//		this.userRepo = userRepo;
//		this.passwordEncoder = passwordEncoder;
//	}
 
//	@Override
//	public long countUser() {
//
//		return UserRepository.count();
//	}
 
//	@Override
//	public User createUserDetails(UserModel user) {
//
//		User user = new User(user.getName(), user.getEmail(),
//				passwordEncoder.encode(user.getPassword() ,
//				user.getConfirmPassword(), user.getRoles());
//		return userDetailsRepo.save(user);
//	}
 
//	public Users createUser(User user) {
//
//		Users userdetails = new Users(user.getEmail(), user.getName(), user.getPassword(), user.getRoles(),
//				user.getConfirmPassword());
//		return userRepo.save(userdetails);
//
//	}
////
//	@Override
//	public List<Users> getAllUsers() {
//
//		return userRepo.findAll();
//	}
	
//	@Override
//	public User save(Users user) {
//	    // Additional logic if needed (e.g., validation)
//
//	    // Encode the password before saving it to the database
//	   // user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//	    // Save the user to the database
//	    return userRepo.save(user);
//	}
    @Override
	public Users registerUser(Users user) {
        // Validate input, perform any additional business logic, and set default role(s) if needed
        Set<String> defaultRoles = new HashSet<>();
        defaultRoles.add("ROLE_USER");
        user.setRoles(defaultRoles);
//
//        // Encode the password before saving it to the database
////        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//        // Save the user to the database
        return userRepo.save(user);
    }
 
@Override
public Users createUser(Users user) {
	
	Users users = new Users(user.getEmail(),user.getName(),user.getPassword(),user.getConfirmpassword(),user.getRoles());
	return userRepo.save(user);
}
 
@Override
public List<Users> getAllUsers() {
	// TODO Auto-generated method stub
	return userRepo.findAll();
}
 
//@Override
//public Users loginUser(LoginModel loginModel) {
//	// TODO Auto-generated method stub
//	return null;
//}
 
//@Override
//public Users save(User user) {
//	Users users=new Users(user.getEmail(),user.getName(),user.getPassword(),user.getConfirmPassword(),user.getRoles());
//	return userRepo.save(users);
//}
 
 
	
//	@Override
//	public User save(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
 
}