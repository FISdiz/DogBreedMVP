package cl.puntogestion.dogapi.view;

import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import cl.puntogestion.dogapi.R;

public class DogPhotoRecycleViewAdapter extends RecyclerView.Adapter<DogPhotoRecycleViewAdapter.ViewHolderImages> {


    @NonNull
    @Override
    public ViewHolderImages onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderImages holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderImages extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTextView;
        public final Image mImage;

        public ViewHolderImages(@NonNull View view) {
            super(view);
            mView = View;
            mTextView = (TextView)itemView.findViewById(R.id.nombreRazaDetalle);
            mImage = (Image) itemView.findViewById(R.id.imagenPerrito);
        }
    }


        }

    }
}
