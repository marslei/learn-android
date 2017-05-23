package cn.leicixiang.leitest.model;

import cn.leicixiang.leitest.bean.UserBean;

/**
 * Created by leicixiang on 2017/4/25.
 */

public interface IUserModel {
    void setId(int id);
    void setFirstName(String firstName );
    void setLastName(String lastName);
    int getId();

    UserBean load(int id);
}
