package p9;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class d extends ja.a {
    public d() {
        super("com.google.android.gms.cast.internal.IBundleCallback", 2);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 == 1) {
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.d.a(parcel, Bundle.CREATOR);
            r rVar = (r) this;
            int i11 = rVar.f28049b;
            ya.i iVar = rVar.f28050c;
            switch (i11) {
                case 0:
                    iVar.b(bundle);
                    break;
                case 1:
                    iVar.b(bundle);
                    break;
                default:
                    iVar.b(bundle);
                    break;
            }
            return true;
        }
        return false;
    }
}
