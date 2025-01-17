package com.example.buttonnavigationbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ánh xạ BottomNavigationView
        BottomNavigationView navigationView = findViewById(R.id.navigation_bottom);

        // Thiết lập sự kiện cho BottomNavigationView
        navigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.action_home:
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.action_favorite:
                    Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.action_user:
                    Toast.makeText(MainActivity.this, "User", Toast.LENGTH_SHORT).show();
                    return true;

                default:
                    return false;
            }
        });
    }
}
