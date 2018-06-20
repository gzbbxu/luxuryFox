package com.luxury.fox.login_enroll;

import android.view.View;
import android.widget.Button;

import com.luxury.fox.R;
import com.luxury.fox.login_enroll.contract.LoginContract;
import com.luxury.fox.login_enroll.model.LoginModel;
import com.luxury.fox.login_enroll.presenter.LoginPresenter;

import fox.luxury.com.base.ui.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter,LoginModel> implements LoginContract.View{
    private Button btn_login;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(mModel,this);
    }


    @Override
    public void initView() {
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login("","");
            }
        });
    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }
}
