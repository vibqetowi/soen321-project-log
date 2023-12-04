package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodingAudioEventsHandlingSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2", f = "DecodingAudioEventsHandlingSystem.kt", i = {}, l = {95, 97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MessageContent.Audio $content;
    final /* synthetic */ ChatMessage $message;
    int label;
    final /* synthetic */ DecodingAudioEventsHandlingSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2(DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem, MessageContent.Audio audio, ChatMessage chatMessage, Continuation<? super DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2> continuation) {
        super(2, continuation);
        this.this$0 = decodingAudioEventsHandlingSystem;
        this.$content = audio;
        this.$message = chatMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2(this.this$0, this.$content, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DecodingAudioDurationCalculator decodingAudioDurationCalculator;
        Set set;
        DecodedAudioMessagesRepository decodedAudioMessagesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            decodingAudioDurationCalculator = this.this$0.durationCalculator;
            this.label = 1;
            if (DelayKt.delay(decodingAudioDurationCalculator.calculateDecodingTimeInMillis(this.$content.getText()), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                this.this$0.reportUpdateState();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        set = this.this$0.audioIdsToFinishDecoding;
        set.add(ChatMessageKt.getId(this.$message));
        decodedAudioMessagesRepository = this.this$0.repository;
        this.label = 2;
        if (decodedAudioMessagesRepository.setAudioMessageTextShowed(ChatMessageKt.getId(this.$message), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.reportUpdateState();
        return Unit.INSTANCE;
    }
}
