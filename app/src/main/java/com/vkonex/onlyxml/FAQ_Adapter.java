package com.vkonex.onlyxml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FAQ_Adapter extends RecyclerView.Adapter<FAQ_Adapter.ViewHolder> {
    List<FAQ> FAQList;

    public FAQ_Adapter(List<FAQ> FAQList) {
        this.FAQList = FAQList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  FAQ_Adapter.ViewHolder holder, int position) {

        FAQ faq=FAQList.get(position);
        holder.que.setText(faq.getQue());
        holder.description.setText(faq.getDescription());
        boolean isExpandable = FAQList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE:View.GONE);
    }

    @Override
    public int getItemCount() {
        return FAQList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView que,description;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            que=itemView.findViewById(R.id.que);
            description=itemView.findViewById(R.id.description);
            linearLayout=itemView.findViewById(R.id.linear_layout);
            expandableLayout=itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FAQ faq= FAQList.get(getAdapterPosition());
                    faq.setExpandable(!faq.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
