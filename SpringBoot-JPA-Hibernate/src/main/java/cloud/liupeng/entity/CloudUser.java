package cloud.liupeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @author liupeng
 * @Data //提供类的get、set、equals、hashCode、canEqual、toString方法
 * @NoArgsConstructor // 自动生成无参构造函数
 * @AllArgsConstructor // 自动生成全参构造函数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cloud_users")
public class CloudUser implements Serializable {

    private static final long serialVersionUID = 5658800820967361460L;

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birthday", nullable = false, columnDefinition = "datetime")
    private Date birthday;

    @Column(name = "cloud_id")
    private String cloudId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "nickName")
    private String nickname;

    @Column(name = "name")
    private String name;

    @Column(name = "create_time", nullable = false)
    private String createTime;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "idCard")
    private String idcard;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "remark")
    private String remark;

    @Column(name = "state")
    private Integer state;

    @Column(name = "salt")
    private String salt;

}