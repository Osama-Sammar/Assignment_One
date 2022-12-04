package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.assignment_one.model.CompanyInfo;

import java.util.ArrayList;
import java.util.List;

public class CompanyActivity extends AppCompatActivity {
    private ListView lst;
    private Button btnForCompanies;
    private List<CompanyInfo> dataForCompanies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        btnForCompanies = findViewById(R.id.btnShowForCompanies);
        lst = findViewById(R.id.lstItems);

        btnForCompanies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataForCompanies = new ArrayList<CompanyInfo>();
                dataForCompanies.add(new CompanyInfo("Asal Company", "Rawabi", "Front End Developer"));
                dataForCompanies.add(new CompanyInfo("Exalt Company", "Nablus", "Back End Developer"));
                dataForCompanies.add(new CompanyInfo("Foothill", "Ramallah", "Quality Assurance"));
                dataForCompanies.add(new CompanyInfo("Freightos ", "Jenin", "Devops"));
                dataForCompanies.add(new CompanyInfo("Hi Tech ", "Hebron", "Team Leader"));
                dataForCompanies.add(new CompanyInfo("ProGineer ", "Ramallah",
                        "Android Developer Using Flutter "));
                dataForCompanies.add(new CompanyInfo("Bisan ", "Ramallah", "Web Developer"));
                dataForCompanies.add(new CompanyInfo("Dimensions ", "Ramallah", "Internal Communication Officer"));
                dataForCompanies.add(new CompanyInfo("Inotech ", "Ramallah",
                        "System Test Engineer"));
                dataForCompanies.add(new CompanyInfo("ITG Company ", "Ramallah",
                        "Design Verification Engineer"));


                ArrayAdapter<CompanyInfo> adapterItems = new ArrayAdapter<CompanyInfo>(CompanyActivity.this,
                        android.R.layout.simple_list_item_1, dataForCompanies);

                lst.setAdapter(adapterItems);



            }
        });

//        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                if(position == 0){
////                    Toast.makeText(CompanyActivity.this, "This is Asal Company",
////                            Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(CompanyActivity.this, AsalActivity.class));
//                }
//            }
//        });



    }
}