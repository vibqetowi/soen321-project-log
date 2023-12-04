package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$init$1;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$init$1$1", f = "UserProfileViewModel.kt", i = {0, 0}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "emit", n = {"this", "user"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class UserProfileViewModel$init$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserProfileViewModel$init$1.AnonymousClass1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$init$1$1$emit$1(UserProfileViewModel$init$1.AnonymousClass1 anonymousClass1, Continuation<? super UserProfileViewModel$init$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit2((User) null, (Continuation<? super Unit>) this);
    }
}
