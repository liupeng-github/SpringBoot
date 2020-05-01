package cloud.liupeng.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author liupeng
 */
@Repository
public class JdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Connection dataSource() throws SQLException {
        return jdbcTemplate.getDataSource().getConnection();
    }
}
