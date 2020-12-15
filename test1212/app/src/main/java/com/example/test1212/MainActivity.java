package com.example.test1212;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView sushe;
    String[] chenyan={"ypc","liyamg"};
 @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     sushe = findViewById(R.id.sushe);
     ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.ypc, chenyan);
     sushe.setAdapter(arrayAdapter);
     sushe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(MainActivity.this, "fsd", Toast.LENGTH_SHORT).show();
         }
     });
 }
 public class Fruit{
     String name;
     int imageId;
     public Fruit(String name,int imageId){
         this.name=name;
         this.imageId=imageId;
     }
     public  String getName(){
         return  name;
     }
     public int getImageId(){
         return imageId;
     }
 }
 //public  class FruitAdapter extends ArrayAdapter<Fruit>{

// }
        }
class FruitAdapter extends ArrayAdapter<MainActivity.Fruit>{
int resourceId;
    public FruitAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        resourceId=resource;
}
}





