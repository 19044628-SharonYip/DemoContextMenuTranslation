package sg.edu.rp.c346.id19044628.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedtext;
    TextView tvTranslatedtext2;
    String wordClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedtext=findViewById(R.id.textViewTranslatedText);
        tvTranslatedtext2=findViewById(R.id.textViewTranslatedText2);

        registerForContextMenu(tvTranslatedtext);
        registerForContextMenu(tvTranslatedtext2);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0, "English");
        menu.add(0,1,1,"Italian");

        if (v==tvTranslatedtext)
        {
            wordClicked="hello";
        }
        else if(v==tvTranslatedtext2)
        {
            wordClicked="bye";
        }
    }

    public boolean onContextItemSelected(MenuItem item) {

        if(wordClicked.equalsIgnoreCase("hello")){
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedtext.setText("Hello");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1)
            {
                //Toast.makeText(MainActivity.this,"Italian is chosen", Toast.LENGTH_SHORT).show();

                tvTranslatedtext.setText("Ciao");
                return true;
            }
        }
        else if(wordClicked.equalsIgnoreCase("bye"))
        {
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedtext2.setText("Byeee");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1)
            {
                //Toast.makeText(MainActivity.this,"Italian is chosen", Toast.LENGTH_SHORT).show();

                tvTranslatedtext2.setText("Addio");
                return true;
            }
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }

}