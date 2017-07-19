package com.fisi.sushineandina.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.fisi.sushineandina.R;

/**
 * Created by Bryam Soto on 18/07/2017.
 */

public class ProfileActivity extends AppCompatActivity {


    private TextInputEditText edtName, edtLastName, edtDocument, edtPhone;
    private TextInputEditText edtAddress, edtCountry, edtCity, edtZip;
    private ImageView btn_edit_info, btn_edit_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        edtName = (TextInputEditText) findViewById(R.id.edt_name);
        edtLastName = (TextInputEditText) findViewById(R.id.edt_last_name);
        edtDocument = (TextInputEditText) findViewById(R.id.edt_document);
        edtPhone = (TextInputEditText) findViewById(R.id.edt_phone);

        edtAddress = (TextInputEditText) findViewById(R.id.edt_address);
        edtCountry = (TextInputEditText) findViewById(R.id.edt_country);
        edtCity = (TextInputEditText) findViewById(R.id.edt_city);
        edtZip = (TextInputEditText) findViewById(R.id.edt_zip);

        btn_edit_info = (ImageView) findViewById(R.id.btn_edit_info);
        btn_edit_address = (ImageView) findViewById(R.id.btn_edit_address);

        btn_edit_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activeText(edtName);
                activeText(edtLastName);
                activeText(edtDocument);
                activeText(edtPhone);
                edtName.requestFocus();
            }
        });

        btn_edit_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activeText(edtAddress);
                activeText(edtCountry);
                activeText(edtCity);
                activeText(edtZip);
            }
        });
    }

    private void activeText(TextInputEditText inputEditText) {
        inputEditText.setEnabled(true);
        inputEditText.setFocusable(true);
        inputEditText.setFocusableInTouchMode(true);
    }
}
