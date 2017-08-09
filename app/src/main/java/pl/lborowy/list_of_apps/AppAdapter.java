package pl.lborowy.list_of_apps;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RENT on 2017-08-09.
 */

public class AppAdapter {

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
