package elzhanov.planets_info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    CustomAdapter listAdapter;
    private List<Planets> planets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                createIntent(i,PlanetsActivity.class);
            }
        });
    }

    private void ui() {
        lv = (ListView) findViewById(R.id.lv);
        listAdapter = new CustomAdapter(loadData());
        lv.setAdapter(listAdapter);
    }

    private void createIntent(int i, Class<?> cls) {
        Intent intent = new Intent(getApplicationContext(), cls);
        intent.putExtra("name",planets.get(i).getName());
        intent.putExtra("photo",planets.get(i).getPhoto());
        intent.putExtra("info", planets.get(i).getInfo());
        startActivity(intent);
    }

    private List<Planets> loadData() {
        planets.add(new Planets(R.drawable.mercury,"MERCURY",getString(R.string.mercury_info)));
        planets.add(new Planets(R.drawable.venus_img,"VENUS",getString(R.string.venus_info)));
        planets.add(new Planets(R.drawable.earth_img,"EARTH",getString(R.string.earth_info)));
        planets.add(new Planets(R.drawable.mars_img,"MARS",getString(R.string.mars_info)));
        planets.add(new Planets(R.drawable.jupiter_img,"JUPITER",getString(R.string.jupiter_info)));
        planets.add(new Planets(R.drawable.saturn,"SATURN",getString(R.string.saturn_info)));
        planets.add(new Planets(R.drawable.uranus,"URANUS", getString(R.string.uranus_info)));
        planets.add(new Planets(R.drawable.neptune,"NEPTUNE", getString(R.string.neptune_info)));
        planets.add(new Planets(R.drawable.pluto,"PLUTO", getString(R.string.pluto_info)));
        return planets;
    }
}
