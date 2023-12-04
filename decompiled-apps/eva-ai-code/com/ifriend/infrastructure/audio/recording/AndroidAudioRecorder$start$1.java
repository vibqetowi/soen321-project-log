package com.ifriend.infrastructure.audio.recording;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder", f = "AndroidAudioRecorder.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, LockFreeTaskQueueCore.FROZEN_SHIFT, SSL.SSL_PROTOCOL_TLS}, m = TtmlNode.START, n = {"this", "filePath", "this", "filePath", "this", "filePath", "ex"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class AndroidAudioRecorder$start$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidAudioRecorder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAudioRecorder$start$1(AndroidAudioRecorder androidAudioRecorder, Continuation<? super AndroidAudioRecorder$start$1> continuation) {
        super(continuation);
        this.this$0 = androidAudioRecorder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start(this);
    }
}
