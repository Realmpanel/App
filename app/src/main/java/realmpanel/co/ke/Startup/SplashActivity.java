package realmpanel.co.ke.Startup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import realmpanel.co.ke.AccountActivity.AccountSetup;
import realmpanel.co.ke.AccountActivity.LoginActivity;
import realmpanel.co.ke.R;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 15000;
    private static int SPLASH_TIME_OUT2 = 7000;
    private static int SPLASH_TIME_OUT3 = 12000;
    Animation _translateAnimation, animFadein;
    ImageView imgfade;
    ImageView loading;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        relativeLayout=findViewById(R.id.revrev);
        relativeLayout.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashActivity.this, AccountSetup.class);
                startActivity(homeIntent);
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        }, SPLASH_TIME_OUT);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imgfade = (ImageView)findViewById(R.id.imaganim);
                animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                imgfade.setVisibility(View.VISIBLE);
                imgfade.startAnimation(animFadein);
                relativeLayout.setVisibility(View.VISIBLE);
            }
        }, SPLASH_TIME_OUT2);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

    }
}