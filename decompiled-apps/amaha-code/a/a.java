package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ICustomTabsCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: ICustomTabsCallback.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements a {
        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if (i6 != 1598968902) {
                switch (i6) {
                    case 2:
                        parcel.readInt();
                        Bundle bundle = (Bundle) b.a(parcel, Bundle.CREATOR);
                        break;
                    case 3:
                        parcel.readString();
                        Bundle bundle2 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        break;
                    case 4:
                        Bundle bundle3 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        parcel2.writeNoException();
                        break;
                    case 5:
                        parcel.readString();
                        Bundle bundle4 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        parcel2.writeNoException();
                        break;
                    case 6:
                        parcel.readInt();
                        Uri uri = (Uri) b.a(parcel, Uri.CREATOR);
                        parcel.readInt();
                        Bundle bundle5 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        break;
                    case 7:
                        parcel.readString();
                        Bundle bundle6 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        break;
                    case 8:
                        parcel.readInt();
                        parcel.readInt();
                        Bundle bundle7 = (Bundle) b.a(parcel, Bundle.CREATOR);
                        break;
                    default:
                        return super.onTransact(i6, parcel, parcel2, i10);
                }
                return true;
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
