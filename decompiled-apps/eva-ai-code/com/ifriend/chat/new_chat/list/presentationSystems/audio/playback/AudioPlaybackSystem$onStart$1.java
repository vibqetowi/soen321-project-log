package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import com.ifriend.chat.new_chat.list.player.AudioPlayerStateBox;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: AudioPlaybackSystem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioPlaybackSystem$onStart$1", f = "AudioPlaybackSystem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AudioPlaybackSystem$onStart$1 extends SuspendLambda implements Function2<AudioPlayerStateBox, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AudioPlaybackSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlaybackSystem$onStart$1(AudioPlaybackSystem audioPlaybackSystem, Continuation<? super AudioPlaybackSystem$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = audioPlaybackSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioPlaybackSystem$onStart$1 audioPlaybackSystem$onStart$1 = new AudioPlaybackSystem$onStart$1(this.this$0, continuation);
        audioPlaybackSystem$onStart$1.L$0 = obj;
        return audioPlaybackSystem$onStart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AudioPlayerStateBox audioPlayerStateBox, Continuation<? super Unit> continuation) {
        return ((AudioPlaybackSystem$onStart$1) create(audioPlayerStateBox, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.lastPlayerState = (AudioPlayerStateBox) this.L$0;
            this.this$0.needToUpdateState = true;
            this.this$0.reportUpdateState();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
