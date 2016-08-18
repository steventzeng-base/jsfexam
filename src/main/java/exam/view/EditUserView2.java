/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.view;

import exam.service.UserService;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author steven
 */
@Named
@ViewScoped
public class EditUserView2 implements Serializable {

    private static final long serialVersionUID = 8887471092913024865L;

    private String nameParam;

    private User editUser;

    private String oldvalue;

    @Inject
    UserService userService;

    public void init() {

        Logger.getLogger(EditUserView2.class.getName()).log(Level.INFO, "run init");
        editUser = userService.getUser(nameParam);
        oldvalue = editUser.getName();
    }

    public String getNameParam() {
        return nameParam;
    }

    public void setNameParam(String nameParam) {
        this.nameParam = nameParam;
    }

    public User getEditUser() {
        return editUser;
    }

    public void setEditUser(User editUser) {
        this.editUser = editUser;
    }

    public void editDone() {
        Logger.getLogger(EditUserView2.class.getName()).log(Level.INFO, "name: {0} password: {1}", new Object[]{editUser.getName(), editUser.getPassword()});
//        return "query_table?faces-redirect=true&name" + nameParam;
    }

    public boolean isChangeUserName() {
        return !oldvalue.equals(editUser.getName());
    }

}
