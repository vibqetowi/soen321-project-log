package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", TypedValues.AttributesType.S_TARGET, "", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.purchases.premium.screen.ComposableSingletons$BuyPremiumScreenKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$BuyPremiumScreenKt$lambda2$1 extends Lambda implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
    public static final ComposableSingletons$BuyPremiumScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$BuyPremiumScreenKt$lambda2$1();

    ComposableSingletons$BuyPremiumScreenKt$lambda2$1() {
        super(4);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer, Integer num) {
        invoke(animatedContentScope, str, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, String target, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(target, "target");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2040659447, i, -1, "com.ifriend.presentation.features.purchases.premium.screen.ComposableSingletons$BuyPremiumScreenKt.lambda-2.<anonymous> (BuyPremiumScreen.kt:184)");
        }
        long sp = TextUnitKt.getSp(16);
        FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
        FontWeight semiBold = FontWeight.Companion.getSemiBold();
        int m5469getCentere0LSkKk = TextAlign.Companion.m5469getCentere0LSkKk();
        TextKt.m2145Text4IGK_g(target, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, semiBold, ibmSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(m5469getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ((i >> 3) & 14) | 199680, 0, 130448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
