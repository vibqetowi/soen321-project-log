package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.platform.tools.api.speech.TextToSpeechMessageState;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "speechState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$6", f = "ChatCallViewModel.kt", i = {1}, l = {200, 208, 212, 217, 219}, m = "invokeSuspend", n = {"speechState"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$initCall$6 extends SuspendLambda implements Function2<TextToSpeechMessageState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$initCall$6(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$initCall$6> continuation) {
        super(2, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatCallViewModel$initCall$6 chatCallViewModel$initCall$6 = new ChatCallViewModel$initCall$6(this.this$0, continuation);
        chatCallViewModel$initCall$6.L$0 = obj;
        return chatCallViewModel$initCall$6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextToSpeechMessageState textToSpeechMessageState, Continuation<? super Unit> continuation) {
        return ((ChatCallViewModel$initCall$6) create(textToSpeechMessageState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextToSpeechMessageState textToSpeechMessageState;
        String finishMessageId;
        String firstMessageId;
        VoiceRecognitionStreaming voiceRecognitionStreaming;
        Object lastMessagePlayed;
        String firstMessageId2;
        String finishMessageId2;
        String firstMessageId3;
        VoiceRecognitionStreaming voiceRecognitionStreaming2;
        Object lastMessagePlayed2;
        Map map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            textToSpeechMessageState = (TextToSpeechMessageState) this.L$0;
            if (textToSpeechMessageState instanceof TextToSpeechMessageState.Done) {
                String messageId = textToSpeechMessageState.getMessageId();
                finishMessageId2 = this.this$0.getFinishMessageId();
                if (Intrinsics.areEqual(messageId, finishMessageId2)) {
                    this.label = 1;
                    lastMessagePlayed2 = this.this$0.lastMessagePlayed(this);
                    if (lastMessagePlayed2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    firstMessageId3 = this.this$0.getFirstMessageId();
                    if (Intrinsics.areEqual(messageId, firstMessageId3)) {
                        this.this$0.initMessageFlow();
                    } else {
                        voiceRecognitionStreaming2 = this.this$0.voiceRecognitionStreaming;
                        voiceRecognitionStreaming2.resumeRecognition();
                    }
                }
            } else if (textToSpeechMessageState instanceof TextToSpeechMessageState.Start) {
                String messageId2 = textToSpeechMessageState.getMessageId();
                firstMessageId2 = this.this$0.getFirstMessageId();
                if (Intrinsics.areEqual(messageId2, firstMessageId2)) {
                    UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate = this.this$0;
                    this.L$0 = textToSpeechMessageState;
                    this.label = 2;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.this$0.startTimer();
                }
            } else if (textToSpeechMessageState instanceof TextToSpeechMessageState.Error) {
                String messageId3 = textToSpeechMessageState.getMessageId();
                finishMessageId = this.this$0.getFinishMessageId();
                if (Intrinsics.areEqual(messageId3, finishMessageId)) {
                    this.label = 4;
                    lastMessagePlayed = this.this$0.lastMessagePlayed(this);
                    if (lastMessagePlayed == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    firstMessageId = this.this$0.getFirstMessageId();
                    if (!Intrinsics.areEqual(messageId3, firstMessageId)) {
                        voiceRecognitionStreaming = this.this$0.voiceRecognitionStreaming;
                        voiceRecognitionStreaming.resumeRecognition();
                    } else {
                        this.label = 5;
                        if (ChatCallViewModel.finishCallAndCloseFeature$default(this.this$0, FinishCallReason.INTERNAL_ERROR, false, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i == 2) {
                textToSpeechMessageState = (TextToSpeechMessageState) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.this$0.startTimer();
            } else if (i != 3 && i != 4 && i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
        map = this.this$0.messages;
        UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate2 = this.this$0;
        this.L$0 = null;
        this.label = 3;
        if (uiStateDelegate2.updateUiState(uiStateDelegate2, new AnonymousClass2((String) map.remove(textToSpeechMessageState.getMessageId())), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$6$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatCallViewModel.UiState, ChatCallViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatCallViewModel.UiState invoke(ChatCallViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatCallViewModel.UiState.copy$default(state, null, false, null, false, null, null, null, 0L, null, null, null, false, 4093, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$6$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<ChatCallViewModel.UiState, ChatCallViewModel.UiState> {
        final /* synthetic */ String $lastMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(1);
            this.$lastMessage = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatCallViewModel.UiState invoke(ChatCallViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            String str = this.$lastMessage;
            if (str == null) {
                str = "";
            }
            return ChatCallViewModel.UiState.copy$default(state, null, false, null, false, null, null, null, 0L, str, null, null, false, 3839, null);
        }
    }
}
