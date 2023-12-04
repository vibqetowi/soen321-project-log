package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes2.dex */
final class zbb implements PendingResultUtil.ResultConverter {
    private zbb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zbb(zba zbaVar) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((GoogleSignInResult) result).getSignInAccount();
    }
}
