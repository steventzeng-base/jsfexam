/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.view;

import exam.service.UserService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author steven
 */
@Model
public class QueryTable {

    private String nameParam;

    private List<User> data;

    @Inject
    UserService userService;

    public String getNameParam() {
        return nameParam;
    }

    public void setNameParam(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public void init() {
        data = userService.findByName(nameParam);
        Logger.getLogger(QueryTable.class.getName()).log(Level.INFO, "data size {0}", data.size());
    }
}
