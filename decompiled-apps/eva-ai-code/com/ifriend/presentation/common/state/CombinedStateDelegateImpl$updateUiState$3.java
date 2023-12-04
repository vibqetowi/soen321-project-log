package com.ifriend.presentation.common.state;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "UiState", "State", "Event", "uiState", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CombinedStateDelegateImpl$updateUiState$3 extends Lambda implements Function1<UiState, UiState> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_updateUiState;
    final /* synthetic */ Function2<UiState, State, UiState> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateImpl$updateUiState$3(Function2<? super UiState, ? super State, ? extends UiState> function2, CombinedStateDelegate<UiState, State, Event> combinedStateDelegate) {
        super(1);
        this.$transform = function2;
        this.$this_updateUiState = combinedStateDelegate;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, UiState] */
    @Override // kotlin.jvm.functions.Function1
    public final UiState invoke(UiState uistate) {
        Function2<UiState, State, UiState> function2 = this.$transform;
        InternalStateDelegate internalStateDelegate = this.$this_updateUiState;
        return function2.invoke(uistate, internalStateDelegate.getInternalState(internalStateDelegate));
    }
}
