package company.com.tehiringaotereoTest;


import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import company.com.tehiringaotereoTest.Utilities.EAImageButton;

public class VoiceClosingPrayerPlayer extends Activity {
    private EAImageButton mPlayBtn;
    private EAImageButton mPauseBtn;
    private EAImageButton mStopBtn;
    private MediaPlayer mPlayer;
    private SeekBar mSeekBar;
    private TextView mProgressTime;
    private TextView mLeftTime;
    private Handler mHandler;
    private Runnable mRunnable;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voice_closingprayerplayer);

        mPlayBtn = (EAImageButton) findViewById(R.id.ibtn_play);
        mPauseBtn = (EAImageButton) findViewById(R.id.ibtn_pause);
        mStopBtn = (EAImageButton) findViewById(R.id.ibtn_stop);
        mSeekBar = (SeekBar) findViewById(R.id.sb_playerProgress);
        mProgressTime = (TextView) findViewById(R.id.tv_progressTime);
        mLeftTime = (TextView) findViewById(R.id.tv_leftTime);

        mHandler = new Handler();

        mPlayer = MediaPlayer.create(VoiceClosingPrayerPlayer.this, R.raw.karakiaclose);

        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        mSeekBar.setThumb(null);

        mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                int duration = mPlayer.getDuration();

                mSeekBar.setMax(duration);

                playCycle();

                mLeftTime.setText(milliSecondsToTimer(duration));
                mProgressTime.setText(milliSecondsToTimer(0));
            }
        });


        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean input) {
                if (input) {
                    mPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer == null) {
                    mPlayer = MediaPlayer.create(VoiceClosingPrayerPlayer.this, R.raw.karakiaclose);
                }
                //if(position.equalsIgnoreCase("0"))
                //else if(position.equalsIgnoreCase("1"))
                //mPlayer = MediaPlayer.create(PrayerSongActivity.this, R.raw.waita);
                //else
                //mPlayer = MediaPlayer.create(PrayerSongActivity.this, R.raw.karakiaclose);
                mPlayer.start();
                playCycle();
            }
        });

        mPauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer != null && mPlayer.isPlaying()) {
                    mPlayer.pause();
                }
            }
        });

        mStopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer != null) {
                    int duration = mPlayer.getDuration();
                    mPlayer.stop();
                    mSeekBar.setProgress(0);
                    mProgressTime.setText(milliSecondsToTimer(0));
                    mLeftTime.setText(milliSecondsToTimer(duration));
                    mPlayer = MediaPlayer.create(VoiceClosingPrayerPlayer.this, R.raw.karakiaclose);
                }
            }
        });
    }


    private void playCycle() {
        mSeekBar.setProgress(mPlayer.getCurrentPosition());

        if (mPlayer.isPlaying()) {
            mRunnable = new Runnable() {
                @Override
                public void run() {
                    playCycle();
                    int progressTime = mPlayer.getCurrentPosition();
                    int duration = mPlayer.getDuration();

                    mProgressTime.setText(milliSecondsToTimer(progressTime));
                    mLeftTime.setText(milliSecondsToTimer(duration - progressTime));
                }
            };
            mHandler.postDelayed(mRunnable, 100);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPlayer.release();
        mHandler.removeCallbacks(mRunnable);
    }

    private String milliSecondsToTimer(int milliseconds) {
        String finalTimerString = "";
        String secondsString;
        String minuteString = "00";

        int hours = milliseconds / (1000 * 60 * 60);
        int minutes = milliseconds % (1000 * 60 * 60) / (1000 * 60);
        int seconds = ((milliseconds % (1000 * 60 * 60)) % (1000 * 60) / 1000);

        if (hours > 0) {
            finalTimerString = hours + ":";
        }

        if (minutes > 0) {
            minuteString = String.valueOf(minutes);
        }

        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + String.valueOf(seconds);
        }

        finalTimerString = finalTimerString + minuteString + ":" + secondsString;

        return finalTimerString;
    }
}
