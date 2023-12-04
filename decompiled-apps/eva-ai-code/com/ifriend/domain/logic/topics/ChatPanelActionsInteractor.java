package com.ifriend.domain.logic.topics;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.data.topics.ChatPremiumTopicsRepository;
import com.ifriend.domain.data.topics.ChatTopicsRepository;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase;
import com.ifriend.domain.logic.topics.models.ChatPremiumTopic;
import com.ifriend.domain.logic.topics.models.ChatTopic;
import com.ifriend.domain.logic.topics.models.PremiumTopicPopup;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.useCases.diary.DiaryNotesService;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatPanelActionsInteractor.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J \u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d0\u00162\u0006\u0010\u0011\u001a\u00020\u0010J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u0010\"\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;", "", "topicsRepository", "Lcom/ifriend/domain/data/topics/ChatTopicsRepository;", "premiumTopicsRepository", "Lcom/ifriend/domain/data/topics/ChatPremiumTopicsRepository;", "diaryNotesService", "Lcom/ifriend/domain/useCases/diary/DiaryNotesService;", "getLevelInfoUseCase", "Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "isChatFeatureAvailableUseCase", "Lcom/ifriend/domain/logic/experiments/IsChatFeatureAvailableUseCase;", "(Lcom/ifriend/domain/data/topics/ChatTopicsRepository;Lcom/ifriend/domain/data/topics/ChatPremiumTopicsRepository;Lcom/ifriend/domain/useCases/diary/DiaryNotesService;Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;Lcom/ifriend/domain/logic/experiments/IsChatFeatureAvailableUseCase;)V", "activatePremiumTopic", "Lcom/ifriend/domain/logic/topics/models/PremiumTopicPopup;", "topicId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activateTopic", "", "getChatPremiumTopicFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/topics/models/ChatPremiumTopic;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatTopicFlow", "Lcom/ifriend/domain/logic/topics/models/ChatTopic;", "getDiaryInfo", "Lkotlin/Pair;", "", "isDiaryFeatureAvailable", "isPremiumFeatureAvailable", "isTopicsFeatureAvailable", "refreshActions", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPanelActionsInteractor {
    public static final Companion Companion = new Companion(null);
    private static final int MIN_LEVEL_FOR_TOPICS = 2;
    private final DiaryNotesService diaryNotesService;
    private final GetLevelInfoUseCase getLevelInfoUseCase;
    private final IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase;
    private final ChatPremiumTopicsRepository premiumTopicsRepository;
    private final ChatTopicsRepository topicsRepository;

    @Inject
    public ChatPanelActionsInteractor(ChatTopicsRepository topicsRepository, ChatPremiumTopicsRepository premiumTopicsRepository, DiaryNotesService diaryNotesService, GetLevelInfoUseCase getLevelInfoUseCase, IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase) {
        Intrinsics.checkNotNullParameter(topicsRepository, "topicsRepository");
        Intrinsics.checkNotNullParameter(premiumTopicsRepository, "premiumTopicsRepository");
        Intrinsics.checkNotNullParameter(diaryNotesService, "diaryNotesService");
        Intrinsics.checkNotNullParameter(getLevelInfoUseCase, "getLevelInfoUseCase");
        Intrinsics.checkNotNullParameter(isChatFeatureAvailableUseCase, "isChatFeatureAvailableUseCase");
        this.topicsRepository = topicsRepository;
        this.premiumTopicsRepository = premiumTopicsRepository;
        this.diaryNotesService = diaryNotesService;
        this.getLevelInfoUseCase = getLevelInfoUseCase;
        this.isChatFeatureAvailableUseCase = isChatFeatureAvailableUseCase;
    }

    /* compiled from: ChatPanelActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor$Companion;", "", "()V", "MIN_LEVEL_FOR_TOPICS", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final Object isDiaryFeatureAvailable(String str, Continuation<? super Flow<Boolean>> continuation) {
        return this.isChatFeatureAvailableUseCase.execute(str, FeatureToggleKey.DIARY_ENABLED, continuation);
    }

    public final Object isTopicsFeatureAvailable(String str, Continuation<? super Flow<Boolean>> continuation) {
        return this.isChatFeatureAvailableUseCase.execute(str, FeatureToggleKey.TOPICS_ENABLED, continuation);
    }

    public final Object isPremiumFeatureAvailable(String str, Continuation<? super Flow<Boolean>> continuation) {
        return this.isChatFeatureAvailableUseCase.execute(str, FeatureToggleKey.PREMIUM_TOPICS_ENABLED, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatTopicFlow(String str, Continuation<? super Flow<? extends List<ChatTopic>>> continuation) {
        ChatPanelActionsInteractor$getChatTopicFlow$1 chatPanelActionsInteractor$getChatTopicFlow$1;
        Object coroutine_suspended;
        int i;
        ChatPanelActionsInteractor chatPanelActionsInteractor;
        Object topicsFlow;
        Flow flow;
        if (continuation instanceof ChatPanelActionsInteractor$getChatTopicFlow$1) {
            chatPanelActionsInteractor$getChatTopicFlow$1 = (ChatPanelActionsInteractor$getChatTopicFlow$1) continuation;
            if ((chatPanelActionsInteractor$getChatTopicFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatPanelActionsInteractor$getChatTopicFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatPanelActionsInteractor$getChatTopicFlow$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPanelActionsInteractor$getChatTopicFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GetLevelInfoUseCase getLevelInfoUseCase = this.getLevelInfoUseCase;
                    chatPanelActionsInteractor$getChatTopicFlow$1.L$0 = this;
                    chatPanelActionsInteractor$getChatTopicFlow$1.L$1 = str;
                    chatPanelActionsInteractor$getChatTopicFlow$1.label = 1;
                    obj = getLevelInfoUseCase.flow(chatPanelActionsInteractor$getChatTopicFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatPanelActionsInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        flow = (Flow) chatPanelActionsInteractor$getChatTopicFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return FlowKt.combine(flow, FlowKt.filterNotNull((Flow) obj), new ChatPanelActionsInteractor$getChatTopicFlow$2(null));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatPanelActionsInteractor$getChatTopicFlow$1.L$1;
                    chatPanelActionsInteractor = (ChatPanelActionsInteractor) chatPanelActionsInteractor$getChatTopicFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Flow flow2 = (Flow) obj;
                ChatTopicsRepository chatTopicsRepository = chatPanelActionsInteractor.topicsRepository;
                chatPanelActionsInteractor$getChatTopicFlow$1.L$0 = flow2;
                chatPanelActionsInteractor$getChatTopicFlow$1.L$1 = null;
                chatPanelActionsInteractor$getChatTopicFlow$1.label = 2;
                topicsFlow = chatTopicsRepository.getTopicsFlow(str, chatPanelActionsInteractor$getChatTopicFlow$1);
                if (topicsFlow != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = topicsFlow;
                flow = flow2;
                return FlowKt.combine(flow, FlowKt.filterNotNull((Flow) obj), new ChatPanelActionsInteractor$getChatTopicFlow$2(null));
            }
        }
        chatPanelActionsInteractor$getChatTopicFlow$1 = new ChatPanelActionsInteractor$getChatTopicFlow$1(this, continuation);
        Object obj2 = chatPanelActionsInteractor$getChatTopicFlow$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPanelActionsInteractor$getChatTopicFlow$1.label;
        if (i != 0) {
        }
        Flow flow22 = (Flow) obj2;
        ChatTopicsRepository chatTopicsRepository2 = chatPanelActionsInteractor.topicsRepository;
        chatPanelActionsInteractor$getChatTopicFlow$1.L$0 = flow22;
        chatPanelActionsInteractor$getChatTopicFlow$1.L$1 = null;
        chatPanelActionsInteractor$getChatTopicFlow$1.label = 2;
        topicsFlow = chatTopicsRepository2.getTopicsFlow(str, chatPanelActionsInteractor$getChatTopicFlow$1);
        if (topicsFlow != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatPremiumTopicFlow(String str, Continuation<? super Flow<? extends List<ChatPremiumTopic>>> continuation) {
        ChatPanelActionsInteractor$getChatPremiumTopicFlow$1 chatPanelActionsInteractor$getChatPremiumTopicFlow$1;
        int i;
        if (continuation instanceof ChatPanelActionsInteractor$getChatPremiumTopicFlow$1) {
            chatPanelActionsInteractor$getChatPremiumTopicFlow$1 = (ChatPanelActionsInteractor$getChatPremiumTopicFlow$1) continuation;
            if ((chatPanelActionsInteractor$getChatPremiumTopicFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatPanelActionsInteractor$getChatPremiumTopicFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatPanelActionsInteractor$getChatPremiumTopicFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPanelActionsInteractor$getChatPremiumTopicFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatPremiumTopicsRepository chatPremiumTopicsRepository = this.premiumTopicsRepository;
                    chatPanelActionsInteractor$getChatPremiumTopicFlow$1.label = 1;
                    obj = chatPremiumTopicsRepository.getTopicFlow(str, chatPanelActionsInteractor$getChatPremiumTopicFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.filterNotNull((Flow) obj);
            }
        }
        chatPanelActionsInteractor$getChatPremiumTopicFlow$1 = new ChatPanelActionsInteractor$getChatPremiumTopicFlow$1(this, continuation);
        Object obj2 = chatPanelActionsInteractor$getChatPremiumTopicFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPanelActionsInteractor$getChatPremiumTopicFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.filterNotNull((Flow) obj2);
    }

    public final Flow<Pair<Boolean, Boolean>> getDiaryInfo(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        final Flow allNotes$default = DiaryNotesService.getAllNotes$default(this.diaryNotesService, false, 1, null);
        final Flow<List<? extends DiaryNote>> flow = new Flow<List<? extends DiaryNote>>() { // from class: com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends DiaryNote>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$1$2", f = "ChatPanelActionsInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$1$2$1  reason: invalid class name */
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
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) ((Resource) obj).getData();
                                if (list == null) {
                                    list = CollectionsKt.emptyList();
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return (Flow) new Flow<Pair<? extends Boolean, ? extends Boolean>>() { // from class: com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Pair<? extends Boolean, ? extends Boolean>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$2$2", f = "ChatPanelActionsInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getDiaryInfo$$inlined$map$2$2$1  reason: invalid class name */
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
                    List list;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Boolean boxBoolean = Boxing.boxBoolean(!list.isEmpty());
                                List list2 = (List) obj;
                                boolean z = false;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        } else if (!((DiaryNote) it.next()).isShown()) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                Pair pair = TuplesKt.to(boxBoolean, Boxing.boxBoolean(z));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(pair, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Object refreshActions(String str, Continuation<? super Unit> continuation) {
        Object supervisorScope = SupervisorKt.supervisorScope(new ChatPanelActionsInteractor$refreshActions$2(this, str, null), continuation);
        return supervisorScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? supervisorScope : Unit.INSTANCE;
    }

    public final Object activateTopic(String str, String str2, Continuation<? super Unit> continuation) {
        Object activateTopic = this.topicsRepository.activateTopic(str, str2, continuation);
        return activateTopic == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? activateTopic : Unit.INSTANCE;
    }

    public final Object activatePremiumTopic(String str, String str2, Continuation<? super PremiumTopicPopup> continuation) {
        return this.premiumTopicsRepository.activateTopic(str, str2, continuation);
    }
}
