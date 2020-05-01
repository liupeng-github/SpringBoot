package cloud.liupeng.dao;

import cloud.liupeng.entity.CloudUser;

import java.util.List;

/**
 * @author liupeng
 */
public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    List<CloudUser> getAllUser();
}
