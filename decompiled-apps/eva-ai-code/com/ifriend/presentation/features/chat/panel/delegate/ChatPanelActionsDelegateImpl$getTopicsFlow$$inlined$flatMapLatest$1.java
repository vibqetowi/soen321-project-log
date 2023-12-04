package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.domain.logic.topics.models.ChatTopic;
import com.ifriend.presentation.features.chat.panel.mappers.ChatTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
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
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1", f = "ChatPanelActionsDelegate.kt", i = {}, l = {220, 193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends ChatTopicUi>>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1(Continuation continuation, ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, String str) {
        super(3, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$chatId$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends ChatTopicUi>> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1 chatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1 = new ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1(continuation, this.this$0, this.$chatId$inlined);
        chatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1.L$1 = bool;
        return chatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow<List<? extends ChatTopicUi>> flowOf;
        ChatPanelActionsInteractor chatPanelActionsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                chatPanelActionsInteractor = this.this$0.chatPanelActionsInteractor;
                String str = this.$chatId$inlined;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = chatPanelActionsInteractor.getChatTopicFlow(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                flowOf = FlowKt.flowOf(CollectionsKt.emptyList());
                this.L$0 = null;
                this.label = 2;
                if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        final Flow flow = (Flow) obj;
        final ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl = this.this$0;
        flowOf = new Flow<List<? extends ChatTopicUi>>() { // from class: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$getTopicsFlow$lambda$3$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ChatTopicUi>> flowCollector2, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector2, chatPanelActionsDelegateImpl), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$getTopicsFlow$lambda$3$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$getTopicsFlow$lambda$3$$inlined$map$1$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$getTopicsFlow$lambda$3$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatPanelActionsDelegateImpl;
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
                    ChatTopicMapperUi chatTopicMapperUi;
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
                                List<ChatTopic> list = (List) obj;
                                chatTopicMapperUi = this.this$0.chatTopicMapperUi;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (ChatTopic chatTopic : list) {
                                    arrayList.add(chatTopicMapperUi.map(chatTopic));
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
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
