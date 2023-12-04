package com.ifriend.chat.presentation.ui.rateApp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* compiled from: RateAppFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class RateAppFragment$onViewCreated$2 extends AdaptedFunctionReference implements Function2<RateAppState, Continuation<? super Unit>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RateAppFragment$onViewCreated$2(Object obj) {
        super(2, obj, RateAppFragment.class, "showState", "showState(Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RateAppState rateAppState, Continuation<? super Unit> continuation) {
        Object onViewCreated$showState;
        onViewCreated$showState = RateAppFragment.onViewCreated$showState((RateAppFragment) this.receiver, rateAppState, continuation);
        return onViewCreated$showState;
    }
}
