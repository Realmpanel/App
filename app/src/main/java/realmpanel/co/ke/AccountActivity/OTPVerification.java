package realmpanel.co.ke.AccountActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import realmpanel.co.ke.Nav.Home;
import realmpanel.co.ke.R;

public class OTPVerification extends AppCompatActivity {

    private Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        verify = (Button) findViewById(R.id.btn_verify);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OTPVerification.this, Home.class));
            }
        });
    }
}