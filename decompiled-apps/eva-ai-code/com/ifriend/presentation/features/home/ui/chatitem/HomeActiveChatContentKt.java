package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.ifriend.presentation.features.home.ui.messages.HomeChatMessageContentKt;
import com.ifriend.presentation.features.home.ui.models.HomeActiveChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.ui.features.chat.ChatNameContentKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
/* compiled from: HomeActiveChatContent.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a,\u0010\f\u001a\u00020\u0006*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0012\u001a\f\u0010\u0013\u001a\u00020\b*\u00020\bH\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"unknownChatItemException", "", "", "getUnknownChatItemException", "(Ljava/lang/Object;)Ljava/lang/Void;", "HomeActiveChatContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "chat", "Lcom/ifriend/presentation/features/home/ui/models/HomeActiveChatUi;", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/home/ui/models/HomeActiveChatUi;Landroidx/compose/runtime/Composer;II)V", "activeChatsItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "activeChats", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "onChatClick", "Lkotlin/Function1;", "homeChatCardBorder", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeActiveChatContentKt {
    public static final void activeChatsItems(LazyListScope lazyListScope, ImmutableList<? extends HomeChatUi> activeChats, Function1<? super HomeChatUi, Unit> onChatClick) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(activeChats, "activeChats");
        Intrinsics.checkNotNullParameter(onChatClick, "onChatClick");
        HomeActiveChatContentKt$activeChatsItems$1 homeActiveChatContentKt$activeChatsItems$1 = HomeActiveChatContentKt$activeChatsItems$1.INSTANCE;
        ImmutableList<? extends HomeChatUi> immutableList = activeChats;
        lazyListScope.items(immutableList.size(), homeActiveChatContentKt$activeChatsItems$1 != null ? new HomeActiveChatContentKt$activeChatsItems$$inlined$items$default$2(homeActiveChatContentKt$activeChatsItems$1, immutableList) : null, new HomeActiveChatContentKt$activeChatsItems$$inlined$items$default$3(HomeActiveChatContentKt$activeChatsItems$$inlined$items$default$1.INSTANCE, immutableList), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new HomeActiveChatContentKt$activeChatsItems$$inlined$items$default$4(immutableList, onChatClick)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier homeChatCardBorder(Modifier modifier) {
        return DrawModifierKt.drawWithContent(modifier, HomeActiveChatContentKt$homeChatCardBorder$1.INSTANCE);
    }

    private static final Void getUnknownChatItemException(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown active chat item class=" + simpleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeActiveChatContent(Modifier modifier, HomeActiveChatUi homeActiveChatUi, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Modifier.Companion companion;
        long m7101getLight100d7_KjU;
        Composer startRestartGroup = composer.startRestartGroup(-645003181);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(homeActiveChatUi) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-645003181, i, -1, "com.ifriend.presentation.features.home.ui.chatitem.HomeActiveChatContent (HomeActiveChatContent.kt:137)");
            }
            Modifier height = IntrinsicKt.height(companion, IntrinsicSize.Max);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(height);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            HomeChatCommonContentKt.HomeChatAvatarContent(homeActiveChatUi.getChatAvatarUri(), homeActiveChatUi.getAvatarBadgeLabel(), startRestartGroup, 0);
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChatNameContentKt.ChatNameContent(null, homeActiveChatUi.getChatName(), homeActiveChatUi.isVerified(), null, startRestartGroup, 0, 9);
            startRestartGroup.startReplaceableGroup(1136965587);
            if (homeActiveChatUi.getLastMessage() != null) {
                HomeChatMessageContentKt.HomeChatMessageContent(homeActiveChatUi.getLastMessage(), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            String unreadMessagesCount = homeActiveChatUi.getUnreadMessagesCount();
            String time = homeActiveChatUi.getTime();
            boolean isInfluencer = homeActiveChatUi.isInfluencer();
            startRestartGroup.startReplaceableGroup(1136965893);
            if (homeActiveChatUi.isInfluencer()) {
                m7101getLight100d7_KjU = AppColors.Companion.m7142getViolet0d7_KjU();
            } else {
                m7101getLight100d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7101getLight100d7_KjU();
            }
            startRestartGroup.endReplaceableGroup();
            HomeChatCommonContentKt.m6931HomeActiveChatMessageInfojA1GFJw(unreadMessagesCount, time, isInfluencer, 0L, m7101getLight100d7_KjU, startRestartGroup, 0, 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = obj;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new HomeActiveChatContentKt$HomeActiveChatContent$2(companion, homeActiveChatUi, i, i2));
    }
}
