package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftsActionContent.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "colorGradient1", "Landroidx/compose/ui/graphics/Color;", "J", "colorGradient2", "ChatGiftsActionContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "uiState", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "onGiftsClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsActionContentKt {
    private static final Brush brush;
    private static final long colorGradient1;
    private static final long colorGradient2;

    static {
        long Color = ColorKt.Color(4288976880L);
        colorGradient1 = Color;
        long Color2 = ColorKt.Color(4284640478L);
        colorGradient2 = Color2;
        brush = Brush.Companion.m3240horizontalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color), Color.m3281boximpl(Color2)}), 0.0f, 0.0f, 0, 14, (Object) null);
    }

    public static final Brush getBrush() {
        return brush;
    }

    public static final void ChatGiftsActionContent(Modifier modifier, ChatGiftsUiState uiState, Function0<Unit> onGiftsClick, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onGiftsClick, "onGiftsClick");
        Composer startRestartGroup = composer.startRestartGroup(1740176156);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatGiftsActionContent)P(!1,2)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(uiState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onGiftsClick) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1740176156, i3, -1, "com.ifriend.presentation.features.chat.gifts.view.ChatGiftsActionContent (ChatGiftsActionContent.kt:36)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(uiState.getCanShowGiftButton(), modifier, EnterExitTransitionKt.slideInHorizontally$default(null, ChatGiftsActionContentKt$ChatGiftsActionContent$1.INSTANCE, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, ChatGiftsActionContentKt$ChatGiftsActionContent$2.INSTANCE, 1, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1207704764, true, new ChatGiftsActionContentKt$ChatGiftsActionContent$3(onGiftsClick, i3, uiState)), startRestartGroup, ((i3 << 3) & 112) | 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatGiftsActionContentKt$ChatGiftsActionContent$4(modifier2, uiState, onGiftsClick, i, i2));
    }
}
