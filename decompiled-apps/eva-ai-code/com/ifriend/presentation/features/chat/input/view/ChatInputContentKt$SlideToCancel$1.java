package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.ifriend.presentation.R;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$SlideToCancel$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ float $alpha;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$SlideToCancel$1(float f) {
        super(3);
        this.$alpha = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1333800349, i, -1, "com.ifriend.presentation.features.chat.input.view.SlideToCancel.<anonymous> (ChatInputContent.kt:690)");
        }
        State animateValue = InfiniteTransitionKt.animateValue(InfiniteTransitionKt.rememberInfiniteTransition("SlideToCancel::infiniteTransition", composer, 6, 0), Dp.m5605boximpl(Dp.m5607constructorimpl(0)), Dp.m5605boximpl(Dp.m5607constructorimpl(-AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7176getSmallD9Ej5fM())), VectorConvertersKt.getVectorConverter(Dp.Companion), AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "SlideToCancel::offset", composer, (InfiniteRepeatableSpec.$stable << 12) | 200752 | InfiniteTransition.$stable, 0);
        String upperCase = StringResources_androidKt.stringResource(R.string.chat_input__slide_to_cancel, composer, 0).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        long sp = TextUnitKt.getSp(14);
        FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
        FontWeight normal = FontWeight.Companion.getNormal();
        TextKt.m2145Text4IGK_g(upperCase, PaddingKt.m750paddingVpY3zN4$default(OffsetKt.m709offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(AlphaKt.alpha(Modifier.Companion, this.$alpha), 0.0f, 1, null), ((Dp) animateValue.getValue()).m5621unboximpl(), 0.0f, 2, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), Color.m3290copywmQWz5c$default(AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, normal, ibmSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5474getStarte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
