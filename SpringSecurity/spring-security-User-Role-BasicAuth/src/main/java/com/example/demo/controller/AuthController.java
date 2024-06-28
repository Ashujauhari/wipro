package com.example.demo.controller;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payload.LoginDto;
import com.example.demo.payload.SignUpDto;
import com.example.demo.springbootrolebasedauthorization.security.Role;
import com.example.demo.springbootrolebasedauthorization.security.RoleRepository;
import com.example.demo.springbootrolebasedauthorization.security.User;
import com.example.demo.springbootrolebasedauthorization.security.UserRepository;

/*1. Run application
 * 2. INSERT INTO roles VALUES(1, 'ROLE_ADMIN');
 
 * 3. POST - http://localhost:9111/api/auth/signup
  {
    "name": "Alex",
    "username" : "Alex",
    "email" : "a@gmail.com",
    "password" : "Alex"
}
* 4. Post - http://localhost:9111/api/auth/signin
{
    "usernameOrEmail" :"Alex",
    "password" : "Alex"
}
User signed-in successfully!.


*5. Test the endpoint:
* Get- http://localhost:9111/api/admin/roleNeeded
* Authorization: Basic Auth -> Specify username and password
* 
* 
* 6. Get - http://localhost:9111/api/noRoleNeeded
* Auhtorization - No auth
* 
* 7. Get - http://localhost:9111/api/admin/test
* Authorization : username and password
*/

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication    authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto){

        // add check for username exists in a DB
        if(userRepository.existsByUsername(signUpDto.getUsername())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        // add check for email exists in DB
        if(userRepository.existsByEmail(signUpDto.getEmail())){
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }

        // create user object
        User user = new User();
        user.setName(signUpDto.getName());
        user.setUsername(signUpDto.getUsername());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));

        Role roles = roleRepository.findByName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(roles));
        userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
    
    
    
}