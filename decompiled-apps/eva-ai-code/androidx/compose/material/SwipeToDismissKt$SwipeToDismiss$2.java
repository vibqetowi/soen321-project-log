package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeToDismissKt$SwipeToDismiss$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $dismissContent;
    final /* synthetic */ Function1<DismissDirection, ThresholdConfig> $dismissThresholds;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, int i, DismissState dismissState, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = function1;
        this.$$dirty = i;
        this.$state = dismissState;
        this.$background = function3;
        this.$dismissContent = function32;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Modifier m1481swipeablepPrIpRY;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C183@6697L7,189@6938L106,196@7269L718:SwipeToDismiss.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(338007641, i, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
            }
            float m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk());
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z = consume == LayoutDirection.Rtl;
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(Float.valueOf(0.0f), DismissValue.Default));
            if (this.$directions.contains(DismissDirection.StartToEnd)) {
                Pair pair = TuplesKt.to(Float.valueOf(m5551getMaxWidthimpl), DismissValue.DismissedToEnd);
                mutableMapOf.put(pair.getFirst(), pair.getSecond());
            }
            if (this.$directions.contains(DismissDirection.EndToStart)) {
                Pair pair2 = TuplesKt.to(Float.valueOf(-m5551getMaxWidthimpl), DismissValue.DismissedToStart);
                mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
            }
            Function1<DismissDirection, ThresholdConfig> function1 = this.$dismissThresholds;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(function1);
            SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            m1481swipeablepPrIpRY = SwipeableKt.m1481swipeablepPrIpRY(Modifier.Companion, this.$state, mutableMapOf, Orientation.Horizontal, (r26 & 8) != 0 ? true : this.$state.getCurrentValue() == DismissValue.Default, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : rememberedValue, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(m5551getMaxWidthimpl, this.$directions.contains(DismissDirection.EndToStart) ? 10.0f : 20.0f, this.$directions.contains(DismissDirection.StartToEnd) ? 10.0f : 20.0f), (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1480getVelocityThresholdD9Ej5fM() : 0.0f);
            Function3<RowScope, Composer, Integer, Unit> function3 = this.$background;
            int i3 = this.$$dirty;
            DismissState dismissState = this.$state;
            Function3<RowScope, Composer, Integer, Unit> function32 = this.$dismissContent;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m1481swipeablepPrIpRY);
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
            ComposerKt.sourceInformationMarkerStart(composer, 565741180, "C211@7733L98,217@7922L49,215@7840L141:SwipeToDismiss.kt#jmzs0o");
            Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(Modifier.Companion);
            int i4 = (i3 >> 3) & 7168;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            int i5 = i4 >> 3;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, (i5 & 14) | (i5 & 112));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(matchParentSize);
            int i6 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf((i6 >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            function3.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i4 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(dismissState);
            SwipeToDismissKt$SwipeToDismiss$2$1$1$1 rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new SwipeToDismissKt$SwipeToDismiss$2$1$1$1(dismissState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier offset = OffsetKt.offset(companion, (Function1) rememberedValue2);
            int i7 = (i3 >> 6) & 7168;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            int i8 = i7 >> 3;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, (i8 & 112) | (i8 & 14));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(offset);
            int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl3, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf((i9 >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            function32.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i7 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
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
