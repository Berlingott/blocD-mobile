package uqac.dim.travail_bloc_d;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final int CODEMARQUE = 1; //REQUEST CODE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewSite = findViewById(R.id.textViewSite);
        TextView textViewMarque = findViewById(R.id.textViewMarque);
        textViewMarque.setText("Veuillez faire un choix.");
        textViewSite.setText("Veuillez faire un choix.");
    }


    public void mafagactivity(View view) {

        Intent intent = new Intent(this, MafagactivityActivity.class);
        startActivityForResult(intent,CODEMARQUE);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CODEMARQUE) {
            if (resultCode == RESULT_OK) {
                TextView textViewMarque = findViewById(R.id.textViewMarque);
                textViewMarque.setText(data.getStringExtra("marque"));
                TextView textViewSite = findViewById(R.id.textViewSite);
                textViewSite.setText(data.getStringExtra("website"));
                site = data.getStringExtra("website");
            }
        }
    }
    static String site;
    public void openLink(View v){
        Uri webpage = Uri.parse(site);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}