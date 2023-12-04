package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.LevelsAnalytics;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentBotProfileBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.chat.presentation.LevelUiModel;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileState;
import com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupDialog;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.BotResetScreen;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.avatar.VideoAvatar;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.GeneratingAnimatedAvatarPopupDelegate;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import com.ifriend.ui.recyclerView.audio.audioView.ChatAudioPermission;
import com.ifriend.ui.recyclerView.audio.audioView.playback.VoiceSamplePlayback;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIUtils;
import com.ifriend.ui.utils.extensions.ViewKt;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: BotProfileFragment.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020#H\u0016J\u001a\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002J\b\u0010.\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u00020#H\u0002J\u001a\u00101\u001a\u00020#2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020#H\u0002J\u0016\u00107\u001a\u00020#2\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\u0010\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020\u0003H\u0016J\u0014\u0010=\u001a\u00020#*\u00020\u00062\u0006\u0010<\u001a\u00020\u0003H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006?"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentBotProfileBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentBotProfileBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "generatingAnimatedAvatarPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/GeneratingAnimatedAvatarPopupDelegate;", "getGeneratingAnimatedAvatarPopupDelegate", "()Lcom/ifriend/ui/base/modalMessage/GeneratingAnimatedAvatarPopupDelegate;", "setGeneratingAnimatedAvatarPopupDelegate", "(Lcom/ifriend/ui/base/modalMessage/GeneratingAnimatedAvatarPopupDelegate;)V", "notificationHandlersRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "getNotificationHandlersRegister", "()Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "setNotificationHandlersRegister", "(Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "initOnClickListeners", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "openAge", "openEthnicity", "openGender", "openName", "openPersonality", "openReset", "showAvatar", "avatarState", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$AvatarState;", "botName", "", "showAvatarGeneratingPopup", "showErrors", "errors", "", "", "showState", "state", "showVoice", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotProfileFragment extends FragmentBaseView<BotProfileViewModel, BotProfileState> {
    private final ReadOnlyProperty binding$delegate;
    @Inject
    public GeneratingAnimatedAvatarPopupDelegate generatingAnimatedAvatarPopupDelegate;
    @Inject
    public InternalNotificationHandlersRegister notificationHandlersRegister;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BotProfileFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentBotProfileBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BotProfileFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.NON_BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Personality.values().length];
            try {
                iArr2[Personality.FLIRTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Personality.FRIENDLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    /* compiled from: BotProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BotProfileFragment newInstance() {
            return new BotProfileFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public BotProfileViewModel getViewModel() {
        return (BotProfileViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentBotProfileBinding getBinding() {
        return (FragmentBotProfileBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final InternalNotificationHandlersRegister getNotificationHandlersRegister() {
        InternalNotificationHandlersRegister internalNotificationHandlersRegister = this.notificationHandlersRegister;
        if (internalNotificationHandlersRegister != null) {
            return internalNotificationHandlersRegister;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationHandlersRegister");
        return null;
    }

    public final void setNotificationHandlersRegister(InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        Intrinsics.checkNotNullParameter(internalNotificationHandlersRegister, "<set-?>");
        this.notificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public final ViewModelFactory getViewModelFactory() {
        ViewModelFactory viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ViewModelFactory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(BotProfileState state) {
        String string;
        Unit unit;
        String string2;
        Intrinsics.checkNotNullParameter(state, "state");
        FragmentBotProfileBinding binding = getBinding();
        binding.title.setText(state.getName());
        binding.name.setText(state.getName());
        binding.age.setText(String.valueOf(state.getAge()));
        TextView textView = binding.gender;
        Gender gender = state.getGender();
        int i = gender == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
        if (i == -1) {
            string = getString(R.string.female);
        } else if (i == 1) {
            string = getString(R.string.male);
        } else if (i == 2) {
            string = getString(R.string.female);
        } else if (i == 3) {
            string = getString(R.string.non_binary);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(string);
        EthnicityResponseMapper ethnicityResponseMapper = EthnicityResponseMapper.INSTANCE;
        Ethnicity ethnicity = state.getEthnicity();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String ethnicityResponse = ethnicityResponseMapper.ethnicityResponse(ethnicity, requireContext);
        TextView ethnicity2 = binding.ethnicity;
        Intrinsics.checkNotNullExpressionValue(ethnicity2, "ethnicity");
        ethnicity2.setVisibility(ethnicityResponse != null ? 0 : 8);
        binding.ethnicity.setText(ethnicityResponse);
        Personality personality = state.getPersonality();
        if (personality != null) {
            TextView personality2 = binding.personality;
            Intrinsics.checkNotNullExpressionValue(personality2, "personality");
            personality2.setVisibility(0);
            TextView textView2 = binding.personality;
            int i2 = WhenMappings.$EnumSwitchMapping$1[personality.ordinal()];
            if (i2 == 1) {
                string2 = getString(R.string.more_than_friends);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                string2 = getString(R.string.just_friends);
            }
            textView2.setText(string2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            TextView personality3 = binding.personality;
            Intrinsics.checkNotNullExpressionValue(personality3, "personality");
            personality3.setVisibility(8);
        }
        TextView textView3 = binding.resetText;
        int i3 = R.string.you_can_reset;
        Object[] objArr = new Object[1];
        String name = state.getName();
        if (name == null) {
            name = "";
        }
        objArr[0] = name;
        textView3.setText(getString(i3, objArr));
        TextView textView4 = binding.reset;
        int i4 = R.string.reset;
        Object[] objArr2 = new Object[1];
        String name2 = state.getName();
        objArr2[0] = name2 != null ? name2 : "";
        textView4.setText(getString(i4, objArr2));
        if (state.getAvatarState() == null) {
            ConstraintLayout avatarContainer = binding.avatarContainer;
            Intrinsics.checkNotNullExpressionValue(avatarContainer, "avatarContainer");
            avatarContainer.setVisibility(8);
            TextView title = binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            title.setVisibility(0);
        } else {
            showAvatar(state.getAvatarState(), state.getName());
            TextView title2 = binding.title;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            title2.setVisibility(8);
        }
        showVoice(binding, state);
        LevelUiModel levelInfo = state.getLevelInfo();
        if (!Intrinsics.areEqual(levelInfo, LevelUiModel.DoesNotShow.INSTANCE)) {
            if (!Intrinsics.areEqual(levelInfo, LevelUiModel.NotLoaded.INSTANCE)) {
                if (levelInfo instanceof LevelUiModel.Show) {
                    binding.levelContainer.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BotProfileFragment.showState$lambda$3$lambda$2(BotProfileFragment.this, view);
                        }
                    });
                    LinearLayout levelContainer = binding.levelContainer;
                    Intrinsics.checkNotNullExpressionValue(levelContainer, "levelContainer");
                    levelContainer.setVisibility(0);
                    binding.nameInLevelContainer.setText(state.getName());
                    LevelUiModel.Show show = (LevelUiModel.Show) levelInfo;
                    binding.level.setText(getString(R.string.level, Integer.valueOf(show.getLevel())));
                    binding.levelProgressBar.setLevel(show.getProgress(), show.getMaxProgress());
                    return;
                }
                return;
            }
            LinearLayout levelContainer2 = binding.levelContainer;
            Intrinsics.checkNotNullExpressionValue(levelContainer2, "levelContainer");
            levelContainer2.setVisibility(8);
            return;
        }
        LinearLayout levelContainer3 = binding.levelContainer;
        Intrinsics.checkNotNullExpressionValue(levelContainer3, "levelContainer");
        levelContainer3.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showState$lambda$3$lambda$2(BotProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelsAnalytics.INSTANCE.avatarMenuProgressBarClick();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this$0);
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UIUtils.INSTANCE.showWithBlur(LevelPopupDialog.Companion.newInstance(), lifecycleScope, childFragmentManager, "level_popup_dialog");
    }

    private final void showAvatar(BotProfileState.AvatarState avatarState, String str) {
        AnimatedAvatarViewState.StaticAvatar staticAvatar;
        ConstraintLayout avatarContainer = getBinding().avatarContainer;
        Intrinsics.checkNotNullExpressionValue(avatarContainer, "avatarContainer");
        avatarContainer.setVisibility(0);
        ImageView avatarButton = getBinding().avatarButton;
        Intrinsics.checkNotNullExpressionValue(avatarButton, "avatarButton");
        avatarButton.setVisibility(avatarState.isPlaceholder() ^ true ? 0 : 8);
        AnimatedAvatarView avatar = getBinding().avatar;
        Intrinsics.checkNotNullExpressionValue(avatar, "avatar");
        avatar.setVisibility(0);
        GeneratedAvatar generatedAvatar = avatarState.getGeneratedAvatar();
        VideoAvatar videoAvatar = generatedAvatar != null ? generatedAvatar.getVideoAvatar() : null;
        VideoAvatar.Generated generated = videoAvatar instanceof VideoAvatar.Generated ? (VideoAvatar.Generated) videoAvatar : null;
        String videoUri = generated != null ? generated.getVideoUri() : null;
        GeneratedAvatar generatedAvatar2 = avatarState.getGeneratedAvatar();
        String imageAvatarUri = generatedAvatar2 != null ? generatedAvatar2.getImageAvatarUri() : null;
        boolean isAnimationFeatureEnabled = avatarState.isAnimationFeatureEnabled();
        boolean isVideoGenerationInProgress = avatarState.isVideoGenerationInProgress();
        boolean isVideoEnabled = avatarState.isVideoEnabled();
        GeneratedAvatar generatedAvatar3 = avatarState.getGeneratedAvatar();
        String str2 = (generatedAvatar3 == null || (r4 = generatedAvatar3.getId()) == null) ? "" : "";
        if (avatarState.isPlaceholder()) {
            if (str == null) {
                str = "EVA AI";
            }
            staticAvatar = new AnimatedAvatarViewState.Placeholder(30, new AnimatedAvatarViewState.Placeholder.Presentation.Big(str));
        } else if (!isAnimationFeatureEnabled) {
            staticAvatar = new AnimatedAvatarViewState.StaticAvatar(imageAvatarUri, str2, 30);
        } else if (isVideoGenerationInProgress) {
            staticAvatar = new AnimatedAvatarViewState.GeneratingVideoAvatar(imageAvatarUri, str2, 30, true);
        } else if (videoUri != null && isVideoEnabled) {
            staticAvatar = new AnimatedAvatarViewState.PlayingVideoAvatar(imageAvatarUri, str2, 30, videoUri, true);
        } else if (videoUri != null && !isVideoEnabled) {
            staticAvatar = new AnimatedAvatarViewState.PauseVideoAvatar(imageAvatarUri, str2, 30, videoUri, true);
        } else {
            staticAvatar = new AnimatedAvatarViewState.StaticAvatar(imageAvatarUri, str2, 30);
        }
        getBinding().avatar.update(staticAvatar);
    }

    public final GeneratingAnimatedAvatarPopupDelegate getGeneratingAnimatedAvatarPopupDelegate() {
        GeneratingAnimatedAvatarPopupDelegate generatingAnimatedAvatarPopupDelegate = this.generatingAnimatedAvatarPopupDelegate;
        if (generatingAnimatedAvatarPopupDelegate != null) {
            return generatingAnimatedAvatarPopupDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generatingAnimatedAvatarPopupDelegate");
        return null;
    }

    public final void setGeneratingAnimatedAvatarPopupDelegate(GeneratingAnimatedAvatarPopupDelegate generatingAnimatedAvatarPopupDelegate) {
        Intrinsics.checkNotNullParameter(generatingAnimatedAvatarPopupDelegate, "<set-?>");
        this.generatingAnimatedAvatarPopupDelegate = generatingAnimatedAvatarPopupDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAvatarGeneratingPopup() {
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BotProfileFragment.showAvatarGeneratingPopup$lambda$4(BotProfileFragment.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAvatarGeneratingPopup$lambda$4(BotProfileFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getGeneratingAnimatedAvatarPopupDelegate().show();
    }

    private final void showVoice(FragmentBotProfileBinding fragmentBotProfileBinding, BotProfileState botProfileState) {
        BotProfileState.Voice voice = botProfileState.getVoice();
        ConstraintLayout voiceContainer = getBinding().voiceContainer;
        Intrinsics.checkNotNullExpressionValue(voiceContainer, "voiceContainer");
        voiceContainer.setVisibility(voice != null ? 0 : 8);
        if (voice != null) {
            fragmentBotProfileBinding.voiceSample.setContent(new ChatAudioPermission(true, null), new VoiceSamplePlayback(voice.getSampleUrl(), voice.getPlaybackController()), voice.getConfig());
        }
        getBinding().voiceContainer.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BotProfileFragment.showVoice$lambda$5(BotProfileFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVoice$lambda$5(BotProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onClickVoiceSample();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().init();
        FragmentBotProfileBinding binding = getBinding();
        ImageView close = binding.close;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        ViewKt.expandClickableArea$default(close, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        AnimatedAvatarView avatar = binding.avatar;
        Intrinsics.checkNotNullExpressionValue(avatar, "avatar");
        modification.onTouchOpacity(avatar);
        Modification modification2 = Modification.INSTANCE;
        ImageView avatarButton = binding.avatarButton;
        Intrinsics.checkNotNullExpressionValue(avatarButton, "avatarButton");
        modification2.onTouchOpacity(avatarButton);
        binding.close.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BotProfileFragment.onViewCreated$lambda$7$lambda$6(BotProfileFragment.this, view2);
            }
        });
        initOnClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$6(BotProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    private final void initOnClickListeners() {
        FragmentBotProfileBinding binding = getBinding();
        Modification modification = Modification.INSTANCE;
        TextView name = binding.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        modification.onTouchOpacity(name);
        BotProfileFragment botProfileFragment = this;
        TextView name2 = binding.name;
        Intrinsics.checkNotNullExpressionValue(name2, "name");
        BaseFragment.setScreenDebouncedOnClickListener$default(botProfileFragment, name2, new BotProfileFragment$initOnClickListeners$1$1(this), 0L, 2, null);
        Modification modification2 = Modification.INSTANCE;
        TextView age = binding.age;
        Intrinsics.checkNotNullExpressionValue(age, "age");
        modification2.onTouchOpacity(age);
        TextView age2 = binding.age;
        Intrinsics.checkNotNullExpressionValue(age2, "age");
        BaseFragment.setScreenDebouncedOnClickListener$default(botProfileFragment, age2, new BotProfileFragment$initOnClickListeners$1$2(this), 0L, 2, null);
        Modification modification3 = Modification.INSTANCE;
        TextView gender = binding.gender;
        Intrinsics.checkNotNullExpressionValue(gender, "gender");
        modification3.onTouchOpacity(gender);
        TextView gender2 = binding.gender;
        Intrinsics.checkNotNullExpressionValue(gender2, "gender");
        BaseFragment.setScreenDebouncedOnClickListener$default(botProfileFragment, gender2, new BotProfileFragment$initOnClickListeners$1$3(this), 0L, 2, null);
        Modification modification4 = Modification.INSTANCE;
        TextView ethnicity = binding.ethnicity;
        Intrinsics.checkNotNullExpressionValue(ethnicity, "ethnicity");
        modification4.onTouchOpacity(ethnicity);
        TextView ethnicity2 = binding.ethnicity;
        Intrinsics.checkNotNullExpressionValue(ethnicity2, "ethnicity");
        BaseFragment.setScreenDebouncedOnClickListener$default(botProfileFragment, ethnicity2, new BotProfileFragment$initOnClickListeners$1$4(this), 0L, 2, null);
        Modification modification5 = Modification.INSTANCE;
        TextView personality = binding.personality;
        Intrinsics.checkNotNullExpressionValue(personality, "personality");
        modification5.onTouchOpacity(personality);
        TextView personality2 = binding.personality;
        Intrinsics.checkNotNullExpressionValue(personality2, "personality");
        BaseFragment.setScreenDebouncedOnClickListener$default(botProfileFragment, personality2, new BotProfileFragment$initOnClickListeners$1$5(this), 0L, 2, null);
        AnimatedAvatarView avatar = binding.avatar;
        Intrinsics.checkNotNullExpressionValue(avatar, "avatar");
        setScreenDebouncedOnClickListener(avatar, new BotProfileFragment$initOnClickListeners$1$6(this), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        Modification modification6 = Modification.INSTANCE;
        ImageView avatarButton = binding.avatarButton;
        Intrinsics.checkNotNullExpressionValue(avatarButton, "avatarButton");
        modification6.onTouchOpacity(avatarButton);
        ImageView avatarButton2 = binding.avatarButton;
        Intrinsics.checkNotNullExpressionValue(avatarButton2, "avatarButton");
        setScreenDebouncedOnClickListener(avatarButton2, new BotProfileFragment$initOnClickListeners$1$7(this), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        Modification modification7 = Modification.INSTANCE;
        ConstraintLayout resetButton = binding.resetButton;
        Intrinsics.checkNotNullExpressionValue(resetButton, "resetButton");
        modification7.onTouchOpacity(resetButton);
        ConstraintLayout resetButton2 = binding.resetButton;
        Intrinsics.checkNotNullExpressionValue(resetButton2, "resetButton");
        BaseFragment.setScreenDebouncedOnClickListener$default(botProfileFragment, resetButton2, new BotProfileFragment$initOnClickListeners$1$8(this), 0L, 2, null);
        binding.avatar.setListeners(new BotProfileFragment$initOnClickListeners$1$9(this), new BotProfileFragment$initOnClickListeners$1$10(this), new BotProfileFragment$initOnClickListeners$1$11(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openName() {
        getRouter().navigateTo(BotNameScreen.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAge() {
        getRouter().navigateTo(BotAgeScreen.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openGender() {
        getRouter().navigateTo(BotGenderScreen.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openEthnicity() {
        getRouter().navigateTo(BotEthnicityScreen.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPersonality() {
        getRouter().navigateTo(BotPersonalityScreen.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openReset() {
        getRouter().navigateTo(BotResetScreen.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        getBinding().voiceSample.pause();
        super.onStop();
    }

    public BotProfileFragment() {
        super(R.layout.fragment_bot_profile);
        BotProfileFragment botProfileFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BotProfileFragment$special$$inlined$viewModels$default$2(new BotProfileFragment$special$$inlined$viewModels$default$1(botProfileFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(botProfileFragment, Reflection.getOrCreateKotlinClass(BotProfileViewModel.class), new BotProfileFragment$special$$inlined$viewModels$default$3(lazy), new BotProfileFragment$special$$inlined$viewModels$default$4(null, lazy), new BotProfileFragment$viewModel$2(this));
        this.binding$delegate = new ViewBindingDelegate(botProfileFragment, Reflection.getOrCreateKotlinClass(FragmentBotProfileBinding.class));
    }
}
