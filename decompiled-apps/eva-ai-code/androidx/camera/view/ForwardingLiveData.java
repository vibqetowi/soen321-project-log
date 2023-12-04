package androidx.camera.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ForwardingLiveData<T> extends MediatorLiveData<T> {
    private LiveData<T> mLiveDataSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setSource(LiveData<T> liveData) {
        LiveData liveData2 = (LiveData<T>) this.mLiveDataSource;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.mLiveDataSource = liveData;
        super.addSource(liveData, new Observer() { // from class: androidx.camera.view.ForwardingLiveData$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ForwardingLiveData.this.setValue(obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        LiveData<T> liveData = this.mLiveDataSource;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}
