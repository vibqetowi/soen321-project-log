package com.ifriend.chat.presentation.ui.rateApp;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentRateAppBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.rateApp.RateAppState;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.BaseEvent;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIHelper;
import com.ifriend.ui.utils.UIUtils;
import com.ifriend.ui.utils.UIUtilsKt;
import com.ifriend.ui.utils.extensions.ViewKt;
import com.ifriend.ui.view.rate.RateAppView;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: RateAppFragment.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010%\u001a\u00020*H\u0002J\f\u0010+\u001a\u00020\u0019*\u00020\u001fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentRateAppBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentRateAppBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "lastSetMaxCharacterCount", "", "Ljava/lang/Integer;", "viewModel", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/rateApp/RateAppViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "handleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/ui/base/mvvm/BaseEvent;", "onBackPressed", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setFilters", "maxCharacterCount", "showReviewState", "state", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$ReviewState;", "showStarsState", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$StarsState;", "showState", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "setUpExitOnClick", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateAppFragment extends BaseFragment {
    private final ViewBindingProperty binding$delegate;
    private Integer lastSetMaxCharacterCount;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RateAppFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentRateAppBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RateAppFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RateAppFragment newInstance() {
            return new RateAppFragment();
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final RateAppViewModel getViewModel() {
        return (RateAppViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentRateAppBinding getBinding() {
        return (FragmentRateAppBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        FragmentRateAppBinding binding = getBinding();
        ImageView popupClose = binding.popupClose;
        Intrinsics.checkNotNullExpressionValue(popupClose, "popupClose");
        setUpExitOnClick(popupClose);
        TextView notNowRate = binding.notNowRate;
        Intrinsics.checkNotNullExpressionValue(notNowRate, "notNowRate");
        setUpExitOnClick(notNowRate);
        binding.sendReview.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.rateApp.RateAppFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RateAppFragment.onViewCreated$lambda$3$lambda$0(RateAppFragment.this, view2);
            }
        });
        Modification modification = Modification.INSTANCE;
        AppCompatButton sendReview = binding.sendReview;
        Intrinsics.checkNotNullExpressionValue(sendReview, "sendReview");
        modification.onTouchOpacity(sendReview);
        binding.sendReviewMessage.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.rateApp.RateAppFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RateAppFragment.onViewCreated$lambda$3$lambda$1(RateAppFragment.this, view2);
            }
        });
        Modification modification2 = Modification.INSTANCE;
        AppCompatButton sendReviewMessage = binding.sendReviewMessage;
        Intrinsics.checkNotNullExpressionValue(sendReviewMessage, "sendReviewMessage");
        modification2.onTouchOpacity(sendReviewMessage);
        binding.rateAppView.setOnStarsChangedListener(new RateAppFragment$onViewCreated$1$3(this));
        Modification modification3 = Modification.INSTANCE;
        RateAppView rateAppView = binding.rateAppView;
        Intrinsics.checkNotNullExpressionValue(rateAppView, "rateAppView");
        modification3.onTouchOpacity(rateAppView);
        EditText reviewInput = binding.reviewInput;
        Intrinsics.checkNotNullExpressionValue(reviewInput, "reviewInput");
        reviewInput.addTextChangedListener(new TextWatcher() { // from class: com.ifriend.chat.presentation.ui.rateApp.RateAppFragment$onViewCreated$lambda$3$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                RateAppViewModel viewModel;
                viewModel = RateAppFragment.this.getViewModel();
                viewModel.reviewInput(String.valueOf(charSequence));
            }
        });
        StateFlow<RateAppState> state = getViewModel().getState();
        RateAppFragment$onViewCreated$2 rateAppFragment$onViewCreated$2 = new RateAppFragment$onViewCreated$2(this);
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        RateAppFragment rateAppFragment = this;
        LifecycleOwner viewLifecycleOwner = rateAppFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$1(state, viewLifecycleOwner, state2, rateAppFragment$onViewCreated$2, null), 3, null);
        Lifecycle.State state3 = Lifecycle.State.STARTED;
        LifecycleOwner viewLifecycleOwner2 = rateAppFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$2(getViewModel().getEvents(), viewLifecycleOwner2, state3, new RateAppFragment$onViewCreated$3(this), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$0(RateAppFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleSendReview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$1(RateAppFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleSendReviewMessage();
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onViewCreated$showState(RateAppFragment rateAppFragment, RateAppState rateAppState, Continuation continuation) {
        rateAppFragment.showState(rateAppState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onViewCreated$handleEvent(RateAppFragment rateAppFragment, BaseEvent baseEvent, Continuation continuation) {
        rateAppFragment.handleEvent(baseEvent);
        return Unit.INSTANCE;
    }

    private final void setUpExitOnClick(View view) {
        ViewKt.expandClickableArea$default(view, 0, 1, null);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.rateApp.RateAppFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RateAppFragment.setUpExitOnClick$lambda$4(RateAppFragment.this, view2);
            }
        });
        Modification.INSTANCE.onTouchOpacity(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpExitOnClick$lambda$4(RateAppFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onCancel();
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
        super.onBackPressed();
        getViewModel().onCancel();
    }

    private final void showState(RateAppState rateAppState) {
        if (rateAppState instanceof RateAppState.StarsState) {
            showStarsState((RateAppState.StarsState) rateAppState);
        } else if (rateAppState instanceof RateAppState.ReviewState) {
            showReviewState((RateAppState.ReviewState) rateAppState);
        }
    }

    private final void showStarsState(RateAppState.StarsState starsState) {
        int color;
        FragmentRateAppBinding binding = getBinding();
        ConstraintLayout mainContainerRate = binding.mainContainerRate;
        Intrinsics.checkNotNullExpressionValue(mainContainerRate, "mainContainerRate");
        mainContainerRate.setVisibility(0);
        ConstraintLayout messageContainerRate = binding.messageContainerRate;
        Intrinsics.checkNotNullExpressionValue(messageContainerRate, "messageContainerRate");
        messageContainerRate.setVisibility(8);
        binding.rateAppView.setState(starsState.getStars());
        binding.sendReview.setEnabled(starsState.getStars() != null);
        Context context = getContext();
        if (context == null) {
            return;
        }
        Intrinsics.checkNotNull(context);
        AppCompatButton appCompatButton = binding.sendReview;
        if (starsState.getStars() != null) {
            color = ContextCompat.getColor(context, R.color.button_text_enabled);
        } else {
            color = ContextCompat.getColor(context, R.color.button_text_disabled);
        }
        appCompatButton.setTextColor(color);
    }

    private final void showReviewState(RateAppState.ReviewState reviewState) {
        final FragmentRateAppBinding binding = getBinding();
        setFilters(reviewState.getMaxCharacterCount());
        if (binding.messageContainerRate.getVisibility() != 0) {
            binding.mainContainerRate.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: com.ifriend.chat.presentation.ui.rateApp.RateAppFragment$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    RateAppFragment.showReviewState$lambda$8$lambda$7(FragmentRateAppBinding.this);
                }
            }).start();
        }
        binding.sendReviewMessage.setEnabled(reviewState.getCurrentCharacterCount() > 0);
        int currentCharacterCount = reviewState.getCurrentCharacterCount();
        int maxCharacterCount = reviewState.getMaxCharacterCount();
        binding.rateSymbolCount.setText(currentCharacterCount + RemoteSettings.FORWARD_SLASH_STRING + maxCharacterCount);
        binding.rateSymbolCount.setAlpha(reviewState.getCurrentCharacterCount() == 0 ? 0.5f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showReviewState$lambda$8$lambda$7(FragmentRateAppBinding this_with) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ConstraintLayout mainContainerRate = this_with.mainContainerRate;
        Intrinsics.checkNotNullExpressionValue(mainContainerRate, "mainContainerRate");
        mainContainerRate.setVisibility(8);
        this_with.messageContainerRate.setTranslationY(this_with.getRoot().getHeight());
        ConstraintLayout messageContainerRate = this_with.messageContainerRate;
        Intrinsics.checkNotNullExpressionValue(messageContainerRate, "messageContainerRate");
        messageContainerRate.setVisibility(0);
        EditText editText = this_with.reviewInput;
        editText.requestFocus();
        UIHelper uIHelper = UIHelper.INSTANCE;
        Intrinsics.checkNotNull(editText);
        uIHelper.showKeyboard(editText);
        this_with.messageContainerRate.animate().translationY(0.0f).setDuration(300L).start();
    }

    private final void setFilters(int i) {
        Integer num = this.lastSetMaxCharacterCount;
        if (num != null && i == num.intValue()) {
            return;
        }
        this.lastSetMaxCharacterCount = Integer.valueOf(i);
        getBinding().reviewInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i), UIUtils.INSTANCE.disableMultipleSpacesAndNewLinesIntentFilter()});
    }

    private final void handleEvent(BaseEvent baseEvent) {
        if (Intrinsics.areEqual(baseEvent, OpenStore.INSTANCE)) {
            getRouter().exit();
            Context context = getContext();
            if (context != null) {
                UIUtilsKt.openAppOnMarket(context);
            }
        }
    }

    public RateAppFragment() {
        super(R.layout.fragment_rate_app);
        RateAppFragment rateAppFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new RateAppFragment$special$$inlined$viewModels$default$2(new RateAppFragment$special$$inlined$viewModels$default$1(rateAppFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(rateAppFragment, Reflection.getOrCreateKotlinClass(RateAppViewModel.class), new RateAppFragment$special$$inlined$viewModels$default$3(lazy), new RateAppFragment$special$$inlined$viewModels$default$4(null, lazy), new RateAppFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(rateAppFragment, new RateAppFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
    }
}
