package cloud.liupeng.dao;

import cloud.liupeng.entity.CloudUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liupeng
 */
public interface UserDao extends JpaRepository<CloudUser, Long> {
}
