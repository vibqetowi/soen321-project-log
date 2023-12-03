package f9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import z6.b;
import z6.c;
/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: f9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0230a extends b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f14918a = 0;

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: f9.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0231a extends z6.a implements a {
            public C0231a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // f9.a
            public final Bundle w0(Bundle bundle) {
                Parcelable parcelable;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f39199c);
                int i6 = c.f39200a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.f39198b.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (obtain.readInt() == 0) {
                        parcelable = null;
                    } else {
                        parcelable = (Parcelable) creator.createFromParcel(obtain);
                    }
                    return (Bundle) parcelable;
                } catch (RuntimeException e10) {
                    throw e10;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    Bundle w0(Bundle bundle);
}
