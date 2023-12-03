package z6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: BaseProxy.java */
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39197a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f39198b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39199c;

    public a(IBinder iBinder) {
        this.f39197a = 0;
        this.f39198b = iBinder;
        this.f39199c = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
    }

    public final void R1(Parcel parcel, int i6) {
        Parcel obtain;
        int i10 = this.f39197a;
        IBinder iBinder = this.f39198b;
        switch (i10) {
            case 4:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i6, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i6, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public final void S1(Parcel parcel, int i6) {
        try {
            this.f39198b.transact(i6, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel T1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39199c);
        return obtain;
    }

    public final Parcel U1(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f39198b.transact(i6, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39198b;
    }

    public final Parcel c1(Parcel parcel, int i6) {
        int i10 = this.f39197a;
        IBinder iBinder = this.f39198b;
        switch (i10) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i6, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e10) {
                        obtain.recycle();
                        throw e10;
                    }
                } finally {
                }
            case 4:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i6, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e11) {
                        obtain2.recycle();
                        throw e11;
                    }
                } finally {
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i6, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e12) {
                        obtain3.recycle();
                        throw e12;
                    }
                } finally {
                }
        }
    }

    public final Parcel v(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f39198b.transact(i6, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel z() {
        int i6 = this.f39197a;
        String str = this.f39199c;
        switch (i6) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            case 2:
            case 3:
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
            case 4:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(str);
                return obtain3;
            case 5:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(str);
                return obtain4;
        }
    }

    public a(IBinder iBinder, int i6) {
        this.f39197a = i6;
        if (i6 != 7) {
            this.f39198b = iBinder;
            this.f39199c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
            return;
        }
        this.f39198b = iBinder;
        this.f39199c = "com.android.vending.billing.IInAppBillingService";
    }

    public /* synthetic */ a(IBinder iBinder, String str, int i6) {
        this.f39197a = i6;
        this.f39198b = iBinder;
        this.f39199c = str;
    }
}
