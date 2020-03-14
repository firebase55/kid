package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class mainscrean extends AppCompatActivity {
    private Button abcButton, oneButoon, quizButton, textButton, watchButton, prounaction;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscrean);
        abcButton = (Button) findViewById(R.id.imageabc);
        prounaction = (Button) findViewById(R.id.pronid);
        oneButoon = (Button) findViewById(R.id.numberid);
        watchButton = (Button) findViewById(R.id.watchid);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        oneButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num = new Intent(getApplicationContext(),numbersActivity.class);
                startActivity(num);
            }
        });
        abcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abcintent = new Intent(getApplicationContext(), abcActvty.class);
                startActivity(abcintent);
            }
        });


        watchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent watchintent = new Intent(getApplicationContext(), watchvideo.class);
                startActivity(watchintent);

            }
        });


        prounaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prounaction = new Intent(getApplicationContext(), prounaction_words.class);
                startActivity(prounaction);
            }
        });


    }

    public void dilaog(View view) {
        final Dialog dialog = new Dialog(mainscrean.this);
        dialog.setContentView(R.layout.custom);
        dialog.setTitle("Custom Dialog");

        ImageButton image = (ImageButton) dialog.findViewById(R.id.acustom);
        dialog.show();

        ImageButton declineButton = (ImageButton) dialog.findViewById(R.id.bcustomid);
        declineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent speech1 = new Intent(getApplicationContext(), speech.class);
                startActivity(speech1);

            }
        });
        image.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view)
     {
         Intent nospeech  = new Intent(getApplicationContext(),numberSpeech.class);
         startActivity(nospeech);


     }
 });

    }

    public void custon_diloag(View view) {
        final Dialog dialog = new Dialog(mainscrean.this);
        dialog.setContentView(R.layout.quiz_custom);
        dialog.setTitle("Custom Dialog");

        Button numbers = (Button) dialog.findViewById(R.id.noids);

        dialog.show();

        Button abcdid = (Button) dialog.findViewById(R.id.aid);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent quizz = new Intent(getApplicationContext(), quiz.class);
                startActivity(quizz);

            }
        });
        abcdid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quizabc = new Intent(getApplicationContext(),QuizActivity.class);
                startActivity(quizabc);
            }
        });
    }

    @Override
    public void onBackPressed() {
        new SweetAlertDialog(mainscrean.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want closed App")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();
                        finish();

                    }
                })
                .setCancelText("No")
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();

                    }
                })
                .show();
    }
}




