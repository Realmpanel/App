package realmpanel.co.ke.Nav;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import realmpanel.co.ke.R;
import realmpanel.co.ke.Tools.Help;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    Button btnNewVisit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Realm");
        toolbar.setSubtitle("Pannel");
        setSupportActionBar(toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // showing dot next to notifications label
//        navigationView.getMenu().getItem(0).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(1).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(2).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(3).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(4).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(5).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(6).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(7).setActionView(R.layout.menu_dot);
//        navigationView.getMenu().getItem(8).setActionView(R.layout.menu_dot);

    }

    public void onClick_Next(View view) {
        // custom dialog
        final Dialog dialog = new Dialog(Home.this);
        dialog.setContentView(R.layout.custompopupone);
        dialog.setCancelable(true);

        Button btnNewVisit = (Button) dialog.findViewById(R.id.btn_next);
        btnNewVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                // custom dialog
                final Dialog dialog = new Dialog(Home.this);
                dialog.setContentView(R.layout.custompopuptwo);
                dialog.setCancelable(true);

                Button btnNext = (Button) dialog.findViewById(R.id.btn_next_two);
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        dialog.show();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        //here is the main place where we need to work on.
        int id = item.getItemId();
        switch (id) {

            case R.id.nav_dash:
                break;

            case R.id.nav_clients:
                Intent b = new Intent(this, Help.class);
                startActivity(b);
                break;

            case R.id.nav_loans:
                Intent c = new Intent(this, Help.class);
                startActivity(c);
                break;

            case R.id.nav_leave:
                Intent d = new Intent(this, Help.class);
                startActivity(d);
                break;

            case R.id.nav_salary:
                Intent e = new Intent(this, Help.class);
                startActivity(e);
                break;

            case R.id.nav_imprest:
                Intent f = new Intent(this, Help.class);
                startActivity(f);
                break;

            case R.id.nav_settings:
                Intent g = new Intent(this, Help.class);
                startActivity(g);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}