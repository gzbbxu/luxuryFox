package com.luxury.fox.login_enroll.contract;

import com.luxury.fox.bean.TestBook;

import java.util.List;

import fox.luxury.com.base.bean.BaseRespose;
import fox.luxury.com.base.ui.BaseModel;
import fox.luxury.com.base.ui.BasePresenter;
import fox.luxury.com.base.ui.IView;
import io.reactivex.Observable;

public interface LoginContract {
    interface Model extends BaseModel {
        Observable<BaseRespose<List<TestBook>>> login(String userName, String pwd);
    }

    interface View extends IView {

    }

    abstract class Presenter extends BasePresenter<Model, View> {
        public abstract void login(String userNmae, String pwd);
    }
}
