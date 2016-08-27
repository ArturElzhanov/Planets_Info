package elzhanov.planets_info;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 26.08.2016.
 */
public class VenusActivity extends AppCompatActivity {
    TextView txt_1;
    ImageView img_1;
    TextView txt_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        txt_1 = (TextView)findViewById(R.id.textView);
        img_1 = (ImageView)findViewById(R.id.imageView);
        txt_2 = (TextView)findViewById(R.id.textView2);
        txt_2.setMovementMethod(new ScrollingMovementMethod());
        txt_1.setText(getIntent().getStringExtra("name"));
        img_1.setImageResource(getIntent().getIntExtra("photo",android.R.drawable.ic_delete));
        txt_2.setText(getIntent().getStringExtra("info"));
    }
}
