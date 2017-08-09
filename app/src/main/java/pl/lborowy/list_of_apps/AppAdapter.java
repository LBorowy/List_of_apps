package pl.lborowy.list_of_apps;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import lombok.AllArgsConstructor;

/**
 * Created by RENT on 2017-08-09.
 */

@AllArgsConstructor
public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {

    private final ArrayList<AppInfo> appInfos;

    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // tworzenie nowego View dla ViewHolder'a
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_row, null);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AppViewHolder holder, int position) {
        // dostajemy liste rzeczy
        AppInfo appInfo = appInfos.get(position);
        holder.name.setText(appInfo.getName());
        holder.icon.setImageDrawable(appInfo.getIcon());
    }

    @Override
    public int getItemCount() {
        return appInfos.size();
    }

    static class AppViewHolder extends RecyclerView.ViewHolder {

        // referencja do pól - POLE
        ImageView icon;
        TextView name;

        public AppViewHolder(View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.row_imageView);
            name = (TextView) itemView.findViewById(R.id.row_textView);
        }
    }
}
