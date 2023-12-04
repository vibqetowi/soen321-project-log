package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J:\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009c\u0001\u001a\u00020\u00052\u0010\b\u0002\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u009e\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u009f\u0001J\u001a\u0010 \u0001\u001a\u00030\u009a\u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0000¢\u0006\u0003\b£\u0001J\u0014\u0010¤\u0001\u001a\u00030\u009a\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¥\u0001J\u0013\u0010¦\u0001\u001a\u00030\u009a\u00012\u0007\u0010§\u0001\u001a\u00020EH\u0002J\u0012\u0010¨\u0001\u001a\u00020\u00052\u0007\u0010©\u0001\u001a\u00020\u0005H\u0016J\u0010\u0010ª\u0001\u001a\u00020\u00052\u0007\u0010\u009b\u0001\u001a\u00020\u0003J\u0013\u0010«\u0001\u001a\u00030\u009a\u00012\u0007\u0010©\u0001\u001a\u00020\u0005H\u0002J\u0012\u0010¬\u0001\u001a\u00020\u00052\u0007\u0010\u00ad\u0001\u001a\u00020\u0005H\u0002JN\u0010®\u0001\u001a\u00030\u009a\u00012\b\u0010¯\u0001\u001a\u00030°\u00012.\u0010±\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030³\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009a\u00010´\u0001\u0012\u0007\u0012\u0005\u0018\u00010µ\u00010²\u0001¢\u0006\u0003\b¶\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010·\u0001J(\u0010¸\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009c\u0001\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J\r\u0010º\u0001\u001a\u00020\u0003*\u00020\u0003H\u0002R+\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u001b\u0010%\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\nR\u0014\u00106\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\nR\u000e\u00108\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0011\u0010;\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u001aR\u0014\u0010D\u001a\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001b\u0010H\u001a\u00020I8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bL\u0010M*\u0004\bJ\u0010KR\u001e\u0010N\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\nR\u0014\u0010P\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\nR\u0012\u0010R\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\nR\u0014\u0010T\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\nR\u0014\u0010V\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\nR\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020E0YX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Z\u001a\u00020[X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010'R\u0014\u0010`\u001a\u00020aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u001a\"\u0004\bf\u0010\u001cR%\u0010g\u001a\u00020hX\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010m\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR/\u0010o\u001a\u0004\u0018\u00010n2\b\u0010\u0007\u001a\u0004\u0018\u00010n8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bt\u0010\u001e\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010u\u001a\u00020vX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u000e\u0010y\u001a\u00020zX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010{\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b|\u0010'R\u000e\u0010}\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010~\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\r\n\u0005\b\u0080\u0001\u0010)\u001a\u0004\b\u007f\u0010\nR/\u0010\u0081\u0001\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\u000e\u001a\u0005\b\u0082\u0001\u0010\n\"\u0005\b\u0083\u0001\u0010\fR1\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u0086\u0001\u0010'\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008b\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010)\u001a\u0005\b\u008c\u0001\u0010\nR:\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0007\u001a\u00030\u008e\u00018@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010\u001e\u001a\u0005\b\u0090\u0001\u0010j\"\u0005\b\u0091\u0001\u0010lR\u001f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u000f\u0010\u0098\u0001\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006»\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialPage", "", "initialPageOffsetFraction", "", "(IF)V", "<set-?>", "animationTargetPage", "getAnimationTargetPage", "()I", "setAnimationTargetPage", "(I)V", "animationTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentPage", "getCurrentPage", "currentPageOffsetFraction", "getCurrentPageOffsetFraction", "()F", "currentPageOffsetFraction$delegate", "Landroidx/compose/runtime/State;", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "distanceToSnapPosition", "getDistanceToSnapPosition", "firstVisiblePage", "getFirstVisiblePage$foundation_release", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "indexToPrefetch", "getInitialPage", "getInitialPageOffsetFraction", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "layoutInfo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "pageAvailableSpace", "getPageAvailableSpace", "pageCount", "getPageCount", "pageSize", "getPageSize$foundation_release", "pageSpacing", "getPageSpacing$foundation_release", "pagerLayoutInfoState", "Landroidx/compose/runtime/MutableState;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "positionThresholdFraction", "getPositionThresholdFraction", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "premeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "J", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "scrollableState", "settledPage", "getSettledPage", "settledPage$delegate", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "snapRemainingScrollOffset", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "targetPage", "getTargetPage", "targetPage$delegate", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference", "getUpDownDifference-F1C5BW0$foundation_release", "setUpDownDifference-k-4lQ0M$foundation_release", "upDownDifference$delegate", "visiblePages", "", "Landroidx/compose/foundation/pager/PageInfo;", "getVisiblePages", "()Ljava/util/List;", "wasScrollingForward", "animateScrollToPage", "", "page", "pageOffsetFraction", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "applyMeasureResult$foundation_release", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "getOffsetFractionForPage", "notifyPrefetch", "performScroll", "distance", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceInPageRange", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private final MutableIntState animationTargetPage$delegate;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final State currentPageOffsetFraction$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int indexToPrefetch;
    private final int initialPage;
    private final float initialPageOffsetFraction;
    private final MutableInteractionSource internalInteractionSource;
    private int numMeasurePasses;
    private MutableState<PagerLayoutInfo> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final MutableFloatState snapRemainingScrollOffset$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasScrollingForward;

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    public abstract int getPageCount();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }

    public PagerState(int i, float f) {
        MutableState mutableStateOf$default;
        MutableState<PagerLayoutInfo> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        this.initialPage = i;
        this.initialPageOffsetFraction = f;
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3007boximpl(Offset.Companion.m3034getZeroF1C5BW0()), null, 2, null);
            this.upDownDifference$delegate = mutableStateOf$default;
            this.snapRemainingScrollOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, 0);
            this.scrollPosition = pagerScrollPosition;
            this.scrollableState = ScrollableStateKt.ScrollableState(new PagerState$scrollableState$1(this));
            this.prefetchingEnabled = true;
            this.indexToPrefetch = -1;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PagerStateKt.getEmptyLayoutInfo(), null, 2, null);
            this.pagerLayoutInfoState = mutableStateOf$default2;
            this.density = PagerStateKt.access$getUnitDensity$p();
            this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
            this.animationTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
            this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
            this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$settledPage$2(this));
            this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$targetPage$2(this));
            this.currentPageOffsetFraction$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$currentPageOffsetFraction$2(this));
            this.prefetchState = new LazyLayoutPrefetchState();
            this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
            this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.remeasurement$delegate = mutableStateOf$default3;
            this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public /* synthetic */ boolean all(Function1 function1) {
                    return Modifier.Element.CC.$default$all(this, function1);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public /* synthetic */ boolean any(Function1 function1) {
                    return Modifier.Element.CC.$default$any(this, function1);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                    return Modifier.Element.CC.$default$foldIn(this, obj, function2);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                    return Modifier.Element.CC.$default$foldOut(this, obj, function2);
                }

                @Override // androidx.compose.ui.Modifier
                public /* synthetic */ Modifier then(Modifier modifier) {
                    return Modifier.CC.$default$then(this, modifier);
                }

                @Override // androidx.compose.ui.layout.RemeasurementModifier
                public void onRemeasurementAvailable(Remeasurement remeasurement) {
                    Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                    PagerState.this.setRemeasurement(remeasurement);
                }
            };
            this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.pinnedPages = new LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            this.canScrollForward$delegate = mutableStateOf$default4;
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            this.canScrollBackward$delegate = mutableStateOf$default5;
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m977getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m3028unboximpl();
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release  reason: not valid java name */
    public final void m979setUpDownDifferencek4lQ0M$foundation_release(long j) {
        this.upDownDifference$delegate.setValue(Offset.m3007boximpl(j));
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.snapRemainingScrollOffset$delegate.getFloatValue();
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.snapRemainingScrollOffset$delegate.setFloatValue(f);
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.scrollPosition.getFirstVisiblePage();
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.scrollPosition.getScrollOffset();
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final PagerLayoutInfo getLayoutInfo$foundation_release() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    private final List<PageInfo> getVisiblePages() {
        return this.pagerLayoutInfoState.getValue().getVisiblePagesInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(this.density.mo588toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    private final float getDistanceToSnapPosition() {
        PageInfo closestPageToSnapPosition = getLayoutInfo$foundation_release().getClosestPageToSnapPosition();
        if (closestPageToSnapPosition != null) {
            return SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(this.density, PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo$foundation_release()), getLayoutInfo$foundation_release().getBeforeContentPadding(), getLayoutInfo$foundation_release().getAfterContentPadding(), getLayoutInfo$foundation_release().getPageSize(), closestPageToSnapPosition.getOffset(), closestPageToSnapPosition.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAnimationTargetPage() {
        return this.animationTargetPage$delegate.getIntValue();
    }

    private final void setAnimationTargetPage(int i) {
        this.animationTargetPage$delegate.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final void setSettledPageState(int i) {
        this.settledPageState$delegate.setIntValue(i);
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction$delegate.getValue()).floatValue();
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release  reason: not valid java name */
    public final long m976getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release  reason: not valid java name */
    public final void m978setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.premeasureConstraints = j;
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            return pagerState.scrollToPage(i, f, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
    }

    public final Object scrollToPage(int i, float f, Continuation<? super Unit> continuation) {
        Object scroll$default = ScrollableState.CC.scroll$default(this, null, new PagerState$scrollToPage$2(this, f, i, null), continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToPage(int i, float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        boolean z;
        PagerState pagerState;
        double d;
        int currentPage;
        int coerceInPageRange;
        PagerState pagerState2;
        int coerceAtMost;
        AnimationSpec<Float> animationSpec2;
        PagerState pagerState3;
        float f2;
        int i3;
        float pageAvailableSpace;
        if (continuation instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuation;
            if ((pagerState$animateScrollToPage$1.label & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.label -= Integer.MIN_VALUE;
                Object obj = pagerState$animateScrollToPage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pagerState$animateScrollToPage$1.label;
                z = false;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i == getCurrentPage()) {
                        if (getCurrentPageOffsetFraction() == f) {
                            return Unit.INSTANCE;
                        }
                    }
                    pagerState$animateScrollToPage$1.L$0 = this;
                    pagerState$animateScrollToPage$1.L$1 = animationSpec;
                    pagerState$animateScrollToPage$1.I$0 = i;
                    pagerState$animateScrollToPage$1.F$0 = f;
                    pagerState$animateScrollToPage$1.label = 1;
                    if (awaitScrollDependencies(pagerState$animateScrollToPage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pagerState = this;
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            pagerState2 = (PagerState) pagerState$animateScrollToPage$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            pagerState2.setAnimationTargetPage(-1);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coerceAtMost = pagerState$animateScrollToPage$1.I$1;
                    i3 = pagerState$animateScrollToPage$1.I$0;
                    f2 = pagerState$animateScrollToPage$1.F$0;
                    animationSpec2 = (AnimationSpec) pagerState$animateScrollToPage$1.L$1;
                    pagerState3 = (PagerState) pagerState$animateScrollToPage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    coerceInPageRange = i3;
                    f = f2;
                    animationSpec = animationSpec2;
                    currentPage = coerceAtMost;
                    pagerState2 = pagerState3;
                    pageAvailableSpace = ((coerceInPageRange * pagerState2.getPageAvailableSpace()) - (currentPage * pagerState2.getPageAvailableSpace())) + pagerState2.getDistanceToSnapPosition() + (f * pagerState2.getPageAvailableSpace());
                    pagerState$animateScrollToPage$1.L$0 = pagerState2;
                    pagerState$animateScrollToPage$1.L$1 = null;
                    pagerState$animateScrollToPage$1.label = 3;
                    if (ScrollExtensionsKt.animateScrollBy(pagerState2, pageAvailableSpace, animationSpec, pagerState$animateScrollToPage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pagerState2.setAnimationTargetPage(-1);
                    return Unit.INSTANCE;
                } else {
                    f = pagerState$animateScrollToPage$1.F$0;
                    i = pagerState$animateScrollToPage$1.I$0;
                    animationSpec = (AnimationSpec) pagerState$animateScrollToPage$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    pagerState = (PagerState) pagerState$animateScrollToPage$1.L$0;
                }
                d = f;
                if (-0.5d <= d && d <= 0.5d) {
                    z = true;
                }
                if (z) {
                    throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
                }
                currentPage = pagerState.getCurrentPage();
                coerceInPageRange = pagerState.coerceInPageRange(i);
                pagerState.setAnimationTargetPage(coerceInPageRange);
                int index = ((PageInfo) CollectionsKt.first((List<? extends Object>) pagerState.getVisiblePages())).getIndex();
                int index2 = ((PageInfo) CollectionsKt.last((List<? extends Object>) pagerState.getVisiblePages())).getIndex();
                if (((i > pagerState.getCurrentPage() && i > index2) || (i < pagerState.getCurrentPage() && i < index)) && Math.abs(i - pagerState.getCurrentPage()) >= 3) {
                    if (i > pagerState.getCurrentPage()) {
                        coerceAtMost = RangesKt.coerceAtLeast(i - pagerState.getVisiblePages().size(), currentPage);
                    } else {
                        coerceAtMost = i + RangesKt.coerceAtMost(pagerState.getVisiblePages().size(), currentPage);
                    }
                    pagerState$animateScrollToPage$1.L$0 = pagerState;
                    pagerState$animateScrollToPage$1.L$1 = animationSpec;
                    pagerState$animateScrollToPage$1.F$0 = f;
                    pagerState$animateScrollToPage$1.I$0 = coerceInPageRange;
                    pagerState$animateScrollToPage$1.I$1 = coerceAtMost;
                    pagerState$animateScrollToPage$1.label = 2;
                    if (scrollToPage$default(pagerState, coerceAtMost, 0.0f, pagerState$animateScrollToPage$1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    animationSpec2 = animationSpec;
                    pagerState3 = pagerState;
                    f2 = f;
                    i3 = coerceInPageRange;
                    coerceInPageRange = i3;
                    f = f2;
                    animationSpec = animationSpec2;
                    currentPage = coerceAtMost;
                    pagerState2 = pagerState3;
                    pageAvailableSpace = ((coerceInPageRange * pagerState2.getPageAvailableSpace()) - (currentPage * pagerState2.getPageAvailableSpace())) + pagerState2.getDistanceToSnapPosition() + (f * pagerState2.getPageAvailableSpace());
                    pagerState$animateScrollToPage$1.L$0 = pagerState2;
                    pagerState$animateScrollToPage$1.L$1 = null;
                    pagerState$animateScrollToPage$1.label = 3;
                    if (ScrollExtensionsKt.animateScrollBy(pagerState2, pageAvailableSpace, animationSpec, pagerState$animateScrollToPage$1) == coroutine_suspended) {
                    }
                    pagerState2.setAnimationTargetPage(-1);
                    return Unit.INSTANCE;
                }
                pagerState2 = pagerState;
                pageAvailableSpace = ((coerceInPageRange * pagerState2.getPageAvailableSpace()) - (currentPage * pagerState2.getPageAvailableSpace())) + pagerState2.getDistanceToSnapPosition() + (f * pagerState2.getPageAvailableSpace());
                pagerState$animateScrollToPage$1.L$0 = pagerState2;
                pagerState$animateScrollToPage$1.L$1 = null;
                pagerState$animateScrollToPage$1.label = 3;
                if (ScrollExtensionsKt.animateScrollBy(pagerState2, pageAvailableSpace, animationSpec, pagerState$animateScrollToPage$1) == coroutine_suspended) {
                }
                pagerState2.setAnimationTargetPage(-1);
                return Unit.INSTANCE;
            }
        }
        pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuation);
        Object obj2 = pagerState$animateScrollToPage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pagerState$animateScrollToPage$1.label;
        z = false;
        if (i2 != 0) {
        }
        d = f;
        if (-0.5d <= d) {
            z = true;
        }
        if (z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
            }
            return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(Continuation<? super Unit> continuation) {
        Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
        return waitForFirstLayout == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? waitForFirstLayout : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object scroll$suspendImpl(PagerState pagerState, MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        PagerState$scroll$1 pagerState$scroll$1;
        Object coroutine_suspended;
        int i;
        ScrollableState scrollableState;
        if (continuation instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) continuation;
            if ((pagerState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.label -= Integer.MIN_VALUE;
                Object obj = pagerState$scroll$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pagerState$scroll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    pagerState$scroll$1.L$0 = pagerState;
                    pagerState$scroll$1.L$1 = mutatePriority;
                    pagerState$scroll$1.L$2 = function2;
                    pagerState$scroll$1.label = 1;
                    if (pagerState.awaitScrollDependencies(pagerState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    function2 = (Function2) pagerState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) pagerState$scroll$1.L$1;
                    pagerState = (PagerState) pagerState$scroll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scrollableState = pagerState.scrollableState;
                pagerState$scroll$1.L$0 = null;
                pagerState$scroll$1.L$1 = null;
                pagerState$scroll$1.L$2 = null;
                pagerState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, pagerState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        pagerState$scroll$1 = new PagerState$scroll$1(pagerState, continuation);
        Object obj2 = pagerState$scroll$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pagerState$scroll$1.label;
        if (i != 0) {
        }
        scrollableState = pagerState.scrollableState;
        pagerState$scroll$1.L$0 = null;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, pagerState$scroll$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    public final void applyMeasureResult$foundation_release(PagerMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        boolean z = false;
        if ((firstVisiblePage != null ? firstVisiblePage.getIndex() : 0) != 0 || result.getFirstVisiblePageOffset() != 0) {
            z = true;
        }
        setCanScrollBackward(z);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
        if (isScrollInProgress()) {
            return;
        }
        setSettledPageState(getCurrentPage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f) {
        if ((f >= 0.0f || getCanScrollForward()) && (f <= 0.0f || getCanScrollBackward())) {
            if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
                throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
            }
            float f2 = this.scrollToBeConsumed + f;
            this.scrollToBeConsumed = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.scrollToBeConsumed;
                Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
                if (remeasurement$foundation_release != null) {
                    remeasurement$foundation_release.forceRemeasure();
                }
                if (this.prefetchingEnabled) {
                    notifyPrefetch(f3 - this.scrollToBeConsumed);
                }
            }
            if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                return f;
            }
            float f4 = f - this.scrollToBeConsumed;
            this.scrollToBeConsumed = 0.0f;
            return f4;
        }
        return 0.0f;
    }

    private final void notifyPrefetch(float f) {
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (this.prefetchingEnabled) {
            PagerLayoutInfo layoutInfo$foundation_release = getLayoutInfo$foundation_release();
            boolean z = true;
            if (!layoutInfo$foundation_release.getVisiblePagesInfo().isEmpty()) {
                boolean z2 = f < 0.0f;
                if (z2) {
                    index = ((PageInfo) CollectionsKt.last((List<? extends Object>) layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() + 1;
                } else {
                    index = ((PageInfo) CollectionsKt.first((List<? extends Object>) layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() - 1;
                }
                if (index != this.indexToPrefetch) {
                    if (index < 0 || index >= layoutInfo$foundation_release.getPagesCount()) {
                        z = false;
                    }
                    if (z) {
                        if (this.wasScrollingForward != z2 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                            prefetchHandle.cancel();
                        }
                        this.wasScrollingForward = z2;
                        this.indexToPrefetch = index;
                        this.currentPrefetchHandle = this.prefetchState.m915schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
                    }
                }
            }
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        int index;
        if (this.indexToPrefetch == -1 || !(!pagerLayoutInfo.getVisiblePagesInfo().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            index = ((PageInfo) CollectionsKt.last((List<? extends Object>) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + 1;
        } else {
            index = ((PageInfo) CollectionsKt.first((List<? extends Object>) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public final float getOffsetFractionForPage(int i) {
        boolean z = false;
        if (i >= 0 && i <= getPageCount()) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("page " + i + " is not within the range 0 to pageCount").toString());
        }
        return (getCurrentPage() - i) + getCurrentPageOffsetFraction();
    }
}
