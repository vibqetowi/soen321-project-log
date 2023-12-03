package o7;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
/* compiled from: BundleListRetriever.java */
/* loaded from: classes.dex */
public final class a extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final int f27178b;

    /* renamed from: a  reason: collision with root package name */
    public final com.google.common.collect.s<Bundle> f27179a;

    static {
        int i6;
        if (c9.w.f5205a >= 30) {
            i6 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i6 = 65536;
        }
        f27178b = i6;
    }

    public a(ArrayList arrayList) {
        this.f27179a = com.google.common.collect.s.z(arrayList);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 != 1) {
            return super.onTransact(i6, parcel, parcel2, i10);
        }
        int i11 = 0;
        if (parcel2 == null) {
            return false;
        }
        com.google.common.collect.s<Bundle> sVar = this.f27179a;
        int size = sVar.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f27178b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(sVar.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i11 = 2;
        }
        parcel2.writeInt(i11);
        return true;
    }
}
