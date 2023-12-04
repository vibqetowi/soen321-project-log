package com.ifriend.presentation.features.chatcall.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel", f = "ChatCallViewModel.kt", i = {0}, l = {343, 344}, m = "finishCallAndCloseFeature", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$finishCallAndCloseFeature$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$finishCallAndCloseFeature$1(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$finishCallAndCloseFeature$1> continuation) {
        super(continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object finishCallAndCloseFeature;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        finishCallAndCloseFeature = this.this$0.finishCallAndCloseFeature(null, false, this);
        return finishCallAndCloseFeature;
    }
}
