package peak.campingbuddy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public Button firebut;

    public void init() {
        firebut = (Button) findViewById(R.id.firebut);
        firebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage = new Intent(MainActivity.this, firepage.class);
                startActivity(nextpage);
            }
        });


    }

    public Button foodbut;

    public void init2() {
        foodbut = (Button) findViewById(R.id.foodbut);
        foodbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage2 = new Intent(MainActivity.this, foodpage.class);
                startActivity(nextpage2);
            }
        });


    }

    public Button tentbut;

    public void init3() {
        tentbut = (Button) findViewById(R.id.tentbut);
        tentbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage3 = new Intent(MainActivity.this, tentpage.class);
                startActivity(nextpage3);
            }
        });


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        init();
        init2();
        init3();

    }
}
