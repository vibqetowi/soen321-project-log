package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DismissState;
import androidx.compose.material3.SwipeToDismissKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.ui.theme.AppTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001aM\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0012*$\b\u0002\u0010\u0013\"\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00142\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014¨\u0006\u0016²\u0006 \u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014j\u0002`\u00190\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018X\u008a\u008e\u0002"}, d2 = {"ChatNotificationItem", "", "item", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "onClick", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChatNotificationPreview", "(Landroidx/compose/runtime/Composer;I)V", "ChatNotificationsContent", FirebaseAnalytics.Param.ITEMS, "Lkotlinx/collections/immutable/ImmutableList;", "onItemClick", "Lkotlin/Function1;", "onItemDismiss", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ItemWithVisibility", "Lkotlin/Pair;", "", "presentation_release", "internalItems", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/chat/notifications/view/ItemWithVisibility;", "order", "", "list"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsContentKt {
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatNotificationsContent(ImmutableList<ChatNotificationUi> items, Function1<? super ChatNotificationUi, Unit> onItemClick, Function1<? super ChatNotificationUi, Unit> onItemDismiss, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object rememberedValue;
        MutableState mutableState;
        boolean changed;
        ChatNotificationsContentKt$ChatNotificationsContent$1$1 rememberedValue2;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Iterator it;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onItemDismiss, "onItemDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-203612871);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatNotificationsContent)P(!1,2,3)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(items) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onItemDismiss) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-203612871, i3, -1, "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContent (ChatNotificationsContent.kt:81)");
                }
                int i5 = -492369756;
                startRestartGroup.startReplaceableGroup(-492369756);
                String str = "CC(remember):Composables.kt#9igjgp";
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentListOf(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(items);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ChatNotificationsContentKt$ChatNotificationsContent$1$1(items, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(items, (Function2) rememberedValue2, startRestartGroup, (i3 & 14) | 64);
                Alignment.Horizontal start = Alignment.Companion.getStart();
                int i6 = ((i3 >> 9) & 14) | 384;
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                int i7 = i6 >> 3;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, startRestartGroup, (i7 & 112) | (i7 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                int i9 = 3;
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                int i10 = ((i6 >> 6) & 112) | 6;
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-555530623);
                it = ChatNotificationsContent$lambda$1(mutableState).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair.component1()).booleanValue();
                    ChatNotificationUi chatNotificationUi = (ChatNotificationUi) pair.component2();
                    startRestartGroup.startMovableGroup(-1264952487, chatNotificationUi.getId());
                    startRestartGroup.startReplaceableGroup(i5);
                    ComposerKt.sourceInformation(startRestartGroup, str);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new MutableTransitionState(false);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue3;
                    mutableTransitionState.setTargetState(Boolean.valueOf(booleanValue));
                    EffectsKt.LaunchedEffect(Boolean.valueOf(mutableTransitionState.isIdle()), new ChatNotificationsContentKt$ChatNotificationsContent$2$1(mutableTransitionState, booleanValue, chatNotificationUi, mutableState, null), startRestartGroup, 64);
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, mutableTransitionState, (Modifier) null, EnterExitTransitionKt.slideInVertically(AnimationSpecKt.spring$default(0.0f, 200.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null), ChatNotificationsContentKt$ChatNotificationsContent$2$2.INSTANCE).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, i9, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.spring$default(0.0f, 200.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, i9, null)), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 662776495, true, new ChatNotificationsContentKt$ChatNotificationsContent$2$3(chatNotificationUi, onItemClick, onItemDismiss)), startRestartGroup, 1572864 | (i10 & 14) | (MutableTransitionState.$stable << i9), 18);
                    startRestartGroup.endMovableGroup();
                    i9 = i9;
                    mutableState = mutableState;
                    str = str;
                    i5 = -492369756;
                }
                startRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                obj = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ChatNotificationsContentKt$ChatNotificationsContent$3(items, onItemClick, onItemDismiss, obj, i, i2));
            return;
        }
        obj = modifier;
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i52 = -492369756;
        startRestartGroup.startReplaceableGroup(-492369756);
        String str2 = "CC(remember):Composables.kt#9igjgp";
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(items);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new ChatNotificationsContentKt$ChatNotificationsContent$1$1(items, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(items, (Function2) rememberedValue2, startRestartGroup, (i3 & 14) | 64);
        Alignment.Horizontal start2 = Alignment.Companion.getStart();
        int i62 = ((i3 >> 9) & 14) | 384;
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        int i72 = i62 >> 3;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start2, startRestartGroup, (i72 & 112) | (i72 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
        int i82 = ((((i62 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        int i92 = 3;
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i82 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        int i102 = ((i62 >> 6) & 112) | 6;
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-555530623);
        it = ChatNotificationsContent$lambda$1(mutableState).iterator();
        while (it.hasNext()) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersistentList<Pair<Boolean, ChatNotificationUi>> ChatNotificationsContent$lambda$1(MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatNotificationsContent$removeItem(MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> mutableState, String str) {
        ArrayList arrayList = new ArrayList();
        for (Pair<Boolean, ChatNotificationUi> pair : ChatNotificationsContent$lambda$1(mutableState)) {
            if (!Intrinsics.areEqual(pair.component2().getId(), str)) {
                arrayList.add(pair);
            }
        }
        mutableState.setValue(ExtensionsKt.toPersistentList(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatNotificationItem(ChatNotificationUi chatNotificationUi, Function0<Unit> function0, Function0<Unit> function02, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1201146415);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(chatNotificationUi) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201146415, i5, -1, "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationItem (ChatNotificationsContent.kt:158)");
            }
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(function02);
            ChatNotificationsContentKt$ChatNotificationItem$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChatNotificationsContentKt$ChatNotificationItem$1$1(function02);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SwipeToDismissKt.SwipeToDismiss(SwipeToDismissKt.rememberDismissState(null, (Function1) rememberedValue, null, startRestartGroup, 0, 5), ComposableSingletons$ChatNotificationsContentKt.INSTANCE.m6913getLambda1$presentation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1182149379, true, new ChatNotificationsContentKt$ChatNotificationItem$2(function0, i5, chatNotificationUi)), modifier, null, startRestartGroup, DismissState.$stable | 432 | (i5 & 7168), 16);
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
        endRestartGroup.updateScope(new ChatNotificationsContentKt$ChatNotificationItem$3(chatNotificationUi, function0, function02, modifier2, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v38 */
    public static final void ChatNotificationPreview(Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(768341936);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(768341936, i, -1, "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationPreview (ChatNotificationsContent.kt:244)");
            }
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"https://drive.google.com/uc?export=download&id=1B6ddYFI03qyv-rKUD34tTxvTn3lX418W", "https://drive.google.com/uc?export=download&id=1z3adAN6Xj-ZFeggOorOQ07dWJxrhUXDV", "https://drive.google.com/uc?export=download&id=1m4UzeamkWA1nMOGAlNmYEEWn7Eh5Wlhu"});
            List listOf2 = CollectionsKt.listOf((Object[]) new String[]{"Siarhei", "Alex", "Denis"});
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentListOf(ChatNotificationPreview$createMessage(listOf2, listOf, mutableIntState)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue2;
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(BackgroundKt.background$default(Modifier.Companion, Brush.Companion.m3248verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.Companion.m3319getCyan0d7_KjU()), Color.m3281boximpl(Color.Companion.m3329getYellow0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 1, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
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
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChatNotificationsContent(ChatNotificationPreview$lambda$13(mutableState), ChatNotificationsContentKt$ChatNotificationPreview$1$1.INSTANCE, ChatNotificationsContentKt$ChatNotificationPreview$1$2.INSTANCE, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 2, null), startRestartGroup, 432, 0);
            SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), startRestartGroup, 0);
            float f = 16;
            ButtonKt.Button(new ChatNotificationsContentKt$ChatNotificationPreview$1$3(mutableState, listOf2, listOf, mutableIntState), PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5607constructorimpl(f), 0.0f, 2, null), false, null, null, null, null, null, null, ComposableSingletons$ChatNotificationsContentKt.INSTANCE.m6914getLambda2$presentation_release(), startRestartGroup, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            ChatNotificationsContentKt$ChatNotificationPreview$1$4$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ChatNotificationsContentKt$ChatNotificationPreview$1$4$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            ButtonKt.Button(rememberedValue3, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5607constructorimpl(f), 0.0f, 2, null), false, null, null, null, null, null, null, ComposableSingletons$ChatNotificationsContentKt.INSTANCE.m6915getLambda3$presentation_release(), startRestartGroup, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            ButtonKt.Button(new ChatNotificationsContentKt$ChatNotificationPreview$1$5(mutableState, listOf2, listOf, mutableIntState), PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5607constructorimpl(f), 0.0f, 2, null), false, null, null, null, null, null, null, ComposableSingletons$ChatNotificationsContentKt.INSTANCE.m6916getLambda4$presentation_release(), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new ChatNotificationsContentKt$ChatNotificationPreview$2(i));
    }

    private static final int ChatNotificationPreview$lambda$10(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatNotificationUi ChatNotificationPreview$createMessage(List<String> list, List<String> list2, MutableIntState mutableIntState) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String str = CollectionsKt.random(list, Random.Default) + " - " + uuid;
        String str2 = (String) CollectionsKt.random(list2, Random.Default);
        int ChatNotificationPreview$lambda$10 = ChatNotificationPreview$lambda$10(mutableIntState);
        mutableIntState.setIntValue(ChatNotificationPreview$lambda$10 + 1);
        return new ChatNotificationUi(uuid, "1234567890", str, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", false, str2, null, ChatNotificationPreview$lambda$10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersistentList<ChatNotificationUi> ChatNotificationPreview$lambda$13(MutableState<PersistentList<ChatNotificationUi>> mutableState) {
        return mutableState.getValue();
    }
}
