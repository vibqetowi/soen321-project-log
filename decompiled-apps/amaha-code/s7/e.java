package s7;

import android.media.MediaDrm;
import c9.w;
/* compiled from: DrmUtil.java */
/* loaded from: classes.dex */
public final class e {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        String[] split;
        int length;
        boolean z10;
        String diagnosticInfo = ((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo();
        int i6 = w.f5205a;
        int i10 = 0;
        if (diagnosticInfo != null && (length = (split = diagnosticInfo.split("_", -1)).length) >= 2) {
            String str = split[length - 1];
            if (length >= 3 && "neg".equals(split[length - 2])) {
                z10 = true;
            } else {
                z10 = false;
            }
            try {
                str.getClass();
                i10 = Integer.parseInt(str);
                if (z10) {
                    i10 = -i10;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return w.n(i10);
    }
}
