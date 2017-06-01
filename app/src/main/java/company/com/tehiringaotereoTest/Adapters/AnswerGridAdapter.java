package company.com.tehiringaotereoTest.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.TextView;

import company.com.tehiringaotereoTest.R;


public class AnswerGridAdapter extends BaseAdapter {

    private final Context c;
    private final String[] ans;

    public AnswerGridAdapter(Context context, String[] answer) {
        this.c = context;
        this.ans = answer;
    }

    @Override
    public int getCount() {
        return ans.length;
    }

    @Override
    public Object getItem(int position) {
        return ans[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.grid_item, null);
        }

        TextView txtAns = (TextView) convertView.findViewById(R.id.lblListItem);

        txtAns.setText(ans[position]);

//
//        convertView.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View v, DragEvent event) {
//
//
//                return false;
//            }
//        });

        return convertView;
    }
}
