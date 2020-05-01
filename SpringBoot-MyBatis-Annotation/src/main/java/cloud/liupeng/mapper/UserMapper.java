package cloud.liupeng.mapper;

import cloud.liupeng.entity.CloudUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liupeng
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @Select("SELECT * FROM `cloud_user`")
    List<CloudUser> getAllUser();
}
