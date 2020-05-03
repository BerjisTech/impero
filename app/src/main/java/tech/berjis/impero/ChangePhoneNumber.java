package tech.berjis.impero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.core.view.Change;
import com.hbb20.CountryCodePicker;

public class ChangePhoneNumber extends AppCompatActivity {

    CountryCodePicker country_code_old, country_code_new;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_phone_number);

        country_code_old = findViewById(R.id.country_code_old);
        country_code_new = findViewById(R.id.country_code_new);
    }


    public void onCountryPickerClickOld(View view) {
        country_code_old.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                Toast.makeText(ChangePhoneNumber.this, "Alert : " + country_code_old.getSelectedCountryCodeWithPlus(), Toast.LENGTH_SHORT).show();
                String selected_country_code = country_code_old.getSelectedCountryCodeWithPlus();
            }
        });
    }
    public void onCountryPickerClickNew(View view) {
        country_code_new.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                Toast.makeText(ChangePhoneNumber.this, "Alert : " + country_code_new.getSelectedCountryCodeWithPlus(), Toast.LENGTH_SHORT).show();
                String selected_country_code = country_code_new.getSelectedCountryCodeWithPlus();
            }
        });
    }
}
