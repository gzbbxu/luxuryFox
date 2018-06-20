package com.luxury.fox.login_enroll.contract;

import com.luxury.fox.bean.TestBook;
import com.luxury.fox.bean.UserBeanResponse;

import java.util.List;

import fox.luxury.com.base.bean.BaseRespose;
import fox.luxury.com.base.ui.BaseModel;
import fox.luxury.com.base.ui.BasePresenter;
import fox.luxury.com.base.ui.BaseView;
import io.reactivex.Observable;

public interface LoginContract {
    interface Model extends BaseModel {
        Observable<BaseRespose<List<TestBook>>> login(String userName, String pwd);
    }

    interface View extends BaseView {

    }

    abstract class Presenter extends BasePresenter<Model, View> {
        public abstract void login(String userNmae, String pwd);
    }
}
