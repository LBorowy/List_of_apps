package pl.lborowy.list_of_apps;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referencja do progressBar
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, LinearLayout.HORIZONTAL, true));

        // zbieram liste aplikacji
        PackageManager packageManager = getPackageManager();
        List<ApplicationInfo> apps = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        // pusta lista aplikacji
        List<AppInfo> appInfos = new ArrayList<>();
        // tworze nowy adapter
        // parsowanie
        for (ApplicationInfo applicationInfo : apps) {
            appInfos.add(new AppInfo(
                    applicationInfo.uid,
                    applicationInfo.loadLabel(packageManager).toString(),
                    applicationInfo.loadIcon(packageManager)
            ));
        }
        // dopiero nowy adapter
        AppAdapter appAdapter = new AppAdapter(appInfos);
        // wrzucenie do RecyclerView
        recyclerView.setAdapter(appAdapter);

        progressBar.setVisibility(View.GONE);
    }
}
