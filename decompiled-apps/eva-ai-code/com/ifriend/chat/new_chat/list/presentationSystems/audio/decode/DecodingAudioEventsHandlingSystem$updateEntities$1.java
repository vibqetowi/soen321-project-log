package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodingAudioEventsHandlingSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioEventsHandlingSystem", f = "DecodingAudioEventsHandlingSystem.kt", i = {0, 0}, l = {64}, m = "updateEntities", n = {"this", "destination$iv$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class DecodingAudioEventsHandlingSystem$updateEntities$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DecodingAudioEventsHandlingSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodingAudioEventsHandlingSystem$updateEntities$1(DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem, Continuation<? super DecodingAudioEventsHandlingSystem$updateEntities$1> continuation) {
        super(continuation);
        this.this$0 = decodingAudioEventsHandlingSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateEntities;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateEntities = this.this$0.updateEntities(null, this);
        return updateEntities;
    }
}
