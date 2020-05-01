package cloud.liupeng.dao;

import cloud.liupeng.pojo.UserRelation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liupeng
 */
@Component
public interface UserRelationRepository extends Neo4jRepository<UserRelation, Long> {

    @Query("match p=(n:userRelation)<-[r:UserRelation]->(n1:userRelation) where n.userId={firstUserId} and n1.userId={secondUserId} return p")
    List<UserRelation> findUserRelationByEachId(@Param("firstUserId") String firstUserId, @Param("secondUserId") String secondUserId);

    @Query("match (fu:userRelation),(su:userRelation) where fu.userId={firstUserId} and su.userId={secondUserId} create p=(fu)-[r:UserRelation]->(su) return p")
    List<UserRelation> addUserRelation(@Param("firstUserId") String firstUserId, @Param("secondUserId") String secondUserId);
}
