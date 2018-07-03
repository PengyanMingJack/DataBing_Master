package allvideo.pym.com.databing_master;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import allvideo.pym.com.databing_master.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setStu(new Data("测试一", "测试一", 1));
        binding.setStr("哈哈哈哈来杀我吧");
        binding.setErr(true);
        List<String> list = Arrays.asList("1212", "2121");
        binding.setList(list);
        binding.setListKey(1);
        binding.setNum(1888);
        binding.setArray(new String[]{"数组1", "数组2"});
        binding.setArrayKey(0);
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "张山");
        binding.setMap(map);
        binding.setMapKey("name");
        binding.setHander(new EventClick());

    }
}
