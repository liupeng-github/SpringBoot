package cloud.liupeng.controller;

import cloud.liupeng.service.UserService;
import cloud.liupeng.pojo.UserNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liupeng
 */
@RestController
public class UserNeo4jController {

    @Autowired
    private UserService userService;

    @RequestMapping("/saveUserNode")
    public String saveUserNode() {
        UserNode userNode = new UserNode();
        userNode.setNodeId(1L);
        userNode.setUserId("1");
        userNode.setName("刘鹏");
        userNode.setAge(10);
        userService.addUserNode(userNode);
        return "success";
    }
}
