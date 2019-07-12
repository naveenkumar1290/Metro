package planet_obcapp.com.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        LinearLayout ll_ViewMap=findViewById(R.id.ViewMap);
        LinearLayout ll_ViewRoute=findViewById(R.id.ViewRoute);
        LinearLayout ll_NearByMetro=findViewById(R.id.NearByMetro);
        LinearLayout ll_helpline=findViewById(R.id.helpline);

        ll_ViewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(DashboardActivity.this,FullscreenActivity.class);
                startActivity(i);
            }
        });

        ll_ViewRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        ll_NearByMetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
