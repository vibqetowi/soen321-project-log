package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zag<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    public zag(GoogleApiClient googleApiClient, R r) {
        super(googleApiClient);
        this.zae = r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.zae;
    }
}
