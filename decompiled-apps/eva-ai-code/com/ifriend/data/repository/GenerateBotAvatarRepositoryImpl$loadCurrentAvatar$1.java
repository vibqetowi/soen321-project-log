package com.ifriend.data.repository;

import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11}, l = {230, 232, 236, 237, 238, 238, 243, 245, 248, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 256, 255, 260}, m = "loadCurrentAvatar", n = {"this", "this", "generatedAvatarInfoResponse", "this", "generatedAvatarInfoResponse", "this", "generatedAvatarInfoResponse", "avatarImage", "this", "generatedAvatarInfoResponse", "avatarImage", "this", "generatedAvatarInfoResponse", "this", "generatedAvatarInfoResponse", "this", "generatedAvatarInfoResponse", "this", "generatedAvatarInfoResponse", "currentAvatarWithImage", "this", "generatedAvatarInfoResponse", "currentAvatarWithImage", "videoAvatar", "this", "currentAvatarWithImage", "videoAvatar"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Continuation<? super GenerateBotAvatarRepositoryImpl$loadCurrentAvatar$1> continuation) {
        super(continuation);
        this.this$0 = generateBotAvatarRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadCurrentAvatar(this);
    }
}
