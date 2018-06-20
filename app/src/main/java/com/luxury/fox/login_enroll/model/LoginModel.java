package com.luxury.fox.login_enroll.model;

import com.luxury.fox.api.Api;
import com.luxury.fox.bean.UserBeanResponse;
import com.luxury.fox.login_enroll.contract.LoginContract;

import fox.luxury.com.base.bean.BaseRespose;
import fox.luxury.com.base.rx.RxSchedulers;
import io.reactivex.Observable;

public class LoginModel implements LoginContract.Model {

    @Override
    public Observable<BaseRespose<UserBeanResponse>> login(String userName, String pwd) {
        return Api.getDefault().login(userName,pwd).compose(RxSchedulers.<BaseRespose<UserBeanResponse>>io_main());

    }
}
