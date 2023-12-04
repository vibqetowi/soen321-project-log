package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes6.dex */
public class AsyncListDifferDelegationAdapter<T> extends RecyclerView.Adapter {
    protected final AdapterDelegatesManager<List<T>> delegatesManager;
    protected final AsyncListDiffer<T> differ;

    public AsyncListDifferDelegationAdapter(DiffUtil.ItemCallback<T> itemCallback) {
        this(itemCallback, new AdapterDelegatesManager());
    }

    public AsyncListDifferDelegationAdapter(DiffUtil.ItemCallback<T> itemCallback, AdapterDelegatesManager<List<T>> adapterDelegatesManager) {
        if (itemCallback == null) {
            throw new NullPointerException("ItemCallback is null");
        }
        if (adapterDelegatesManager == null) {
            throw new NullPointerException("AdapterDelegatesManager is null");
        }
        this.differ = new AsyncListDiffer<>(this, itemCallback);
        this.delegatesManager = adapterDelegatesManager;
    }

    public AsyncListDifferDelegationAdapter(AsyncDifferConfig asyncDifferConfig, AdapterDelegatesManager<List<T>> adapterDelegatesManager) {
        if (asyncDifferConfig == null) {
            throw new NullPointerException("AsyncDifferConfig is null");
        }
        if (adapterDelegatesManager == null) {
            throw new NullPointerException("AdapterDelegatesManager is null");
        }
        this.differ = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.delegatesManager = adapterDelegatesManager;
    }

    public AsyncListDifferDelegationAdapter(DiffUtil.ItemCallback<T> itemCallback, AdapterDelegate<List<T>>... adapterDelegateArr) {
        if (itemCallback == null) {
            throw new NullPointerException("ItemCallback is null");
        }
        this.differ = new AsyncListDiffer<>(this, itemCallback);
        this.delegatesManager = new AdapterDelegatesManager<>(adapterDelegateArr);
    }

    public AsyncListDifferDelegationAdapter(AsyncDifferConfig asyncDifferConfig, AdapterDelegate<List<T>>... adapterDelegateArr) {
        if (asyncDifferConfig == null) {
            throw new NullPointerException("AsyncDifferConfig is null");
        }
        this.differ = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.delegatesManager = new AdapterDelegatesManager<>(adapterDelegateArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.delegatesManager.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.delegatesManager.onBindViewHolder(this.differ.getCurrentList(), i, viewHolder, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        this.delegatesManager.onBindViewHolder(this.differ.getCurrentList(), i, viewHolder, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.delegatesManager.getItemViewType(this.differ.getCurrentList(), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.delegatesManager.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.onViewDetachedFromWindow(viewHolder);
    }

    public List<T> getItems() {
        return this.differ.getCurrentList();
    }

    public void setItems(List<T> list) {
        this.differ.submitList(list);
    }

    public void setItems(List<T> list, Runnable runnable) {
        this.differ.submitList(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.getCurrentList().size();
    }
}
