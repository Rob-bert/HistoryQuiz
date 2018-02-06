package com.example.android.historyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method to question 1.
     */
    public void questionOne() {
        RadioButton Question1 = (RadioButton) findViewById(R.id.dionizos);
        boolean correct1 = Question1.isChecked();
        if (correct1) {
            score++;
        }
    }

    /**
     * This method to question 2.
     */
    public void questionTwo() {
        RadioButton Question2 = (RadioButton) findViewById(R.id.mark);
        boolean correct2 = Question2.isChecked();
        if (correct2) {
            score++;
        }
    }

    /**
     * This method to question 3.
     */
    public void questionThree() {
        CheckBox gja = findViewById(R.id.gja);
        boolean Gja = gja.isChecked();
        CheckBox gpj = findViewById(R.id.gpj);
        boolean Gpj = gpj.isChecked();
        CheckBox gji = findViewById(R.id.gji);
        boolean Gji = gji.isChecked();
        CheckBox gjb = findViewById(R.id.gjb);
        boolean Gjb = gjb.isChecked();
        if (Gji && Gjb && !Gja && !Gpj) {
            score++;
        }
    }

    /**
     * This method to question 4.
     */
    public void questionFour() {
        RadioButton Question4 = (RadioButton) findViewById(R.id.excalibur);
        boolean correct4 = Question4.isChecked();
        if (correct4) {
            score++;
        }
    }

    /**
     * This method to question 5.
     */
    public void questionFive() {
        RadioButton Question5 = (RadioButton) findViewById(R.id.answer3);
        boolean correct5 = Question5.isChecked();
        if (correct5) {
            score++;
        }
    }

    /**
     * This method calculates the score
     */
    private void calculateScore() {
        score = 0;
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
    }

    /**
     * This method is when submit score button is clicked.
     */
    public void submitScore(View view) {
        calculateScore();
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String enterName = nameField.getText().toString();
        String text;
        text = enterName + " your score is " + score;
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    /**
     * This method is when the reset button is clicked.
     */
    public void reset(View view) {
        ((RadioGroup) findViewById(R.id.question1)).clearCheck();
        ((RadioGroup) findViewById(R.id.question2)).clearCheck();
        ((RadioGroup) findViewById(R.id.question3)).clearCheck();
        ((RadioGroup) findViewById(R.id.question4)).clearCheck();
        ((RadioGroup) findViewById(R.id.question5)).clearCheck();
    }
}
