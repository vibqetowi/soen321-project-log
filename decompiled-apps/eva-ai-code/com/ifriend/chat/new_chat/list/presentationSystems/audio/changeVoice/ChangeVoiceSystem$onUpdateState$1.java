package com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice;

import com.ifriend.common_entities_engine.EntitiesState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChangeVoiceSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChangeVoiceSystem", f = "ChangeVoiceSystem.kt", i = {0, 0}, l = {29, 30}, m = "onUpdateState", n = {"this", "state"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChangeVoiceSystem$onUpdateState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChangeVoiceSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeVoiceSystem$onUpdateState$1(ChangeVoiceSystem changeVoiceSystem, Continuation<? super ChangeVoiceSystem$onUpdateState$1> continuation) {
        super(continuation);
        this.this$0 = changeVoiceSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onUpdateState((EntitiesState) null, (Continuation<? super EntitiesState>) this);
    }
}
