package com.ifriend.data.repository.chatgifts;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.chatgifts.models.response.ChatGiftsRemote;
import com.ifriend.data.networking.datasources.gifts.ChatGiftsRemoteDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatGiftsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0019J@\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001fJ+\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J'\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J!\u0010)\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J)\u0010*\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0,2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl;", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "chatGiftsRemoteDataSource", "Lcom/ifriend/data/networking/datasources/gifts/ChatGiftsRemoteDataSource;", "appConfigStorage", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "coreExecuteCatching", "(Lcom/ifriend/data/networking/datasources/gifts/ChatGiftsRemoteDataSource;Lcom/ifriend/data/storages/config/AppConfigStorage;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;", "", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGift", "chatId", "", "userId", "giftId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGiftsFromRemote", "Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "removeGiftFromLocal", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "ChatGiftsKey", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsRepositoryImpl implements ChatGiftsRepository, CoreExecuteCatching {
    private final AppConfigStorage appConfigStorage;
    private final Lazy cachedSource$delegate;
    private final ChatGiftsRemoteDataSource chatGiftsRemoteDataSource;
    private final CoreExecuteCatching coreExecuteCatching;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    public ChatGiftsRepositoryImpl(ChatGiftsRemoteDataSource chatGiftsRemoteDataSource, AppConfigStorage appConfigStorage, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(chatGiftsRemoteDataSource, "chatGiftsRemoteDataSource");
        Intrinsics.checkNotNullParameter(appConfigStorage, "appConfigStorage");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.chatGiftsRemoteDataSource = chatGiftsRemoteDataSource;
        this.appConfigStorage = appConfigStorage;
        this.coreExecuteCatching = coreExecuteCatching;
        this.cachedSource$delegate = LazyKt.lazy(new ChatGiftsRepositoryImpl$cachedSource$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChatGiftsRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/repository/chatgifts/ChatGiftsRepositoryImpl$ChatGiftsKey;", "", "userId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ChatGiftsKey {
        private final String chatId;
        private final String userId;

        public static /* synthetic */ ChatGiftsKey copy$default(ChatGiftsKey chatGiftsKey, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatGiftsKey.userId;
            }
            if ((i & 2) != 0) {
                str2 = chatGiftsKey.chatId;
            }
            return chatGiftsKey.copy(str, str2);
        }

        public final String component1() {
            return this.userId;
        }

        public final String component2() {
            return this.chatId;
        }

        public final ChatGiftsKey copy(String userId, String chatId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new ChatGiftsKey(userId, chatId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChatGiftsKey) {
                ChatGiftsKey chatGiftsKey = (ChatGiftsKey) obj;
                return Intrinsics.areEqual(this.userId, chatGiftsKey.userId) && Intrinsics.areEqual(this.chatId, chatGiftsKey.chatId);
            }
            return false;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.chatId.hashCode();
        }

        public String toString() {
            String str = this.userId;
            String str2 = this.chatId;
            return "ChatGiftsKey(userId=" + str + ", chatId=" + str2 + ")";
        }

        public ChatGiftsKey(String userId, String chatId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.userId = userId;
            this.chatId = chatId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getChatId() {
            return this.chatId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<ChatGiftsKey, List<ChatGift>> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.chatgifts.ChatGiftsRepository
    public Flow<List<ChatGift>> subscribe(String chatId, String userId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return FlowKt.filterNotNull(getCachedSource().subscribeByKey(new ChatGiftsKey(userId, chatId)));
    }

    @Override // com.ifriend.domain.data.chatgifts.ChatGiftsRepository
    public Object refresh(String str, String str2, Continuation<? super Unit> continuation) {
        Object refresh = getCachedSource().refresh(new ChatGiftsKey(str2, str), continuation);
        return refresh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? refresh : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getGiftsFromRemote(String str, String str2, Continuation<? super List<ChatGiftsRemote>> continuation) {
        return executeInBackground(new ChatGiftsRepositoryImpl$getGiftsFromRemote$2(this, str2, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.chatgifts.ChatGiftsRepository
    public Object getGift(String str, String str2, String str3, Continuation<? super ChatGift> continuation) {
        return executeInBackground(new ChatGiftsRepositoryImpl$getGift$2(this, str2, str, str3, null), continuation);
    }

    @Override // com.ifriend.domain.data.chatgifts.ChatGiftsRepository
    public Object clear(Continuation<? super Unit> continuation) {
        Object clearAll = getCachedSource().clearAll(continuation);
        return clearAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearAll : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chatgifts.ChatGiftsRepository
    public Object removeGiftFromLocal(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        Object update = getCachedSource().update(new ChatGiftsKey(str2, str), new ChatGiftsRepositoryImpl$removeGiftFromLocal$2(str3), continuation);
        return update == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update : Unit.INSTANCE;
    }
}
