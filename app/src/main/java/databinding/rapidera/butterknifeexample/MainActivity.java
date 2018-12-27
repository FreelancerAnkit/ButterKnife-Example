package databinding.rapidera.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editText)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button,R.id.button2})
    public void onButtonClick(Button button) {
        Toast.makeText(getApplicationContext(), "Hey "+button.getId() ,
                Toast.LENGTH_SHORT).show();
        (button).setText(editText.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
