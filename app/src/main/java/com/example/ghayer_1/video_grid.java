package com.example.ghayer_1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class video_grid extends AppCompatActivity {

    Button button;
    GridView gridView;
    ArrayList<item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_grid);

        list = new ArrayList<item>();

        list.add(new item(R.drawable.video_1, "video_1", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2Fvideoplayback%20(1).mp4?alt=media&token=9dcb87bc-97c1-4f51-9316-10bda364230b")));

        list.add(new item(R.drawable.video_2, "video_2", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2Fvideoplayback%20(1).mp4?alt=media&token=9dcb87bc-97c1-4f51-9316-10bda364230b")));
        list.add(new item(R.drawable.sound, "انا مش عارفني", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F20-%20%D8%A3%D9%86%D8%A7%20%D9%85%D8%B4%20%D8%B9%D8%A7%D8%B1%D9%81%D9%86%D9%8A%20!.m4a?alt=media&token=2d012d51-a241-4436-8d13-e0f3b215e970")));
        list.add(new item(R.drawable.sound, "صارع الانا والنحن", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F02-%20%D8%B5%D8%B1%D8%A7%D8%B9%20%D8%A7%D9%84%D8%A3%D9%86%D8%A7%20%D9%88%D8%A7%D9%84%D9%86%D8%AD%D9%86.m4a?alt=media&token=44772cc8-6595-416a-9f04-43fff080f102")));
        list.add(new item(R.drawable.sound, "حاجات", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F03-%205%20%D8%AD%D8%A7%D8%AC%D8%A7%D8%AA.m4a?alt=media&token=94f91fb9-8f0d-432e-bc1f-d8fc425a37d1")));
        list.add(new item(R.drawable.sound, "متخليهش يفسحوك", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F04-%20%D9%85%D8%AA%D8%AE%D9%84%D9%8A%D9%87%D9%85%D8%B4%20%D9%8A%D9%81%D8%B3%D8%AD%D9%88%D9%83%20%F0%9F%98%82.m4a?alt=media&token=c35b325e-a708-4b05-bf77-d5f256d8115c")));
        list.add(new item(R.drawable.sound, "صراع واجداني", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F06-%20%D8%B5%D8%B1%D8%A7%D8%B9%20%D9%88%D8%AC%D9%88%D8%AF%D9%8A.m4a?alt=media&token=f0239e28-5424-4624-9dde-4c0511eae26c")));
        list.add(new item(R.drawable.sound, "الرغوة", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F01-%20%D8%A7%D9%84%D8%B1%D8%BA%D9%88%D8%A9.m4a?alt=media&token=e635feb0-746c-4a0e-b8a2-701c7661a891")));


        gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(new gridadapter(this, list));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(video_grid.this, videoes.class);
                intent.putExtra("uri", String.valueOf(list.get(i).uri));
              startActivity(intent);

            }
        });





    }
}

class gridadapter extends ArrayAdapter<item> {

    ArrayList<item> list;
    Context context;

    gridadapter(Context context, ArrayList<item> arrayList) {
        super(context, 0, arrayList)
        ;
        this.context = context;
        list = new ArrayList<item>();

        list.add(new item(R.drawable.video_1, "video_1", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2Fvideoplayback%20(1).mp4?alt=media&token=9dcb87bc-97c1-4f51-9316-10bda364230b")));

        list.add(new item(R.drawable.video_2, "video_2", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2Fvideoplayback%20(1).mp4?alt=media&token=9dcb87bc-97c1-4f51-9316-10bda364230b")));
        list.add(new item(R.drawable.video_2, "انا مش عارفني", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F20-%20%D8%A3%D9%86%D8%A7%20%D9%85%D8%B4%20%D8%B9%D8%A7%D8%B1%D9%81%D9%86%D9%8A%20!.m4a?alt=media&token=2d012d51-a241-4436-8d13-e0f3b215e970")));
        list.add(new item(R.drawable.sound, "صارع الانا والنحن", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F02-%20%D8%B5%D8%B1%D8%A7%D8%B9%20%D8%A7%D9%84%D8%A3%D9%86%D8%A7%20%D9%88%D8%A7%D9%84%D9%86%D8%AD%D9%86.m4a?alt=media&token=44772cc8-6595-416a-9f04-43fff080f102")));
        list.add(new item(R.drawable.sound, "حاجات", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F03-%205%20%D8%AD%D8%A7%D8%AC%D8%A7%D8%AA.m4a?alt=media&token=94f91fb9-8f0d-432e-bc1f-d8fc425a37d1")));
        list.add(new item(R.drawable.sound, "متخليهش يفسحوك", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F04-%20%D9%85%D8%AA%D8%AE%D9%84%D9%8A%D9%87%D9%85%D8%B4%20%D9%8A%D9%81%D8%B3%D8%AD%D9%88%D9%83%20%F0%9F%98%82.m4a?alt=media&token=c35b325e-a708-4b05-bf77-d5f256d8115c")));
        list.add(new item(R.drawable.sound, "صراع واجداني", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F06-%20%D8%B5%D8%B1%D8%A7%D8%B9%20%D9%88%D8%AC%D9%88%D8%AF%D9%8A.m4a?alt=media&token=f0239e28-5424-4624-9dde-4c0511eae26c")));
        list.add(new item(R.drawable.sound, "الرغوة", Uri.parse("https://firebasestorage.googleapis.com/v0/b/ghayer-54ff9.appspot.com/o/Ghayer%2F01-%20%D8%A7%D9%84%D8%B1%D8%BA%D9%88%D8%A9.m4a?alt=media&token=e635feb0-746c-4a0e-b8a2-701c7661a891")));
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public item getItem(int poision) {
        return list.get(poision);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int poision, View view, ViewGroup viewGroup) {
        View row = LayoutInflater.from(getContext()).inflate(R.layout.grid_icone, null);
        ImageView imageView = row.findViewById(R.id.image);
        TextView text = row.findViewById(R.id.text);
        final item temp = list.get(poision);
        imageView.setImageResource(temp.image);
        text.setText(temp.name);
        return row;
    }
}