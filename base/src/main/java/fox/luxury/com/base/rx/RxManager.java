package fox.luxury.com.base.rx;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class RxManager {
    /*管理Observables 和 Subscribers订阅*/
    CompositeDisposable composite = new CompositeDisposable();
    /**
     * 单纯的Observables 和 Subscribers管理
     *
     * @param
     */
    public void add(Disposable disposable) {
        /*订阅管理*/
        composite.add(disposable);

    }

    /**
     * 单个presenter生命周期结束，取消订阅和所有rxbus观察
     */
    public void clear() {
        composite.dispose();
    }
}
