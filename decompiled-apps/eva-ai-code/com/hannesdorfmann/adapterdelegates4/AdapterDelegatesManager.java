package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public class AdapterDelegatesManager<T> {
    public static final int FALLBACK_DELEGATE_VIEW_TYPE = 2147483646;
    private static final List<Object> PAYLOADS_EMPTY_LIST = Collections.emptyList();
    protected SparseArrayCompat<AdapterDelegate<T>> delegates = new SparseArrayCompat<>();
    protected AdapterDelegate<T> fallbackDelegate;

    public AdapterDelegatesManager() {
    }

    public AdapterDelegatesManager(AdapterDelegate<T>... adapterDelegateArr) {
        for (AdapterDelegate<T> adapterDelegate : adapterDelegateArr) {
            addDelegate(adapterDelegate);
        }
    }

    public AdapterDelegatesManager<T> addDelegate(AdapterDelegate<T> adapterDelegate) {
        int size = this.delegates.size();
        while (this.delegates.get(size) != null) {
            size++;
            if (size == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return addDelegate(size, false, adapterDelegate);
    }

    public AdapterDelegatesManager<T> addDelegate(int i, AdapterDelegate<T> adapterDelegate) {
        return addDelegate(i, false, adapterDelegate);
    }

    public AdapterDelegatesManager<T> addDelegate(int i, boolean z, AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate != null) {
            if (i == 2147483646) {
                throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
            }
            if (!z && this.delegates.get(i) != null) {
                throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + i + ". Already registered AdapterDelegate is " + this.delegates.get(i));
            }
            this.delegates.put(i, adapterDelegate);
            return this;
        }
        throw new NullPointerException("AdapterDelegate is null!");
    }

    public AdapterDelegatesManager<T> removeDelegate(AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate == null) {
            throw new NullPointerException("AdapterDelegate is null");
        }
        int indexOfValue = this.delegates.indexOfValue(adapterDelegate);
        if (indexOfValue >= 0) {
            this.delegates.removeAt(indexOfValue);
        }
        return this;
    }

    public AdapterDelegatesManager<T> removeDelegate(int i) {
        this.delegates.remove(i);
        return this;
    }

    public int getItemViewType(T t, int i) {
        if (t == null) {
            throw new NullPointerException("Items datasource is null!");
        }
        int size = this.delegates.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.delegates.valueAt(i2).isForViewType(t, i)) {
                return this.delegates.keyAt(i2);
            }
        }
        if (this.fallbackDelegate != null) {
            return FALLBACK_DELEGATE_VIEW_TYPE;
        }
        throw new NullPointerException(t instanceof List ? "No AdapterDelegate added that matches item=" + ((List) t).get(i).toString() + " at position=" + i + " in data source" : "No AdapterDelegate added for item at position=" + i + ". items=" + t);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(i);
        if (delegateForViewType == null) {
            throw new NullPointerException("No AdapterDelegate added for ViewType " + i);
        }
        RecyclerView.ViewHolder onCreateViewHolder = delegateForViewType.onCreateViewHolder(viewGroup);
        if (onCreateViewHolder != null) {
            return onCreateViewHolder;
        }
        throw new NullPointerException("ViewHolder returned from AdapterDelegate " + delegateForViewType + " for ViewType =" + i + " is null!");
    }

    public void onBindViewHolder(T t, int i, RecyclerView.ViewHolder viewHolder, List list) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(viewHolder.getItemViewType());
        if (delegateForViewType == null) {
            throw new NullPointerException("No delegate found for item at position = " + i + " for viewType = " + viewHolder.getItemViewType());
        }
        if (list == null) {
            list = PAYLOADS_EMPTY_LIST;
        }
        delegateForViewType.onBindViewHolder(t, i, viewHolder, list);
    }

    public void onBindViewHolder(T t, int i, RecyclerView.ViewHolder viewHolder) {
        onBindViewHolder(t, i, viewHolder, PAYLOADS_EMPTY_LIST);
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(viewHolder.getItemViewType());
        if (delegateForViewType == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
        delegateForViewType.onViewRecycled(viewHolder);
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(viewHolder.getItemViewType());
        if (delegateForViewType == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
        return delegateForViewType.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(viewHolder.getItemViewType());
        if (delegateForViewType == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
        delegateForViewType.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(viewHolder.getItemViewType());
        if (delegateForViewType == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
        delegateForViewType.onViewDetachedFromWindow(viewHolder);
    }

    public AdapterDelegatesManager<T> setFallbackDelegate(AdapterDelegate<T> adapterDelegate) {
        this.fallbackDelegate = adapterDelegate;
        return this;
    }

    public int getViewType(AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate == null) {
            throw new NullPointerException("Delegate is null");
        }
        int indexOfValue = this.delegates.indexOfValue(adapterDelegate);
        if (indexOfValue == -1) {
            return -1;
        }
        return this.delegates.keyAt(indexOfValue);
    }

    public AdapterDelegate<T> getDelegateForViewType(int i) {
        return this.delegates.get(i, this.fallbackDelegate);
    }

    public AdapterDelegate<T> getFallbackDelegate() {
        return this.fallbackDelegate;
    }
}
