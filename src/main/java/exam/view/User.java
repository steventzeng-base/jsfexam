/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.view;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author steven
 */
@RequestScoped
@Named
public class User implements Serializable {

    private static final long serialVersionUID = -2785975670326249135L;

    private String name;

    private String password;

    public User() {
        LOGGER.log(Level.INFO, "new user!");
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static final Logger LOGGER = Logger.getLogger(User.class.getName());

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        LOGGER.log(Level.INFO, "do login user name {0} pasword {1}", new Object[]{name, password});
        return "login_user";
    }

}
