package cloud.liupeng.controller;

import cloud.liupeng.entity.CloudUser;
import cloud.liupeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liupeng
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public List<CloudUser> index(){
        return userService.getAllUser();
    }
}
