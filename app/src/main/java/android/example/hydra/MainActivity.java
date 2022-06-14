package android.example.hydra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
TextView textView;
ImageButton button;
ImageButton b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(ImageButton) findViewById(R.id.button2);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               activity2();
           }
       });
b2=(ImageButton) findViewById(R.id.button8);
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        activity3();
    }
});
    }

    private void activity3() {Intent cntent = new Intent(this,MainActivity3.class);
        startActivity(cntent);
    }

    private void activity2() {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }




}