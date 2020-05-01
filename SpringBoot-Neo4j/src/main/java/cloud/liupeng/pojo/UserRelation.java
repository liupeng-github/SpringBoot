package cloud.liupeng.pojo;

import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * 关系实体类
 * @author liupeng
 */
@Data
@RelationshipEntity(type = "userRelation")
public class UserRelation {

    @Id
    private Long nodeId;

    /**
     * 起始节点
     */
    @StartNode
    private UserNode startUserNode;

    /**
     * 结束节点
     */
    @EndNode
    private UserNode endUserNode;
}
