package demo.dankim.com.mvvmrecyclerviewwithdatabind.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import demo.dankim.com.mvvmrecyclerviewwithdatabind.databinding.NewsBinding;
import demo.dankim.com.mvvmrecyclerviewwithdatabind.viewmodels.NewsModel;

/**
 * Created by Dan Kim on 2019-01-18
 */
public class NewsRecyclerViewAdapter extends RecyclerView.Adapter<NewsRecyclerViewAdapter.ItemViewHolder> {

    private List<NewsModel> newsList;
    private LayoutInflater layoutInflater;

    public NewsRecyclerViewAdapter(List<NewsModel> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, viewGroup, false);
        return new ItemViewHolder(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int position) {

        NewsModel newsModel = newsList.get(position);
        itemViewHolder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return this.newsList == null ? 0 : this.newsList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        //After rebuilding , NewsBinding class is presented. Compiler generates
        // NewsBinding is defined in item_layout.xml
        private NewsBinding newsBinding;

        public ItemViewHolder(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding = newsBinding;
        }

        public void bind(NewsModel newsModel) {
            // setNewsModel was created by compiler
            this.newsBinding.setNewsModel(newsModel);
        }

        public NewsBinding getNewsBinding() {
            return this.newsBinding;
        }
    }
}
