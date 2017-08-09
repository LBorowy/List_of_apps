package pl.lborowy.list_of_apps;

import android.graphics.drawable.Drawable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by RENT on 2017-08-09.
 */

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AppInfo {
    // klasa AppInfo - reprezentacja aplikacji
    private int uid;
    private String name;
    private Drawable icon;
}
