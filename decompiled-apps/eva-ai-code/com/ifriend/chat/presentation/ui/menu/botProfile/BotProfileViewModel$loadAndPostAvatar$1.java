package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileState;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.avatar.VideoAvatar;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotProfileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$loadAndPostAvatar$1", f = "BotProfileViewModel.kt", i = {1, 2}, l = {TsExtractor.TS_STREAM_TYPE_DTS, 142, 144, 157}, m = "invokeSuspend", n = {"isGenerating", "isGenerating"}, s = {"I$0", "I$0"})
/* loaded from: classes6.dex */
public final class BotProfileViewModel$loadAndPostAvatar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BotProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfileViewModel$loadAndPostAvatar$1(BotProfileViewModel botProfileViewModel, Continuation<? super BotProfileViewModel$loadAndPostAvatar$1> continuation) {
        super(2, continuation);
        this.this$0 = botProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotProfileViewModel$loadAndPostAvatar$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotProfileViewModel$loadAndPostAvatar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        GenerateBotAvatarRepository generateBotAvatarRepository;
        GenerateBotAvatarRepository generateBotAvatarRepository2;
        int i;
        Flow flow;
        AvatarAnimationEnabledStorage avatarAnimationEnabledStorage;
        AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle;
        Object isEnabled;
        Flow flow2;
        Flow flow3;
        BotProfileViewModel botProfileViewModel;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.logException(e);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
            this.label = 1;
            obj = generateBotAvatarRepository.getGenerationStatus(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                flow2 = (Flow) this.L$1;
                flow = (Flow) this.L$0;
                ResultKt.throwOnFailure(obj);
                flow3 = (Flow) obj;
                botProfileViewModel = this.this$0;
                z = i != 0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (FlowKt.collect(FlowKt.combine(flow, flow2, flow3, new AnonymousClass1(botProfileViewModel, z, null)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            flow = (Flow) obj;
            avatarAnimationEnabledStorage = this.this$0.avatarAnimationEnabledStorage;
            StateFlow<Boolean> isEnabledFlow = avatarAnimationEnabledStorage.isEnabledFlow();
            animatedAvatarFeatureToggle = this.this$0.animatedAvatarFeatureToggle;
            this.L$0 = flow;
            this.L$1 = isEnabledFlow;
            this.I$0 = i;
            this.label = 3;
            isEnabled = animatedAvatarFeatureToggle.isEnabled(this);
            if (isEnabled != coroutine_suspended) {
                return coroutine_suspended;
            }
            flow2 = isEnabledFlow;
            obj = isEnabled;
            flow3 = (Flow) obj;
            botProfileViewModel = this.this$0;
            if (i != 0) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
            if (FlowKt.collect(FlowKt.combine(flow, flow2, flow3, new AnonymousClass1(botProfileViewModel, z, null)), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        int i3 = ((AvatarGenerationStatus) obj) == AvatarGenerationStatus.PROCESSING ? 1 : 0;
        generateBotAvatarRepository2 = this.this$0.generateBotAvatarRepository;
        this.I$0 = i3;
        this.label = 2;
        Object currentAvatar$default = GenerateBotAvatarRepository.DefaultImpls.getCurrentAvatar$default(generateBotAvatarRepository2, false, this, 1, null);
        if (currentAvatar$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = i3;
        obj = currentAvatar$default;
        flow = (Flow) obj;
        avatarAnimationEnabledStorage = this.this$0.avatarAnimationEnabledStorage;
        StateFlow<Boolean> isEnabledFlow2 = avatarAnimationEnabledStorage.isEnabledFlow();
        animatedAvatarFeatureToggle = this.this$0.animatedAvatarFeatureToggle;
        this.L$0 = flow;
        this.L$1 = isEnabledFlow2;
        this.I$0 = i;
        this.label = 3;
        isEnabled = animatedAvatarFeatureToggle.isEnabled(this);
        if (isEnabled != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BotProfileViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "avatar", "", "isAnimationEnabled", "isAnimationFeatureEnabled", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$loadAndPostAvatar$1$1", f = "BotProfileViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$loadAndPostAvatar$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function4<GeneratedAvatar, Boolean, Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isGenerating;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;
        final /* synthetic */ BotProfileViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BotProfileViewModel botProfileViewModel, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
            this.this$0 = botProfileViewModel;
            this.$isGenerating = z;
        }

        public final Object invoke(GeneratedAvatar generatedAvatar, boolean z, boolean z2, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isGenerating, continuation);
            anonymousClass1.L$0 = generatedAvatar;
            anonymousClass1.Z$0 = z;
            anonymousClass1.Z$1 = z2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(GeneratedAvatar generatedAvatar, Boolean bool, Boolean bool2, Continuation<? super Unit> continuation) {
            return invoke(generatedAvatar, bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.changeState(new C01231((GeneratedAvatar) this.L$0, this.$isGenerating, this.Z$0, this.Z$1));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BotProfileViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$loadAndPostAvatar$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01231 extends Lambda implements Function1<BotProfileState, BotProfileState> {
            final /* synthetic */ GeneratedAvatar $avatar;
            final /* synthetic */ boolean $isAnimationEnabled;
            final /* synthetic */ boolean $isAnimationFeatureEnabled;
            final /* synthetic */ boolean $isGenerating;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01231(GeneratedAvatar generatedAvatar, boolean z, boolean z2, boolean z3) {
                super(1);
                this.$avatar = generatedAvatar;
                this.$isGenerating = z;
                this.$isAnimationEnabled = z2;
                this.$isAnimationFeatureEnabled = z3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BotProfileState invoke(BotProfileState state) {
                BotProfileState copy;
                Intrinsics.checkNotNullParameter(state, "state");
                GeneratedAvatar generatedAvatar = this.$avatar;
                copy = state.copy((r18 & 1) != 0 ? state.name : null, (r18 & 2) != 0 ? state.age : null, (r18 & 4) != 0 ? state.gender : null, (r18 & 8) != 0 ? state.ethnicity : null, (r18 & 16) != 0 ? state.personality : null, (r18 & 32) != 0 ? state.avatarState : new BotProfileState.AvatarState(generatedAvatar, this.$isGenerating, this.$isAnimationEnabled, this.$isAnimationFeatureEnabled, generatedAvatar.getVideoAvatar() instanceof VideoAvatar.Generating, this.$avatar.isEmpty()), (r18 & 64) != 0 ? state.voice : null, (r18 & 128) != 0 ? state.levelInfo : null);
                return copy;
            }
        }
    }
}
