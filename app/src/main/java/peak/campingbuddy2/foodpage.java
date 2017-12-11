package peak.campingbuddy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodpage extends AppCompatActivity {
    public Button foodinfobutt;

    public void init(){
        foodinfobutt = (Button) findViewById(R.id.foodinfobutt);
        foodinfobutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage = new Intent(foodpage.this,foodex.class);
                startActivity(nextpage);

            }
        });



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodpage);
        getSupportActionBar().hide();
        init();
    }
}
