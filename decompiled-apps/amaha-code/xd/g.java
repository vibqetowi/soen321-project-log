package xd;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import xd.e;
/* compiled from: IDynamicLinksService.java */
/* loaded from: classes.dex */
public interface g extends IInterface {

    /* compiled from: IDynamicLinksService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f37744a = 0;

        /* compiled from: IDynamicLinksService.java */
        /* renamed from: xd.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0633a implements g {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f37745a;

            public C0633a(IBinder iBinder) {
                this.f37745a = iBinder;
            }

            @Override // xd.g
            public final void Z0(e.b bVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(bVar);
                    obtain.writeString(str);
                    if (!this.f37745a.transact(1, obtain, obtain2, 0)) {
                        int i6 = a.f37744a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f37745a;
            }
        }
    }

    void Z0(e.b bVar, String str);
}
