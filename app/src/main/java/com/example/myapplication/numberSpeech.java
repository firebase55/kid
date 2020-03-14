package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class numberSpeech extends AppCompatActivity {
    private TextToSpeech textToSpeech;
    private int resut;
    //private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_speech);

        textToSpeech = new TextToSpeech(numberSpeech.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    resut = textToSpeech.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    public void tts(View view) {
        switch (view.getId()) {
            case R.id.speechid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("one", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
        case R.id.bid:
        if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
            Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

        } else {
            textToSpeech.speak("Two", TextToSpeech.QUEUE_FLUSH, null);
        }
        break;
            case R.id.cid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("Three", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.did:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("four", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.eid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("five", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.fid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("six", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.gid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("seven", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.hid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("eight", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.iid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("nine", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.jid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("ten", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.kid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("eleven", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.lid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("twelve", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.mid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("thirteen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.nid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("fourteen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.oid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("fifteen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.pid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("sixteen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.qid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("seventeen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.rid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("eighteen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.sid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("nineteen", TextToSpeech.QUEUE_FLUSH, null);
                }break;
            case R.id.tid:
                if (resut == TextToSpeech.LANG_MISSING_DATA || resut == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(numberSpeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("Twenty", TextToSpeech.QUEUE_FLUSH, null);
                }break;
    }
}
    }

