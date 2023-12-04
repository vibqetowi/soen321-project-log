package com.ifriend.chat.domain.profile.user;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteUserUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.domain.profile.user.DeleteUserUseCase", f = "DeleteUserUseCase.kt", i = {}, l = {13}, m = "invoke", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DeleteUserUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteUserUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteUserUseCase$invoke$1(DeleteUserUseCase deleteUserUseCase, Continuation<? super DeleteUserUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = deleteUserUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
