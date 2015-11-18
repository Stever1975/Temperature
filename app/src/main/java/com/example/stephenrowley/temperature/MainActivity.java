package com.example.stephenrowley.temperature;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private EditText editText;
    private TextView textView2;
    private Button btnF;
    private Button btnC;

    private EditText txtEntry;
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnF = (Button)findViewById(R.id.btnF);
        txtEntry = (EditText)findViewById(R.id.editText);
         txtView = (TextView)findViewById(R.id.textView2);

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "So it begins", Toast.LENGTH_LONG).show();
            }
        });


        Button btnC = (Button)findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "So C", Toast.LENGTH_LONG).show();
                String editTextVal = txtEntry.getText().toString();


                double dblEditText = Double.parseDouble(editTextVal);


                //String editTextVal = editText.getText().toString();
                // put the returned value into a variable so we can use it (make things organized)
                double convertedVal = convertC(dblEditText);

                //use the String.valueOf() method to convert our double value into it's corresponding string format so we can out put it

                String stringResult = String.valueOf(convertedVal);

                txtView.setText(stringResult + " C ");
// [°C] = ([°F] − 32) × 5⁄9 --> From Fahrenheit to celsius

                // [°F] = [°C] × 9⁄5 + 32  --> From Celsius to Fahrenheit

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public double convertF(double temp){

        return temp;
    }

    public double convertC(double temp){

        return temp;
    }

}
