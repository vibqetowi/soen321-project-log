package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.data.networking.api.chat.models.ChatsRootRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote$ChatRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource$getChats$2", f = "ChatsRemoteDataSource.kt", i = {}, l = {23, 22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsRemoteDataSource$getChats$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ChatsRootRemote.ChatRemote>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChatsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsRemoteDataSource$getChats$2(ChatsRemoteDataSource chatsRemoteDataSource, Continuation<? super ChatsRemoteDataSource$getChats$2> continuation) {
        super(1, continuation);
        this.this$0 = chatsRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatsRemoteDataSource$getChats$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ChatsRootRemote.ChatRemote>> continuation) {
        return invoke2((Continuation<? super List<ChatsRootRemote.ChatRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<ChatsRootRemote.ChatRemote>> continuation) {
        return ((ChatsRemoteDataSource$getChats$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatsApi chatsApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsApi = this.this$0.chatsApi;
            this.L$0 = chatsApi;
            this.label = 1;
            obj = this.this$0.getUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                List<ChatsRootRemote.ChatRemote> chatList = ((ChatsRootRemote) obj).getChatList();
                return chatList != null ? CollectionsKt.emptyList() : chatList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatsApi = (ChatsApi) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = chatsApi.getChats((String) obj, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<ChatsRootRemote.ChatRemote> chatList2 = ((ChatsRootRemote) obj).getChatList();
        if (chatList2 != null) {
        }
    }
}
