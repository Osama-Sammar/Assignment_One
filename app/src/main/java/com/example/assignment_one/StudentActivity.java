package com.example.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.assignment_one.model.StudentInfo;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {
    private ListView lst;
    private Button btnForStudents;
    private List<StudentInfo> dataForStudents;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        btnForStudents = findViewById(R.id.btnShowForStudents);
        lst = findViewById(R.id.lstItems);

        btnForStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataForStudents = new ArrayList<StudentInfo>();
                dataForStudents.add(new StudentInfo("Ali", "Computer Science"));
                dataForStudents.add(new StudentInfo("Amal", "Computer Engineering"));
                dataForStudents.add(new StudentInfo("Ahmed", "Accounting"));
                dataForStudents.add(new StudentInfo("Susan",  "Public Administration"));
                dataForStudents.add(new StudentInfo("Mahmoud",  "Math"));
                dataForStudents.add(new StudentInfo("Iyad", "Physics"));
                dataForStudents.add(new StudentInfo("Malak", "Computer Engineering"));
                dataForStudents.add(new StudentInfo("Saeed",  "Computer Science"));
                dataForStudents.add(new StudentInfo("Omar", "Accounting"));
                dataForStudents.add(new StudentInfo("Bahaa", "Marketing "));


                ArrayAdapter<StudentInfo> adapterItems = new ArrayAdapter<StudentInfo>(StudentActivity.this,
                        android.R.layout.simple_list_item_1, dataForStudents);

                lst.setAdapter(adapterItems);


            }
        });
    }
}