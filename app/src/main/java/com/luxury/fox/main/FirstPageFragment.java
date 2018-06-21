package com.luxury.fox.main;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.luxury.fox.R;
import com.luxury.fox.main.adapter.FirstPageAdapter;

import fox.luxury.com.base.ui.BaseFragment;

public class FirstPageFragment extends BaseFragment {
    private RecyclerView recyclerView;
    FirstPageAdapter firstPageAdapter;
    Toolbar toolbar;
    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        recyclerView = rootView.findViewById(R.id.behavior_demo_recycler);
        firstPageAdapter = new FirstPageAdapter(this.getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new NoAlphaItemAnimator());
        recyclerView.setAdapter(firstPageAdapter);
        firstPageAdapter.setData();

        toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setTitle("title");
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_first_page;
    }
}
