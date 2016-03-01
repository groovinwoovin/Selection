package choochoohoo.selection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radio_group;
    private static RadioButton radio_button;
    private static Button button;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output();
    }

    public void output(){
        radio_group = (RadioGroup)findViewById(R.id.radioGroup);
        button = (Button)findViewById(R.id.button);
        output = (TextView)findViewById(R.id.Answer);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = radio_group.getCheckedRadioButtonId();
                        radio_button = (RadioButton)findViewById(selectedId);
                        output.setText(radio_button.getText().toString());
                    }
                }
        );
    }
}
