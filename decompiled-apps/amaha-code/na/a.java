package na;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import da.a;
/* loaded from: classes.dex */
public class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        boolean z11 = false;
        if (i6 > 16777215) {
            z10 = super.onTransact(i6, parcel, parcel2, i10);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z10 = false;
        }
        if (z10) {
            return true;
        }
        fa.b bVar = (fa.b) this;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            return false;
                        }
                        String stringFlagValue = bVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                    } else {
                        long longFlagValue = bVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(longFlagValue);
                    }
                } else {
                    int intFlagValue = bVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(intFlagValue);
                }
            } else {
                String readString = parcel.readString();
                int i11 = b.f25973a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolean booleanFlagValue = bVar.getBooleanFlagValue(readString, z11, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(booleanFlagValue ? 1 : 0);
            }
        } else {
            bVar.init(a.AbstractBinderC0186a.X1(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
