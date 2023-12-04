package com.ifriend.common_utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.common_utils.extensions.FlowKt$onEachSafe$$inlined$transform$1", f = "flow.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt$onEachSafe$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $action$inlined;
    final /* synthetic */ Function2 $error$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$onEachSafe$$inlined$transform$1(Flow flow, Continuation continuation, Function2 function2, Function2 function22) {
        super(2, continuation);
        this.$this_transform = flow;
        this.$action$inlined = function2;
        this.$error$inlined = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt$onEachSafe$$inlined$transform$1 flowKt$onEachSafe$$inlined$transform$1 = new FlowKt$onEachSafe$$inlined$transform$1(this.$this_transform, continuation, this.$action$inlined, this.$error$inlined);
        flowKt$onEachSafe$$inlined$transform$1.L$0 = obj;
        return flowKt$onEachSafe$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowKt$onEachSafe$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$this_transform.collect(new AnonymousClass1((FlowCollector) this.L$0, this.$action$inlined, this.$error$inlined), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.common_utils.extensions.FlowKt$onEachSafe$$inlined$transform$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $$this$flow;
        final /* synthetic */ Function2 $action$inlined;
        final /* synthetic */ Function2 $error$inlined;

        /* compiled from: Emitters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.ifriend.common_utils.extensions.FlowKt$onEachSafe$$inlined$transform$1$1", f = "flow.kt", i = {0, 0, 0, 1, 1}, l = {223, 225, 226}, m = "emit", n = {"this", "value", "$this$onEachSafe_u24lambda_u242", "value", "$this$onEachSafe_u24lambda_u242"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
        /* renamed from: com.ifriend.common_utils.extensions.FlowKt$onEachSafe$$inlined$transform$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01321 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C01321(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, Function2 function2, Function2 function22) {
            this.$action$inlined = function2;
            this.$error$inlined = function22;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(6:17|18|19|(1:21)|12|13))(4:22|23|24|25))(4:40|41|42|(1:44)(1:45))|26|27|28|(2:30|(1:32)(2:33|18))|19|(0)|12|13))|49|6|(0)(0)|26|27|28|(0)|19|(0)|12|13|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
            r2 = th;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c6 A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C01321 c01321;
            Object coroutine_suspended;
            int i;
            FlowCollector<T> flowCollector;
            AnonymousClass1<T> anonymousClass1;
            Object m7271constructorimpl;
            T t2;
            FlowCollector<T> flowCollector2;
            Throwable m7274exceptionOrNullimpl;
            T t3;
            if (continuation instanceof C01321) {
                c01321 = (C01321) continuation;
                if ((c01321.label & Integer.MIN_VALUE) != 0) {
                    c01321.label -= Integer.MIN_VALUE;
                    Object obj = c01321.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c01321.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = this.$$this$flow;
                        try {
                            Result.Companion companion = Result.Companion;
                            Function2 function2 = this.$action$inlined;
                            c01321.L$0 = this;
                            c01321.L$1 = t;
                            c01321.L$2 = flowCollector;
                            c01321.label = 1;
                            InlineMarker.mark(6);
                            Object invoke = function2.invoke(t, c01321);
                            InlineMarker.mark(7);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            anonymousClass1 = this;
                        } catch (Throwable th) {
                            th = th;
                            anonymousClass1 = this;
                            Result.Companion companion2 = Result.Companion;
                            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                            FlowCollector<T> flowCollector3 = flowCollector;
                            t2 = t;
                            flowCollector2 = flowCollector3;
                            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                            if (m7274exceptionOrNullimpl != null) {
                            }
                            c01321.L$0 = null;
                            c01321.L$1 = null;
                            c01321.L$2 = null;
                            c01321.label = 3;
                            if (flowCollector2.emit(t2, c01321) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        Object obj2 = c01321.L$2;
                        flowCollector2 = (FlowCollector) c01321.L$1;
                        Object obj3 = c01321.L$0;
                        ResultKt.throwOnFailure(obj);
                        t3 = obj3;
                        t2 = t3;
                        c01321.L$0 = null;
                        c01321.L$1 = null;
                        c01321.L$2 = null;
                        c01321.label = 3;
                        if (flowCollector2.emit(t2, c01321) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } else {
                        FlowCollector<T> flowCollector4 = (FlowCollector) c01321.L$2;
                        Object obj4 = c01321.L$1;
                        anonymousClass1 = (AnonymousClass1) c01321.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            flowCollector = flowCollector4;
                            t = obj4;
                        } catch (Throwable th2) {
                            flowCollector = flowCollector4;
                            t = obj4;
                            th = th2;
                            Result.Companion companion22 = Result.Companion;
                            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                            FlowCollector<T> flowCollector32 = flowCollector;
                            t2 = t;
                            flowCollector2 = flowCollector32;
                            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                            if (m7274exceptionOrNullimpl != null) {
                            }
                            c01321.L$0 = null;
                            c01321.L$1 = null;
                            c01321.L$2 = null;
                            c01321.label = 3;
                            if (flowCollector2.emit(t2, c01321) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                    FlowCollector<T> flowCollector322 = flowCollector;
                    t2 = t;
                    flowCollector2 = flowCollector322;
                    m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                    if (m7274exceptionOrNullimpl != null) {
                        Function2 function22 = anonymousClass1.$error$inlined;
                        c01321.L$0 = t2;
                        c01321.L$1 = flowCollector2;
                        c01321.L$2 = m7271constructorimpl;
                        c01321.label = 2;
                        InlineMarker.mark(6);
                        Object invoke2 = function22.invoke(m7274exceptionOrNullimpl, c01321);
                        InlineMarker.mark(7);
                        if (invoke2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        t3 = t2;
                        t2 = t3;
                    }
                    c01321.L$0 = null;
                    c01321.L$1 = null;
                    c01321.L$2 = null;
                    c01321.label = 3;
                    if (flowCollector2.emit(t2, c01321) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
            c01321 = new C01321(continuation);
            Object obj5 = c01321.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c01321.label;
            if (i != 0) {
            }
            m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
            FlowCollector<T> flowCollector3222 = flowCollector;
            t2 = t;
            flowCollector2 = flowCollector3222;
            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
            if (m7274exceptionOrNullimpl != null) {
            }
            c01321.L$0 = null;
            c01321.L$1 = null;
            c01321.L$2 = null;
            c01321.label = 3;
            if (flowCollector2.emit(t2, c01321) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
