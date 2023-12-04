package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$ModalDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z, int i, long j, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, CoroutineScope coroutineScope, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$content = function2;
        this.$scope = coroutineScope;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        float f;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C531@19307L7,532@19334L217,532@19323L228,538@19594L7,539@19633L2681:Drawer.kt#jmzs0o");
        if ((((i & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i : i) & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(816674999, i, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:522)");
            }
            long mo685getConstraintsmsEJaDk = BoxWithConstraints.mo685getConstraintsmsEJaDk();
            if (!Constraints.m5547getHasBoundedWidthimpl(mo685getConstraintsmsEJaDk)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            float f2 = -Constraints.m5551getMaxWidthimpl(mo685getConstraintsmsEJaDk);
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            Object[] objArr = {this.$drawerState, density, Float.valueOf(f2), Float.valueOf(0.0f)};
            DrawerState drawerState = this.$drawerState;
            composer.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            int i2 = 0;
            boolean z = false;
            for (int i3 = 4; i2 < i3; i3 = 4) {
                z |= composer.changed(objArr[i2]);
                i2++;
            }
            DrawerKt$ModalDrawer$1$1$1 rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DrawerKt$ModalDrawer$1$1$1(drawerState, density, f2, 0.0f);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(Modifier.Companion, this.$drawerState.getAnchoredDraggableState$material_release(), Orientation.Horizontal, this.$gesturesEnabled, consume2 == LayoutDirection.Rtl, null, 16, null);
            DrawerState drawerState2 = this.$drawerState;
            int i4 = this.$$dirty;
            long j = this.$scrimColor;
            Shape shape = this.$drawerShape;
            long j2 = this.$drawerBackgroundColor;
            long j3 = this.$drawerContentColor;
            float f3 = this.$drawerElevation;
            Function2<Composer, Integer, Unit> function2 = this.$content;
            boolean z2 = this.$gesturesEnabled;
            CoroutineScope coroutineScope = this.$scope;
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
            ComposerKt.sourceInformationMarkerStart(composer, 413829465, "C548@19951L45,561@20406L106,551@20009L553,566@20596L33,*568@20696L7,577@21160L222,567@20642L1662:Drawer.kt#jmzs0o");
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 392281232, "C549@19973L9:Drawer.kt#jmzs0o");
            function2.invoke(composer, Integer.valueOf((i4 >> 27) & 14));
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean isOpen = drawerState2.isOpen();
            DrawerKt$ModalDrawer$1$2$2 drawerKt$ModalDrawer$1$2$2 = new DrawerKt$ModalDrawer$1$2$2(z2, drawerState2, coroutineScope);
            Float valueOf = Float.valueOf(f2);
            Float valueOf2 = Float.valueOf(0.0f);
            composer.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(drawerState2);
            DrawerKt$ModalDrawer$1$2$3$1 rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DrawerKt$ModalDrawer$1$2$3$1(f2, 0.0f, drawerState2);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            DrawerKt.m1353ScrimBx497Mc(isOpen, drawerKt$ModalDrawer$1$2$2, rememberedValue2, j, composer, (i4 >> 15) & 7168);
            String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1466getNavigationMenuUdPEhr4(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density2 = (Density) consume3;
            Modifier m798sizeInqDBjuR0 = SizeKt.m798sizeInqDBjuR0(Modifier.Companion, density2.mo585toDpu2uoSUM(Constraints.m5553getMinWidthimpl(mo685getConstraintsmsEJaDk)), density2.mo585toDpu2uoSUM(Constraints.m5552getMinHeightimpl(mo685getConstraintsmsEJaDk)), density2.mo585toDpu2uoSUM(Constraints.m5551getMaxWidthimpl(mo685getConstraintsmsEJaDk)), density2.mo585toDpu2uoSUM(Constraints.m5550getMaxHeightimpl(mo685getConstraintsmsEJaDk)));
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(drawerState2);
            DrawerKt$ModalDrawer$1$2$5$1 rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$ModalDrawer$1$2$5$1(drawerState2);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier offset = OffsetKt.offset(m798sizeInqDBjuR0, (Function1) rememberedValue3);
            f = DrawerKt.EndDrawerPadding;
            int i5 = i4 >> 12;
            SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m752paddingqDBjuR0$default(offset, 0.0f, 0.0f, f, 0.0f, 11, null), false, new DrawerKt$ModalDrawer$1$2$6(m1469getString4foXLRw, drawerState2, coroutineScope), 1, null), shape, j2, j3, null, f3, ComposableLambdaKt.composableLambda(composer, -1941234439, true, new DrawerKt$ModalDrawer$1$2$7(function3, i4)), composer, (i4 & 458752) | ((i4 >> 9) & 112) | 1572864 | (i5 & 896) | (i5 & 7168), 16);
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
