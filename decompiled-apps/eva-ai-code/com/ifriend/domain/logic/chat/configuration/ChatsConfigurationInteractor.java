package com.ifriend.domain.logic.chat.configuration;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsConfigurationInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000e\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;)V", "getChatConfigurationByUid", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "uid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatConfigurationFlow", "Lkotlinx/coroutines/flow/Flow;", "chatId", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsConfigurationInteractor {
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final ChatsInfoRepository chatsInfoRepository;

    @Inject
    public ChatsConfigurationInteractor(ChatsInfoRepository chatsInfoRepository, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        this.chatsInfoRepository = chatsInfoRepository;
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatConfigurationFlow(String str, Continuation<? super Flow<ChatsConfiguration>> continuation) {
        ChatsConfigurationInteractor$getChatConfigurationFlow$1 chatsConfigurationInteractor$getChatConfigurationFlow$1;
        int i;
        Flow<ChatInfo> chatFlow;
        if (continuation instanceof ChatsConfigurationInteractor$getChatConfigurationFlow$1) {
            chatsConfigurationInteractor$getChatConfigurationFlow$1 = (ChatsConfigurationInteractor$getChatConfigurationFlow$1) continuation;
            if ((chatsConfigurationInteractor$getChatConfigurationFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatsConfigurationInteractor$getChatConfigurationFlow$1.label -= Integer.MIN_VALUE;
                Object obj2 = chatsConfigurationInteractor$getChatConfigurationFlow$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsConfigurationInteractor$getChatConfigurationFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    chatFlow = this.chatsInfoRepository.getChatFlow(str);
                    ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource = this.chatConfigsMemoryCachedSource;
                    chatsConfigurationInteractor$getChatConfigurationFlow$1.L$0 = chatFlow;
                    chatsConfigurationInteractor$getChatConfigurationFlow$1.label = 1;
                    obj2 = chatConfigsMemoryCachedSource.getChatConfigsFlow(chatsConfigurationInteractor$getChatConfigurationFlow$1);
                    if (obj2 == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatFlow = (Flow) chatsConfigurationInteractor$getChatConfigurationFlow$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                }
                return FlowKt.combine(chatFlow, (Flow) obj2, new ChatsConfigurationInteractor$getChatConfigurationFlow$2(null));
            }
        }
        chatsConfigurationInteractor$getChatConfigurationFlow$1 = new ChatsConfigurationInteractor$getChatConfigurationFlow$1(this, continuation);
        Object obj22 = chatsConfigurationInteractor$getChatConfigurationFlow$1.result;
        Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsConfigurationInteractor$getChatConfigurationFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.combine(chatFlow, (Flow) obj22, new ChatsConfigurationInteractor$getChatConfigurationFlow$2(null));
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getChatConfigurationByUid(java.lang.String r8, kotlin.coroutines.Continuation<? super com.ifriend.domain.logic.chat.configuration.ChatsConfiguration> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor$getChatConfigurationByUid$1
            if (r0 == 0) goto L14
            r0 = r9
            com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor$getChatConfigurationByUid$1 r0 = (com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor$getChatConfigurationByUid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor$getChatConfigurationByUid$1 r0 = new com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor$getChatConfigurationByUid$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.L$0
            com.ifriend.domain.logic.chat.configuration.ChatConfig r8 = (com.ifriend.domain.logic.chat.configuration.ChatConfig) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L91
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor r2 = (com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L59
        L46:
            kotlin.ResultKt.throwOnFailure(r9)
            com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource r9 = r7.chatConfigsMemoryCachedSource
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.getChatConfigs(r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L5f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r9.next()
            r6 = r4
            com.ifriend.domain.logic.chat.configuration.ChatConfig r6 = (com.ifriend.domain.logic.chat.configuration.ChatConfig) r6
            java.lang.String r6 = r6.getId()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r6 == 0) goto L5f
            goto L78
        L77:
            r4 = r5
        L78:
            r8 = r4
            com.ifriend.domain.logic.chat.configuration.ChatConfig r8 = (com.ifriend.domain.logic.chat.configuration.ChatConfig) r8
            if (r8 != 0) goto L7e
            return r5
        L7e:
            com.ifriend.domain.data.chat.ChatsInfoRepository r9 = r2.chatsInfoRepository
            java.lang.String r2 = r8.getChatId()
            r0.L$0 = r8
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r9.getChat(r2, r0)
            if (r9 != r1) goto L91
            return r1
        L91:
            com.ifriend.domain.logic.chat.models.ChatInfo r9 = (com.ifriend.domain.logic.chat.models.ChatInfo) r9
            if (r9 != 0) goto L96
            return r5
        L96:
            com.ifriend.domain.logic.chat.configuration.ChatsConfiguration r0 = new com.ifriend.domain.logic.chat.configuration.ChatsConfiguration
            r0.<init>(r9, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor.getChatConfigurationByUid(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
