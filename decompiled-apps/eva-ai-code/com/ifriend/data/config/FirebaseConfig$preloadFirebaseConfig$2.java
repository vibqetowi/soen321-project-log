package com.ifriend.data.config;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FirebaseConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FirebaseConfig$preloadFirebaseConfig$2 extends Lambda implements Function1<FirebaseRemoteConfigSettings.Builder, Unit> {
    public static final FirebaseConfig$preloadFirebaseConfig$2 INSTANCE = new FirebaseConfig$preloadFirebaseConfig$2();

    FirebaseConfig$preloadFirebaseConfig$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FirebaseRemoteConfigSettings.Builder builder) {
        invoke2(builder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FirebaseRemoteConfigSettings.Builder remoteConfigSettings) {
        Intrinsics.checkNotNullParameter(remoteConfigSettings, "$this$remoteConfigSettings");
        remoteConfigSettings.setMinimumFetchIntervalInSeconds(60L);
    }
}
