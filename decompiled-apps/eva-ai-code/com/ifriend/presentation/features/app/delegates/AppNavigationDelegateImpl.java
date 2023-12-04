package com.ifriend.presentation.features.app.delegates;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppNavigationDelegate.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B&\b\u0007\u0012\u0015\u0010\u0002\u001a\u0011\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u00020\f¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u0011\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppNavigationDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppNavigationDelegate;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "(Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;)V", "handleNavigationEvents", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppNavigationDelegateImpl implements AppNavigationDelegate {
    public static final int $stable = 8;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;

    @Inject
    public AppNavigationDelegateImpl(FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppNavigationDelegate
    public void handleNavigationEvents(AppViewModel context_receiver_0, AppEvents.Navigation event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new AppNavigationDelegateImpl$handleNavigationEvents$1(this, null), null, new AppNavigationDelegateImpl$handleNavigationEvents$2(event, this, context_receiver_0, null), 2, null);
    }
}
