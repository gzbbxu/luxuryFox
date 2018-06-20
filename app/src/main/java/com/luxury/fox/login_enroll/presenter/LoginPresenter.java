package com.luxury.fox.login_enroll.presenter;

import android.util.Log;

import com.luxury.fox.bean.TestBook;
import com.luxury.fox.bean.UserBeanResponse;
import com.luxury.fox.login_enroll.contract.LoginContract;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

import fox.luxury.com.base.bean.BaseRespose;
import fox.luxury.com.base.rx.BaseObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;

public class LoginPresenter extends LoginContract.Presenter{
    @Override
    public void login(String userNmae, String pwd) {
      /*  Disposable disposable = mModel.login(userNmae, pwd).subscribe(new Consumer<BaseRespose<UserBeanResponse>>() {
            @Override
            public void accept(BaseRespose<UserBeanResponse> userBeanResponseBaseRespose) throws Exception {

            }
        });*/
     /*   Consumer<BaseRespose<List<TestBook>>> consumer = FlowableInternalHelper.subscriberOnNext(new Subscriber<BaseRespose<List<TestBook>>>() {
            @Override
            public void onSubscribe(Subscription s) {
                Log.d("zhouke","onSubscribe..");
            }

            @Override
            public void onNext(BaseRespose<List<TestBook>> userBeanResponseBaseRespose) {
                Log.d("zhouke","onNext..:");
            }

            @Override
            public void onError(Throwable t) {
                Log.d("zhouke","onError..");
            }

            @Override
            public void onComplete() {
                Log.d("zhouke","onComplete..");
            }
        });*/
        mModel.login(userNmae,pwd).subscribe(new Observer<BaseRespose<List<TestBook>>>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d("zhouke","onSubscribe..");
            }

            @Override
            public void onNext(BaseRespose<List<TestBook>> listBaseRespose) {
                Log.d("zhouke","onNext..:");
            }

            @Override
            public void onError(Throwable e) {
                Log.d("zhouke","onError..");
            }

            @Override
            public void onComplete() {
                Log.d("zhouke","onComplete..");
            }
        });

        mModel.login(userNmae,pwd).subscribe(new BaseObserver<List<TestBook>>(mContext) {
            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }

            @Override
            protected void onHandleSuccess(List<TestBook> testBooks) {

            }
        });
//        mRxManager.add(mModel.login(userNmae,pwd).subscribe());
    }


}
