package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import androidx.autofill.HintConstants;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarState;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.storage.NeuronsCosts;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.useCases.AppConfigUseCase;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel$init$1", f = "GenerateBotAvatarViewModel.kt", i = {0}, l = {50}, m = "invokeSuspend", n = {HintConstants.AUTOFILL_HINT_GENDER}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GenerateBotAvatarViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarViewModel$init$1(GenerateBotAvatarViewModel generateBotAvatarViewModel, Continuation<? super GenerateBotAvatarViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = generateBotAvatarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateBotAvatarViewModel$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenerateBotAvatarViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        r5 = r4.this$0.extractDescriptionOptionsFromConfig(r5, r0);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BotRepository botRepository;
        Gender gender;
        AppConfigUseCase appConfigUseCase;
        Gender gender2;
        List emptyList;
        NeuronsCostsStorage neuronsCostsStorage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            botRepository = this.this$0.botRepository;
            Bot currentBot = botRepository.getCurrentBot();
            if (currentBot == null || (gender = currentBot.getGender()) == null) {
                gender = Gender.FEMALE;
            }
            appConfigUseCase = this.this$0.appConfigUseCase;
            this.L$0 = gender;
            this.label = 1;
            Object stringValue = appConfigUseCase.getStringValue("avatar_description_options", this);
            if (stringValue == coroutine_suspended) {
                return coroutine_suspended;
            }
            gender2 = gender;
            obj = stringValue;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            gender2 = (Gender) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null || emptyList == null) {
            emptyList = CollectionsKt.emptyList();
        }
        neuronsCostsStorage = this.this$0.neuronsCostsStorage;
        NeuronsCosts value = neuronsCostsStorage.getNeuronsCosts().getValue();
        this.this$0.changeState(new AnonymousClass1(gender2, emptyList, value != null ? new GenerateBotAvatarState.AvatarGenerationPrice(value.getAvatarCost(), value.getAvatarsCount()) : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GenerateBotAvatarViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel$init$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<GenerateBotAvatarState, GenerateBotAvatarState> {
        final /* synthetic */ GenerateBotAvatarState.AvatarGenerationPrice $avatarGenerationPrice;
        final /* synthetic */ List<String> $descriptionOptions;
        final /* synthetic */ Gender $gender;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Gender gender, List<String> list, GenerateBotAvatarState.AvatarGenerationPrice avatarGenerationPrice) {
            super(1);
            this.$gender = gender;
            this.$descriptionOptions = list;
            this.$avatarGenerationPrice = avatarGenerationPrice;
        }

        @Override // kotlin.jvm.functions.Function1
        public final GenerateBotAvatarState invoke(GenerateBotAvatarState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return GenerateBotAvatarState.copy$default(it, this.$gender, null, this.$descriptionOptions, this.$avatarGenerationPrice, false, false, 2, null);
        }
    }
}
