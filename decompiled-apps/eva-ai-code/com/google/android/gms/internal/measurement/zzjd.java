package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
