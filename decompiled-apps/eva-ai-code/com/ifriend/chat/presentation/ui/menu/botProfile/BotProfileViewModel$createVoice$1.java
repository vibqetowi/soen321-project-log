package com.ifriend.chat.presentation.ui.menu.botProfile;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotProfileViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel", f = "BotProfileViewModel.kt", i = {0, 0, 0}, l = {119}, m = "createVoice", n = {"bot", "user", "voiceUrl"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class BotProfileViewModel$createVoice$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BotProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfileViewModel$createVoice$1(BotProfileViewModel botProfileViewModel, Continuation<? super BotProfileViewModel$createVoice$1> continuation) {
        super(continuation);
        this.this$0 = botProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createVoice;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createVoice = this.this$0.createVoice(null, null, this);
        return createVoice;
    }
}
