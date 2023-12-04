package androidx.compose.foundation.pager;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty0;
/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 21\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a\u0081\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0004\u001a\u00020\u000521\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&2#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100*H\u0003¢\u0006\u0002\u0010-\u001a\u0014\u0010.\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Pager", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "userScrollEnabled", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Pager-fs30GE4", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rememberPagerItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pageCount", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
        if (r2 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L49;
     */
    /* renamed from: Pager-fs30GE4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m961Pagerfs30GE4(Modifier modifier, PagerState state, PaddingValues contentPadding, boolean z, Orientation orientation, SnapFlingBehavior flingBehavior, boolean z2, int i, float f, PageSize pageSize, NestedScrollConnection pageNestedScrollConnection, Function1<? super Integer, ? extends Object> function1, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> pageContent, Composer composer, int i2, int i3, int i4) {
        int i5;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(pageNestedScrollConnection, "pageNestedScrollConnection");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer startRestartGroup = composer.startRestartGroup(-301644943);
        ComposerKt.sourceInformation(startRestartGroup, "C(Pager)P(5,12,1,11,6,2,13!1,10:c#ui.unit.Dp,9,8,4!1,14)95@4489L18,101@4652L19,97@4537L134,114@5148L19,103@4697L477,117@5205L94,127@5488L115,138@5788L276,146@6128L161,156@6513L7,133@5609L1489:LazyLayoutPager.kt#g6yjnt");
        int i6 = (i4 & 128) != 0 ? 0 : i;
        float m5607constructorimpl = (i4 & 256) != 0 ? Dp.m5607constructorimpl(0) : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-301644943, i2, i3, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:58)");
        }
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(("beyondBoundsPageCount should be greater than or equal to 0, you selected " + i6).toString());
        }
        OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i7 = i2 >> 3;
        int i8 = i7 & 14;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(state);
        int i9 = i6;
        LazyLayoutPagerKt$Pager$pagerItemProvider$1$1 rememberedValue = startRestartGroup.rememberedValue();
        if (changed) {
            i5 = i7;
        } else {
            i5 = i7;
        }
        rememberedValue = new LazyLayoutPagerKt$Pager$pagerItemProvider$1$1(state);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i10 = i5;
        Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda = rememberPagerItemProviderLambda(state, pageContent, function1, (Function0) rememberedValue, startRestartGroup, i8 | ((i3 >> 9) & 112) | ((i3 << 3) & 896));
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(state);
        LazyLayoutPagerKt$Pager$measurePolicy$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyLayoutPagerKt$Pager$measurePolicy$1$1(state);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        int i11 = i2 & 112;
        int i12 = i2 & 7168;
        int i13 = i2 & 57344;
        int i14 = i2 >> 6;
        int i15 = i3 << 18;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m974rememberPagerMeasurePolicyBxUkNYg = PagerMeasurePolicyKt.m974rememberPagerMeasurePolicyBxUkNYg(rememberPagerItemProviderLambda, state, contentPadding, z, orientation, i9, m5607constructorimpl, pageSize, horizontalAlignment, verticalAlignment, (Function0) rememberedValue2, startRestartGroup, i11 | (i2 & 896) | i12 | i13 | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (234881024 & i15) | (i15 & 1879048192), 0);
        int i16 = i2 >> 15;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed3 = startRestartGroup.changed(flingBehavior) | startRestartGroup.changed(state);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new PagerWrapperFlingBehavior(flingBehavior, state);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) rememberedValue3;
        startRestartGroup.startReplaceableGroup(1445586192);
        ComposerKt.sourceInformation(startRestartGroup, "122@5368L58");
        if (z2) {
            companion = PagerKt.pagerSemantics(Modifier.Companion, state, orientation == Orientation.Vertical, startRestartGroup, i11 | 6);
        } else {
            companion = Modifier.Companion;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier overscroll = OverscrollKt.overscroll(PagerBeyondBoundsModifierKt.pagerBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()).then(companion), rememberPagerItemProviderLambda, PagerSemanticsKt.rememberPagerSemanticState(state, z, orientation == Orientation.Vertical, startRestartGroup, i8 | (i14 & 112)), orientation, z2, z, startRestartGroup, (i10 & 7168) | (i14 & 57344) | ((i2 << 6) & 458752)), orientation), state, i9, z, orientation, startRestartGroup, i11 | (i16 & 896) | i12 | i13), overscrollEffect);
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LazyLayoutKt.LazyLayout(rememberPagerItemProviderLambda, NestedScrollModifierKt.nestedScroll$default(dragDirectionDetector(ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z2, scrollableDefaults.reverseDirection((LayoutDirection) consume, orientation, z), pagerWrapperFlingBehavior, state.getInternalInteractionSource$foundation_release()), state), pageNestedScrollConnection, null, 2, null), state.getPrefetchState$foundation_release(), m974rememberPagerMeasurePolicyBxUkNYg, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LazyLayoutPagerKt$Pager$2(modifier, state, contentPadding, z, orientation, flingBehavior, z2, i9, m5607constructorimpl, pageSize, pageNestedScrollConnection, function1, horizontalAlignment, verticalAlignment, pageContent, i2, i3, i4));
    }

    private static final Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(PagerState pagerState, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function1<? super Integer, ? extends Object> function1, Function0<Integer> function0, Composer composer, int i) {
        composer.startReplaceableGroup(-1372505274);
        ComposerKt.sourceInformation(composer, "C(rememberPagerItemProviderLambda)P(3,1)240@9459L33,241@9504L659:LazyLayoutPager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:234)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composer, (i >> 3) & 14);
        Object[] objArr = {pagerState, rememberUpdatedState, function1, function0};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z |= composer.changed(objArr[i2]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(rememberUpdatedState, function1, function0)), pagerState));
            rememberedValue = (KProperty0) new PropertyReference0Impl(derivedStateOf) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        KProperty0 kProperty0 = (KProperty0) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return kProperty0;
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(pagerState, null)));
    }
}
