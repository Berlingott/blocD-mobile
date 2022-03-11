package uqac.dim.travail_bloc_d;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewSite = (TextView) findViewById(R.id.textViewSite);
        TextView textViewMarque = (TextView) findViewById(R.id.textViewMarque);
        textViewMarque.setText("Veuillez faire un choix.");
        textViewSite.setText("Veuillez faire un choix.");
    }


    public void mafagactivity(View view) {
        String marque = null, website = null;

        Intent intent = new Intent(this, MafagactivityActivity.class);




    }

}