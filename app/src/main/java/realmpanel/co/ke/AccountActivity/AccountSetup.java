package realmpanel.co.ke.AccountActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import realmpanel.co.ke.R;

public class AccountSetup extends AppCompatActivity {

    private Button setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setup);

        setup = (Button) findViewById(R.id.btn_setup);
        setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountSetup.this, LoginActivity.class));
            }
        });
    }
}