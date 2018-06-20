package com.luxury.fox.main.contract;

import fox.luxury.com.base.ui.IView;

public interface MainContract {
    interface View extends IView {
        void switchTab(int positon);
    }
}
