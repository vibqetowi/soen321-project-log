package com.ifriend.presentation.common.state;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1", f = "CombinedStateDelegate.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $collector;
    final /* synthetic */ Flow $this_collectIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1(Flow flow, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.$collector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1(this.$this_collectIn, this.$collector, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: flow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
    /* renamed from: com.ifriend.presentation.common.state.CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ Function2 $collector;

        public AnonymousClass1(Function2 function2) {
            this.$collector = function2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            Object invoke = this.$collector.invoke(t, continuation);
            return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
        }

        public final Object emit$$forInline(Object obj, Continuation continuation) {
            InlineMarker.mark(4);
            new ContinuationImpl(continuation) { // from class: com.ifriend.presentation.common.state.CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$.inlined.collectIn.default.1.1.1
                int label;
                /* synthetic */ Object result;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj2) {
                    this.result = obj2;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            };
            InlineMarker.mark(5);
            this.$collector.invoke(obj, continuation);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$this_collectIn.collect(new AnonymousClass1(this.$collector), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        InlineMarker.mark(0);
        this.$this_collectIn.collect(new AnonymousClass1(this.$collector), this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
