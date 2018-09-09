package ub.poros.divisimobile.poinkeaktifan.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ub.poros.divisimobile.poinkeaktifan.Model.model;
import ub.poros.divisimobile.poinkeaktifan.R;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    private List<model> modelList;

    public RecyclerviewAdapter(List<model> modelList) {
        this.modelList = modelList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        model model = modelList.get(position);
        holder.nama.setText(model.getNama());
        holder.divisi.setText(model.getDivisi());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nama, divisi;

        public ViewHolder(View itemView) {
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nameList);
            divisi = (TextView) itemView.findViewById(R.id.divisiList);
        }
    }

}
