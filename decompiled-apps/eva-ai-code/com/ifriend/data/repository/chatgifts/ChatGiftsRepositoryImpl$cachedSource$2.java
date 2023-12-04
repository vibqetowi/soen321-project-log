package com.ifriend.data.repository.chatgifts;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.chatgifts.models.response.ChatGiftsRemote;
import com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ifriend/data/common/InMemoryCachedSource;", "Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;", "", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsRepositoryImpl$cachedSource$2 extends Lambda implements Function0<InMemoryCachedSource<ChatGiftsRepositoryImpl.ChatGiftsKey, List<? extends ChatGift>>> {
    final /* synthetic */ ChatGiftsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsRepositoryImpl$cachedSource$2(ChatGiftsRepositoryImpl chatGiftsRepositoryImpl) {
        super(0);
        this.this$0 = chatGiftsRepositoryImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatGiftsRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;", "key", "", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl$cachedSource$2$1", f = "ChatGiftsRepositoryImpl.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl$cachedSource$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChatGiftsRepositoryImpl.ChatGiftsKey, Continuation<? super List<? extends ChatGift>>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatGiftsRepositoryImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatGiftsRepositoryImpl chatGiftsRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatGiftsRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ChatGiftsRepositoryImpl.ChatGiftsKey chatGiftsKey, Continuation<? super List<ChatGift>> continuation) {
            return ((AnonymousClass1) create(chatGiftsKey, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ChatGiftsRepositoryImpl.ChatGiftsKey chatGiftsKey, Continuation<? super List<? extends ChatGift>> continuation) {
            return invoke2(chatGiftsKey, (Continuation<? super List<ChatGift>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppConfigStorage appConfigStorage;
            ChatGift chatGif;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChatGiftsRepositoryImpl.ChatGiftsKey chatGiftsKey = (ChatGiftsRepositoryImpl.ChatGiftsKey) this.L$0;
                String userId = chatGiftsKey.getUserId();
                String chatId = chatGiftsKey.getChatId();
                this.label = 1;
                obj = this.this$0.getGiftsFromRemote(chatId, userId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            appConfigStorage = this.this$0.appConfigStorage;
            String apiUrl = appConfigStorage.getApiUrl();
            List<ChatGiftsRemote> list = (List) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ChatGiftsRemote chatGiftsRemote : list) {
                chatGif = ChatGiftsRepositoryImplKt.toChatGif(chatGiftsRemote, apiUrl);
                arrayList.add(chatGif);
            }
            return arrayList;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final InMemoryCachedSource<ChatGiftsRepositoryImpl.ChatGiftsKey, List<? extends ChatGift>> invoke2() {
        return new InMemoryCachedSource<>(null, new AnonymousClass1(this.this$0, null), AnonymousClass2.INSTANCE, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatGiftsRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "key1", "Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;", "key2", "invoke", "(Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl$cachedSource$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function2<ChatGiftsRepositoryImpl.ChatGiftsKey, ChatGiftsRepositoryImpl.ChatGiftsKey, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(ChatGiftsRepositoryImpl.ChatGiftsKey key1, ChatGiftsRepositoryImpl.ChatGiftsKey key2) {
            Intrinsics.checkNotNullParameter(key1, "key1");
            Intrinsics.checkNotNullParameter(key2, "key2");
            return Boolean.valueOf(Intrinsics.areEqual(key1.getChatId(), key2.getChatId()));
        }
    }
}
