package com.company.bijix.recycleview;

import android.content.Intent;
import android.icu.util.ULocale;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Book_Activity extends AppCompatActivity {

    private TextView tvTitle;
    private TextView tvDescription;
    private TextView tvCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvTitle = (TextView) findViewById(R.id.txtTitle);
        tvDescription = (TextView) findViewById(R.id.txtDescription);
        tvCategory = (TextView) findViewById(R.id.txtCategory);
        img = (ImageView) findViewById(R.id.book_icon);



        //menerima data yang dikirim Adapter
        //Intent intent = new Intent();

        Intent intent=this.getIntent();
        String link;
        if(intent !=null)
            link = intent.getStringExtra("link");

        String Title = intent.getExtras().getString("title");
        String Category = intent.getExtras().getString("category");
        String Description = intent.getExtras().getString("description");
        int image = intent.getExtras().getInt("icon");

        //setting values
        tvTitle.setText(Title);
        tvCategory.setText(Category);
        tvDescription.setText(Description);
        img.setImageResource(image);





    }
}
