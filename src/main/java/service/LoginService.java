package service;

import dao.AbstractUserDAO;
import entity.User;

public class LoginService {

    private AbstractUserDAO abstractUserDAO;

    public LoginService(AbstractUserDAO abstractUserDAO) {
        this.abstractUserDAO = abstractUserDAO;
    }

    public User getUserByUsername(String username) {
        return this.abstractUserDAO.getUserByUsername(username);
    }
}
