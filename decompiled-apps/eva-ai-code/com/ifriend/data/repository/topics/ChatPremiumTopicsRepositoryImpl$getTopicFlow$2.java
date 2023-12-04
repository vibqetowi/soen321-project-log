package com.ifriend.data.repository.topics;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.networking.api.topics.models.ChatPremiumTopicRemote;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.logic.topics.models.ChatPremiumTopic;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatPremiumTopicsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/topics/models/ChatPremiumTopic;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.topics.ChatPremiumTopicsRepositoryImpl$getTopicFlow$2", f = "ChatPremiumTopicsRepositoryImpl.kt", i = {}, l = {25, 24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPremiumTopicsRepositoryImpl$getTopicFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends List<? extends ChatPremiumTopic>>>, Object> {
    final /* synthetic */ String $chatId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChatPremiumTopicsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPremiumTopicsRepositoryImpl$getTopicFlow$2(ChatPremiumTopicsRepositoryImpl chatPremiumTopicsRepositoryImpl, String str, Continuation<? super ChatPremiumTopicsRepositoryImpl$getTopicFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPremiumTopicsRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatPremiumTopicsRepositoryImpl$getTopicFlow$2 chatPremiumTopicsRepositoryImpl$getTopicFlow$2 = new ChatPremiumTopicsRepositoryImpl$getTopicFlow$2(this.this$0, this.$chatId, continuation);
        chatPremiumTopicsRepositoryImpl$getTopicFlow$2.L$0 = obj;
        return chatPremiumTopicsRepositoryImpl$getTopicFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<? extends ChatPremiumTopic>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<? extends List<ChatPremiumTopic>>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<ChatPremiumTopic>>> continuation) {
        return ((ChatPremiumTopicsRepositoryImpl$getTopicFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:6:0x000e, B:22:0x005a, B:23:0x0067, B:25:0x006d, B:27:0x007d, B:33:0x0089, B:35:0x0091, B:43:0x00a0, B:44:0x00a4, B:45:0x00b9, B:47:0x00bf, B:51:0x00d0, B:54:0x00d7, B:58:0x00df, B:59:0x00ea, B:11:0x0022, B:17:0x0048, B:19:0x004c, B:60:0x00f5, B:61:0x0100, B:14:0x0031), top: B:68:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:6:0x000e, B:22:0x005a, B:23:0x0067, B:25:0x006d, B:27:0x007d, B:33:0x0089, B:35:0x0091, B:43:0x00a0, B:44:0x00a4, B:45:0x00b9, B:47:0x00bf, B:51:0x00d0, B:54:0x00d7, B:58:0x00df, B:59:0x00ea, B:11:0x0022, B:17:0x0048, B:19:0x004c, B:60:0x00f5, B:61:0x0100, B:14:0x0031), top: B:68:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:6:0x000e, B:22:0x005a, B:23:0x0067, B:25:0x006d, B:27:0x007d, B:33:0x0089, B:35:0x0091, B:43:0x00a0, B:44:0x00a4, B:45:0x00b9, B:47:0x00bf, B:51:0x00d0, B:54:0x00d7, B:58:0x00df, B:59:0x00ea, B:11:0x0022, B:17:0x0048, B:19:0x004c, B:60:0x00f5, B:61:0x0100, B:14:0x0031), top: B:68:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7271constructorimpl;
        String str;
        ChatTopicsRemoteDataSource chatTopicsRemoteDataSource;
        AuthLocalDataSource authLocalDataSource;
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
            ChatPremiumTopicsRepositoryImpl chatPremiumTopicsRepositoryImpl = this.this$0;
            str = this.$chatId;
            Result.Companion companion2 = Result.Companion;
            chatTopicsRemoteDataSource = chatPremiumTopicsRepositoryImpl.remoteDataSource;
            authLocalDataSource = chatPremiumTopicsRepositoryImpl.authDataSource;
            this.L$0 = str;
            this.L$1 = chatTopicsRemoteDataSource;
            this.label = 1;
            obj = authLocalDataSource.getUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    ChatPremiumTopicRemote chatPremiumTopicRemote = (ChatPremiumTopicRemote) obj2;
                    String id = chatPremiumTopicRemote.getId();
                    boolean z3 = false;
                    if (id != null && !StringsKt.isBlank(id)) {
                        z = false;
                        if (!z) {
                            String name = chatPremiumTopicRemote.getName();
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
                ArrayList<ChatPremiumTopicRemote> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (ChatPremiumTopicRemote chatPremiumTopicRemote2 : arrayList2) {
                    String id2 = chatPremiumTopicRemote2.getId();
                    String str2 = "";
                    if (id2 == null) {
                        id2 = "";
                    }
                    String name2 = chatPremiumTopicRemote2.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    String icon = chatPremiumTopicRemote2.getIcon();
                    if (icon != null) {
                        str2 = icon;
                    }
                    arrayList3.add(new ChatPremiumTopic(id2, name2, str2, chatPremiumTopicRemote2.getBackgroundColor()));
                }
                m7271constructorimpl = Result.m7271constructorimpl(FlowKt.flowOf(arrayList3));
                return !Result.m7277isFailureimpl(m7271constructorimpl) ? FlowKt.flowOf(CollectionsKt.emptyList()) : m7271constructorimpl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatTopicsRemoteDataSource = (ChatTopicsRemoteDataSource) this.L$1;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str3 = (String) obj;
        if (str3 != null) {
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = chatTopicsRemoteDataSource.getPremiumTopics(str3, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ArrayList arrayList4 = new ArrayList();
            while (r8.hasNext()) {
            }
            ArrayList<ChatPremiumTopicRemote> arrayList22 = arrayList4;
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
            while (r0.hasNext()) {
            }
            m7271constructorimpl = Result.m7271constructorimpl(FlowKt.flowOf(arrayList32));
            if (!Result.m7277isFailureimpl(m7271constructorimpl)) {
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
