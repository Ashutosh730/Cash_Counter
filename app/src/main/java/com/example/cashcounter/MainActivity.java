package com.example.cashcounter;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.Watchable;

public class MainActivity extends AppCompatActivity{

    private EditText twothou,fivehun,twohun,onehun,fifty,twenty,ten,five,two,one;
    private TextView res2000,res500,res200,res100,res50,res20,res10,res5,res2,res1,notes,total;
    private Button cal;
    private static int count=0,grand=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twothou=findViewById(R.id.twothou);
        fivehun=findViewById(R.id.fivehun);
        twohun=findViewById(R.id.twohun);
        onehun=findViewById(R.id.onehun);
        fifty=findViewById(R.id.fifty);
        twenty=findViewById(R.id.twenty);
        ten=findViewById(R.id.ten);
        five=findViewById(R.id.five);
        two=findViewById(R.id.two);
        one=findViewById(R.id.one);

        res2000=findViewById(R.id.result2000);
        res500=findViewById(R.id.result500);
        res100=findViewById(R.id.result100);
        res50=findViewById(R.id.result50);
        res200=findViewById(R.id.result200);
        res20=findViewById(R.id.result20);
        res10=findViewById(R.id.result10);
        res5=findViewById(R.id.result5);
        res2=findViewById(R.id.result2);
        res1=findViewById(R.id.result1);

        twothou=findViewById(R.id.twothou);
        twothou=findViewById(R.id.twothou);

        notes=findViewById(R.id.notes);
        total=findViewById(R.id.total);

        cal=findViewById(R.id.cal);


        twothou.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res2000.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {



                try {

                    int value=Integer.parseInt(twothou.getText().toString());
                    res2000.setText(Integer.toString(2000*value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        fivehun.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res500.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(fivehun.getText().toString());
                    res500.setText(Integer.toString(500*value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        twohun.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res200.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(twohun.getText().toString());
                    res200.setText(Integer.toString(200*value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        onehun.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res100.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(onehun.getText().toString());
                    res100.setText(Integer.toString(100*value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        fifty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res50.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(twothou.getText().toString());
                    res50.setText(Integer.toString(50*value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        twenty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res20.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(twenty.getText().toString());
                    res20.setText(Integer.toString(20*value));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        ten.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res10.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(ten.getText().toString());
                    res10.setText(Integer.toString(10*value));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        five.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res5.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(five.getText().toString());
                    res5.setText(Integer.toString(5*value));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        two.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res2.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(two.getText().toString());
                    res2.setText(Integer.toString(2*value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        one.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res1.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {

                    int value=Integer.parseInt(one.getText().toString());
                    res1.setText(Integer.toString(value));


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });





        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                     count=Integer.parseInt(twothou.getText()+"")+Integer.parseInt(fivehun.getText()+"")+
                            Integer.parseInt(twohun.getText()+"")+Integer.parseInt(onehun.getText()+"")+
                            Integer.parseInt(fifty.getText()+"")+Integer.parseInt(twenty.getText()+"")+
                            Integer.parseInt(ten.getText()+"")+Integer.parseInt(five.getText()+"")+
                            Integer.parseInt(two.getText()+"")+Integer.parseInt(one.getText()+"");
                    Log.i("TAG", Integer.parseInt(twothou.getText()+"")+"onCreate: ");






                String s=Integer.toString(count);
                notes.setText(s);
            }
        });
    }

}
