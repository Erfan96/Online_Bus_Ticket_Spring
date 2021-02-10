package dao;

import entity.User;

public interface AbstractUserDAO {
    User getUserByUsername(String username);
}
