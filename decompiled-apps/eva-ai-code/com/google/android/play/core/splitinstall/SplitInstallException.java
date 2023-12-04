package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(int i) {
        super(new Status(i, String.format("Split Install Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.splitinstall.model.zza.zzb(i))));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
