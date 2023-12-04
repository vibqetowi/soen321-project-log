package com.ifriend.data.repository.topics;

import com.ifriend.data.networking.api.topics.models.ChatTopicRemote;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.logic.topics.models.ChatTopic;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatTopicsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/logic/topics/models/ChatTopic;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.topics.ChatTopicsRepositoryImpl$getTopics$2", f = "ChatTopicsRepositoryImpl.kt", i = {}, l = {31, 30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatTopicsRepositoryImpl$getTopics$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ChatTopic>>, Object> {
    final /* synthetic */ String $chatId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChatTopicsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTopicsRepositoryImpl$getTopics$2(ChatTopicsRepositoryImpl chatTopicsRepositoryImpl, String str, Continuation<? super ChatTopicsRepositoryImpl$getTopics$2> continuation) {
        super(2, continuation);
        this.this$0 = chatTopicsRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatTopicsRepositoryImpl$getTopics$2 chatTopicsRepositoryImpl$getTopics$2 = new ChatTopicsRepositoryImpl$getTopics$2(this.this$0, this.$chatId, continuation);
        chatTopicsRepositoryImpl$getTopics$2.L$0 = obj;
        return chatTopicsRepositoryImpl$getTopics$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ChatTopic>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ChatTopic>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ChatTopic>> continuation) {
        return ((ChatTopicsRepositoryImpl$getTopics$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:6:0x0010, B:28:0x006b, B:29:0x0078, B:31:0x007e, B:33:0x008e, B:39:0x009a, B:41:0x00a2, B:49:0x00b1, B:50:0x00b5, B:51:0x00ca, B:53:0x00d0, B:56:0x00df, B:59:0x00e6, B:62:0x00ed, B:63:0x00f4, B:11:0x0024, B:17:0x004a, B:19:0x004f, B:21:0x0055, B:25:0x005e, B:14:0x0033), top: B:71:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:6:0x0010, B:28:0x006b, B:29:0x0078, B:31:0x007e, B:33:0x008e, B:39:0x009a, B:41:0x00a2, B:49:0x00b1, B:50:0x00b5, B:51:0x00ca, B:53:0x00d0, B:56:0x00df, B:59:0x00e6, B:62:0x00ed, B:63:0x00f4, B:11:0x0024, B:17:0x004a, B:19:0x004f, B:21:0x0055, B:25:0x005e, B:14:0x0033), top: B:71:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0 A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:6:0x0010, B:28:0x006b, B:29:0x0078, B:31:0x007e, B:33:0x008e, B:39:0x009a, B:41:0x00a2, B:49:0x00b1, B:50:0x00b5, B:51:0x00ca, B:53:0x00d0, B:56:0x00df, B:59:0x00e6, B:62:0x00ed, B:63:0x00f4, B:11:0x0024, B:17:0x004a, B:19:0x004f, B:21:0x0055, B:25:0x005e, B:14:0x0033), top: B:71:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7271constructorimpl;
        String str;
        ChatTopicsRemoteDataSource chatTopicsRemoteDataSource;
        AuthDataProvider authDataProvider;
        UserId userId;
        boolean z;
        boolean z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ChatTopicsRepositoryImpl chatTopicsRepositoryImpl = this.this$0;
            str = this.$chatId;
            Result.Companion companion2 = Result.Companion;
            chatTopicsRemoteDataSource = chatTopicsRepositoryImpl.remoteDataSource;
            authDataProvider = chatTopicsRepositoryImpl.authDataProvider;
            this.L$0 = str;
            this.L$1 = chatTopicsRemoteDataSource;
            this.label = 1;
            obj = authDataProvider.lastAuthData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    ChatTopicRemote chatTopicRemote = (ChatTopicRemote) obj2;
                    String id = chatTopicRemote.getId();
                    boolean z3 = false;
                    if (id != null && !StringsKt.isBlank(id)) {
                        z = false;
                        if (!z) {
                            String name = chatTopicRemote.getName();
                            if (name != null && !StringsKt.isBlank(name)) {
                                z2 = false;
                                if (!z2) {
                                    z3 = true;
                                }
                            }
                            z2 = true;
                            if (!z2) {
                            }
                        }
                        if (!z3) {
                            arrayList.add(obj2);
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                    if (!z3) {
                    }
                }
                ArrayList<ChatTopicRemote> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (ChatTopicRemote chatTopicRemote2 : arrayList2) {
                    String id2 = chatTopicRemote2.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    String name2 = chatTopicRemote2.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    String icon = chatTopicRemote2.getIcon();
                    if (icon == null) {
                        icon = "";
                    }
                    arrayList3.add(new ChatTopic(id2, name2, icon));
                }
                m7271constructorimpl = Result.m7271constructorimpl(arrayList3);
                return !Result.m7277isFailureimpl(m7271constructorimpl) ? CollectionsKt.emptyList() : m7271constructorimpl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatTopicsRemoteDataSource = (ChatTopicsRemoteDataSource) this.L$1;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AuthData authData = (AuthData) obj;
        String value = (authData == null || (userId = authData.getUserId()) == null) ? null : userId.getValue();
        if (value == null) {
            value = "";
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = chatTopicsRemoteDataSource.getTopics(value, str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ArrayList arrayList4 = new ArrayList();
        while (r8.hasNext()) {
        }
        ArrayList<ChatTopicRemote> arrayList22 = arrayList4;
        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
        while (r0.hasNext()) {
        }
        m7271constructorimpl = Result.m7271constructorimpl(arrayList32);
        if (!Result.m7277isFailureimpl(m7271constructorimpl)) {
        }
    }
}
