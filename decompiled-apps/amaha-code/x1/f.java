package x1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x1.k;
/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface f extends IInterface {
    void c0(String[] strArr);

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements f {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: x1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0629a implements f {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f37469a;

            public C0629a(IBinder iBinder) {
                this.f37469a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f37469a;
            }

            @Override // x1.f
            public final void c0(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f37469a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i6 != 1598968902) {
                if (i6 != 1) {
                    return super.onTransact(i6, parcel, parcel2, i10);
                }
                ((k.b) this).c0(parcel.createStringArray());
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
