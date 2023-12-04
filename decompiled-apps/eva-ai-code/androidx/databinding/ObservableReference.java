package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface ObservableReference<T> {
    void addListener(T t);

    WeakListener<T> getListener();

    void removeListener(T t);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
