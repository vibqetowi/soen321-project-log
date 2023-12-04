package com.ifriend.presentation.features.profile.confirmemail;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfirmUserEmailScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmUserEmailScreenKt$ConfirmUserEmailScreen$1$2 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ ConfirmEmailViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmUserEmailScreenKt$ConfirmUserEmailScreen$1$2(ConfirmEmailViewModel.UiState uiState) {
        super(3);
        this.$state = uiState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-205656179, i, -1, "com.ifriend.presentation.features.profile.confirmemail.ConfirmUserEmailScreen.<anonymous>.<anonymous> (ConfirmUserEmailScreen.kt:91)");
        }
        ConfirmUserEmailScreenKt.GetNeuronsContent(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(BackgroundKt.m420backgroundbw27NRU(PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(10), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 7, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7102getLight200d7_KjU(), RoundedCornerShapeKt.getCircleShape()), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7168getExtraSmallD9Ej5fM(), 1, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), this.$state.getNeurons(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
