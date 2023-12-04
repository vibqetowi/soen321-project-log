package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.domain.chat.reset.ResetAiPeriod;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentResetBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialog;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.utils.Modification;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: ResetFragment.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010.\u001a\u00020%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%002\u0006\u00101\u001a\u000202H\u0002J\u0016\u00103\u001a\u00020%2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0016J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u0003H\u0016J\f\u00109\u001a\u00020%*\u00020\fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006;"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetState;", "()V", "appFlowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getAppFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setAppFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentResetBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentResetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bottomDialog", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialog;", "chatScreenFactory", "Lcom/ifriend/chat/api/ChatScreenFactory;", "getChatScreenFactory", "()Lcom/ifriend/chat/api/ChatScreenFactory;", "setChatScreenFactory", "(Lcom/ifriend/chat/api/ChatScreenFactory;)V", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "confirmErase", "", TypedValues.CycleType.S_WAVE_PERIOD, "Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openEraseDialog", "openMenu", "onPositiveClickListener", "Lkotlin/Function0;", "positiveText", "", "showErrors", "errors", "", "", "showState", "state", "initOnClickListeners", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetFragment extends FragmentBaseView<ResetViewModel, ResetState> {
    @Inject
    public AppFlowCoordinator appFlowCoordinator;
    private final ReadOnlyProperty binding$delegate;
    private BottomDialog bottomDialog;
    @Inject
    public ChatScreenFactory chatScreenFactory;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ResetFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentResetBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ResetFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResetAiPeriod.values().length];
            try {
                iArr[ResetAiPeriod.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResetAiPeriod.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResetAiPeriod.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    public ResetFragment() {
        super(R.layout.fragment_reset);
        ResetFragment resetFragment = this;
        this.binding$delegate = new ViewBindingDelegate(resetFragment, Reflection.getOrCreateKotlinClass(FragmentResetBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ResetFragment$special$$inlined$viewModels$default$2(new ResetFragment$special$$inlined$viewModels$default$1(resetFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(resetFragment, Reflection.getOrCreateKotlinClass(ResetViewModel.class), new ResetFragment$special$$inlined$viewModels$default$3(lazy), new ResetFragment$special$$inlined$viewModels$default$4(null, lazy), new ResetFragment$special$$inlined$viewModels$default$5(resetFragment, lazy));
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

    public final ChatScreenFactory getChatScreenFactory() {
        ChatScreenFactory chatScreenFactory = this.chatScreenFactory;
        if (chatScreenFactory != null) {
            return chatScreenFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatScreenFactory");
        return null;
    }

    public final void setChatScreenFactory(ChatScreenFactory chatScreenFactory) {
        Intrinsics.checkNotNullParameter(chatScreenFactory, "<set-?>");
        this.chatScreenFactory = chatScreenFactory;
    }

    public final AppFlowCoordinator getAppFlowCoordinator() {
        AppFlowCoordinator appFlowCoordinator = this.appFlowCoordinator;
        if (appFlowCoordinator != null) {
            return appFlowCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appFlowCoordinator");
        return null;
    }

    public final void setAppFlowCoordinator(AppFlowCoordinator appFlowCoordinator) {
        Intrinsics.checkNotNullParameter(appFlowCoordinator, "<set-?>");
        this.appFlowCoordinator = appFlowCoordinator;
    }

    /* compiled from: ResetFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResetFragment newInstance() {
            return new ResetFragment();
        }
    }

    private final FragmentResetBinding getBinding() {
        return (FragmentResetBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public ResetViewModel getViewModel() {
        return (ResetViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        ((ResetViewModel) new ViewModelProvider(this, getViewModelFactory()).get(ResetViewModel.class)).init();
        initOnClickListeners(getBinding());
    }

    private final void initOnClickListeners(FragmentResetBinding fragmentResetBinding) {
        ImageView imageView = fragmentResetBinding.back;
        Intrinsics.checkNotNull(imageView);
        ImageView imageView2 = imageView;
        ViewKt.expandClickableArea$default(imageView2, 0, 1, null);
        Modification.INSTANCE.onTouchOpacity(imageView2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetFragment.initOnClickListeners$lambda$2$lambda$1(ResetFragment.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        ConstraintLayout eraseLastHour = fragmentResetBinding.eraseLastHour;
        Intrinsics.checkNotNullExpressionValue(eraseLastHour, "eraseLastHour");
        modification.onTouchOpacity(eraseLastHour);
        Modification modification2 = Modification.INSTANCE;
        ConstraintLayout eraseLast24Hours = fragmentResetBinding.eraseLast24Hours;
        Intrinsics.checkNotNullExpressionValue(eraseLast24Hours, "eraseLast24Hours");
        modification2.onTouchOpacity(eraseLast24Hours);
        Modification modification3 = Modification.INSTANCE;
        ConstraintLayout eraseAll = fragmentResetBinding.eraseAll;
        Intrinsics.checkNotNullExpressionValue(eraseAll, "eraseAll");
        modification3.onTouchOpacity(eraseAll);
        fragmentResetBinding.eraseLastHour.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetFragment.initOnClickListeners$lambda$3(ResetFragment.this, view);
            }
        });
        fragmentResetBinding.eraseLast24Hours.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetFragment.initOnClickListeners$lambda$4(ResetFragment.this, view);
            }
        });
        fragmentResetBinding.eraseAll.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetFragment.initOnClickListeners$lambda$5(ResetFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$2$lambda$1(ResetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$3(ResetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openEraseDialog(ResetAiPeriod.HOUR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$4(ResetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openEraseDialog(ResetAiPeriod.DAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$5(ResetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openEraseDialog(ResetAiPeriod.ALL);
    }

    private final void openMenu(Function0<Unit> function0, String str) {
        Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ResetFragment$openMenu$1$1(this, context, str, function0, null), 3, null);
        }
    }

    private final void openEraseDialog(ResetAiPeriod resetAiPeriod) {
        String string;
        int i = WhenMappings.$EnumSwitchMapping$0[resetAiPeriod.ordinal()];
        if (i == 1) {
            string = getString(R.string.erase_all);
        } else if (i == 2) {
            string = getString(R.string.erase_last_24_hours);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            string = getString(R.string.erase_last_hour);
        }
        Intrinsics.checkNotNull(string);
        openMenu(new ResetFragment$openEraseDialog$1(this, resetAiPeriod), string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmErase(ResetAiPeriod resetAiPeriod) {
        CoroutinesKt.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ResetFragment$confirmErase$1(this, resetAiPeriod, null), 3, null);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(ResetState state) {
        String string;
        Intrinsics.checkNotNullParameter(state, "state");
        Bot bot = state.getBot();
        String name = bot != null ? bot.getName() : null;
        Bot bot2 = state.getBot();
        if ((bot2 != null ? bot2.getGender() : null) == Gender.MALE) {
            string = getString(R.string.his);
        } else {
            string = getString(R.string.her);
        }
        Intrinsics.checkNotNull(string);
        getBinding().title.setText(getString(R.string.reset, name));
        getBinding().description.setText(getString(R.string.reset_description, name, string));
    }
}
