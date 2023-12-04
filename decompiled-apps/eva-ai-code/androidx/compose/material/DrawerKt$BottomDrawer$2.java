package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawer$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$BottomDrawer$2(boolean z, BottomDrawerState bottomDrawerState, Function2<? super Composer, ? super Integer, Unit> function2, int i, long j, CoroutineScope coroutineScope, Shape shape, long j2, long j3, float f, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$scope = coroutineScope;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C*665@25171L7,677@25586L7,688@25934L2655:Drawer.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220102512, i, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:661)");
            }
            float m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk());
            boolean z = Constraints.m5551getMaxWidthimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk()) > Constraints.m5550getMaxHeightimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk());
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            Modifier m799sizeInqDBjuR0$default = SizeKt.m799sizeInqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, density.mo585toDpu2uoSUM(Constraints.m5551getMaxWidthimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk())), density.mo585toDpu2uoSUM(Constraints.m5550getMaxHeightimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk())), 3, null);
            if (this.$gesturesEnabled) {
                companion = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$drawerState.getNestedScrollConnection$material_release(), null, 2, null);
            } else {
                companion = Modifier.Companion;
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(Modifier.Companion.then(companion), this.$drawerState.getAnchoredDraggableState$material_release(), Orientation.Vertical, this.$gesturesEnabled, consume2 == LayoutDirection.Rtl, null, 16, null);
            Function2<Composer, Integer, Unit> function2 = this.$content;
            int i3 = this.$$dirty;
            long j = this.$scrimColor;
            BottomDrawerState bottomDrawerState = this.$drawerState;
            CoroutineScope coroutineScope = this.$scope;
            Shape shape = this.$drawerShape;
            long j2 = this.$drawerBackgroundColor;
            long j3 = this.$drawerContentColor;
            float f = this.$drawerElevation;
            boolean z2 = this.$gesturesEnabled;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(anchoredDraggable$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1720994955, "C689@25963L9,690@25985L391,701@26410L33,702@26483L113,705@26609L1970:Drawer.kt#jmzs0o");
            function2.invoke(composer, Integer.valueOf((i3 >> 27) & 14));
            DrawerKt.m1351BottomDrawerScrim3JVO9M(j, new DrawerKt$BottomDrawer$2$1$1(z2, bottomDrawerState, coroutineScope), bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, (i3 >> 24) & 14);
            String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1466getNavigationMenuUdPEhr4(), composer, 6);
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(bottomDrawerState) | composer.changed(coroutineScope);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = DrawerKt.BottomDrawerAnchorChangeCallback(bottomDrawerState, coroutineScope);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            int i4 = i3 >> 12;
            SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(m799sizeInqDBjuR0$default, new DrawerKt$BottomDrawer$2$1$2(bottomDrawerState, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue, m5550getMaxHeightimpl, z)), new DrawerKt$BottomDrawer$2$1$3(bottomDrawerState)), false, new DrawerKt$BottomDrawer$2$1$4(m1469getString4foXLRw, bottomDrawerState, coroutineScope), 1, null), shape, j2, j3, null, f, ComposableLambdaKt.composableLambda(composer, 457750254, true, new DrawerKt$BottomDrawer$2$1$5(function3, i3)), composer, ((i3 >> 9) & 112) | 1572864 | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
            ComposerKt.sourceInformationMarkerEnd(composer);
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
}
