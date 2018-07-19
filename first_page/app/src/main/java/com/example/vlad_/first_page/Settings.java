package com.example.vlad_.first_page;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.VideoView;

public class Settings extends AppCompatActivity {

    private String[] WaysOfWork = {"Фоновая работа", "Оффлайн работа"};
    private String[] WaysToRecordCall = {"Всегда записывать звонок", "Запись только для выбранных контактов"};
    private String[] DaysBeforeDelete = {"1 день", "3 дня","неделя","2 недели"};
    private String[] SelectContacts = {"Vasya", "Petya","Kolya","Alina"};
    Button Btn1;
    VideoView VW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        Btn1 = (Button) findViewById(R.id.Btn1);
        VW = (VideoView) findViewById(R.id.VW);

        ArrayAdapter<String> WaysOfWorkAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, WaysOfWork);

        WaysOfWorkAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item );

        Spinner WaysOfWork = (Spinner) findViewById(R.id.spinner);

        WaysOfWork.setAdapter(WaysOfWorkAdapter);

        WaysOfWork.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        ArrayAdapter<String> WaysToRecordCallAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, WaysToRecordCall);

        WaysToRecordCallAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item );

        Spinner WaysToRecordCall = (Spinner) findViewById(R.id.spinner1); //if (position==1){WaysToRecordCall.setEnabled(false)};

        WaysToRecordCall.setAdapter(WaysToRecordCallAdapter);

        WaysToRecordCall.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





        ArrayAdapter<String> DaysBeforeDeleteAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, DaysBeforeDelete);

        DaysBeforeDeleteAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item );

        Spinner DaysBeforeDelete = (Spinner) findViewById(R.id.spinner2);

        DaysBeforeDelete.setAdapter(DaysBeforeDeleteAdapter);

        DaysBeforeDelete.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        ArrayAdapter<String> SelectContactsAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, SelectContacts);

        SelectContactsAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item );

        Spinner SelectContacts = (Spinner) findViewById(R.id.spinner3);

        SelectContacts.setAdapter(SelectContactsAdapter);

        SelectContacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    /*public void videoplay(View v){
        String videopath= "android.resource://com.example.vlad_.sino.Sino/"+R.raw.video1;
        Uri Uri = android.net.Uri.parse(videopath);
        VW.setVideoURI(Uri);
        VW.setMediaController(mediaC);
        mediaC.setAnchorView(VW);
        VW.start();
    }*/     //запуск видео
    }

}
