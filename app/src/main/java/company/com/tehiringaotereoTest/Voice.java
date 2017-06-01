package company.com.tehiringaotereoTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import company.com.tehiringaotereoTest.Utilities.EAImageButton;

public class Voice extends Activity {
    private EAImageButton mPlayOpeningKarakia;
    private EAImageButton mPlayClosingKarakia;
    private EAImageButton mPlayWaiata;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voice);

        mPlayOpeningKarakia = (EAImageButton) findViewById(R.id.ibtn_openingkarakia_play);
        mPlayClosingKarakia = (EAImageButton) findViewById(R.id.ibtn_closingkarakia_play);
        mPlayWaiata = (EAImageButton) findViewById(R.id.ibtn_waiata_play);

        mPlayOpeningKarakia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Voice.this, VoiceOpenPrayerPlayer.class);
                startActivity(intent);
            }
        });

        mPlayClosingKarakia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Voice.this, VoiceClosingPrayerPlayer.class);
                startActivity(intent);
            }
        });

        mPlayWaiata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Voice.this, VoiceSongPlayer.class);
                startActivity(intent);
            }
        });
    }
}
