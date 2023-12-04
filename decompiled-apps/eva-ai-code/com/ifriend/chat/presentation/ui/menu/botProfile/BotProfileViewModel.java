package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.perf.util.Constants;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.avatarGeneration.OpenGenerateBotAvatarUseCase;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileState;
import com.ifriend.chat.presentation.ui.menu.botProfile.analytics.BotProfileAnalytics;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.BotVoice;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserKt;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.infrastructure.audio.player.MediaPlayerPlaybackController;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
/* compiled from: BotProfileViewModel.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0006\u0010#\u001a\u00020$J%\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010*J%\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010*J\b\u0010-\u001a\u00020$H\u0002J\u0006\u0010.\u001a\u00020$J\b\u0010/\u001a\u00020$H\u0002J\u0006\u00100\u001a\u00020$J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0014J\u0006\u00104\u001a\u00020$J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\"R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "logger", "Lcom/ifriend/common_utils/Logger;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "avatarAnimationEnabledStorage", "Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "animatedAvatarFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "openGenerateAvatarUseCase", "Lcom/ifriend/chat/domain/avatarGeneration/OpenGenerateBotAvatarUseCase;", "mediaPlayerPlaybackControllerGenerator", "Lcom/ifriend/data/socket/generator/MediaPlayerPlaybackControllerGenerator;", "getLevelInfoUseCase", "Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "context", "Landroid/content/Context;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/chat/domain/avatarGeneration/OpenGenerateBotAvatarUseCase;Lcom/ifriend/data/socket/generator/MediaPlayerPlaybackControllerGenerator;Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;Landroid/content/Context;Lcom/ifriend/domain/CoroutineDispatchers;)V", "avatarDataFetching", "Lkotlinx/coroutines/Job;", "avatarJob", "openAvatarButtonEnabled", "", "clickCreateNewAvatar", "", "collectState", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "user", "Lcom/ifriend/domain/models/profile/user/User;", "(Lcom/ifriend/domain/models/profile/bot/Bot;Lcom/ifriend/domain/models/profile/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createVoice", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Voice;", "disableAvatarFeature", "init", "loadAndPostAvatar", "onClickVoiceSample", "onCoroutineError", "throwable", "", "onDismiss", "setIsAvatarAnimationEnabled", Constants.ENABLE_DISABLE, "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotProfileViewModel extends BaseViewModel<BotProfileState> {
    public static final int $stable = 8;
    private final AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle;
    private final AvatarAnimationEnabledStorage avatarAnimationEnabledStorage;
    private Job avatarDataFetching;
    private Job avatarJob;
    private final Context context;
    private final FeatureToggleRepository featureToggleRepository;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final GetBotUseCase getBotUseCase;
    private final GetLevelInfoUseCase getLevelInfoUseCase;
    private final GetUserUseCase getUserUseCase;
    private final Logger logger;
    private final MediaPlayerPlaybackControllerGenerator mediaPlayerPlaybackControllerGenerator;
    private boolean openAvatarButtonEnabled;
    private final OpenGenerateBotAvatarUseCase openGenerateAvatarUseCase;
    private final RouterProvider router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BotProfileViewModel(Logger logger, GetBotUseCase getBotUseCase, GetUserUseCase getUserUseCase, RouterProvider router, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, FeatureToggleRepository featureToggleRepository, AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle, GenerateBotAvatarRepository generateBotAvatarRepository, OpenGenerateBotAvatarUseCase openGenerateAvatarUseCase, MediaPlayerPlaybackControllerGenerator mediaPlayerPlaybackControllerGenerator, GetLevelInfoUseCase getLevelInfoUseCase, Context context, CoroutineDispatchers dispatchers) {
        super(dispatchers, BotProfileState.Companion.initial(getLevelInfoUseCase.current()));
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(avatarAnimationEnabledStorage, "avatarAnimationEnabledStorage");
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        Intrinsics.checkNotNullParameter(animatedAvatarFeatureToggle, "animatedAvatarFeatureToggle");
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(openGenerateAvatarUseCase, "openGenerateAvatarUseCase");
        Intrinsics.checkNotNullParameter(mediaPlayerPlaybackControllerGenerator, "mediaPlayerPlaybackControllerGenerator");
        Intrinsics.checkNotNullParameter(getLevelInfoUseCase, "getLevelInfoUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.logger = logger;
        this.getBotUseCase = getBotUseCase;
        this.getUserUseCase = getUserUseCase;
        this.router = router;
        this.avatarAnimationEnabledStorage = avatarAnimationEnabledStorage;
        this.featureToggleRepository = featureToggleRepository;
        this.animatedAvatarFeatureToggle = animatedAvatarFeatureToggle;
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.openGenerateAvatarUseCase = openGenerateAvatarUseCase;
        this.mediaPlayerPlaybackControllerGenerator = mediaPlayerPlaybackControllerGenerator;
        this.getLevelInfoUseCase = getLevelInfoUseCase;
        this.context = context;
        this.openAvatarButtonEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.mvvm.BaseViewModel
    public void onCoroutineError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.logger.logException(throwable);
    }

    public final void init() {
        BotProfileViewModel botProfileViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(botProfileViewModel), null, null, new BotProfileViewModel$init$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(botProfileViewModel), getCoroutineErrorHandler(), null, new BotProfileViewModel$init$2(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(botProfileViewModel), getCoroutineErrorHandler(), null, new BotProfileViewModel$init$3(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectState(Bot bot, User user, Continuation<? super Unit> continuation) {
        if (bot != null) {
            Object suspendChangeState = suspendChangeState(new BotProfileViewModel$collectState$2(this, bot, user, null), continuation);
            return suspendChangeState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? suspendChangeState : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createVoice(Bot bot, User user, Continuation<? super BotProfileState.Voice> continuation) {
        BotProfileViewModel$createVoice$1 botProfileViewModel$createVoice$1;
        int i;
        BotProfileState.Voice voice;
        boolean z;
        String voicePreviewUrl;
        Object invoke;
        MediaPlayerPlaybackController mediaPlayerPlaybackController;
        BotVoiceConfig voiceConfig;
        if (continuation instanceof BotProfileViewModel$createVoice$1) {
            botProfileViewModel$createVoice$1 = (BotProfileViewModel$createVoice$1) continuation;
            if ((botProfileViewModel$createVoice$1.label & Integer.MIN_VALUE) != 0) {
                botProfileViewModel$createVoice$1.label -= Integer.MIN_VALUE;
                Object obj = botProfileViewModel$createVoice$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = botProfileViewModel$createVoice$1.label;
                voice = null;
                z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (bot.getGender() == Gender.NON_BINARY) {
                        return null;
                    }
                    BotVoice currentVoice = bot.getCurrentVoice();
                    voicePreviewUrl = BotVoiceViewModelKt.toVoicePreviewUrl(currentVoice != null ? currentVoice.getId() : null, this.context);
                    MediaPlayerPlaybackControllerGenerator mediaPlayerPlaybackControllerGenerator = this.mediaPlayerPlaybackControllerGenerator;
                    botProfileViewModel$createVoice$1.L$0 = bot;
                    botProfileViewModel$createVoice$1.L$1 = user;
                    botProfileViewModel$createVoice$1.L$2 = voicePreviewUrl;
                    botProfileViewModel$createVoice$1.label = 1;
                    invoke = mediaPlayerPlaybackControllerGenerator.invoke(botProfileViewModel$createVoice$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    user = (User) botProfileViewModel$createVoice$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    voicePreviewUrl = (String) botProfileViewModel$createVoice$1.L$2;
                    bot = (Bot) botProfileViewModel$createVoice$1.L$0;
                    invoke = obj;
                }
                mediaPlayerPlaybackController = (MediaPlayerPlaybackController) invoke;
                voiceConfig = bot.getVoiceConfig();
                if (voicePreviewUrl != null && voiceConfig != null) {
                    if (user != null || !UserKt.isPremium(user)) {
                        z = false;
                    }
                    voice = new BotProfileState.Voice(z, voicePreviewUrl, mediaPlayerPlaybackController, voiceConfig);
                }
                return voice;
            }
        }
        botProfileViewModel$createVoice$1 = new BotProfileViewModel$createVoice$1(this, continuation);
        Object obj2 = botProfileViewModel$createVoice$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = botProfileViewModel$createVoice$1.label;
        voice = null;
        z = true;
        if (i != 0) {
        }
        mediaPlayerPlaybackController = (MediaPlayerPlaybackController) invoke;
        voiceConfig = bot.getVoiceConfig();
        if (voicePreviewUrl != null) {
            if (user != null) {
            }
            z = false;
            voice = new BotProfileState.Voice(z, voicePreviewUrl, mediaPlayerPlaybackController, voiceConfig);
        }
        return voice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAndPostAvatar() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getCoroutineErrorHandler(), null, new BotProfileViewModel$loadAndPostAvatar$1(this, null), 2, null);
        this.avatarJob = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableAvatarFeature() {
        Job job = this.avatarJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        changeState(new BotProfileViewModel$disableAvatarFeature$1(this));
    }

    public final void onDismiss() {
        Job job = this.avatarDataFetching;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.avatarDataFetching = null;
        this.openAvatarButtonEnabled = true;
    }

    public final void clickCreateNewAvatar() {
        Job launch$default;
        if (this.openAvatarButtonEnabled) {
            this.openAvatarButtonEnabled = false;
            launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getCoroutineErrorHandler(), null, new BotProfileViewModel$clickCreateNewAvatar$1(this, null), 2, null);
            this.avatarDataFetching = launch$default;
        }
    }

    public final void onClickVoiceSample() {
        this.router.getRoute().navigateTo(BotVoiceScreen.INSTANCE);
    }

    public final void setIsAvatarAnimationEnabled(boolean z) {
        this.avatarAnimationEnabledStorage.setEnabled(z);
        BotProfileAnalytics.INSTANCE.trackClickAvatarPlayPause(z);
    }
}
