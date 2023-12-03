package l9;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class t extends ja.a {
    public t() {
        super("com.google.android.gms.cast.framework.ISessionProxy", 2);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10 = false;
        switch (i6) {
            case 1:
                da.b bVar = new da.b(((u) this).f24188b);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.d.c(parcel2, bVar);
                break;
            case 2:
                ((u) this).f24188b.g((Bundle) com.google.android.gms.internal.cast.d.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                ((u) this).f24188b.f((Bundle) com.google.android.gms.internal.cast.d.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                int i11 = com.google.android.gms.internal.cast.d.f7498a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                ((u) this).f24188b.a(z10);
                parcel2.writeNoException();
                break;
            case 5:
                long b10 = ((u) this).f24188b.b();
                parcel2.writeNoException();
                parcel2.writeLong(b10);
                break;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            case 7:
                ((u) this).f24188b.e((Bundle) com.google.android.gms.internal.cast.d.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                ((u) this).f24188b.d((Bundle) com.google.android.gms.internal.cast.d.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                ((u) this).f24188b.h((Bundle) com.google.android.gms.internal.cast.d.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
