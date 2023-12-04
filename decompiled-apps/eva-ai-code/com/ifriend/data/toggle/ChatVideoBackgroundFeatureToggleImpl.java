package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.featuretoggles.ChatVideoBackgroundFeatureToggle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatVideoBackgroundFeatureToggleImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/data/toggle/ChatVideoBackgroundFeatureToggleImpl;", "Lcom/ifriend/data/toggle/ConfigFeatureToggle;", "Lcom/ifriend/domain/featuretoggles/ChatVideoBackgroundFeatureToggle;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatVideoBackgroundFeatureToggleImpl extends ConfigFeatureToggle implements ChatVideoBackgroundFeatureToggle {
    public static final Companion Companion = new Companion(null);
    public static final String VIDEO_BACKGROUND_FEATURE = "background_video_avatar";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ChatVideoBackgroundFeatureToggleImpl(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        super(appConfigLocalDataSource, VIDEO_BACKGROUND_FEATURE, coroutineScope, (Boolean) null, (Boolean) null, (Function1) null, (Function0) null, 120, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    /* compiled from: ChatVideoBackgroundFeatureToggleImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/toggle/ChatVideoBackgroundFeatureToggleImpl$Companion;", "", "()V", "VIDEO_BACKGROUND_FEATURE", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
