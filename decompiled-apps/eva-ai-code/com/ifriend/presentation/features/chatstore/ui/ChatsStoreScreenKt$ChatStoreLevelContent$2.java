package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt$ChatStoreLevelContent$2 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $unlockMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreScreenKt$ChatStoreLevelContent$2(String str, int i) {
        super(3);
        this.$unlockMessage = str;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope NeomorphicDarkLightButton, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(NeomorphicDarkLightButton, "$this$NeomorphicDarkLightButton");
        if ((i & 14) == 0) {
            i2 = (composer.changed(NeomorphicDarkLightButton) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-337300562, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatStoreLevelContent.<anonymous> (ChatsStoreScreen.kt:175)");
            }
            AnimatedContentKt.AnimatedContent(this.$unlockMessage, null, null, null, "ChatStoreLevelContent", null, ComposableLambdaKt.composableLambda(composer, -312644136, true, new AnonymousClass1(NeomorphicDarkLightButton)), composer, 1597440 | (this.$$dirty & 14), 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsStoreScreen.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "unlockMessage", "", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreenKt$ChatStoreLevelContent$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
        final /* synthetic */ BoxScope $this_NeomorphicDarkLightButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BoxScope boxScope) {
            super(4);
            this.$this_NeomorphicDarkLightButton = boxScope;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer, Integer num) {
            invoke(animatedContentScope, str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, String unlockMessage, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(unlockMessage, "unlockMessage");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312644136, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatStoreLevelContent.<anonymous>.<anonymous> (ChatsStoreScreen.kt:179)");
            }
            TextKt.m2145Text4IGK_g(unlockMessage, PaddingKt.m750paddingVpY3zN4$default(this.$this_NeomorphicDarkLightButton.align(Modifier.Companion, Alignment.Companion.getCenter()), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7176getSmallD9Ej5fM(), 1, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5517getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getTitleItemSemiBold(), composer, (i >> 3) & 14, 3120, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
