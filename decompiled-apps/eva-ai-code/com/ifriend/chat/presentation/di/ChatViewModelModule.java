package com.ifriend.chat.presentation.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageViewModel;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryViewModel;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetViewModel;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel;
import com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.di.ViewModelKey;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kotlin.Metadata;
/* compiled from: ChatViewModelModule.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0012H'J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0018H'J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001aH'J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001cH'J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001eH'J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020 H'J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\"H'J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020$H'J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020&H'J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\t\u001a\u00020(H'J\u0010\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020*H'J\u0010\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020,H'J\u0010\u0010-\u001a\u00020\b2\u0006\u0010\t\u001a\u00020.H'J\u0010\u0010/\u001a\u00020\b2\u0006\u0010\t\u001a\u000200H'J\u0010\u00101\u001a\u00020\b2\u0006\u0010\t\u001a\u000202H'J\u0010\u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u000204H'J\u0010\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u000206H'J\u0010\u00107\u001a\u00020\b2\u0006\u0010\t\u001a\u000208H'J\u0010\u00109\u001a\u00020\b2\u0006\u0010\t\u001a\u00020:H'J\u0010\u0010;\u001a\u00020\b2\u0006\u0010\t\u001a\u00020<H'J\u0010\u0010=\u001a\u00020\b2\u0006\u0010\t\u001a\u00020>H'¨\u0006?"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "botAgeViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotAgeViewModel;", "botEthnicityViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityViewModel;", "botGenderViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotGenderViewModel;", "botNameViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameViewModel;", "botPersonalityViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityViewModel;", "botProfileViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileViewModel;", "botVoiceViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceViewModel;", "changeAppIconViewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconViewModel;", "chatAppViewModel", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "generateBotAvatarOptionsViewModel", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarViewModel;", "generateChangeEmailViewModel", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailViewModel;", "generateConfirmEmailViewModel", "Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel;", "generateGenerateBotAvatarErrorViewModel", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorViewModel;", "generateGenerateBotAvatarViewModel", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarViewModel;", "generateGeneratingBotAvatarPlaceholderViewModel", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderViewModel;", "generatePreviewSendImageViewModel", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageViewModel;", "generateRateAppViewModel", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppViewModel;", "homeViewModel", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;", "levelPopupViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupViewModel;", "lightDarkDiaryViewModel", "Lcom/ifriend/chat/presentation/ui/diary/fragments/dark/DarkDiaryViewModel;", "lightLightDiaryViewModel", "Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryViewModel;", "resetViewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetViewModel;", "userAgeViewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeViewModel;", "userGenderViewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderViewModel;", "userNameViewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserNameViewModel;", "userProfileDeleteViewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteViewModel;", "userProfileViewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class ChatViewModelModule {
    public static final int $stable = 0;

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);

    @ViewModelKey(BotAgeViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botAgeViewModel(BotAgeViewModel botAgeViewModel);

    @ViewModelKey(BotEthnicityViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botEthnicityViewModel(BotEthnicityViewModel botEthnicityViewModel);

    @ViewModelKey(BotGenderViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botGenderViewModel(BotGenderViewModel botGenderViewModel);

    @ViewModelKey(BotNameViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botNameViewModel(BotNameViewModel botNameViewModel);

    @ViewModelKey(BotPersonalityViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botPersonalityViewModel(BotPersonalityViewModel botPersonalityViewModel);

    @ViewModelKey(BotProfileViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botProfileViewModel(BotProfileViewModel botProfileViewModel);

    @ViewModelKey(BotVoiceViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel botVoiceViewModel(BotVoiceViewModel botVoiceViewModel);

    @ViewModelKey(ChangeAppIconViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel changeAppIconViewModel(ChangeAppIconViewModel changeAppIconViewModel);

    @ViewModelKey(AppViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel chatAppViewModel(AppViewModel appViewModel);

    @ViewModelKey(SelectGeneratedAvatarViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateBotAvatarOptionsViewModel(SelectGeneratedAvatarViewModel selectGeneratedAvatarViewModel);

    @ViewModelKey(ChangeEmailViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateChangeEmailViewModel(ChangeEmailViewModel changeEmailViewModel);

    @ViewModelKey(ConfirmEmailViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateConfirmEmailViewModel(ConfirmEmailViewModel confirmEmailViewModel);

    @ViewModelKey(GenerateBotAvatarErrorViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateGenerateBotAvatarErrorViewModel(GenerateBotAvatarErrorViewModel generateBotAvatarErrorViewModel);

    @ViewModelKey(GenerateBotAvatarViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateGenerateBotAvatarViewModel(GenerateBotAvatarViewModel generateBotAvatarViewModel);

    @ViewModelKey(GeneratingBotAvatarPlaceholderViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateGeneratingBotAvatarPlaceholderViewModel(GeneratingBotAvatarPlaceholderViewModel generatingBotAvatarPlaceholderViewModel);

    @ViewModelKey(PreviewSendImageViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generatePreviewSendImageViewModel(PreviewSendImageViewModel previewSendImageViewModel);

    @ViewModelKey(RateAppViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel generateRateAppViewModel(RateAppViewModel rateAppViewModel);

    @ViewModelKey(HomeViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel homeViewModel(HomeViewModel homeViewModel);

    @ViewModelKey(LevelPopupViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel levelPopupViewModel(LevelPopupViewModel levelPopupViewModel);

    @ViewModelKey(DarkDiaryViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel lightDarkDiaryViewModel(DarkDiaryViewModel darkDiaryViewModel);

    @ViewModelKey(LightDiaryViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel lightLightDiaryViewModel(LightDiaryViewModel lightDiaryViewModel);

    @ViewModelKey(ResetViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel resetViewModel(ResetViewModel resetViewModel);

    @ViewModelKey(UserAgeViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel userAgeViewModel(UserAgeViewModel userAgeViewModel);

    @ViewModelKey(UserGenderViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel userGenderViewModel(UserGenderViewModel userGenderViewModel);

    @ViewModelKey(UserNameViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel userNameViewModel(UserNameViewModel userNameViewModel);

    @ViewModelKey(UserProfileDeleteViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel userProfileDeleteViewModel(UserProfileDeleteViewModel userProfileDeleteViewModel);

    @ViewModelKey(UserProfileViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel userProfileViewModel(UserProfileViewModel userProfileViewModel);
}
