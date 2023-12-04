package com.ifriend.data.storages.avatar;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AvatarsStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.avatar.AvatarsStorageImpl", f = "AvatarsStorage.kt", i = {0, 0, 1, 1, 2, 2, 3}, l = {SSL.SSL_PROTOCOL_TLS, 63, 65, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 68}, m = "updateUserAvatarByGenerated", n = {"this", "name", "this", "name", "this", "name", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class AvatarsStorageImpl$updateUserAvatarByGenerated$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AvatarsStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsStorageImpl$updateUserAvatarByGenerated$1(AvatarsStorageImpl avatarsStorageImpl, Continuation<? super AvatarsStorageImpl$updateUserAvatarByGenerated$1> continuation) {
        super(continuation);
        this.this$0 = avatarsStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateUserAvatarByGenerated(null, this);
    }
}
