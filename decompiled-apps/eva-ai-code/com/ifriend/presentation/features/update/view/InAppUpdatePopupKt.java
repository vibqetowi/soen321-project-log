package com.ifriend.presentation.features.update.view;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.ifriend.presentation.R;
import com.ifriend.ui.components.popup.AnimatedPopupKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InAppUpdatePopup.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\bj\u0002`\tH\u0007¢\u0006\u0002\u0010\n\u001a=\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0011\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"shadowColor", "Landroidx/compose/ui/graphics/Color;", "J", "InAppUpdateDownloadedSnackbar", "", "isVisible", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InAppUpdatesPopup", "canClose", "onUpdateClick", "onDismiss", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InAppUpdatesPopupPreview", "(Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdatePopupKt {
    private static final long shadowColor = ColorKt.Color(4288451310L);

    public static final void InAppUpdatesPopup(boolean z, boolean z2, Function0<Unit> onUpdateClick, Function0<Unit> onDismiss, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onUpdateClick, "onUpdateClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1252094140);
        ComposerKt.sourceInformation(startRestartGroup, "C(InAppUpdatesPopup)P(1!1,3)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onUpdateClick) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252094140, i2, -1, "com.ifriend.presentation.features.update.view.InAppUpdatesPopup (InAppUpdatePopup.kt:65)");
            }
            long m3326getTransparent0d7_KjU = Color.Companion.m3326getTransparent0d7_KjU();
            EnterTransition plus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, InAppUpdatePopupKt$InAppUpdatesPopup$1.INSTANCE, 1, null));
            ExitTransition plus2 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, InAppUpdatePopupKt$InAppUpdatesPopup$2.INSTANCE, 1, null));
            composer2 = startRestartGroup;
            AnimatedPopupKt.m7050FullscreenAnimatedPopupIkByU14(z, z2 ? onDismiss : InAppUpdatePopupKt$InAppUpdatesPopup$3.INSTANCE, m3326getTransparent0d7_KjU, null, null, z2, plus, plus2, ComposableLambdaKt.composableLambda(startRestartGroup, -925258345, true, new InAppUpdatePopupKt$InAppUpdatesPopup$4(onUpdateClick, i2, z2, onDismiss)), startRestartGroup, 114819456 | (i2 & 14) | ((i2 << 12) & 458752), 24);
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
        endRestartGroup.updateScope(new InAppUpdatePopupKt$InAppUpdatesPopup$5(z, z2, onUpdateClick, onDismiss, i));
    }

    public static final void InAppUpdateDownloadedSnackbar(boolean z, Function0<Unit> onClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(949611783);
        ComposerKt.sourceInformation(startRestartGroup, "C(InAppUpdateDownloadedSnackbar)");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949611783, i3, -1, "com.ifriend.presentation.features.update.view.InAppUpdateDownloadedSnackbar (InAppUpdatePopup.kt:208)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnackbarHostState snackbarHostState = (SnackbarHostState) rememberedValue;
            String stringResource = StringResources_androidKt.stringResource(R.string.in_app_update__snackbar_text, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.in_app_update__snackbar_action, startRestartGroup, 0);
            Boolean valueOf = Boolean.valueOf(z);
            Object[] objArr = {Boolean.valueOf(z), snackbarHostState, stringResource, stringResource2, onClick};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i4 = 0; i4 < 5; i4++) {
                z2 |= startRestartGroup.changed(objArr[i4]);
            }
            InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1(z, snackbarHostState, stringResource, stringResource2, onClick, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2) rememberedValue2, startRestartGroup, (i3 & 14) | 64);
            SnackbarHostKt.SnackbarHost(snackbarHostState, PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion), 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), ComposableSingletons$InAppUpdatePopupKt.INSTANCE.m7001getLambda3$presentation_release(), startRestartGroup, 390, 0);
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
        endRestartGroup.updateScope(new InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$2(z, onClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static final void InAppUpdatesPopupPreview(Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1934204136);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1934204136, i, -1, "com.ifriend.presentation.features.update.view.InAppUpdatesPopupPreview (InAppUpdatePopup.kt:241)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            TextKt.m2145Text4IGK_g("Can close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 6, 0, 131070);
            boolean InAppUpdatesPopupPreview$lambda$6 = InAppUpdatesPopupPreview$lambda$6(mutableState2);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState2);
            InAppUpdatePopupKt$InAppUpdatesPopupPreview$1$1$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new InAppUpdatePopupKt$InAppUpdatesPopupPreview$1$1$1$1(mutableState2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            SwitchKt.Switch(InAppUpdatesPopupPreview$lambda$6, rememberedValue3, null, null, false, null, null, startRestartGroup, 0, 124);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(mutableState);
            InAppUpdatePopupKt$InAppUpdatesPopupPreview$1$1$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new InAppUpdatePopupKt$InAppUpdatesPopupPreview$1$1$2$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.Button(rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$InAppUpdatePopupKt.INSTANCE.m7002getLambda4$presentation_release(), startRestartGroup, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_POSITION_TYPE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            boolean InAppUpdatesPopupPreview$lambda$3 = InAppUpdatesPopupPreview$lambda$3(mutableState);
            boolean InAppUpdatesPopupPreview$lambda$62 = InAppUpdatesPopupPreview$lambda$6(mutableState2);
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = composer2.changed(mutableState);
            InAppUpdatePopupKt$InAppUpdatesPopupPreview$2$1 rememberedValue5 = composer2.rememberedValue();
            if (changed3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new InAppUpdatePopupKt$InAppUpdatesPopupPreview$2$1(mutableState);
                composer2.updateRememberedValue(rememberedValue5);
            }
            composer2.endReplaceableGroup();
            Function0 function0 = rememberedValue5;
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed4 = composer2.changed(mutableState);
            InAppUpdatePopupKt$InAppUpdatesPopupPreview$3$1 rememberedValue6 = composer2.rememberedValue();
            if (changed4 || rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new InAppUpdatePopupKt$InAppUpdatesPopupPreview$3$1(mutableState);
                composer2.updateRememberedValue(rememberedValue6);
            }
            composer2.endReplaceableGroup();
            InAppUpdatesPopup(InAppUpdatesPopupPreview$lambda$3, InAppUpdatesPopupPreview$lambda$62, function0, rememberedValue6, composer2, 0);
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
        endRestartGroup.updateScope(new InAppUpdatePopupKt$InAppUpdatesPopupPreview$4(i));
    }

    private static final boolean InAppUpdatesPopupPreview$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InAppUpdatesPopupPreview$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean InAppUpdatesPopupPreview$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InAppUpdatesPopupPreview$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
