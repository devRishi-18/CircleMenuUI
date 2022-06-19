package com.example.circlemmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ramotion.circlemenu.CircleMenuView;


public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout= findViewById(R.id.constraint_layout);
        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener(){
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Toast.makeText(MainActivity.this, "onMenuOpenAnimationStart", Toast.LENGTH_SHORT).show();
                Log.d("D","onMenuOpenAnimationStart");
            }
            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Toast.makeText(MainActivity.this, "onMenuOpenAnimationEnd", Toast.LENGTH_SHORT).show();
                Log.d("D","onMenuOpenAnimationEnd");
            }
            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Toast.makeText(MainActivity.this, "onMenuCloseAnimationStart", Toast.LENGTH_SHORT).show();
                Log.d("D","onMenuCloseAnimationStart");
            }
            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Toast.makeText(MainActivity.this, "onMenuCloseAnimationEnd", Toast.LENGTH_SHORT).show();
                Log.d("D","onMenuCloseAnimationEnd");
            }
            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
//                Toast.makeText(MainActivity.this, "onButtonClickAnimationStart", Toast.LENGTH_SHORT).show();
                constraintLayout.setBackgroundColor(R.array.colors);
                Log.d("D","onButtonClickAnimationStart|index: "+index);
            }
            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
//                Toast.makeText(MainActivity.this, "onButtonClickAnimationEnd", Toast.LENGTH_SHORT).show();

                Log.d("D","onButtonClickAnimationEnd|index: "+index);
            }
            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int buttonIndex) {
//                Toast.makeText(MainActivity.this, "onButtonLongClick", Toast.LENGTH_SHORT).show();
                Log.d("D","onButtonLongClick|index: "+buttonIndex);
                return true;
            }
            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int buttonIndex) {
//                Toast.makeText(MainActivity.this, "onButtonLongClickAnimationStart", Toast.LENGTH_SHORT).show();
                Log.d("D","onButtonLongClickAnimationStart|index: "+buttonIndex);
            }
            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int buttonIndex) {
//                Toast.makeText(MainActivity.this, "onButtonLongClickAnimationEnd", Toast.LENGTH_SHORT).show();
                Log.d("D","onButtonLongClickAnimationEnd|index: "+buttonIndex);
            }
        });

        
    }
}