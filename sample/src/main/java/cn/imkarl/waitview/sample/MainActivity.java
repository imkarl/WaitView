package cn.imkarl.waitview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import cn.imkarl.waitview.WaitViewController;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View mRootView;
    private boolean mShowWaitView = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootView = findViewById(R.id.layout_root);

        Button toogleButton = new Button(this);
        toogleButton.setText("切换");
        toogleButton.setOnClickListener(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.RIGHT);
        addContentView(toogleButton, params);
    }

    @Override
    public void onClick(View v) {
        if (mShowWaitView) {
            // 移除
            WaitViewController.from(mRootView).removeChilds();
        } else {
            // 显示
            WaitViewController.from(mRootView).renderChilds();
        }
        mShowWaitView = !mShowWaitView;
    }

}
