/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.service;

import exam.view.User;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;

/**
 *
 * @author steven
 */
@Dependent
public class UserService {

    public List<User> findByName(String name) {
        Logger.getLogger(UserService.class.getName()).log(Level.INFO, "query: {0}", name);
        return Arrays.asList(
                new User("user1", "oooo"),
                new User("user2", "xxxx"),
                new User("user3", "oooo"),
                new User("user4", "xxxx"),
                new User("user5", "oooo")
        );
    }
}
