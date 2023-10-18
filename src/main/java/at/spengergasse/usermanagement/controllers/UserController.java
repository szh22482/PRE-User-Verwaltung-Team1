package at.spengergasse.usermanagement.controllers;

import at.spengergasse.usermanagement.models.User;
import at.spengergasse.usermanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/users")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public HttpStatus addNewUser(@RequestBody User user)
    {
        userRepository.save(user);
        return HttpStatus.OK;
    }

    @GetMapping(path="/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
