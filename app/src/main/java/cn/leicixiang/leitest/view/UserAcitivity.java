package cn.leicixiang.leitest.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.leicixiang.leitest.R;
//import cn.leicixiang.leitest.bean.APIInterface;
import cn.leicixiang.leitest.bean.TestModel;
import cn.leicixiang.leitest.myJNI;
import cn.leicixiang.leitest.presenter.UserPresenter;
//import io.reactivex.Observer;
//import io.reactivex.android.schedulers.AndroidSchedulers;
//import io.reactivex.disposables.Disposable;
//import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserAcitivity extends AppCompatActivity implements IUserView {
    @BindView(R.id.user)
    EditText username;
    @BindView(R.id.pass)
    EditText password;
    @BindView(R.id.login)
    Button login;

    private UserPresenter presenter;

    @OnClick(R.id.login)
    void submit() {
        /*
        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        APIInterface apiInterface = retrofit.create(APIInterface.class);
        apiInterface.repo("Guolei1130")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TestModel>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onNext(@NonNull TestModel testModel) {
                        login.setText(testModel.getLogin());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                    }
                });
                */
        login.setText(myJNI.sayHello());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_acitivity);
        ButterKnife.bind(this);
        presenter = new UserPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("UserAcctivty", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("UserAcctivty", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("UserAcctivty", "onStop");
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getFristName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
