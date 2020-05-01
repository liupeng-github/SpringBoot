package cloud.liupeng.service;

import cloud.liupeng.entity.CloudUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liupeng
 */
public interface UserService {

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<CloudUser> getAllUser();
}
