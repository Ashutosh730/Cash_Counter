package com.example.cashcounter;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    private EditText twothou,fivehun,twohun,onehun,fifty,twenty,ten,five,two,one;
    private TextView res2000,res500,res200,res100,res50,res20,res10,res5,res2,res1,notes,total;
    private Button save;
    private  int count=0,grand=0;
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

        

    }

}