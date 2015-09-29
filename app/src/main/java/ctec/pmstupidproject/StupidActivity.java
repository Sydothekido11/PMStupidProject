package ctec.pmstupidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;


public class StupidActivity extends AppCompatActivity {

    private Button colorChangeButton;
    private RelativeLayout background;
    private TextView sillyWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid);

        colorChangeButton = (Button) findViewById(R.id.sillyButton);
        background = (RelativeLayout) findViewById(R.id.appBackground);
        sillyWords = (TextView) findViewById(R.id.sillyWords);

        setupListeners();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid, menu);
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

    private void changeColors()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

    }

    private void changeVisibility()
    {
        sillyWords.setVisibility(View.GONE);
        if(sillyWords.getVisibility() == View.GONE)
        {
            sillyWords.setVisibility(View.VISIBLE);

        }
      else
        {
            sillyWords.setVisibility(View.GONE);
        }
    }

    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View buttonView)
            {
                //This is where you put code that happens when you click a button.
                changeColors();
                changeVisibility();
            }


        });
    }

}
