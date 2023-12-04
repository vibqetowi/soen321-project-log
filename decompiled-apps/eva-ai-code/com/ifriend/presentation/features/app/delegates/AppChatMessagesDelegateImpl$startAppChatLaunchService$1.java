package com.ifriend.presentation.features.app.delegates;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppChatMessagesDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1", f = "AppChatMessagesDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppChatMessagesDelegateImpl$startAppChatLaunchService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ AppChatMessagesDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppChatMessagesDelegateImpl$startAppChatLaunchService$1(AppChatMessagesDelegateImpl appChatMessagesDelegateImpl, AppViewModel appViewModel, Continuation<? super AppChatMessagesDelegateImpl$startAppChatLaunchService$1> continuation) {
        super(2, continuation);
        this.this$0 = appChatMessagesDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppChatMessagesDelegateImpl$startAppChatLaunchService$1(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppChatMessagesDelegateImpl$startAppChatLaunchService$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        ChatsInfoInteractor chatsInfoInteractor;
        DispatcherProvider dispatcherProvider;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            userRepository = this.this$0.userRepository;
            Flow filterNotNull = FlowKt.filterNotNull(userRepository.getUser());
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            final Flow combine = FlowKt.combine(filterNotNull, chatsInfoInteractor.getAvailableChatsInfoFlow(), new AnonymousClass1(null));
            final AppChatMessagesDelegateImpl appChatMessagesDelegateImpl = this.this$0;
            Flow onEach = FlowKt.onEach(new Flow<List<? extends ChatInfo>>() { // from class: com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends ChatInfo>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, appChatMessagesDelegateImpl), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ AppChatMessagesDelegateImpl this$0;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$invokeSuspend$$inlined$filter$1$2", f = "AppChatMessagesDelegate.kt", i = {0, 0}, l = {224, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
                    /* renamed from: com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, AppChatMessagesDelegateImpl appChatMessagesDelegateImpl) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = appChatMessagesDelegateImpl;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Object obj2;
                        int i;
                        UserProfileRepository userProfileRepository;
                        Object obj3;
                        FlowCollector flowCollector;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                    List list = (List) obj;
                                    userProfileRepository = this.this$0.userProfileRepository;
                                    anonymousClass1.L$0 = obj;
                                    anonymousClass1.L$1 = flowCollector2;
                                    anonymousClass1.label = 1;
                                    Object isOnboardingDataSubmitted = userProfileRepository.isOnboardingDataSubmitted(anonymousClass1);
                                    if (isOnboardingDataSubmitted == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj3 = obj;
                                    flowCollector = flowCollector2;
                                    obj2 = isOnboardingDataSubmitted;
                                } else if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                } else {
                                    flowCollector = (FlowCollector) anonymousClass1.L$1;
                                    obj3 = anonymousClass1.L$0;
                                    ResultKt.throwOnFailure(obj2);
                                }
                                if (((Boolean) obj2).booleanValue()) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.label = 2;
                                    if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        obj2 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        if (((Boolean) obj2).booleanValue()) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, new AnonymousClass3(this.this$0, null));
            dispatcherProvider = this.this$0.dispatcherProvider;
            FlowKt.launchIn(FlowKt.flowOn(onEach, dispatcherProvider.background()), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppChatMessagesDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/User;", "<anonymous parameter 0>", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chats", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$1", f = "AppChatMessagesDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<User, List<? extends ChatInfo>, Continuation<? super List<? extends ChatInfo>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(User user, List<ChatInfo> list, Continuation<? super List<ChatInfo>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(User user, List<? extends ChatInfo> list, Continuation<? super List<? extends ChatInfo>> continuation) {
            return invoke2(user, (List<ChatInfo>) list, (Continuation<? super List<ChatInfo>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return (List) this.L$0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppChatMessagesDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chats", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$3", f = "AppChatMessagesDelegate.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl$startAppChatLaunchService$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends ChatInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AppChatMessagesDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AppChatMessagesDelegateImpl appChatMessagesDelegateImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = appChatMessagesDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatInfo> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ChatInfo>) list, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatInfo> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppChatMessagesDelegateImpl appChatMessagesDelegateImpl;
            Iterator it;
            Iterable iterable;
            ChatClientInteractor chatClientInteractor;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                appChatMessagesDelegateImpl = this.this$0;
                it = list.iterator();
                iterable = list;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                it = (Iterator) this.L$2;
                iterable = (Iterable) this.L$1;
                appChatMessagesDelegateImpl = (AppChatMessagesDelegateImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                chatClientInteractor = appChatMessagesDelegateImpl.chatClientInteractor;
                String chatId = ((ChatInfo) it.next()).getChatId();
                this.L$0 = appChatMessagesDelegateImpl;
                this.L$1 = iterable;
                this.L$2 = it;
                this.label = 1;
                if (chatClientInteractor.launch(chatId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
