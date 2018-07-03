package allvideo.pym.com.app2;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Date;

/**
 * Created by Administrator on 2018/7/3.
 */

public class WelcomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        allvideo.pym.com.app2.databinding.WelcomLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.welcom_layout);
        binding.setTime(new Date());
        binding.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1530593533501&di=b7aa70713572ae61bed183b6add91b62&imgtype=0&src=http%3A%2F%2Fimg4.duitang.com%2Fuploads%2Fitem%2F201510%2F03%2F20151003183452_kHSJE.jpeg");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomActivity.this, MainActivity.class));
            }
        }, 1000);
    }
}
