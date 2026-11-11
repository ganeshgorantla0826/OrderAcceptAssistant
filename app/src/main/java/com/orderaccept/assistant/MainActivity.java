package com.orderaccept.assistant;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLoginWhatsApp, btnSubscribe, btnStartService;
    private EditText etMaxDistance, etMinFare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginWhatsApp = findViewById(R.id.btnLoginWhatsApp);
        btnSubscribe = findViewById(R.id.btnSubscribe);
        btnStartService = findViewById(R.id.btnStartService);
        etMaxDistance = findViewById(R.id.etMaxDistance);
        etMinFare = findViewById(R.id.etMinFare);

        btnLoginWhatsApp.setOnClickListener(v -> 
            Toast.makeText(this, "WhatsApp Login Clicked", Toast.LENGTH_SHORT).show()
        );

        btnSubscribe.setOnClickListener(v -> 
            Toast.makeText(this, "Opening Subscription Plans...", Toast.LENGTH_SHORT).show()
        );

        btnStartService.setOnClickListener(v -> 
            Toast.makeText(this, "Order Accept Assistant Started", Toast.LENGTH_SHORT).show()
        );
    }
}
