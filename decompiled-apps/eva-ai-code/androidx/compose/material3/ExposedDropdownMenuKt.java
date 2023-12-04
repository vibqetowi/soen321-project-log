package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aQ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a6\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\bH\u0002\u001aE\u0010\u0018\u001a\u00020\n*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001e\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"ExposedDropdownMenuItemHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "updateHeight", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "expandable", "Lkotlin/Function0;", "menuDescription", "", "expandedDescription", "collapsedDescription", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = Dp.m5607constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8 A[LOOP:0: B:69:0x01a6->B:70:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(final boolean z, final Function1<? super Boolean, Unit> onExpandedChange, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        final int i4;
        final View view;
        Object rememberedValue;
        Object rememberedValue2;
        MutableState mutableState;
        int mo582roundToPx0680j_4;
        Object rememberedValue3;
        final Ref ref;
        Object rememberedValue4;
        final FocusRequester focusRequester;
        int i5;
        int i6;
        boolean z2;
        Object rememberedValue5;
        FocusRequester focusRequester2;
        final int i7;
        final MutableState mutableState2;
        Ref ref2;
        View view2;
        int i8;
        int i9;
        boolean changed;
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 rememberedValue6;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1990697039);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenuBox)P(1,3,2)106@5045L7,107@5078L7,108@5103L30,109@5156L30,111@5287L37,113@5351L29,115@5398L1392,149@6796L45,153@6858L59,153@6847L70,157@6923L379:ExposedDropdownMenu.kt#uh7d8r");
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
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i10 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1990697039, i4, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:100)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                view = (View) consume2;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState3 = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) rememberedValue2;
                mo582roundToPx0680j_4 = density.mo582roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new Ref();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                ref = (Ref) rememberedValue3;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) rememberedValue4;
                Object[] objArr = {Boolean.valueOf(z), onExpandedChange, density, Integer.valueOf(ExposedDropdownMenuBox$lambda$4(mutableState)), Integer.valueOf(ExposedDropdownMenuBox$lambda$1(mutableState3))};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                i6 = 0;
                z2 = false;
                for (i5 = 5; i6 < i5; i5 = 5) {
                    z2 |= startRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                    focusRequester2 = focusRequester;
                    i7 = mo582roundToPx0680j_4;
                    mutableState2 = mutableState;
                    ref2 = ref;
                    view2 = view;
                    i8 = 2023513938;
                    i9 = i4;
                    ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public /* synthetic */ void ExposedDropdownMenu(boolean z3, Function0 function0, Modifier modifier3, Function3 function3, Composer composer2, int i11, int i12) {
                            ExposedDropdownMenuBoxScope.CC.$default$ExposedDropdownMenu(this, z3, function0, modifier3, function3, composer2, i11, i12);
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public Modifier exposedDropdownSize(Modifier modifier3, boolean z3) {
                            int ExposedDropdownMenuBox$lambda$4;
                            int ExposedDropdownMenuBox$lambda$1;
                            Intrinsics.checkNotNullParameter(modifier3, "<this>");
                            Density density2 = density;
                            MutableState<Integer> mutableState4 = mutableState2;
                            MutableState<Integer> mutableState5 = mutableState3;
                            ExposedDropdownMenuBox$lambda$4 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$4(mutableState4);
                            Modifier m783heightInVpY3zN4$default = SizeKt.m783heightInVpY3zN4$default(modifier3, 0.0f, density2.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$4), 1, null);
                            if (z3) {
                                ExposedDropdownMenuBox$lambda$1 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$1(mutableState5);
                                return SizeKt.m800width3ABfNKs(m783heightInVpY3zN4$default, density2.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$1));
                            }
                            return m783heightInVpY3zN4$default;
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public Modifier menuAnchor(Modifier modifier3) {
                            Intrinsics.checkNotNullParameter(modifier3, "<this>");
                            return ComposedModifierKt.composed(modifier3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2(z, onExpandedChange, i4, focusRequester, ref, view, i7, mutableState3, mutableState2));
                        }
                    };
                    startRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope);
                    rememberedValue5 = exposedDropdownMenuBoxScope;
                } else {
                    focusRequester2 = focusRequester;
                    i7 = mo582roundToPx0680j_4;
                    mutableState2 = mutableState;
                    view2 = view;
                    ref2 = ref;
                    i9 = i4;
                    i8 = 2023513938;
                }
                startRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue5;
                int i11 = i9 >> 6;
                int i12 = i11 & 14;
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                int i13 = i12 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i13 & 112) | (i13 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i14 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1004941959, "C150@6826L9:ExposedDropdownMenu.kt#uh7d8r");
                content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, startRestartGroup, Integer.valueOf(i11 & 112));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Boolean valueOf = Boolean.valueOf(z);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                FocusRequester focusRequester3 = focusRequester2;
                changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(focusRequester3);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue6 == Composer.Companion.getEmpty()) {
                    rememberedValue6 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(z, focusRequester3);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) rememberedValue6, startRestartGroup, 0);
                View view3 = view2;
                EffectsKt.DisposableEffect(view3, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$3(view3, ref2, i7, mutableState2), startRestartGroup, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ExposedDropdownMenuKt$ExposedDropdownMenuBox$4(z, onExpandedChange, modifier2, content, i, i2));
            return;
        }
        obj = modifier;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 5851) == 1170) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density3 = (Density) consume6;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        view = (View) consume22;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Integer> mutableState32 = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (MutableState) rememberedValue2;
        mo582roundToPx0680j_4 = density3.mo582roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        ref = (Ref) rememberedValue3;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        focusRequester = (FocusRequester) rememberedValue4;
        Object[] objArr2 = {Boolean.valueOf(z), onExpandedChange, density3, Integer.valueOf(ExposedDropdownMenuBox$lambda$4(mutableState)), Integer.valueOf(ExposedDropdownMenuBox$lambda$1(mutableState32))};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        i6 = 0;
        z2 = false;
        while (i6 < i5) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (z2) {
        }
        focusRequester2 = focusRequester;
        i7 = mo582roundToPx0680j_4;
        mutableState2 = mutableState;
        ref2 = ref;
        view2 = view;
        i8 = 2023513938;
        i9 = i4;
        ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope2 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
            public /* synthetic */ void ExposedDropdownMenu(boolean z3, Function0 function0, Modifier modifier3, Function3 function3, Composer composer2, int i112, int i122) {
                ExposedDropdownMenuBoxScope.CC.$default$ExposedDropdownMenu(this, z3, function0, modifier3, function3, composer2, i112, i122);
            }

            @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
            public Modifier exposedDropdownSize(Modifier modifier3, boolean z3) {
                int ExposedDropdownMenuBox$lambda$4;
                int ExposedDropdownMenuBox$lambda$1;
                Intrinsics.checkNotNullParameter(modifier3, "<this>");
                Density density22 = density3;
                MutableState<Integer> mutableState4 = mutableState2;
                MutableState<Integer> mutableState5 = mutableState32;
                ExposedDropdownMenuBox$lambda$4 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$4(mutableState4);
                Modifier m783heightInVpY3zN4$default = SizeKt.m783heightInVpY3zN4$default(modifier3, 0.0f, density22.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$4), 1, null);
                if (z3) {
                    ExposedDropdownMenuBox$lambda$1 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$1(mutableState5);
                    return SizeKt.m800width3ABfNKs(m783heightInVpY3zN4$default, density22.mo585toDpu2uoSUM(ExposedDropdownMenuBox$lambda$1));
                }
                return m783heightInVpY3zN4$default;
            }

            @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
            public Modifier menuAnchor(Modifier modifier3) {
                Intrinsics.checkNotNullParameter(modifier3, "<this>");
                return ComposedModifierKt.composed(modifier3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2(z, onExpandedChange, i4, focusRequester, ref, view, i7, mutableState32, mutableState2));
            }
        };
        startRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope2);
        rememberedValue5 = exposedDropdownMenuBoxScope2;
        startRestartGroup.endReplaceableGroup();
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue5;
        int i112 = i9 >> 6;
        int i122 = i112 & 14;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        int i132 = i122 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i132 & 112) | (i132 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume32;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2 = (LayoutDirection) consume42;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
        Object consume52 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume52;
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion);
        int i142 = ((((i122 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, density22, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i142 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1004941959, "C150@6826L9:ExposedDropdownMenu.kt#uh7d8r");
        content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12, startRestartGroup, Integer.valueOf(i112 & 112));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf2 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        FocusRequester focusRequester32 = focusRequester2;
        changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(focusRequester32);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue6 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(z, focusRequester32);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect((Function0) rememberedValue6, startRestartGroup, 0);
        View view32 = view2;
        EffectsKt.DisposableEffect(view32, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$3(view32, ref2, i7, mutableState2), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier expandable(Modifier modifier, boolean z, Function0<Unit> function0, String str, String str2, String str3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1006563320);
        ComposerKt.sourceInformation(composer, "C(expandable)P(1,4,3,2)1017@60116L38,1018@60190L31,1019@60258L32,1020@60315L365,1030@60691L187:ExposedDropdownMenu.kt#uh7d8r");
        String m2058getStringNWtq28 = (i2 & 4) != 0 ? Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2035getExposedDropdownMenuadMyvUU(), composer, 6) : str;
        Object m2058getStringNWtq282 = (i2 & 8) != 0 ? Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2037getMenuExpandedadMyvUU(), composer, 6) : str2;
        Object m2058getStringNWtq283 = (i2 & 16) != 0 ? Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2036getMenuCollapsedadMyvUU(), composer, 6) : str3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006563320, i, -1, "androidx.compose.material3.expandable (ExposedDropdownMenu.kt:1014)");
        }
        Unit unit = Unit.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(function0);
        ExposedDropdownMenuKt$expandable$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExposedDropdownMenuKt$expandable$1$1(function0, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (Function2) rememberedValue);
        Object[] objArr = {Boolean.valueOf(z), m2058getStringNWtq282, m2058getStringNWtq283, m2058getStringNWtq28, function0};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z2 |= composer.changed(objArr[i3]);
        }
        ExposedDropdownMenuKt$expandable$2$1 rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ExposedDropdownMenuKt$expandable$2$1(z, m2058getStringNWtq282, m2058getStringNWtq283, m2058getStringNWtq28, function0);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return semantics$default;
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
