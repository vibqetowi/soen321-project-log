package com.ifriend.presentation.common.uistate;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UiStateDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"UiState", "Event", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.uistate.UiStateDelegateImpl$asyncUpdateUiState$1", f = "UiStateDelegate.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UiStateDelegateImpl$asyncUpdateUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiStateDelegate<UiState, Event> $this_asyncUpdateUiState;
    final /* synthetic */ Function1<UiState, UiState> $transform;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UiStateDelegateImpl$asyncUpdateUiState$1(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super UiStateDelegateImpl$asyncUpdateUiState$1> continuation) {
        super(2, continuation);
        this.$this_asyncUpdateUiState = uiStateDelegate;
        this.$transform = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiStateDelegateImpl$asyncUpdateUiState$1(this.$this_asyncUpdateUiState, this.$transform, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UiStateDelegateImpl$asyncUpdateUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UiStateDelegate.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "UiState", "Event", "state", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.common.uistate.UiStateDelegateImpl$asyncUpdateUiState$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
        final /* synthetic */ Function1<UiState, UiState> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super UiState, ? extends UiState> function1) {
            super(1);
            this.$transform = function1;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, UiState] */
        @Override // kotlin.jvm.functions.Function1
        public final UiState invoke(UiState uistate) {
            return this.$transform.invoke(uistate);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<UiState, Event> uiStateDelegate = this.$this_asyncUpdateUiState;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(this.$transform), this) == coroutine_suspended) {
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
