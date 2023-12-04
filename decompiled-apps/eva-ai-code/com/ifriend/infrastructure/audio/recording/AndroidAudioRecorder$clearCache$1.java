package com.ifriend.infrastructure.audio.recording;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder", f = "AndroidAudioRecorder.kt", i = {0}, l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "clearCache", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class AndroidAudioRecorder$clearCache$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidAudioRecorder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAudioRecorder$clearCache$1(AndroidAudioRecorder androidAudioRecorder, Continuation<? super AndroidAudioRecorder$clearCache$1> continuation) {
        super(continuation);
        this.this$0 = androidAudioRecorder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearCache(this);
    }
}
