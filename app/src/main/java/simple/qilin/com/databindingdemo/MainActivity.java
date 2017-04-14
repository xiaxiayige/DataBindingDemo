package simple.qilin.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import simple.qilin.com.databindingdemo.bean.User;
import simple.qilin.com.databindingdemo.bean.User2;
import simple.qilin.com.databindingdemo.bean.User3;
import simple.qilin.com.databindingdemo.databinding.ActivityMainBinding;
import simple.qilin.com.databindingdemo.precenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    public ObservableArrayList<String> getObservableArrayList() {
        return mObservableArrayList;
    }

    public void setObservableArrayList(ObservableArrayList<String> observableArrayList) {
        mObservableArrayList = observableArrayList;
    }

    ObservableArrayList<String> mObservableArrayList = new ObservableArrayList();
    ObservableInt position=new ObservableInt();

    public ObservableInt getPosition() {
        return position;
    }

    public void setPosition(ObservableInt position) {
        this.position = position;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("My Name is X");
        activityMainBinding.setUser(user);
        User2 user2 = new User2();
        user2.setName("My name is KangKang");
        activityMainBinding.setUser2(user2);
        activityMainBinding.setMainPrecenter(new MainActivityPresenter(this));
        User3 user3 = new User3();
        ObservableArrayList<String> observableArrayList = new ObservableArrayList<>();
        observableArrayList.add("哈哈哈1");
        observableArrayList.add("哈哈哈2");
        observableArrayList.add("哈哈哈3");
        observableArrayList.add("哈哈哈4");
        activityMainBinding.setUser3(new User3());
        activityMainBinding.updataName.setText("修改user2 Name");
        position.set(0);
    }
}
