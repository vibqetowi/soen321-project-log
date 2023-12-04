package com.ifriend.presentation.features.chatsettings.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
/* compiled from: ChatSettingsActionTagsContent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ActionTag", "", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;", "onClick", "Lkotlin/Function1;", "(Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ChatSettingsActionTagsContent", "actionTags", "Lkotlinx/collections/immutable/ImmutableList;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsActionTagsContentKt {
    public static final void ChatSettingsActionTagsContent(ImmutableList<ChatSettingsViewModel.UiState.ActionTag> actionTags, Function1<? super ChatSettingsViewModel.UiState.ActionTag, Unit> onClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(actionTags, "actionTags");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1294415817);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSettingsActionTagsContent)");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(actionTags) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1294415817, i2, -1, "com.ifriend.presentation.features.chatsettings.ui.ChatSettingsActionTagsContent (ChatSettingsActionTagsContent.kt:27)");
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            startRestartGroup.startReplaceableGroup(1098475987);
            ComposerKt.sourceInformation(startRestartGroup, "CC(FlowRow)P(3,1,4,2)61@2468L113,66@2586L134:FlowLayout.kt#2w3rfo");
            MeasurePolicy rowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(10)), Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(4)), Integer.MAX_VALUE, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurementHelper, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 483375157, "C67@2635L9:FlowLayout.kt#2w3rfo");
            FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1393895295);
            for (ChatSettingsViewModel.UiState.ActionTag actionTag : actionTags) {
                ActionTag(actionTag, onClick, startRestartGroup, i2 & 112);
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
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSettingsActionTagsContentKt$ChatSettingsActionTagsContent$2(actionTags, onClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ActionTag(ChatSettingsViewModel.UiState.ActionTag actionTag, Function1<? super ChatSettingsViewModel.UiState.ActionTag, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1174392126);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(actionTag) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1174392126, i2, -1, "com.ifriend.presentation.features.chatsettings.ui.ActionTag (ChatSettingsActionTagsContent.kt:48)");
            }
            Modifier.Companion companion = Modifier.Companion;
            long m7101getLight100d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7101getLight100d7_KjU();
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            boolean isClickable = actionTag.isClickable();
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(function1) | startRestartGroup.changed(actionTag);
            ChatSettingsActionTagsContentKt$ActionTag$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChatSettingsActionTagsContentKt$ActionTag$1$1(function1, actionTag);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg((Function0) rememberedValue, companion, isClickable, circleShape, m7101getLight100d7_KjU, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 303308499, true, new ChatSettingsActionTagsContentKt$ActionTag$2(actionTag)), composer2, 48, 6, 992);
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
        endRestartGroup.updateScope(new ChatSettingsActionTagsContentKt$ActionTag$3(actionTag, function1, i));
    }
}
