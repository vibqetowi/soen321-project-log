package com.ifriend.presentation.features.chat.sextingmessage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState;
import com.ifriend.domain.newChat.chat.ChatClient;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessageComponent;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatMessageBillingUiParams;
import com.ifriend.presentation.features.chat.common.models.MessageIdsParamsKt;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: SextingMessagePaywallShowingDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1", f = "SextingMessagePaywallShowingDelegate.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ SextingMessagePaywallShowingDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1(SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl, String str, ViewModel viewModel, Continuation<? super SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1> continuation) {
        super(2, continuation);
        this.this$0 = sextingMessagePaywallShowingDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatClientInteractor chatClientInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatClientInteractor = this.this$0.chatClientInteractor;
            this.label = 1;
            obj = chatClientInteractor.getChatsClient(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.mapLatest(((ChatClient) obj).getState(), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(this.this$0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SextingMessagePaywallShowingDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/common_entities_engine/EntitiesState;", "state", "", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1$1", f = "SextingMessagePaywallShowingDelegate.kt", i = {0, 0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {"destination$iv$iv", "element$iv$iv", ShareConstants.WEB_DIALOG_PARAM_MESSAGE}, s = {"L$1", "L$3", "L$4"})
    /* renamed from: com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<EntitiesState, Continuation<? super List<? extends ChatMessage>>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ SextingMessagePaywallShowingDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sextingMessagePaywallShowingDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(EntitiesState entitiesState, Continuation<? super List<ChatMessage>> continuation) {
            return ((AnonymousClass1) create(entitiesState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(EntitiesState entitiesState, Continuation<? super List<? extends ChatMessage>> continuation) {
            return invoke2(entitiesState, (Continuation<? super List<ChatMessage>>) continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fe -> B:40:0x0107). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl;
            ArrayList arrayList;
            AnonymousClass1 anonymousClass1;
            boolean z;
            boolean z2;
            ChatMessageAccessInteractor chatMessageAccessInteractor;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<Entity> arrayList2 = new ArrayList();
                for (Object obj2 : ((EntitiesState) this.L$0).getEntities()) {
                    Entity entity = (Entity) obj2;
                    Set<Component> components = entity.getComponents();
                    if (!(components instanceof Collection) || !components.isEmpty()) {
                        for (Component component : components) {
                            if (entity.get(Reflection.getOrCreateKotlinClass(LiveMessageComponent.class)) != null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Entity entity2 : arrayList2) {
                    ChatMessage chatMessage = (ChatMessage) entity2.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                    if (chatMessage != null) {
                        arrayList3.add(chatMessage);
                    }
                }
                SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl2 = this.this$0;
                it = arrayList3.iterator();
                sextingMessagePaywallShowingDelegateImpl = sextingMessagePaywallShowingDelegateImpl2;
                arrayList = new ArrayList();
                anonymousClass1 = this;
                if (it.hasNext()) {
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Object obj3 = this.L$3;
                ResultKt.throwOnFailure(obj);
                SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl3 = (SextingMessagePaywallShowingDelegateImpl) this.L$0;
                ArrayList arrayList4 = (Collection) this.L$1;
                Iterator it2 = (Iterator) this.L$2;
                Object obj4 = obj3;
                ChatMessage chatMessage2 = (ChatMessage) this.L$4;
                Object obj5 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                if (!((ChatMessageAvailableState) obj).isNeedPayForMessage() && (chatMessage2.getInfo().isSexting() || (StringsKt.isBlank(chatMessage2.getInfo().getRegenerate().getOldMessageId()) ^ true))) {
                    arrayList4.add(obj4);
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj5;
                it = it2;
                arrayList = arrayList4;
                sextingMessagePaywallShowingDelegateImpl = sextingMessagePaywallShowingDelegateImpl3;
                if (it.hasNext()) {
                    Object next = it.next();
                    ChatMessage chatMessage3 = (ChatMessage) next;
                    chatMessageAccessInteractor = sextingMessagePaywallShowingDelegateImpl.chatMessageAccessInteractor;
                    MessageInfo info = chatMessage3.getInfo();
                    anonymousClass1.L$0 = sextingMessagePaywallShowingDelegateImpl;
                    anonymousClass1.L$1 = arrayList;
                    anonymousClass1.L$2 = it;
                    anonymousClass1.L$3 = next;
                    anonymousClass1.L$4 = chatMessage3;
                    anonymousClass1.label = 1;
                    Object messageAvailableState = chatMessageAccessInteractor.getMessageAvailableState(info, anonymousClass1);
                    if (messageAvailableState == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj6 = coroutine_suspended;
                    anonymousClass12 = anonymousClass1;
                    obj = messageAvailableState;
                    sextingMessagePaywallShowingDelegateImpl3 = sextingMessagePaywallShowingDelegateImpl;
                    arrayList4 = arrayList;
                    it2 = it;
                    obj4 = next;
                    chatMessage2 = chatMessage3;
                    obj5 = obj6;
                    if (!((ChatMessageAvailableState) obj).isNeedPayForMessage() && (chatMessage2.getInfo().isSexting() || (StringsKt.isBlank(chatMessage2.getInfo().getRegenerate().getOldMessageId()) ^ true))) {
                    }
                    anonymousClass1 = anonymousClass12;
                    coroutine_suspended = obj5;
                    it = it2;
                    arrayList = arrayList4;
                    sextingMessagePaywallShowingDelegateImpl = sextingMessagePaywallShowingDelegateImpl3;
                    if (it.hasNext()) {
                        return arrayList;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SextingMessagePaywallShowingDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "encodedMessage", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1$2", f = "SextingMessagePaywallShowingDelegate.kt", i = {0, 0}, l = {70}, m = "invokeSuspend", n = {"encodedMessageTags", "messageInfo"}, s = {"L$0", "L$2"})
    /* renamed from: com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ChatMessage>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SextingMessagePaywallShowingDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = sextingMessagePaywallShowingDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatMessage> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ChatMessage>) list, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatMessage> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Collection collection;
            HashSet hashSet;
            ChatMessage chatMessage;
            MessageInfo info;
            MessageInfo messageInfo;
            Collection collection2;
            SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl;
            HashSet hashSet2;
            AppEventsEmitter appEventsEmitter;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                List<ChatMessage> list2 = list;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (ChatMessage chatMessage2 : list2) {
                    arrayList.add(chatMessage2.getInfo().getTag().getValue());
                }
                collection = (List) arrayList;
                hashSet = this.this$0.paywallShownForMessages;
                if ((!CollectionsKt.minus((Iterable) collection, (Iterable) hashSet).isEmpty()) && (chatMessage = (ChatMessage) CollectionsKt.lastOrNull((List<? extends Object>) list)) != null && (info = chatMessage.getInfo()) != null) {
                    SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl2 = this.this$0;
                    this.L$0 = collection;
                    this.L$1 = sextingMessagePaywallShowingDelegateImpl2;
                    this.L$2 = info;
                    this.label = 1;
                    if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    messageInfo = info;
                    collection2 = collection;
                    sextingMessagePaywallShowingDelegateImpl = sextingMessagePaywallShowingDelegateImpl2;
                }
                hashSet2 = this.this$0.paywallShownForMessages;
                hashSet2.addAll(collection);
                return Unit.INSTANCE;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                messageInfo = (MessageInfo) this.L$2;
                sextingMessagePaywallShowingDelegateImpl = (SextingMessagePaywallShowingDelegateImpl) this.L$1;
                collection2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
            BuyChatMessageBillingUiParams buyChatMessageBillingUiParams = new BuyChatMessageBillingUiParams(randomUUID, new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(messageInfo.getIds())), PurchaseSource.CHAT, UpgradeType.ADULT_TEXTING, messageInfo.getIds().getSenderId());
            appEventsEmitter = sextingMessagePaywallShowingDelegateImpl.appEventsEmitter;
            appEventsEmitter.emit(new AppEvents.Billing.BuyChatMessage(buyChatMessageBillingUiParams));
            collection = collection2;
            hashSet2 = this.this$0.paywallShownForMessages;
            hashSet2.addAll(collection);
            return Unit.INSTANCE;
        }
    }
}
