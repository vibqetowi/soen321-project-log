package com.ifriend.domain.logic.store;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.guide.UserGuideRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetChatsStoreInteractor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\nH\u0002J\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/logic/store/GetChatsStoreInteractor;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "userGuideRepository", "Lcom/ifriend/domain/data/guide/UserGuideRepository;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/domain/data/guide/UserGuideRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatsFlow", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "onExplanationPopupShown", "", "shouldShowExplanationPopup", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetChatsStoreInteractor {
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final ChatsInfoRepository chatsInfoRepository;
    private final UserGuideRepository userGuideRepository;

    @Inject
    public GetChatsStoreInteractor(ChatsInfoRepository chatsInfoRepository, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserGuideRepository userGuideRepository) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(userGuideRepository, "userGuideRepository");
        this.chatsInfoRepository = chatsInfoRepository;
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.userGuideRepository = userGuideRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(Continuation<? super Flow<? extends List<ChatsConfiguration>>> continuation) {
        GetChatsStoreInteractor$execute$1 getChatsStoreInteractor$execute$1;
        int i;
        Flow<List<ChatInfo>> flow;
        if (continuation instanceof GetChatsStoreInteractor$execute$1) {
            getChatsStoreInteractor$execute$1 = (GetChatsStoreInteractor$execute$1) continuation;
            if ((getChatsStoreInteractor$execute$1.label & Integer.MIN_VALUE) != 0) {
                getChatsStoreInteractor$execute$1.label -= Integer.MIN_VALUE;
                Object obj = getChatsStoreInteractor$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getChatsStoreInteractor$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<ChatInfo>> chatsFlow = getChatsFlow();
                    ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource = this.chatConfigsMemoryCachedSource;
                    getChatsStoreInteractor$execute$1.L$0 = chatsFlow;
                    getChatsStoreInteractor$execute$1.label = 1;
                    Object chatConfigsFlow = chatConfigsMemoryCachedSource.getChatConfigsFlow(getChatsStoreInteractor$execute$1);
                    if (chatConfigsFlow == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flow = chatsFlow;
                    obj = chatConfigsFlow;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    flow = (Flow) getChatsStoreInteractor$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.combine(flow, (Flow) obj, new GetChatsStoreInteractor$execute$2(null));
            }
        }
        getChatsStoreInteractor$execute$1 = new GetChatsStoreInteractor$execute$1(this, continuation);
        Object obj2 = getChatsStoreInteractor$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getChatsStoreInteractor$execute$1.label;
        if (i != 0) {
        }
        return FlowKt.combine(flow, (Flow) obj2, new GetChatsStoreInteractor$execute$2(null));
    }

    public final Object shouldShowExplanationPopup(Continuation<? super Boolean> continuation) {
        return this.userGuideRepository.shouldShowChatStoreGuide(continuation);
    }

    public final Object onExplanationPopupShown(Continuation<? super Unit> continuation) {
        Object onChatStoreGuideShown = this.userGuideRepository.onChatStoreGuideShown(continuation);
        return onChatStoreGuideShown == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? onChatStoreGuideShown : Unit.INSTANCE;
    }

    private final Flow<List<ChatInfo>> getChatsFlow() {
        final Flow<List<ChatInfo>> chatFlow = this.chatsInfoRepository.getChatFlow();
        return (Flow) new Flow<List<? extends ChatInfo>>() { // from class: com.ifriend.domain.logic.store.GetChatsStoreInteractor$getChatsFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ChatInfo>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.store.GetChatsStoreInteractor$getChatsFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.store.GetChatsStoreInteractor$getChatsFlow$$inlined$map$1$2", f = "GetChatsStoreInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.store.GetChatsStoreInteractor$getChatsFlow$$inlined$map$1$2$1  reason: invalid class name */
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
                                ArrayList arrayList = new ArrayList();
                                for (T t : (List) obj) {
                                    if (((ChatInfo) t).getPaymentStatus() instanceof ChatPaymentStatus.Purchase) {
                                        arrayList.add(t);
                                    }
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
        };
    }
}
