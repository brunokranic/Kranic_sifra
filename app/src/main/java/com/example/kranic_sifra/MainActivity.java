package com.example.kranic_sifra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

    public class MainActivity extends AppCompatActivity {

        //TextView tv1 = (TextView)findViewById(R.id.textView);
        String s_broj,t_broj = "34762";
        char[] broj;

        int i=0;






        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            TextView tv1 = (TextView) findViewById(R.id.textView3);
            TextView tv2 = (TextView) findViewById(R.id.textView4);
            Button button1 = (Button) findViewById(R.id.button1);
            Button button2 = (Button) findViewById(R.id.button2);
            Button button3 = (Button) findViewById(R.id.button3);
            Button button4 = (Button) findViewById(R.id.button4);
            Button button5 = (Button) findViewById(R.id.button5);
            Button button6 = (Button) findViewById(R.id.button6);
            Button button7 = (Button) findViewById(R.id.button7);
            Button button8 = (Button) findViewById(R.id.button8);
            Button button9 = (Button) findViewById(R.id.button9);
            Button button10 = (Button) findViewById(R.id.button10);
            Button clear_button = (Button) findViewById(R.id.clear_button);


            Button check_button = (Button) findViewById(R.id.check_button);
            check_button.setText("Check");
            Intent intent = new Intent(this, MainActivity2.class);
            button1.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <= 5)
                    {
                        ++i;
                        if (s_broj != null) s_broj += '1';
                        else
                        {
                            s_broj = "1";
                        }
                        tv1.setText(s_broj);
                    }
                }
            });



            button2.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        ++i;
                        if (s_broj != null )s_broj += '2';
                        else{ s_broj = "2";}
                        tv1.setText(s_broj);
                    }




                }
            });


            button3.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '3';
                        else{ s_broj = "3";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button4.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '4';
                        else{ s_broj = "4";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button5.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '5';
                        else{ s_broj = "5";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button6.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '6';
                        else{ s_broj = "6";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button7.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '7';
                        else{ s_broj = "7";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button8.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '8';
                        else{ s_broj = "8";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button9.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '9';
                        else{ s_broj = "9";}
                        tv1.setText(s_broj);
                    }

                }
            });


            button10.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (i <=5)
                    {
                        i++;
                        if (s_broj != null )s_broj += '0';
                        else{ s_broj = "0";}
                        tv1.setText(s_broj);
                    }

                }
            });

            check_button.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {

                    if (Objects.equals(s_broj, t_broj))
                    {
                        startActivity(intent);
                    }
                    else
                    {
                        tv2.setText("Netocna lozinka!");
                    }
                }
            });
            clear_button.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    tv1.setText("");
                    s_broj = "";
                    i=0;
                }



            });
        }



    }

