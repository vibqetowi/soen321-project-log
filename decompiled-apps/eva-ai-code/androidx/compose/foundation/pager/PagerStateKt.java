package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082\b\u001a!\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010#\u001a/\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0007¢\u0006\u0002\u0010%\u001a\u0015\u0010&\u001a\u00020\u001b*\u00020 H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u001b*\u00020 H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016\"\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {OkHttpClientProviderKt.DEBUG_KEY, "", "DefaultPositionThreshold", "Landroidx/compose/ui/unit/Dp;", "getDefaultPositionThreshold", "()F", "F", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getEmptyLayoutInfo$annotations", "()V", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "MaxPageOffset", "", "MaxPagesForAnimateScroll", "", "MinPageOffset", "SnapAlignmentStartToStart", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart$annotations", "getSnapAlignmentStartToStart", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "UnitDensity", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberPagerState", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "initialPageOffsetFraction", "(IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "pageCount", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    private static final float MinPageOffset = -0.5f;
    private static final float DefaultPositionThreshold = Dp.m5607constructorimpl(56);
    private static final PagerLayoutInfo EmptyLayoutInfo = new PagerLayoutInfo() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final int afterContentPadding;
        private final int beforeContentPadding;
        private final PageInfo closestPageToSnapPosition;
        private final int pageSize;
        private final int pageSpacing;
        private final int pagesCount;
        private final boolean reverseLayout;
        private final int viewportEndOffset;
        private final int viewportStartOffset;
        private final List<PageInfo> visiblePagesInfo = CollectionsKt.emptyList();
        private final long viewportSize = IntSize.Companion.m5772getZeroYbymL2g();
        private final Orientation orientation = Orientation.Horizontal;

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public List<PageInfo> getVisiblePagesInfo() {
            return this.visiblePagesInfo;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public PageInfo getClosestPageToSnapPosition() {
            return this.closestPageToSnapPosition;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPagesCount() {
            return this.pagesCount;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSize() {
            return this.pageSize;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSpacing() {
            return this.pageSpacing;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getBeforeContentPadding() {
            return this.beforeContentPadding;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getAfterContentPadding() {
            return this.afterContentPadding;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        /* renamed from: getViewportSize-YbymL2g */
        public long mo970getViewportSizeYbymL2g() {
            return this.viewportSize;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public Orientation getOrientation() {
            return this.orientation;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportStartOffset() {
            return this.viewportStartOffset;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportEndOffset() {
            return this.viewportEndOffset;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public boolean getReverseLayout() {
            return this.reverseLayout;
        }
    };
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo581roundToPxR2X_6o(long j) {
            return Density.CC.m5569$default$roundToPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo582roundToPx0680j_4(float f) {
            return Density.CC.m5570$default$roundToPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo583toDpGaN1DYA(long j) {
            return Density.CC.m5571$default$toDpGaN1DYA(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo584toDpu2uoSUM(float f) {
            return Density.CC.m5572$default$toDpu2uoSUM(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo585toDpu2uoSUM(int i) {
            return Density.CC.m5573$default$toDpu2uoSUM((Density) this, i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo586toDpSizekrfVVM(long j) {
            return Density.CC.m5574$default$toDpSizekrfVVM(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo587toPxR2X_6o(long j) {
            return Density.CC.m5575$default$toPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo588toPx0680j_4(float f) {
            return Density.CC.m5576$default$toPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo589toSizeXkaWNTQ(long j) {
            return Density.CC.m5577$default$toSizeXkaWNTQ(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo590toSp0xMU5do(float f) {
            return Density.CC.m5578$default$toSp0xMU5do(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo591toSpkPz2Gy4(float f) {
            return Density.CC.m5579$default$toSpkPz2Gy4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo592toSpkPz2Gy4(int i) {
            return Density.CC.m5580$default$toSpkPz2Gy4((Density) this, i);
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }
    };
    private static final SnapPositionInLayout SnapAlignmentStartToStart = PagerStateKt$SnapAlignmentStartToStart$1.INSTANCE;

    private static final void debugLog(Function0<String> function0) {
    }

    public static /* synthetic */ void getEmptyLayoutInfo$annotations() {
    }

    public static /* synthetic */ void getSnapAlignmentStartToStart$annotations() {
    }

    public static final PagerState rememberPagerState(int i, float f, Function0<Integer> pageCount, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(pageCount, "pageCount");
        composer.startReplaceableGroup(-1210768637);
        ComposerKt.sourceInformation(composer, "C(rememberPagerState)*78@3520L127,78@3473L174:PagerState.kt#g6yjnt");
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:73)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i);
        Float valueOf2 = Float.valueOf(f);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(pageCount);
        PagerStateKt$rememberPagerState$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$1$1(i, f, pageCount);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m2907rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        pagerStateImpl.getPageCountState().setValue(pageCount);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use the overload where you can provide a source of truth for the pageCount.", replaceWith = @ReplaceWith(expression = "rememberPagerState(\n                initialPage = initialPage,\n                initialPageOffsetFraction = initialPageOffsetFraction\n            ){\n                // provide pageCount\n            }", imports = {}))
    public static final PagerState rememberPagerState(int i, float f, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(144687223);
        ComposerKt.sourceInformation(composer, "C(rememberPagerState)117@4766L152,117@4719L199:PagerState.kt#g6yjnt");
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(144687223, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:113)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i);
        Float valueOf2 = Float.valueOf(f);
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2);
        PagerStateKt$rememberPagerState$3$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$3$1(i, f);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m2907rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    public static final Object animateToNextPage(PagerState pagerState, Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 < pagerState.getPageCount()) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
            return animateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 >= 0) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
            return animateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerLayoutInfo getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static final SnapPositionInLayout getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }
}
