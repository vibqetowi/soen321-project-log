package com.ifriend.chat.presentation.ui.infoOnboarding.analytics;

import com.facebook.internal.NativeProtocol;
import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingAction;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
/* compiled from: InfoOnboardingAnalytics.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalytics;", "", "userSelectedSlide", "", "slide", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingAction;", "willShow", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InfoOnboardingAnalytics {
    void userSelectedSlide(InfoOnboardingSlide infoOnboardingSlide, InfoOnboardingAction infoOnboardingAction);

    void willShow(InfoOnboardingSlide infoOnboardingSlide);
}
