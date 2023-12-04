package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.unit.Velocity;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a!\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001aX\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t*\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aS\u0010\u0016\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aÏ\u0001\u0010\u001f\u001a\u00020 *\u00020 2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2>\b\u0002\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050+\u0012\u0006\u0012\u0004\u0018\u00010,0&¢\u0006\u0002\b-2>\b\u0002\u0010.\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050+\u0012\u0006\u0012\u0004\u0018\u00010,0&¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00100\u001aA\u00101\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00102\u001a\u0002032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a!\u00107\u001a\u00020\u0004*\u00020:2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> onDelta, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        ComposerKt.sourceInformation(composer, "C(rememberDraggableState)140@6075L29,141@6116L61:Draggable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:139)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new DraggableKt$rememberDraggableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function32, boolean z3, int i, Object obj) {
        return draggable(modifier, draggableState, orientation, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : mutableInteractionSource, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? new DraggableKt$draggable$1(null) : function3, (i & 64) != 0 ? new DraggableKt$draggable$2(null) : function32, (i & 128) != 0 ? false : z3);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState state, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return modifier.then(new DraggableElement(state, DraggableKt$draggable$3.INSTANCE, orientation, z, mutableInteractionSource, new DraggableKt$draggable$4(z2), onDragStarted, new DraggableKt$draggable$5(onDragStopped, orientation, null), z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v17, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x022c -> B:182:0x02a1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0292 -> B:178:0x0297). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x02e7 -> B:182:0x02a1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDownAndSlop(AwaitPointerEventScope awaitPointerEventScope, Function1<? super PointerInputChange, Boolean> function1, Function0<Boolean> function0, VelocityTracker velocityTracker, Orientation orientation, Continuation<? super Pair<PointerInputChange, Offset>> continuation) {
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1;
        int i;
        Function1<? super PointerInputChange, Boolean> function12;
        Function0<Boolean> function02;
        VelocityTracker velocityTracker2;
        Orientation orientation2;
        PointerInputChange pointerInputChange;
        AwaitPointerEventScope awaitPointerEventScope2;
        VelocityTracker velocityTracker3;
        Orientation orientation3;
        Ref.LongRef longRef;
        long m4425getIdJ3iCeTQ;
        PointerDirectionConfig pointerDirectionConfig;
        Ref.LongRef longRef2;
        DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$1;
        int i2;
        float f;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef3;
        Object obj;
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$12;
        float f2;
        float f3;
        PointerInputChange pointerInputChange2;
        int i3;
        DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$12;
        AwaitPointerEventScope awaitPointerEventScope4;
        Ref.LongRef longRef4;
        float f4;
        float f5;
        int size;
        int i4;
        DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$13;
        AwaitPointerEventScope awaitPointerEventScope5;
        DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$14;
        int i5;
        PointerInputChange pointerInputChange3;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange4;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope;
        if (continuation instanceof DraggableKt$awaitDownAndSlop$1) {
            draggableKt$awaitDownAndSlop$1 = (DraggableKt$awaitDownAndSlop$1) continuation;
            if ((draggableKt$awaitDownAndSlop$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$awaitDownAndSlop$1.label -= Integer.MIN_VALUE;
                Object obj2 = draggableKt$awaitDownAndSlop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$awaitDownAndSlop$1.label;
                int i6 = 1;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    draggableKt$awaitDownAndSlop$1.L$0 = awaitPointerEventScope6;
                    function12 = function1;
                    draggableKt$awaitDownAndSlop$1.L$1 = function12;
                    function02 = function0;
                    draggableKt$awaitDownAndSlop$1.L$2 = function02;
                    velocityTracker2 = velocityTracker;
                    draggableKt$awaitDownAndSlop$1.L$3 = velocityTracker2;
                    orientation2 = orientation;
                    draggableKt$awaitDownAndSlop$1.L$4 = orientation2;
                    draggableKt$awaitDownAndSlop$1.label = 1;
                    obj2 = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope6, false, pointerEventPass2, draggableKt$awaitDownAndSlop$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    function02 = (Function0) draggableKt$awaitDownAndSlop$1.L$2;
                    Function1<? super PointerInputChange, Boolean> function13 = (Function1) draggableKt$awaitDownAndSlop$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    orientation2 = (Orientation) draggableKt$awaitDownAndSlop$1.L$4;
                    awaitPointerEventScope6 = awaitPointerEventScope7;
                    velocityTracker2 = (VelocityTracker) draggableKt$awaitDownAndSlop$1.L$3;
                    function12 = function13;
                } else if (i == 2) {
                    orientation3 = (Orientation) draggableKt$awaitDownAndSlop$1.L$2;
                    velocityTracker3 = (VelocityTracker) draggableKt$awaitDownAndSlop$1.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    PointerInputChange pointerInputChange5 = (PointerInputChange) obj2;
                    VelocityTrackerKt.addPointerInputChange(velocityTracker3, pointerInputChange5);
                    longRef = new Ref.LongRef();
                    longRef.element = Offset.Companion.m3034getZeroF1C5BW0();
                    DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$15 = new DraggableKt$awaitDownAndSlop$postPointerSlop$1(velocityTracker3, longRef);
                    m4425getIdJ3iCeTQ = pointerInputChange5.m4425getIdJ3iCeTQ();
                    int m4429getTypeT8wyACA = pointerInputChange5.m4429getTypeT8wyACA();
                    pointerDirectionConfig = DragGestureDetectorKt.toPointerDirectionConfig(orientation3);
                    if (DragGestureDetectorKt.m536isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), m4425getIdJ3iCeTQ)) {
                        float m537pointerSlopE8SPZFQ = DragGestureDetectorKt.m537pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), m4429getTypeT8wyACA);
                        Ref.LongRef longRef5 = new Ref.LongRef();
                        longRef5.element = m4425getIdJ3iCeTQ;
                        longRef2 = longRef;
                        draggableKt$awaitDownAndSlop$postPointerSlop$1 = draggableKt$awaitDownAndSlop$postPointerSlop$15;
                        i2 = 1;
                        f = 0.0f;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        longRef3 = longRef5;
                        obj = coroutine_suspended;
                        draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                        f2 = m537pointerSlopE8SPZFQ;
                        f3 = 0.0f;
                        draggableKt$awaitDownAndSlop$12.L$0 = longRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = draggableKt$awaitDownAndSlop$postPointerSlop$1;
                        draggableKt$awaitDownAndSlop$12.L$2 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$12.L$3 = pointerDirectionConfig;
                        draggableKt$awaitDownAndSlop$12.L$4 = longRef3;
                        draggableKt$awaitDownAndSlop$12.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$12.I$0 = i2;
                        draggableKt$awaitDownAndSlop$12.F$0 = f2;
                        draggableKt$awaitDownAndSlop$12.F$1 = f;
                        draggableKt$awaitDownAndSlop$12.F$2 = f3;
                        draggableKt$awaitDownAndSlop$12.label = 3;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$12, i6, pointerEventPass);
                        if (awaitPointerEvent$default != obj) {
                        }
                    } else {
                        pointerInputChange2 = null;
                        if (pointerInputChange2 == null) {
                        }
                    }
                } else if (i == 3) {
                    float f6 = draggableKt$awaitDownAndSlop$1.F$2;
                    float f7 = draggableKt$awaitDownAndSlop$1.F$1;
                    f4 = draggableKt$awaitDownAndSlop$1.F$0;
                    int i7 = draggableKt$awaitDownAndSlop$1.I$0;
                    longRef4 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$4;
                    awaitPointerEventScope4 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$2;
                    ResultKt.throwOnFailure(obj2);
                    i3 = i7;
                    f = f7;
                    obj = coroutine_suspended;
                    draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                    f5 = f6;
                    pointerDirectionConfig = (PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$3;
                    longRef2 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$0;
                    draggableKt$awaitDownAndSlop$postPointerSlop$12 = (Function2) draggableKt$awaitDownAndSlop$1.L$1;
                    PointerEvent pointerEvent = (PointerEvent) obj2;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i4 = 0;
                    draggableKt$awaitDownAndSlop$postPointerSlop$13 = draggableKt$awaitDownAndSlop$postPointerSlop$12;
                    while (true) {
                        if (i4 < size) {
                        }
                        i4++;
                        i3 = i5;
                        draggableKt$awaitDownAndSlop$postPointerSlop$13 = draggableKt$awaitDownAndSlop$postPointerSlop$14;
                        awaitPointerEventScope4 = awaitPointerEventScope5;
                    }
                    pointerInputChange2 = pointerInputChange3;
                    if (pointerInputChange2 != null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        }
                        i6 = 1;
                        pointerEventPass = null;
                        draggableKt$awaitDownAndSlop$12.L$0 = longRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = draggableKt$awaitDownAndSlop$postPointerSlop$1;
                        draggableKt$awaitDownAndSlop$12.L$2 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$12.L$3 = pointerDirectionConfig;
                        draggableKt$awaitDownAndSlop$12.L$4 = longRef3;
                        draggableKt$awaitDownAndSlop$12.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$12.I$0 = i2;
                        draggableKt$awaitDownAndSlop$12.F$0 = f2;
                        draggableKt$awaitDownAndSlop$12.F$1 = f;
                        draggableKt$awaitDownAndSlop$12.F$2 = f3;
                        draggableKt$awaitDownAndSlop$12.label = 3;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$12, i6, pointerEventPass);
                        if (awaitPointerEvent$default != obj) {
                        }
                    }
                    longRef = longRef2;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 == null) {
                    }
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    float f8 = draggableKt$awaitDownAndSlop$1.F$2;
                    float f9 = draggableKt$awaitDownAndSlop$1.F$1;
                    float f10 = draggableKt$awaitDownAndSlop$1.F$0;
                    int i8 = draggableKt$awaitDownAndSlop$1.I$0;
                    pointerInputChange2 = (PointerInputChange) draggableKt$awaitDownAndSlop$1.L$5;
                    ResultKt.throwOnFailure(obj2);
                    f3 = f8;
                    int i9 = i8;
                    pointerDirectionConfig = (PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$3;
                    draggableKt$awaitDownAndSlop$postPointerSlop$1 = (Function2) draggableKt$awaitDownAndSlop$1.L$1;
                    longRef3 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$4;
                    draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                    f2 = f10;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$2;
                    longRef2 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$0;
                    f = f9;
                    obj = coroutine_suspended;
                    if (!pointerInputChange2.isConsumed()) {
                        i2 = i9;
                        i6 = 1;
                        pointerEventPass = null;
                        draggableKt$awaitDownAndSlop$12.L$0 = longRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = draggableKt$awaitDownAndSlop$postPointerSlop$1;
                        draggableKt$awaitDownAndSlop$12.L$2 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$12.L$3 = pointerDirectionConfig;
                        draggableKt$awaitDownAndSlop$12.L$4 = longRef3;
                        draggableKt$awaitDownAndSlop$12.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$12.I$0 = i2;
                        draggableKt$awaitDownAndSlop$12.F$0 = f2;
                        draggableKt$awaitDownAndSlop$12.F$1 = f;
                        draggableKt$awaitDownAndSlop$12.F$2 = f3;
                        draggableKt$awaitDownAndSlop$12.label = 3;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$12, i6, pointerEventPass);
                        if (awaitPointerEvent$default != obj) {
                            return obj;
                        }
                        float f11 = f2;
                        f5 = f3;
                        obj2 = awaitPointerEvent$default;
                        i3 = i2;
                        draggableKt$awaitDownAndSlop$postPointerSlop$12 = draggableKt$awaitDownAndSlop$postPointerSlop$1;
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        longRef4 = longRef3;
                        f4 = f11;
                        PointerEvent pointerEvent2 = (PointerEvent) obj2;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        i4 = 0;
                        draggableKt$awaitDownAndSlop$postPointerSlop$13 = draggableKt$awaitDownAndSlop$postPointerSlop$12;
                        while (true) {
                            if (i4 < size) {
                                awaitPointerEventScope5 = awaitPointerEventScope4;
                                draggableKt$awaitDownAndSlop$postPointerSlop$14 = draggableKt$awaitDownAndSlop$postPointerSlop$13;
                                i5 = i3;
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i4);
                            i5 = i3;
                            awaitPointerEventScope5 = awaitPointerEventScope4;
                            draggableKt$awaitDownAndSlop$postPointerSlop$14 = draggableKt$awaitDownAndSlop$postPointerSlop$13;
                            if (PointerId.m4409equalsimpl0(pointerInputChange3.m4425getIdJ3iCeTQ(), longRef4.element)) {
                                break;
                            }
                            i4++;
                            i3 = i5;
                            draggableKt$awaitDownAndSlop$postPointerSlop$13 = draggableKt$awaitDownAndSlop$postPointerSlop$14;
                            awaitPointerEventScope4 = awaitPointerEventScope5;
                        }
                        pointerInputChange2 = pointerInputChange3;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                                long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                                float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f;
                                float mo539crossAxisDeltak4lQ0M = f5 + (pointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                                float abs = i5 != 0 ? Math.abs(mo540mainAxisDeltak4lQ0M) : Offset.m3016getDistanceimpl(pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                                if (abs < f4) {
                                    PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                    draggableKt$awaitDownAndSlop$12.L$0 = longRef2;
                                    draggableKt$awaitDownAndSlop$postPointerSlop$1 = draggableKt$awaitDownAndSlop$postPointerSlop$14;
                                    draggableKt$awaitDownAndSlop$12.L$1 = draggableKt$awaitDownAndSlop$postPointerSlop$1;
                                    AwaitPointerEventScope awaitPointerEventScope8 = awaitPointerEventScope5;
                                    draggableKt$awaitDownAndSlop$12.L$2 = awaitPointerEventScope8;
                                    draggableKt$awaitDownAndSlop$12.L$3 = pointerDirectionConfig;
                                    draggableKt$awaitDownAndSlop$12.L$4 = longRef4;
                                    draggableKt$awaitDownAndSlop$12.L$5 = pointerInputChange2;
                                    i9 = i5;
                                    draggableKt$awaitDownAndSlop$12.I$0 = i9;
                                    draggableKt$awaitDownAndSlop$12.F$0 = f4;
                                    draggableKt$awaitDownAndSlop$12.F$1 = mo540mainAxisDeltak4lQ0M;
                                    draggableKt$awaitDownAndSlop$12.F$2 = mo539crossAxisDeltak4lQ0M;
                                    draggableKt$awaitDownAndSlop$12.label = 4;
                                    if (awaitPointerEventScope8.awaitPointerEvent(pointerEventPass3, draggableKt$awaitDownAndSlop$12) == obj) {
                                        return obj;
                                    }
                                    f = mo540mainAxisDeltak4lQ0M;
                                    f3 = mo539crossAxisDeltak4lQ0M;
                                    f2 = f4;
                                    longRef3 = longRef4;
                                    awaitPointerEventScope3 = awaitPointerEventScope8;
                                    if (!pointerInputChange2.isConsumed()) {
                                    }
                                } else {
                                    int i10 = i5;
                                    draggableKt$awaitDownAndSlop$postPointerSlop$1 = draggableKt$awaitDownAndSlop$postPointerSlop$14;
                                    AwaitPointerEventScope awaitPointerEventScope9 = awaitPointerEventScope5;
                                    if (i10 != 0) {
                                        m3022minusMKHz9U = pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f4), mo539crossAxisDeltak4lQ0M);
                                    } else {
                                        long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                        m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, abs), f4));
                                    }
                                    draggableKt$awaitDownAndSlop$postPointerSlop$1.invoke(pointerInputChange2, Offset.m3007boximpl(m3022minusMKHz9U));
                                    if (pointerInputChange2.isConsumed()) {
                                        longRef = longRef2;
                                        if (pointerInputChange2 == null) {
                                            return TuplesKt.to(pointerInputChange2, Offset.m3007boximpl(longRef.element));
                                        }
                                        return null;
                                    }
                                    f2 = f4;
                                    longRef3 = longRef4;
                                    awaitPointerEventScope3 = awaitPointerEventScope9;
                                    i2 = i10;
                                    f3 = 0.0f;
                                    f = 0.0f;
                                }
                            } else {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size2) {
                                        pointerInputChange4 = null;
                                        break;
                                    }
                                    pointerInputChange4 = changes3.get(i11);
                                    if (pointerInputChange4.getPressed()) {
                                        break;
                                    }
                                    i11++;
                                }
                                PointerInputChange pointerInputChange6 = pointerInputChange4;
                                if (pointerInputChange6 != null) {
                                    longRef4.element = pointerInputChange6.m4425getIdJ3iCeTQ();
                                    i2 = i5;
                                    draggableKt$awaitDownAndSlop$postPointerSlop$1 = draggableKt$awaitDownAndSlop$postPointerSlop$14;
                                    f3 = f5;
                                    f2 = f4;
                                    longRef3 = longRef4;
                                    awaitPointerEventScope3 = awaitPointerEventScope5;
                                }
                            }
                            i6 = 1;
                            pointerEventPass = null;
                            draggableKt$awaitDownAndSlop$12.L$0 = longRef2;
                            draggableKt$awaitDownAndSlop$12.L$1 = draggableKt$awaitDownAndSlop$postPointerSlop$1;
                            draggableKt$awaitDownAndSlop$12.L$2 = awaitPointerEventScope3;
                            draggableKt$awaitDownAndSlop$12.L$3 = pointerDirectionConfig;
                            draggableKt$awaitDownAndSlop$12.L$4 = longRef3;
                            draggableKt$awaitDownAndSlop$12.L$5 = pointerEventPass;
                            draggableKt$awaitDownAndSlop$12.I$0 = i2;
                            draggableKt$awaitDownAndSlop$12.F$0 = f2;
                            draggableKt$awaitDownAndSlop$12.F$1 = f;
                            draggableKt$awaitDownAndSlop$12.F$2 = f3;
                            draggableKt$awaitDownAndSlop$12.label = 3;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$12, i6, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                            }
                        }
                    }
                    longRef = longRef2;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 == null) {
                    }
                }
                pointerInputChange = (PointerInputChange) obj2;
                if (function12.invoke(pointerInputChange).booleanValue()) {
                    return null;
                }
                if (function02.invoke().booleanValue()) {
                    pointerInputChange.consume();
                    VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange);
                    return TuplesKt.to(pointerInputChange, Offset.m3007boximpl(Offset.Companion.m3034getZeroF1C5BW0()));
                }
                draggableKt$awaitDownAndSlop$1.L$0 = awaitPointerEventScope6;
                draggableKt$awaitDownAndSlop$1.L$1 = velocityTracker2;
                draggableKt$awaitDownAndSlop$1.L$2 = orientation2;
                draggableKt$awaitDownAndSlop$1.L$3 = null;
                draggableKt$awaitDownAndSlop$1.L$4 = null;
                draggableKt$awaitDownAndSlop$1.label = 2;
                obj2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope6, false, null, draggableKt$awaitDownAndSlop$1, 2, null);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope6;
                velocityTracker3 = velocityTracker2;
                orientation3 = orientation2;
                PointerInputChange pointerInputChange52 = (PointerInputChange) obj2;
                VelocityTrackerKt.addPointerInputChange(velocityTracker3, pointerInputChange52);
                longRef = new Ref.LongRef();
                longRef.element = Offset.Companion.m3034getZeroF1C5BW0();
                DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$152 = new DraggableKt$awaitDownAndSlop$postPointerSlop$1(velocityTracker3, longRef);
                m4425getIdJ3iCeTQ = pointerInputChange52.m4425getIdJ3iCeTQ();
                int m4429getTypeT8wyACA2 = pointerInputChange52.m4429getTypeT8wyACA();
                pointerDirectionConfig = DragGestureDetectorKt.toPointerDirectionConfig(orientation3);
                if (DragGestureDetectorKt.m536isPointerUpDmW0f2w(awaitPointerEventScope2.getCurrentEvent(), m4425getIdJ3iCeTQ)) {
                }
            }
        }
        draggableKt$awaitDownAndSlop$1 = new DraggableKt$awaitDownAndSlop$1(continuation);
        Object obj22 = draggableKt$awaitDownAndSlop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$awaitDownAndSlop$1.label;
        int i62 = 1;
        PointerEventPass pointerEventPass4 = null;
        if (i != 0) {
        }
        pointerInputChange = (PointerInputChange) obj22;
        if (function12.invoke(pointerInputChange).booleanValue()) {
        }
    }

    /* renamed from: awaitDrag-Su4bsnU */
    public static final Object m550awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, VelocityTracker velocityTracker, SendChannel<? super DragEvent> sendChannel, boolean z, Orientation orientation, Continuation<? super Boolean> continuation) {
        sendChannel.mo8817trySendJP2dKIU(new DragEvent.DragStarted(Offset.m3022minusMKHz9U(pointerInputChange.m4426getPositionF1C5BW0(), OffsetKt.Offset(Offset.m3018getXimpl(j) * Math.signum(Offset.m3018getXimpl(pointerInputChange.m4426getPositionF1C5BW0())), Offset.m3019getYimpl(j) * Math.signum(Offset.m3019getYimpl(pointerInputChange.m4426getPositionF1C5BW0())))), null));
        sendChannel.mo8817trySendJP2dKIU(new DragEvent.DragDelta(z ? Offset.m3025timestuRUvjQ(j, -1.0f) : j, null));
        return m551onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.m4425getIdJ3iCeTQ(), new DraggableKt$awaitDrag$2(velocityTracker, sendChannel, z), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0117, code lost:
        if ((!(((java.lang.Number) r9.invoke(r14)).floatValue() == 0.0f)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0099 -> B:104:0x009e). Please submit an issue!!! */
    /* renamed from: onDragOrUp-Axegvzg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m551onDragOrUpAxegvzg(AwaitPointerEventScope awaitPointerEventScope, Orientation orientation, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$1;
        int i;
        long j2;
        DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$12;
        Object obj;
        Function1<? super PointerInputChange, Unit> function12;
        Function1 function13;
        AwaitPointerEventScope awaitPointerEventScope2;
        boolean z;
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef;
        Function1 function14;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        Unit unit;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange2;
        int i2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DraggableKt$onDragOrUp$1) {
            draggableKt$onDragOrUp$1 = (DraggableKt$onDragOrUp$1) continuation;
            if ((draggableKt$onDragOrUp$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$onDragOrUp$1.label -= Integer.MIN_VALUE;
                Object obj2 = draggableKt$onDragOrUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$onDragOrUp$1.label;
                int i3 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        Ref.LongRef longRef2 = (Ref.LongRef) draggableKt$onDragOrUp$1.L$4;
                        awaitPointerEventScope3 = (AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$3;
                        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$2;
                        function14 = (Function1) draggableKt$onDragOrUp$1.L$1;
                        ResultKt.throwOnFailure(obj2);
                        draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
                        function12 = (Function1) draggableKt$onDragOrUp$1.L$0;
                        longRef = longRef2;
                        PointerEvent pointerEvent = (PointerEvent) obj2;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                awaitPointerEventScope4 = awaitPointerEventScope3;
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes.get(i4);
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            if (PointerId.m4409equalsimpl0(pointerInputChange2.m4425getIdJ3iCeTQ(), longRef.element)) {
                                break;
                            }
                            i4++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        pointerInputChange = pointerInputChange2;
                        if (pointerInputChange == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes2.get(i5);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i5++;
                                }
                                PointerInputChange pointerInputChange4 = pointerInputChange3;
                                if (pointerInputChange4 == null) {
                                    z = true;
                                } else {
                                    longRef.element = pointerInputChange4.m4425getIdJ3iCeTQ();
                                    i2 = 1;
                                    awaitPointerEventScope3 = awaitPointerEventScope4;
                                    i3 = i2;
                                    awaitPointerEventScope2 = awaitPointerEventScope5;
                                    pointerEventPass = null;
                                    draggableKt$onDragOrUp$12.L$0 = function12;
                                    draggableKt$onDragOrUp$12.L$1 = function14;
                                    draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                                    draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                                    draggableKt$onDragOrUp$12.L$4 = longRef;
                                    draggableKt$onDragOrUp$12.label = i3;
                                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i3, pointerEventPass);
                                    if (awaitPointerEvent$default == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    awaitPointerEventScope5 = awaitPointerEventScope2;
                                    obj2 = awaitPointerEvent$default;
                                }
                            } else {
                                z = true;
                                i2 = 1;
                            }
                            PointerEvent pointerEvent2 = (PointerEvent) obj2;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i42 = 0;
                            while (true) {
                                if (i42 < size3) {
                                }
                                i42++;
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                            }
                            pointerInputChange = pointerInputChange2;
                            if (pointerInputChange == null) {
                                z = true;
                                pointerInputChange = null;
                            }
                        }
                        if (pointerInputChange == null || pointerInputChange.isConsumed()) {
                            pointerInputChange = null;
                        } else if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            function12.invoke(pointerInputChange);
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            j2 = pointerInputChange.m4425getIdJ3iCeTQ();
                            pointerEventPass = null;
                            i3 = z ? 1 : 0;
                            Function1 function15 = function14;
                            obj = coroutine_suspended;
                            function13 = function15;
                            longRef = new Ref.LongRef();
                            longRef.element = j2;
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            Object obj3 = obj;
                            function14 = function13;
                            coroutine_suspended = obj3;
                            draggableKt$onDragOrUp$12.L$0 = function12;
                            draggableKt$onDragOrUp$12.L$1 = function14;
                            draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                            draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                            draggableKt$onDragOrUp$12.L$4 = longRef;
                            draggableKt$onDragOrUp$12.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i3, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                            }
                        }
                        if (pointerInputChange == null) {
                            function12.invoke(pointerInputChange);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            z = false;
                        }
                        return Boxing.boxBoolean(z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                Function1 function16 = orientation == Orientation.Vertical ? DraggableKt$onDragOrUp$motionFromChange$1.INSTANCE : DraggableKt$onDragOrUp$motionFromChange$2.INSTANCE;
                j2 = j;
                if (DragGestureDetectorKt.m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                    function12 = function1;
                    z = true;
                    pointerInputChange = null;
                    if (pointerInputChange == null) {
                    }
                    if (unit == null) {
                    }
                    return Boxing.boxBoolean(z);
                }
                draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
                obj = coroutine_suspended;
                function12 = function1;
                function13 = function16;
                awaitPointerEventScope2 = awaitPointerEventScope;
                longRef = new Ref.LongRef();
                longRef.element = j2;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                Object obj32 = obj;
                function14 = function13;
                coroutine_suspended = obj32;
                draggableKt$onDragOrUp$12.L$0 = function12;
                draggableKt$onDragOrUp$12.L$1 = function14;
                draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                draggableKt$onDragOrUp$12.L$4 = longRef;
                draggableKt$onDragOrUp$12.label = i3;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i3, pointerEventPass);
                if (awaitPointerEvent$default == coroutine_suspended) {
                }
            }
        }
        draggableKt$onDragOrUp$1 = new DraggableKt$onDragOrUp$1(continuation);
        Object obj22 = draggableKt$onDragOrUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$onDragOrUp$1.label;
        int i32 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i == 0) {
        }
    }

    /* renamed from: toFloat-3MmeM6k */
    public static final float m552toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m3019getYimpl(j) : Offset.m3018getXimpl(j);
    }

    /* renamed from: toFloat-sF-c-tU */
    public static final float m553toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5833getYimpl(j) : Velocity.m5832getXimpl(j);
    }
}
