package allvideo.pym.com.databing_master;

import android.databinding.BaseObservable;

/**
 * Created by loader on 2015/8/7.
 */
public class Data extends BaseObservable{
    private String name;
    private String addr;
    private int age;

    public Data() {
    }

    public Data(String name, String addr, int age) {
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
