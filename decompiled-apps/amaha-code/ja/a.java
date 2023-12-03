package ja;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public class a extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21769a;

    public a(String str, int i6) {
        this.f21769a = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            attachInterface(this, str);
                            return;
                        } else {
                            attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
                            return;
                        }
                    }
                    attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
                    return;
                }
                attachInterface(this, str);
                return;
            }
            attachInterface(this, str);
            return;
        }
        attachInterface(this, str);
    }

    private void U1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    private void V1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    private void W1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    public boolean R1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    public boolean S1(int i6, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f21769a) {
            case 2:
                U1(i6, parcel, parcel2, i10);
                throw null;
            case 3:
                return false;
            case 4:
                V1(i6, parcel, parcel2, i10);
                throw null;
            default:
                W1(i6, parcel, parcel2, i10);
                throw null;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f21769a) {
            case 0:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return S1(i6, parcel, parcel2);
            case 1:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return R1(i6, parcel, parcel2, i10);
            case 2:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return T1(i6, parcel, parcel2, i10);
            case 3:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return T1(i6, parcel, parcel2, i10);
            case 4:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return T1(i6, parcel, parcel2, i10);
            default:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return T1(i6, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
