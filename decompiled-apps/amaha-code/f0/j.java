package f0;

import android.os.Bundle;
import android.os.IBinder;
/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
