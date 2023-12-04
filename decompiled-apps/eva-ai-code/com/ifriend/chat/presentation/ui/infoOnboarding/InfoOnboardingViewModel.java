package com.ifriend.chat.presentation.ui.infoOnboarding;

import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalytics;
import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingAction;
import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingState;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: InfoOnboardingViewModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/presentation/ui/infoOnboarding/InfoOnboardingViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingState;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "infoOnboardingSlideUseCase", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlideUseCase;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "analytics", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalytics;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlideUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalytics;)V", "screensToShow", "", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "clickButton", "", "slide", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingAction;", "finish", "init", "setSlide", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingViewModel extends BaseViewModel<InfoOnboardingState> {
    public static final int $stable = 8;
    private final InfoOnboardingAnalytics analytics;
    private final InfoOnboardingSlideUseCase infoOnboardingSlideUseCase;
    private final RouterProvider routerProvider;
    private List<? extends InfoOnboardingSlide> screensToShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public InfoOnboardingViewModel(CoroutineDispatchers dispatchers, InfoOnboardingSlideUseCase infoOnboardingSlideUseCase, RouterProvider routerProvider, InfoOnboardingAnalytics analytics) {
        super(dispatchers, new InfoOnboardingState(InfoOnboardingSlide.Empty.INSTANCE));
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(infoOnboardingSlideUseCase, "infoOnboardingSlideUseCase");
        Intrinsics.checkNotNullParameter(routerProvider, "routerProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.infoOnboardingSlideUseCase = infoOnboardingSlideUseCase;
        this.routerProvider = routerProvider;
        this.analytics = analytics;
        this.screensToShow = CollectionsKt.emptyList();
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InfoOnboardingViewModel$init$1(this, null), 3, null);
    }

    public final void clickButton(InfoOnboardingSlide slide, InfoOnboardingAction action) {
        Intrinsics.checkNotNullParameter(slide, "slide");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InfoOnboardingViewModel$clickButton$1(this, slide, action, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finish() {
        this.routerProvider.getAppRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSlide(InfoOnboardingSlide infoOnboardingSlide) {
        this.analytics.willShow(infoOnboardingSlide);
        changeState(new InfoOnboardingViewModel$setSlide$1(infoOnboardingSlide));
    }
}
