package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
/* compiled from: LazyGridState.kt */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00032\b\b\u0002\u0010{\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010|J\u0016\u0010}\u001a\u00020y2\u0006\u0010~\u001a\u00020\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020y2\u0007\u0010\u0082\u0001\u001a\u000206H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020l2\u0007\u0010\u0084\u0001\u001a\u00020lH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020y2\u0007\u0010\u0084\u0001\u001a\u00020lH\u0002J\u0018\u0010\u0086\u0001\u001a\u00020l2\u0007\u0010\u0087\u0001\u001a\u00020lH\u0000¢\u0006\u0003\b\u0088\u0001JL\u0010\u0089\u0001\u001a\u00020y2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012-\u0010\u008c\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020y0\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u00010\u008d\u0001¢\u0006\u0003\b\u0091\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0092\u0001J$\u0010\u0093\u0001\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00032\b\b\u0002\u0010{\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010|J\u001f\u0010\u0094\u0001\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u0095\u0001J$\u0010\u0096\u0001\u001a\u00020\u00032\b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\t\b\u0002\u0010\u0099\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u009a\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u001a\u00102\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\b\u0012\u0004\u0012\u0002060:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010<\u001a\u00020=8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b@\u0010A*\u0004\b>\u0010?R\u001e\u0010B\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0014\u0010D\u001a\u00020EX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020IX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0088\u0001\u0010S\u001a/\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020R0Q0P0L23\u0010\u0010\u001a/\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020R0Q0P0L8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bX\u0010\u0018\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020ZX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0014\"\u0004\b_\u0010\u0016R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020gX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u000e\u0010j\u001a\u00020kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010m\u001a\u00020l2\u0006\u0010\u0010\u001a\u00020l@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u000e\u0010p\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010q\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\br\u0010'\"\u0004\bs\u0010tR\u000e\u0010w\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009c\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "firstVisibleItemIndex", "", "firstVisibleItemScrollOffset", "(II)V", "animateScrollScope", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "getFirstVisibleItemIndex", "()I", "getFirstVisibleItemScrollOffset", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "lineToPrefetch", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever$delegate", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement$foundation_release", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "slotsPerLine", "getSlotsPerLine$foundation_release", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine$delegate", "Landroidx/compose/runtime/MutableIntState;", "wasScrollingForward", "animateScrollToItem", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "notifyPrefetch", "onScroll", "distance", "onScroll$foundation_release", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "snapToItemIndexInternal", "snapToItemIndexInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(LazyGridState$Companion$Saver$1.INSTANCE, LazyGridState$Companion$Saver$2.INSTANCE);
    private final LazyGridAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private Density density;
    private final MutableInteractionSource internalInteractionSource;
    private boolean isVertical;
    private final MutableState<LazyGridLayoutInfo> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final MutableState prefetchInfoRetriever$delegate;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private final MutableIntState slotsPerLine$delegate;
    private boolean wasScrollingForward;

    public LazyGridState() {
        this(0, 0, 3, null);
    }

    public LazyGridState(int i, int i2) {
        MutableState<LazyGridLayoutInfo> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i, i2);
        this.scrollPosition = lazyGridScrollPosition;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyGridLayoutInfo.INSTANCE, null, 2, null);
        this.layoutInfoState = mutableStateOf$default;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.isVertical = true;
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyGridState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
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
                LazyGridState.this.setRemeasurement$foundation_release(remeasurement);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LazyGridState$prefetchInfoRetriever$2.INSTANCE, null, 2, null);
        this.prefetchInfoRetriever$delegate = mutableStateOf$default2;
        this.placementAnimator = new LazyGridItemPlacementAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default4;
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.slotsPerLine$delegate.getIntValue();
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.slotsPerLine$delegate.setIntValue(i);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final boolean isVertical$foundation_release() {
        return this.isVertical;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical = z;
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

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final void setRemeasurement$foundation_release(Remeasurement remeasurement) {
        this.remeasurement = remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final Function1<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever$delegate.getValue();
    }

    public final void setPrefetchInfoRetriever$foundation_release(Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.prefetchInfoRetriever$delegate.setValue(function1);
    }

    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.placementAnimator;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, continuation);
    }

    public final Object scrollToItem(int i, int i2, Continuation<? super Unit> continuation) {
        Object scroll$default = ScrollableState.CC.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2) {
        this.scrollPosition.requestPosition(i, i2);
        this.placementAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        Object coroutine_suspended;
        int i;
        LazyGridState lazyGridState;
        ScrollableState scrollableState;
        if (continuation instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuation;
            if ((lazyGridState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label -= Integer.MIN_VALUE;
                Object obj = lazyGridState$scroll$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyGridState$scroll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                    lazyGridState$scroll$1.L$0 = this;
                    lazyGridState$scroll$1.L$1 = mutatePriority;
                    lazyGridState$scroll$1.L$2 = function2;
                    lazyGridState$scroll$1.label = 1;
                    if (awaitFirstLayoutModifier.waitForFirstLayout(lazyGridState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lazyGridState = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    function2 = (Function2) lazyGridState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$1;
                    lazyGridState = (LazyGridState) lazyGridState$scroll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scrollableState = lazyGridState.scrollableState;
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.L$2 = null;
                lazyGridState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuation);
        Object obj2 = lazyGridState$scroll$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyGridState$scroll$1.label;
        if (i != 0) {
        }
        scrollableState = lazyGridState.scrollableState;
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.L$2 = null;
        lazyGridState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
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

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    public final float onScroll$foundation_release(float f) {
        if ((f >= 0.0f || getCanScrollForward()) && (f <= 0.0f || getCanScrollBackward())) {
            if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
                throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
            }
            float f2 = this.scrollToBeConsumed + f;
            this.scrollToBeConsumed = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.scrollToBeConsumed;
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[LOOP:1: B:38:0x00bb->B:39:0x00bd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void notifyPrefetch(float f) {
        int row;
        int index;
        int size;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled) {
            LazyGridLayoutInfo layoutInfo = getLayoutInfo();
            if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                boolean z = f < 0.0f;
                if (z) {
                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List<? extends Object>) layoutInfo.getVisibleItemsInfo());
                    row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                    index = ((LazyGridItemInfo) CollectionsKt.last((List<? extends Object>) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
                } else {
                    LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List<? extends Object>) layoutInfo.getVisibleItemsInfo());
                    row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                    index = ((LazyGridItemInfo) CollectionsKt.first((List<? extends Object>) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
                }
                if (row != this.lineToPrefetch) {
                    if (index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                        if (this.wasScrollingForward == z || (size2 = (mutableVector = this.currentLinePrefetchHandles).getSize()) <= 0) {
                            this.wasScrollingForward = z;
                            this.lineToPrefetch = row;
                            this.currentLinePrefetchHandles.clear();
                            List<Pair<Integer, Constraints>> invoke = getPrefetchInfoRetriever$foundation_release().invoke(Integer.valueOf(row));
                            size = invoke.size();
                            for (int i = 0; i < size; i++) {
                                Pair<Integer, Constraints> pair = invoke.get(i);
                                this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m915schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().m5557unboximpl()));
                            }
                        }
                        LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                        int i2 = 0;
                        do {
                            content[i2].cancel();
                            i2++;
                        } while (i2 < size2);
                        this.wasScrollingForward = z;
                        this.lineToPrefetch = row;
                        this.currentLinePrefetchHandles.clear();
                        List<Pair<Integer, Constraints>> invoke2 = getPrefetchInfoRetriever$foundation_release().invoke(Integer.valueOf(row));
                        size = invoke2.size();
                        while (i < size) {
                        }
                    }
                }
            }
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        if (this.lineToPrefetch == -1 || !(!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List<? extends Object>) lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List<? extends Object>) lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            int size = mutableVector.getSize();
            if (size <= 0) {
                this.currentLinePrefetchHandles.clear();
            }
            LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].cancel();
                i++;
            } while (i < size);
            this.currentLinePrefetchHandles.clear();
        }
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.animateScrollToItem(i, i2, continuation);
    }

    public final Object animateScrollToItem(int i, int i2, Continuation<? super Unit> continuation) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i, i2, continuation);
        return animateScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        LazyGridMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        boolean z = false;
        if ((firstVisibleLine != null ? firstVisibleLine.getIndex() : 0) != 0 || result.getFirstVisibleLineScrollOffset() != 0) {
            z = true;
        }
        setCanScrollBackward(z);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
    }

    public static /* synthetic */ int updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(LazyGridState lazyGridState, LazyGridItemProvider lazyGridItemProvider, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int index = lazyGridState.scrollPosition.getIndex();
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                i = index;
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        return lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider, i);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider itemProvider, int i) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, i);
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }
    }
}
