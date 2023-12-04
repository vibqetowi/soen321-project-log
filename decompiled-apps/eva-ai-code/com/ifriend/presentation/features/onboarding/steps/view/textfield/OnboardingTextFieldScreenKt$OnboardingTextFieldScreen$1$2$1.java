package com.ifriend.presentation.features.onboarding.steps.view.textfield;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingTextFieldScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/KeyboardActionScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingTextFieldScreenKt$OnboardingTextFieldScreen$1$2$1 extends Lambda implements Function1<KeyboardActionScope, Unit> {
    final /* synthetic */ Function0<Unit> $onButtonClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingTextFieldScreenKt$OnboardingTextFieldScreen$1$2$1(Function0<Unit> function0) {
        super(1);
        this.$onButtonClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
        invoke2(keyboardActionScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KeyboardActionScope $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.$onButtonClick.invoke();
    }
}
