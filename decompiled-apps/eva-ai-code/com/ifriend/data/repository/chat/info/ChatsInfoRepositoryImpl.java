package com.ifriend.data.repository.chat.info;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.chat.models.ChatsRootRemote;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import com.ifriend.data.repository.chat.info.mapper.ChatInfoMapper;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import com.ifriend.domain.logic.chat.models.ChatPromote;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.models.profile.bot.Bot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J%\u0010!\u001a\u0002H\"\"\u0004\b\u0000\u0010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0$H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%J@\u0010!\u001a\u0002H\"\"\u0004\b\u0000\u0010\"2'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0(\u0012\u0006\u0012\u0004\u0018\u00010)0&¢\u0006\u0002\b*H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0014\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100/0.H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100.2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J \u00100\u001a\u0004\u0018\u00010\u00102\f\u00101\u001a\b\u0012\u0004\u0012\u00020 0/2\u0006\u00102\u001a\u000203H\u0002J\u0019\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J!\u00106\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u00108R'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/ifriend/data/repository/chat/info/ChatsInfoRepositoryImpl;", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "mainBotLocalDataSource", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "chatInfoMapper", "Lcom/ifriend/data/repository/chat/info/mapper/ChatInfoMapper;", "chatsRemoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/data/repository/chat/info/mapper/ChatInfoMapper;Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;)V", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "activateNewChat", "", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMainChat", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createMainChat", "mainBot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "chatConfig", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChat", "getChatFlow", "Lkotlinx/coroutines/flow/Flow;", "", "getMainChatInfo", "chatConfigs", "chat", "Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote$ChatRemote;", "refreshChats", "mainChatId", "updateChatName", "newName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsInfoRepositoryImpl implements ChatsInfoRepository, CoreExecuteCatching {
    private final Lazy cachedSource$delegate;
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final ChatInfoMapper chatInfoMapper;
    private final ChatsRemoteDataSource chatsRemoteDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final MainBotLocalDataSource mainBotLocalDataSource;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatsInfoRepositoryImpl(CoreExecuteCatching coreExecuteCatching, MainBotLocalDataSource mainBotLocalDataSource, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ChatInfoMapper chatInfoMapper, ChatsRemoteDataSource chatsRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(mainBotLocalDataSource, "mainBotLocalDataSource");
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(chatInfoMapper, "chatInfoMapper");
        Intrinsics.checkNotNullParameter(chatsRemoteDataSource, "chatsRemoteDataSource");
        this.coreExecuteCatching = coreExecuteCatching;
        this.mainBotLocalDataSource = mainBotLocalDataSource;
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.chatInfoMapper = chatInfoMapper;
        this.chatsRemoteDataSource = chatsRemoteDataSource;
        this.cachedSource$delegate = LazyKt.lazy(ChatsInfoRepositoryImpl$cachedSource$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, ChatInfo> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Flow<List<ChatInfo>> getChatFlow() {
        final Flow subscribe = getCachedSource().subscribe();
        return FlowKt.filterNotNull(new Flow<List<? extends ChatInfo>>() { // from class: com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$getChatFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ChatInfo>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$getChatFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$getChatFlow$$inlined$map$1$2", f = "ChatsInfoRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$getChatFlow$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj22);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List<Pair> list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (Pair pair : list) {
                                    arrayList.add((ChatInfo) pair.getSecond());
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended2) {
                                    return coroutine_suspended2;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj22);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj222 = anonymousClass1.result;
                    Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Flow<ChatInfo> getChatFlow(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return FlowKt.filterNotNull(getCachedSource().subscribeByKey(chatId));
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Object getChat(String str, Continuation<? super ChatInfo> continuation) {
        return executeInBackground(new ChatsInfoRepositoryImpl$getChat$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Object refreshChats(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsInfoRepositoryImpl$refreshChats$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
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
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[SYNTHETIC] */
    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object addMainChat(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$addMainChat$1
            if (r0 == 0) goto L14
            r0 = r11
            com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$addMainChat$1 r0 = (com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$addMainChat$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$addMainChat$1 r0 = new com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$addMainChat$1
            r0.<init>(r9, r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.throwOnFailure(r11)
            goto La2
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.L$2
            com.ifriend.domain.models.profile.bot.Bot r10 = (com.ifriend.domain.models.profile.bot.Bot) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl r4 = (com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl) r4
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L67
        L4a:
            kotlin.ResultKt.throwOnFailure(r11)
            com.ifriend.data.storages.bots.MainBotLocalDataSource r11 = r9.mainBotLocalDataSource
            com.ifriend.domain.models.profile.bot.Bot r11 = r11.getBot()
            if (r11 == 0) goto La5
            com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource r2 = r9.chatConfigsMemoryCachedSource
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r2 = r2.getChatConfigs(r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r4 = r9
        L67:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6f:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L88
            java.lang.Object r5 = r2.next()
            r7 = r5
            com.ifriend.domain.logic.chat.configuration.ChatConfig r7 = (com.ifriend.domain.logic.chat.configuration.ChatConfig) r7
            java.lang.String r7 = r7.getChatId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r10)
            if (r7 == 0) goto L6f
            goto L89
        L88:
            r5 = r6
        L89:
            com.ifriend.domain.logic.chat.configuration.ChatConfig r5 = (com.ifriend.domain.logic.chat.configuration.ChatConfig) r5
            com.ifriend.domain.logic.chat.models.ChatInfo r11 = r4.createMainChat(r10, r11, r5)
            com.ifriend.data.common.InMemoryCachedSource r2 = r4.getCachedSource()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r10 = r2.replace(r10, r11, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        La5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl.addMainChat(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatInfo getMainChatInfo(List<ChatConfig> list, ChatsRootRemote.ChatRemote chatRemote) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChatConfig) obj).isMainBot()) {
                break;
            }
        }
        ChatConfig chatConfig = (ChatConfig) obj;
        Bot bot = this.mainBotLocalDataSource.getBot();
        if (bot == null) {
            if (chatConfig != null) {
                return this.chatInfoMapper.map(chatRemote, chatConfig);
            }
            return null;
        }
        String chatId = chatRemote.getChatId();
        if (chatId == null) {
            chatId = "";
        }
        return createMainChat(chatId, bot, chatConfig);
    }

    private final ChatInfo createMainChat(String str, Bot bot, ChatConfig chatConfig) {
        ChatConfig.Images images;
        String str2 = (chatConfig == null || (r0 = chatConfig.getId()) == null) ? "main" : "main";
        String name = bot.getName();
        String str3 = name == null ? "" : name;
        String roundAvatarUrl = (chatConfig == null || (images = chatConfig.getImages()) == null) ? null : images.getRoundAvatarUrl();
        return new ChatInfo(str2, str, ChatType.MAIN, str3, roundAvatarUrl == null ? "" : roundAvatarUrl, ChatPaymentStatus.Free.INSTANCE, CollectionsKt.emptyList(), CollectionsKt.emptyList(), new ChatPromote(false, 0));
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Object updateChatName(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsInfoRepositoryImpl$updateChatName$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Object activateNewChat(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsInfoRepositoryImpl$activateNewChat$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatsInfoRepository
    public Object clear(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatsInfoRepositoryImpl$clear$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
