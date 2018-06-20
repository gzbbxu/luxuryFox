package fox.luxury.com.base.ui;

public interface BaseView {
    void showLoading(String title);
    void stopLoading();
    void showErrorTip(String msg);
}
