package ir.meteornetwork;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    private Context context;

    public PostsAdapter(Context c) {
        context = c;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_view, parent, false);
        return new ViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.username.setText("user of " + position);
        holder.post_text.setText("post of " + position);
        holder.profile_image.setImageResource(R.drawable.like2_btn);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView username, post_text;
        public ImageView like_img, comment_img, post_image, more_img;
        public CircleImageView profile_image;
        public int like_flag = 0;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.username);
            post_text = itemView.findViewById(R.id.post_text);
            like_img = itemView.findViewById(R.id.like_img);
            comment_img = itemView.findViewById(R.id.comment_img);
            profile_image = itemView.findViewById(R.id.profile_image);
            post_image = itemView.findViewById(R.id.post_image);
            more_img = itemView.findViewById(R.id.more_img);


            like_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (like_flag == 0) {
                        like_img.setImageResource(R.drawable.like2_btn);
                        like_flag = 1;
                    } else {
                        like_img.setImageResource(R.drawable.like_btn);
                        like_flag = 0;
                    }
                }
            });

            comment_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            more_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popupMenu = new PopupMenu(context, more_img);
                    popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.edit_post:

                                    break;
                                case R.id.delete_post:

                                    break;


                            }
                            return true;
                        }
                    });
                    popupMenu.show();
                }
            });


        }
    }

}
