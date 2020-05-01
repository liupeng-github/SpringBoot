package cloud.liupeng.pojo;

import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 节点类型
 * @author liupeng
 */
@Data
@NodeEntity(label = "userNode")
public class UserNode {

    @Id
    private Long nodeId;

    @Property
    private String userId;

    @Property
    private String name;

    @Property
    private Integer age;

}
