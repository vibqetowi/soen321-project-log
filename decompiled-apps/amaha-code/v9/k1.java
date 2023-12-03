package v9;

import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class k1 extends ja.a implements l1 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f34916b = 0;

    public k1() {
        super("com.google.android.gms.common.internal.ICertData", 3);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 != 1) {
            if (i6 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((s9.p) this).f31356c);
        } else {
            da.a e10 = ((s9.p) this).e();
            parcel2.writeNoException();
            ma.a.c(parcel2, e10);
        }
        return true;
    }
}
