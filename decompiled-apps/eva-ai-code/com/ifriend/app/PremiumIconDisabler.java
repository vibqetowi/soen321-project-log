package com.ifriend.app;

import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PremiumIconDisabler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/app/PremiumIconDisabler;", "", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "premiumAppIconManager", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/icon_switcher/PremiumAppIconManager;Lkotlinx/coroutines/CoroutineScope;)V", "isNeedToDisablePremiumIcon", "", "user", "Lcom/ifriend/domain/models/profile/user/User;", "launch", "", "onUserChanged", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumIconDisabler {
    private final CoroutineScope coroutineScope;
    private final GetUserUseCase getUserUseCase;
    private final PremiumAppIconManager premiumAppIconManager;

    public PremiumIconDisabler(GetUserUseCase getUserUseCase, PremiumAppIconManager premiumAppIconManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(premiumAppIconManager, "premiumAppIconManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.getUserUseCase = getUserUseCase;
        this.premiumAppIconManager = premiumAppIconManager;
        this.coroutineScope = coroutineScope;
    }

    public final void launch() {
        BuildersKt.launch$default(this.coroutineScope, null, null, new PremiumIconDisabler$launch$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUserChanged(User user) {
        if (user == null || !isNeedToDisablePremiumIcon(user)) {
            return;
        }
        this.premiumAppIconManager.disablePremiumIcon();
    }

    private final boolean isNeedToDisablePremiumIcon(User user) {
        return user.getSubscription() != Subscription.PREMIUM;
    }
}
