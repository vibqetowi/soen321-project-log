package com.ifriend.data.repository.chat.info;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.chat.models.ChatsRootRemote;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import com.ifriend.data.repository.chat.info.mapper.ChatInfoMapper;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$refreshChats$2", f = "ChatsInfoRepositoryImpl.kt", i = {1, 2, 3}, l = {48, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 57, TsExtractor.TS_SYNC_BYTE}, m = "invokeSuspend", n = {"chatConfigs", "chatConfigs", "chatConfigs"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class ChatsInfoRepositoryImpl$refreshChats$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mainChatId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ChatsInfoRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsInfoRepositoryImpl$refreshChats$2(ChatsInfoRepositoryImpl chatsInfoRepositoryImpl, String str, Continuation<? super ChatsInfoRepositoryImpl$refreshChats$2> continuation) {
        super(2, continuation);
        this.this$0 = chatsInfoRepositoryImpl;
        this.$mainChatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsInfoRepositoryImpl$refreshChats$2(this.this$0, this.$mainChatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatsInfoRepositoryImpl$refreshChats$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
        List list;
        ChatsRemoteDataSource chatsRemoteDataSource;
        ChatsInfoRepositoryImpl chatsInfoRepositoryImpl;
        List list2;
        Iterator it;
        String str;
        Iterable iterable;
        ChatInfo mainChatInfo;
        InMemoryCachedSource cachedSource;
        Object obj2;
        ChatInfoMapper chatInfoMapper;
        InMemoryCachedSource cachedSource2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatConfigsMemoryCachedSource = this.this$0.chatConfigsMemoryCachedSource;
            this.label = 1;
            obj = chatConfigsMemoryCachedSource.getChatConfigs(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                Iterable iterable2 = (Iterable) obj;
                String str2 = this.$mainChatId;
                chatsInfoRepositoryImpl = this.this$0;
                list2 = list;
                it = iterable2.iterator();
                str = str2;
                iterable = iterable2;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            } else if (i == 3 || i == 4) {
                it = (Iterator) this.L$4;
                iterable = (Iterable) this.L$3;
                chatsInfoRepositoryImpl = (ChatsInfoRepositoryImpl) this.L$2;
                str = (String) this.L$1;
                list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    ChatsRootRemote.ChatRemote chatRemote = (ChatsRootRemote.ChatRemote) it.next();
                    String chatId = chatRemote.getChatId();
                    if (chatId == null) {
                        chatId = "";
                    }
                    if (Intrinsics.areEqual(str, chatId)) {
                        mainChatInfo = chatsInfoRepositoryImpl.getMainChatInfo(list2, chatRemote);
                        if (mainChatInfo != null) {
                            cachedSource = chatsInfoRepositoryImpl.getCachedSource();
                            String chatId2 = mainChatInfo.getChatId();
                            this.L$0 = list2;
                            this.L$1 = str;
                            this.L$2 = chatsInfoRepositoryImpl;
                            this.L$3 = iterable;
                            this.L$4 = it;
                            this.label = 3;
                            if (cachedSource.replace(chatId2, mainChatInfo, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (Intrinsics.areEqual(((ChatConfig) obj2).getChatId(), chatId)) {
                                break;
                            }
                        }
                        ChatConfig chatConfig = (ChatConfig) obj2;
                        if (chatConfig != null) {
                            chatInfoMapper = chatsInfoRepositoryImpl.chatInfoMapper;
                            ChatInfo map = chatInfoMapper.map(chatRemote, chatConfig);
                            cachedSource2 = chatsInfoRepositoryImpl.getCachedSource();
                            String chatId3 = map.getChatId();
                            this.L$0 = list2;
                            this.L$1 = str;
                            this.L$2 = chatsInfoRepositoryImpl;
                            this.L$3 = iterable;
                            this.L$4 = it;
                            this.label = 4;
                            if (cachedSource2.replace(chatId3, map, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        list = (List) obj;
        chatsRemoteDataSource = this.this$0.chatsRemoteDataSource;
        this.L$0 = list;
        this.label = 2;
        obj = chatsRemoteDataSource.getChats(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Iterable iterable22 = (Iterable) obj;
        String str22 = this.$mainChatId;
        chatsInfoRepositoryImpl = this.this$0;
        list2 = list;
        it = iterable22.iterator();
        str = str22;
        iterable = iterable22;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
