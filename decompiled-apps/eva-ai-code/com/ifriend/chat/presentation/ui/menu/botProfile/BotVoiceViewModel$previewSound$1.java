package com.ifriend.chat.presentation.ui.menu.botProfile;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotVoiceViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel", f = "BotVoiceViewModel.kt", i = {0, 0, 0}, l = {82}, m = "previewSound", n = {"this", "context", "audioUrl"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class BotVoiceViewModel$previewSound$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BotVoiceViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotVoiceViewModel$previewSound$1(BotVoiceViewModel botVoiceViewModel, Continuation<? super BotVoiceViewModel$previewSound$1> continuation) {
        super(continuation);
        this.this$0 = botVoiceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object previewSound;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        previewSound = this.this$0.previewSound(0, this);
        return previewSound;
    }
}
