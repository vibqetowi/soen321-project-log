package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AudioPlaybackSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioPlaybackSystem", f = "AudioPlaybackSystem.kt", i = {}, l = {TsExtractor.TS_SYNC_BYTE, 73}, m = "onHandleEvent", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AudioPlaybackSystem$onHandleEvent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioPlaybackSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlaybackSystem$onHandleEvent$1(AudioPlaybackSystem audioPlaybackSystem, Continuation<? super AudioPlaybackSystem$onHandleEvent$1> continuation) {
        super(continuation);
        this.this$0 = audioPlaybackSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onHandleEvent(null, this);
    }
}
