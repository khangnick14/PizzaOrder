package rmit.ad.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button logInButton = findViewById(R.id.logInBtn);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("0987654321")
                && password.getText().toString().equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                    intent.putExtra("welcome", "Welcome to PIZZA FACTORY!");
                    startActivity(intent);
                } else {
                    password.getText().clear();
                    Toast.makeText(MainActivity.this,"Invalid username or password. Please try again!",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}