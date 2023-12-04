package com.ifriend.chat.new_chat.list.player;

import androidx.core.os.BundleKt;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AudioPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.player.AudioPlayer$loadAndPlayAudio$2", f = "AudioPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AudioPlayer$loadAndPlayAudio$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioMedia $audioMedia;
    int label;
    final /* synthetic */ AudioPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayer$loadAndPlayAudio$2(AudioPlayer audioPlayer, AudioMedia audioMedia, Continuation<? super AudioPlayer$loadAndPlayAudio$2> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayer;
        this.$audioMedia = audioMedia;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioPlayer$loadAndPlayAudio$2(this.this$0, this.$audioMedia, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlayer$loadAndPlayAudio$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ExoPlayer player;
        MutableStateFlow mutableStateFlow;
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            player = this.this$0.getPlayer();
            AudioMedia audioMedia = this.$audioMedia;
            AudioPlayer audioPlayer = this.this$0;
            player.stop();
            MediaMetadata build = new MediaMetadata.Builder().setExtras(BundleKt.bundleOf(TuplesKt.to(AudioPlayer.MEDIA_EXTRA_DATA_KEY, audioMedia))).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            MediaItem build2 = new MediaItem.Builder().setUri(audioMedia.getAudioUrl()).setMediaMetadata(build).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            player.setMediaItem(build2);
            mutableStateFlow = audioPlayer.state;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ((AudioPlayerStateBox) value).copy(audioMedia.getAudioUrl(), build2, AudioPlayerState.Idle.INSTANCE)));
            player.prepare();
            player.play();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
