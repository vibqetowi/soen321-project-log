package com.ifriend.data.socket.generator;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaPlayerPlaybackControllerGenerator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator", f = "MediaPlayerPlaybackControllerGenerator.kt", i = {0}, l = {13}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class MediaPlayerPlaybackControllerGenerator$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaPlayerPlaybackControllerGenerator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerPlaybackControllerGenerator$invoke$1(MediaPlayerPlaybackControllerGenerator mediaPlayerPlaybackControllerGenerator, Continuation<? super MediaPlayerPlaybackControllerGenerator$invoke$1> continuation) {
        super(continuation);
        this.this$0 = mediaPlayerPlaybackControllerGenerator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
