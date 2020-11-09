package com.example.adega.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adega.R;
import com.example.adega.activity.Dialog.DialogUtils;
import com.example.adega.services.ProductService;

public class AddProductActivity extends AppCompatActivity {

    private EditText name;
    private EditText price;
    private Button finalize;
    private ProductService productService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        name = findViewById(R.id.product_input_name);
        price = findViewById(R.id.product_input_price);
        finalize = findViewById(R.id.product_button_finalize);

        addProductToList();
    }

    public void addProductToList() {
        productService = new ProductService();

        finalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(name.getText()) && !TextUtils.isEmpty(price.getText()) ) {
                    productService.addProduct(name.getText(), price.getText());
                } else {
                    DialogUtils.showErrorDialog(AddProductActivity.this);
                }
            }
        });
    }

}