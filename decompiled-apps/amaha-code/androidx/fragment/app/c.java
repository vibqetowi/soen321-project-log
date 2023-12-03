package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BackStackState.java */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final List<String> f2148u;

    /* renamed from: v  reason: collision with root package name */
    public final List<b> f2149v;

    /* compiled from: BackStackState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i6) {
            return new c[i6];
        }
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f2148u = arrayList;
        this.f2149v = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f2148u);
        parcel.writeTypedList(this.f2149v);
    }

    public c(Parcel parcel) {
        this.f2148u = parcel.createStringArrayList();
        this.f2149v = parcel.createTypedArrayList(b.CREATOR);
    }
}
