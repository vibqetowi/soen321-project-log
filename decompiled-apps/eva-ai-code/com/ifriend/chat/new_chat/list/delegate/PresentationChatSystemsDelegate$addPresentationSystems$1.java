package com.ifriend.chat.new_chat.list.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PresentationChatSystemsDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.delegate.PresentationChatSystemsDelegate", f = "PresentationChatSystemsDelegate.kt", i = {0, 0}, l = {33}, m = "addPresentationSystems", n = {"this", "chatId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class PresentationChatSystemsDelegate$addPresentationSystems$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PresentationChatSystemsDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentationChatSystemsDelegate$addPresentationSystems$1(PresentationChatSystemsDelegate presentationChatSystemsDelegate, Continuation<? super PresentationChatSystemsDelegate$addPresentationSystems$1> continuation) {
        super(continuation);
        this.this$0 = presentationChatSystemsDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addPresentationSystems(null, this);
    }
}
