package com.example.fariahuq.pocketaid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class CustomAdapterSymptoms extends RecyclerView.Adapter<CustomAdapterSymptoms.MyViewHolder> {

    private ArrayList<Aid> dataSet;
    private int[] rainbow;
    private String path;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        ImageView imageViewIcon;
        LinearLayout linear;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
            this.linear = (LinearLayout) itemView.findViewById(R.id.poopy);
        }

        public TextView getTextViewName() {
            return textViewName;
        }

        public ImageView getImageViewIcon(){
            return imageViewIcon;
        }

        public LinearLayout getCardView(){return linear;}
    }

    public CustomAdapterSymptoms(ViewGroup container)
    {
        this.rainbow =(container.getContext()).getResources().getIntArray(R.array.array);
        this.dataSet =  new MyDBHandler(container.getContext(),null,null,1).databasetostringaid();
        this.context = container.getContext();
        path = container.getContext().getDir("imageDir",Context.MODE_PRIVATE) + "/";
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cards_layout_symptoms, viewGroup, false);
        view.setOnClickListener(HolderOfSysmptoms.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int listPosition) {
        Log.d("Adapter", "Element " + listPosition + " set.");
        holder.getTextViewName().setText(dataSet.get(listPosition).getTitle());
        if(!(dataSet.get(listPosition).getImage().equals("null"))) {
            try {
                String path = "/data/user/0/com.example.fariahuq.pocketaid/app_imageDir" + "/" + dataSet.get(listPosition).getImage();
                //File file = new File("/data/user/0/com.example.fariahuq.pocketaid/app_imageDir/1.jpg");
                File file = new File(path);
                Log.i("Custom","/data/user/0/com.example.fariahuq.pocketaid/app_imageDir/"+dataSet.get(listPosition).getImage());
                Log.i("Custom",file.getAbsolutePath());
                Bitmap b = BitmapFactory.decodeStream(new FileInputStream(file));
                holder.getImageViewIcon().setImageBitmap(b);
            }
            catch (FileNotFoundException e)
            {
                holder.getImageViewIcon().setBackgroundResource(R.drawable.hi);
                e.printStackTrace();
                Log.i("Image","Ki hocche");
            }
        }
        else
            holder.getImageViewIcon().setBackgroundResource(R.drawable.hi);
        //holder.getImageViewIcon().setImageResource(dataSet.get(listPosition).getImage());
        int i = listPosition%(rainbow.length);
        holder.getCardView().setBackgroundColor(rainbow[i]);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}