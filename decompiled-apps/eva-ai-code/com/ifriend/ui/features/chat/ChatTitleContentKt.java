package com.ifriend.ui.features.chat;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTitleContent.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"ChatTitleContent", "", "title", "", "lvlLabel", "lvlProgress", "", "isLvlVisible", "", "isUpdateVisible", "isVerifiedVisible", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;FZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CircleIndicator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatTitleContentKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatTitleContent(String title, String lvlLabel, float f, boolean z, boolean z2, boolean z3, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int currentCompositeKeyHash2;
        Composer m2893constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m2893constructorimpl3;
        Composer composer2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
        Composer startRestartGroup = composer.startRestartGroup(260808098);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatTitleContent)P(6,3,4)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(lvlLabel) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 1048576 : 524288;
            i4 = i3;
            if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(260808098, i4, -1, "com.ifriend.ui.features.chat.ChatTitleContent (ChatTitleContent.kt:34)");
                }
                int i6 = (i4 >> 18) & 14;
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                int i7 = i6 >> 3;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, (i7 & 112) | (i7 & 14));
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
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m2145Text4IGK_g(title, (Modifier) null, AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getBold(), AppFontFamily.INSTANCE.getSfProDisplay(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i4 & 14) | 1772544, 0, 130962);
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatTitleContentKt.INSTANCE.m7079getLambda1$common_ui_release(), startRestartGroup, 1572870 | ((i4 >> 9) & 112), 30);
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatTitleContentKt.INSTANCE.m7080getLambda2$common_ui_release(), startRestartGroup, 1572870 | ((i4 >> 12) & 112), 30);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7178getSmallestD9Ej5fM()), startRestartGroup, 0);
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                TextKt.m2145Text4IGK_g(lvlLabel, PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7178getSmallestD9Ej5fM(), 0.0f, 11, null), AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.Companion.getNormal(), AppFontFamily.INSTANCE.getSfProDisplay(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | 1772544, 0, 130960);
                composer2 = startRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance2, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, -1751265383, true, new ChatTitleContentKt$ChatTitleContent$1$2$1(f, i4)), composer2, 1572870 | ((i4 >> 6) & 112), 30);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ChatTitleContentKt$ChatTitleContent$2(title, lvlLabel, f, z, z2, z3, modifier2, i, i2));
            return;
        }
        obj = modifier;
        i4 = i3;
        if ((2995931 & i4) == 599186) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i62 = (i4 >> 18) & 14;
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        int i72 = i62 >> 3;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, (i72 & 112) | (i72 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
        int i82 = ((((i62 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
        modifierMaterializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i82 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl2.getInserting()) {
        }
        m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        TextKt.m2145Text4IGK_g(title, (Modifier) null, AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getBold(), AppFontFamily.INSTANCE.getSfProDisplay(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i4 & 14) | 1772544, 0, 130962);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance3, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatTitleContentKt.INSTANCE.m7079getLambda1$common_ui_release(), startRestartGroup, 1572870 | ((i4 >> 9) & 112), 30);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance3, z3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatTitleContentKt.INSTANCE.m7080getLambda2$common_ui_release(), startRestartGroup, 1572870 | ((i4 >> 12) & 112), 30);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7178getSmallestD9Ej5fM()), startRestartGroup, 0);
        Alignment.Vertical centerVertically22 = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl3, rowMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl3.getInserting()) {
        }
        m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        modifierMaterializerOf32.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        TextKt.m2145Text4IGK_g(lvlLabel, PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7178getSmallestD9Ej5fM(), 0.0f, 11, null), AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.Companion.getNormal(), AppFontFamily.INSTANCE.getSfProDisplay(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | 1772544, 0, 130960);
        composer2 = startRestartGroup;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance22, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, -1751265383, true, new ChatTitleContentKt$ChatTitleContent$1$2$1(f, i4)), composer2, 1572870 | ((i4 >> 6) & 112), 30);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleIndicator(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-127947864);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-127947864, i, -1, "com.ifriend.ui.features.chat.CircleIndicator (ChatTitleContent.kt:86)");
            }
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(modifier, AppColors.Companion.m7140getRedIndicatorColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new ChatTitleContentKt$CircleIndicator$1(modifier, i));
    }
}
