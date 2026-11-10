package com.orderaccept.assistant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isServiceRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWhatsAppLogin = findViewById(R.id.btnWhatsAppLogin);
        Button btnDaily = findViewById(R.id.btnDaily);
        Button btnWeekly = findViewById(R.id.btnWeekly);
        Button btnMonthly = findViewById(R.id.btnMonthly);
        
        EditText etMinDistance = findViewById(R.id.etMinDistance);
        EditText etMinFare = findViewById(R.id.etMinFare);
        Button btnToggleService = findViewById(R.id.btnToggleService);

        // WhatsApp Login Click Listener
        btnWhatsAppLogin.setOnClickListener(v -> {
            String url = "https://wa.me/?text=Hello,%20I%20want%20to%20login%20to%20Order%20Accept%20Assistant";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        // Subscription Buttons
        btnDaily.setOnClickListener(v -> Toast.makeText(this, "Selected Daily Plan ($1)", Toast.LENGTH_SHORT).show());
        btnWeekly.setOnClickListener(v -> Toast.makeText(this, "Selected Weekly Plan ($5)", Toast.LENGTH_SHORT).show());
        btnMonthly.setOnClickListener(v -> Toast.makeText(this, "Selected Monthly Plan ($15)", Toast.LENGTH_SHORT).show());

        // Master Service Toggle
        btnToggleService.setOnClickListener(v -> {
            isServiceRunning = !isServiceRunning;
            if (isServiceRunning) {
                String dist = etMinDistance.getText().toString();
                String fare = etMinFare.getText().toString();
                btnToggleService.setText("Stop Auto Accept Service");
                Toast.makeText(this, "Service Started! Filters: >" + dist + "km, >$" + fare, Toast.LENGTH_LONG).show();
            } else {
                btnToggleService.setText("Start Auto Accept Service");
                Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
            }
        });
    }
                       }
                                            
