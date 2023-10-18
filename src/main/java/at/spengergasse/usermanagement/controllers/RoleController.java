package at.spengergasse.usermanagement.controllers;

import at.spengergasse.usermanagement.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/roles")
public class RoleController
{
    @Autowired
    private RoleRepository roleRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/all")
    public @ResponseBody List<String> getAllRoles()
    {
        return roleRepository.getallRoles();
    }
}
