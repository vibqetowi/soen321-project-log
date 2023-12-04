package com.ifriend.registration.presentation.ui.registration;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.video.VideoSize;
import com.ifriend.base.navigation.impl.cicerone.ActivityScreen;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.registration.domain.useCase.google.GoogleAccountData;
import com.ifriend.registration.presentation.R;
import com.ifriend.registration.presentation.bridges.google.GoogleAuthorizationAdapter;
import com.ifriend.registration.presentation.databinding.FragmentRegistrationVideoBackgroundBinding;
import com.ifriend.registration.presentation.ui.AttachLongTapDebugActivatorKt;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationScreen;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationEvents;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import com.ifriend.ui.base.mvvm.BaseEvent;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.button.BlackButton;
import com.ifriend.ui.button.GlowAppButton;
import com.ifriend.ui.button.IconDarkButton;
import com.ifriend.ui.textView.LinkTouchMovementMethod;
import com.ifriend.ui.textView.TouchableSpan;
import com.ifriend.ui.utils.Animations;
import com.ifriend.ui.utils.CustomTypefaceSpan;
import com.ifriend.ui.utils.UIUtils;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
/* compiled from: VideoBackgroundRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u00020#H\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002012\u0006\u0010:\u001a\u000203H\u0016J\b\u0010;\u001a\u000201H\u0002J\b\u0010<\u001a\u000201H\u0002J\b\u0010=\u001a\u000201H\u0002J\b\u0010>\u001a\u000201H\u0014J\u0012\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u000201H\u0016J\u0010\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u000201H\u0016J\b\u0010G\u001a\u000201H\u0016J\u001a\u0010H\u001a\u0002012\u0006\u0010:\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0016\u0010I\u001a\u0002012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u0016J\u0010\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020OH\u0014J\b\u0010P\u001a\u000201H\u0002J\u0010\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020\u0003H\u0016J\b\u0010S\u001a\u000201H\u0002J\b\u0010T\u001a\u000201H\u0002J\b\u0010U\u001a\u000201H\u0002J\b\u0010V\u001a\u000201H\u0002J\f\u0010W\u001a\u000201*\u00020\u001eH\u0002J\u0014\u0010X\u001a\u000201*\u00020\u001e2\u0006\u00107\u001a\u000208H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b'\u0010(R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006Y"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationViewModel;", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationState;", "()V", "appActivityScreenFactory", "Lcom/ifriend/chat/api/AppActivityScreenFactory;", "getAppActivityScreenFactory", "()Lcom/ifriend/chat/api/AppActivityScreenFactory;", "setAppActivityScreenFactory", "(Lcom/ifriend/chat/api/AppActivityScreenFactory;)V", "binding", "Lcom/ifriend/registration/presentation/databinding/FragmentRegistrationVideoBackgroundBinding;", "getBinding", "()Lcom/ifriend/registration/presentation/databinding/FragmentRegistrationVideoBackgroundBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "googleAuthorizationAdapter", "Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter;", "getGoogleAuthorizationAdapter", "()Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter;", "googleAuthorizationAdapter$delegate", "Lkotlin/Lazy;", "noInternetPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;", "getNoInternetPopupDelegate", "()Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;", "setNoInternetPopupDelegate", "(Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;)V", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "getPlayer", "()Lcom/google/android/exoplayer2/ExoPlayer;", "player$delegate", "shouldReloadOnReconnect", "", "getShouldReloadOnReconnect", "()Z", "viewModel", "getViewModel", "()Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "applyWindowInsets", "", "rootView", "Landroid/view/View;", "changeUiVisibility", "isVisible", "createPlayer", "context", "Landroid/content/Context;", "init", ViewHierarchyConstants.VIEW_KEY, "initBottomText", "navigateNext", "navigateToEmail", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onGoogleAuth", "credentials", "Lcom/ifriend/registration/domain/useCase/google/GoogleAccountData;", "onStart", "onStop", "onViewCreated", "showErrors", "errors", "", "", "showEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/ui/base/mvvm/BaseEvent;", "showNoInternetDialogIfInternetNotAvailable", "showState", "state", "startVideoPlaying", "stopVideoPlayingAndDisposeResources", "transitionToAllOptions", "transitionToFirstOptions", "attachToPlayerView", "setUp", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationFragment extends FragmentBaseView<VideoBackgroundRegistrationViewModel, VideoBackgroundRegistrationState> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(VideoBackgroundRegistrationFragment.class, "binding", "getBinding()Lcom/ifriend/registration/presentation/databinding/FragmentRegistrationVideoBackgroundBinding;", 0))};
    public static final int $stable = 8;
    @Inject
    public AppActivityScreenFactory appActivityScreenFactory;
    private final ViewBindingProperty binding$delegate;
    private final Lazy googleAuthorizationAdapter$delegate;
    @Inject
    public NoInternetPopupDelegate noInternetPopupDelegate;
    private final Lazy player$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;

    @Override // com.ifriend.ui.base.BaseFragment
    public boolean getShouldReloadOnReconnect() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    public VideoBackgroundRegistrationFragment() {
        super(R.layout.fragment_registration_video_background);
        VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new VideoBackgroundRegistrationFragment$special$$inlined$viewModels$default$2(new VideoBackgroundRegistrationFragment$special$$inlined$viewModels$default$1(videoBackgroundRegistrationFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(videoBackgroundRegistrationFragment, Reflection.getOrCreateKotlinClass(VideoBackgroundRegistrationViewModel.class), new VideoBackgroundRegistrationFragment$special$$inlined$viewModels$default$3(lazy), new VideoBackgroundRegistrationFragment$special$$inlined$viewModels$default$4(null, lazy), new VideoBackgroundRegistrationFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(videoBackgroundRegistrationFragment, new VideoBackgroundRegistrationFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        this.player$delegate = LazyKt.lazy(new VideoBackgroundRegistrationFragment$player$2(this));
        this.googleAuthorizationAdapter$delegate = LazyKt.lazy(new VideoBackgroundRegistrationFragment$googleAuthorizationAdapter$2(this));
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

    public final AppActivityScreenFactory getAppActivityScreenFactory() {
        AppActivityScreenFactory appActivityScreenFactory = this.appActivityScreenFactory;
        if (appActivityScreenFactory != null) {
            return appActivityScreenFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appActivityScreenFactory");
        return null;
    }

    public final void setAppActivityScreenFactory(AppActivityScreenFactory appActivityScreenFactory) {
        Intrinsics.checkNotNullParameter(appActivityScreenFactory, "<set-?>");
        this.appActivityScreenFactory = appActivityScreenFactory;
    }

    public final NoInternetPopupDelegate getNoInternetPopupDelegate() {
        NoInternetPopupDelegate noInternetPopupDelegate = this.noInternetPopupDelegate;
        if (noInternetPopupDelegate != null) {
            return noInternetPopupDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noInternetPopupDelegate");
        return null;
    }

    public final void setNoInternetPopupDelegate(NoInternetPopupDelegate noInternetPopupDelegate) {
        Intrinsics.checkNotNullParameter(noInternetPopupDelegate, "<set-?>");
        this.noInternetPopupDelegate = noInternetPopupDelegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public VideoBackgroundRegistrationViewModel getViewModel() {
        return (VideoBackgroundRegistrationViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRegistrationVideoBackgroundBinding getBinding() {
        T value = this.binding$delegate.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRegistrationVideoBackgroundBinding) value;
    }

    private final ExoPlayer getPlayer() {
        return (ExoPlayer) this.player$delegate.getValue();
    }

    private final GoogleAuthorizationAdapter getGoogleAuthorizationAdapter() {
        return (GoogleAuthorizationAdapter) this.googleAuthorizationAdapter$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.registration.presentation.ui.RegistrationActivity");
        ((RegistrationActivity) activity).getDaggerComponent().inject(this);
        getGoogleAuthorizationAdapter().init();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initBottomText();
        ImageView registrationMiniAppIcon = getBinding().registrationMiniAppIcon;
        Intrinsics.checkNotNullExpressionValue(registrationMiniAppIcon, "registrationMiniAppIcon");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        AttachLongTapDebugActivatorKt.attachLongTapDebugActivator(registrationMiniAppIcon, requireContext);
        getBinding().registrationFacebookButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoBackgroundRegistrationFragment.onViewCreated$lambda$0(VideoBackgroundRegistrationFragment.this, view2);
            }
        });
        getBinding().registrationGoogleButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoBackgroundRegistrationFragment.onViewCreated$lambda$1(VideoBackgroundRegistrationFragment.this, view2);
            }
        });
        getBinding().registrationEmailButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoBackgroundRegistrationFragment.onViewCreated$lambda$2(VideoBackgroundRegistrationFragment.this, view2);
            }
        });
        getBinding().registrationOtherOptionsButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoBackgroundRegistrationFragment.onViewCreated$lambda$3(VideoBackgroundRegistrationFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(VideoBackgroundRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().signUpWithFacebook(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(VideoBackgroundRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getGoogleAuthorizationAdapter().auth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(VideoBackgroundRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().startEmailRegistration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(VideoBackgroundRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onClickOtherOptions();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getViewModel().init();
        showNoInternetDialogIfInternetNotAvailable();
        getNoInternetPopupDelegate().init(this);
    }

    private final void showNoInternetDialogIfInternetNotAvailable() {
        if (getInternetConnection().getConnectivity().isFullyConnected()) {
            return;
        }
        getNoInternetPopupDelegate().showNoInternet(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        startVideoPlaying();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Animations animations = Animations.INSTANCE;
        View registrationVideoOverlay = getBinding().registrationVideoOverlay;
        Intrinsics.checkNotNullExpressionValue(registrationVideoOverlay, "registrationVideoOverlay");
        Animations.showWithAnimation$default(animations, registrationVideoOverlay, 0L, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        stopVideoPlayingAndDisposeResources();
        super.onDestroyView();
    }

    private final void startVideoPlaying() {
        if (!getPlayer().isPlaying()) {
            attachToPlayerView(getPlayer());
            ExoPlayer player = getPlayer();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            setUp(player, requireContext);
            return;
        }
        Animations animations = Animations.INSTANCE;
        View registrationVideoOverlay = getBinding().registrationVideoOverlay;
        Intrinsics.checkNotNullExpressionValue(registrationVideoOverlay, "registrationVideoOverlay");
        Animations.hideWithAnimation$default(animations, registrationVideoOverlay, 0L, 1, null);
    }

    private final void stopVideoPlayingAndDisposeResources() {
        getPlayer().stop();
        getBinding().backgroundVideoPlayerView.setPlayer(null);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(VideoBackgroundRegistrationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isNeedToShowAllOptions()) {
            transitionToAllOptions();
        } else {
            transitionToFirstOptions();
        }
        changeUiVisibility(state.getShowUI());
        if (state.getShowLoading()) {
            showLoading();
        } else {
            hideLoading();
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    protected void showEvent(BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof VideoBackgroundRegistrationEvents.NavigateNext) {
            navigateNext();
        } else if (event instanceof VideoBackgroundRegistrationEvents.NavigateToEmail) {
            navigateToEmail();
        }
    }

    private final void transitionToFirstOptions() {
        FragmentRegistrationVideoBackgroundBinding binding = getBinding();
        BlackButton registrationOtherOptionsButton = binding.registrationOtherOptionsButton;
        Intrinsics.checkNotNullExpressionValue(registrationOtherOptionsButton, "registrationOtherOptionsButton");
        registrationOtherOptionsButton.setVisibility(0);
        IconDarkButton registrationFacebookButton = binding.registrationFacebookButton;
        Intrinsics.checkNotNullExpressionValue(registrationFacebookButton, "registrationFacebookButton");
        registrationFacebookButton.setVisibility(8);
        IconDarkButton registrationEmailButton = binding.registrationEmailButton;
        Intrinsics.checkNotNullExpressionValue(registrationEmailButton, "registrationEmailButton");
        registrationEmailButton.setVisibility(8);
        binding.registrationGoogleButton.showGlow(true);
        TextView registrationSignInHint = binding.registrationSignInHint;
        Intrinsics.checkNotNullExpressionValue(registrationSignInHint, "registrationSignInHint");
        TextView textView = registrationSignInHint;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = UIUtils.INSTANCE.getToPxInt((Number) 12);
            textView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    private final void transitionToAllOptions() {
        FragmentRegistrationVideoBackgroundBinding binding = getBinding();
        IconDarkButton registrationFacebookButton = binding.registrationFacebookButton;
        Intrinsics.checkNotNullExpressionValue(registrationFacebookButton, "registrationFacebookButton");
        registrationFacebookButton.setVisibility(0);
        IconDarkButton registrationEmailButton = binding.registrationEmailButton;
        Intrinsics.checkNotNullExpressionValue(registrationEmailButton, "registrationEmailButton");
        registrationEmailButton.setVisibility(0);
        TextView registrationSignInHint = binding.registrationSignInHint;
        Intrinsics.checkNotNullExpressionValue(registrationSignInHint, "registrationSignInHint");
        TextView textView = registrationSignInHint;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ConstraintLayout.LayoutParams layoutParams3 = layoutParams2;
        layoutParams3.bottomToTop = binding.registrationGoogleButton.getId();
        layoutParams3.bottomMargin = UIUtils.INSTANCE.getToPxInt((Number) 20);
        textView.setLayoutParams(layoutParams2);
        GlowAppButton registrationGoogleButton = binding.registrationGoogleButton;
        Intrinsics.checkNotNullExpressionValue(registrationGoogleButton, "registrationGoogleButton");
        GlowAppButton glowAppButton = registrationGoogleButton;
        ViewGroup.LayoutParams layoutParams4 = glowAppButton.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        ConstraintLayout.LayoutParams layoutParams6 = layoutParams5;
        layoutParams6.height = UIUtils.INSTANCE.getToPxInt((Number) 55);
        layoutParams6.width = UIUtils.INSTANCE.getToPxInt((Number) 310);
        layoutParams6.bottomMargin = UIUtils.INSTANCE.getToPxInt((Number) 15);
        layoutParams6.bottomToTop = binding.registrationFacebookButton.getId();
        glowAppButton.setLayoutParams(layoutParams5);
        binding.registrationGoogleButton.setBackgroundColor(ContextCompat.getColor(requireContext(), com.ifriend.ui.R.color.white_10));
        BlackButton registrationOtherOptionsButton = binding.registrationOtherOptionsButton;
        Intrinsics.checkNotNullExpressionValue(registrationOtherOptionsButton, "registrationOtherOptionsButton");
        registrationOtherOptionsButton.setVisibility(8);
        binding.registrationGoogleButton.showGlow(false);
        binding.registrationGoogleButton.setTextColor(-1);
    }

    @Override // com.ifriend.ui.base.BaseFragment
    protected void applyWindowInsets(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        ConstraintLayout registrationContainer = getBinding().registrationContainer;
        Intrinsics.checkNotNullExpressionValue(registrationContainer, "registrationContainer");
        InsetsExtensionsKt.doOnApplyWindowInsets(registrationContainer, VideoBackgroundRegistrationFragment$applyWindowInsets$1.INSTANCE);
    }

    private final void setUp(ExoPlayer exoPlayer, Context context) {
        exoPlayer.setRepeatMode(2);
        exoPlayer.addListener(new Player.Listener() { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$setUp$1
            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onAudioSessionIdChanged(int i) {
                Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onCues(CueGroup cueGroup) {
                Player.Listener.CC.$default$onCues(this, cueGroup);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onCues(List list) {
                Player.Listener.CC.$default$onCues(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onEvents(Player player, Player.Events events) {
                Player.Listener.CC.$default$onEvents(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onIsLoadingChanged(boolean z) {
                Player.Listener.CC.$default$onIsLoadingChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onLoadingChanged(boolean z) {
                Player.Listener.CC.$default$onLoadingChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
                Player.Listener.CC.$default$onMetadata(this, metadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaybackStateChanged(int i) {
                Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                Player.Listener.CC.$default$onPlayerError(this, playbackException);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPositionDiscontinuity(int i) {
                Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onRenderedFirstFrame() {
                Player.Listener.CC.$default$onRenderedFirstFrame(this);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onRepeatModeChanged(int i) {
                Player.Listener.CC.$default$onRepeatModeChanged(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSeekBackIncrementChanged(long j) {
                Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSeekProcessed() {
                Player.Listener.CC.$default$onSeekProcessed(this);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onTracksChanged(Tracks tracks) {
                Player.Listener.CC.$default$onTracksChanged(this, tracks);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onVolumeChanged(float f) {
                Player.Listener.CC.$default$onVolumeChanged(this, f);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public void onIsPlayingChanged(boolean z) {
                FragmentRegistrationVideoBackgroundBinding binding;
                Player.Listener.CC.$default$onIsPlayingChanged(this, z);
                if (z) {
                    Animations animations = Animations.INSTANCE;
                    binding = VideoBackgroundRegistrationFragment.this.getBinding();
                    View registrationVideoOverlay = binding.registrationVideoOverlay;
                    Intrinsics.checkNotNullExpressionValue(registrationVideoOverlay, "registrationVideoOverlay");
                    Animations.hideWithAnimation$default(animations, registrationVideoOverlay, 0L, 1, null);
                }
            }
        });
        MediaSource createMediaSource = new DefaultMediaSourceFactory(context).createMediaSource(MediaItem.fromUri(RawResourceDataSource.buildRawResourceUri(R.raw.registration_background_video)));
        Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        exoPlayer.setMediaSource(createMediaSource);
        exoPlayer.play();
        exoPlayer.prepare();
    }

    private final void attachToPlayerView(ExoPlayer exoPlayer) {
        StyledPlayerView styledPlayerView = getBinding().backgroundVideoPlayerView;
        styledPlayerView.setPlayer(exoPlayer);
        styledPlayerView.setResizeMode(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExoPlayer createPlayer(Context context) {
        ExoPlayer build = new ExoPlayer.Builder(context, new DefaultRenderersFactory(context)).setTrackSelector(new DefaultTrackSelector(context)).setLoadControl(new DefaultLoadControl()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void initBottomText() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        SpannableString spannableString = new SpannableString(getString(R.string.by_clicking_sign_up_v2));
        final int color = ContextCompat.getColor(requireContext, com.ifriend.ui.R.color.white_05_alpha);
        Typeface font = ResourcesCompat.getFont(requireContext, com.ifriend.ui.R.font.ibm_bold);
        Intrinsics.checkNotNull(font);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(font);
        Typeface font2 = ResourcesCompat.getFont(requireContext, com.ifriend.ui.R.font.ibm_bold);
        Intrinsics.checkNotNull(font2);
        CustomTypefaceSpan customTypefaceSpan2 = new CustomTypefaceSpan(font2);
        SpannableString spannableString2 = spannableString;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString2, "Terms of service", 0, false, 6, (Object) null);
        int i = indexOf$default + 16;
        spannableString.setSpan(new TouchableSpan(color, this) { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$initBottomText$termsSpan$1
            final /* synthetic */ VideoBackgroundRegistrationFragment this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(color, color);
                this.this$0 = this;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View textView) {
                Intrinsics.checkNotNullParameter(textView, "textView");
                this.this$0.getViewModel().termsOfServiceClick(textView);
            }
        }, indexOf$default, i, 33);
        spannableString.setSpan(customTypefaceSpan, indexOf$default, i, 33);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableString2, "Privacy policy", 0, false, 6, (Object) null);
        int i2 = indexOf$default2 + 14;
        spannableString.setSpan(new TouchableSpan(color, this) { // from class: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$initBottomText$privacySpan$1
            final /* synthetic */ VideoBackgroundRegistrationFragment this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(color, color);
                this.this$0 = this;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View textView) {
                Intrinsics.checkNotNullParameter(textView, "textView");
                this.this$0.getViewModel().privacyPolicyClick(textView);
            }
        }, indexOf$default2, i2, 33);
        spannableString.setSpan(customTypefaceSpan2, indexOf$default2, i2, 33);
        TextView textView = getBinding().registrationTerms;
        textView.setText(spannableString2);
        textView.setMovementMethod(new LinkTouchMovementMethod());
        textView.setHighlightColor(0);
    }

    private final void changeUiVisibility(boolean z) {
        ConstraintLayout registrationContainer = getBinding().registrationContainer;
        Intrinsics.checkNotNullExpressionValue(registrationContainer, "registrationContainer");
        registrationContainer.setVisibility(z ? 0 : 8);
    }

    private final void navigateToEmail() {
        getRouter().navigateTo(new EmailRegistrationScreen());
    }

    private final void navigateNext() {
        hideLoading();
        ActivityScreen appActivityScreen$default = AppActivityScreenFactory.DefaultImpls.appActivityScreen$default(getAppActivityScreenFactory(), null, 1, null);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        startActivity(appActivityScreen$default.createIntent(requireContext));
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGoogleAuth(GoogleAccountData googleAccountData) {
        getViewModel().onGoogleAuth(googleAccountData);
    }
}
