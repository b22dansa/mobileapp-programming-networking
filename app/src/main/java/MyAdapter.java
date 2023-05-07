import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.Mountain;
import com.example.networking.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Mountain> MountainList;

    public MyAdapter(ArrayList<Mountain> mountainList) {
        MountainList = mountainList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Mountain Mount = this.MountainList.get(position);
        holder.ID.setText(Mount.getID());
        holder.Name.setText(Mount.getName());
        holder.Type.setText(Mount.getType());
        holder.Company.setText(Mount.getCompany());
        holder.Location.setText(Mount.getLocation());
        holder.Category.setText(Mount.getCategory());
        holder.Size.setText(Mount.getSize());
        holder.Cost.setText(Mount.getCost());

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView ID;

        private final TextView Name;

        private final TextView Type;

        private final TextView Company;

        private final TextView Location;

        private final TextView Category;

        private final TextView Size;

        private final TextView Cost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.ID = itemView.findViewById(R.id.ID);
            this.Name = itemView.findViewById(R.id.Name);
            this.Type = itemView.findViewById(R.id.Type);
            this.Company = itemView.findViewById(R.id.Company);
            this.Location = itemView.findViewById(R.id.Location);
            this.Category = itemView.findViewById(R.id.Category);
            this.Size = itemView.findViewById(R.id.Size);
            this.Cost = itemView.findViewById(R.id.Cost);
        }



    }
}
