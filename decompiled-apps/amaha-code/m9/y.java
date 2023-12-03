package m9;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class y extends z6.a implements z {
    public y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 4);
    }

    @Override // m9.z
    public final ArrayList h() {
        Parcel c12 = c1(z(), 3);
        ArrayList createTypedArrayList = c12.createTypedArrayList(e.CREATOR);
        c12.recycle();
        return createTypedArrayList;
    }

    @Override // m9.z
    public final int[] i() {
        Parcel c12 = c1(z(), 4);
        int[] createIntArray = c12.createIntArray();
        c12.recycle();
        return createIntArray;
    }
}
