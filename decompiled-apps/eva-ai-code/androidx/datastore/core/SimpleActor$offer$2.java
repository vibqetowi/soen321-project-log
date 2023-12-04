package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, Continuation<? super SimpleActor$offer$2> continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SimpleActor$offer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:24:0x0072). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        SimpleActor$offer$2 simpleActor$offer$2;
        Function2 function2;
        Object obj2;
        SimpleActor$offer$2 simpleActor$offer$22;
        CoroutineScope coroutineScope;
        Function2 function22;
        Object receive;
        AtomicInteger atomicInteger2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            atomicInteger = ((SimpleActor) this.this$0).remainingMessages;
            if (atomicInteger.get() > 0) {
                simpleActor$offer$2 = this;
                coroutineScope = ((SimpleActor) simpleActor$offer$2.this$0).scope;
                CoroutineScopeKt.ensureActive(coroutineScope);
                function22 = ((SimpleActor) simpleActor$offer$2.this$0).consumeMessage;
                simpleActor$offer$2.L$0 = function22;
                simpleActor$offer$2.label = 1;
                receive = ((SimpleActor) simpleActor$offer$2.this$0).messageQueue.receive(simpleActor$offer$2);
                if (receive == coroutine_suspended) {
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            function2 = (Function2) this.L$0;
            obj2 = coroutine_suspended;
            simpleActor$offer$22 = this;
            simpleActor$offer$22.L$0 = null;
            simpleActor$offer$22.label = 2;
            if (function2.invoke(obj, simpleActor$offer$22) != obj2) {
            }
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            simpleActor$offer$2 = this;
            atomicInteger2 = ((SimpleActor) simpleActor$offer$2.this$0).remainingMessages;
            if (atomicInteger2.decrementAndGet() == 0) {
                return Unit.INSTANCE;
            }
            coroutineScope = ((SimpleActor) simpleActor$offer$2.this$0).scope;
            CoroutineScopeKt.ensureActive(coroutineScope);
            function22 = ((SimpleActor) simpleActor$offer$2.this$0).consumeMessage;
            simpleActor$offer$2.L$0 = function22;
            simpleActor$offer$2.label = 1;
            receive = ((SimpleActor) simpleActor$offer$2.this$0).messageQueue.receive(simpleActor$offer$2);
            if (receive == coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            simpleActor$offer$22 = simpleActor$offer$2;
            obj = receive;
            function2 = function22;
            obj2 = obj3;
            simpleActor$offer$22.L$0 = null;
            simpleActor$offer$22.label = 2;
            if (function2.invoke(obj, simpleActor$offer$22) != obj2) {
                return obj2;
            }
            simpleActor$offer$2 = simpleActor$offer$22;
            coroutine_suspended = obj2;
            atomicInteger2 = ((SimpleActor) simpleActor$offer$2.this$0).remainingMessages;
            if (atomicInteger2.decrementAndGet() == 0) {
            }
            coroutineScope = ((SimpleActor) simpleActor$offer$2.this$0).scope;
            CoroutineScopeKt.ensureActive(coroutineScope);
            function22 = ((SimpleActor) simpleActor$offer$2.this$0).consumeMessage;
            simpleActor$offer$2.L$0 = function22;
            simpleActor$offer$2.label = 1;
            receive = ((SimpleActor) simpleActor$offer$2.this$0).messageQueue.receive(simpleActor$offer$2);
            if (receive == coroutine_suspended) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
