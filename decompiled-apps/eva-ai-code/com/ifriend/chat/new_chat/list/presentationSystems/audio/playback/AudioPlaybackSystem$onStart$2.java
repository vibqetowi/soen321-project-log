package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import com.ifriend.chat.new_chat.list.player.AudioPlayerStateBox;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: AudioPlaybackSystem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioPlaybackSystem$onStart$2", f = "AudioPlaybackSystem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AudioPlaybackSystem$onStart$2 extends SuspendLambda implements Function3<FlowCollector<? super AudioPlayerStateBox>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AudioPlaybackSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlaybackSystem$onStart$2(AudioPlaybackSystem audioPlaybackSystem, Continuation<? super AudioPlaybackSystem$onStart$2> continuation) {
        super(3, continuation);
        this.this$0 = audioPlaybackSystem;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super AudioPlayerStateBox> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        AudioPlaybackSystem$onStart$2 audioPlaybackSystem$onStart$2 = new AudioPlaybackSystem$onStart$2(this.this$0, continuation);
        audioPlaybackSystem$onStart$2.L$0 = th;
        return audioPlaybackSystem$onStart$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.throwException((Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
