package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class QuizActivity extends AppCompatActivity {
    TextView questionLabel, questionCountLabel, scoreLabel;
    EditText answerEdt;
    Button submitButton;
    ProgressBar progressBar;
    ArrayList<QuestionModel> questionModelArraylist;
    int currentPosition = 0;
    int numberOfCorrectAnswer = 0;
    int markstwo;
    TextView markst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        questionCountLabel = findViewById(R.id.noQuestion);
        questionLabel = findViewById(R.id.question);
        scoreLabel = findViewById(R.id.score);
        answerEdt = findViewById(R.id.answer);
        submitButton = findViewById(R.id.submit);
        progressBar = findViewById(R.id.progress);
        questionModelArraylist = new ArrayList<>();
         markst = (TextView) findViewById(R.id.markss);

        setUpQuestion();

        setData();
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });
        answerEdt.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                Log.e("event.getAction()", event.getAction() + "");
                Log.e("event.keyCode()", keyCode + "");
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    checkAnswer();
                    return true;
                }
                return false;
            }
        });
    }
    public void checkAnswer() {
        String answerString = answerEdt.getText().toString().trim();


        if (answerString.equalsIgnoreCase(questionModelArraylist.get(currentPosition).getAnswer())) {
            numberOfCorrectAnswer++;


            new SweetAlertDialog(QuizActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Good job!")
                    .setContentText("Right Answer")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                            currentPosition++;
                            markstwo++;
                            markst.setText(String.valueOf(markstwo));
                            if(markstwo ==1)
                            {
                                Toast.makeText(QuizActivity.this, "Game", Toast.LENGTH_SHORT).show();
                            }



                            setData();
                            answerEdt.setText("");
                            sweetAlertDialog.dismiss();
                        }
                    })
                    .show();


        } else {

            new SweetAlertDialog(QuizActivity.this, SweetAlertDialog.ERROR_TYPE)
                    .setTitleText("Wrong Answer")
                    .setContentText("The right answer is : " + questionModelArraylist.get(currentPosition).getAnswer())
                    .setConfirmText("OK")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismiss();

                            currentPosition++;

                            setData();
                            answerEdt.setText("");
                        }
                    })
                    .show();
        }


        int x = ((currentPosition + 1) * 100) / questionModelArraylist.size();

        progressBar.setProgress(x);


    }
    public void setUpQuestion(){


        questionModelArraylist.add(new QuestionModel("A  for  = ? ","Apple"));
        questionModelArraylist.add(new QuestionModel("E  for  = ? ","Egg"));
        questionModelArraylist.add(new QuestionModel("G  for  = ?","Goat"));
        questionModelArraylist.add(new QuestionModel("K  for  = ?  ","Kite"));
        questionModelArraylist.add(new QuestionModel("M  for  = ?","Monkey"));
        questionModelArraylist.add(new QuestionModel("O  for  = ?","Orange"));
        questionModelArraylist.add(new QuestionModel("P  for  = ?","Panda"));
        questionModelArraylist.add(new QuestionModel("R  for  = ?","Rabbit"));
        questionModelArraylist.add(new QuestionModel("T  for  = ?","Tiger"));
        questionModelArraylist.add(new QuestionModel("X  for  = ?","Xylophone"));

    }
    public void setData(){


        if(questionModelArraylist.size()>currentPosition) {

            questionLabel.setText(questionModelArraylist.get(currentPosition).getQuestionString());

            scoreLabel.setText("Score :" + numberOfCorrectAnswer + "/" + questionModelArraylist.size());
            questionCountLabel.setText("Question No : " + (currentPosition + 1));


        }else{


            new SweetAlertDialog(QuizActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("You have successfully completed the quiz")
                    .setContentText("Your score is : "+ numberOfCorrectAnswer + "/" + questionModelArraylist.size())
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            currentPosition = 0;
                            numberOfCorrectAnswer = 0;
                            progressBar.setProgress(0);
                            setData();
                        }
                    })
                    .setCancelText("Close")
                    .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            finish();
                        }
                    })
                    .show();

        }

    }

}
