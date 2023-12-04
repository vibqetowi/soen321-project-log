package com.ifriend.ui.components;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: multipleEventsCutter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.components.MultipleEventsCutterKt$throttleFirst$1", f = "multipleEventsCutter.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MultipleEventsCutterKt$throttleFirst$1 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_throttleFirst;
    final /* synthetic */ long $windowDuration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultipleEventsCutterKt$throttleFirst$1(Flow<? extends T> flow, long j, Continuation<? super MultipleEventsCutterKt$throttleFirst$1> continuation) {
        super(2, continuation);
        this.$this_throttleFirst = flow;
        this.$windowDuration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MultipleEventsCutterKt$throttleFirst$1 multipleEventsCutterKt$throttleFirst$1 = new MultipleEventsCutterKt$throttleFirst$1(this.$this_throttleFirst, this.$windowDuration, continuation);
        multipleEventsCutterKt$throttleFirst$1.L$0 = obj;
        return multipleEventsCutterKt$throttleFirst$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((MultipleEventsCutterKt$throttleFirst$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Ref.LongRef longRef = new Ref.LongRef();
            Flow<T> flow = this.$this_throttleFirst;
            final long j = this.$windowDuration;
            this.label = 1;
            if (flow.collect(new FlowCollector<T>() { // from class: com.ifriend.ui.components.MultipleEventsCutterKt$throttleFirst$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - Ref.LongRef.this.element > j) {
                        Ref.LongRef.this.element = currentTimeMillis;
                        Object emit = flowCollector.emit(t, continuation);
                        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
