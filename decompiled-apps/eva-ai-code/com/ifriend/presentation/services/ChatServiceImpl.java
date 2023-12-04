package com.ifriend.presentation.services;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import com.ifriend.domain.socket.MessagesSourceMessage;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/services/ChatServiceImpl;", "Lcom/ifriend/presentation/services/ChatService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "refreshConfigurationUseCase", "Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;)V", "updateChatsJob", "Lkotlinx/coroutines/Job;", TtmlNode.START, "", "stop", "updateChats", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatServiceImpl implements ChatService {
    public static final int $stable = 8;
    private final ChatEventsInteractor chatEventsInteractor;
    private final CoroutineScope coroutineScope;
    private final DispatcherProvider dispatcherProvider;
    private final ChatsRefreshConfigurationUseCase refreshConfigurationUseCase;
    private Job updateChatsJob;

    @Inject
    public ChatServiceImpl(CoroutineScope coroutineScope, DispatcherProvider dispatcherProvider, ChatEventsInteractor chatEventsInteractor, ChatsRefreshConfigurationUseCase refreshConfigurationUseCase) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        Intrinsics.checkNotNullParameter(refreshConfigurationUseCase, "refreshConfigurationUseCase");
        this.coroutineScope = coroutineScope;
        this.dispatcherProvider = dispatcherProvider;
        this.chatEventsInteractor = chatEventsInteractor;
        this.refreshConfigurationUseCase = refreshConfigurationUseCase;
    }

    @Override // com.ifriend.presentation.services.ChatService
    public void start() {
        Job job = this.updateChatsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        final Flow<MessagesSourceMessage.Chat.ChatSubscription> chatSubscriptionFlow = this.chatEventsInteractor.getChatSubscriptionFlow();
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(new Flow<MessagesSourceMessage.Chat.ChatSubscription>() { // from class: com.ifriend.presentation.services.ChatServiceImpl$start$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.Chat.ChatSubscription> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatServiceImpl$start$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatServiceImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatServiceImpl$start$$inlined$filter$1$2", f = "ChatService.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.services.ChatServiceImpl$start$$inlined$filter$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ChatServiceImpl chatServiceImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatServiceImpl;
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
                    Job job;
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
                                MessagesSourceMessage.Chat.ChatSubscription chatSubscription = (MessagesSourceMessage.Chat.ChatSubscription) obj;
                                job = this.this$0.updateChatsJob;
                                if (ommonKt.orFalse(job != null ? Boxing.boxBoolean(job.isActive()) : null)) {
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
        }, this.dispatcherProvider.background()), new ChatServiceImpl$start$2(this, null)), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateChats() {
        this.updateChatsJob = CoroutinesKt.safeLaunch$default(this.coroutineScope, null, null, new ChatServiceImpl$updateChats$1(this, null), 3, null);
    }

    @Override // com.ifriend.presentation.services.ChatService
    public void stop() {
        Job job = this.updateChatsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
