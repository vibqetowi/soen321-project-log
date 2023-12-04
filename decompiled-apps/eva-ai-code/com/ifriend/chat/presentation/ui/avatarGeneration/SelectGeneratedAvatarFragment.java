package com.ifriend.chat.presentation.ui.avatarGeneration;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentSelectGeneratedAvatarBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.BotProfileScreen;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.utils.DebouncedClickListenerKt;
import com.ifriend.ui.utils.UIUtils;
import com.ifriend.ui.utils.extensions.ViewKt;
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
/* compiled from: SelectGeneratedAvatarFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0014J\u0012\u0010'\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\u001a\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u0002002\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0016\u00101\u001a\u00020#2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u0003H\u0016J\b\u00107\u001a\u00020#H\u0002J\b\u00108\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006:"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "()V", "adapter", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/AvatarAdapter;", "appbarOffsetListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentSelectGeneratedAvatarBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentSelectGeneratedAvatarBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "getGenerateBotAvatarScreenFactory", "()Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "setGenerateBotAvatarScreenFactory", "(Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;)V", "scrollListener", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "goBack", "", "initOnClickListeners", "initRecycler", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "showErrors", "errors", "", "", "showState", "state", "startGenerateAgainButtonRotation", "updateGenerateAgainVisibility", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarFragment extends FragmentBaseView<SelectGeneratedAvatarViewModel, SelectGeneratedAvatarState> {
    private final AvatarAdapter adapter;
    private final AppBarLayout.OnOffsetChangedListener appbarOffsetListener;
    private final ReadOnlyProperty binding$delegate;
    @Inject
    public GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final NestedScrollView.OnScrollChangeListener scrollListener;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SelectGeneratedAvatarFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentSelectGeneratedAvatarBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int marginBetweenGenerateButtonAndLastAvatar = (int) UIUtils.INSTANCE.getToPx((Number) 32);

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    /* compiled from: SelectGeneratedAvatarFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarFragment$Companion;", "", "()V", "marginBetweenGenerateButtonAndLastAvatar", "", "newInstance", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectGeneratedAvatarFragment newInstance() {
            return new SelectGeneratedAvatarFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public SelectGeneratedAvatarViewModel getViewModel() {
        return (SelectGeneratedAvatarViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSelectGeneratedAvatarBinding getBinding() {
        return (FragmentSelectGeneratedAvatarBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appbarOffsetListener$lambda$0(SelectGeneratedAvatarFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i + appBarLayout.getHeight() > marginBetweenGenerateButtonAndLastAvatar) {
            TextView avatarTryAgainPrice = this$0.getBinding().avatarTryAgainPrice;
            Intrinsics.checkNotNullExpressionValue(avatarTryAgainPrice, "avatarTryAgainPrice");
            avatarTryAgainPrice.setVisibility(8);
            this$0.getBinding().generateAgain.hide();
            return;
        }
        this$0.updateGenerateAgainVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollListener$lambda$1(SelectGeneratedAvatarFragment this$0, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "<anonymous parameter 0>");
        if (i4 < i2) {
            this$0.updateGenerateAgainVisibility();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(SelectGeneratedAvatarState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isLoading()) {
            showLoading();
        } else {
            hideLoading();
        }
        FragmentSelectGeneratedAvatarBinding binding = getBinding();
        if (this.adapter.getGeneratedAvatars().isEmpty()) {
            this.adapter.setGeneratedAvatars(state.getGeneratedAvatars());
        }
        ImageView close = binding.close;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        ViewKt.expandClickableArea$default(close, 0, 1, null);
        binding.avatarDescription.setText(state.getAvatarDescription());
        ImageView editDescriptionIcon = binding.editDescriptionIcon;
        Intrinsics.checkNotNullExpressionValue(editDescriptionIcon, "editDescriptionIcon");
        ImageView imageView = editDescriptionIcon;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = binding.avatarDescription.getLineCount() <= 1 ? R.id.avatar_description : -1;
        imageView.setLayoutParams(layoutParams2);
        ProgressBar loader = getBinding().loader;
        Intrinsics.checkNotNullExpressionValue(loader, "loader");
        loader.setVisibility(state.getGeneratedAvatars().isEmpty() ? 0 : 8);
        if (state.getTryAgainPrice() != null && state.getTryAgainPrice().intValue() > 0) {
            binding.avatarTryAgainPrice.setText(getString(R.string.try_again_for_n_neurons, state.getTryAgainPrice()));
            TextView avatarTryAgainPrice = binding.avatarTryAgainPrice;
            Intrinsics.checkNotNullExpressionValue(avatarTryAgainPrice, "avatarTryAgainPrice");
            avatarTryAgainPrice.setVisibility(0);
            return;
        }
        TextView avatarTryAgainPrice2 = binding.avatarTryAgainPrice;
        Intrinsics.checkNotNullExpressionValue(avatarTryAgainPrice2, "avatarTryAgainPrice");
        avatarTryAgainPrice2.setVisibility(8);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            getViewModel().init(getBinding().avatars.getMeasuredWidth());
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    SelectGeneratedAvatarFragment.this.getViewModel().init(SelectGeneratedAvatarFragment.this.getBinding().avatars.getMeasuredWidth());
                }
            });
        }
        FragmentSelectGeneratedAvatarBinding binding = getBinding();
        binding.avatars.setAdapter(this.adapter);
        ImageView close = binding.close;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        ViewKt.expandClickableArea$default(close, 0, 1, null);
        binding.close.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectGeneratedAvatarFragment.onViewCreated$lambda$6$lambda$5(SelectGeneratedAvatarFragment.this, view2);
            }
        });
        initRecycler();
        initOnClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6$lambda$5(SelectGeneratedAvatarFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goBack();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
        goBack();
    }

    private final void goBack() {
        getRouter().transformCurrentChain(BotProfileScreen.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getBinding().appbar.addOnOffsetChangedListener(this.appbarOffsetListener);
        getBinding().nestedScroll.setOnScrollChangeListener(this.scrollListener);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().clearAvatarGeneratedNotification();
        getInternalNotificationHandlersRegister().register("SelectGeneratedAvatar", SelectAvatarInternalNotificationHandlerKt.createInternalNotificationHandler(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getViewModel().clearAvatarGeneratedNotification();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getBinding().appbar.removeOnOffsetChangedListener(this.appbarOffsetListener);
        hideLoading();
    }

    private final void updateGenerateAgainVisibility() {
        FragmentSelectGeneratedAvatarBinding binding = getBinding();
        if (((float) (binding.nestedScroll.getHeight() + binding.nestedScroll.getScrollY())) >= ((float) binding.avatars.getHeight()) - getResources().getDimension(com.ifriend.ui.R.dimen.generate_avatar_again_bottom_margin)) {
            TextView avatarTryAgainPrice = binding.avatarTryAgainPrice;
            Intrinsics.checkNotNullExpressionValue(avatarTryAgainPrice, "avatarTryAgainPrice");
            avatarTryAgainPrice.setVisibility(0);
            binding.generateAgain.show();
            return;
        }
        TextView avatarTryAgainPrice2 = binding.avatarTryAgainPrice;
        Intrinsics.checkNotNullExpressionValue(avatarTryAgainPrice2, "avatarTryAgainPrice");
        avatarTryAgainPrice2.setVisibility(8);
        binding.generateAgain.hide();
    }

    private final void initOnClickListeners() {
        FragmentSelectGeneratedAvatarBinding binding = getBinding();
        FloatingActionButton generateAgain = binding.generateAgain;
        Intrinsics.checkNotNullExpressionValue(generateAgain, "generateAgain");
        DebouncedClickListenerKt.setDebouncedOnClickListener(generateAgain, new SelectGeneratedAvatarFragment$initOnClickListeners$1$1(this));
        ImageView editDescriptionIcon = binding.editDescriptionIcon;
        Intrinsics.checkNotNullExpressionValue(editDescriptionIcon, "editDescriptionIcon");
        DebouncedClickListenerKt.setDebouncedOnClickListener(editDescriptionIcon, new SelectGeneratedAvatarFragment$initOnClickListeners$1$2(binding, this));
    }

    private final void initRecycler() {
        FragmentSelectGeneratedAvatarBinding binding = getBinding();
        binding.avatars.setLayoutManager(new LinearLayoutManager(binding.avatars.getContext(), 1, false));
        binding.avatars.addItemDecoration(new LinearSpacingItemDecoration((int) UIUtils.INSTANCE.getToPx((Number) 24)));
        binding.avatars.addItemDecoration(new LastItemBottomSpacingDecoration((int) UIUtils.INSTANCE.getToPx((Number) 178)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGenerateAgainButtonRotation() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1200L);
        rotateAnimation.setRepeatCount(-1);
        Animation animation = getBinding().generateAgain.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        getBinding().generateAgain.startAnimation(rotateAnimation);
    }

    public SelectGeneratedAvatarFragment() {
        super(R.layout.fragment_select_generated_avatar);
        SelectGeneratedAvatarFragment selectGeneratedAvatarFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new SelectGeneratedAvatarFragment$special$$inlined$viewModels$default$2(new SelectGeneratedAvatarFragment$special$$inlined$viewModels$default$1(selectGeneratedAvatarFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(selectGeneratedAvatarFragment, Reflection.getOrCreateKotlinClass(SelectGeneratedAvatarViewModel.class), new SelectGeneratedAvatarFragment$special$$inlined$viewModels$default$3(lazy), new SelectGeneratedAvatarFragment$special$$inlined$viewModels$default$4(null, lazy), new SelectGeneratedAvatarFragment$viewModel$2(this));
        this.binding$delegate = new ViewBindingDelegate(selectGeneratedAvatarFragment, Reflection.getOrCreateKotlinClass(FragmentSelectGeneratedAvatarBinding.class));
        this.appbarOffsetListener = new AppBarLayout.OnOffsetChangedListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment$$ExternalSyntheticLambda0
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                SelectGeneratedAvatarFragment.appbarOffsetListener$lambda$0(SelectGeneratedAvatarFragment.this, appBarLayout, i);
            }
        };
        this.scrollListener = new NestedScrollView.OnScrollChangeListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment$$ExternalSyntheticLambda1
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                SelectGeneratedAvatarFragment.scrollListener$lambda$1(SelectGeneratedAvatarFragment.this, nestedScrollView, i, i2, i3, i4);
            }
        };
        this.adapter = new AvatarAdapter(new SelectGeneratedAvatarFragment$adapter$1(this));
    }
}
