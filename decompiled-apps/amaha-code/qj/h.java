package qj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import hh.g;
import ni.r;
/* compiled from: NavigationAction.java */
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final String f29619u;

    /* renamed from: v  reason: collision with root package name */
    public final String f29620v;

    /* renamed from: w  reason: collision with root package name */
    public final String f29621w;

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f29622x;

    /* compiled from: NavigationAction.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i6) {
            return new h[i6];
        }
    }

    public h(Bundle bundle, String str, String str2, String str3) {
        this.f29619u = str;
        this.f29620v = str2;
        this.f29621w = str3;
        this.f29622x = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "NavigationAction{actionType='" + this.f29619u + "', navigationType='" + this.f29620v + "', navigationUrl='" + this.f29621w + "', keyValuePair=" + this.f29622x + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        try {
            parcel.writeString(this.f29619u);
            parcel.writeString(this.f29620v);
            parcel.writeString(this.f29621w);
            parcel.writeBundle(this.f29622x);
        } catch (Exception e10) {
            r rVar = new r(25);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
        }
    }

    public h(Parcel parcel) {
        this.f29619u = parcel.readString();
        this.f29620v = parcel.readString();
        this.f29621w = parcel.readString();
        this.f29622x = parcel.readBundle(h.class.getClassLoader());
    }
}
