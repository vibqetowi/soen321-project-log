package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import coil.ImageLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.app.activity.FlowFragment;
import com.ifriend.base.app.activity.FlowNavigator;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.base.navigation.impl.RouterProviderImplKt;
import com.ifriend.chat.new_chat.list.ChatListFragment;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentChatBinding;
import com.ifriend.chat.presentation.di.ChatComponent;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.BackgroundDelegateManager;
import com.ifriend.chat.presentation.ui.chat.ShowRateAppDialog;
import com.ifriend.chat.presentation.ui.chat.navigation.ChatFlowFragmentDelegate;
import com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageScreen;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.viewmodel.ChatRootViewModelFactory;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.socket.notifications.RateAppInternalNotification;
import com.ifriend.infrastructure.internalNotifications.RootNavigationFragmentInternalNotificationHandler;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.presentation.common.uistate.UiStateExtKt;
import com.ifriend.presentation.common.uistate.UiStateWatcher;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.ImagePickerObserver;
import com.ifriend.ui.base.modalMessage.ChooseVoicePopupDelegate;
import com.ifriend.ui.utils.extensions.ContextKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\b\u0007\u0018\u0000 v2\u00020\u0001:\u0001vB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0014J\u0018\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010Y\u001a\u00020RH\u0007J\u0010\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020\\H\u0016J\u0012\u0010]\u001a\u00020R2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\b\u0010`\u001a\u00020RH\u0016J-\u0010a\u001a\u00020R2\u0006\u0010b\u001a\u00020c2\u000e\u0010d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100e2\u0006\u0010f\u001a\u00020gH\u0016¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020RH\u0016J\b\u0010j\u001a\u00020RH\u0016J\b\u0010k\u001a\u00020RH\u0016J\u001a\u0010l\u001a\u00020R2\u0006\u0010m\u001a\u00020T2\b\u0010^\u001a\u0004\u0018\u00010_H\u0017J\u0012\u0010n\u001a\u00020R2\b\u0010o\u001a\u0004\u0018\u00010pH\u0002J\b\u0010q\u001a\u00020RH\u0007J\b\u0010r\u001a\u00020RH\u0007J\b\u0010s\u001a\u00020RH\u0007J\b\u0010t\u001a\u00020RH\u0002J\b\u0010u\u001a\u00020RH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*R$\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082.¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\b\u001a\u0004\bE\u0010FR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006w²\u0006\n\u0010x\u001a\u00020PX\u008a\u0084\u0002²\u0006\n\u0010y\u001a\u00020zX\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment;", "Lcom/ifriend/base/app/activity/FlowFragment;", "()V", "backgroundDelegateManager", "Lcom/ifriend/chat/presentation/ui/BackgroundDelegateManager;", "getBackgroundDelegateManager", "()Lcom/ifriend/chat/presentation/ui/BackgroundDelegateManager;", "backgroundDelegateManager$delegate", "Lkotlin/Lazy;", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentChatBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentChatBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "chatId", "", "getChatId", "()Ljava/lang/String;", "chatId$delegate", "chooseVoicePopupDelegate", "Lcom/ifriend/ui/base/modalMessage/ChooseVoicePopupDelegate;", "getChooseVoicePopupDelegate", "()Lcom/ifriend/ui/base/modalMessage/ChooseVoicePopupDelegate;", "setChooseVoicePopupDelegate", "(Lcom/ifriend/ui/base/modalMessage/ChooseVoicePopupDelegate;)V", "cicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "getCicerone", "()Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "containerTag", "getContainerTag", "flowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "flowFragmentDelegate", "Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate;", "getFlowFragmentDelegate", "()Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate;", "flowFragmentDelegate$delegate", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader$annotations", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "imagePickerObserver", "Lcom/ifriend/ui/base/ImagePickerObserver;", "navigator", "Lcom/ifriend/base/app/activity/FlowNavigator;", "getNavigator", "()Lcom/ifriend/base/app/activity/FlowNavigator;", "shouldReloadOnReconnect", "", "getShouldReloadOnReconnect", "()Z", "showRateAppDialog", "Lcom/ifriend/chat/presentation/ui/chat/ShowRateAppDialog;", "getShowRateAppDialog", "()Lcom/ifriend/chat/presentation/ui/chat/ShowRateAppDialog;", "setShowRateAppDialog", "(Lcom/ifriend/chat/presentation/ui/chat/ShowRateAppDialog;)V", "viewModel", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/viewmodel/ChatRootViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/viewmodel/ChatRootViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/viewmodel/ChatRootViewModelFactory;)V", "watcher", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "applyWindowInsets", "", "rootView", "Landroid/view/View;", "createInternalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "makePhotoClick", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "onStop", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "openPreviewSendImage", "imageUri", "Landroid/net/Uri;", "sendImageFromGalleryClick", "sendImageFromGalleryClickApi33", "showAllowGalleryDialog", "showAllowMicrophoneDialog", "showSendImageDialog", "Companion", "presentation_release", "uiState", "headerState", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFragment extends FlowFragment {
    public static final String ARG_CHAT_ID = "chat_id";
    private static final String ARG_SHOW_KEYBOARD_ON_START = "show_keyboard";
    private final Lazy backgroundDelegateManager$delegate;
    private final ViewBindingProperty binding$delegate;
    private final Lazy chatId$delegate;
    @Inject
    public ChooseVoicePopupDelegate chooseVoicePopupDelegate;
    private final String containerTag;
    @Inject
    public AppFlowCoordinator flowCoordinator;
    private final Lazy flowFragmentDelegate$delegate;
    @Inject
    public ImageLoader imageLoader;
    private ImagePickerObserver imagePickerObserver;
    @Inject
    public ShowRateAppDialog showRateAppDialog;
    private final Lazy viewModel$delegate;
    @Inject
    public ChatRootViewModelFactory viewModelFactory;
    private final UiStateWatcher<ChatViewModel.UiState> watcher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChatFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentChatBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @AppImageLoader
    public static /* synthetic */ void getImageLoader$annotations() {
    }

    @Override // com.ifriend.ui.base.BaseFragment
    protected void applyWindowInsets(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public boolean getShouldReloadOnReconnect() {
        return true;
    }

    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment$Companion;", "", "()V", "ARG_CHAT_ID", "", "ARG_SHOW_KEYBOARD_ON_START", "newInstance", "Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment;", "showKeyboardOnStart", "", ConfigKeys.CLIENT_ID, "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatFragment newInstance(boolean z, String clientId) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            ChatFragment chatFragment = new ChatFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(ChatFragment.ARG_SHOW_KEYBOARD_ON_START, z);
            bundle.putString("chat_id", clientId);
            chatFragment.setArguments(bundle);
            return chatFragment;
        }
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final AppFlowCoordinator getFlowCoordinator() {
        AppFlowCoordinator appFlowCoordinator = this.flowCoordinator;
        if (appFlowCoordinator != null) {
            return appFlowCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flowCoordinator");
        return null;
    }

    public final void setFlowCoordinator(AppFlowCoordinator appFlowCoordinator) {
        Intrinsics.checkNotNullParameter(appFlowCoordinator, "<set-?>");
        this.flowCoordinator = appFlowCoordinator;
    }

    public final ChatRootViewModelFactory getViewModelFactory() {
        ChatRootViewModelFactory chatRootViewModelFactory = this.viewModelFactory;
        if (chatRootViewModelFactory != null) {
            return chatRootViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ChatRootViewModelFactory chatRootViewModelFactory) {
        Intrinsics.checkNotNullParameter(chatRootViewModelFactory, "<set-?>");
        this.viewModelFactory = chatRootViewModelFactory;
    }

    public final ShowRateAppDialog getShowRateAppDialog() {
        ShowRateAppDialog showRateAppDialog = this.showRateAppDialog;
        if (showRateAppDialog != null) {
            return showRateAppDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showRateAppDialog");
        return null;
    }

    public final void setShowRateAppDialog(ShowRateAppDialog showRateAppDialog) {
        Intrinsics.checkNotNullParameter(showRateAppDialog, "<set-?>");
        this.showRateAppDialog = showRateAppDialog;
    }

    private final ChatFlowFragmentDelegate getFlowFragmentDelegate() {
        return (ChatFlowFragmentDelegate) this.flowFragmentDelegate$delegate.getValue();
    }

    private final BackgroundDelegateManager getBackgroundDelegateManager() {
        return (BackgroundDelegateManager) this.backgroundDelegateManager$delegate.getValue();
    }

    @Override // com.ifriend.base.app.activity.FlowFragment
    public Cicerone<AppRouter> getCicerone() {
        return getCiceroneHolder().getCicerone(getContainerTag(), ChatFragment$cicerone$1.INSTANCE);
    }

    @Override // com.ifriend.base.app.activity.FlowFragment
    public String getContainerTag() {
        return this.containerTag;
    }

    @Override // com.ifriend.base.app.activity.FlowFragment
    public FlowNavigator getNavigator() {
        return getFlowFragmentDelegate().getNavigator();
    }

    public final FragmentChatBinding getBinding() {
        T value = this.binding$delegate.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChatBinding) value;
    }

    private final String getChatId() {
        return (String) this.chatId$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatViewModel getViewModel() {
        return (ChatViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.base.app.activity.FlowFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(getFlowFragmentDelegate());
        getLifecycle().addObserver(getBackgroundDelegateManager());
        if (bundle == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
            int i = R.id.container;
            ChatListFragment.Companion companion = ChatListFragment.Companion;
            String chatId = getChatId();
            Bundle arguments = getArguments();
            beginTransaction.replace(i, companion.newInstance(chatId, ommonKt.orFalse(arguments != null ? Boolean.valueOf(arguments.getBoolean(ARG_SHOW_KEYBOARD_ON_START)) : null)));
            beginTransaction.commit();
        }
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        final ChatComponent daggerComponent = ((AppActivity) activity).getDaggerComponent();
        daggerComponent.inject(this);
        super.onAttach(context);
        getChildFragmentManager().addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda4
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                ChatFragment.onAttach$lambda$2(ChatComponent.this, fragmentManager, fragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$2(ChatComponent component, FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(component, "$component");
        Intrinsics.checkNotNullParameter(fragmentManager, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof ChatListFragment) {
            component.inject((ChatListFragment) fragment);
        }
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
        Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "<get-activityResultRegistry>(...)");
        this.imagePickerObserver = new ImagePickerObserver(activityResultRegistry, new ChatFragment$onViewCreated$1(this));
        Lifecycle lifecycle = getLifecycle();
        ImagePickerObserver imagePickerObserver = this.imagePickerObserver;
        if (imagePickerObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePickerObserver");
            imagePickerObserver = null;
        }
        lifecycle.addObserver(imagePickerObserver);
        FragmentChatBinding binding = getBinding();
        ComposeView composeView = binding.composeChatOverlayContainer;
        Intrinsics.checkNotNull(composeView);
        WindowInsets_androidKt.setConsumeWindowInsets(composeView, false);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1581799973, true, new ChatFragment$onViewCreated$2$1$1(this)));
        ComposeView composeView2 = binding.imageBackgroundView;
        Intrinsics.checkNotNull(composeView2);
        WindowInsets_androidKt.setConsumeWindowInsets(composeView2, false);
        composeView2.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView2.setContent(ComposableLambdaKt.composableLambdaInstance(1593136260, true, new ChatFragment$onViewCreated$2$2$1(this)));
        ComposeView composeView3 = binding.headerComposeView;
        Intrinsics.checkNotNull(composeView3);
        WindowInsets_androidKt.setConsumeWindowInsets(composeView3, false);
        composeView3.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(-1551998749, true, new ChatFragment$onViewCreated$2$3$1(this)));
        ComposeView composeView4 = binding.composeMainContainer;
        composeView4.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView4.setContent(ComposableLambdaKt.composableLambdaInstance(-402166462, true, new ChatFragment$onViewCreated$2$4$1(this)));
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        UiStateExtKt.render$default(getViewModel(), lifecycle2, (Lifecycle.State) null, this.watcher, 2, (Object) null);
        Flow<ChatPanelActionsEvent> panelActionsEvents = getViewModel().getPanelActionsEvents();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "<get-lifecycle>(...)");
        Flow flowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(panelActionsEvents, lifecycle3, null, 2, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatFragment$onViewCreated$lambda$9$lambda$8$$inlined$collectIn$default$1(flowWithLifecycle$default, null, this));
    }

    @Override // com.ifriend.base.app.activity.FlowFragment, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().onResume();
        getInternalNotificationHandlersRegister().register("ChatScreen", createInternalNotificationHandler(getViewLifecycleOwner().getLifecycle(), getShowRateAppDialog()));
    }

    private final InternalNotificationHandler createInternalNotificationHandler(final Lifecycle lifecycle, final ShowRateAppDialog showRateAppDialog) {
        final FragmentManager childFragmentManager = getChildFragmentManager();
        final int i = R.id.chatFragmentContainer;
        return new RootNavigationFragmentInternalNotificationHandler(showRateAppDialog, childFragmentManager, i) { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$createInternalNotificationHandler$1
            final /* synthetic */ ShowRateAppDialog $showRateAppDialog;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(childFragmentManager, Lifecycle.this, i);
                this.$showRateAppDialog = showRateAppDialog;
                Intrinsics.checkNotNull(childFragmentManager);
            }

            @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
            public boolean handle(InternalNotification notification) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                if (notification instanceof RateAppInternalNotification) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(Lifecycle.this), null, null, new ChatFragment$createInternalNotificationHandler$1$handle$1(this.$showRateAppDialog, null), 3, null);
                    return true;
                }
                return false;
            }
        };
    }

    public final ChooseVoicePopupDelegate getChooseVoicePopupDelegate() {
        ChooseVoicePopupDelegate chooseVoicePopupDelegate = this.chooseVoicePopupDelegate;
        if (chooseVoicePopupDelegate != null) {
            return chooseVoicePopupDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chooseVoicePopupDelegate");
        return null;
    }

    public final void setChooseVoicePopupDelegate(ChooseVoicePopupDelegate chooseVoicePopupDelegate) {
        Intrinsics.checkNotNullParameter(chooseVoicePopupDelegate, "<set-?>");
        this.chooseVoicePopupDelegate = chooseVoicePopupDelegate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ChatViewModel viewModel = getViewModel();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        viewModel.onStart(requireContext);
    }

    @Override // com.ifriend.base.app.activity.FlowFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getViewModel().onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewModel().onDestroy();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] permissions2, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions2, grantResults);
        ChatFragmentPermissionsDispatcher.onRequestPermissionsResult(this, i, grantResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAllowMicrophoneDialog() {
        final AlertDialog create = new AlertDialog.Builder(getActivity()).create();
        create.setTitle(getString(R.string.allow_microphone_access_in_device_settings));
        create.setMessage(getString(R.string.ifriend_uses_your_microphone));
        create.setButton(-1, getString(R.string.open_settings), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatFragment.showAllowMicrophoneDialog$lambda$12$lambda$10(create, dialogInterface, i);
            }
        });
        create.setButton(-2, getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAllowMicrophoneDialog$lambda$12$lambda$10(AlertDialog alertDialog, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Context context = alertDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextKt.openAppSettings(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSendImageDialog() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        String[] strArr = {getString(R.string.take_photo), getString(R.string.choose_from_library)};
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(getString(R.string.select_media)).setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatFragment.showSendImageDialog$lambda$14$lambda$13(ChatFragment.this, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.setButton(-2, getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSendImageDialog$lambda$14$lambda$13(ChatFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            ChatFragmentPermissionsDispatcher.makePhotoClickWithPermissionCheck(this$0);
            dialogInterface.dismiss();
        } else if (i == 1) {
            if (Build.VERSION.SDK_INT >= 33) {
                ChatFragmentPermissionsDispatcher.sendImageFromGalleryClickApi33WithPermissionCheck(this$0);
            } else {
                ChatFragmentPermissionsDispatcher.sendImageFromGalleryClickWithPermissionCheck(this$0);
            }
            dialogInterface.dismiss();
        } else {
            dialogInterface.dismiss();
        }
    }

    public final void sendImageFromGalleryClickApi33() {
        ImagePickerObserver imagePickerObserver = this.imagePickerObserver;
        if (imagePickerObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePickerObserver");
            imagePickerObserver = null;
        }
        imagePickerObserver.selectImage();
    }

    public final void sendImageFromGalleryClick() {
        ImagePickerObserver imagePickerObserver = this.imagePickerObserver;
        if (imagePickerObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePickerObserver");
            imagePickerObserver = null;
        }
        imagePickerObserver.selectImage();
    }

    public final void showAllowGalleryDialog() {
        final AlertDialog create = new AlertDialog.Builder(getActivity()).create();
        create.setTitle(getString(R.string.allow_access_to_photos));
        create.setButton(-1, getString(R.string.open_settings), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatFragment.showAllowGalleryDialog$lambda$19$lambda$17(create, dialogInterface, i);
            }
        });
        create.setButton(-2, getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAllowGalleryDialog$lambda$19$lambda$17(AlertDialog alertDialog, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Context context = alertDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextKt.openAppSettings(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPreviewSendImage(Uri uri) {
        if (uri == null) {
            return;
        }
        ImagePickerObserver imagePickerObserver = this.imagePickerObserver;
        if (imagePickerObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePickerObserver");
            imagePickerObserver = null;
        }
        getRouter().navigateTo(new PreviewSendImageScreen(uri, imagePickerObserver, getChatId()));
    }

    public final void makePhotoClick() {
        getRouter().navigateTo(new PreviewSendImageScreen(null, null, getChatId(), 2, null));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.ifriend.presentation.common.uistate.UiStateWatcher<com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$UiState>, com.ifriend.presentation.common.uistate.UiStateWatcher, T] */
    public ChatFragment() {
        super(R.layout.fragment_chat);
        this.flowFragmentDelegate$delegate = LazyKt.lazy(new ChatFragment$flowFragmentDelegate$2(this));
        this.backgroundDelegateManager$delegate = LazyKt.lazy(new ChatFragment$backgroundDelegateManager$2(this));
        this.containerTag = RouterProviderImplKt.CHAT_CICERONE_TAG;
        final ChatFragment chatFragment = this;
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(chatFragment, new ChatFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        this.chatId$delegate = LazyKt.lazy(new ChatFragment$chatId$2(this));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ChatFragment$special$$inlined$viewModels$default$2(new ChatFragment$special$$inlined$viewModels$default$1(chatFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(chatFragment, Reflection.getOrCreateKotlinClass(ChatViewModel.class), new ChatFragment$special$$inlined$viewModels$default$3(lazy), new ChatFragment$special$$inlined$viewModels$default$4(null, lazy), new ChatFragment$viewModel$2(this));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        chatFragment.getLifecycle().addObserver(new DefaultLifecycleObserver(chatFragment) { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$special$$inlined$uiStateWatcher$1
            final /* synthetic */ Fragment $this_uiStateWatcher;
            private final Observer<LifecycleOwner> viewLifecycleOwnerLiveDataObserver;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            {
                this.$this_uiStateWatcher = chatFragment;
                this.viewLifecycleOwnerLiveDataObserver = new Observer<LifecycleOwner>() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$special$$inlined$uiStateWatcher$1.1
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(LifecycleOwner lifecycleOwner) {
                        if (lifecycleOwner == null) {
                            return;
                        }
                        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                        final Ref.ObjectRef objectRef2 = Ref.ObjectRef.this;
                        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$special$.inlined.uiStateWatcher.1.1.1
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public void onDestroy(LifecycleOwner owner) {
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                UiStateWatcher uiStateWatcher = (UiStateWatcher) Ref.ObjectRef.this.element;
                                if (uiStateWatcher != null) {
                                    uiStateWatcher.clear();
                                }
                            }
                        });
                    }
                };
            }

            public final Observer<LifecycleOwner> getViewLifecycleOwnerLiveDataObserver() {
                return this.viewLifecycleOwnerLiveDataObserver;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.$this_uiStateWatcher.getViewLifecycleOwnerLiveData().observeForever(this.viewLifecycleOwnerLiveDataObserver);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.$this_uiStateWatcher.getViewLifecycleOwnerLiveData().removeObserver(this.viewLifecycleOwnerLiveDataObserver);
                Ref.ObjectRef.this.element = null;
            }
        });
        UiStateWatcher.Builder builder = new UiStateWatcher.Builder();
        builder.invoke(ChatFragment$watcher$1$1.INSTANCE, new ChatFragment$watcher$1$2(this));
        ?? build = builder.build();
        objectRef.element = build;
        this.watcher = build;
    }
}
