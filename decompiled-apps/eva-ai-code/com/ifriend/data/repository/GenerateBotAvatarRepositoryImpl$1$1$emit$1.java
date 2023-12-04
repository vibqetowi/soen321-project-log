package com.ifriend.data.repository;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$1$1", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 0, 1, 1, 1, 2, 2, 4, 4, 4, 5, 5, 6, 6, 6}, l = {73, 75, 78, 79, 86, 87, ModuleDescriptor.MODULE_VERSION, 94}, m = "emit", n = {"this", "it", "this", "it", "generatedAvatars", "this", "generatedAvatars", "this", "it", "generatedAvatars", "this", "it", "this", "it", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl.AnonymousClass1.C01371<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GenerateBotAvatarRepositoryImpl$1$1$emit$1(GenerateBotAvatarRepositoryImpl.AnonymousClass1.C01371<? super T> c01371, Continuation<? super GenerateBotAvatarRepositoryImpl$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c01371;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((MessagesSourceMessage.AvatarsGenerated) null, (Continuation<? super Unit>) this);
    }
}
