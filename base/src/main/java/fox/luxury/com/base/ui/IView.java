package fox.luxury.com.base.ui;

public interface IView {
    void showLoading(String title);
    void stopLoading();
    void showErrorTip(String msg);
}
