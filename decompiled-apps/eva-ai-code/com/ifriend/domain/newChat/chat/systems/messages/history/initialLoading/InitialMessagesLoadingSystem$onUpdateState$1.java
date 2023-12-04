package com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading;

import com.ifriend.common_entities_engine.EntitiesState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialMessagesLoadingSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading.InitialMessagesLoadingSystem", f = "InitialMessagesLoadingSystem.kt", i = {0}, l = {20}, m = "onUpdateState", n = {"state"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class InitialMessagesLoadingSystem$onUpdateState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitialMessagesLoadingSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialMessagesLoadingSystem$onUpdateState$1(InitialMessagesLoadingSystem initialMessagesLoadingSystem, Continuation<? super InitialMessagesLoadingSystem$onUpdateState$1> continuation) {
        super(continuation);
        this.this$0 = initialMessagesLoadingSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onUpdateState((EntitiesState) null, (Continuation<? super EntitiesState>) this);
    }
}
