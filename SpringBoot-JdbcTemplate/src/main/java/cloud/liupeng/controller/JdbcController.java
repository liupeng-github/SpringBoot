package cloud.liupeng.controller;

import cloud.liupeng.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author liupeng
 */
@Controller
public class JdbcController {

    @Autowired
    private JdbcService jdbcService;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        try {
            Connection connection = jdbcService.dataSource();
            if (connection != null) {
                modelMap.put("message", "数据库连接成功！");
            } else {
                modelMap.put("message", "数据库连接失败！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            modelMap.put("message", "数据库连接异常！");
        }
        return "index";
    }
}
