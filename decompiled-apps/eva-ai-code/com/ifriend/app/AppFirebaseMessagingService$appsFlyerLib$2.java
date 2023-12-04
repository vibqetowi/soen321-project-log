package com.ifriend.app;

import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/appsflyer/AppsFlyerLib;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppFirebaseMessagingService$appsFlyerLib$2 extends Lambda implements Function0<AppsFlyerLib> {
    public static final AppFirebaseMessagingService$appsFlyerLib$2 INSTANCE = new AppFirebaseMessagingService$appsFlyerLib$2();

    AppFirebaseMessagingService$appsFlyerLib$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppsFlyerLib invoke() {
        return AppsFlyerLib.getInstance();
    }
}
