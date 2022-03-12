package uqac.dim.travail_bloc_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MafagactivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mafag_activity);

    }

    public void facebookSelected(View view) {
        Intent data = new Intent();
        data.putExtra("marque","facebook");
        data.putExtra("website","https://facebook.com");

        // data.putExtra("site","https://apple.ca");
        setResult(RESULT_OK,data);
        finish();
    }
    public void windowsSelected(View view) {
        Intent data = new Intent();
        data.putExtra("marque","microsoft");
        data.putExtra("website","https://www.microsoft.com");

        // data.putExtra("site","https://apple.ca");
        setResult(RESULT_OK,data);
        finish();

    }
    public void appleSelected(View view) {
        Intent data = new Intent();
        data.putExtra("marque","apple");
        data.putExtra("website","https://www.apple.com");

        // data.putExtra("site","https://apple.ca");
        setResult(RESULT_OK,data);
        finish();

    }
    public void amazonSelected(View view) {
        Intent data = new Intent();
        data.putExtra("marque","amazon");
        data.putExtra("website","https://www.amazon.com");

        // data.putExtra("site","https://apple.ca");
        setResult(RESULT_OK,data);
        finish();

    }
    public void googleSelected(View view) {
        Intent data = new Intent();
        data.putExtra("marque","google");
        data.putExtra("website","https://www.google.com");

        // data.putExtra("site","https://apple.ca");
        setResult(RESULT_OK,data);
        finish();

    }
}