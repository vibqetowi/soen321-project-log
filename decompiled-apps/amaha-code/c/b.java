package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c.a;
/* compiled from: ResultReceiver.java */
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public c.a f4735u;

    /* compiled from: ResultReceiver.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    /* compiled from: ResultReceiver.java */
    /* renamed from: c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class BinderC0101b extends a.AbstractBinderC0099a {
        public BinderC0101b() {
        }

        @Override // c.a
        public final void P1(int i6, Bundle bundle) {
            b bVar = b.this;
            bVar.getClass();
            bVar.a(i6, bundle);
        }
    }

    public b(Parcel parcel) {
        c.a c0100a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i6 = a.AbstractBinderC0099a.f4733a;
        if (readStrongBinder == null) {
            c0100a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof c.a)) {
                c0100a = (c.a) queryLocalInterface;
            } else {
                c0100a = new a.AbstractBinderC0099a.C0100a(readStrongBinder);
            }
        }
        this.f4735u = c0100a;
    }

    public final void b(int i6, Bundle bundle) {
        c.a aVar = this.f4735u;
        if (aVar != null) {
            try {
                aVar.P1(i6, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        synchronized (this) {
            if (this.f4735u == null) {
                this.f4735u = new BinderC0101b();
            }
            parcel.writeStrongBinder(this.f4735u.asBinder());
        }
    }

    public void a(int i6, Bundle bundle) {
    }
}
