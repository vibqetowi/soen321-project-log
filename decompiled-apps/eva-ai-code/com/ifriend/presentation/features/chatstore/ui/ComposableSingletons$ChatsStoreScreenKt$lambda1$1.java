package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatsStoreScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", FirebaseAnalytics.Param.PRICE, "", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chatstore.ui.ComposableSingletons$ChatsStoreScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ChatsStoreScreenKt$lambda1$1 extends Lambda implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatsStoreScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ChatsStoreScreenKt$lambda1$1();

    ComposableSingletons$ChatsStoreScreenKt$lambda1$1() {
        super(4);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer, Integer num) {
        invoke(animatedContentScope, str, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, String price, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(price, "price");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(3047440, i, -1, "com.ifriend.presentation.features.chatstore.ui.ComposableSingletons$ChatsStoreScreenKt.lambda-1.<anonymous> (ChatsStoreScreen.kt:220)");
        }
        TextKt.m2145Text4IGK_g(price, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getButton(), composer, (i >> 3) & 14, 0, (int) WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
