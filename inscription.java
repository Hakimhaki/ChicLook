package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ecoutClick();
    }
    private void init() {

        button= (Button)findViewById(R.id.button);
    }

    private void ecoutClick(){
       button.setOnClickListener((View.OnClickListener)this);
    }
    @Override

        public void onClick(View  view){

        switch (view.getId()){
            case R.id.button:{
                navigateToActivity(inscription.class);
                break;}

            default:break;
        }
    }
   public  void navigateToActivity(Class nextClass){
        Intent intent;
        intent = new Intent(MainActivity.this,nextClass);
        startActivity(intent);
        finish();
}




}



