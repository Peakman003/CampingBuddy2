package peak.campingbuddy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firepage extends AppCompatActivity {

    public Button fireexbut;

    public void init(){
        fireexbut = (Button) findViewById(R.id.fireexbut);
        fireexbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage = new Intent(firepage.this,fireex.class);
                startActivity(nextpage);
            }
        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firepage);
        getSupportActionBar().hide();
        init();
    }
}
