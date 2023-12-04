package com.hannesdorfmann.adapterdelegates4;

import java.util.List;
/* loaded from: classes6.dex */
public class ListDelegationAdapter<T extends List<?>> extends AbsDelegationAdapter<T> {
    public ListDelegationAdapter() {
    }

    public ListDelegationAdapter(AdapterDelegatesManager<T> adapterDelegatesManager) {
        super(adapterDelegatesManager);
    }

    public ListDelegationAdapter(AdapterDelegate<T>... adapterDelegateArr) {
        super(adapterDelegateArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.items == 0) {
            return 0;
        }
        return ((List) this.items).size();
    }
}
