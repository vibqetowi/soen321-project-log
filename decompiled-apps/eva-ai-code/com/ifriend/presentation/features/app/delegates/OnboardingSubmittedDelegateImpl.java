package com.ifriend.presentation.features.app.delegates;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingSubmittedDelegate.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u00020\u000b¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/OnboardingSubmittedDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/OnboardingSubmittedDelegate;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "userOffersRepository", "Lcom/ifriend/domain/data/offers/UserOffersRepository;", "(Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/domain/data/offers/UserOffersRepository;)V", "onboardingDataSubmitted", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingSubmittedDelegateImpl implements OnboardingSubmittedDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final UserOffersRepository userOffersRepository;
    private final UserProfileRepository userProfileRepository;

    @Inject
    public OnboardingSubmittedDelegateImpl(AppEventsEmitter appEventsEmitter, UserProfileRepository userProfileRepository, UserOffersRepository userOffersRepository) {
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(userOffersRepository, "userOffersRepository");
        this.appEventsEmitter = appEventsEmitter;
        this.userProfileRepository = userProfileRepository;
        this.userOffersRepository = userOffersRepository;
    }

    @Override // com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegate
    public void onboardingDataSubmitted(AppViewModel context_receiver_0, AppEvents event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$1(context_receiver_0, null), null, new OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2(this, context_receiver_0, null), 2, null);
    }
}
