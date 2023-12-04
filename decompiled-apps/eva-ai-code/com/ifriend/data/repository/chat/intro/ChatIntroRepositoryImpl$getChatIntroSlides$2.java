package com.ifriend.data.repository.chat.intro;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.configuration.model.ChatIntroRemote;
import com.ifriend.data.networking.api.configuration.model.ChatIntroSlideRemote;
import com.ifriend.data.networking.api.configuration.model.ChatIntroSlidesRemoteKt;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
/* compiled from: ChatIntroRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.intro.ChatIntroRepositoryImpl$getChatIntroSlides$2", f = "ChatIntroRepositoryImpl.kt", i = {0, 1, 2}, l = {64, 32, 34}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class ChatIntroRepositoryImpl$getChatIntroSlides$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ChatIntroSlide>>, Object> {
    final /* synthetic */ String $botId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ChatIntroRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroRepositoryImpl$getChatIntroSlides$2(ChatIntroRepositoryImpl chatIntroRepositoryImpl, String str, Continuation<? super ChatIntroRepositoryImpl$getChatIntroSlides$2> continuation) {
        super(2, continuation);
        this.this$0 = chatIntroRepositoryImpl;
        this.$botId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatIntroRepositoryImpl$getChatIntroSlides$2(this.this$0, this.$botId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ChatIntroSlide>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ChatIntroSlide>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ChatIntroSlide>> continuation) {
        return ((ChatIntroRepositoryImpl$getChatIntroSlides$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x0022, B:30:0x009e, B:32:0x00a4, B:33:0x00d1, B:35:0x00d7, B:36:0x00e5, B:39:0x00f8, B:40:0x00fc, B:42:0x0108, B:13:0x003c, B:28:0x0090, B:22:0x0076, B:24:0x007c), top: B:47:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x0022, B:30:0x009e, B:32:0x00a4, B:33:0x00d1, B:35:0x00d7, B:36:0x00e5, B:39:0x00f8, B:40:0x00fc, B:42:0x0108, B:13:0x003c, B:28:0x0090, B:22:0x0076, B:24:0x007c), top: B:47:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Mutex mutex2;
        ChatIntroRepositoryImpl chatIntroRepositoryImpl;
        String str;
        boolean z;
        ChatConfigurationsRemoteDataSource chatConfigurationsRemoteDataSource;
        ChatIntroRepositoryImpl chatIntroRepositoryImpl2;
        String str2;
        Iterator it;
        InMemoryCachedSource cachedSource;
        List list;
        InMemoryCachedSource cachedSource2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.mutex;
                ChatIntroRepositoryImpl chatIntroRepositoryImpl3 = this.this$0;
                String str3 = this.$botId;
                this.L$0 = mutex;
                this.L$1 = chatIntroRepositoryImpl3;
                this.L$2 = str3;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                chatIntroRepositoryImpl = chatIntroRepositoryImpl3;
                str = str3;
            } else if (i != 1) {
                if (i == 2) {
                    str = (String) this.L$2;
                    chatIntroRepositoryImpl2 = (ChatIntroRepositoryImpl) this.L$1;
                    mutex2 = (Mutex) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    chatIntroRepositoryImpl = chatIntroRepositoryImpl2;
                    str2 = str;
                    it = ((Map) obj).entrySet().iterator();
                    while (it.hasNext()) {
                    }
                    chatIntroRepositoryImpl.isIntroLoaded = true;
                    str = str2;
                    cachedSource = chatIntroRepositoryImpl.getCachedSource();
                    list = (List) cachedSource.getFromCache(str);
                    if (list == null) {
                    }
                    return list;
                } else if (i == 3) {
                    it = (Iterator) this.L$3;
                    str2 = (String) this.L$2;
                    chatIntroRepositoryImpl = (ChatIntroRepositoryImpl) this.L$1;
                    mutex2 = (Mutex) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str4 = (String) entry.getKey();
                        cachedSource2 = chatIntroRepositoryImpl.getCachedSource();
                        List<ChatIntroSlideRemote> slides = ((ChatIntroRemote) entry.getValue()).getSlides();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(slides, 10));
                        for (ChatIntroSlideRemote chatIntroSlideRemote : slides) {
                            arrayList.add(ChatIntroSlidesRemoteKt.toDomain(chatIntroSlideRemote));
                        }
                        this.L$0 = mutex2;
                        this.L$1 = chatIntroRepositoryImpl;
                        this.L$2 = str2;
                        this.L$3 = it;
                        this.label = 3;
                        if (cachedSource2.replace(str4, arrayList, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    chatIntroRepositoryImpl.isIntroLoaded = true;
                    str = str2;
                    cachedSource = chatIntroRepositoryImpl.getCachedSource();
                    list = (List) cachedSource.getFromCache(str);
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    return list;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str = (String) this.L$2;
                chatIntroRepositoryImpl = (ChatIntroRepositoryImpl) this.L$1;
                mutex2 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            z = chatIntroRepositoryImpl.isIntroLoaded;
            if (!z) {
                chatConfigurationsRemoteDataSource = chatIntroRepositoryImpl.remoteDataSource;
                this.L$0 = mutex2;
                this.L$1 = chatIntroRepositoryImpl;
                this.L$2 = str;
                this.label = 2;
                obj = chatConfigurationsRemoteDataSource.getChatIntroSlides(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatIntroRepositoryImpl2 = chatIntroRepositoryImpl;
                chatIntroRepositoryImpl = chatIntroRepositoryImpl2;
                str2 = str;
                it = ((Map) obj).entrySet().iterator();
                while (it.hasNext()) {
                }
                chatIntroRepositoryImpl.isIntroLoaded = true;
                str = str2;
            }
            cachedSource = chatIntroRepositoryImpl.getCachedSource();
            list = (List) cachedSource.getFromCache(str);
            if (list == null) {
            }
            return list;
        } finally {
            mutex2.unlock(null);
        }
    }
}
