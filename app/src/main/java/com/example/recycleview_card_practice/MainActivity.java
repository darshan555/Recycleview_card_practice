package com.example.recycleview_card_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecView;
    myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecView = findViewById(R.id.recView);

//        myRecView.setLayoutManager(new LinearLayoutManager(this));

        /*LinearLayoutManager layout = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        myRecView.setLayoutManager(layout);*/

        GridLayoutManager layout = new GridLayoutManager(this,2);
        myRecView.setLayoutManager(layout);
        adapter = new myAdapter(dataqueue(),getApplicationContext());
        myRecView.setAdapter(adapter);


    }

    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder = new ArrayList<Model>();

        Model obj1 = new Model();
        obj1.setTitle("Adobe");
        obj1.setTechDescription("Editing");
        obj1.setImage(R.drawable.adobe);
        holder.add(obj1);
        Model obj2 = new Model();
        obj2.setTitle("Php");
        obj2.setTechDescription("Web Site Programming");
        obj2.setImage(R.drawable.php);
        holder.add(obj2);
        Model obj3 = new Model();
        obj3.setTitle("Fiver");
        obj3.setTechDescription("For freelancing");
        obj3.setImage(R.drawable.fiver);
        holder.add(obj3);
        Model obj4 = new Model();
        obj4.setTitle("Angular js");
        obj4.setTechDescription("Web Programming");
        obj4.setImage(R.drawable.angularjs);
        holder.add(obj4);
        Model obj5 = new Model();
        obj5.setTitle("Html");
        obj5.setTechDescription("Web Programming");
        obj5.setImage(R.drawable.html);
        holder.add(obj5);
        Model obj6 = new Model();
        obj6.setTitle("Yahoo");
        obj6.setTechDescription("Browser");
        obj6.setImage(R.drawable.yahoo);
        holder.add(obj6);
        Model obj7 = new Model();
        obj7.setTitle("Nodejs");
        obj7.setTechDescription("Backend Technology");
        obj7.setImage(R.drawable.nodejs);
        holder.add(obj7);
        Model obj8 = new Model();
        obj8.setTitle("Magento");
        obj8.setTechDescription("Web Technology");
        obj8.setImage(R.drawable.magento);
        holder.add(obj8);
        Model obj9 = new Model();
        obj9.setTitle("Stack Overflow");
        obj9.setTechDescription("For query solution");
        obj9.setImage(R.drawable.stackoverflow);
        holder.add(obj9);

        return holder;
    }


}