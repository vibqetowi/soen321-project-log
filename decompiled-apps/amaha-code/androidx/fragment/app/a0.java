package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.y;
import java.util.ArrayList;
/* compiled from: FragmentManagerState.java */
/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();
    public final ArrayList<c> A;
    public ArrayList<y.l> B;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<String> f2133u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f2134v;

    /* renamed from: w  reason: collision with root package name */
    public b[] f2135w;

    /* renamed from: x  reason: collision with root package name */
    public int f2136x;

    /* renamed from: y  reason: collision with root package name */
    public String f2137y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f2138z;

    /* compiled from: FragmentManagerState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i6) {
            return new a0[i6];
        }
    }

    public a0() {
        this.f2137y = null;
        this.f2138z = new ArrayList<>();
        this.A = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f2133u);
        parcel.writeStringList(this.f2134v);
        parcel.writeTypedArray(this.f2135w, i6);
        parcel.writeInt(this.f2136x);
        parcel.writeString(this.f2137y);
        parcel.writeStringList(this.f2138z);
        parcel.writeTypedList(this.A);
        parcel.writeTypedList(this.B);
    }

    public a0(Parcel parcel) {
        this.f2137y = null;
        this.f2138z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.f2133u = parcel.createStringArrayList();
        this.f2134v = parcel.createStringArrayList();
        this.f2135w = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2136x = parcel.readInt();
        this.f2137y = parcel.readString();
        this.f2138z = parcel.createStringArrayList();
        this.A = parcel.createTypedArrayList(c.CREATOR);
        this.B = parcel.createTypedArrayList(y.l.CREATOR);
    }
}
