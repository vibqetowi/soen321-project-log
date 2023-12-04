package com.ifriend.presentation.common.state;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
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
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: UiState
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0002H\u008a@"}, d2 = {"T1", "T2", "UiState", "State", "Event", "newState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateImpl$combineCollectUpdateUiState$4", f = "CombinedStateDelegate.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl$combineCollectUpdateUiState$4 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_combineCollectUpdateUiState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedStateDelegateImpl$combineCollectUpdateUiState$4(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Continuation<? super CombinedStateDelegateImpl$combineCollectUpdateUiState$4> continuation) {
        super(2, continuation);
        this.$this_combineCollectUpdateUiState = combinedStateDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CombinedStateDelegateImpl$combineCollectUpdateUiState$4 combinedStateDelegateImpl$combineCollectUpdateUiState$4 = new CombinedStateDelegateImpl$combineCollectUpdateUiState$4(this.$this_combineCollectUpdateUiState, continuation);
        combinedStateDelegateImpl$combineCollectUpdateUiState$4.L$0 = obj;
        return combinedStateDelegateImpl$combineCollectUpdateUiState$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke2((CombinedStateDelegateImpl$combineCollectUpdateUiState$4) obj, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(UiState uistate, Continuation<? super Unit> continuation) {
        return ((CombinedStateDelegateImpl$combineCollectUpdateUiState$4) create(uistate, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedStateDelegate.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\t\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "UiState", "T1", "T2", "State", "Event", "<anonymous parameter 0>", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.common.state.CombinedStateDelegateImpl$combineCollectUpdateUiState$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
        final /* synthetic */ UiState $newState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UiState uistate) {
            super(1);
            this.$newState = uistate;
        }

        @Override // kotlin.jvm.functions.Function1
        public final UiState invoke(UiState uistate) {
            return this.$newState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            UiStateDelegate uiStateDelegate = this.$this_combineCollectUpdateUiState;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(obj2), this) == coroutine_suspended) {
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
