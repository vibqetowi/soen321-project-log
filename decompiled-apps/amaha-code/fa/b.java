package fa;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class b extends na.a implements a {
    public static a asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new c(iBinder);
    }
}
