package com.example.vlad_.sino.Sino;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.util.ArrayList;

public class first_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        /*public ArrayList<File> listFilesWithSubFolders(File dir){
            ArrayList<File> files = new ArrayList<File>();
            for (File file : getCacheDir().listFiles()){
                if (file.isDirectory())
                    files.addAll(listFilesWithSubFolders(file));
                else
                    files.add(file);
            }
            return files;
        }*/

        File rootFolder = Environment.getExternalStorageDirectory();
        File[] filesArray = rootFolder.listFiles();
        System.out.println("Файлов: " + filesArray.length);
        for (File f: filesArray){
            if (f.isDirectory()) System.out.println("Folder " + f);
            else if (f.isFile()) System.out.println("File " + f);
        }
    }
}
