package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import com.ifriend.ui.theme.AppTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SelectChatStorePager.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"SelectChatStorePager", "", "modifier", "Landroidx/compose/ui/Modifier;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "chats", "", "Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectChatStorePagerKt {
    public static final void SelectChatStorePager(Modifier modifier, PagerState pagerState, List<ChatStoreUi> chats, Composer composer, int i, int i2) {
        float m7173getLargerD9Ej5fM;
        float m7167getExtraMediumD9Ej5fM;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(chats, "chats");
        Composer startRestartGroup = composer.startRestartGroup(635421511);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectChatStorePager)P(1,2)");
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(635421511, i, -1, "com.ifriend.presentation.features.chatstore.ui.SelectChatStorePager (SelectChatStorePager.kt:25)");
        }
        if (chats.size() == 1) {
            startRestartGroup.startReplaceableGroup(290765025);
            m7173getLargerD9Ej5fM = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(290765077);
            m7173getLargerD9Ej5fM = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7173getLargerD9Ej5fM();
            startRestartGroup.endReplaceableGroup();
        }
        PaddingValues m743PaddingValuesYgX7TsA$default = PaddingKt.m743PaddingValuesYgX7TsA$default(m7173getLargerD9Ej5fM, 0.0f, 2, null);
        startRestartGroup.startReplaceableGroup(290765335);
        if (chats.size() != 1) {
            m7167getExtraMediumD9Ej5fM = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7167getExtraMediumD9Ej5fM();
        } else {
            m7167getExtraMediumD9Ej5fM = Dp.m5607constructorimpl(0);
        }
        startRestartGroup.endReplaceableGroup();
        PagerKt.m967HorizontalPagerxYaah8o(pagerState, companion, m743PaddingValuesYgX7TsA$default, null, 0, m7167getExtraMediumD9Ej5fM, null, null, false, false, new SelectChatStorePagerKt$SelectChatStorePager$1(chats), null, ComposableLambdaKt.composableLambda(startRestartGroup, 1563188580, true, new SelectChatStorePagerKt$SelectChatStorePager$2(chats, m7173getLargerD9Ej5fM, pagerState, i)), startRestartGroup, ((i << 3) & 112) | ((i >> 3) & 14), 384, 3032);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SelectChatStorePagerKt$SelectChatStorePager$3(companion, pagerState, chats, i, i2));
    }
}
