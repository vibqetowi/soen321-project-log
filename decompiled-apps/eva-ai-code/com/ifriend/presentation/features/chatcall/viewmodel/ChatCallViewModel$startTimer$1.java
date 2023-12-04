package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.extensions.DurationKt;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
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
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startTimer$1", f = "ChatCallViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$startTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$startTimer$1(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$startTimer$1> continuation) {
        super(2, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatCallViewModel$startTimer$1 chatCallViewModel$startTimer$1 = new ChatCallViewModel$startTimer$1(this.this$0, continuation);
        chatCallViewModel$startTimer$1.L$0 = obj;
        return chatCallViewModel$startTimer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatCallViewModel$startTimer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutinesKt.launchPeriodAsync((CoroutineScope) this.L$0, 1000L, 100L, new AnonymousClass1(this.this$0, 1000L, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startTimer$1$1", f = "ChatCallViewModel.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startTimer$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ long $repeatMillis;
        int label;
        final /* synthetic */ ChatCallViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatCallViewModel chatCallViewModel, long j, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = chatCallViewModel;
            this.$repeatMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$repeatMillis, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate = this.this$0;
                long durationCallMillis = uiStateDelegate.getUiState(uiStateDelegate).getDurationCallMillis() + this.$repeatMillis;
                Duration.Companion companion = Duration.Companion;
                String m6897toCallDurationFormatLRDsOJo = DurationKt.m6897toCallDurationFormatLRDsOJo(kotlin.time.DurationKt.toDuration(durationCallMillis, DurationUnit.MILLISECONDS));
                UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate2 = this.this$0;
                this.label = 1;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, new C01521(m6897toCallDurationFormatLRDsOJo, durationCallMillis), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatCallViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startTimer$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01521 extends Lambda implements Function1<ChatCallViewModel.UiState, ChatCallViewModel.UiState> {
            final /* synthetic */ long $duration;
            final /* synthetic */ String $durationLabel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01521(String str, long j) {
                super(1);
                this.$durationLabel = str;
                this.$duration = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatCallViewModel.UiState invoke(ChatCallViewModel.UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return ChatCallViewModel.UiState.copy$default(state, null, false, null, false, null, null, this.$durationLabel, this.$duration, null, null, null, false, 3903, null);
            }
        }
    }
}
