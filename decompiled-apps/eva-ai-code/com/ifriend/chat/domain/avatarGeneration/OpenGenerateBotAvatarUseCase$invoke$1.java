package com.ifriend.chat.domain.avatarGeneration;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OpenGenerateBotAvatarUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.domain.avatarGeneration.OpenGenerateBotAvatarUseCase", f = "OpenGenerateBotAvatarUseCase.kt", i = {0, 0}, l = {18}, m = "invoke", n = {"this", "onBeforeNavigation"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class OpenGenerateBotAvatarUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpenGenerateBotAvatarUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGenerateBotAvatarUseCase$invoke$1(OpenGenerateBotAvatarUseCase openGenerateBotAvatarUseCase, Continuation<? super OpenGenerateBotAvatarUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = openGenerateBotAvatarUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
