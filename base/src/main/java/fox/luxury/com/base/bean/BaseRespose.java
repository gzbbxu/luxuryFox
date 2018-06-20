package fox.luxury.com.base.bean;

import java.io.Serializable;

public class BaseRespose<T> implements Serializable {
    public String Code;
    public String Msg;

    public T Data;

    public boolean success() {
        return "1".equals(Code);
    }

}
