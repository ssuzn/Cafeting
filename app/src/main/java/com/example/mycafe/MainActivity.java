package com.example.mycafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView instructionTextView = findViewById(R.id.instructionTextView);

        // 각 태그 버튼에 클릭 리스너 추가
        String[] tags = {"공부하기 좋은", "사진 찍기 좋은", "수다떨기 좋은", "맛있는 디저트", "특이한 메뉴", "매장이 넓은", "동물이 있는", "기타"};

        GridLayout tagsGridLayout = findViewById(R.id.tagsGridLayout);

        for (String tag: tags) {
            Button button = new Button(this);
            button.setText(tag);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onTagButtonClick(tag);
                }
            });
            tagsGridLayout.addView(button);
        }
    }

    private void onTagButtonClick(String tag) {
        // 선택한 태그에 대한 동작 수행 (원하는 액티비티로 이동 또는 처리)
        Toast.makeText(this, "선택한 태그: " + tag, Toast.LENGTH_SHORT).show();
    }
}