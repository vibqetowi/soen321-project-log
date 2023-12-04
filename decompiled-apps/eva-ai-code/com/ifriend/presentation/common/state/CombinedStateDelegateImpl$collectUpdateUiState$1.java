package com.ifriend.presentation.common.state;

import androidx.appcompat.app.AppCompatDelegate;
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
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: State
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@"}, d2 = {"UiState", "State", "Event", "state", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateImpl$collectUpdateUiState$1", f = "CombinedStateDelegate.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl$collectUpdateUiState$1 extends SuspendLambda implements Function2<State, Continuation<? super Unit>, Object> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_collectUpdateUiState;
    final /* synthetic */ Function2<State, UiState, UiState> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateImpl$collectUpdateUiState$1(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Function2<? super State, ? super UiState, ? extends UiState> function2, Continuation<? super CombinedStateDelegateImpl$collectUpdateUiState$1> continuation) {
        super(2, continuation);
        this.$this_collectUpdateUiState = combinedStateDelegate;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CombinedStateDelegateImpl$collectUpdateUiState$1 combinedStateDelegateImpl$collectUpdateUiState$1 = new CombinedStateDelegateImpl$collectUpdateUiState$1(this.$this_collectUpdateUiState, this.$transform, continuation);
        combinedStateDelegateImpl$collectUpdateUiState$1.L$0 = obj;
        return combinedStateDelegateImpl$collectUpdateUiState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke2((CombinedStateDelegateImpl$collectUpdateUiState$1) obj, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(State state, Continuation<? super Unit> continuation) {
        return ((CombinedStateDelegateImpl$collectUpdateUiState$1) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedStateDelegate.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "UiState", "State", "Event", "uiState", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.common.state.CombinedStateDelegateImpl$collectUpdateUiState$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
        final /* synthetic */ State $state;
        final /* synthetic */ Function2<State, UiState, UiState> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super State, ? super UiState, ? extends UiState> function2, State state) {
            super(1);
            this.$transform = function2;
            this.$state = state;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, UiState] */
        @Override // kotlin.jvm.functions.Function1
        public final UiState invoke(UiState uistate) {
            return this.$transform.invoke(this.$state, uistate);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            UiStateDelegate uiStateDelegate = this.$this_collectUpdateUiState;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(this.$transform, obj2), this) == coroutine_suspended) {
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
