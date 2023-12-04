package com.ifriend.presentation.features.profile.header.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.profile.header.view.ComposableSingletons$ChatHeaderContentKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ChatHeaderContentKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatHeaderContentKt$lambda2$1 INSTANCE = new ComposableSingletons$ChatHeaderContentKt$lambda2$1();

    ComposableSingletons$ChatHeaderContentKt$lambda2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r37v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(301052351, i, -1, "com.ifriend.presentation.features.profile.header.view.ComposableSingletons$ChatHeaderContentKt.lambda-2.<anonymous> (ChatHeaderContent.kt:208)");
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(BackgroundKt.m421backgroundbw27NRU$default(Modifier.Companion, ColorKt.Color(4278848010L), null, 2, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7172getLargeD9Ej5fM(), 7, null);
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ChatHeaderUiState(null, "Eva", 2, 0.5f, "lvl 10", true, "300", true, true, false, false, false, 3585, null), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            ChatHeaderContentKt.ChatScreenHeaderContent(invoke$lambda$11$lambda$1(mutableState), null, null, composer, 8, 6);
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(verticalScroll$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f = 8;
            TextKt.m2145Text4IGK_g("Back Button:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            boolean isVisibleBackButton = invoke$lambda$11$lambda$1(mutableState).isVisibleBackButton();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$1$1 rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$1$1(mutableState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            CheckboxKt.Checkbox(isVisibleBackButton, rememberedValue2, null, false, null, null, composer, 0, 60);
            TextKt.m2145Text4IGK_g("Menu Button:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            boolean isVisibleMenuButton = invoke$lambda$11$lambda$1(mutableState).isVisibleMenuButton();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$2$1 rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$2$1(mutableState);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            CheckboxKt.Checkbox(isVisibleMenuButton, rememberedValue3, null, false, null, null, composer, 0, 60);
            TextKt.m2145Text4IGK_g("Menu Indicator:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            boolean isVisibleMenuIndicator = invoke$lambda$11$lambda$1(mutableState).isVisibleMenuIndicator();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$3$1 rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$3$1(mutableState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            CheckboxKt.Checkbox(isVisibleMenuIndicator, rememberedValue4, null, false, null, null, composer, 0, 60);
            TextKt.m2145Text4IGK_g("Update Indicator:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            boolean isVisibleUpdateIndicator = invoke$lambda$11$lambda$1(mutableState).isVisibleUpdateIndicator();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed4 = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$4$1 rememberedValue5 = composer.rememberedValue();
            if (changed4 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$4$1(mutableState);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            CheckboxKt.Checkbox(isVisibleUpdateIndicator, rememberedValue5, null, false, null, null, composer, 0, 60);
            TextKt.m2145Text4IGK_g("Lvl:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            boolean isVisibleLvlProgress = invoke$lambda$11$lambda$1(mutableState).isVisibleLvlProgress();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed5 = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$5$1 rememberedValue6 = composer.rememberedValue();
            if (changed5 || rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$5$1(mutableState);
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            CheckboxKt.Checkbox(isVisibleLvlProgress, rememberedValue6, null, false, null, null, composer, 0, 60);
            TextKt.m2145Text4IGK_g("Balance:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            TextKt.m2145Text4IGK_g("Unread:", PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m3328getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) composer, 438, 0, 131064);
            boolean isVisibleUnreadIndicator = invoke$lambda$11$lambda$1(mutableState).isVisibleUnreadIndicator();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed6 = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$6$1 rememberedValue7 = composer.rememberedValue();
            if (changed6 || rememberedValue7 == Composer.Companion.getEmpty()) {
                rememberedValue7 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$6$1(mutableState);
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceableGroup();
            CheckboxKt.Checkbox(isVisibleUnreadIndicator, rememberedValue7, null, false, null, null, composer, 0, 60);
            float lvlProgress = invoke$lambda$11$lambda$1(mutableState).getLvlProgress();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed7 = composer.changed(mutableState);
            ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$7$1 rememberedValue8 = composer.rememberedValue();
            if (changed7 || rememberedValue8 == Composer.Companion.getEmpty()) {
                rememberedValue8 = new ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$7$1(mutableState);
                composer.updateRememberedValue(rememberedValue8);
            }
            composer.endReplaceableGroup();
            SliderKt.Slider(lvlProgress, rememberedValue8, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), false, null, 0, null, null, null, composer, 0, 504);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatHeaderUiState invoke$lambda$11$lambda$1(MutableState<ChatHeaderUiState> mutableState) {
        return mutableState.getValue();
    }
}
