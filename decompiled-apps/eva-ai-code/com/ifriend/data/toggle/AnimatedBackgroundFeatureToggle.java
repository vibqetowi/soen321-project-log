package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AnimatedBackgroundFeatureToggle.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/toggle/AnimatedBackgroundFeatureToggle;", "Lcom/ifriend/data/toggle/ConfigFeatureToggle;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedBackgroundFeatureToggle extends ConfigFeatureToggle {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedBackgroundFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        super(appConfigLocalDataSource, "animated_background_enabled", coroutineScope, (Boolean) null, (Boolean) null, (Function1) null, (Function0) null, 120, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }
}
