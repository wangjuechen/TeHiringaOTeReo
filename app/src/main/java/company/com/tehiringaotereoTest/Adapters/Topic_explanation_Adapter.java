package company.com.tehiringaotereoTest.Adapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.R;
import company.com.tehiringaotereoTest.Utilities.EAImageButton;

public class Topic_explanation_Adapter extends BaseAdapter {

    private final Context c;
    private ArrayList<String> mTitleArrayList = new ArrayList<>();
    private ArrayList<String> mContentArrayList = new ArrayList<>();
    private ArrayList<Integer> mVoiceIdArrayList = new ArrayList<>();
    public MediaPlayer mMediaplayer;

    public Topic_explanation_Adapter(Context context, ArrayList<String> title, ArrayList<String> content, ArrayList<Integer> voiveId, MediaPlayer mplayer) {
        this.c = context;
        this.mTitleArrayList = title;
        this.mContentArrayList = content;
        this.mMediaplayer = mplayer;
        this.mVoiceIdArrayList = voiveId;
    }

    @Override
    public int getCount() {
        return mContentArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mContentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = infalInflater.inflate(R.layout.explanation_row_item, null);
        }

        TextView txtEng = (TextView) v.findViewById(R.id.tv_engtext);
        TextView txtMaori = (TextView) v.findViewById(R.id.tv_maoritext);
        EAImageButton btn_play = (EAImageButton) v.findViewById(R.id.btn_Play);

        txtEng.setText(mContentArrayList.get(position));
        txtMaori.setText(mTitleArrayList.get(position));


        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMediaplayer == null) {
                    mMediaplayer = MediaPlayer.create(c, mVoiceIdArrayList.get(position));
                } else {
                    if (mMediaplayer.isPlaying())
                        mMediaplayer.stop();
                    mMediaplayer = MediaPlayer.create(c, mVoiceIdArrayList.get(position));

                }
                mMediaplayer.start();
            }
        });

        if (position + 1 > mVoiceIdArrayList.size()) {

            btn_play.setVisibility(View.INVISIBLE);
        } else {

            if (mVoiceIdArrayList.get(position) == 0) {
                btn_play.setVisibility(View.INVISIBLE);
            } else {
                btn_play.setVisibility(View.VISIBLE);
            }
        }
        return v;
    }

    public void PlayerStop() {
        mMediaplayer.stop();
        mMediaplayer.release();
    }


}
