package com.example.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMAGES = "extra_images";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        ImageView IvImgReceived = findViewById(R.id.Iv_imgReceived);
        TextView tvNameReceived = findViewById(R.id.tv_nameReceived);
        TextView tvDetailReceived = findViewById(R.id.tv_detailReceived);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int img = getIntent().getIntExtra(EXTRA_IMAGES, 1);

        tvNameReceived.setText(name);
        tvDetailReceived.setText(detail);
        IvImgReceived.setImageResource(img);
    }
}