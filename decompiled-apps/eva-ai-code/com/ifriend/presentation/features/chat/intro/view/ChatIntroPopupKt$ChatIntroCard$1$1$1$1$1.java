package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.buttons.ButtonWidgetsKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatIntroPopup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatIntroPopupKt$ChatIntroCard$1$1$1$1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCloseClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroPopupKt$ChatIntroCard$1$1$1$1$1(Function0<Unit> function0, int i) {
        super(3);
        this.$onCloseClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(191396230, i, -1, "com.ifriend.presentation.features.chat.intro.view.ChatIntroCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatIntroPopup.kt:245)");
        }
        float f = 55;
        ButtonWidgetsKt.m7022AppShadowButtonWithContentBHesuOE(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 11, null), Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(22), 0L, false, this.$onCloseClick, 0L, ComposableSingletons$ChatIntroPopupKt.INSTANCE.m6910getLambda2$presentation_release(), composer, 100666800 | ((this.$$dirty << 15) & 3670016), 176);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
