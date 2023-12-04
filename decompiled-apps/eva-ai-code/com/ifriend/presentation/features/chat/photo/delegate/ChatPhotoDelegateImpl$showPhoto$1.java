package com.ifriend.presentation.features.chat.photo.delegate;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ChatPhotoDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatPhotoDelegateImpl$showPhoto$1 extends FunctionReferenceImpl implements Function2<Throwable, Continuation<? super Unit>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatPhotoDelegateImpl$showPhoto$1(Object obj) {
        super(2, obj, FlowObserverEmitter.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((FlowObserverEmitter) this.receiver).emit(th, continuation);
    }
}
