package com.ashish.profilelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private CircleImageView profileImage;
    private TextView nameTextView, locationTextView, designationTextView, bloodGroupTextView,
                    dobTextView, marriageTextView, genderTextView, occupationTextView,
                    mobileNumberTextView, emailTextView, educationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileImage = (CircleImageView) findViewById(R.id.profile);
        nameTextView = (TextView) findViewById(R.id.name);
        locationTextView = (TextView) findViewById(R.id.location);
        designationTextView = (TextView) findViewById(R.id.designation);
        bloodGroupTextView = (TextView) findViewById(R.id.blood_group);
        dobTextView = (TextView) findViewById(R.id.dob);
        marriageTextView = (TextView) findViewById(R.id.marriage);
        genderTextView = (TextView) findViewById(R.id.gender);
        occupationTextView = (TextView) findViewById(R.id.occupation);
        mobileNumberTextView = (TextView) findViewById(R.id.mobileNumber);
        emailTextView = (TextView) findViewById(R.id.email);
        educationTextView = (TextView) findViewById(R.id.education);

        profileImage.setImageDrawable(getResources().getDrawable(R.drawable.man));
        nameTextView.setText("Ashish Kumar");
        locationTextView.setText("New Delhi");
        designationTextView.setText("(Student)");
        bloodGroupTextView.setText("O+");
        dobTextView.setText("17/06/1996");
        marriageTextView.setText("Single");
        genderTextView.setText("Male");
        occupationTextView.setText("Student");
        mobileNumberTextView.setText("9899602986");
        emailTextView.setText("ashishkumar160@gmail.com");
        educationTextView.setText("B.Tech.");
    }
}
