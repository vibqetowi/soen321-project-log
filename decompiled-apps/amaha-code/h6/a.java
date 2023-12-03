package h6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: IReceiverService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IReceiverService.java */
    /* renamed from: h6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0272a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f17341a = 0;

        /* compiled from: IReceiverService.java */
        /* renamed from: h6.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0273a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f17342a;

            public C0273a(IBinder iBinder) {
                this.f17342a = iBinder;
            }

            @Override // h6.a
            public final int R(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f17342a.transact(1, obtain, obtain2, 0)) {
                        int i6 = AbstractBinderC0272a.f17341a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f17342a;
            }
        }

        public static a v(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0273a(iBinder);
        }
    }

    int R(Bundle bundle);
}
