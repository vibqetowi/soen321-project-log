package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroCardUiParams;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatIntroPopup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatIntroPopupKt$ChatIntroCard$1$1$1$1$2 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ ChatIntroCardUiParams $params;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroPopupKt$ChatIntroCard$1$1$1$1$2(ChatIntroCardUiParams chatIntroCardUiParams) {
        super(3);
        this.$params = chatIntroCardUiParams;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope AppShadowButtonWithContent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(AppShadowButtonWithContent, "$this$AppShadowButtonWithContent");
        if ((i & 14) == 0) {
            i2 = (composer.changed(AppShadowButtonWithContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249952966, i, -1, "com.ifriend.presentation.features.chat.intro.view.ChatIntroCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatIntroPopup.kt:265)");
            }
            AnimatedContentKt.AnimatedContent(this.$params.getButtonLabel(), null, null, null, "InfluencerIntroCardButton", null, ComposableLambdaKt.composableLambda(composer, -623105968, true, new AnonymousClass1(AppShadowButtonWithContent)), composer, 1597440, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatIntroPopup.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "state", "", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.intro.view.ChatIntroPopupKt$ChatIntroCard$1$1$1$1$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
        final /* synthetic */ BoxScope $this_AppShadowButtonWithContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BoxScope boxScope) {
            super(4);
            this.$this_AppShadowButtonWithContent = boxScope;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer, Integer num) {
            invoke(animatedContentScope, str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, String state, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-623105968, i, -1, "com.ifriend.presentation.features.chat.intro.view.ChatIntroCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatIntroPopup.kt:269)");
            }
            long sp = TextUnitKt.getSp(16);
            FontFamily sfProDisplay = AppFontFamily.INSTANCE.getSfProDisplay();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.m2145Text4IGK_g(state, this.$this_AppShadowButtonWithContent.align(Modifier.Companion, Alignment.Companion.getCenter()), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, bold, sfProDisplay, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ((i >> 3) & 14) | 199680, 0, 130448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
