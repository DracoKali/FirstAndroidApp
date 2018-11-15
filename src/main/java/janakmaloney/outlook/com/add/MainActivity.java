package janakmaloney.outlook.com.add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNum = findViewById(R.id.firstNum);
                EditText SecondNum = findViewById(R.id.secondNum);
                TextView ResultView = findViewById(R.id.Result);

                int num1 = Integer.parseInt(FirstNum.getText().toString());
                int num2 = Integer.parseInt(SecondNum.getText().toString());
                int result = num1 + num2;
                ResultView.setText(result + " ");
            }
        });
    }
}
