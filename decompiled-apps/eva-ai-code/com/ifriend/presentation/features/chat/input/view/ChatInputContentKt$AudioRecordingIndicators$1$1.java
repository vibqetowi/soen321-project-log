package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.runtime.MutableState;
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
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$AudioRecordingIndicators$1$1", f = "ChatInputContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatInputContentKt$AudioRecordingIndicators$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $cancelled;
    final /* synthetic */ boolean $isRecording;
    final /* synthetic */ MutableState<Boolean> $isVisible$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$AudioRecordingIndicators$1$1(boolean z, boolean z2, MutableState<Boolean> mutableState, Continuation<? super ChatInputContentKt$AudioRecordingIndicators$1$1> continuation) {
        super(2, continuation);
        this.$isRecording = z;
        this.$cancelled = z2;
        this.$isVisible$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputContentKt$AudioRecordingIndicators$1$1(this.$isRecording, this.$cancelled, this.$isVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputContentKt$AudioRecordingIndicators$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isRecording) {
            ChatInputContentKt.AudioRecordingIndicators$lambda$10(this.$isVisible$delegate, true);
        } else if (!this.$cancelled) {
            ChatInputContentKt.AudioRecordingIndicators$lambda$10(this.$isVisible$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
