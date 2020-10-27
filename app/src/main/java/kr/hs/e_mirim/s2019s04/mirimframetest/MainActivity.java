package kr.hs.e_mirim.s2019s04.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearKim, linearOh, linearPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearKim = findViewById(R.id.linear_kim);
        linearOh = findViewById(R.id.linear_oh);
        linearPark = findViewById(R.id.linear_park);

        Button btnKim = findViewById(R.id.btn_kim);
        Button btnOh = findViewById(R.id.btn_oh);
        Button btnPark = findViewById(R.id.btn_park);

        btnKim.setOnClickListener(btnListener);
        btnOh.setOnClickListener(btnListener);
        btnPark.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearKim.setVisibility(View.INVISIBLE);
            linearOh.setVisibility(View.INVISIBLE);
            linearPark.setVisibility(View.INVISIBLE);

            switch(v.getId()) {
                case R.id.btn_kim:
                    linearKim.setVisibility(View.VISIBLE);
                    break;

                case R.id.btn_oh:
                    linearOh.setVisibility(View.VISIBLE);
                    break;

                case R.id.btn_park:
                    linearPark.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}