package a1.labs.kelayn.lab1.utils;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import a1.labs.kelayn.lab1.utils.Stringify;
import a1.labs.kelayn.lab1.R;

public class RecyclerAdapter extends
        RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private List<String> textList;
    private Stringify stringify = new Stringify();
    public RecyclerAdapter(List<String> list){
        this.textList = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_view, viewGroup, false);
        return new RecyclerViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int i) {
        int number = i+1;
        holder.text.setText(stringify.getNumberOrdinal(number));
        int backgroundColor = ContextCompat.getColor(holder.itemView.getContext(),
                number % 2 == 0 ? R.color.gray : R.color.white);
        holder.layout.setBackgroundColor(backgroundColor);

    }

    @Override
    public int getItemCount() {
        return textList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView pic;
        TextView text;
        ConstraintLayout layout;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.imageView2);
            text = itemView.findViewById(R.id.textView);
            layout = itemView.findViewById(R.id.supermind);

        }
    }
}
