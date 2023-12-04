package com.ifriend.presentation.features.chat.regeneration;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.regenerate.RegenerateChatMessageUseCase;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: MessageRegenerationDelegate.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BF\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0015\u0010\u0004\u001a\u0011\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u00020\u0014¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u00020\u0014¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u00020\u0014¢\u0006\u0002\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u0011\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegateImpl;", "Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegate;", "regenerateChatMessageUseCase", "Lcom/ifriend/domain/logic/chat/regenerate/RegenerateChatMessageUseCase;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "dispatchersProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "(Lcom/ifriend/domain/logic/chat/regenerate/RegenerateChatMessageUseCase;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;)V", "handleRegenerationInsufficientBalance", "", "Landroidx/lifecycle/ViewModel;", "chatId", "", "messageId", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Ljava/lang/String;)V", "initRegenerationMessage", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "regenerateMessage", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageRegenerationDelegateImpl implements MessageRegenerationDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatEventsInteractor chatEventsInteractor;
    private final DispatcherProvider dispatchersProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final PaymentResultFlow paymentResultFlow;
    private final RegenerateChatMessageUseCase regenerateChatMessageUseCase;

    @Inject
    public MessageRegenerationDelegateImpl(RegenerateChatMessageUseCase regenerateChatMessageUseCase, FlowObserverEmitter<Throwable> exceptionsEmitter, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, DispatcherProvider dispatchersProvider, ChatEventsInteractor chatEventsInteractor) {
        Intrinsics.checkNotNullParameter(regenerateChatMessageUseCase, "regenerateChatMessageUseCase");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        this.regenerateChatMessageUseCase = regenerateChatMessageUseCase;
        this.exceptionsEmitter = exceptionsEmitter;
        this.appEventsEmitter = appEventsEmitter;
        this.paymentResultFlow = paymentResultFlow;
        this.dispatchersProvider = dispatchersProvider;
        this.chatEventsInteractor = chatEventsInteractor;
    }

    @Override // com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegate
    public void initRegenerationMessage(ViewModel context_receiver_0, final String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        final Flow<MessagesSourceMessage.Chat.ChatRegenerateMessageFailed> chatRegenerateMessageFailedFlow = this.chatEventsInteractor.getChatRegenerateMessageFailedFlow();
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1(new Flow<MessagesSourceMessage.Chat.ChatRegenerateMessageFailed>() { // from class: com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.Chat.ChatRegenerateMessageFailed> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, chatId), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $chatId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$filter$1$2", f = "MessageRegenerationDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$chatId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (Intrinsics.areEqual(((MessagesSourceMessage.Chat.ChatRegenerateMessageFailed) obj).getChatId(), this.$chatId$inlined)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, null, this));
    }

    @Override // com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegate
    public void regenerateMessage(ViewModel context_receiver_0, String chatId, String messageId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), this.dispatchersProvider.background(), null, new MessageRegenerationDelegateImpl$regenerateMessage$1(this, chatId, messageId, context_receiver_0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRegenerationInsufficientBalance(ViewModel viewModel, String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new MessageRegenerationDelegateImpl$handleRegenerationInsufficientBalance$1(this, viewModel, str, str2, null), 3, null);
    }
}
