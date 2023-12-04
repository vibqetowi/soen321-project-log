package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012<\u0010\u0010\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011¢\u0006\u0002\b\u001a\u0012<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011¢\u0006\u0002\b\u001a\u0012\u0006\u0010\u001e\u001a\u00020\bø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0016J\b\u0010.\u001a\u00020\u0018H\u0016J-\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107JÙ\u0001\u00108\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2<\u0010\u0010\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011¢\u0006\u0002\b\u001a2<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011¢\u0006\u0002\b\u001a2\u0006\u0010\u001e\u001a\u00020\bø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0015\u00109\u001a\u00020\u0018*\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J\u001d\u0010;\u001a\u00020\u0018*\u00020\u00122\u0006\u0010<\u001a\u00020=H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>J\u001d\u0010?\u001a\u00020\u0018*\u00020\u00122\u0006\u0010<\u001a\u00020@H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000RL\u0010\u0010\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011¢\u0006\u0002\b\u001aX\u0082\u000eø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010'RL\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011¢\u0006\u0002\b\u001aX\u0082\u000eø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "state", "Landroidx/compose/foundation/gestures/DraggableState;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "Lkotlin/Function0;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "reverseDirection", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "_canDrag", "_startDragImmediately", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Lkotlin/jvm/functions/Function3;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "disposeInteractionSource", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "update", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStart", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableNode extends DelegatingNode implements PointerInputModifierNode {
    private final Function1<PointerInputChange, Boolean> _canDrag;
    private final Function0<Boolean> _startDragImmediately;
    private Function1<? super PointerInputChange, Boolean> canDrag;
    private final Channel<DragEvent> channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;
    private Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private Orientation orientation;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean reverseDirection;
    private Function0<Boolean> startDragImmediately;
    private DraggableState state;
    private final VelocityTracker velocityTracker;

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return PointerInputModifierNode.CC.$default$interceptOutOfBoundsChildEvents(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return PointerInputModifierNode.CC.$default$sharePointerInputWithSiblings(this);
    }

    public DraggableNode(DraggableState state, Function1<? super PointerInputChange, Boolean> canDrag, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, Function0<Boolean> startDragImmediately, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        this.state = state;
        this.canDrag = canDrag;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = startDragImmediately;
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.reverseDirection = z2;
        this._canDrag = new DraggableNode$_canDrag$1(this);
        this._startDragImmediately = new DraggableNode$_startDragImmediately$1(this);
        this.velocityTracker = new VelocityTracker();
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new DraggableNode$pointerInputNode$1(this, null)));
        this.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo404onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.pointerInputNode.mo404onPointerEventH0pRuoY(pointerEvent, pass, j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    public final void update(DraggableState state, Function1<? super PointerInputChange, Boolean> canDrag, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, Function0<Boolean> startDragImmediately, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        boolean z4 = true;
        if (Intrinsics.areEqual(this.state, state)) {
            z3 = false;
        } else {
            this.state = state;
            z3 = true;
        }
        this.canDrag = canDrag;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z3 = true;
        }
        if (this.enabled != z) {
            this.enabled = z;
            if (!z) {
                disposeInteractionSource();
            }
            z3 = true;
        }
        if (!Intrinsics.areEqual(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        this.startDragImmediately = startDragImmediately;
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        if (this.reverseDirection != z2) {
            this.reverseDirection = z2;
        } else {
            z4 = z3;
        }
        if (z4) {
            this.pointerInputNode.resetPointerInputHandler();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(CoroutineScope coroutineScope, DragEvent.DragStarted dragStarted, Continuation<? super Unit> continuation) {
        DraggableNode$processDragStart$1 draggableNode$processDragStart$1;
        Object coroutine_suspended;
        int i;
        DraggableNode draggableNode;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        MutableInteractionSource mutableInteractionSource2;
        DraggableNode draggableNode2;
        CoroutineScope coroutineScope2;
        DragInteraction.Start start2;
        Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3;
        Offset m3007boximpl;
        if (continuation instanceof DraggableNode$processDragStart$1) {
            draggableNode$processDragStart$1 = (DraggableNode$processDragStart$1) continuation;
            if ((draggableNode$processDragStart$1.label & Integer.MIN_VALUE) != 0) {
                draggableNode$processDragStart$1.label -= Integer.MIN_VALUE;
                Object obj = draggableNode$processDragStart$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableNode$processDragStart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start3 = this.dragInteraction;
                    if (start3 != null && (mutableInteractionSource = this.interactionSource) != null) {
                        draggableNode$processDragStart$1.L$0 = this;
                        draggableNode$processDragStart$1.L$1 = coroutineScope;
                        draggableNode$processDragStart$1.L$2 = dragStarted;
                        draggableNode$processDragStart$1.label = 1;
                        if (mutableInteractionSource.emit(new DragInteraction.Cancel(start3), draggableNode$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    draggableNode = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    start2 = (DragInteraction.Start) draggableNode$processDragStart$1.L$3;
                    dragStarted = (DragEvent.DragStarted) draggableNode$processDragStart$1.L$2;
                    coroutineScope2 = (CoroutineScope) draggableNode$processDragStart$1.L$1;
                    draggableNode2 = (DraggableNode) draggableNode$processDragStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    start = start2;
                    coroutineScope = coroutineScope2;
                    draggableNode = draggableNode2;
                    draggableNode.dragInteraction = start;
                    function3 = draggableNode.onDragStarted;
                    m3007boximpl = Offset.m3007boximpl(dragStarted.m516getStartPointF1C5BW0());
                    draggableNode$processDragStart$1.L$0 = null;
                    draggableNode$processDragStart$1.L$1 = null;
                    draggableNode$processDragStart$1.L$2 = null;
                    draggableNode$processDragStart$1.L$3 = null;
                    draggableNode$processDragStart$1.label = 3;
                    if (function3.invoke(coroutineScope, m3007boximpl, draggableNode$processDragStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    CoroutineScope coroutineScope3 = (CoroutineScope) draggableNode$processDragStart$1.L$1;
                    draggableNode = (DraggableNode) draggableNode$processDragStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragStarted = (DragEvent.DragStarted) draggableNode$processDragStart$1.L$2;
                    coroutineScope = coroutineScope3;
                }
                start = new DragInteraction.Start();
                mutableInteractionSource2 = draggableNode.interactionSource;
                if (mutableInteractionSource2 != null) {
                    draggableNode$processDragStart$1.L$0 = draggableNode;
                    draggableNode$processDragStart$1.L$1 = coroutineScope;
                    draggableNode$processDragStart$1.L$2 = dragStarted;
                    draggableNode$processDragStart$1.L$3 = start;
                    draggableNode$processDragStart$1.label = 2;
                    if (mutableInteractionSource2.emit(start, draggableNode$processDragStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    draggableNode2 = draggableNode;
                    coroutineScope2 = coroutineScope;
                    start2 = start;
                    start = start2;
                    coroutineScope = coroutineScope2;
                    draggableNode = draggableNode2;
                }
                draggableNode.dragInteraction = start;
                function3 = draggableNode.onDragStarted;
                m3007boximpl = Offset.m3007boximpl(dragStarted.m516getStartPointF1C5BW0());
                draggableNode$processDragStart$1.L$0 = null;
                draggableNode$processDragStart$1.L$1 = null;
                draggableNode$processDragStart$1.L$2 = null;
                draggableNode$processDragStart$1.L$3 = null;
                draggableNode$processDragStart$1.label = 3;
                if (function3.invoke(coroutineScope, m3007boximpl, draggableNode$processDragStart$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        draggableNode$processDragStart$1 = new DraggableNode$processDragStart$1(this, continuation);
        Object obj2 = draggableNode$processDragStart$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableNode$processDragStart$1.label;
        if (i != 0) {
        }
        start = new DragInteraction.Start();
        mutableInteractionSource2 = draggableNode.interactionSource;
        if (mutableInteractionSource2 != null) {
        }
        draggableNode.dragInteraction = start;
        function3 = draggableNode.onDragStarted;
        m3007boximpl = Offset.m3007boximpl(dragStarted.m516getStartPointF1C5BW0());
        draggableNode$processDragStart$1.L$0 = null;
        draggableNode$processDragStart$1.L$1 = null;
        draggableNode$processDragStart$1.L$2 = null;
        draggableNode$processDragStart$1.L$3 = null;
        draggableNode$processDragStart$1.label = 3;
        if (function3.invoke(coroutineScope, m3007boximpl, draggableNode$processDragStart$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(CoroutineScope coroutineScope, DragEvent.DragStopped dragStopped, Continuation<? super Unit> continuation) {
        DraggableNode$processDragStop$1 draggableNode$processDragStop$1;
        Object coroutine_suspended;
        int i;
        DraggableNode draggableNode;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity m5823boximpl;
        if (continuation instanceof DraggableNode$processDragStop$1) {
            draggableNode$processDragStop$1 = (DraggableNode$processDragStop$1) continuation;
            if ((draggableNode$processDragStop$1.label & Integer.MIN_VALUE) != 0) {
                draggableNode$processDragStop$1.label -= Integer.MIN_VALUE;
                Object obj = draggableNode$processDragStop$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableNode$processDragStop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            draggableNode$processDragStop$1.L$0 = this;
                            draggableNode$processDragStop$1.L$1 = coroutineScope;
                            draggableNode$processDragStop$1.L$2 = dragStopped;
                            draggableNode$processDragStop$1.label = 1;
                            if (mutableInteractionSource.emit(new DragInteraction.Stop(start), draggableNode$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        draggableNode = this;
                    } else {
                        draggableNode = this;
                        function3 = draggableNode.onDragStopped;
                        m5823boximpl = Velocity.m5823boximpl(dragStopped.m517getVelocity9UxMQ8M());
                        draggableNode$processDragStop$1.L$0 = null;
                        draggableNode$processDragStop$1.L$1 = null;
                        draggableNode$processDragStop$1.L$2 = null;
                        draggableNode$processDragStop$1.label = 2;
                        if (function3.invoke(coroutineScope, m5823boximpl, draggableNode$processDragStop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    CoroutineScope coroutineScope2 = (CoroutineScope) draggableNode$processDragStop$1.L$1;
                    draggableNode = (DraggableNode) draggableNode$processDragStop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragStopped = (DragEvent.DragStopped) draggableNode$processDragStop$1.L$2;
                    coroutineScope = coroutineScope2;
                }
                draggableNode.dragInteraction = null;
                function3 = draggableNode.onDragStopped;
                m5823boximpl = Velocity.m5823boximpl(dragStopped.m517getVelocity9UxMQ8M());
                draggableNode$processDragStop$1.L$0 = null;
                draggableNode$processDragStop$1.L$1 = null;
                draggableNode$processDragStop$1.L$2 = null;
                draggableNode$processDragStop$1.label = 2;
                if (function3.invoke(coroutineScope, m5823boximpl, draggableNode$processDragStop$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        draggableNode$processDragStop$1 = new DraggableNode$processDragStop$1(this, continuation);
        Object obj2 = draggableNode$processDragStop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableNode$processDragStop$1.label;
        if (i != 0) {
        }
        draggableNode.dragInteraction = null;
        function3 = draggableNode.onDragStopped;
        m5823boximpl = Velocity.m5823boximpl(dragStopped.m517getVelocity9UxMQ8M());
        draggableNode$processDragStop$1.L$0 = null;
        draggableNode$processDragStop$1.L$1 = null;
        draggableNode$processDragStop$1.L$2 = null;
        draggableNode$processDragStop$1.label = 2;
        if (function3.invoke(coroutineScope, m5823boximpl, draggableNode$processDragStop$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        DraggableNode$processDragCancel$1 draggableNode$processDragCancel$1;
        Object coroutine_suspended;
        int i;
        DraggableNode draggableNode;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity m5823boximpl;
        if (continuation instanceof DraggableNode$processDragCancel$1) {
            draggableNode$processDragCancel$1 = (DraggableNode$processDragCancel$1) continuation;
            if ((draggableNode$processDragCancel$1.label & Integer.MIN_VALUE) != 0) {
                draggableNode$processDragCancel$1.label -= Integer.MIN_VALUE;
                Object obj = draggableNode$processDragCancel$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableNode$processDragCancel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            draggableNode$processDragCancel$1.L$0 = this;
                            draggableNode$processDragCancel$1.L$1 = coroutineScope;
                            draggableNode$processDragCancel$1.label = 1;
                            if (mutableInteractionSource.emit(new DragInteraction.Cancel(start), draggableNode$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        draggableNode = this;
                    } else {
                        draggableNode = this;
                        function3 = draggableNode.onDragStopped;
                        m5823boximpl = Velocity.m5823boximpl(Velocity.Companion.m5843getZero9UxMQ8M());
                        draggableNode$processDragCancel$1.L$0 = null;
                        draggableNode$processDragCancel$1.L$1 = null;
                        draggableNode$processDragCancel$1.label = 2;
                        if (function3.invoke(coroutineScope, m5823boximpl, draggableNode$processDragCancel$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    coroutineScope = (CoroutineScope) draggableNode$processDragCancel$1.L$1;
                    draggableNode = (DraggableNode) draggableNode$processDragCancel$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                draggableNode.dragInteraction = null;
                function3 = draggableNode.onDragStopped;
                m5823boximpl = Velocity.m5823boximpl(Velocity.Companion.m5843getZero9UxMQ8M());
                draggableNode$processDragCancel$1.L$0 = null;
                draggableNode$processDragCancel$1.L$1 = null;
                draggableNode$processDragCancel$1.label = 2;
                if (function3.invoke(coroutineScope, m5823boximpl, draggableNode$processDragCancel$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        draggableNode$processDragCancel$1 = new DraggableNode$processDragCancel$1(this, continuation);
        Object obj2 = draggableNode$processDragCancel$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableNode$processDragCancel$1.label;
        if (i != 0) {
        }
        draggableNode.dragInteraction = null;
        function3 = draggableNode.onDragStopped;
        m5823boximpl = Velocity.m5823boximpl(Velocity.Companion.m5843getZero9UxMQ8M());
        draggableNode$processDragCancel$1.L$0 = null;
        draggableNode$processDragCancel$1.L$1 = null;
        draggableNode$processDragCancel$1.label = 2;
        if (function3.invoke(coroutineScope, m5823boximpl, draggableNode$processDragCancel$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }
}
