package ea;

import android.os.IBinder;
import android.os.Parcel;
import da.a;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class f extends z6.a {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 5);
    }

    public final da.a V1(da.b bVar, String str, int i6, da.b bVar2) {
        Parcel z10 = z();
        ma.a.c(z10, bVar);
        z10.writeString(str);
        z10.writeInt(i6);
        ma.a.c(z10, bVar2);
        Parcel v10 = v(z10, 2);
        da.a X1 = a.AbstractBinderC0186a.X1(v10.readStrongBinder());
        v10.recycle();
        return X1;
    }

    public final da.a W1(da.b bVar, String str, int i6, da.b bVar2) {
        Parcel z10 = z();
        ma.a.c(z10, bVar);
        z10.writeString(str);
        z10.writeInt(i6);
        ma.a.c(z10, bVar2);
        Parcel v10 = v(z10, 3);
        da.a X1 = a.AbstractBinderC0186a.X1(v10.readStrongBinder());
        v10.recycle();
        return X1;
    }
}
