package com.ifriend.data.storages.avatar;

import com.facebook.share.internal.ShareInternalUtility;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AvatarsStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.avatar.AvatarsStorageImpl", f = "AvatarsStorage.kt", i = {0}, l = {123}, m = "saveFile", n = {ShareInternalUtility.STAGING_PARAM}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class AvatarsStorageImpl$saveFile$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AvatarsStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsStorageImpl$saveFile$1(AvatarsStorageImpl avatarsStorageImpl, Continuation<? super AvatarsStorageImpl$saveFile$1> continuation) {
        super(continuation);
        this.this$0 = avatarsStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object saveFile;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        saveFile = this.this$0.saveFile(null, null, this);
        return saveFile;
    }
}
