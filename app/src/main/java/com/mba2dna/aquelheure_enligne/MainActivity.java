package com.mba2dna.aquelheure_enligne;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.mba2dna.aquelheure_enligne.model.Gare;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;


public class MainActivity extends ActionBarActivity {
    private static final int BUTTON_ICON_INTRINSIC_HEIGHT = 40;
    private static final int BUTTON_ICON_INTRINSIC_PADDING = 5;
    private static final int BUTTON_ICON_INTRINSIC_WIDTH = 40;
    static final int DATE_DIALOG_ID = 0;
    private static final String INDEX_ARRIVEE = "Arrivee";
    private static final String INDEX_DEPRAT = "Depart";
    private ActionBar actionBar;
    private AlertDialog alertDialog;
    private Button btnSearch;
    private Button btnSetDate;
    private AutoCompleteTextView gareArrive;
    private AutoCompleteTextView gareDepart;
    private int jAnnee;
    private int jJour;
    private int jMois;
    private android.app.DatePickerDialog.OnDateSetListener pDateSetListener;
    private SharedPreferences preferences;
    private TextView textViewDate;
    private View viewLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(false);*/
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
      //  savedInstanceState = preferences.getString("Depart", "");
        String s = preferences.getString("Arrivee", "");
        viewLogo = findViewById(R.id.viewLogo);
        gareDepart = (AutoCompleteTextView)findViewById(R.id.gareDepart);
        gareArrive = (AutoCompleteTextView)findViewById(R.id.gareArrivee);
        gareDepart.setAdapter(new ArrayAdapter(this, R.layout.sherlock_spinner_dropdown_item, Gare.GARES));
        gareArrive.setAdapter(new ArrayAdapter(this, R.layout.sherlock_spinner_dropdown_item, Gare.GARES));
       // gareDepart.setText(bundle);
        gareArrive.setText(s);
        textViewDate = (TextView)findViewById(R.id.textViewDateJour);
       // bundle = Calendar.getInstance();
       // jAnnee = bundle.get(1);
      //  jMois = bundle.get(2);
       // jJour = bundle.get(5);
        btnSearch = (Button)findViewById(R.id.btnSearch);
       /* btnSearch.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                int i = getGareIndex(gareDepart.getText().toString());
                int j = getGareIndex(gareArrive.getText().toString());
                if (i == -1 || j == -1)
                {
                    showErrorDialog("Gare non trouv\351 !");
                    return;
                }
                if (i == j)
                {
                    showErrorDialog("Meme Lieu !!!");
                    return;
                }
                String s1 = Gare.GARES_IDS[i];
                String s2 = Gare.GARES_IDS[j];
                Object obj = String.valueOf(jAnnee);
                view = ((View) (obj));
                if (jMois < 10)
                {
                    view = (new StringBuilder(String.valueOf(obj))).append("0").toString();
                }
                obj = (new StringBuilder(String.valueOf(view))).append(String.valueOf(jMois)).toString();
                view = ((View) (obj));
                if (jJour < 10)
                {
                    view = (new StringBuilder(String.valueOf(obj))).append("0").toString();
                }
                view = (new StringBuilder(String.valueOf(view))).append(String.valueOf(jJour)).toString();
                obj = preferences.edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("Depart", gareDepart.getText().toString());
                ((android.content.SharedPreferences.Editor) (obj)).putString("Arrivee", gareArrive.getText().toString());
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                obj = new Intent(MainActivity.this, ResultsActivity.class);
                ((Intent) (obj)).putExtra("depart", s1);
                ((Intent) (obj)).putExtra("arrivee", s2);
                ((Intent) (obj)).putExtra("date", view);
                startActivity(((Intent) (obj)));
            }


            {
                this$0 = MainActivity.this;

            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    private int getGareIndex(String s)
    {
        return Arrays.asList(Gare.GARES).indexOf(s.toUpperCase(Locale.FRANCE));
    }
    private void showErrorDialog(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(0x7f0a000e).setMessage(s).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {

            final MainActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                alertDialog.dismiss();
            }


            {
                this$0 = MainActivity.this;

            }
        });
        alertDialog = builder.create();
        alertDialog.show();
    }
    private void updateDisplay()
    {
        textViewDate.setText((new StringBuilder()).append(jMois + 1).append("/").append(jJour).append("/").append(jAnnee).append(" "));
    }
   /* private void updateUIIcons()
    {
        IconicFontDrawable iconicfontdrawable = new IconicFontDrawable(this);
        iconicfontdrawable.setIcon(FontAwesomeIcon.SEARCH);
        iconicfontdrawable.setIconColor(-1);
        iconicfontdrawable.setIntrinsicWidth(40);
        iconicfontdrawable.setIntrinsicHeight(40);
        iconicfontdrawable.setIconPadding(5);
        btnSearch.setCompoundDrawablesWithIntrinsicBounds(iconicfontdrawable, null, null, null);
        iconicfontdrawable = new IconicFontDrawable(this);
        iconicfontdrawable.setIcon(FontAwesomeIcon.CALENDAR);
        iconicfontdrawable.setIconColor(-1);
        iconicfontdrawable.setIntrinsicWidth(32);
        iconicfontdrawable.setIntrinsicHeight(32);
        iconicfontdrawable.setIconPadding(5);
        btnSetDate.setCompoundDrawablesWithIntrinsicBounds(iconicfontdrawable, null, null, null);
        iconicfontdrawable = new IconicFontDrawable(this);
        iconicfontdrawable.setIcon(FontAwesomeIcon.TIME);
        iconicfontdrawable.setIconColor(-1);
        iconicfontdrawable.setIconPadding(5);
        viewLogo.setBackgroundDrawable(iconicfontdrawable);
    }*/
    private void showAbout()
    {
        startActivity(new Intent(this, AboutActivity.class));
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
}
