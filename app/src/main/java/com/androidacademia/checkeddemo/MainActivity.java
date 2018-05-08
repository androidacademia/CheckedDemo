package com.androidacademia.checkeddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkHS,chkG,chkPG,chkPD;
    private RadioGroup radioGroup;
    private RadioButton rdMale,rdFemale;
    private ToggleButton toggleButton;
    private Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkG = findViewById(R.id.checkBoxG);
        chkHS = findViewById(R.id.checkBoxHS);
        chkPD = findViewById(R.id.checkBoxPD);
        chkPG = findViewById(R.id.checkBoxPG);
        radioGroup = findViewById(R.id.radioGroup);
        rdFemale = findViewById(R.id.radioButtonFemale);
        rdMale = findViewById(R.id.radioButtonMale);
        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch1);

        chkPD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "PD is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkPG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Post Grad is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkHS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "High School is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Grad. is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonMale:
                        if (rdMale.isChecked()){
                            Toast.makeText(MainActivity.this, "Male is Checked", Toast.LENGTH_SHORT).show();

                        }
                        break;
                    case R.id.radioButtonFemale:
                        if (rdFemale.isChecked())
                            Toast.makeText(MainActivity.this, "Female  is Checked", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Toggle  is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Switch  is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}











