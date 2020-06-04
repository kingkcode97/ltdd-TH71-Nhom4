package com.FourFashionShop.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.FourFashionShop.R;

import org.w3c.dom.Text;

public class Mall_Product_Activity extends AppCompatActivity {

    private TextView tvTitle, tvPrice, txSoLuong;
    private ImageView img;
    private ImageButton imgBtnAdd, imgBtnRemove;
    private Button btSizeS, btSizeM, btSizeL, btSizeXL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall_product);

        tvTitle = (TextView) findViewById(R.id.text_Title_Item);
        tvPrice = (TextView) findViewById(R.id.text_Price_Item);
        img = (ImageView) findViewById(R.id.img_item_id);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Price = intent.getExtras().getString("Price");
        int image = intent.getExtras().getInt("Thumbnail");

        tvTitle.setText(Title);
        tvPrice.setText(Price);
        img.setImageResource(image);

        setBtSoLuongCLick();
        setBtSizeCLick();
    }

    public void setBtSizeCLick() {
        btSizeS = (Button) findViewById(R.id.sizeS);
        btSizeM = (Button) findViewById(R.id.sizeM);
        btSizeL = (Button) findViewById(R.id.sizeL);
        btSizeXL = (Button) findViewById(R.id.sizeXL);

        btSizeS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btSizeS.setBackgroundResource(R.color.pink_200);
                btSizeS.setBackgroundResource(R.drawable.button);
            }
        });
    }

    public void setBtSoLuongCLick() {
        imgBtnAdd = (ImageButton) findViewById(R.id.imgBtnAdd);
        imgBtnRemove = (ImageButton) findViewById(R.id.imgBtnRemove);
        txSoLuong = (TextView) findViewById(R.id.txtSoLuong);

        imgBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int soLuong = Integer.parseInt(txSoLuong.getText().toString()) + 1;
                txSoLuong.setText(String.valueOf(soLuong));
            }
        });
        imgBtnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soLuong = Integer.parseInt(txSoLuong.getText().toString());
                if (soLuong > 1)
                    soLuong = soLuong -1;
                txSoLuong.setText(String.valueOf(soLuong));
            }
        });
    }
}
