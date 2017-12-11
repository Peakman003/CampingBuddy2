package peak.campingbuddy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodex extends AppCompatActivity {
    public Button waterbutt,fruitbutt,meatbutt;

    public void init(){
        waterbutt = (Button) findViewById(R.id.waterbutt);
        waterbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage = new Intent(foodex.this,waterex.class);
                startActivity(nextpage);
            }
        });
    }

    public  void init2(){
        fruitbutt = (Button) findViewById(R.id.fruitbutt);
        fruitbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage2 = new Intent(foodex.this,fruitex.class);
                startActivity(nextpage2);
            }
        });
    }

    public void init3(){
        meatbutt = (Button) findViewById(R.id.meatbutt);
        meatbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage3 = new Intent(foodex.this,meatex.class);
                startActivity(nextpage3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodex);
        getSupportActionBar().hide();
        init();
        init2();
        init3();
    }
}
