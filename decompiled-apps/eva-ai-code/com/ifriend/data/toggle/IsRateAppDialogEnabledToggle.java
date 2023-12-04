package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: IsRateAppDialogEnabledToggle.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ifriend/data/toggle/IsRateAppDialogEnabledToggle;", "Lcom/ifriend/data/toggle/ConfigFeatureToggle;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IsRateAppDialogEnabledToggle extends ConfigFeatureToggle {
    public static final Companion Companion = new Companion(null);
    public static final String RATE_APP_DIALOG_ENABLED_FEATURE = "is_rate_app_dialog_enabled";

    /* compiled from: IsRateAppDialogEnabledToggle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/toggle/IsRateAppDialogEnabledToggle$Companion;", "", "()V", "RATE_APP_DIALOG_ENABLED_FEATURE", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public IsRateAppDialogEnabledToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        super(appConfigLocalDataSource, RATE_APP_DIALOG_ENABLED_FEATURE, coroutineScope, (Boolean) null, (Boolean) null, (Function1) null, (Function0) null, 120, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }
}
