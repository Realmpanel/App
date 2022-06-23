package realmpanel.co.ke.AccountActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import realmpanel.co.ke.Nav.Home;
import realmpanel.co.ke.R;

public class LoginActivity extends AppCompatActivity {

    private Button setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setup = (Button) findViewById(R.id.btn_login);
        setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, OTPVerification.class));
            }
        });
    }
}