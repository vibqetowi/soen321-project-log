package com.ifriend.presentation.features.onboarding.steps.view.grid;

import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingGripScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingGripScreenKt$OnboardingGridScreen$1$1$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SelectButtonWithImageUiParams $button;
    final /* synthetic */ Function1<SelectButtonWithImageUiParams, Unit> $onButtonClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingGripScreenKt$OnboardingGridScreen$1$1$1$1$1$1(Function1<? super SelectButtonWithImageUiParams, Unit> function1, SelectButtonWithImageUiParams selectButtonWithImageUiParams) {
        super(0);
        this.$onButtonClick = function1;
        this.$button = selectButtonWithImageUiParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onButtonClick.invoke(this.$button);
    }
}
