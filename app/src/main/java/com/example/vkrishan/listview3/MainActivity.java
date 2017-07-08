package com.example.vkrishan.listview3;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    // Views
    ListView lv;
    Context mContext;

    // Data
    int[] ImageId = {R.drawable.ic_launcher1, R.drawable.ic_launcher2, R.drawable.ic_launcher3, R.drawable.ic_launcher4, R.drawable.ic_launcher5, R.drawable.ic_launcher6};
    String[] rowTexts = {"Its Image1","Its Image2","Its Image3","Its Image4","Its Image5","Its Image6"};

    ArrayList<String> rowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        lv = (ListView) findViewById(R.id.listView);

        // Now we need to call the Adapter and inflate the xml through it.




    }
}
