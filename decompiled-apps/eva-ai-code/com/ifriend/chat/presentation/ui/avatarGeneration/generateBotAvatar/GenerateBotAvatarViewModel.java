package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import androidx.autofill.HintConstants;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.onboarding.analytics.OnboardingAnalyticsImpl;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: GenerateBotAvatarViewModel.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u0019J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0014J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "neuronsCostsStorage", "Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "logger", "Lcom/ifriend/common_utils/Logger;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lcom/ifriend/domain/storage/NeuronsCostsStorage;Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/domain/CoroutineDispatchers;)V", "createAvatar", "", "extractDescriptionOptionsFromConfig", "", "", "configString", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "init", "onCoroutineError", "throwable", "", "onDescriptionOptionClicked", "position", "", "setDescription", "text", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarViewModel extends BaseViewModel<GenerateBotAvatarState> {
    public static final int $stable = 8;
    private final AppConfigUseCase appConfigUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final BotRepository botRepository;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final Logger logger;
    private final NeuronsCostsStorage neuronsCostsStorage;
    private final PaymentResultFlow paymentResultFlow;
    private final RouterProvider router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GenerateBotAvatarViewModel(GenerateBotAvatarRepository generateBotAvatarRepository, BotRepository botRepository, AppConfigUseCase appConfigUseCase, NeuronsCostsStorage neuronsCostsStorage, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, RouterProvider router, Logger logger, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, CoroutineDispatchers dispatchers) {
        super(dispatchers, GenerateBotAvatarState.Companion.empty());
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(neuronsCostsStorage, "neuronsCostsStorage");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.botRepository = botRepository;
        this.appConfigUseCase = appConfigUseCase;
        this.neuronsCostsStorage = neuronsCostsStorage;
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
        this.router = router;
        this.logger = logger;
        this.appEventsEmitter = appEventsEmitter;
        this.paymentResultFlow = paymentResultFlow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.mvvm.BaseViewModel
    public void onCoroutineError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.logger.logException(throwable);
        changeState(GenerateBotAvatarViewModel$onCoroutineError$1.INSTANCE);
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getCoroutineErrorHandler(), null, new GenerateBotAvatarViewModel$init$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> extractDescriptionOptionsFromConfig(String str, Gender gender) {
        int i;
        try {
            String substring = str.substring(StringsKt.indexOf$default((CharSequence) str, gender == Gender.FEMALE ? OnboardingAnalyticsImpl.GENDER_FEMALE : OnboardingAnalyticsImpl.GENDER_MALE, 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = substring;
            int length = str2.length();
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (str2.charAt(i2) == '[') {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 1;
            String str3 = substring;
            int length2 = str3.length();
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                if (str3.charAt(i4) == ']') {
                    i = i4;
                    break;
                }
                i4++;
            }
            String substring2 = substring.substring(i3, i);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringsKt.split$default((CharSequence) substring2, new char[]{','}, false, 0, 6, (Object) null);
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    public final void setDescription(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        changeState(new GenerateBotAvatarViewModel$setDescription$1(text));
    }

    public final void onDescriptionOptionClicked(int i) {
        changeState(new GenerateBotAvatarViewModel$onDescriptionOptionClicked$1(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAvatar$updateLoadingState(GenerateBotAvatarViewModel generateBotAvatarViewModel, boolean z) {
        generateBotAvatarViewModel.changeState(new GenerateBotAvatarViewModel$createAvatar$updateLoadingState$1(z));
    }

    public final void createAvatar() {
        createAvatar$updateLoadingState(this, true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getCoroutineErrorHandler(), null, new GenerateBotAvatarViewModel$createAvatar$1(this, null), 2, null);
    }
}
