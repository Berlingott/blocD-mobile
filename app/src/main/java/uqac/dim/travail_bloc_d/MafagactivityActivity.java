package uqac.dim.travail_bloc_d;

import androidx.appcompat.app.AppCompatActivity;

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

        finish();
    }
    public void windowsSelected(View view) {
        finish();
    }
    public void appleSelected(View view) {
        finish();
    }
    public void amazonSelected(View view) {
        finish();
    }
    public void googleSelected(View view) {
        finish();
    }
}