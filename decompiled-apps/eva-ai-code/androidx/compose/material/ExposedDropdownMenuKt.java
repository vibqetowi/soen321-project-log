package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a6\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u001a\"\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "updateHeight", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "expandable", "Lkotlin/Function0;", "menuLabel", "", "material_release", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "menuHeight"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0327  */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(boolean z, Function1<? super Boolean, Unit> onExpandedChange, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Modifier.Companion companion;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean changed;
        Object rememberedValue4;
        Object rememberedValue5;
        boolean changed2;
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 rememberedValue6;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        boolean changed3;
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1 rememberedValue7;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1456052980);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenuBox)P(1,3,2)96@4191L7,97@4224L7,98@4249L33,99@4305L33,101@4439L37,103@4494L486,116@5006L29,130@5417L31,131@5474L38,118@5041L550,137@5608L59,137@5597L70,141@5673L441:ExposedDropdownMenu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onExpandedChange) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1456052980, i3, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:90)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view = (View) consume2;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
                int mo582roundToPx0680j_4 = density.mo582roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new Ref();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                Ref ref = (Ref) rememberedValue3;
                Integer valueOf = Integer.valueOf(ExposedDropdownMenuBox$lambda$4(mutableIntState2));
                Integer valueOf2 = Integer.valueOf(ExposedDropdownMenuBox$lambda$1(mutableIntState));
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(density) | startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public /* synthetic */ void ExposedDropdownMenu(boolean z2, Function0 function0, Modifier modifier2, ScrollState scrollState, Function3 function3, Composer composer2, int i5, int i6) {
                            ExposedDropdownMenuBoxScope.CC.$default$ExposedDropdownMenu(this, z2, function0, modifier2, scrollState, function3, composer2, i5, i6);
                        }

                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public Modifier exposedDropdownSize(Modifier modifier2, boolean z2) {
                            int ExposedDropdownMenuBox$lambda$4;
                            int ExposedDropdownMenuBox$lambda$1;
                            Intrinsics.checkNotNullParameter(modifier2, "<this>");
                            Density density2 = Density.this;
                            MutableIntState mutableIntState3 = mutableIntState2;
                            MutableIntState mutableIntState4 = mutableIntState;
                            ExposedDropdownMenuBox$lambda$4 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$4(mutableIntState3);
                            Modifier m783heightInVpY3zN4$default = SizeKt.m783heightInVpY3zN4$default(modifier2, 0.0f, density2.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$4), 1, null);
                            if (z2) {
                                ExposedDropdownMenuBox$lambda$1 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$1(mutableIntState4);
                                return SizeKt.m800width3ABfNKs(m783heightInVpY3zN4$default, density2.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$1));
                            }
                            return m783heightInVpY3zN4$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = rememberedValue4;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                FocusRequester focusRequester = (FocusRequester) rememberedValue5;
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(ref, view, mo582roundToPx0680j_4, mutableIntState, mutableIntState2));
                Boolean valueOf3 = Boolean.valueOf(z);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(valueOf3) | startRestartGroup.changed(onExpandedChange);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue6 == Composer.Companion.getEmpty()) {
                    rememberedValue6 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(onExpandedChange, z);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned, (Function0) rememberedValue6, Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1465getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(focusRequester2);
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
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1560854722, "C134@5576L9:ExposedDropdownMenu.kt#jmzs0o");
                content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Boolean valueOf4 = Boolean.valueOf(z);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(valueOf4) | startRestartGroup.changed(focusRequester);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue7 == Composer.Companion.getEmpty()) {
                    rememberedValue7 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1(z, focusRequester);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) rememberedValue7, startRestartGroup, 0);
                EffectsKt.DisposableEffect(view, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$5(view, ref, mo582roundToPx0680j_4, mutableIntState2), startRestartGroup, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ExposedDropdownMenuKt$ExposedDropdownMenuBox$6(z, onExpandedChange, companion, content, i, i2));
            return;
        }
        obj = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density2 = (Density) consume3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view2 = (View) consume22;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableIntState mutableIntState3 = (MutableIntState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableIntState mutableIntState22 = (MutableIntState) rememberedValue2;
        int mo582roundToPx0680j_42 = density2.mo582roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Ref ref2 = (Ref) rememberedValue3;
        Integer valueOf5 = Integer.valueOf(ExposedDropdownMenuBox$lambda$4(mutableIntState22));
        Integer valueOf22 = Integer.valueOf(ExposedDropdownMenuBox$lambda$1(mutableIntState3));
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(density2) | startRestartGroup.changed(valueOf5) | startRestartGroup.changed(valueOf22);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
            public /* synthetic */ void ExposedDropdownMenu(boolean z2, Function0 function0, Modifier modifier2, ScrollState scrollState, Function3 function3, Composer composer2, int i5, int i6) {
                ExposedDropdownMenuBoxScope.CC.$default$ExposedDropdownMenu(this, z2, function0, modifier2, scrollState, function3, composer2, i5, i6);
            }

            @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
            public Modifier exposedDropdownSize(Modifier modifier2, boolean z2) {
                int ExposedDropdownMenuBox$lambda$4;
                int ExposedDropdownMenuBox$lambda$1;
                Intrinsics.checkNotNullParameter(modifier2, "<this>");
                Density density22 = Density.this;
                MutableIntState mutableIntState32 = mutableIntState22;
                MutableIntState mutableIntState4 = mutableIntState3;
                ExposedDropdownMenuBox$lambda$4 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$4(mutableIntState32);
                Modifier m783heightInVpY3zN4$default = SizeKt.m783heightInVpY3zN4$default(modifier2, 0.0f, density22.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$4), 1, null);
                if (z2) {
                    ExposedDropdownMenuBox$lambda$1 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$1(mutableIntState4);
                    return SizeKt.m800width3ABfNKs(m783heightInVpY3zN4$default, density22.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$1));
                }
                return m783heightInVpY3zN4$default;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12 = rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        FocusRequester focusRequester3 = (FocusRequester) rememberedValue5;
        Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(ref2, view2, mo582roundToPx0680j_42, mutableIntState3, mutableIntState22));
        Boolean valueOf32 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(valueOf32) | startRestartGroup.changed(onExpandedChange);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue6 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(onExpandedChange, z);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned2, (Function0) rememberedValue6, Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1465getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester3);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(focusRequester22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1560854722, "C134@5576L9:ExposedDropdownMenu.kt#jmzs0o");
        content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12, startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf42 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(valueOf42) | startRestartGroup.changed(focusRequester3);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue7 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1(z, focusRequester3);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect((Function0) rememberedValue7, startRestartGroup, 0);
        EffectsKt.DisposableEffect(view2, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$5(view2, ref2, mo582roundToPx0680j_42, mutableIntState22), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final Modifier expandable(Modifier modifier, Function0<Unit> function0, String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new ExposedDropdownMenuKt$expandable$1(function0, null)), false, new ExposedDropdownMenuKt$expandable$2(str, function0), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i, Function1<? super Integer, Unit> function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - rect.top, (rect.bottom - rect.top) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
    }
}
