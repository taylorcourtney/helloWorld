package norfolk.pillo.com.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =  (EditText) findViewById(R.id.edittext);
        editText.setHint("hello");
        Button button  = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
//button is mine, Phil. Right Stephen?
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



    @Override
    public void onClick(View v)
    {
        if(editText.getText().toString().equals(editText.getHint()))
            Toast.makeText(this, "Good job", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Follow the hint you stupid!", Toast.LENGTH_SHORT).show();
    }
}

///Hi Phil
///Hi Taylor, how it life?
///It is very good wbu?