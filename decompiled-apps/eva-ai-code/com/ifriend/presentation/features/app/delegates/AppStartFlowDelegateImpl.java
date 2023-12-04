package com.ifriend.presentation.features.app.delegates;

import android.content.Intent;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppStartFlowDelegate.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u00020\u000b¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppStartFlowDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppStartFlowDelegate;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "startFlow", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "intent", "Landroid/content/Intent;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Landroid/content/Intent;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppStartFlowDelegateImpl implements AppStartFlowDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;

    @Inject
    public AppStartFlowDelegateImpl(UserRepository userRepository, UserProfileRepository userProfileRepository, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
        this.appEventsEmitter = appEventsEmitter;
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppStartFlowDelegate
    public void startFlow(AppViewModel context_receiver_0, Intent intent) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new AppStartFlowDelegateImpl$startFlow$1(context_receiver_0, null), null, new AppStartFlowDelegateImpl$startFlow$2(this, context_receiver_0, null), 2, null);
    }
}
