package oa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class j extends z6.a implements l {
    public j(IBinder iBinder) {
        super(iBinder, 7);
    }

    @Override // oa.l
    public final Bundle I(int i6, String str, String str2, String str3, Bundle bundle) {
        Parcel T1 = T1();
        T1.writeInt(i6);
        T1.writeString(str);
        T1.writeString(str2);
        T1.writeString(str3);
        T1.writeString(null);
        int i10 = m.f27332a;
        T1.writeInt(1);
        bundle.writeToParcel(T1, 0);
        Parcel U1 = U1(T1, 8);
        Bundle bundle2 = (Bundle) m.a(U1, Bundle.CREATOR);
        U1.recycle();
        return bundle2;
    }

    @Override // oa.l
    public final Bundle J0(String str, String str2, String str3) {
        Parcel T1 = T1();
        T1.writeInt(3);
        T1.writeString(str);
        T1.writeString(str2);
        T1.writeString(str3);
        Parcel U1 = U1(T1, 4);
        Bundle bundle = (Bundle) m.a(U1, Bundle.CREATOR);
        U1.recycle();
        return bundle;
    }

    @Override // oa.l
    public final int L(int i6, String str, String str2) {
        Parcel T1 = T1();
        T1.writeInt(i6);
        T1.writeString(str);
        T1.writeString(str2);
        Parcel U1 = U1(T1, 1);
        int readInt = U1.readInt();
        U1.recycle();
        return readInt;
    }

    @Override // oa.l
    public final Bundle T0(String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel T1 = T1();
        T1.writeInt(17);
        T1.writeString(str);
        T1.writeString(str2);
        int i6 = m.f27332a;
        T1.writeInt(1);
        bundle.writeToParcel(T1, 0);
        T1.writeInt(1);
        bundle2.writeToParcel(T1, 0);
        Parcel U1 = U1(T1, 901);
        Bundle bundle3 = (Bundle) m.a(U1, Bundle.CREATOR);
        U1.recycle();
        return bundle3;
    }

    @Override // oa.l
    public final Bundle V0(String str, String str2, String str3, Bundle bundle) {
        Parcel T1 = T1();
        T1.writeInt(6);
        T1.writeString(str);
        T1.writeString(str2);
        T1.writeString(str3);
        int i6 = m.f27332a;
        T1.writeInt(1);
        bundle.writeToParcel(T1, 0);
        Parcel U1 = U1(T1, 9);
        Bundle bundle2 = (Bundle) m.a(U1, Bundle.CREATOR);
        U1.recycle();
        return bundle2;
    }

    @Override // oa.l
    public final int t1(int i6, String str, String str2, Bundle bundle) {
        Parcel T1 = T1();
        T1.writeInt(i6);
        T1.writeString(str);
        T1.writeString(str2);
        int i10 = m.f27332a;
        T1.writeInt(1);
        bundle.writeToParcel(T1, 0);
        Parcel U1 = U1(T1, 10);
        int readInt = U1.readInt();
        U1.recycle();
        return readInt;
    }

    @Override // oa.l
    public final Bundle x1(String str, String str2, String str3) {
        Parcel T1 = T1();
        T1.writeInt(3);
        T1.writeString(str);
        T1.writeString(str2);
        T1.writeString(str3);
        T1.writeString(null);
        Parcel U1 = U1(T1, 3);
        Bundle bundle = (Bundle) m.a(U1, Bundle.CREATOR);
        U1.recycle();
        return bundle;
    }

    @Override // oa.l
    public final Bundle z1(String str, String str2, String str3, Bundle bundle) {
        Parcel T1 = T1();
        T1.writeInt(9);
        T1.writeString(str);
        T1.writeString(str2);
        T1.writeString(str3);
        int i6 = m.f27332a;
        T1.writeInt(1);
        bundle.writeToParcel(T1, 0);
        Parcel U1 = U1(T1, 11);
        Bundle bundle2 = (Bundle) m.a(U1, Bundle.CREATOR);
        U1.recycle();
        return bundle2;
    }
}
