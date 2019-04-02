package com.example.kalkulyator;

import android.app.Activity;
import android.app.PendingIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    long n=0;
    int q=0;
    boolean d = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.textView);


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);

        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);


        if(tv.getText().length()<=11)
        {

            button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = (String) tv.getText();
                if (!tv.getText().equals("0") && s.charAt(s.length() - 1) != '/')
                    tv.setText(tv.getText() + "0");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
             if(tv.getText()=="")
                 tv.setText("0.");
                String s = (String) tv.getText();
                boolean a = false;

                for (int i = 0; i < s.length(); i++)
                    if (s.charAt(i) == '.') {
                        a = true;
                        break;
                    }
                if (!a && s.length() <= 15)
                    tv.setText(tv.getText() + ".");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }

                if (tv.getText() != "0" && tv.getText().length() <= 11)
                    tv.setText(tv.getText() + "00");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(q == 1)
                    tv.setText(n-Long.parseLong(tv.getText().toString())+"");

                if(q == 2)
                    tv.setText(n+Long.parseLong(tv.getText().toString())+"");

                if(q == 3)
                    tv.setText(n*Long.parseLong(tv.getText().toString())+"");
                if(q == 4)
                    tv.setText(1.0*n/Long.parseLong(tv.getText().toString())+"");
                d = false;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }

                if (!tv.getText().equals("0"))
                    tv.setText(tv.getText() + "1");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals("0"))
                    tv.setText(tv.getText() + "2");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals("0"))
                    tv.setText(tv.getText() + "3");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals("0"))
                    tv.setText(tv.getText() + "4");

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }

                if (!tv.getText().equals("0"))
                    tv.setText(tv.getText() + "5");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals("0") )
                    tv.setText(tv.getText()+"6");
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals(""))
                    tv.setText(tv.getText() + "7");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals("0") )
                    tv.setText(tv.getText() + "8");

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!d)
                {
                    tv.setText("");
                    d = true;
                }
                if (!tv.getText().equals("0") )
                    tv.setText(tv.getText() + "9");

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n = Long.parseLong(tv.getText().toString());
                tv.setText("");
                q = 2;
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n = Long.parseLong(tv.getText().toString());
                tv.setText("");

                q = 3;
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n = Long.parseLong(tv.getText().toString());
                tv.setText("");

                q = 4;
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = Long.parseLong(tv.getText().toString());
                tv.setText("");

                q = 1;
            }
        });
    }
        else
        {
            Toast.makeText(getApplicationContext(),"12 xonali sondan katta sonni kiritib bo'lmaydi",Toast.LENGTH_LONG).show();
        }

    }
}
