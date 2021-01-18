package com.sourishgupta.sourishsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView projectsRecyclerView = findViewById(R.id.recycler_view_projects);

        Project[] projectList = {
                new Project("getting Started App", "hello world app", R.drawable.getting_started),
                new Project("BMI Calculator", "App to calculate BMI of a person", R.drawable.calculator),
                new Project("Inches Converter", "App to convert inches to meter", R.drawable.tape),
                new Project("To DO App", "A simple TO-DO app", R.drawable.ic_launcher_background),
                new Project("The Hungry Developer", "A restaurant ordering app", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projectList);

        projectsRecyclerView.setAdapter(adapter);

    }
}