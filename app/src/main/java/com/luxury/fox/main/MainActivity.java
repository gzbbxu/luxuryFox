package com.luxury.fox.main;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luxury.fox.R;
import com.luxury.fox.main.contract.MainContract;
import com.luxury.fox.main.viewholder.BottomTabHolder;

import fox.luxury.com.base.ui.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.View {
    private FragmentManager mFragmentManager;

    private FirstPageFragment firstPageFragment;
    private HorizonFragment horizonFragment;
    private MessageFragment messageFragment;
    private ClassifyFragment classifyFragment;
    private MineFragment mineFragment;
    BottomTabHolder bottomTabHolder;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        switchTab(0);
        bottomTabHolder = new  BottomTabHolder(this,findViewById(R.id.group_layout));
    }


    @Override
    public void switchTab(int positon) {

        if(mFragmentManager == null){
            mFragmentManager = getSupportFragmentManager();
        }

        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (positon) {
            case 0:
                if (firstPageFragment == null) {
                    firstPageFragment = new FirstPageFragment();
                    transaction.add(R.id.fragment_container, firstPageFragment, "firstPageFragment");
                } else {
                    transaction.show(firstPageFragment);
                }
                break;
            case 1:
                if (horizonFragment == null) {
                    horizonFragment = new HorizonFragment();
                    transaction.add(R.id.fragment_container, horizonFragment, "horizonFragment");
                } else {
                    transaction.show(horizonFragment);
                }
                break;
            case 2:
                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
                    transaction.add(R.id.fragment_container, messageFragment, "messageFragment");
                } else {
                    transaction.show(messageFragment);
                }
                break;
            case 3:
                if (classifyFragment == null) {
                    classifyFragment = new ClassifyFragment();
                    transaction.add(R.id.fragment_container, classifyFragment, "classifyFragment");
                } else {
                    transaction.show(classifyFragment);
                }
                break;
            case 4:
                if (mineFragment == null) {
                    mineFragment = new MineFragment();
                    transaction.add(R.id.fragment_container, mineFragment, "mineFragment");
                } else {
                    transaction.show(mineFragment);
                }

                break;
        }
        transaction.commitAllowingStateLoss();
    }

    private void hideFragments(FragmentTransaction transaction){
        if (firstPageFragment != null) {
            transaction.hide(firstPageFragment);
        }
        if (horizonFragment != null) {
            transaction.hide(horizonFragment);
        }
        if(messageFragment !=null){
            transaction.hide(messageFragment);
        }
        if (classifyFragment != null) {
            transaction.hide(classifyFragment);
        }
        if (mineFragment != null) {
            transaction.hide(mineFragment);
        }
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
}
