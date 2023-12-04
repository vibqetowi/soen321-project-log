package com.ifriend.chat.presentation.ui.rateApp;

import com.ifriend.ui.base.mvvm.BaseEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* compiled from: RateAppFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class RateAppFragment$onViewCreated$3 extends AdaptedFunctionReference implements Function2<BaseEvent, Continuation<? super Unit>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RateAppFragment$onViewCreated$3(Object obj) {
        super(2, obj, RateAppFragment.class, "handleEvent", "handleEvent(Lcom/ifriend/ui/base/mvvm/BaseEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseEvent baseEvent, Continuation<? super Unit> continuation) {
        Object onViewCreated$handleEvent;
        onViewCreated$handleEvent = RateAppFragment.onViewCreated$handleEvent((RateAppFragment) this.receiver, baseEvent, continuation);
        return onViewCreated$handleEvent;
    }
}
