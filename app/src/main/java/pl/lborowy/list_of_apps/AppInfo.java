package pl.lborowy.list_of_apps;

import android.graphics.drawable.Drawable;

import lombok.Data;


/**
 * Created by RENT on 2017-08-09.
 */

@Data
public class AppInfo {
    // klasa AppInfo - reprezentacja aplikacji
    private final int uid;
    private final String name;
    private final Drawable icon;
}
