package allvideo.pym.com.app2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Administrator on 2018/7/2.
 */

public class App2 extends BaseObservable {
    private String name;
    private boolean isShow;
    private int age;
    private String imageUrl;

    public App2(String name, boolean isShow) {
        this.name = name;
        this.isShow = isShow;
    }

    public App2() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public boolean isShow() {
        notifyPropertyChanged(BR.show);
        return isShow;

    }

    public void setShow(boolean show) {
        isShow = show;
    }
}
