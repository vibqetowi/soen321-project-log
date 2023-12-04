package com.ifriend.presentation.features.onboarding.steps.view.wheel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingWheelScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingWheelScreenKt$OnboardingWheelScreen$1$2$1 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ Function1<Integer, Unit> $onWheelItemSelected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingWheelScreenKt$OnboardingWheelScreen$1$2$1(Function1<? super Integer, Unit> function1) {
        super(1);
        this.$onWheelItemSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Integer invoke(int i) {
        this.$onWheelItemSelected.invoke(Integer.valueOf(i));
        return null;
    }
}
