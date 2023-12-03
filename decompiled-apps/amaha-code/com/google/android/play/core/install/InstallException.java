package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import jc.a;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstallException(int i6) {
        super(new Status(i6, String.format(r1, "Install Error(%d): %s", r2)));
        String str;
        HashMap hashMap;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i6);
        HashMap hashMap2 = a.f21780a;
        Integer valueOf = Integer.valueOf(i6);
        if (hashMap2.containsKey(valueOf)) {
            if (a.f21781b.containsKey(valueOf)) {
                str = ((String) hashMap2.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) hashMap.get(valueOf)) + ")";
                objArr[1] = str;
                if (i6 == 0) {
                    return;
                }
                throw new IllegalArgumentException("errorCode should not be 0.");
            }
        }
        str = "";
        objArr[1] = str;
        if (i6 == 0) {
        }
    }
}
