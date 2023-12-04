package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MeasureAndLayoutDelegate.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0001IB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\bJ%\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b,J%\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b.J\u0016\u0010/\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0018\u00101\u001a\u00020\b2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020&\u0018\u000103J#\u00101\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001dø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0006\u00106\u001a\u00020&J\u000e\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\u0003J\u0017\u00109\u001a\u00020&2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020&03H\u0082\bJ\u0010\u0010;\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u000e\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u0015J\u001a\u0010>\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\bH\u0002J\u0010\u0010?\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u0018\u0010@\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u0018\u0010B\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u000e\u0010C\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003J\u0018\u0010D\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u0018\u0010E\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u001b\u0010F\u001a\u00020&2\u0006\u0010+\u001a\u00020\u001dø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0018\u0010#\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringMeasureLayout", "", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hasPendingOnPositionedCallbacks", "getHasPendingOnPositionedCallbacks", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParent", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "canAffectParentInLookahead", "getCanAffectParentInLookahead", "measureAffectsParent", "getMeasureAffectsParent", "callOnLayoutCompletedListeners", "", "dispatchOnPositionedCallbacks", "forceDispatch", "doLookaheadRemeasure", "layoutNode", "constraints", "doLookaheadRemeasure-sdFAvZA", "doRemeasure", "doRemeasure-sdFAvZA", "forceMeasureTheSubtree", "affectsLookahead", "measureAndLayout", "onLayout", "Lkotlin/Function0;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "measureOnly", "onNodeDetached", "node", "performMeasureAndLayout", "block", "recurseRemeasure", "registerOnLayoutCompletedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "remeasureAndRelayoutIfNeeded", "remeasureOnly", "requestLookaheadRelayout", "forced", "requestLookaheadRemeasure", "requestOnPositionedCallback", "requestRelayout", "requestRemeasure", "updateRootConstraints", "updateRootConstraints-BRTryo0", "(J)V", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MeasureAndLayoutDelegate {
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(Owner.Companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = Owner.Companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(root, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
        }
        return this.measureIteration;
    }

    /* renamed from: updateRootConstraints-BRTryo0 */
    public final void m4714updateRootConstraintsBRTryo0(long j) {
        Constraints constraints = this.rootConstraints;
        if (constraints == null ? false : Constraints.m5544equalsimpl0(constraints.m5557unboximpl(), j)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.rootConstraints = Constraints.m5539boximpl(j);
        if (this.root.getLookaheadRoot$ui_release() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui_release() != null);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z));
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                        return false;
                    }
                    return false;
                } else if (i == 5) {
                    if (!layoutNode.getLookaheadMeasurePending$ui_release() || z) {
                        layoutNode.markLookaheadMeasurePending$ui_release();
                        layoutNode.markMeasurePending$ui_release();
                        if (Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true) || getCanAffectParentInLookahead(layoutNode)) {
                            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                            if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                                this.relayoutNodes.add(layoutNode, true);
                            }
                        }
                        return !this.duringMeasureLayout;
                    }
                    return false;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else {
                if (!layoutNode.getMeasurePending$ui_release() || z) {
                    layoutNode.markMeasurePending$ui_release();
                    if (layoutNode.isPlaced() || getCanAffectParent(layoutNode)) {
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                    return false;
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true)) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                    if (!(parent$ui_release != null && parent$ui_release.getLookaheadLayoutPending$ui_release())) {
                        this.relayoutNodes.add(layoutNode, true);
                    }
                }
            }
            return !this.duringMeasureLayout;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            if (!z && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.assertConsistent();
                }
            } else {
                layoutNode.markLayoutPending$ui_release();
                if (layoutNode.isPlaced()) {
                    LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                    if (!(parent$ui_release != null && parent$ui_release.getLayoutPending$ui_release())) {
                        if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                    }
                }
                if (!this.duringMeasureLayout) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA */
    private final boolean m4711doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m4685lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            m4685lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m4689lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            m4685lookaheadRemeasure_Sx5XlM$ui_release$default = LayoutNode.m4685lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4685lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m4685lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: doRemeasure-sdFAvZA */
    private final boolean m4712doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m4686remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m4686remeasure_Sx5XlM$ui_release$default = layoutNode.m4690remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m4686remeasure_Sx5XlM$ui_release$default = LayoutNode.m4686remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4686remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m4686remeasure_Sx5XlM$ui_release$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    private final void recurseRemeasure(LayoutNode layoutNode) {
        remeasureOnly(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            remeasureOnly(layoutNode);
        }
        LayoutNode[] content = mutableVector.getContent();
        int i = 0;
        do {
            LayoutNode layoutNode2 = content[i];
            if (getMeasureAffectsParent(layoutNode2)) {
                recurseRemeasure(layoutNode2);
            }
            i++;
        } while (i < size);
        remeasureOnly(layoutNode);
    }

    /* renamed from: measureAndLayout-0kLqBqw */
    public final void m4713measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!(!Intrinsics.areEqual(layoutNode, this.root))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                this.relayoutNodes.remove(layoutNode);
                boolean m4711doLookaheadRemeasuresdFAvZA = m4711doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m5539boximpl(j));
                m4712doRemeasuresdFAvZA(layoutNode, Constraints.m5539boximpl(j));
                if ((m4711doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true)) {
                    layoutNode.lookaheadReplace$ui_release();
                }
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    private final void performMeasureAndLayout(Function0<Unit> function0) {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                function0.invoke();
                InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                InlineMarker.finallyEnd(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onLayoutCompletedListeners.add(listener);
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size <= 0) {
            this.onLayoutCompletedListeners.clear();
        }
        Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
        int i = 0;
        do {
            content[i].onLayoutComplete();
            i++;
        } while (i < size);
        this.onLayoutCompletedListeners.clear();
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z);
    }

    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        boolean m4711doLookaheadRemeasuresdFAvZA;
        boolean m4712doRemeasuresdFAvZA;
        int i = 0;
        if (layoutNode.isPlaced() || getCanAffectParent(layoutNode) || Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true) || getCanAffectParentInLookahead(layoutNode) || layoutNode.getAlignmentLinesRequired$ui_release()) {
            if (layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getMeasurePending$ui_release()) {
                if (layoutNode == this.root) {
                    constraints = this.rootConstraints;
                    Intrinsics.checkNotNull(constraints);
                } else {
                    constraints = null;
                }
                m4711doLookaheadRemeasuresdFAvZA = (layoutNode.getLookaheadMeasurePending$ui_release() && z) ? m4711doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
                m4712doRemeasuresdFAvZA = m4712doRemeasuresdFAvZA(layoutNode, constraints);
            } else {
                m4712doRemeasuresdFAvZA = false;
                m4711doLookaheadRemeasuresdFAvZA = false;
            }
            if ((m4711doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual((Object) layoutNode.isPlacedInLookahead(), (Object) true) && z) {
                layoutNode.lookaheadReplace$ui_release();
            }
            if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                if (layoutNode == this.root) {
                    layoutNode.place$ui_release(0, 0);
                } else {
                    layoutNode.replace$ui_release();
                }
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
            if (this.postponedMeasureRequests.isNotEmpty()) {
                MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
                int size = mutableVector.getSize();
                if (size <= 0) {
                    this.postponedMeasureRequests.clear();
                } else {
                    PostponedRequest[] content = mutableVector.getContent();
                    do {
                        PostponedRequest postponedRequest = content[i];
                        if (postponedRequest.getNode().isAttached()) {
                            if (!postponedRequest.isLookahead()) {
                                requestRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                            } else {
                                requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                            }
                        }
                        i++;
                    } while (i < size);
                    this.postponedMeasureRequests.clear();
                }
            }
            return m4712doRemeasuresdFAvZA;
        }
        return false;
    }

    private final void remeasureOnly(LayoutNode layoutNode) {
        Constraints constraints;
        if (layoutNode.getMeasurePending$ui_release() || layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                m4711doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            }
            m4712doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.relayoutNodes.isEmpty()) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1 measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1 = new MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1(z);
        if (!(!measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode).booleanValue())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            if (measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode).booleanValue()) {
                return;
            }
            return;
        }
        LayoutNode[] content = mutableVector.getContent();
        int i = 0;
        do {
            LayoutNode layoutNode2 = content[i];
            if (measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode2).booleanValue() && this.relayoutNodes.remove(layoutNode2, z)) {
                remeasureAndRelayoutIfNeeded(layoutNode2, z);
            }
            if (!measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode2).booleanValue()) {
                forceMeasureTheSubtree(layoutNode2, z);
            }
            i++;
        } while (i < size);
        if (measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode).booleanValue() || !this.relayoutNodes.remove(layoutNode, z)) {
            return;
        }
        remeasureAndRelayoutIfNeeded$default(this, layoutNode, false, 2, null);
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void onNodeDetached(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.relayoutNodes.remove(node);
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) {
                AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                if (!((lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "isLookahead", "", "isForced", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "()Z", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode node, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.isLookahead = z;
            this.isForced = z2;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    public final boolean measureAndLayout(Function0<Unit> function0) {
        boolean z;
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z2 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean z3 = !depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                        LayoutNode pop = (z3 ? depthSortedSetsForDifferentPasses.lookaheadSet : depthSortedSetsForDifferentPasses.set).pop();
                        boolean remeasureAndRelayoutIfNeeded = remeasureAndRelayoutIfNeeded(pop, z3);
                        if (pop == this.root && remeasureAndRelayoutIfNeeded) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z = false;
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z2 = z;
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
        return z2;
    }

    public final void measureOnly() {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                recurseRemeasure(this.root);
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
    }
}
