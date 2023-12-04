package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.InspectableValueKt;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a6\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007\u001a&\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "Landroidx/compose/runtime/State;", "", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "canPan", "Lkotlin/Function0;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformableKt {
    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState state, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return transformable(modifier, state, TransformableKt$transformable$1.INSTANCE, z, z2);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function0 function0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, function0, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020d, code lost:
        if (r14.getValue().invoke().booleanValue() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0290 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0291 -> B:88:0x02a1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, State<Boolean> state, Channel<TransformEvent> channel, State<? extends Function0<Boolean>> state2, Continuation<? super Unit> continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        State<Boolean> state3;
        Channel<TransformEvent> channel2;
        State<? extends Function0<Boolean>> state4;
        float f;
        long j;
        int i2;
        int i3;
        float f2;
        float f3;
        int size;
        int i4;
        int i5;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$12;
        int i6;
        int i7;
        float f4;
        long j2;
        int i8;
        int i9;
        Object awaitPointerEvent;
        State<? extends Function0<Boolean>> state5;
        Channel<TransformEvent> channel3;
        State<Boolean> state6;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerEvent pointerEvent;
        float f5;
        float f6;
        int i10;
        float f7;
        Object obj2;
        float f8;
        int i11;
        long j3;
        float f9;
        float f10;
        int size2;
        int i12;
        int size3;
        int i13;
        boolean z;
        int size4;
        int i14;
        boolean z2;
        if (continuation instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) continuation;
            if ((transformableKt$detectZoom$1.label & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.label -= Integer.MIN_VALUE;
                obj = transformableKt$detectZoom$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m3034getZeroF1C5BW0 = Offset.Companion.m3034getZeroF1C5BW0();
                    float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    transformableKt$detectZoom$1.L$0 = awaitPointerEventScope2;
                    state3 = state;
                    transformableKt$detectZoom$1.L$1 = state3;
                    channel2 = channel;
                    transformableKt$detectZoom$1.L$2 = channel2;
                    state4 = state2;
                    transformableKt$detectZoom$1.L$3 = state4;
                    transformableKt$detectZoom$1.F$0 = 0.0f;
                    transformableKt$detectZoom$1.F$1 = 1.0f;
                    transformableKt$detectZoom$1.J$0 = m3034getZeroF1C5BW0;
                    transformableKt$detectZoom$1.I$0 = 0;
                    transformableKt$detectZoom$1.F$2 = touchSlop;
                    transformableKt$detectZoom$1.I$1 = 0;
                    transformableKt$detectZoom$1.label = 1;
                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, transformableKt$detectZoom$1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = touchSlop;
                    j = m3034getZeroF1C5BW0;
                    i2 = 0;
                    i3 = 0;
                    f2 = 1.0f;
                    f3 = 0.0f;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int i15 = transformableKt$detectZoom$1.I$2;
                            i10 = transformableKt$detectZoom$1.I$1;
                            f6 = transformableKt$detectZoom$1.F$2;
                            i8 = transformableKt$detectZoom$1.I$0;
                            j2 = transformableKt$detectZoom$1.J$0;
                            float f11 = transformableKt$detectZoom$1.F$1;
                            f7 = transformableKt$detectZoom$1.F$0;
                            pointerEvent = (PointerEvent) transformableKt$detectZoom$1.L$4;
                            awaitPointerEventScope3 = (AwaitPointerEventScope) transformableKt$detectZoom$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            state5 = (State) transformableKt$detectZoom$1.L$3;
                            channel3 = (Channel) transformableKt$detectZoom$1.L$2;
                            state6 = (State) transformableKt$detectZoom$1.L$1;
                            obj2 = coroutine_suspended;
                            f5 = f11;
                            i9 = i15;
                            awaitPointerEvent = obj;
                            List<PointerInputChange> changes = ((PointerEvent) awaitPointerEvent).getChanges();
                            size3 = changes.size();
                            TransformableKt$detectZoom$1 transformableKt$detectZoom$13 = transformableKt$detectZoom$1;
                            i13 = 0;
                            while (true) {
                                if (i13 >= size3) {
                                    z = false;
                                    break;
                                } else if (changes.get(i13).isConsumed()) {
                                    z = true;
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            boolean z3 = !z && i8 == 0;
                            if (i9 == 0 && !z3) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                size4 = changes2.size();
                                i14 = 0;
                                while (true) {
                                    if (i14 >= size4) {
                                        z2 = false;
                                        break;
                                    } else if (changes2.get(i14).getPressed()) {
                                        z2 = true;
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                                if (z2) {
                                    transformableKt$detectZoom$1 = transformableKt$detectZoom$13;
                                    i2 = i10;
                                    f = f6;
                                    i3 = i8;
                                    j = j2;
                                    f2 = f5;
                                    coroutine_suspended = obj2;
                                    f3 = f7;
                                    awaitPointerEventScope2 = awaitPointerEventScope3;
                                    state3 = state6;
                                    channel2 = channel3;
                                    state4 = state5;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = transformableKt$detectZoom$1.I$1;
                    f = transformableKt$detectZoom$1.F$2;
                    i3 = transformableKt$detectZoom$1.I$0;
                    j = transformableKt$detectZoom$1.J$0;
                    f2 = transformableKt$detectZoom$1.F$1;
                    f3 = transformableKt$detectZoom$1.F$0;
                    state3 = (State) transformableKt$detectZoom$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) transformableKt$detectZoom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    state4 = (State) transformableKt$detectZoom$1.L$3;
                    channel2 = (Channel) transformableKt$detectZoom$1.L$2;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    int i16 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i5 = 0;
                            break;
                        } else if (changes3.get(i4).isConsumed()) {
                            i5 = 1;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i5 == 0) {
                        float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                        float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                        i6 = i5;
                        long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                        if (i3 == 0) {
                            f2 *= calculateZoom;
                            f3 += calculateRotation;
                            j = Offset.m3023plusMKHz9U(j, calculatePan);
                            int i17 = i3;
                            float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                            f8 = calculateRotation;
                            float abs = Math.abs(1 - f2) * calculateCentroidSize;
                            float abs2 = Math.abs(((3.1415927f * f3) * calculateCentroidSize) / 180.0f);
                            float m3016getDistanceimpl = Offset.m3016getDistanceimpl(j);
                            if (abs > f || abs2 > f || (m3016getDistanceimpl > f && state4.getValue().invoke().booleanValue())) {
                                i7 = (!state3.getValue().booleanValue() || abs2 >= f) ? 0 : 1;
                                channel2.mo8817trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                                i3 = 1;
                            } else {
                                i7 = i16;
                                i3 = i17;
                            }
                        } else {
                            f8 = calculateRotation;
                            i7 = i16;
                        }
                        if (i3 == 0) {
                            i11 = i3;
                            j3 = j;
                        } else {
                            if (i7 != 0) {
                                f10 = 0.0f;
                                f9 = 0.0f;
                            } else {
                                f9 = f8;
                                f10 = 0.0f;
                            }
                            if (!(f9 == f10)) {
                                i11 = i3;
                                j3 = j;
                            } else if (calculateZoom == 1.0f) {
                                i11 = i3;
                                j3 = j;
                                if (!Offset.m3015equalsimpl0(calculatePan, Offset.Companion.m3034getZeroF1C5BW0())) {
                                }
                                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                                size2 = changes4.size();
                                for (i12 = 0; i12 < size2; i12++) {
                                    PointerInputChange pointerInputChange = changes4.get(i12);
                                    if (PointerEventKt.positionChanged(pointerInputChange)) {
                                        pointerInputChange.consume();
                                    }
                                }
                            } else {
                                i11 = i3;
                                j3 = j;
                            }
                            channel2.mo8817trySendJP2dKIU(new TransformEvent.TransformDelta(calculateZoom, calculatePan, f9, null));
                            List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                            size2 = changes42.size();
                            while (i12 < size2) {
                            }
                        }
                        i8 = i11;
                        f4 = f2;
                        j2 = j3;
                    } else {
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                        i6 = i5;
                        channel2.mo8817trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                        i7 = i16;
                        f4 = f2;
                        j2 = j;
                        i8 = i3;
                    }
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    TransformableKt$detectZoom$1 transformableKt$detectZoom$14 = transformableKt$detectZoom$12;
                    transformableKt$detectZoom$14.L$0 = awaitPointerEventScope2;
                    transformableKt$detectZoom$14.L$1 = state3;
                    transformableKt$detectZoom$14.L$2 = channel2;
                    transformableKt$detectZoom$14.L$3 = state4;
                    transformableKt$detectZoom$14.L$4 = pointerEvent2;
                    transformableKt$detectZoom$14.F$0 = f3;
                    transformableKt$detectZoom$14.F$1 = f4;
                    transformableKt$detectZoom$14.J$0 = j2;
                    transformableKt$detectZoom$14.I$0 = i8;
                    transformableKt$detectZoom$14.F$2 = f;
                    transformableKt$detectZoom$14.I$1 = i7;
                    i9 = i6;
                    transformableKt$detectZoom$14.I$2 = i9;
                    transformableKt$detectZoom$14.label = 3;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, transformableKt$detectZoom$14);
                    if (awaitPointerEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    state5 = state4;
                    channel3 = channel2;
                    state6 = state3;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    pointerEvent = pointerEvent2;
                    Object obj3 = coroutine_suspended;
                    f5 = f4;
                    transformableKt$detectZoom$1 = transformableKt$detectZoom$14;
                    f6 = f;
                    i10 = i7;
                    f7 = f3;
                    obj2 = obj3;
                    List<PointerInputChange> changes5 = ((PointerEvent) awaitPointerEvent).getChanges();
                    size3 = changes5.size();
                    TransformableKt$detectZoom$1 transformableKt$detectZoom$132 = transformableKt$detectZoom$1;
                    i13 = 0;
                    while (true) {
                        if (i13 >= size3) {
                        }
                        i13++;
                    }
                    if (z) {
                    }
                    if (i9 == 0) {
                        List<PointerInputChange> changes22 = pointerEvent.getChanges();
                        size4 = changes22.size();
                        i14 = 0;
                        while (true) {
                            if (i14 >= size4) {
                            }
                            i14++;
                        }
                        if (z2) {
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    i2 = transformableKt$detectZoom$1.I$1;
                    f = transformableKt$detectZoom$1.F$2;
                    i3 = transformableKt$detectZoom$1.I$0;
                    j = transformableKt$detectZoom$1.J$0;
                    f2 = transformableKt$detectZoom$1.F$1;
                    f3 = transformableKt$detectZoom$1.F$0;
                    state3 = (State) transformableKt$detectZoom$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) transformableKt$detectZoom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    state4 = (State) transformableKt$detectZoom$1.L$3;
                    channel2 = (Channel) transformableKt$detectZoom$1.L$2;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                }
                transformableKt$detectZoom$1.L$0 = awaitPointerEventScope2;
                transformableKt$detectZoom$1.L$1 = state3;
                transformableKt$detectZoom$1.L$2 = channel2;
                transformableKt$detectZoom$1.L$3 = state4;
                transformableKt$detectZoom$1.L$4 = null;
                transformableKt$detectZoom$1.F$0 = f3;
                transformableKt$detectZoom$1.F$1 = f2;
                transformableKt$detectZoom$1.J$0 = j;
                transformableKt$detectZoom$1.I$0 = i3;
                transformableKt$detectZoom$1.F$2 = f;
                transformableKt$detectZoom$1.I$1 = i2;
                transformableKt$detectZoom$1.label = 2;
                obj = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$1, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) obj;
                List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                size = changes32.size();
                int i162 = i2;
                i4 = 0;
                while (true) {
                    if (i4 >= size) {
                    }
                    i4++;
                }
                if (i5 == 0) {
                }
                PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                TransformableKt$detectZoom$1 transformableKt$detectZoom$142 = transformableKt$detectZoom$12;
                transformableKt$detectZoom$142.L$0 = awaitPointerEventScope2;
                transformableKt$detectZoom$142.L$1 = state3;
                transformableKt$detectZoom$142.L$2 = channel2;
                transformableKt$detectZoom$142.L$3 = state4;
                transformableKt$detectZoom$142.L$4 = pointerEvent22;
                transformableKt$detectZoom$142.F$0 = f3;
                transformableKt$detectZoom$142.F$1 = f4;
                transformableKt$detectZoom$142.J$0 = j2;
                transformableKt$detectZoom$142.I$0 = i8;
                transformableKt$detectZoom$142.F$2 = f;
                transformableKt$detectZoom$142.I$1 = i7;
                i9 = i6;
                transformableKt$detectZoom$142.I$2 = i9;
                transformableKt$detectZoom$142.label = 3;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, transformableKt$detectZoom$142);
                if (awaitPointerEvent == coroutine_suspended) {
                }
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
        obj = transformableKt$detectZoom$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$1.label;
        if (i != 0) {
        }
        transformableKt$detectZoom$1.L$0 = awaitPointerEventScope2;
        transformableKt$detectZoom$1.L$1 = state3;
        transformableKt$detectZoom$1.L$2 = channel2;
        transformableKt$detectZoom$1.L$3 = state4;
        transformableKt$detectZoom$1.L$4 = null;
        transformableKt$detectZoom$1.F$0 = f3;
        transformableKt$detectZoom$1.F$1 = f2;
        transformableKt$detectZoom$1.J$0 = j;
        transformableKt$detectZoom$1.I$0 = i3;
        transformableKt$detectZoom$1.F$2 = f;
        transformableKt$detectZoom$1.I$1 = i2;
        transformableKt$detectZoom$1.label = 2;
        obj = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$1, 1, null);
        if (obj == coroutine_suspended) {
        }
        PointerEvent pointerEvent222 = (PointerEvent) obj;
        List<PointerInputChange> changes322 = pointerEvent222.getChanges();
        size = changes322.size();
        int i1622 = i2;
        i4 = 0;
        while (true) {
            if (i4 >= size) {
            }
            i4++;
        }
        if (i5 == 0) {
        }
        PointerEventPass pointerEventPass22 = PointerEventPass.Final;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1422 = transformableKt$detectZoom$12;
        transformableKt$detectZoom$1422.L$0 = awaitPointerEventScope2;
        transformableKt$detectZoom$1422.L$1 = state3;
        transformableKt$detectZoom$1422.L$2 = channel2;
        transformableKt$detectZoom$1422.L$3 = state4;
        transformableKt$detectZoom$1422.L$4 = pointerEvent222;
        transformableKt$detectZoom$1422.F$0 = f3;
        transformableKt$detectZoom$1422.F$1 = f4;
        transformableKt$detectZoom$1422.J$0 = j2;
        transformableKt$detectZoom$1422.I$0 = i8;
        transformableKt$detectZoom$1422.F$2 = f;
        transformableKt$detectZoom$1422.I$1 = i7;
        i9 = i6;
        transformableKt$detectZoom$1422.I$2 = i9;
        transformableKt$detectZoom$1422.label = 3;
        awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass22, transformableKt$detectZoom$1422);
        if (awaitPointerEvent == coroutine_suspended) {
        }
    }

    public static final Modifier transformable(Modifier modifier, TransformableState state, Function0<Boolean> canPan, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canPan, "canPan");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TransformableKt$transformable$$inlined$debugInspectorInfo$1(state, canPan, z2, z) : InspectableValueKt.getNoInspectorInfo(), new TransformableKt$transformable$3(z, canPan, z2, state));
    }
}
