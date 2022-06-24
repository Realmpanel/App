package realmpanel.co.ke.Clients;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import realmpanel.co.ke.AccountActivity.AccountSetup;
import realmpanel.co.ke.AccountActivity.LoginActivity;
import realmpanel.co.ke.R;

public class ClientLeadOne extends AppCompatActivity {

    private Button BtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_lead_one);

        BtnNext = (Button) findViewById(R.id.btn_next);
        BtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClientLeadOne.this, ClientLeadTwo.class));
            }
        });
    }
}