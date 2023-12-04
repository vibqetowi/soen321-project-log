package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class AbsDelegationAdapter<T> extends RecyclerView.Adapter {
    protected AdapterDelegatesManager<T> delegatesManager;
    protected T items;

    public AbsDelegationAdapter() {
        this(new AdapterDelegatesManager());
    }

    public AbsDelegationAdapter(AdapterDelegatesManager<T> adapterDelegatesManager) {
        if (adapterDelegatesManager == null) {
            throw new NullPointerException("AdapterDelegatesManager is null");
        }
        this.delegatesManager = adapterDelegatesManager;
    }

    public AbsDelegationAdapter(AdapterDelegate<T>... adapterDelegateArr) {
        this(new AdapterDelegatesManager(adapterDelegateArr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.delegatesManager.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.delegatesManager.onBindViewHolder(this.items, i, viewHolder, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        this.delegatesManager.onBindViewHolder(this.items, i, viewHolder, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.delegatesManager.getItemViewType(this.items, i);
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

    public T getItems() {
        return this.items;
    }

    public void setItems(T t) {
        this.items = t;
    }
}
