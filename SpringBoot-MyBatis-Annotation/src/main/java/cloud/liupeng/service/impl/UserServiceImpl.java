package cloud.liupeng.service.impl;

import cloud.liupeng.entity.CloudUser;
import cloud.liupeng.mapper.UserMapper;
import cloud.liupeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liupeng
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<CloudUser> getAllUser() {
        return userMapper.getAllUser();
    }
}
