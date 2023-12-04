package com.ifriend.presentation.features.chat.gifts.delegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatGiftsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2", f = "ChatGiftsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatGiftsDelegateImpl$initChatGifts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatGiftsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsDelegateImpl$initChatGifts$2(ChatGiftsDelegateImpl chatGiftsDelegateImpl, String str, ViewModel viewModel, Continuation<? super ChatGiftsDelegateImpl$initChatGifts$2> continuation) {
        super(2, continuation);
        this.this$0 = chatGiftsDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatGiftsDelegateImpl$initChatGifts$2(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatGiftsDelegateImpl$initChatGifts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatGiftsUseCase chatGiftsUseCase;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            chatGiftsUseCase = this.this$0.chatGiftsUseCase;
            final Flow<List<ChatGift>> subscribe = chatGiftsUseCase.subscribe(this.$chatId);
            final ChatGiftsDelegateImpl chatGiftsDelegateImpl = this.this$0;
            FlowKt.launchIn(FlowKt.onEach(new Flow<List<? extends ChatGiftUi>>() { // from class: com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends ChatGiftUi>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, chatGiftsDelegateImpl), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ChatGiftsDelegateImpl this$0;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$invokeSuspend$$inlined$map$1$2", f = "ChatGiftsDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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

                    public AnonymousClass2(FlowCollector flowCollector, ChatGiftsDelegateImpl chatGiftsDelegateImpl) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = chatGiftsDelegateImpl;
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
                        ChatGiftsMapper chatGiftsMapper;
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
                                    List<ChatGift> list = (List) obj;
                                    chatGiftsMapper = this.this$0.chatGiftsMapper;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    for (ChatGift chatGift : list) {
                                        arrayList.add(chatGiftsMapper.map(chatGift));
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
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
            }, new AnonymousClass2(this.this$0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatGiftsDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "gifts", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$2", f = "ChatGiftsDelegate.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ChatGiftUi>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatGiftsDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatGiftsDelegateImpl chatGiftsDelegateImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatGiftsDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatGiftUi> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ChatGiftUi>) list, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatGiftUi> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<ChatGiftsUiState, Object> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.reduce(uiStateDelegate, new AnonymousClass1((List) this.L$0), this) == coroutine_suspended) {
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
        /* compiled from: ChatGiftsDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$initChatGifts$2$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<ChatGiftsUiState, ChatGiftsUiState> {
            final /* synthetic */ List<ChatGiftUi> $gifts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<ChatGiftUi> list) {
                super(1);
                this.$gifts = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatGiftsUiState invoke(ChatGiftsUiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return ChatGiftsUiState.copy$default(state, false, false, (ChatGiftUi) CollectionsKt.firstOrNull((List<? extends Object>) this.$gifts), false, ExtensionsKt.toPersistentList(this.$gifts), 11, null);
            }
        }
    }
}
