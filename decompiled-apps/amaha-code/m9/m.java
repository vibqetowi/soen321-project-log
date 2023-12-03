package m9;

import android.os.IBinder;
import android.os.Parcel;
import da.a;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class m extends z6.a implements x {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 4);
    }

    @Override // m9.x
    public final da.a h() {
        Parcel c12 = c1(z(), 2);
        da.a X1 = a.AbstractBinderC0186a.X1(c12.readStrongBinder());
        c12.recycle();
        return X1;
    }
}
