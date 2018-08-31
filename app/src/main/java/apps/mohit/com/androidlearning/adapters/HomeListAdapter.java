package apps.mohit.com.androidlearning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import apps.mohit.com.androidlearning.R;

public class HomeListAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mElements;
    private LayoutInflater mInflater;

    public HomeListAdapter(Context context, List<String>elements){
       super();
       this.mContext = context;
       this.mElements =elements;
    }
    @Override
    public int getCount() {
        return mElements.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class HomeListViewHolder{
        private TextView mTextView;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        HomeListViewHolder holder;

        if (view==null){
            this.mInflater = LayoutInflater.from(mContext);

            view = mInflater.inflate(R.layout.list_item,null);
            holder = new HomeListViewHolder();

            holder.mTextView = view.findViewById(R.id.listTitle);

            view.setTag(holder);
        }else{
            holder = (HomeListViewHolder) view.getTag();
        }

        holder.mTextView.setText(mElements.get(i));

        return view;

    }
}
