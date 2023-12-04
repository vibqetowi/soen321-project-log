package com.ifriend.chat.presentation.di;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ifriend.analytics.di.AnalyticUseCasesModule;
import com.ifriend.base.di.BaseComponent;
import com.ifriend.base.di.Feature;
import com.ifriend.chat.new_chat.di.ChatEventsObserverModule;
import com.ifriend.chat.new_chat.di.ChatScreenModule;
import com.ifriend.chat.new_chat.di.FeatureContext;
import com.ifriend.chat.new_chat.list.ChatListFragment;
import com.ifriend.chat.presentation.di.changingVoice.ChangingVoiceModule;
import com.ifriend.chat.presentation.di.chat.ChatDomainModule;
import com.ifriend.chat.presentation.di.internalNotifications.ChatInternalNotificationsModule;
import com.ifriend.chat.presentation.di.onboarding.OnboardingModule;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment;
import com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryFragment;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupDialog;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailFragment;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteFragment;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileFragment;
import com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment;
import com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment;
import com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment;
import com.ifriend.chat.presentation.ui.rateApp.RateAppFragment;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule;
import com.ifriend.presentation.di.AppEventsObserverModule;
import com.ifriend.presentation.di.AppExceptionsObserverModule;
import com.ifriend.presentation.di.modules.AppServiceModule;
import com.ifriend.presentation.features.app.di.AppPresentationProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.base.di.ActivityComponent;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
/* compiled from: ChatComponent.kt */
@Component(dependencies = {BaseComponent.class}, modules = {ActivityModule.class, ChatViewModelModule.class, ChatApiModule.class, AuthModule.class, OnboardingModule.class, ChatModule.class, ChatMessagesModule.class, PremiumIconManagerModule.class, NeuronsModule.class, GenerateAvatarModule.class, ChatInternalNotificationsModule.class, AnalyticUseCasesModule.class, ChatDomainModule.class, ChatScreenModule.class, ChangingVoiceModule.class, ChatCoreDataModule.class, AppEventsObserverModule.class, ChatEventsObserverModule.class, AppExceptionsObserverModule.class, AppServiceModule.class})
@Feature
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JJ\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u00100\u001a\u000201H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u00102\u001a\u000203H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u00104\u001a\u000205H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u00106\u001a\u000207H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u00108\u001a\u000209H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010>\u001a\u00020?H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010@\u001a\u00020AH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010B\u001a\u00020CH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010D\u001a\u00020EH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020FH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020GH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010H\u001a\u00020IH&¨\u0006K"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatComponent;", "Lcom/ifriend/ui/base/di/ActivityComponent;", "Lcom/ifriend/presentation/features/app/di/AppPresentationProvider;", "Lcom/ifriend/presentation/features/app/di/AppViewModelProvider;", "getMessagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "inject", "", "fragment", "Lcom/ifriend/chat/new_chat/list/ChatListFragment;", "appActivity", "Lcom/ifriend/chat/presentation/ui/AppActivity;", "generateBotAvatarErrorFragment", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorFragment;", "generatingBotAvatarPlaceholderFragment", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderFragment;", "botAvatarOptionFragment", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarFragment;", "generateBotAvatarFragment", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarFragment;", "previewSendImageFragment", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageFragment;", "chatWithTopicsFragment", "Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment;", "chatsListFragment", "Lcom/ifriend/chat/presentation/ui/chat/presentation/home/HomeFragment;", "baseDiaryFragment", "Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryFragment;", "darkDiaryFragment", "Lcom/ifriend/chat/presentation/ui/diary/fragments/dark/DarkDiaryFragment;", "lightDiariesListFragment", "Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryFragment;", "infoOnboardingFragment", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/InfoOnboardingFragment;", "botAgeFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotAgeFragment;", "botEthnicityFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment;", "botGenderFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotGenderFragment;", "botNameFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment;", "botPersonalityFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment;", "botProfileFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileFragment;", "botVoiceFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment;", "levelPopupDialog", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupDialog;", "resetFragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetFragment;", "changeEmailFragment", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailFragment;", "confirmEmailFragment", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ConfirmEmailFragment;", "changeAppIconFragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconFragment;", "userAgeFragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeFragment;", "userGenderFragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderFragment;", "userNameFragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserNameFragment;", "userProfileDeleteFragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteFragment;", "userProfileFragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileFragment;", "onboardingFragment", "Lcom/ifriend/chat/presentation/ui/onboarding/OnboardingFragment;", "Lcom/ifriend/chat/presentation/ui/purchase/neurons/BuyNeuronsBottomSheetDialogFragment;", "Lcom/ifriend/chat/presentation/ui/purchase/premium/BuyPremiumFragment;", "rateAppFragment", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppFragment;", "Builder", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatComponent extends ActivityComponent, AppPresentationProvider, AppViewModelProvider {

    /* compiled from: ChatComponent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatComponent$Builder;", "", "activity", "Lcom/ifriend/ui/base/BaseActivity;", "build", "Lcom/ifriend/chat/presentation/di/ChatComponent;", "context", "Landroid/content/Context;", "coreComponent", "core", "Lcom/ifriend/base/di/BaseComponent;", "screenLifecycle", "Landroidx/lifecycle/Lifecycle;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Component.Builder
    /* loaded from: classes6.dex */
    public interface Builder {
        @BindsInstance
        Builder activity(BaseActivity baseActivity);

        ChatComponent build();

        @BindsInstance
        Builder context(@FeatureContext Context context);

        Builder coreComponent(BaseComponent baseComponent);

        @BindsInstance
        Builder screenLifecycle(Lifecycle lifecycle);
    }

    MessagesSource getMessagesSource();

    void inject(ChatListFragment chatListFragment);

    void inject(AppActivity appActivity);

    void inject(GenerateBotAvatarErrorFragment generateBotAvatarErrorFragment);

    void inject(GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment);

    void inject(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment);

    void inject(GenerateBotAvatarFragment generateBotAvatarFragment);

    void inject(PreviewSendImageFragment previewSendImageFragment);

    void inject(ChatFragment chatFragment);

    void inject(HomeFragment homeFragment);

    void inject(BaseDiaryFragment baseDiaryFragment);

    void inject(DarkDiaryFragment darkDiaryFragment);

    void inject(LightDiaryFragment lightDiaryFragment);

    void inject(InfoOnboardingFragment infoOnboardingFragment);

    void inject(BotAgeFragment botAgeFragment);

    void inject(BotEthnicityFragment botEthnicityFragment);

    void inject(BotGenderFragment botGenderFragment);

    void inject(BotNameFragment botNameFragment);

    void inject(BotPersonalityFragment botPersonalityFragment);

    void inject(BotProfileFragment botProfileFragment);

    void inject(BotVoiceFragment botVoiceFragment);

    void inject(LevelPopupDialog levelPopupDialog);

    void inject(ResetFragment resetFragment);

    void inject(ChangeEmailFragment changeEmailFragment);

    void inject(ConfirmEmailFragment confirmEmailFragment);

    void inject(ChangeAppIconFragment changeAppIconFragment);

    void inject(UserAgeFragment userAgeFragment);

    void inject(UserGenderFragment userGenderFragment);

    void inject(UserNameFragment userNameFragment);

    void inject(UserProfileDeleteFragment userProfileDeleteFragment);

    void inject(UserProfileFragment userProfileFragment);

    void inject(OnboardingFragment onboardingFragment);

    void inject(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment);

    void inject(BuyPremiumFragment buyPremiumFragment);

    void inject(RateAppFragment rateAppFragment);
}
