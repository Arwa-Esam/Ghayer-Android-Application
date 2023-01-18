package com.example.ghayer_1;

import android.net.Uri;

public class item
{
    String  name;


    int image;

    Uri uri;
    public    item( int image, String name,Uri uri)
    {
        this.image=image ;
        this.name=name;
        this.uri=uri;
    }

}
