package s7;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
/* compiled from: DrmUtil.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean a(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
