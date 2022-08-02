package kr.hs.emirim.s2102.mirim_project_0802_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;
    int[] posterId = {R.drawable.mv1, R.drawable.mv2, R.drawable.mv3, R.drawable.mv4,
                        R.drawable.mv5, R.drawable.mv6, R.drawable.mv7, R.drawable.mv8,
                        R.drawable.mv9, R.drawable.mv10};
    String[] posterTitle = {"타이타닉", "노트북", "세렌디피티", "유령신부", "빅피쉬",
                            "이터널 선샤인", "로미오와 줄리엣", "보헤미안랩소디",
                            "Knockin' On Heaven's Door", "노인을 위한 나라는 없다"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgv = findViewById(R.id.imgv);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, posterTitle);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(posterId[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}