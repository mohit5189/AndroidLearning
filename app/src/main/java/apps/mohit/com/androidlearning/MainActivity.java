package apps.mohit.com.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import apps.mohit.com.androidlearning.adapters.HomeListAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private List<String> elements = new ArrayList<String>(
            Arrays.asList("Activities And Fragment","Architecture component","Intent & Intent FIlters","UI & navigation",
                    "Animations","Images and Graphics","Audio & video","Background Tasks","App data & files","User location",
                    "Touch","Camera","Connectivity"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView =(ListView) findViewById(R.id.homeList);
        listView.setAdapter(new HomeListAdapter(this,elements));

    }
}
