package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.j;
/* compiled from: NavBackStackEntryState.kt */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final String f31124u;

    /* renamed from: v  reason: collision with root package name */
    public final int f31125v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f31126w;

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f31127x;

    /* compiled from: NavBackStackEntryState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel inParcel) {
            kotlin.jvm.internal.i.g(inParcel, "inParcel");
            return new g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i6) {
            return new g[i6];
        }
    }

    public g(f entry) {
        kotlin.jvm.internal.i.g(entry, "entry");
        this.f31124u = entry.f31119z;
        this.f31125v = entry.f31115v.B;
        this.f31126w = entry.f31116w;
        Bundle bundle = new Bundle();
        this.f31127x = bundle;
        entry.C.c(bundle);
    }

    public final f a(Context context, u uVar, j.c hostLifecycleState, p pVar) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f31126w;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = this.f31127x;
        String id2 = this.f31124u;
        kotlin.jvm.internal.i.g(id2, "id");
        return new f(context, uVar, bundle, hostLifecycleState, pVar, id2, bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        kotlin.jvm.internal.i.g(parcel, "parcel");
        parcel.writeString(this.f31124u);
        parcel.writeInt(this.f31125v);
        parcel.writeBundle(this.f31126w);
        parcel.writeBundle(this.f31127x);
    }

    public g(Parcel inParcel) {
        kotlin.jvm.internal.i.g(inParcel, "inParcel");
        String readString = inParcel.readString();
        kotlin.jvm.internal.i.d(readString);
        this.f31124u = readString;
        this.f31125v = inParcel.readInt();
        this.f31126w = inParcel.readBundle(g.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(g.class.getClassLoader());
        kotlin.jvm.internal.i.d(readBundle);
        this.f31127x = readBundle;
    }
}
