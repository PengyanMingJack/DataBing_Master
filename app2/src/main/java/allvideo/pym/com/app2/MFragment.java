package allvideo.pym.com.app2;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Administrator on 2018/7/2.
 */

public class MFragment extends Fragment {

    private App2 app2;
    allvideo.pym.com.app2.databinding.FragmentBinding binding;
    private ObservableField<String> field;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        app2 = new App2("测试", true);
        app2.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531190993&di=669f34ff7b4af7a3987081c4a554b0ec&imgtype=jpg&er=1&src=http%3A%2F%2Fimg4.duitang.com%2Fuploads%2Fitem%2F201601%2F27%2F20160127121505_dPmN5.jpeg");
        binding.setApp(app2);
        binding.setClick(this);
        field = new ObservableField<>();
        field.set("绝地求生刺激战场");
        binding.setStr(field);
        ArrayList<App2> mData = new ArrayList<>();
        mData.add(app2);
        mData.add(app2);
        mData.add(app2);
        mData.add(app2);
        mData.add(app2);
        mData.add(app2);
        mData.add(app2);
        mData.add(app2);
        binding.recycleview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycleview.setAdapter(new MyAdapter(mData));

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private ArrayList<App2> mData = new ArrayList<>();

        private MyAdapter(ArrayList<App2> data) {
            mData.addAll(data);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater
                    .from(parent.getContext()), R.layout.item, parent, false);
            ViewHolder viewHolder = new ViewHolder(binding.getRoot());
            viewHolder.setBinding(binding);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.binding.setVariable(BR.item, mData.get(position));
            holder.binding.executePendingBindings();

        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private ViewDataBinding binding;

            public ViewHolder(View itemView) {
                super(itemView);
            }

            public void setBinding(ViewDataBinding binding) {
                this.binding = binding;
            }

            public ViewDataBinding getBinding() {
                return this.binding;
            }
        }
    }

    public void Click1(View view) {
        app2.setName("测试二二二二");
        app2.setShow(!app2.isShow());
        Toast.makeText(getActivity(), "哈哈哈哈", Toast.LENGTH_LONG).show();
    }

    public void Click2(View view) {
        field.set("今晚吃鸡");
        Toast.makeText(getActivity(), "哈哈哈哈", Toast.LENGTH_LONG).show();
    }
}
