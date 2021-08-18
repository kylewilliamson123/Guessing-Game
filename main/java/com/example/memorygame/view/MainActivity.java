package com.example.memorygame.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;


import com.example.memorygame.R;

import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8;


    Integer[] cardArray = {101, 102, 103, 104, 101, 102, 103, 104};
    int image101, image102, image103, image104;
    int firstCard, secondCard;
    String clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0;
    Button resetBtn;
    TextView txtScore;
    int flips = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);


        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);
        iv7 = (ImageView) findViewById(R.id.iv7);
        iv8 = (ImageView) findViewById(R.id.iv8);


        iv1.setTag("0");
        iv2.setTag("1");
        iv3.setTag("2");
        iv4.setTag("3");
        iv5.setTag("4");
        iv6.setTag("5");
        iv7.setTag("6");
        iv8.setTag("7");

        frontOfCardResources();
        Collections.shuffle(Arrays.asList(cardArray));


        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv1, theCard);
                flips++;
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv2, theCard);
                flips++;

            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv3, theCard);
                flips++;
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv4, theCard);
                flips++;
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv5, theCard);
                flips++;
            }
        });

        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv6, theCard);
                flips++;
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv7, theCard);
                flips++;
            }
        });

        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv8, theCard);
                flips++;
            }
        });
    }

    private void doStuff(ImageView iv, int card) {

        if (cardArray[card] == 101) {
            iv.setImageResource((image101));
        } else if (cardArray[card] == 102) {
            iv.setImageResource((image102));
        } else if (cardArray[card] == 103) {
            iv.setImageResource((image103));
        } else if (cardArray[card] == 104) {
            iv.setImageResource((image104));
}
            if (cardNumber == 1) {
                firstCard = cardArray[card];


                cardNumber = 2;
                clickedFirst = Integer.toString(card);
                iv.setEnabled(false);

            } else if (cardNumber == 2) {
                secondCard = cardArray[card];


                cardNumber = 1;
                clickedSecond = Integer.toString(card);

                iv1.setEnabled(false);
                iv2.setEnabled(false);
                iv3.setEnabled(false);
                iv4.setEnabled(false);
                iv5.setEnabled(false);
                iv6.setEnabled(false);
                iv7.setEnabled(false);
                iv8.setEnabled(false);

                Handler handler = new Handler();
                handler.postDelayed((new Runnable() {
                    @Override
                    public void run() {
                        calculate();
                    }
                }), 1000);

            }
        }

        private void calculate () {

            if (firstCard == secondCard) {
                if (clickedFirst.equals("0")) {
                    iv1.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("1")) {
                    iv2.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("2")) {
                    iv3.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("3")) {
                    iv4.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("4")) {
                    iv5.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("5")) {
                    iv6.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("6")) {
                    iv7.setVisibility(View.INVISIBLE);
                } else if (clickedFirst.equals("7")) {
                    iv8.setVisibility(View.INVISIBLE);
                }


                if (clickedSecond.equals("0")) {
                    iv1.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("1")) {
                    iv2.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("2")) {
                    iv3.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("3")) {
                    iv4.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("4")) {
                    iv5.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("5")) {
                    iv6.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("6")) {
                    iv7.setVisibility(View.INVISIBLE);
                } else if (clickedSecond.equals("7")) {
                    iv8.setVisibility(View.INVISIBLE);
                }
                playerPoints++;
                TextView scoreTxt = (TextView) findViewById(R.id.scoreTxt);
                scoreTxt.setText("Score: " + playerPoints);


            } else {
                iv1.setImageResource(R.drawable.cardbackimg);
                iv2.setImageResource(R.drawable.cardbackimg);
                iv3.setImageResource(R.drawable.cardbackimg);
                iv4.setImageResource(R.drawable.cardbackimg);
                iv5.setImageResource(R.drawable.cardbackimg);
                iv6.setImageResource(R.drawable.cardbackimg);
                iv7.setImageResource(R.drawable.cardbackimg);
                iv8.setImageResource(R.drawable.cardbackimg);


            }


            iv1.setEnabled(true);
            iv2.setEnabled(true);
            iv3.setEnabled(true);
            iv4.setEnabled(true);
            iv5.setEnabled(true);
            iv6.setEnabled(true);
            iv7.setEnabled(true);
            iv8.setEnabled(true);


        }

        public void resetBtn (View v){
            Collections.shuffle(Arrays.asList(cardArray));
            Button resetBtn = findViewById(R.id.resetBtn);
            resetBtn.setText("reset");
            iv1.setVisibility(View.VISIBLE);
            iv2.setVisibility(View.VISIBLE);
            iv3.setVisibility(View.VISIBLE);
            iv4.setVisibility(View.VISIBLE);
            iv5.setVisibility(View.VISIBLE);
            iv6.setVisibility(View.VISIBLE);
            iv7.setVisibility(View.VISIBLE);
            iv8.setVisibility(View.VISIBLE);
            playerPoints = 0;


            iv1.setImageResource(R.drawable.cardbackimg);
            iv2.setImageResource(R.drawable.cardbackimg);
            iv3.setImageResource(R.drawable.cardbackimg);
            iv4.setImageResource(R.drawable.cardbackimg);
            iv5.setImageResource(R.drawable.cardbackimg);
            iv6.setImageResource(R.drawable.cardbackimg);
            iv7.setImageResource(R.drawable.cardbackimg);
            iv8.setImageResource(R.drawable.cardbackimg);
        }

        private void frontOfCardResources () {
            image101 = R.drawable.orangeimg;
            image102 = R.drawable.pizzaimg;
            image103 = R.drawable.steakimg;
            image104 = R.drawable.watermelonimg;


        }
    }

