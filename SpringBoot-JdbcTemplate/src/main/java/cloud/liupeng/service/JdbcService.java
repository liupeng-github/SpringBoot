package cloud.liupeng.service;

import cloud.liupeng.dao.JdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class JdbcService {

    @Autowired
    private JdbcDao jdbcDao;

    public Connection dataSource() throws SQLException {
        return jdbcDao.dataSource();
    }
}
