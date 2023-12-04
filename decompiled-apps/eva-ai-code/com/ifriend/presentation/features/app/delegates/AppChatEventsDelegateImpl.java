package com.ifriend.presentation.features.app.delegates;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppChatEventsDelegate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\bH\u0002R\u00020\t¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppChatEventsDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppChatEventsDelegate;", "refreshConfigurationUseCase", "Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "handleAppChatEvents", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;)V", "refreshConfiguration", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppChatEventsDelegateImpl implements AppChatEventsDelegate {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final ChatsRefreshConfigurationUseCase refreshConfigurationUseCase;

    @Inject
    public AppChatEventsDelegateImpl(ChatsRefreshConfigurationUseCase refreshConfigurationUseCase, AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(refreshConfigurationUseCase, "refreshConfigurationUseCase");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.refreshConfigurationUseCase = refreshConfigurationUseCase;
        this.analyticsInteractor = analyticsInteractor;
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppChatEventsDelegate
    public void handleAppChatEvents(AppViewModel context_receiver_0, AppEvents.Chat event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, AppEvents.Chat.RefreshConfiguration.INSTANCE)) {
            refreshConfiguration(context_receiver_0);
        }
    }

    private final void refreshConfiguration(AppViewModel appViewModel) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), null, null, new AppChatEventsDelegateImpl$refreshConfiguration$1(this, null), 3, null);
    }
}
