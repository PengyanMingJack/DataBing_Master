package allvideo.pym.com.databing_master;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/7/2.
 */

public class EventClick {
    public void handerClick(View view) {
        Toast.makeText(view.getContext(), "您点击了", Toast.LENGTH_LONG).show();
    }
}
