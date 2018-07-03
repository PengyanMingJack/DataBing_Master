package allvideo.pym.com.app2;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qibin on 2015/8/12.
 */
public class Utils {
    @BindingAdapter({"bind:image"})
    public static void imageLoader(ImageView imageView, String url) {
        ImageLoaderUtils.getInstance().displayImage(url, imageView);
    }
    @BindingAdapter({"bind:imageHead"})
    public static void imageHead(ImageView imageView, String url) {
        ImageLoaderUtils.getInstance().displayImage(url, imageView);
    }
    @BindingConversion
    public static String dateFormat(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        return format.format(date);
    }
}
