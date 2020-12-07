package com.example.navtutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

        nav=(NavigationView)findViewById(R.id.nav_menu);
        DrawerLayout drawer=findViewById(R.id.drawer);

       toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
       drawerLayout.addDrawerListener(toggle);
       toggle.syncState();

      nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {


              switch (menuitem.getItemId()){

                  case R.id.menuhome :
                      Intent intent=new Intent(MainActivity.this,home.class);
                      startActivity(intent);
                      drawerLayout.closeDrawer(GravityCompat.START);

                  case R.id.menuadd :
                      Intent intent2=new Intent(MainActivity.this,add.class);
                      startActivity(intent2);
                      drawerLayout.closeDrawer(GravityCompat.START);

                  case R.id.menuSlide :
                      Intent intent3=new Intent(MainActivity.this,Slide.class);
                      startActivity(intent3);
                      drawerLayout.closeDrawer(GravityCompat.START);

              }

              return true;
          }
      });


    }


}