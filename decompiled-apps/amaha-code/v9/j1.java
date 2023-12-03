package v9;

import android.os.IBinder;
import android.os.Parcel;
import da.a;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class j1 extends z6.a implements l1 {
    public j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData", 5);
    }

    @Override // v9.l1
    public final int c() {
        Parcel v10 = v(z(), 2);
        int readInt = v10.readInt();
        v10.recycle();
        return readInt;
    }

    @Override // v9.l1
    public final da.a e() {
        Parcel v10 = v(z(), 1);
        da.a X1 = a.AbstractBinderC0186a.X1(v10.readStrongBinder());
        v10.recycle();
        return X1;
    }
}
