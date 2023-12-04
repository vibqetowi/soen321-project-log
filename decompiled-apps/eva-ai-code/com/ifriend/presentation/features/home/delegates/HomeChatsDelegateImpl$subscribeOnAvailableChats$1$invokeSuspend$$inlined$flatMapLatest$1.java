package com.ifriend.presentation.features.home.delegates;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.domain.newChat.chat.ChatClient;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1", f = "HomeChatsDelegate.kt", i = {0, 0, 1, 1}, l = {225, 226, 193}, m = "invokeSuspend", n = {"destination$iv$iv", "chat", "destination$iv$iv", "chat"}, s = {"L$1", "L$3", "L$1", "L$3"})
/* loaded from: classes6.dex */
public final class HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PersistentList<? extends HomeChatUi>>, List<? extends ChatInfo>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ HomeChatsDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, HomeChatsDelegateImpl homeChatsDelegateImpl) {
        super(3, continuation);
        this.this$0 = homeChatsDelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PersistentList<? extends HomeChatUi>> flowCollector, List<? extends ChatInfo> list, Continuation<? super Unit> continuation) {
        HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 = new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = list;
        return homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0115  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e0 -> B:25:0x00e6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00fe -> B:27:0x010e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        ArrayList arrayList;
        Iterator it;
        HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1;
        FlowCollector flowCollector2;
        Object obj2;
        ArrayList arrayList2;
        ChatInfo chatInfo;
        ArrayList arrayList3;
        Iterator it2;
        ChatClientInteractor chatClientInteractor;
        Object chatsClient;
        GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            List list = (List) this.L$1;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            it = list.iterator();
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 = this;
            if (!it.hasNext()) {
            }
        } else if (i == 1) {
            ChatInfo chatInfo2 = (ChatInfo) this.L$3;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            flowCollector2 = (FlowCollector) this.L$0;
            arrayList2 = (Collection) this.L$1;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 = this;
            arrayList3 = (Collection) this.L$4;
            it2 = (Iterator) this.L$2;
            chatInfo = chatInfo2;
            Flow flow = (Flow) obj2;
            chatClientInteractor = homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.this$0.chatClientInteractor;
            String chatId = chatInfo.getChatId();
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector2;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = arrayList2;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$2 = it2;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$3 = chatInfo;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$4 = arrayList3;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$5 = flow;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.label = 2;
            chatsClient = chatClientInteractor.getChatsClient(chatId, homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1);
            if (chatsClient != coroutine_suspended) {
            }
        } else if (i != 2) {
            if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            Flow flow2 = (Flow) this.L$5;
            chatInfo = (ChatInfo) this.L$3;
            ResultKt.throwOnFailure(obj);
            chatsClient = obj;
            flowCollector2 = (FlowCollector) this.L$0;
            ArrayList arrayList4 = (Collection) this.L$1;
            Iterator it3 = (Iterator) this.L$2;
            homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1 = this;
            ArrayList arrayList5 = (Collection) this.L$4;
            Flow flow3 = FlowKt.combine(flow2, ((ChatClient) chatsClient).getState(), new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1(homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.this$0, chatInfo, null));
            arrayList = arrayList5;
            it = it3;
            arrayList.add(flow3);
            arrayList = arrayList4;
            flowCollector = flowCollector2;
            if (!it.hasNext()) {
                ChatInfo chatInfo3 = (ChatInfo) it.next();
                if (ChatoptionsKt.isCanChatting(chatInfo3)) {
                    generatedChatAvatarInteractor = homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.this$0.generatedChatAvatarInteractor;
                    String chatId2 = chatInfo3.getChatId();
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = arrayList;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$2 = it;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$3 = chatInfo3;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$4 = arrayList;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$5 = null;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.label = 1;
                    obj2 = generatedChatAvatarInteractor.getGeneratedChatAvatarFlow(chatId2, homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowCollector2 = flowCollector;
                    it2 = it;
                    arrayList3 = arrayList;
                    chatInfo = chatInfo3;
                    arrayList2 = arrayList3;
                    Flow flow4 = (Flow) obj2;
                    chatClientInteractor = homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.this$0.chatClientInteractor;
                    String chatId3 = chatInfo.getChatId();
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector2;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = arrayList2;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$2 = it2;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$3 = chatInfo;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$4 = arrayList3;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$5 = flow4;
                    homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.label = 2;
                    chatsClient = chatClientInteractor.getChatsClient(chatId3, homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1);
                    if (chatsClient != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ArrayList arrayList6 = arrayList2;
                    it3 = it2;
                    flow2 = flow4;
                    arrayList4 = arrayList6;
                    arrayList5 = arrayList3;
                    Flow flow32 = FlowKt.combine(flow2, ((ChatClient) chatsClient).getState(), new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1(homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.this$0, chatInfo, null));
                    arrayList = arrayList5;
                    it = it3;
                    arrayList.add(flow32);
                    arrayList = arrayList4;
                    flowCollector = flowCollector2;
                    if (!it.hasNext()) {
                        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = null;
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = null;
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$2 = null;
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$3 = null;
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$4 = null;
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.L$5 = null;
                        homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.label = 3;
                        if (FlowKt.emitAll(flowCollector, new Flow<PersistentList<? extends HomeChatUi>>() { // from class: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super PersistentList<? extends HomeChatUi>> flowCollector3, Continuation continuation) {
                                Object combineInternal = CombineKt.combineInternal(flowCollector3, flowArr, new AnonymousClass2(flowArr), new AnonymousClass3(null), continuation);
                                return combineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : Unit.INSTANCE;
                            }

                            /* compiled from: Zip.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "invoke", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
                            /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1$2  reason: invalid class name */
                            /* loaded from: classes6.dex */
                            static final class AnonymousClass2 extends Lambda implements Function0<HomeChatUi[]> {
                                final /* synthetic */ Flow[] $flowArray;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(Flow[] flowArr) {
                                    super(0);
                                    this.$flowArray = flowArr;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final HomeChatUi[] invoke() {
                                    return new HomeChatUi[this.$flowArray.length];
                                }
                            }

                            /* compiled from: Zip.kt */
                            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1$3", f = "HomeChatsDelegate.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1$3  reason: invalid class name */
                            /* loaded from: classes6.dex */
                            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super PersistentList<? extends HomeChatUi>>, HomeChatUi[], Continuation<? super Unit>, Object> {
                                private /* synthetic */ Object L$0;
                                /* synthetic */ Object L$1;
                                int label;

                                public AnonymousClass3(Continuation continuation) {
                                    super(3, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(FlowCollector<? super PersistentList<? extends HomeChatUi>> flowCollector, HomeChatUi[] homeChatUiArr, Continuation<? super Unit> continuation) {
                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                                    anonymousClass3.L$0 = flowCollector;
                                    anonymousClass3.L$1 = homeChatUiArr;
                                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        PersistentList persistentList = ExtensionsKt.toPersistentList(ArraysKt.sortedWith((HomeChatUi[]) ((Object[]) this.L$1), 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0034: INVOKE  (r1v6 'persistentList' kotlinx.collections.immutable.PersistentList) = 
                                              (wrap: java.util.List : 0x002e: INVOKE  (r1v4 java.util.List A[REMOVE]) = 
                                              (wrap: com.ifriend.presentation.features.home.ui.models.HomeChatUi[] : 0x0025: CHECK_CAST (r1v3 com.ifriend.presentation.features.home.ui.models.HomeChatUi[] A[REMOVE]) = (com.ifriend.presentation.features.home.ui.models.HomeChatUi[]) (wrap: java.lang.Object[] : 0x0020: CHECK_CAST (r1v2 java.lang.Object[] A[REMOVE]) = (java.lang.Object[]) (wrap: java.lang.Object : 0x001e: IGET  (r1v1 java.lang.Object A[REMOVE]) = 
                                              (r5v0 'this' com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1$3 A[IMMUTABLE_TYPE, THIS])
                                             com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1.3.L$1 java.lang.Object)))
                                              (wrap: java.util.Comparator : 0x0029: CONSTRUCTOR  (r4v0 java.util.Comparator A[REMOVE]) =  call: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$lambda$1$$inlined$compareBy$1.<init>():void type: CONSTRUCTOR)
                                             type: STATIC call: kotlin.collections.ArraysKt.sortedWith(java.lang.Object[], java.util.Comparator):java.util.List)
                                             type: STATIC call: kotlinx.collections.immutable.ExtensionsKt.toPersistentList(java.lang.Iterable):kotlinx.collections.immutable.PersistentList in method: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1.3.invokeSuspend(java.lang.Object):java.lang.Object, file: classes6.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$lambda$1$$inlined$compareBy$1, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1036)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:837)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1036)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:837)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                                            	... 21 more
                                            */
                                        /*
                                            this = this;
                                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                            int r1 = r5.label
                                            r2 = 1
                                            if (r1 == 0) goto L17
                                            if (r1 != r2) goto Lf
                                            kotlin.ResultKt.throwOnFailure(r6)
                                            goto L41
                                        Lf:
                                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                            r6.<init>(r0)
                                            throw r6
                                        L17:
                                            kotlin.ResultKt.throwOnFailure(r6)
                                            java.lang.Object r6 = r5.L$0
                                            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                                            java.lang.Object r1 = r5.L$1
                                            java.lang.Object[] r1 = (java.lang.Object[]) r1
                                            r3 = r5
                                            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                            com.ifriend.presentation.features.home.ui.models.HomeChatUi[] r1 = (com.ifriend.presentation.features.home.ui.models.HomeChatUi[]) r1
                                            com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$lambda$1$$inlined$compareBy$1 r4 = new com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$lambda$1$$inlined$compareBy$1
                                            r4.<init>()
                                            java.util.Comparator r4 = (java.util.Comparator) r4
                                            java.util.List r1 = kotlin.collections.ArraysKt.sortedWith(r1, r4)
                                            java.lang.Iterable r1 = (java.lang.Iterable) r1
                                            kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.ExtensionsKt.toPersistentList(r1)
                                            r5.label = r2
                                            java.lang.Object r6 = r6.emit(r1, r3)
                                            if (r6 != r0) goto L41
                                            return r0
                                        L41:
                                            kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                            return r6
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$lambda$2$$inlined$combine$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }
                                }
                            }, homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        flowCollector2 = flowCollector;
                        arrayList4 = arrayList;
                        flow32 = FlowKt.flow(new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2(homeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1.this$0, chatInfo3, null));
                        arrayList.add(flow32);
                        arrayList = arrayList4;
                        flowCollector = flowCollector2;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
    }
