package androidx.databinding;
/* loaded from: classes3.dex */
public interface Observable {

    /* loaded from: classes3.dex */
    public static abstract class OnPropertyChangedCallback {
        public abstract void onPropertyChanged(Observable sender, int propertyId);
    }

    void addOnPropertyChangedCallback(OnPropertyChangedCallback callback);

    void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback);
}
