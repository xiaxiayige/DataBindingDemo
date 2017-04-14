package simple.qilin.com.databindingdemo.precenter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import simple.qilin.com.databindingdemo.bean.User;
import simple.qilin.com.databindingdemo.bean.User2;
import simple.qilin.com.databindingdemo.bean.User3;

/**
 * [description about this class]
 *
 * @author zhangqil
 * @DATE 2017-04-12 14:55
 * @copyright Copyright 2010 RD information technology Co.,ltd.. All Rights Reserved.
 */

public class MainActivityPresenter {
    private Context mContext;

    public MainActivityPresenter(Context context) {
        mContext = context;
    }

    public void myTextOnClick(View view) {
        Toast.makeText(view.getContext(), "hello dataBind", Toast.LENGTH_SHORT).show();
    }

    public void testListenerBindingClick() {
        Toast.makeText(mContext, "打雷了 收衣服了。。。", Toast.LENGTH_SHORT).show();
    }

    public String getTextStr() {
        return "天气阴";
    }

    public String getMyName(View view, User user) {
        Toast.makeText(view.getContext(), user.name, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) view;
        textView.setText(user.name);
        return user.name;
    }


    public void setNewName(User2 user) {
        user.setName("My Name is Jack");
    }

    public void setUserName3(User3 user) {
        user.getUserName().set("My Name is 张三");
    }

}
