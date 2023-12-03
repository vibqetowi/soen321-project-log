package x1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import x1.f;
/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public interface g extends IInterface {
    int N1(f fVar, String str);

    void o1(String[] strArr, int i6);

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f37470a = 0;

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: x1.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0630a implements g {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f37471a;

            public C0630a(IBinder iBinder) {
                this.f37471a = iBinder;
            }

            @Override // x1.g
            public final int N1(f fVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(fVar);
                    obtain.writeString(str);
                    this.f37471a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f37471a;
            }

            @Override // x1.g
            public final void o1(String[] strArr, int i6) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i6);
                    obtain.writeStringArray(strArr);
                    this.f37471a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i6 != 1598968902) {
                f callback = null;
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            return super.onTransact(i6, parcel, parcel2, i10);
                        }
                        MultiInstanceInvalidationService.a aVar = (MultiInstanceInvalidationService.a) this;
                        aVar.o1(parcel.createStringArray(), parcel.readInt());
                    } else {
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                                callback = (f) queryLocalInterface;
                            } else {
                                callback = new f.a.C0629a(readStrongBinder);
                            }
                        }
                        int readInt = parcel.readInt();
                        kotlin.jvm.internal.i.g(callback, "callback");
                        MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                        synchronized (multiInstanceInvalidationService.f3069w) {
                            multiInstanceInvalidationService.f3069w.unregister(callback);
                            String str = (String) multiInstanceInvalidationService.f3068v.remove(Integer.valueOf(readInt));
                        }
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof f)) {
                            callback = (f) queryLocalInterface2;
                        } else {
                            callback = new f.a.C0629a(readStrongBinder2);
                        }
                    }
                    int N1 = ((MultiInstanceInvalidationService.a) this).N1(callback, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(N1);
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
