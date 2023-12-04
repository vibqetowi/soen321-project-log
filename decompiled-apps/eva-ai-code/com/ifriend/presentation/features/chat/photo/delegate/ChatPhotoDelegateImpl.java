package com.ifriend.presentation.features.chat.photo.delegate;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessState;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.presentation.analytics.ChatPhotoAnalytics;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessUiState;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatPhotoDelegate.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B@\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0015\u0010\b\u001a\u0011\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tj\u0002`\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001d\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0007H\u0082@R\u00020)ø\u0001\u0000¢\u0006\u0002\u0010+J\u0011\u0010,\u001a\u00020(H\u0016R\u00020)¢\u0006\u0002\u0010-J!\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0011\u00102\u001a\u00020(H\u0016R\u00020)¢\u0006\u0002\u0010-J%\u00103\u001a\u00020(2\u0006\u00100\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0096AR\u00020)ø\u0001\u0000¢\u0006\u0002\u00106J\u0019\u00107\u001a\u00020(2\u0006\u00100\u001a\u00020\u0007H\u0016R\u00020)¢\u0006\u0002\u00108J0\u00109\u001a\u00020(*\u00020:2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00040<H\u0097\u0001JD\u0010@\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010B\u001a\u00020:2!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00040<H\u0096\u0001JD\u0010D\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00040<H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010EJ)\u0010F\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010G\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010HJD\u0010I\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040<H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010ER\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\u0011\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tj\u0002`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\"\u0010$\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegateImpl;", "Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "", "chatId", "", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "photoAnalytics", "Lcom/ifriend/presentation/analytics/ChatPhotoAnalytics;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "chatMessageAccessDelegate", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate$Factory;", "(Ljava/lang/String;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/analytics/ChatPhotoAnalytics;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate$Factory;)V", "chatMessageAccessEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "getChatMessageAccessEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "chatMessageAccessStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "getChatMessageAccessStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "photoModalState", "getPhotoModalState", "singleEvents", "getSingleEvents", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "accessReceivedSuccessfully", "", "Landroidx/lifecycle/ViewModel;", "imageUrl", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissPhotoModalPopup", "(Landroidx/lifecycle/ViewModel;)V", "getChatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "messageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initChatPhotoDelegate", "requestMessageAccess", "accessActionType", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showPhoto", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPhotoDelegateImpl implements ChatPhotoDelegate, ChatMessageAccessDelegate, UiStateDelegate<ChatPhotoUiState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ ChatMessageAccessDelegateImpl $$delegate_0;
    private final /* synthetic */ UiStateDelegateImpl<ChatPhotoUiState, Object> $$delegate_1;
    private final ChatClientInteractor chatClientInteractor;
    private final String chatId;
    private final ChatMessageAccessDelegate.Factory chatMessageAccessDelegate;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final ChatPhotoAnalytics photoAnalytics;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super ChatPhotoUiState, ? extends ChatPhotoUiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_1.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<ChatPhotoUiState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatPhotoUiState, ? extends ChatPhotoUiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_1.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public Flow<ChatMessageAccessState> getChatMessageAccessEventFlow() {
        return this.$$delegate_0.getChatMessageAccessEventFlow();
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public StateFlow<ChatMessageAccessUiState> getChatMessageAccessStateFlow() {
        return this.$$delegate_0.getChatMessageAccessStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Object> getSingleEvents() {
        return this.$$delegate_1.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public ChatPhotoUiState getUiState(UiStateDelegate<ChatPhotoUiState, Object> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_1.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<ChatPhotoUiState> getUiStateFlow() {
        return this.$$delegate_1.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<ChatPhotoUiState, Object> uiStateDelegate, Function1<? super ChatPhotoUiState, ? extends ChatPhotoUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public Object requestMessageAccess(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.requestMessageAccess(viewModel, str, chatMessageAccessReason, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<ChatPhotoUiState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<ChatPhotoUiState, Object> uiStateDelegate, Function1<? super ChatPhotoUiState, ? extends ChatPhotoUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.updateUiState(uiStateDelegate, function1, continuation);
    }

    @AssistedInject
    public ChatPhotoDelegateImpl(@Assisted String chatId, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatPhotoAnalytics photoAnalytics, ChatClientInteractor chatClientInteractor, ChatMessageAccessDelegate.Factory chatMessageAccessDelegate) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(photoAnalytics, "photoAnalytics");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(chatMessageAccessDelegate, "chatMessageAccessDelegate");
        this.chatId = chatId;
        this.exceptionsEmitter = exceptionsEmitter;
        this.photoAnalytics = photoAnalytics;
        this.chatClientInteractor = chatClientInteractor;
        this.chatMessageAccessDelegate = chatMessageAccessDelegate;
        this.$$delegate_0 = chatMessageAccessDelegate.create(chatId);
        this.$$delegate_1 = new UiStateDelegateImpl<>(new ChatPhotoUiState(null, false, false, 7, null), 0, null, 6, null);
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public StateFlow<ChatPhotoUiState> getPhotoModalState() {
        return getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public void initChatPhotoDelegate(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatPhotoDelegateImpl$initChatPhotoDelegate$$inlined$collectIn$default$1(getChatMessageAccessStateFlow(), null, this));
        final Flow<ChatMessageAccessState> chatMessageAccessEventFlow = getChatMessageAccessEventFlow();
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatPhotoDelegateImpl$initChatPhotoDelegate$$inlined$collectIn$default$2(new Flow<Object>() { // from class: com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl$initChatPhotoDelegate$$inlined$filterIsInstance$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl$initChatPhotoDelegate$$inlined$filterIsInstance$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl$initChatPhotoDelegate$$inlined$filterIsInstance$1$2", f = "ChatPhotoDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl$initChatPhotoDelegate$$inlined$filterIsInstance$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                                if (obj instanceof ChatMessageAccessState.PhotoAccessGranted) {
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
        }, null, this, context_receiver_0));
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public void showPhoto(ViewModel context_receiver_0, String messageId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        if (getUiState((UiStateDelegate<ChatPhotoUiState, Object>) this).isLoading()) {
            return;
        }
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatPhotoDelegateImpl$showPhoto$1(this.exceptionsEmitter), null, new ChatPhotoDelegateImpl$showPhoto$2(this, messageId, context_receiver_0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatMessage(String str, String str2, Continuation<? super ChatMessage> continuation) {
        ChatPhotoDelegateImpl$getChatMessage$1 chatPhotoDelegateImpl$getChatMessage$1;
        Object obj;
        int i;
        if (continuation instanceof ChatPhotoDelegateImpl$getChatMessage$1) {
            chatPhotoDelegateImpl$getChatMessage$1 = (ChatPhotoDelegateImpl$getChatMessage$1) continuation;
            if ((chatPhotoDelegateImpl$getChatMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatPhotoDelegateImpl$getChatMessage$1.label -= Integer.MIN_VALUE;
                obj = chatPhotoDelegateImpl$getChatMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPhotoDelegateImpl$getChatMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientInteractor chatClientInteractor = this.chatClientInteractor;
                    chatPhotoDelegateImpl$getChatMessage$1.label = 1;
                    obj = chatClientInteractor.getChatMessage(str2, str, chatPhotoDelegateImpl$getChatMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        chatPhotoDelegateImpl$getChatMessage$1 = new ChatPhotoDelegateImpl$getChatMessage$1(this, continuation);
        obj = chatPhotoDelegateImpl$getChatMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPhotoDelegateImpl$getChatMessage$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public void dismissPhotoModalPopup(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatPhotoDelegateImpl$dismissPhotoModalPopup$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object accessReceivedSuccessfully(ViewModel viewModel, String str, Continuation<? super Unit> continuation) {
        this.photoAnalytics.trackShowPhoto();
        Object updateUiState = updateUiState(this, new ChatPhotoDelegateImpl$accessReceivedSuccessfully$2(str), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }
}
