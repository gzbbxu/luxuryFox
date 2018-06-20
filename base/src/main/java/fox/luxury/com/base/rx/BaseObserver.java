package fox.luxury.com.base.rx;


import android.content.Context;
import android.widget.Toast;

import fox.luxury.com.base.bean.BaseRespose;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class BaseObserver<T> implements Observer<BaseRespose<T>> {
    private Context mContext;

    protected BaseObserver(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(BaseRespose<T> value) {
        if (value.success()) {
            T t = value.Data;
            onHandleSuccess(t);
        } else {
            onHandleError(value.Msg);
        }
    }

    protected abstract void onHandleSuccess(T t);

    protected void onHandleError(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }


}
