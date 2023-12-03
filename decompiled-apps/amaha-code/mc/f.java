package mc;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.integrity.IntegrityServiceException;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public abstract class f extends ja.a {
    public f() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback", 5);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        Parcelable parcelable;
        if (i6 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = b.f25012a;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(parcel);
        }
        Bundle bundle = (Bundle) parcelable;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            kc.i iVar = (kc.i) this;
            l lVar = iVar.f23245d.f23248c;
            ya.i iVar2 = iVar.f23244c;
            synchronized (lVar.f) {
                lVar.f25027e.remove(iVar2);
            }
            synchronized (lVar.f) {
                if (lVar.f25032k.get() > 0 && lVar.f25032k.decrementAndGet() > 0) {
                    lVar.f25024b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    lVar.a().post(new j(0, lVar));
                }
            }
            iVar.f23243b.a("onRequestIntegrityToken", new Object[0]);
            int i12 = bundle.getInt("error");
            if (i12 != 0) {
                iVar.f23244c.c(new IntegrityServiceException(null, i12));
                return true;
            }
            String string = bundle.getString("token");
            if (string == null) {
                iVar.f23244c.c(new IntegrityServiceException(null, -100));
                return true;
            }
            iVar.f23244c.d(new kc.e(string));
            return true;
        }
        throw new BadParcelableException(defpackage.b.h(56, "Parcel data not fully consumed, unread size: ", dataAvail));
    }
}
