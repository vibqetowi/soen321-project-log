package com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChangeVoiceSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChangeVoiceSystem", f = "ChangeVoiceSystem.kt", i = {0, 0, 1, 2}, l = {39, 48, 48}, m = "checkAudioMessage", n = {"this", FirebaseAnalytics.Param.CONTENT, "this", "this"}, s = {"L$0", "L$2", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class ChangeVoiceSystem$checkAudioMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChangeVoiceSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeVoiceSystem$checkAudioMessage$1(ChangeVoiceSystem changeVoiceSystem, Continuation<? super ChangeVoiceSystem$checkAudioMessage$1> continuation) {
        super(continuation);
        this.this$0 = changeVoiceSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object checkAudioMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkAudioMessage = this.this$0.checkAudioMessage(null, this);
        return checkAudioMessage;
    }
}
