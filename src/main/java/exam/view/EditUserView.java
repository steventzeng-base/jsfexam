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
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author steven
 */
@Named
@SessionScoped
public class EditUserView implements Serializable {

    private static final long serialVersionUID = 7032096716541435800L;

    private String nameParam;

    private User editUser;

    @Inject
    UserService userService;

    public void init() {

        Logger.getLogger(EditUserView.class.getName()).log(Level.INFO, "run init");
        editUser = userService.getUser(nameParam);
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

    public String editDone() {
        return "query_table?faces-redirect=true&name" + nameParam;
    }

}
