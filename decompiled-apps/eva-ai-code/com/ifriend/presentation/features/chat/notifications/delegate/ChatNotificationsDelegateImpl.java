package com.ifriend.presentation.features.chat.notifications.delegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationsUiMapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: ChatNotificationsDelegate.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0010H\u0016R\u00020\u001f¢\u0006\u0002\u0010!J5\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0016R\u00020\u001f¢\u0006\u0002\u0010+J-\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0082@R\u00020\u001fø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0015H\u0002J\u0019\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u00103J!\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020&H\u0002R\u00020\u001f¢\u0006\u0002\u00107R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegateImpl;", "Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegate;", "repo", "Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;", "mapper", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationsUiMapper;", "chatScreenAnalyticsUseCase", "Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "generatedChatAvatarInteractor", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;", "(Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationsUiMapper;Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;)V", "chatNotifications", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "getChatNotifications", "()Lkotlinx/coroutines/flow/StateFlow;", "jobs", "", "", "Lkotlinx/coroutines/Job;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "observerJob", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "disposeNotificationsObserver", "", "hideNotification", "Landroidx/lifecycle/ViewModel;", "item", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;)V", "initNotificationsObserver", "notificationsLimit", "", "hideDelay", "", "notificationsFilter", "Lkotlin/Function1;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "", "(Landroidx/lifecycle/ViewModel;IJLkotlin/jvm/functions/Function1;)V", "onNotificationReceived", "new", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAndCancelJob", "key", "removeItem", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleItemRemoval", "itemId", TtmlNode.ANNOTATION_POSITION_AFTER, "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;J)Lkotlinx/coroutines/Job;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsDelegateImpl implements ChatNotificationsDelegate {
    public static final int $stable = 8;
    private final StateFlow<PersistentList<ChatNotificationUi>> chatNotifications;
    private final ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase;
    private final DispatcherProvider dispatcherProvider;
    private final GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
    private final Map<String, Job> jobs;
    private final ChatNotificationsUiMapper mapper;
    private final Mutex mutex;
    private Job observerJob;
    private final ChatNotificationsRepository repo;
    private final MutableStateFlow<PersistentList<ChatNotificationUi>> state;

    @Inject
    public ChatNotificationsDelegateImpl(ChatNotificationsRepository repo, ChatNotificationsUiMapper mapper, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase, DispatcherProvider dispatcherProvider, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(chatScreenAnalyticsUseCase, "chatScreenAnalyticsUseCase");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(generatedChatAvatarInteractor, "generatedChatAvatarInteractor");
        this.repo = repo;
        this.mapper = mapper;
        this.chatScreenAnalyticsUseCase = chatScreenAnalyticsUseCase;
        this.dispatcherProvider = dispatcherProvider;
        this.generatedChatAvatarInteractor = generatedChatAvatarInteractor;
        MutableStateFlow<PersistentList<ChatNotificationUi>> MutableStateFlow = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentListOf());
        this.state = MutableStateFlow;
        this.chatNotifications = FlowKt.asStateFlow(MutableStateFlow);
        this.jobs = new LinkedHashMap();
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public StateFlow<PersistentList<ChatNotificationUi>> getChatNotifications() {
        return this.chatNotifications;
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public void initNotificationsObserver(ViewModel context_receiver_0, int i, long j, final Function1<? super ChatNotification, Boolean> notificationsFilter) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(notificationsFilter, "notificationsFilter");
        disposeNotificationsObserver();
        final Flow<ChatNotification> flowNotifications = this.repo.flowNotifications();
        final Flow withIndex = FlowKt.withIndex(new Flow<ChatNotification>() { // from class: com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatNotification> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, notificationsFilter), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function1 callee$inlined;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$filter$1$2", f = "ChatNotificationsDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$filter$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.callee$inlined = function1;
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
                                if (((Boolean) this.callee$inlined.invoke((ChatNotification) obj)).booleanValue()) {
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
        });
        this.observerJob = BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$collectIn$default$1(FlowKt.flowOn(new Flow<ChatNotificationUi>() { // from class: com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatNotificationUi> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatNotificationsDelegateImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$map$1$2", f = "ChatNotificationsDelegate.kt", i = {0, 0, 0, 1, 1, 1}, l = {226, 227, 228, 223}, m = "emit", n = {"this", "value", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", "value", DeviceRequestsHelper.DEVICE_INFO_MODEL}, s = {"L$0", "L$2", "L$3", "L$0", "L$2", "L$3"})
                /* renamed from: com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl$initNotificationsObserver$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(FlowCollector flowCollector, ChatNotificationsDelegateImpl chatNotificationsDelegateImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatNotificationsDelegateImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00d2 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00de A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    Object coroutine_suspended;
                    int i;
                    GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
                    FlowCollector flowCollector;
                    AnonymousClass2<T> anonymousClass2;
                    IndexedValue indexedValue;
                    ChatNotification chatNotification;
                    FlowCollector flowCollector2;
                    ChatNotificationsUiMapper chatNotificationsUiMapper;
                    FlowCollector flowCollector3;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector4 = this.$this_unsafeFlow;
                                IndexedValue indexedValue2 = (IndexedValue) obj;
                                ChatNotification chatNotification2 = (ChatNotification) indexedValue2.getValue();
                                generatedChatAvatarInteractor = this.this$0.generatedChatAvatarInteractor;
                                String chatId = chatNotification2.getChatId();
                                anonymousClass1.L$0 = this;
                                anonymousClass1.L$1 = flowCollector4;
                                anonymousClass1.L$2 = indexedValue2;
                                anonymousClass1.L$3 = chatNotification2;
                                anonymousClass1.label = 1;
                                Object generatedChatAvatarFlow = generatedChatAvatarInteractor.getGeneratedChatAvatarFlow(chatId, anonymousClass1);
                                if (generatedChatAvatarFlow == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                flowCollector = flowCollector4;
                                obj2 = generatedChatAvatarFlow;
                                anonymousClass2 = this;
                                indexedValue = indexedValue2;
                                chatNotification = chatNotification2;
                            } else if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                        return Unit.INSTANCE;
                                    }
                                    flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                    ResultKt.throwOnFailure(obj2);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 4;
                                    if (flowCollector3.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                }
                                chatNotification = (ChatNotification) anonymousClass1.L$3;
                                indexedValue = (IndexedValue) anonymousClass1.L$2;
                                flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                                anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                chatNotificationsUiMapper = anonymousClass2.this$0.mapper;
                                int index = indexedValue.getIndex();
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.label = 3;
                                obj2 = chatNotificationsUiMapper.map(index, chatNotification, (GeneratedChatAvatar) obj2, anonymousClass1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                flowCollector3 = flowCollector2;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 4;
                                if (flowCollector3.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            } else {
                                chatNotification = (ChatNotification) anonymousClass1.L$3;
                                indexedValue = (IndexedValue) anonymousClass1.L$2;
                                AnonymousClass2<T> anonymousClass22 = (AnonymousClass2) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                flowCollector = (FlowCollector) anonymousClass1.L$1;
                                anonymousClass2 = anonymousClass22;
                            }
                            anonymousClass1.L$0 = anonymousClass2;
                            anonymousClass1.L$1 = flowCollector;
                            anonymousClass1.L$2 = indexedValue;
                            anonymousClass1.L$3 = chatNotification;
                            anonymousClass1.label = 2;
                            obj2 = FlowKt.firstOrNull((Flow) obj2, anonymousClass1);
                            if (obj2 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flowCollector2 = flowCollector;
                            chatNotificationsUiMapper = anonymousClass2.this$0.mapper;
                            int index2 = indexedValue.getIndex();
                            anonymousClass1.L$0 = flowCollector2;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.label = 3;
                            obj2 = chatNotificationsUiMapper.map(index2, chatNotification, (GeneratedChatAvatar) obj2, anonymousClass1);
                            if (obj2 != coroutine_suspended) {
                            }
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = anonymousClass2;
                    anonymousClass1.L$1 = flowCollector;
                    anonymousClass1.L$2 = indexedValue;
                    anonymousClass1.L$3 = chatNotification;
                    anonymousClass1.label = 2;
                    obj2 = FlowKt.firstOrNull((Flow) obj2, anonymousClass1);
                    if (obj2 != coroutine_suspended) {
                    }
                }
            }
        }, this.dispatcherProvider.background()), null, this, context_receiver_0, i, j));
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public void disposeNotificationsObserver() {
        Job job = this.observerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.observerJob = null;
        for (String str : CollectionsKt.toList(this.jobs.keySet())) {
            removeAndCancelJob(str);
        }
        this.state.setValue(ExtensionsKt.persistentListOf());
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public void hideNotification(ViewModel context_receiver_0, ChatNotificationUi item) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(item, "item");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatNotificationsDelegateImpl$hideNotification$1(this, item, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:18:0x0064, B:19:0x0082, B:21:0x0088, B:23:0x009c, B:24:0x00a0, B:25:0x00a8, B:27:0x00ae, B:28:0x00c6, B:29:0x00d9, B:31:0x00df, B:33:0x00ee, B:42:0x0113, B:44:0x0117, B:36:0x00f8, B:37:0x00fc, B:39:0x0102, B:45:0x011b, B:46:0x0123, B:48:0x0129, B:49:0x0133), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[Catch: all -> 0x0144, LOOP:1: B:25:0x00a8->B:27:0x00ae, LOOP_END, TryCatch #0 {all -> 0x0144, blocks: (B:18:0x0064, B:19:0x0082, B:21:0x0088, B:23:0x009c, B:24:0x00a0, B:25:0x00a8, B:27:0x00ae, B:28:0x00c6, B:29:0x00d9, B:31:0x00df, B:33:0x00ee, B:42:0x0113, B:44:0x0117, B:36:0x00f8, B:37:0x00fc, B:39:0x0102, B:45:0x011b, B:46:0x0123, B:48:0x0129, B:49:0x0133), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:18:0x0064, B:19:0x0082, B:21:0x0088, B:23:0x009c, B:24:0x00a0, B:25:0x00a8, B:27:0x00ae, B:28:0x00c6, B:29:0x00d9, B:31:0x00df, B:33:0x00ee, B:42:0x0113, B:44:0x0117, B:36:0x00f8, B:37:0x00fc, B:39:0x0102, B:45:0x011b, B:46:0x0123, B:48:0x0129, B:49:0x0133), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129 A[Catch: all -> 0x0144, LOOP:4: B:46:0x0123->B:48:0x0129, LOOP_END, TryCatch #0 {all -> 0x0144, blocks: (B:18:0x0064, B:19:0x0082, B:21:0x0088, B:23:0x009c, B:24:0x00a0, B:25:0x00a8, B:27:0x00ae, B:28:0x00c6, B:29:0x00d9, B:31:0x00df, B:33:0x00ee, B:42:0x0113, B:44:0x0117, B:36:0x00f8, B:37:0x00fc, B:39:0x0102, B:45:0x011b, B:46:0x0123, B:48:0x0129, B:49:0x0133), top: B:55:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNotificationReceived(ViewModel viewModel, ChatNotificationUi chatNotificationUi, int i, long j, Continuation<? super Unit> continuation) {
        ChatNotificationsDelegateImpl$onNotificationReceived$1 chatNotificationsDelegateImpl$onNotificationReceived$1;
        int i2;
        Mutex mutex;
        ChatNotificationsDelegateImpl chatNotificationsDelegateImpl;
        try {
            if (continuation instanceof ChatNotificationsDelegateImpl$onNotificationReceived$1) {
                chatNotificationsDelegateImpl$onNotificationReceived$1 = (ChatNotificationsDelegateImpl$onNotificationReceived$1) continuation;
                if ((chatNotificationsDelegateImpl$onNotificationReceived$1.label & Integer.MIN_VALUE) != 0) {
                    chatNotificationsDelegateImpl$onNotificationReceived$1.label -= Integer.MIN_VALUE;
                    Object obj = chatNotificationsDelegateImpl$onNotificationReceived$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = chatNotificationsDelegateImpl$onNotificationReceived$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.L$0 = this;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.L$1 = viewModel;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.L$2 = chatNotificationUi;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.L$3 = mutex;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.I$0 = i;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.J$0 = j;
                        chatNotificationsDelegateImpl$onNotificationReceived$1.label = 1;
                        if (mutex.lock(null, chatNotificationsDelegateImpl$onNotificationReceived$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatNotificationsDelegateImpl = this;
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        j = chatNotificationsDelegateImpl$onNotificationReceived$1.J$0;
                        i = chatNotificationsDelegateImpl$onNotificationReceived$1.I$0;
                        chatNotificationUi = (ChatNotificationUi) chatNotificationsDelegateImpl$onNotificationReceived$1.L$2;
                        chatNotificationsDelegateImpl = (ChatNotificationsDelegateImpl) chatNotificationsDelegateImpl$onNotificationReceived$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) chatNotificationsDelegateImpl$onNotificationReceived$1.L$3;
                        viewModel = (ViewModel) chatNotificationsDelegateImpl$onNotificationReceived$1.L$1;
                    }
                    List takeLast = CollectionsKt.takeLast(CollectionsKt.plus((Collection<? extends ChatNotificationUi>) chatNotificationsDelegateImpl.state.getValue(), chatNotificationUi), i);
                    ArrayList<ChatNotificationUi> arrayList = new ArrayList();
                    for (Object obj2 : takeLast) {
                        if (!chatNotificationsDelegateImpl.jobs.containsKey(((ChatNotificationUi) obj2).getId())) {
                            arrayList.add(obj2);
                        }
                    }
                    for (ChatNotificationUi chatNotificationUi2 : arrayList) {
                        chatNotificationsDelegateImpl.jobs.put(chatNotificationUi2.getId(), chatNotificationsDelegateImpl.scheduleItemRemoval(viewModel, chatNotificationUi2.getId(), j));
                    }
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (Object obj3 : chatNotificationsDelegateImpl.jobs.keySet()) {
                        String str = (String) obj3;
                        List list = takeLast;
                        boolean z = false;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (Intrinsics.areEqual(((ChatNotificationUi) it.next()).getId(), str)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            arrayList2.add(obj3);
                        }
                    }
                    for (String str2 : arrayList2) {
                        chatNotificationsDelegateImpl.removeAndCancelJob(str2);
                    }
                    chatNotificationsDelegateImpl.state.setValue(ExtensionsKt.toPersistentList(takeLast));
                    return Unit.INSTANCE;
                }
            }
            List takeLast2 = CollectionsKt.takeLast(CollectionsKt.plus((Collection<? extends ChatNotificationUi>) chatNotificationsDelegateImpl.state.getValue(), chatNotificationUi), i);
            ArrayList<ChatNotificationUi> arrayList3 = new ArrayList();
            while (r10.hasNext()) {
            }
            while (r10.hasNext()) {
            }
            ArrayList<String> arrayList22 = new ArrayList();
            while (r8.hasNext()) {
            }
            while (r8.hasNext()) {
            }
            chatNotificationsDelegateImpl.state.setValue(ExtensionsKt.toPersistentList(takeLast2));
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        chatNotificationsDelegateImpl$onNotificationReceived$1 = new ChatNotificationsDelegateImpl$onNotificationReceived$1(this, continuation);
        Object obj4 = chatNotificationsDelegateImpl$onNotificationReceived$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = chatNotificationsDelegateImpl$onNotificationReceived$1.label;
        if (i2 != 0) {
        }
    }

    private final Job scheduleItemRemoval(ViewModel viewModel, String str, long j) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatNotificationsDelegateImpl$scheduleItemRemoval$1(j, this, str, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:18:0x0056, B:19:0x0058, B:20:0x006c, B:22:0x0072, B:24:0x0084, B:25:0x0088, B:27:0x0096), top: B:33:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeItem(String str, Continuation<? super Unit> continuation) {
        ChatNotificationsDelegateImpl$removeItem$1 chatNotificationsDelegateImpl$removeItem$1;
        int i;
        ChatNotificationsDelegateImpl chatNotificationsDelegateImpl;
        String str2;
        Mutex mutex;
        MutableStateFlow<PersistentList<ChatNotificationUi>> mutableStateFlow;
        PersistentList<ChatNotificationUi> value;
        ArrayList arrayList;
        try {
            if (continuation instanceof ChatNotificationsDelegateImpl$removeItem$1) {
                chatNotificationsDelegateImpl$removeItem$1 = (ChatNotificationsDelegateImpl$removeItem$1) continuation;
                if ((chatNotificationsDelegateImpl$removeItem$1.label & Integer.MIN_VALUE) != 0) {
                    chatNotificationsDelegateImpl$removeItem$1.label -= Integer.MIN_VALUE;
                    Object obj = chatNotificationsDelegateImpl$removeItem$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = chatNotificationsDelegateImpl$removeItem$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        chatNotificationsDelegateImpl$removeItem$1.L$0 = this;
                        chatNotificationsDelegateImpl$removeItem$1.L$1 = str;
                        chatNotificationsDelegateImpl$removeItem$1.L$2 = mutex2;
                        chatNotificationsDelegateImpl$removeItem$1.label = 1;
                        if (mutex2.lock(null, chatNotificationsDelegateImpl$removeItem$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatNotificationsDelegateImpl = this;
                        str2 = str;
                        mutex = mutex2;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        mutex = (Mutex) chatNotificationsDelegateImpl$removeItem$1.L$2;
                        str2 = (String) chatNotificationsDelegateImpl$removeItem$1.L$1;
                        chatNotificationsDelegateImpl = (ChatNotificationsDelegateImpl) chatNotificationsDelegateImpl$removeItem$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    mutableStateFlow = chatNotificationsDelegateImpl.state;
                    do {
                        value = mutableStateFlow.getValue();
                        arrayList = new ArrayList();
                        for (ChatNotificationUi chatNotificationUi : value) {
                            if (!Intrinsics.areEqual(chatNotificationUi.getId(), str2)) {
                                arrayList.add(chatNotificationUi);
                            }
                        }
                    } while (!mutableStateFlow.compareAndSet(value, ExtensionsKt.toPersistentList(arrayList)));
                    return Unit.INSTANCE;
                }
            }
            mutableStateFlow = chatNotificationsDelegateImpl.state;
            do {
                value = mutableStateFlow.getValue();
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                }
            } while (!mutableStateFlow.compareAndSet(value, ExtensionsKt.toPersistentList(arrayList)));
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        chatNotificationsDelegateImpl$removeItem$1 = new ChatNotificationsDelegateImpl$removeItem$1(this, continuation);
        Object obj2 = chatNotificationsDelegateImpl$removeItem$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatNotificationsDelegateImpl$removeItem$1.label;
        if (i != 0) {
        }
    }

    private final void removeAndCancelJob(String str) {
        Job remove = this.jobs.remove(str);
        if (remove != null) {
            Job.DefaultImpls.cancel$default(remove, (CancellationException) null, 1, (Object) null);
        }
    }
}
