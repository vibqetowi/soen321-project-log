package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.j;
/* compiled from: FragmentState.java */
/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final Bundle D;
    public final boolean E;
    public final int F;
    public Bundle G;

    /* renamed from: u  reason: collision with root package name */
    public final String f2153u;

    /* renamed from: v  reason: collision with root package name */
    public final String f2154v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f2155w;

    /* renamed from: x  reason: collision with root package name */
    public final int f2156x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2157y;

    /* renamed from: z  reason: collision with root package name */
    public final String f2158z;

    /* compiled from: FragmentState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i6) {
            return new d0[i6];
        }
    }

    public d0(Fragment fragment) {
        this.f2153u = fragment.getClass().getName();
        this.f2154v = fragment.mWho;
        this.f2155w = fragment.mFromLayout;
        this.f2156x = fragment.mFragmentId;
        this.f2157y = fragment.mContainerId;
        this.f2158z = fragment.mTag;
        this.A = fragment.mRetainInstance;
        this.B = fragment.mRemoving;
        this.C = fragment.mDetached;
        this.D = fragment.mArguments;
        this.E = fragment.mHidden;
        this.F = fragment.mMaxState.ordinal();
    }

    public final Fragment a(t tVar, ClassLoader classLoader) {
        Fragment a10 = tVar.a(this.f2153u);
        Bundle bundle = this.D;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.setArguments(bundle);
        a10.mWho = this.f2154v;
        a10.mFromLayout = this.f2155w;
        a10.mRestored = true;
        a10.mFragmentId = this.f2156x;
        a10.mContainerId = this.f2157y;
        a10.mTag = this.f2158z;
        a10.mRetainInstance = this.A;
        a10.mRemoving = this.B;
        a10.mDetached = this.C;
        a10.mHidden = this.E;
        a10.mMaxState = j.c.values()[this.F];
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            a10.mSavedFragmentState = bundle2;
        } else {
            a10.mSavedFragmentState = new Bundle();
        }
        return a10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2153u);
        sb2.append(" (");
        sb2.append(this.f2154v);
        sb2.append(")}:");
        if (this.f2155w) {
            sb2.append(" fromLayout");
        }
        int i6 = this.f2157y;
        if (i6 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i6));
        }
        String str = this.f2158z;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.A) {
            sb2.append(" retainInstance");
        }
        if (this.B) {
            sb2.append(" removing");
        }
        if (this.C) {
            sb2.append(" detached");
        }
        if (this.E) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f2153u);
        parcel.writeString(this.f2154v);
        parcel.writeInt(this.f2155w ? 1 : 0);
        parcel.writeInt(this.f2156x);
        parcel.writeInt(this.f2157y);
        parcel.writeString(this.f2158z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeBundle(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeBundle(this.G);
        parcel.writeInt(this.F);
    }

    public d0(Parcel parcel) {
        this.f2153u = parcel.readString();
        this.f2154v = parcel.readString();
        this.f2155w = parcel.readInt() != 0;
        this.f2156x = parcel.readInt();
        this.f2157y = parcel.readInt();
        this.f2158z = parcel.readString();
        this.A = parcel.readInt() != 0;
        this.B = parcel.readInt() != 0;
        this.C = parcel.readInt() != 0;
        this.D = parcel.readBundle();
        this.E = parcel.readInt() != 0;
        this.G = parcel.readBundle();
        this.F = parcel.readInt();
    }
}
