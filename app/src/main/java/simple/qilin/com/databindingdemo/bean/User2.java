package simple.qilin.com.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import simple.qilin.com.databindingdemo.BR;

/**
 * [description about this class]
 *
 * @author zhangqil
 * @DATE 2017-04-14 14:40
 * @copyright Copyright 2010 RD information technology Co.,ltd.. All Rights Reserved.
 */

public class User2 extends BaseObservable
{
    private String name;



    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
