package cn.leicixiang.leitest.presenter;

import cn.leicixiang.leitest.bean.UserBean;
import cn.leicixiang.leitest.model.IUserModel;
import cn.leicixiang.leitest.model.UserModel;
import cn.leicixiang.leitest.view.IUserView;

/**
 * Created by leicixiang on 2017/4/25.
 */

public class UserPresenter {
    private IUserModel mUserModel;
    private IUserView mUserView;

    public UserPresenter(IUserView view){
        this.mUserView = view;
        this.mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName){
        mUserModel.setId(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id){
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());
        mUserView.setLastName(user.getLastName());
    }

}
