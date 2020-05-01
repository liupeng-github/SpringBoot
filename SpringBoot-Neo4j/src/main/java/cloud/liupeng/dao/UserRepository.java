package cloud.liupeng.dao;

import cloud.liupeng.pojo.UserNode;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liupeng
 */
@Component
public interface UserRepository extends Neo4jRepository<UserNode, Long> {

    /**
     * 查询
     * @return
     */
    @Query("MATCH (n:userNode) RETURN n")
    List<UserNode> getUserNodeList();

    /**
     * 添加
     * @param name
     * @param age
     * @return
     */
    @Query("create (n:userNode{name:{name},{age:{age}}) RETURN n")
    List<UserNode> addUserNodeList(@Param("name") String name, @Param("age") Integer age);
}