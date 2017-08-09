package pl.lborowy.list_of_apps;

import android.graphics.drawable.Drawable;

/**
 * Created by RENT on 2017-08-09.
 */

public class AppInfo {
    // klasa AppInfo - reprezentacja aplikacji

    private int uid;
    private String name;
    private Drawable icon;

    public AppInfo(int uid, String name, Drawable icon) {
        this.uid = uid;
        this.name = name;
        this.icon = icon;
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public Drawable getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", icon=" + icon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppInfo appInfo = (AppInfo) o;

        if (uid != appInfo.uid) return false;
        if (!name.equals(appInfo.name)) return false;
        return icon.equals(appInfo.icon);

    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + name.hashCode();
        result = 31 * result + icon.hashCode();
        return result;
    }
}
