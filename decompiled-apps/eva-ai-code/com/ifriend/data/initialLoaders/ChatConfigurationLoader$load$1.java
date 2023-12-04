package com.ifriend.data.initialLoaders;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatConfigurationLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.initialLoaders.ChatConfigurationLoader", f = "ChatConfigurationLoader.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {21, 23, 25, 27, 33, 39}, m = "load", n = {"this", "user", "this", "user", "this", "user", "this", "user", "this", "mainChatId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatConfigurationLoader$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatConfigurationLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatConfigurationLoader$load$1(ChatConfigurationLoader chatConfigurationLoader, Continuation<? super ChatConfigurationLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = chatConfigurationLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(this);
    }
}
