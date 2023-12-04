package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* renamed from: com.google.android.gms.internal.auth-api.zbk  reason: invalid package */
/* loaded from: classes2.dex */
final class zbk extends zbd {
    private final BaseImplementation.ResultHolder zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbk(BaseImplementation.ResultHolder resultHolder) {
        this.zba = resultHolder;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbd, com.google.android.gms.internal.p001authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
