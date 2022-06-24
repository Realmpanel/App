package realmpanel.co.ke.Clients;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import realmpanel.co.ke.AccountActivity.AccountSetup;
import realmpanel.co.ke.R;
import realmpanel.co.ke.Startup.SplashActivity;

public class Clients extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                View contextView = findViewById(android.R.id.content);

                Snackbar snackbar = Snackbar.make(contextView, " ✔  {Client Name} documentation is successfully added", Snackbar.LENGTH_LONG);
                View sbView = snackbar.getView();
                sbView.setBackgroundColor(Color.rgb(57,255,20));
                snackbar.show();
                TextView textView = (TextView) sbView.findViewById(com.google.android.material.R.id.snackbar_text);
                textView.setMaxLines(100);
                textView.setGravity(View.TEXT_ALIGNMENT_CENTER);
            }
        }, SPLASH_TIME_OUT);



    }
}