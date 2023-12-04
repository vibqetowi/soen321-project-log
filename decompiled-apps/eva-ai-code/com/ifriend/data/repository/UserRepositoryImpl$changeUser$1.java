package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.UserRepositoryImpl", f = "UserRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 2, 2}, l = {180, 183, 184, 187}, m = "changeUser", n = {"this", "makeRequest", "auth", "oldUser", "this", "oldUser", "this", "oldUser"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class UserRepositoryImpl$changeUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$changeUser$1(UserRepositoryImpl userRepositoryImpl, Continuation<? super UserRepositoryImpl$changeUser$1> continuation) {
        super(continuation);
        this.this$0 = userRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object changeUser;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        changeUser = this.this$0.changeUser(null, null, this);
        return changeUser;
    }
}
