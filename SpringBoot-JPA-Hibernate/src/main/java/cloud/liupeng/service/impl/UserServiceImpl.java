package cloud.liupeng.service.impl;

import cloud.liupeng.dao.UserDao;
import cloud.liupeng.entity.CloudUser;
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
    private UserDao userDao;

    @Override
    public List<CloudUser> getAllUser() {
        return userDao.findAll();
    }
}
