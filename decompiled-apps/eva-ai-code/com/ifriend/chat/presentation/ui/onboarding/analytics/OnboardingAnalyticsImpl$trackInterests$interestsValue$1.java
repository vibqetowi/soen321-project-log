package com.ifriend.chat.presentation.ui.onboarding.analytics;

import com.ifriend.domain.models.common.ChatInterestsType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingAnalyticsImpl$trackInterests$interestsValue$1 extends Lambda implements Function1<ChatInterestsType, CharSequence> {
    public static final OnboardingAnalyticsImpl$trackInterests$interestsValue$1 INSTANCE = new OnboardingAnalyticsImpl$trackInterests$interestsValue$1();

    OnboardingAnalyticsImpl$trackInterests$interestsValue$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ChatInterestsType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.name();
    }
}
