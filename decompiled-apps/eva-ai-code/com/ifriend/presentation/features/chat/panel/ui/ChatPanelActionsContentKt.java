package com.ifriend.presentation.features.chat.panel.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPanelActionsContent.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0007¢\u0006\u0002\u0010\f\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"unknownChatItemException", "", "", "getUnknownChatItemException", "(Ljava/lang/Object;)Ljava/lang/Void;", "ChatPanelActionsContent", "", "state", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "onPanelActionClick", "Lkotlin/Function1;", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPanelActionsContentKt {
    public static final void ChatPanelActionsContent(ChatTopicsUiState state, Function1<? super ChatPanelActionMarker, Unit> onPanelActionClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPanelActionClick, "onPanelActionClick");
        Composer startRestartGroup = composer.startRestartGroup(-2030157903);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatPanelActionsContent)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onPanelActionClick) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2030157903, i, -1, "com.ifriend.presentation.features.chat.panel.ui.ChatPanelActionsContent (ChatPanelActionsContent.kt:26)");
            }
            composer2 = startRestartGroup;
            LazyDslKt.LazyRow(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 7, null), null, PaddingKt.m743PaddingValuesYgX7TsA$default(AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, null, null, null, false, new ChatPanelActionsContentKt$ChatPanelActionsContent$1(state, onPanelActionClick), startRestartGroup, 0, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatPanelActionsContentKt$ChatPanelActionsContent$2(state, onPanelActionClick, i));
    }

    private static final Void getUnknownChatItemException(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown chat  panel action class=" + simpleName);
    }
}
