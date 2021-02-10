package dao;

import entity.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class UserDAOIml implements AbstractUserDAO{
    private JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_USER_BY_USERNAME = "select * from client_user where user_name=?";

    public UserDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public User getUserByUsername(String username) {
        return this.jdbcTemplate.queryForObject(SQL_FIND_USER_BY_USERNAME, new Object[]{username}, new UserMapper());
    }
}
