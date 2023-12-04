package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingWheelPickerComponentKt$calculateAnimatedRotationX$layoutInfo$1$1 extends Lambda implements Function0<LazyListLayoutInfo> {
    final /* synthetic */ LazyListState $lazyListState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingWheelPickerComponentKt$calculateAnimatedRotationX$layoutInfo$1$1(LazyListState lazyListState) {
        super(0);
        this.$lazyListState = lazyListState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LazyListLayoutInfo invoke() {
        return this.$lazyListState.getLayoutInfo();
    }
}
