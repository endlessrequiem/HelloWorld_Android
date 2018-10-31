package app.sample.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import static app.sample.helloworld.R.*;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        mTextView = findViewById(id.text1);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener((View view) -> {
            String hw = "Hello World";
            TextView output = mTextView;
            output.setText(hw);
        });

    }
}