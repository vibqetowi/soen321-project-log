package com.ifriend.domain.logic.chat.avatart;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.avatar.VideoAvatar;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GeneratedChatAvatarInteractor.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ4\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;", "", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "avatarAnimationEnabledStorage", "Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "(Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;)V", "getAvatarState", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "isGeneratedAvatarEnabled", "", "avatar", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "isAnimationEnabled", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getGeneratedChatAvatarFlow", "Lkotlinx/coroutines/flow/Flow;", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratedChatAvatarInteractor {
    private final AvatarAnimationEnabledStorage avatarAnimationEnabledStorage;
    private final BotRepository botRepository;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FeatureToggleRepository featureToggleRepository;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;

    @Inject
    public GeneratedChatAvatarInteractor(BotRepository botRepository, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, ChatsInfoInteractor chatsInfoInteractor, GenerateBotAvatarRepository generateBotAvatarRepository, FeatureToggleRepository featureToggleRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(avatarAnimationEnabledStorage, "avatarAnimationEnabledStorage");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        this.botRepository = botRepository;
        this.avatarAnimationEnabledStorage = avatarAnimationEnabledStorage;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.featureToggleRepository = featureToggleRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGeneratedChatAvatarFlow(String str, Continuation<? super Flow<? extends GeneratedChatAvatar>> continuation) {
        GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1 generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1;
        Object coroutine_suspended;
        int i;
        Flow<Gender> flow;
        GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
        Object isFeatureEnabledFlow;
        Flow flow2;
        Flow<Gender> flow3;
        GeneratedChatAvatarInteractor generatedChatAvatarInteractor2;
        String str2;
        if (continuation instanceof GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1) {
            generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1 = (GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1) continuation;
            if ((generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label & Integer.MIN_VALUE) != 0) {
                generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label -= Integer.MIN_VALUE;
                Object obj = generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Bot> bot = this.botRepository.getBot();
                    flow = new Flow<Gender>() { // from class: com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Gender> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$map$1$2  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$map$1$2", f = "GeneratedChatAvatarInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            /* renamed from: com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$map$1$2$1  reason: invalid class name */
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
                                            Bot bot = (Bot) obj;
                                            Gender gender = bot != null ? bot.getGender() : null;
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(gender, anonymousClass1) == coroutine_suspended) {
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
                    FeatureToggleRepository featureToggleRepository = this.featureToggleRepository;
                    FeatureToggleKey featureToggleKey = FeatureToggleKey.GENERATE_AI_PHOTOS;
                    generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$0 = this;
                    generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$1 = str;
                    generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$2 = flow;
                    generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label = 1;
                    obj = featureToggleRepository.isFeatureEnabledFlow(featureToggleKey, generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    generatedChatAvatarInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        str2 = (String) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$1;
                        generatedChatAvatarInteractor2 = (GeneratedChatAvatarInteractor) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        flow2 = (Flow) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$3;
                        flow3 = (Flow) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$2;
                        return FlowKt.combine(flow3, flow2, FlowKt.transformLatest((Flow) obj, new GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1(null, generatedChatAvatarInteractor2)), generatedChatAvatarInteractor2.avatarAnimationEnabledStorage.isEnabledFlow(), generatedChatAvatarInteractor2.chatsInfoInteractor.getChatsInfoFlow(str2), new GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$4(generatedChatAvatarInteractor2));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    String str3 = (String) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$1;
                    generatedChatAvatarInteractor = (GeneratedChatAvatarInteractor) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    flow = (Flow) generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$2;
                    str = str3;
                }
                Flow flow4 = (Flow) obj;
                FeatureToggleRepository featureToggleRepository2 = generatedChatAvatarInteractor.featureToggleRepository;
                FeatureToggleKey featureToggleKey2 = FeatureToggleKey.GENERATE_AI_PHOTOS;
                generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$0 = generatedChatAvatarInteractor;
                generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$1 = str;
                generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$2 = flow;
                generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$3 = flow4;
                generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label = 2;
                isFeatureEnabledFlow = featureToggleRepository2.isFeatureEnabledFlow(featureToggleKey2, generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1);
                if (isFeatureEnabledFlow != coroutine_suspended) {
                    return coroutine_suspended;
                }
                flow2 = flow4;
                obj = isFeatureEnabledFlow;
                flow3 = flow;
                generatedChatAvatarInteractor2 = generatedChatAvatarInteractor;
                str2 = str;
                return FlowKt.combine(flow3, flow2, FlowKt.transformLatest((Flow) obj, new GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1(null, generatedChatAvatarInteractor2)), generatedChatAvatarInteractor2.avatarAnimationEnabledStorage.isEnabledFlow(), generatedChatAvatarInteractor2.chatsInfoInteractor.getChatsInfoFlow(str2), new GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$4(generatedChatAvatarInteractor2));
            }
        }
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1 = new GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1(this, continuation);
        Object obj2 = generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label;
        if (i != 0) {
        }
        Flow flow42 = (Flow) obj2;
        FeatureToggleRepository featureToggleRepository22 = generatedChatAvatarInteractor.featureToggleRepository;
        FeatureToggleKey featureToggleKey22 = FeatureToggleKey.GENERATE_AI_PHOTOS;
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$0 = generatedChatAvatarInteractor;
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$1 = str;
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$2 = flow;
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.L$3 = flow42;
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1.label = 2;
        isFeatureEnabledFlow = featureToggleRepository22.isFeatureEnabledFlow(featureToggleKey22, generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$1);
        if (isFeatureEnabledFlow != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeneratedChatAvatar getAvatarState(Gender gender, boolean z, GeneratedAvatar generatedAvatar, boolean z2, ChatInfo chatInfo) {
        boolean z3 = (generatedAvatar != null ? generatedAvatar.getVideoAvatar() : null) instanceof VideoAvatar.Generating;
        VideoAvatar videoAvatar = generatedAvatar != null ? generatedAvatar.getVideoAvatar() : null;
        VideoAvatar.Generated generated = videoAvatar instanceof VideoAvatar.Generated ? (VideoAvatar.Generated) videoAvatar : null;
        String videoUri = generated != null ? generated.getVideoUri() : null;
        String imageAvatarUri = generatedAvatar != null ? generatedAvatar.getImageAvatarUri() : null;
        if (imageAvatarUri == null) {
            imageAvatarUri = "";
        }
        String id = generatedAvatar != null ? generatedAvatar.getId() : null;
        if (id == null) {
            id = "";
        }
        if (!chatInfo.isMain()) {
            return new GeneratedChatAvatar.ImageAvatar(id, chatInfo.getRoundAvatarUrl());
        }
        if (z || gender == Gender.FEMALE) {
            if (z) {
                if (z3) {
                    return new GeneratedChatAvatar.VideoAvatar(id, imageAvatarUri, "", GeneratedChatAvatar.VideoAvatar.GeneratingState.GENERATING);
                }
                if (generatedAvatar == null || generatedAvatar.isEmpty()) {
                    return new GeneratedChatAvatar.ImageAvatar(id, imageAvatarUri);
                }
                if (videoUri != null && z2) {
                    return new GeneratedChatAvatar.VideoAvatar(id, imageAvatarUri, videoUri, GeneratedChatAvatar.VideoAvatar.GeneratingState.READY);
                }
                return new GeneratedChatAvatar.ImageAvatar(id, imageAvatarUri);
            }
            return new GeneratedChatAvatar.ImageAvatar(id, chatInfo.getRoundAvatarUrl());
        }
        return GeneratedChatAvatar.Empty.INSTANCE;
    }
}
