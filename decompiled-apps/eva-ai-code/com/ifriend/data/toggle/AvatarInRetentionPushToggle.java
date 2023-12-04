package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.data.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AvatarInRetentionPushToggle.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;", "Lcom/ifriend/data/toggle/ConfigFeatureToggle;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/data/Preferences;)V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarInRetentionPushToggle extends ConfigFeatureToggle {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarInRetentionPushToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, Preferences preferences) {
        super(appConfigLocalDataSource, AvatarInRetentionPushToggleKt.AVATAR_IN_RETENTION_PUSH_ENABLED, coroutineScope, (Boolean) null, (Boolean) null, preferences, AvatarInRetentionPushToggleKt.AVATAR_IN_RETENTION_PUSH_ENABLED, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
    }
}
