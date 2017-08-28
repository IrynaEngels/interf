package com.example.java.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Country country;
    TextView txtPopulation;
    TextView txtGdp;
    TextView txtArea;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = new Netherlands(20000, 35000, 600);

        txtPopulation = (TextView)findViewById(R.id.tv_population);
        txtGdp = (TextView)findViewById(R.id.tv_gdp);
        txtArea = (TextView)findViewById(R.id.tv_area);
        button = (Button) findViewById(R.id.button);

        txtPopulation.setText("population = " + country.getPopulation());
        txtGdp.setText("gdp = " + country.getGdp());
        txtArea.setText("area = " + country.getArea());

        button.setOnClickListener(this);
        txtPopulation.setOnClickListener(this);
        txtGdp.setOnClickListener(this);
        txtArea.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button: country = new Gonduras(70000, 15000, 750);
                break;
            case R.id.tv_population: txtPopulation.setText("population = " + country.changePopulation(country.getPopulation()));
                break;
            case R.id.tv_gdp: txtGdp.setText("gdp = " + country.changeGDP(country.getGdp()));
                break;
            case R.id.tv_area: txtArea.setText("area = " + country.changeArea(country.getArea()));
                break;

        }

    }
}
