package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0070a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f3902a = 0;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0071a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f3903a;

            public C0071a(IBinder iBinder) {
                this.f3903a = iBinder;
            }

            @Override // b.a
            public final void D1(String str, int i6, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i6);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3903a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f3903a;
            }
        }
    }

    void D1(String str, int i6, String str2, Notification notification);
}
