package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class AbsListItemAdapterDelegate<I extends T, T, VH extends RecyclerView.ViewHolder> extends AdapterDelegate<List<T>> {
    protected abstract boolean isForViewType(T t, List<T> list, int i);

    protected abstract void onBindViewHolder(I i, VH vh, List<Object> list);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public abstract VH onCreateViewHolder(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public /* bridge */ /* synthetic */ boolean isForViewType(Object obj, int i) {
        return isForViewType((List) ((List) obj), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        onBindViewHolder((List) ((List) obj), i, viewHolder, (List<Object>) list);
    }

    protected final boolean isForViewType(List<T> list, int i) {
        return isForViewType(list.get(i), list, i);
    }

    protected final void onBindViewHolder(List<T> list, int i, RecyclerView.ViewHolder viewHolder, List<Object> list2) {
        onBindViewHolder(list.get(i), viewHolder, list2);
    }
}
