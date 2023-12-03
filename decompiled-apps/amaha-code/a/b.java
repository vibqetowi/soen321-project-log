package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f5a = 0;

        /* compiled from: ICustomTabsService.java */
        /* renamed from: a.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f6a;

            public C0001a(IBinder iBinder) {
                this.f6a = iBinder;
            }

            @Override // a.b
            public final boolean F0(a.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = true;
                    obtain.writeInt(1);
                    uri.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeTypedList(null);
                    this.f6a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public final boolean K1() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    boolean z10 = false;
                    this.f6a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f6a;
            }

            @Override // a.b
            public final boolean o0(q.b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(bVar);
                    boolean z10 = false;
                    this.f6a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    boolean F0(a.a aVar, Uri uri, Bundle bundle);

    boolean K1();

    boolean o0(q.b bVar);
}
