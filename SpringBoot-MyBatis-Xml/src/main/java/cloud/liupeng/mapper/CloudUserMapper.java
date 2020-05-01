package cloud.liupeng.mapper;

import cloud.liupeng.entity.CloudUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CloudUserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    List<CloudUser> getAllUser();
}
