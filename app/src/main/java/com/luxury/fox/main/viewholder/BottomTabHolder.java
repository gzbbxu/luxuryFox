package com.luxury.fox.main.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.luxury.fox.R;
import com.luxury.fox.main.contract.MainContract;

public class BottomTabHolder implements View.OnClickListener {
    MainContract.View mView;
    private ImageView iv_first, iv_horizen, iv_message, iv_classify, iv_mine;
    private TextView tv_first, tv_horizen, tv_message, tv_classify, tv_mine;
    private RelativeLayout tab_first, tab_horizen, tab_message, tab_classify, tab_mine;

    public BottomTabHolder(MainContract.View view, View tabGroup) {
        this.mView = view;
        initView(tabGroup);
    }

    private void initView(View tabGroup) {
        iv_first = tabGroup.findViewById(R.id.iv_first);
        iv_horizen = tabGroup.findViewById(R.id.iv_horizen);
        iv_message = tabGroup.findViewById(R.id.iv_message);
        iv_classify = tabGroup.findViewById(R.id.iv_classify);
        iv_mine = tabGroup.findViewById(R.id.iv_mine);

        tv_first = tabGroup.findViewById(R.id.tv_first);
        tv_horizen = tabGroup.findViewById(R.id.tv_horizen);
        tv_message = tabGroup.findViewById(R.id.tv_message);
        tv_classify = tabGroup.findViewById(R.id.tv_classify);
        tv_mine = tabGroup.findViewById(R.id.tv_mine);

        tab_first = tabGroup.findViewById(R.id.tab_first);
        tab_horizen = tabGroup.findViewById(R.id.tab_horizen);
        tab_message = tabGroup.findViewById(R.id.tab_message);
        tab_classify = tabGroup.findViewById(R.id.tab_classify);
        tab_mine = tabGroup.findViewById(R.id.tab_mine);

        tab_first.setOnClickListener(this);
        tab_horizen.setOnClickListener(this);
        tab_message.setOnClickListener(this);
        tab_classify.setOnClickListener(this);
        tab_mine.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        initDrawable();
        switch (v.getId()) {
            case R.id.tab_first:
                mView.switchTab(0);
                break;
            case R.id.tab_horizen:
                mView.switchTab(1);
                break;
            case R.id.tab_message:
                mView.switchTab(2);
                break;
            case R.id.tab_classify:
                mView.switchTab(3);
                break;
            case R.id.tab_mine:
                mView.switchTab(4);
                break;
        }
    }

    private void initDrawable() {

    }
}
