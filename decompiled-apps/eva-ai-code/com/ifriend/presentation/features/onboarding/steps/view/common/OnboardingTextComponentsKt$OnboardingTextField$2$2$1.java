package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingTextComponents.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingTextComponentsKt$OnboardingTextField$2$2$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ BoxScope $this_Box;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingTextComponentsKt$OnboardingTextField$2$2$1(BoxScope boxScope) {
        super(1);
        this.$this_Box = boxScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return this.$this_Box.matchParentSize(conditional);
    }
}
