package theindianappbaker.example.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = (Button) findViewById(R.id.button1);
        assert b1 != null;
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.button2);
        assert b2 != null;
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.button3);
        assert b3 != null;
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.button4);
        assert b4 != null;
        b4.setOnClickListener(this);

        b5 = (Button) findViewById(R.id.button5);
        assert b5 != null;
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.button6);
        assert b6 != null;
        b6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button1:
                Toast.makeText(getBaseContext(), "This button will launch my Popular Movies", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(getBaseContext(), "This button will launch my Stock Hawk", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(getBaseContext(), "This button will launch my Build it Bigger", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(getBaseContext(), "This button will launch my Make your App Material", Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(getBaseContext(), "This button will launch my Go Ubiquitous", Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(getBaseContext(), "This button will launch my Capstone", Toast.LENGTH_LONG).show();
                break;



//        Toast t;
//        if(b1.isPressed()) t = Toast.makeText(getApplicationContext(), "This button will launch my Scores App",Toast.LENGTH_SHORT).show());
//        else if(b2.isPressed()) t = Toast.makeText(getApplicationContext(), "This button will launch my Library App", Toast.LENGTH_SHORT).show());
//        else if(b3.isPressed()) t = Toast.makeText(getApplicationContext(), "This button will launch my Built it Bigger App", Toast.LENGTH_SHORT).show());
//        else if(b4.isPressed()) t = Toast.makeText(getApplicationContext(), "This button will launch my Beacon Reader", Toast.LENGTH_SHORT).show());
//        else if(b5.isPressed()) t = Toast.makeText(getApplicationContext(), "This button will launch my Both90 App", Toast.LENGTH_SHORT).show());
        }
    }
}