package elzhanov.planets_info;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter{

    private List<Planets> planets;

    public CustomAdapter(List<Planets> planets) {
        this.planets = planets;
    }

    @Override
    public int getCount() {
        return planets.size();
    }

    @Override
    public Object getItem(int i) {
        return planets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView = view;
        if (rootView == null) rootView = View.inflate(viewGroup.getContext(), R.layout.list_item, null);

        TextView name = (TextView) rootView.findViewById(R.id.planet_name);
        name.setText(planets.get(i).getName());


        ImageView photo = (ImageView) rootView.findViewById(R.id.planet_photo);
        photo.setImageResource(planets.get(i).getPhoto());

        return rootView;
    }
}
