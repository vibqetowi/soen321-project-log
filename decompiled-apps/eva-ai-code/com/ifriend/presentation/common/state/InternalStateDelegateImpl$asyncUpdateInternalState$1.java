package com.ifriend.presentation.common.state;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InternalStateDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"State", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.InternalStateDelegateImpl$asyncUpdateInternalState$1", f = "InternalStateDelegate.kt", i = {}, l = {TsExtractor.TS_SYNC_BYTE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InternalStateDelegateImpl$asyncUpdateInternalState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InternalStateDelegate<State> $this_asyncUpdateInternalState;
    final /* synthetic */ Function1<State, State> $transform;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalStateDelegateImpl$asyncUpdateInternalState$1(InternalStateDelegate<State> internalStateDelegate, Function1<? super State, ? extends State> function1, Continuation<? super InternalStateDelegateImpl$asyncUpdateInternalState$1> continuation) {
        super(2, continuation);
        this.$this_asyncUpdateInternalState = internalStateDelegate;
        this.$transform = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalStateDelegateImpl$asyncUpdateInternalState$1(this.$this_asyncUpdateInternalState, this.$transform, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalStateDelegateImpl$asyncUpdateInternalState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InternalStateDelegate<State> internalStateDelegate = this.$this_asyncUpdateInternalState;
            this.label = 1;
            if (internalStateDelegate.updateInternalState(internalStateDelegate, this.$transform, this) == coroutine_suspended) {
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
