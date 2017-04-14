package simple.qilin.com.databindingdemo.bean;

import android.databinding.ObservableField;

/**
 * [description about this class]
 *
 * @author zhangqil
 * @DATE 2017-04-14 16:41
 * @copyright Copyright 2010 RD information technology Co.,ltd.. All Rights Reserved.
 */

public class User3 {
    ObservableField<String> userName = new ObservableField<>();


    public ObservableField<String> getUserName() {
        return userName;
    }

    public void setUserName(ObservableField<String> userName) {
        this.userName = userName;
    }


}
