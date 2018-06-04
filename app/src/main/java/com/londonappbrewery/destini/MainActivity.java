package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    static final String LOG_TAG = MainActivity.class.getSimpleName();

    private int mStoryIndex;

    private TextView questionTextView;
    private Button btnTop;
    private Button btnBottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.storyTextView);
        btnTop = findViewById(R.id.buttonTop);
        btnBottom = findViewById(R.id.buttonBottom);

        mStoryIndex = 1;
        updateStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LOG_TAG,"Top Button Pressed!");
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    mStoryIndex = 3;
                }else{
                    mStoryIndex = 6;
                }
                updateStory();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LOG_TAG, "Bottom Button Pressed!");
                if(mStoryIndex == 1){
                    mStoryIndex = 2;
                }else if(mStoryIndex == 2){
                    mStoryIndex = 4;
                }else if(mStoryIndex == 3){
                    mStoryIndex = 5;
                }

                updateStory();
            }
        });

    }

    public void updateStory(){

        switch(mStoryIndex){
            case 1:
                questionTextView.setText(R.string.T1_Story);
                btnTop.setText(R.string.T1_Ans1);
                btnBottom.setText(R.string.T1_Ans2);
                break;
            case 2:
                questionTextView.setText(R.string.T2_Story);
                btnTop.setText(R.string.T2_Ans1);
                btnBottom.setText(R.string.T2_Ans2);
                break;
            case 3:
                questionTextView.setText(R.string.T3_Story);
                btnTop.setText(R.string.T3_Ans1);
                btnBottom.setText(R.string.T3_Ans2);
                break;
            case 4:
                questionTextView.setText(R.string.T4_End);
                btnTop.setVisibility(View.GONE);
                btnBottom.setVisibility(View.GONE);
                break;
            case 5:
                questionTextView.setText(R.string.T5_End);
                btnTop.setVisibility(View.GONE);
                btnBottom.setVisibility(View.GONE);
                break;
            case 6:
                questionTextView.setText(R.string.T6_End);
                btnTop.setVisibility(View.GONE);
                btnBottom.setVisibility(View.GONE);
                break;
        }
    }
}
