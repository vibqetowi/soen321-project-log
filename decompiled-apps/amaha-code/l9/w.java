package l9;

import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class w extends ja.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f24191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g gVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 2);
        this.f24191b = gVar;
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        da.a i11;
        g gVar = this.f24191b;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                String str = gVar.f24180b;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            }
            boolean b10 = gVar.b();
            parcel2.writeNoException();
            int i12 = com.google.android.gms.internal.cast.d.f7498a;
            parcel2.writeInt(b10 ? 1 : 0);
            return true;
        }
        c a10 = gVar.a(parcel.readString());
        if (a10 == null) {
            i11 = null;
        } else {
            i11 = a10.i();
        }
        parcel2.writeNoException();
        com.google.android.gms.internal.cast.d.c(parcel2, i11);
        return true;
    }
}
