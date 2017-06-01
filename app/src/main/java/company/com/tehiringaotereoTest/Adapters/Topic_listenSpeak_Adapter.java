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

public class Topic_listenSpeak_Adapter extends BaseAdapter {

    private final Context c;
    private ArrayList<String> mEnglishArrayList = new ArrayList<>();
    private ArrayList<String> mMaoriArrayList = new ArrayList<>();
    private ArrayList<Integer> mFileIdArrayList = new ArrayList<>();
    public MediaPlayer mMediaplayer;
    public EAImageButton btn_play;

    public Topic_listenSpeak_Adapter(Context context, ArrayList<String> EnglishWords, ArrayList<String> MaoriWords, ArrayList<Integer> VoiceId, MediaPlayer mplayer) {
        this.c = context;
        this.mEnglishArrayList = EnglishWords;
        this.mMaoriArrayList = MaoriWords;
        this.mFileIdArrayList = VoiceId;
        this.mMediaplayer = mplayer;
    }

    @Override
    public int getCount() {
        return mEnglishArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mEnglishArrayList.get(position);
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
            v = infalInflater.inflate(R.layout.listen_speak_row_item, null);
        }

        TextView txtEng = (TextView) v.findViewById(R.id.tv_engtext);
        TextView txtMaori = (TextView) v.findViewById(R.id.tv_maoritext);
        btn_play = (EAImageButton) v.findViewById(R.id.btn_Play);


        txtEng.setText(mEnglishArrayList.get(position));
        txtMaori.setText(mMaoriArrayList.get(position));


        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mMediaplayer == null) {
                    mMediaplayer = MediaPlayer.create(c, mFileIdArrayList.get(position));
                } else {
                    if (mMediaplayer.isPlaying())
                        mMediaplayer.stop();
                    mMediaplayer = MediaPlayer.create(c, mFileIdArrayList.get(position));

                }
                mMediaplayer.start();

            }
        });

        if (position + 1 > mFileIdArrayList.size()) {

            btn_play.setVisibility(View.INVISIBLE);
        } else {

            if (mFileIdArrayList.get(position) == 0) {
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
