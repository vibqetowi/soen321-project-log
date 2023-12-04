package com.ifriend.chat.presentation.ui.avatarGeneration;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentGeneratingBotAvatarPlaceholderBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.BotProfileScreen;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: GeneratingBotAvatarPlaceholderFragment.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0014J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0016J\u001a\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0016\u0010,\u001a\u00020#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0003H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderState;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentGeneratingBotAvatarPlaceholderBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentGeneratingBotAvatarPlaceholderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "getGenerateBotAvatarScreenFactory", "()Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "setGenerateBotAvatarScreenFactory", "(Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;)V", "internalNotificationsRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "getInternalNotificationsRegister", "()Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "setInternalNotificationsRegister", "(Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "initOnClickListeners", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "showErrors", "errors", "", "", "showState", "state", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratingBotAvatarPlaceholderFragment extends FragmentBaseView<GeneratingBotAvatarPlaceholderViewModel, GeneratingBotAvatarPlaceholderState> {
    public static final String INTERNAL_NOTIFICATION_HANDLER = "generating_bot_avatar_screen";
    private final ReadOnlyProperty binding$delegate;
    @Inject
    public GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    @Inject
    public InternalNotificationHandlersRegister internalNotificationsRegister;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GeneratingBotAvatarPlaceholderFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentGeneratingBotAvatarPlaceholderBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    public GeneratingBotAvatarPlaceholderFragment() {
        super(R.layout.fragment_generating_bot_avatar_placeholder);
        GeneratingBotAvatarPlaceholderFragment generatingBotAvatarPlaceholderFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new GeneratingBotAvatarPlaceholderFragment$special$$inlined$viewModels$default$2(new GeneratingBotAvatarPlaceholderFragment$special$$inlined$viewModels$default$1(generatingBotAvatarPlaceholderFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(generatingBotAvatarPlaceholderFragment, Reflection.getOrCreateKotlinClass(GeneratingBotAvatarPlaceholderViewModel.class), new GeneratingBotAvatarPlaceholderFragment$special$$inlined$viewModels$default$3(lazy), new GeneratingBotAvatarPlaceholderFragment$special$$inlined$viewModels$default$4(null, lazy), new GeneratingBotAvatarPlaceholderFragment$viewModel$2(this));
        this.binding$delegate = new ViewBindingDelegate(generatingBotAvatarPlaceholderFragment, Reflection.getOrCreateKotlinClass(FragmentGeneratingBotAvatarPlaceholderBinding.class));
    }

    /* compiled from: GeneratingBotAvatarPlaceholderFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderFragment$Companion;", "", "()V", "INTERNAL_NOTIFICATION_HANDLER", "", "newInstance", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GeneratingBotAvatarPlaceholderFragment newInstance() {
            return new GeneratingBotAvatarPlaceholderFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public GeneratingBotAvatarPlaceholderViewModel getViewModel() {
        return (GeneratingBotAvatarPlaceholderViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentGeneratingBotAvatarPlaceholderBinding getBinding() {
        return (FragmentGeneratingBotAvatarPlaceholderBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final InternalNotificationHandlersRegister getInternalNotificationsRegister() {
        InternalNotificationHandlersRegister internalNotificationHandlersRegister = this.internalNotificationsRegister;
        if (internalNotificationHandlersRegister != null) {
            return internalNotificationHandlersRegister;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalNotificationsRegister");
        return null;
    }

    public final void setInternalNotificationsRegister(InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        Intrinsics.checkNotNullParameter(internalNotificationHandlersRegister, "<set-?>");
        this.internalNotificationsRegister = internalNotificationHandlersRegister;
    }

    public final GenerateBotAvatarScreenFactory getGenerateBotAvatarScreenFactory() {
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory = this.generateBotAvatarScreenFactory;
        if (generateBotAvatarScreenFactory != null) {
            return generateBotAvatarScreenFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generateBotAvatarScreenFactory");
        return null;
    }

    public final void setGenerateBotAvatarScreenFactory(GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory) {
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "<set-?>");
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
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
    public void showState(GeneratingBotAvatarPlaceholderState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().description.setText(getString(R.string.generating_avatars_can_take, state.getBotName()));
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().init();
        initOnClickListeners();
    }

    private final void initOnClickListeners() {
        getBinding().goToChat.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratingBotAvatarPlaceholderFragment.initOnClickListeners$lambda$2$lambda$1(GeneratingBotAvatarPlaceholderFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$2$lambda$1(GeneratingBotAvatarPlaceholderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
        getRouter().backTo(BotProfileScreen.INSTANCE);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getInternalNotificationsRegister().register(INTERNAL_NOTIFICATION_HANDLER, GeneratingAvatarInternalNotificationHandlerKt.createInternalNotificationHandler(this));
    }
}
