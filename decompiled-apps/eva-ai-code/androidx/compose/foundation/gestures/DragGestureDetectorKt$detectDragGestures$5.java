package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {176, 890, 940, 193}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$5(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super DragGestureDetectorKt$detectDragGestures$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e5 -> B:74:0x0261). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01af -> B:23:0x0101). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x020e -> B:63:0x0219). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x025c -> B:74:0x0261). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object awaitFirstDown$default;
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef;
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5;
        int i;
        Ref.LongRef longRef2;
        PointerDirectionConfig pointerDirectionConfig;
        float f;
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$52;
        Ref.LongRef longRef3;
        Object obj2;
        float f2;
        PointerInputChange pointerInputChange2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope2;
        int size;
        int i2;
        Object obj3;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef4;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange5;
        int i3;
        long m4425getIdJ3iCeTQ;
        Object m534dragjO51t88;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        int i5 = 2;
        PointerInputChange pointerInputChange6 = null;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
            if (awaitFirstDown$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 == 1) {
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitFirstDown$default = obj;
        } else if (i4 == 2) {
            float f4 = this.F$2;
            float f5 = this.F$1;
            float f6 = this.F$0;
            int i6 = this.I$0;
            Ref.LongRef longRef5 = (Ref.LongRef) this.L$5;
            ResultKt.throwOnFailure(obj);
            i = i6;
            pointerInputChange2 = (PointerInputChange) this.L$1;
            obj2 = obj;
            pointerDirectionConfig = (PointerDirectionConfig) this.L$4;
            longRef3 = (Ref.LongRef) this.L$2;
            f = f6;
            f3 = f4;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$3;
            dragGestureDetectorKt$detectDragGestures$52 = this;
            f2 = f5;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            longRef2 = longRef5;
            PointerEvent pointerEvent = (PointerEvent) obj2;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2++;
                coroutine_suspended = obj3;
                longRef3 = longRef4;
                awaitPointerEventScope = awaitPointerEventScope3;
                size = i3;
            }
            pointerInputChange4 = pointerInputChange3;
            if (pointerInputChange4 != null) {
            }
            coroutine_suspended = obj3;
            awaitPointerEventScope = awaitPointerEventScope2;
            pointerInputChange = pointerInputChange2;
            dragGestureDetectorKt$detectDragGestures$5 = dragGestureDetectorKt$detectDragGestures$52;
            longRef = longRef4;
            pointerInputChange4 = null;
            if (pointerInputChange4 == null) {
            }
            if (pointerInputChange4 != null) {
            }
            return Unit.INSTANCE;
        } else if (i4 != 3) {
            if (i4 == 4) {
                ResultKt.throwOnFailure(obj);
                dragGestureDetectorKt$detectDragGestures$5 = this;
                m534dragjO51t88 = obj;
                if (((Boolean) m534dragjO51t88).booleanValue()) {
                    dragGestureDetectorKt$detectDragGestures$5.$onDragCancel.invoke();
                } else {
                    dragGestureDetectorKt$detectDragGestures$5.$onDragEnd.invoke();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            float f7 = this.F$2;
            float f8 = this.F$1;
            float f9 = this.F$0;
            int i7 = this.I$0;
            PointerInputChange pointerInputChange7 = (PointerInputChange) this.L$6;
            longRef2 = (Ref.LongRef) this.L$5;
            PointerDirectionConfig pointerDirectionConfig2 = (PointerDirectionConfig) this.L$4;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            dragGestureDetectorKt$detectDragGestures$52 = this;
            int i8 = i7;
            f = f9;
            f3 = f7;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$3;
            pointerInputChange2 = (PointerInputChange) this.L$1;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            longRef3 = (Ref.LongRef) this.L$2;
            f2 = f8;
            if (!pointerInputChange7.isConsumed()) {
                awaitPointerEventScope = awaitPointerEventScope2;
                pointerInputChange = pointerInputChange2;
                longRef = longRef3;
                dragGestureDetectorKt$detectDragGestures$5 = dragGestureDetectorKt$detectDragGestures$52;
                pointerInputChange4 = null;
                if (pointerInputChange4 == null && !pointerInputChange4.isConsumed()) {
                    i5 = 2;
                    pointerInputChange6 = null;
                    m4425getIdJ3iCeTQ = pointerInputChange.m4425getIdJ3iCeTQ();
                    int m4429getTypeT8wyACA = pointerInputChange.m4429getTypeT8wyACA();
                    PointerDirectionConfig horizontalPointerDirectionConfig = DragGestureDetectorKt.getHorizontalPointerDirectionConfig();
                    if (!DragGestureDetectorKt.m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), m4425getIdJ3iCeTQ)) {
                        pointerInputChange4 = pointerInputChange6;
                        if (pointerInputChange4 == null) {
                        }
                        if (pointerInputChange4 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    float m537pointerSlopE8SPZFQ = DragGestureDetectorKt.m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m4429getTypeT8wyACA);
                    Ref.LongRef longRef6 = new Ref.LongRef();
                    longRef6.element = m4425getIdJ3iCeTQ;
                    longRef3 = longRef;
                    dragGestureDetectorKt$detectDragGestures$52 = dragGestureDetectorKt$detectDragGestures$5;
                    longRef2 = longRef6;
                    f3 = 0.0f;
                    i = 0;
                    pointerInputChange2 = pointerInputChange;
                    pointerDirectionConfig = horizontalPointerDirectionConfig;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    f = m537pointerSlopE8SPZFQ;
                    f2 = 0.0f;
                    PointerEventPass pointerEventPass = pointerInputChange6;
                    dragGestureDetectorKt$detectDragGestures$52.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$detectDragGestures$52.L$1 = pointerInputChange2;
                    dragGestureDetectorKt$detectDragGestures$52.L$2 = longRef3;
                    dragGestureDetectorKt$detectDragGestures$52.L$3 = awaitPointerEventScope;
                    dragGestureDetectorKt$detectDragGestures$52.L$4 = pointerDirectionConfig;
                    dragGestureDetectorKt$detectDragGestures$52.L$5 = longRef2;
                    dragGestureDetectorKt$detectDragGestures$52.L$6 = pointerEventPass;
                    dragGestureDetectorKt$detectDragGestures$52.I$0 = i;
                    dragGestureDetectorKt$detectDragGestures$52.F$0 = f;
                    dragGestureDetectorKt$detectDragGestures$52.F$1 = f2;
                    dragGestureDetectorKt$detectDragGestures$52.F$2 = f3;
                    dragGestureDetectorKt$detectDragGestures$52.label = i5;
                    obj2 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, dragGestureDetectorKt$detectDragGestures$52, 1, pointerEventPass);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj2;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj3 = coroutine_suspended;
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            longRef4 = longRef3;
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i2);
                        obj3 = coroutine_suspended;
                        awaitPointerEventScope3 = awaitPointerEventScope;
                        i3 = size;
                        longRef4 = longRef3;
                        if (PointerId.m4409equalsimpl0(pointerInputChange3.m4425getIdJ3iCeTQ(), longRef2.element)) {
                            break;
                        }
                        i2++;
                        coroutine_suspended = obj3;
                        longRef3 = longRef4;
                        awaitPointerEventScope = awaitPointerEventScope3;
                        size = i3;
                    }
                    pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 != null && !pointerInputChange4.isConsumed()) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size2 = changes3.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size2) {
                                    pointerInputChange5 = null;
                                    break;
                                }
                                pointerInputChange5 = changes3.get(i9);
                                if (pointerInputChange5.getPressed()) {
                                    break;
                                }
                                i9++;
                            }
                            PointerInputChange pointerInputChange8 = pointerInputChange5;
                            if (pointerInputChange8 != null) {
                                longRef2.element = pointerInputChange8.m4425getIdJ3iCeTQ();
                                coroutine_suspended = obj3;
                                longRef3 = longRef4;
                                awaitPointerEventScope = awaitPointerEventScope3;
                                i5 = 2;
                            }
                        } else {
                            long m4426getPositionF1C5BW0 = pointerInputChange4.m4426getPositionF1C5BW0();
                            long m4427getPreviousPositionF1C5BW0 = pointerInputChange4.m4427getPreviousPositionF1C5BW0();
                            float mo540mainAxisDeltak4lQ0M = f2 + (pointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                            float mo539crossAxisDeltak4lQ0M = f3 + (pointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                            if (i != 0) {
                                m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                            } else {
                                m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                            }
                            if (m3016getDistanceimpl >= f) {
                                Object obj4 = obj3;
                                Ref.LongRef longRef7 = longRef4;
                                AwaitPointerEventScope awaitPointerEventScope5 = awaitPointerEventScope3;
                                if (i != 0) {
                                    m3022minusMKHz9U = pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f), mo539crossAxisDeltak4lQ0M);
                                } else {
                                    long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                    m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f));
                                }
                                pointerInputChange4.consume();
                                longRef7.element = m3022minusMKHz9U;
                                if (pointerInputChange4.isConsumed()) {
                                    awaitPointerEventScope = awaitPointerEventScope2;
                                    coroutine_suspended = obj4;
                                    longRef = longRef7;
                                    pointerInputChange = pointerInputChange2;
                                    dragGestureDetectorKt$detectDragGestures$5 = dragGestureDetectorKt$detectDragGestures$52;
                                    if (pointerInputChange4 == null) {
                                    }
                                    if (pointerInputChange4 != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                coroutine_suspended = obj4;
                                longRef3 = longRef7;
                                awaitPointerEventScope = awaitPointerEventScope5;
                                f3 = 0.0f;
                                i5 = 2;
                                f2 = 0.0f;
                            } else {
                                dragGestureDetectorKt$detectDragGestures$52.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$detectDragGestures$52.L$1 = pointerInputChange2;
                                Ref.LongRef longRef8 = longRef4;
                                dragGestureDetectorKt$detectDragGestures$52.L$2 = longRef8;
                                AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope3;
                                dragGestureDetectorKt$detectDragGestures$52.L$3 = awaitPointerEventScope6;
                                dragGestureDetectorKt$detectDragGestures$52.L$4 = pointerDirectionConfig;
                                dragGestureDetectorKt$detectDragGestures$52.L$5 = longRef2;
                                dragGestureDetectorKt$detectDragGestures$52.L$6 = pointerInputChange4;
                                dragGestureDetectorKt$detectDragGestures$52.I$0 = i;
                                dragGestureDetectorKt$detectDragGestures$52.F$0 = f;
                                dragGestureDetectorKt$detectDragGestures$52.F$1 = mo540mainAxisDeltak4lQ0M;
                                dragGestureDetectorKt$detectDragGestures$52.F$2 = mo539crossAxisDeltak4lQ0M;
                                dragGestureDetectorKt$detectDragGestures$52.label = 3;
                                Object obj5 = obj3;
                                if (awaitPointerEventScope6.awaitPointerEvent(PointerEventPass.Final, dragGestureDetectorKt$detectDragGestures$52) == obj5) {
                                    return obj5;
                                }
                                coroutine_suspended = obj5;
                                f3 = mo539crossAxisDeltak4lQ0M;
                                awaitPointerEventScope = awaitPointerEventScope6;
                                f2 = mo540mainAxisDeltak4lQ0M;
                                longRef3 = longRef8;
                                PointerDirectionConfig pointerDirectionConfig3 = pointerDirectionConfig;
                                pointerInputChange7 = pointerInputChange4;
                                i8 = i;
                                pointerDirectionConfig2 = pointerDirectionConfig3;
                                if (!pointerInputChange7.isConsumed()) {
                                    pointerDirectionConfig = pointerDirectionConfig2;
                                    i5 = 2;
                                    pointerEventPass = 0;
                                    i = i8;
                                    dragGestureDetectorKt$detectDragGestures$52.L$0 = awaitPointerEventScope2;
                                    dragGestureDetectorKt$detectDragGestures$52.L$1 = pointerInputChange2;
                                    dragGestureDetectorKt$detectDragGestures$52.L$2 = longRef3;
                                    dragGestureDetectorKt$detectDragGestures$52.L$3 = awaitPointerEventScope;
                                    dragGestureDetectorKt$detectDragGestures$52.L$4 = pointerDirectionConfig;
                                    dragGestureDetectorKt$detectDragGestures$52.L$5 = longRef2;
                                    dragGestureDetectorKt$detectDragGestures$52.L$6 = pointerEventPass;
                                    dragGestureDetectorKt$detectDragGestures$52.I$0 = i;
                                    dragGestureDetectorKt$detectDragGestures$52.F$0 = f;
                                    dragGestureDetectorKt$detectDragGestures$52.F$1 = f2;
                                    dragGestureDetectorKt$detectDragGestures$52.F$2 = f3;
                                    dragGestureDetectorKt$detectDragGestures$52.label = i5;
                                    obj2 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, dragGestureDetectorKt$detectDragGestures$52, 1, pointerEventPass);
                                    if (obj2 == coroutine_suspended) {
                                    }
                                    PointerEvent pointerEvent22 = (PointerEvent) obj2;
                                    List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                                    size = changes22.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                        }
                                        i2++;
                                        coroutine_suspended = obj3;
                                        longRef3 = longRef4;
                                        awaitPointerEventScope = awaitPointerEventScope3;
                                        size = i3;
                                    }
                                    pointerInputChange4 = pointerInputChange3;
                                    if (pointerInputChange4 != null) {
                                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                                        }
                                    }
                                }
                            }
                        }
                        pointerEventPass = 0;
                        dragGestureDetectorKt$detectDragGestures$52.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$detectDragGestures$52.L$1 = pointerInputChange2;
                        dragGestureDetectorKt$detectDragGestures$52.L$2 = longRef3;
                        dragGestureDetectorKt$detectDragGestures$52.L$3 = awaitPointerEventScope;
                        dragGestureDetectorKt$detectDragGestures$52.L$4 = pointerDirectionConfig;
                        dragGestureDetectorKt$detectDragGestures$52.L$5 = longRef2;
                        dragGestureDetectorKt$detectDragGestures$52.L$6 = pointerEventPass;
                        dragGestureDetectorKt$detectDragGestures$52.I$0 = i;
                        dragGestureDetectorKt$detectDragGestures$52.F$0 = f;
                        dragGestureDetectorKt$detectDragGestures$52.F$1 = f2;
                        dragGestureDetectorKt$detectDragGestures$52.F$2 = f3;
                        dragGestureDetectorKt$detectDragGestures$52.label = i5;
                        obj2 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, dragGestureDetectorKt$detectDragGestures$52, 1, pointerEventPass);
                        if (obj2 == coroutine_suspended) {
                        }
                        PointerEvent pointerEvent222 = (PointerEvent) obj2;
                        List<PointerInputChange> changes222 = pointerEvent222.getChanges();
                        size = changes222.size();
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2++;
                            coroutine_suspended = obj3;
                            longRef3 = longRef4;
                            awaitPointerEventScope = awaitPointerEventScope3;
                            size = i3;
                        }
                        pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                        }
                    }
                    coroutine_suspended = obj3;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = pointerInputChange2;
                    dragGestureDetectorKt$detectDragGestures$5 = dragGestureDetectorKt$detectDragGestures$52;
                    longRef = longRef4;
                    pointerInputChange4 = null;
                    if (pointerInputChange4 == null) {
                    }
                    if (pointerInputChange4 != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (pointerInputChange4 != null) {
                    dragGestureDetectorKt$detectDragGestures$5.$onDragStart.invoke(Offset.m3007boximpl(pointerInputChange4.m4426getPositionF1C5BW0()));
                    dragGestureDetectorKt$detectDragGestures$5.$onDrag.invoke(pointerInputChange4, Offset.m3007boximpl(longRef.element));
                    dragGestureDetectorKt$detectDragGestures$5.L$0 = null;
                    dragGestureDetectorKt$detectDragGestures$5.L$1 = null;
                    dragGestureDetectorKt$detectDragGestures$5.L$2 = null;
                    dragGestureDetectorKt$detectDragGestures$5.L$3 = null;
                    dragGestureDetectorKt$detectDragGestures$5.L$4 = null;
                    dragGestureDetectorKt$detectDragGestures$5.L$5 = null;
                    dragGestureDetectorKt$detectDragGestures$5.L$6 = null;
                    dragGestureDetectorKt$detectDragGestures$5.label = 4;
                    m534dragjO51t88 = DragGestureDetectorKt.m534dragjO51t88(awaitPointerEventScope, pointerInputChange4.m4425getIdJ3iCeTQ(), new AnonymousClass2(dragGestureDetectorKt$detectDragGestures$5.$onDrag), dragGestureDetectorKt$detectDragGestures$5);
                    if (m534dragjO51t88 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) m534dragjO51t88).booleanValue()) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        pointerInputChange = (PointerInputChange) awaitFirstDown$default;
        longRef = new Ref.LongRef();
        longRef.element = Offset.Companion.m3034getZeroF1C5BW0();
        dragGestureDetectorKt$detectDragGestures$5 = this;
        m4425getIdJ3iCeTQ = pointerInputChange.m4425getIdJ3iCeTQ();
        int m4429getTypeT8wyACA2 = pointerInputChange.m4429getTypeT8wyACA();
        PointerDirectionConfig horizontalPointerDirectionConfig2 = DragGestureDetectorKt.getHorizontalPointerDirectionConfig();
        if (!DragGestureDetectorKt.m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), m4425getIdJ3iCeTQ)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
            super(1);
            this.$onDrag = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PointerInputChange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$onDrag.invoke(it, Offset.m3007boximpl(PointerEventKt.positionChange(it)));
            it.consume();
        }
    }
}
