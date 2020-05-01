package cloud.liupeng.service;

import cloud.liupeng.dao.UserRepository;
import cloud.liupeng.pojo.UserNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liupeng
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUserNode(UserNode userNode) {
        userRepository.addUserNodeList(userNode.getName(), userNode.getAge());
    }
}
