package peak.campingbuddy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tentpage extends AppCompatActivity {

    public Button exbuttent;

    public void init(){
        exbuttent = (Button) findViewById(R.id.tentexbut);
        exbuttent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage = new Intent(tentpage.this,tentex.class);
                startActivity(nextpage);
            }
        });

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentpage);
        getSupportActionBar().hide();
        init();




    }
}
