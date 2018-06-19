package fox.luxury.com.base.ui;

import android.content.Context;

public abstract class BasePresenter<M, V> {
    public Context mContext;
    public M mModel;
    public V mView;

    public void setVM(M m, V v) {
        this.mModel = m;
        this.mView = v;
    }
}
