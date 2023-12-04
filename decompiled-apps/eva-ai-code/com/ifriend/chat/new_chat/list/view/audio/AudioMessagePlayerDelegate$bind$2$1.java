package com.ifriend.chat.new_chat.list.view.audio;

import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessageView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AudioMessagePlayerDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.view.audio.AudioMessagePlayerDelegate$bind$2$1", f = "AudioMessagePlayerDelegate.kt", i = {1}, l = {30, 31}, m = "invokeSuspend", n = {"position"}, s = {"J$0"})
/* loaded from: classes6.dex */
public final class AudioMessagePlayerDelegate$bind$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioMessageUiModel $model;
    long J$0;
    int label;
    final /* synthetic */ AudioMessagePlayerDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessagePlayerDelegate$bind$2$1(AudioMessagePlayerDelegate audioMessagePlayerDelegate, AudioMessageUiModel audioMessageUiModel, Continuation<? super AudioMessagePlayerDelegate$bind$2$1> continuation) {
        super(2, continuation);
        this.this$0 = audioMessagePlayerDelegate;
        this.$model = audioMessageUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioMessagePlayerDelegate$bind$2$1(this.this$0, this.$model, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioMessagePlayerDelegate$bind$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AudioPlayer audioPlayer;
        AudioPlayer audioPlayer2;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            audioPlayer = this.this$0.audioPlayer;
            this.label = 1;
            obj = audioPlayer.currentPosition(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                this.this$0.viewState(new AudioMessageView.Playing(j, ((Number) obj).longValue()), this.$model.getHistogram());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        long longValue = ((Number) obj).longValue();
        audioPlayer2 = this.this$0.audioPlayer;
        this.J$0 = longValue;
        this.label = 2;
        obj = audioPlayer2.duration(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = longValue;
        this.this$0.viewState(new AudioMessageView.Playing(j, ((Number) obj).longValue()), this.$model.getHistogram());
        return Unit.INSTANCE;
    }
}
