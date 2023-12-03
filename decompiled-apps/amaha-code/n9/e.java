package n9;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class e extends z6.a implements g {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 4);
    }

    @Override // n9.g
    public final Bitmap W(Uri uri) {
        Parcel z10 = z();
        com.google.android.gms.internal.cast.d.b(z10, uri);
        Parcel c12 = c1(z10, 1);
        Bitmap bitmap = (Bitmap) com.google.android.gms.internal.cast.d.a(c12, Bitmap.CREATOR);
        c12.recycle();
        return bitmap;
    }
}
