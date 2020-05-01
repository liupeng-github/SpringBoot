package cloud.liupeng.dao.impl;

import cloud.liupeng.dao.UserDao;
import cloud.liupeng.entity.CloudUser;
import cloud.liupeng.mapper.CloudUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liupeng
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private CloudUserMapper cloudUserMapper;

    @Override
    public List<CloudUser> getAllUser() {
        return cloudUserMapper.getAllUser();
    }
}
