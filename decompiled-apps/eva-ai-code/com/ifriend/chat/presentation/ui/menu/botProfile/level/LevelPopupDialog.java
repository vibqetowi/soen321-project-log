package com.ifriend.chat.presentation.ui.menu.botProfile.level;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.compose.DialogNavigator;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.LevelsAnalytics;
import com.ifriend.chat.presentation.databinding.LevelPopupDialogBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.popup.api.CommonPopupResultModel;
import com.ifriend.popup.api.PopupResultModelKt;
import com.ifriend.ui.R;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.utils.UIUtils;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
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
/* compiled from: LevelPopupDialog.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/LevelPopupDialogBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/LevelPopupDialogBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onCancel", "", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "resultForCommon", "result", "Lcom/ifriend/popup/api/CommonPopupResultModel;", "showState", "state", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupState;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelPopupDialog extends DialogFragment {
    private final ViewBindingProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LevelPopupDialog.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/LevelPopupDialogBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final LevelPopupDialogBinding getBinding() {
        return (LevelPopupDialogBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
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

    private final LevelPopupViewModel getViewModel() {
        return (LevelPopupViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
        setStyle(2, R.style.DimDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(com.ifriend.chat.presentation.R.layout.level_popup_dialog, viewGroup);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        StateFlow<LevelPopupState> state = getViewModel().getState();
        LevelPopupDialog$onViewCreated$1 levelPopupDialog$onViewCreated$1 = new LevelPopupDialog$onViewCreated$1(this);
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new LevelPopupDialog$onViewCreated$$inlined$launchWithLifecycle$default$1(state, viewLifecycleOwner, state2, levelPopupDialog$onViewCreated$1, null), 3, null);
        getBinding().popupActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LevelPopupDialog.onViewCreated$lambda$0(LevelPopupDialog.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onViewCreated$showState(LevelPopupDialog levelPopupDialog, LevelPopupState levelPopupState, Continuation continuation) {
        levelPopupDialog.showState(levelPopupState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(LevelPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelsAnalytics.INSTANCE.progressBarModalButtonClick();
        this$0.dismiss();
    }

    private final void showState(LevelPopupState levelPopupState) {
        LevelPopupDialogBinding binding = getBinding();
        binding.popupTitle.setText(getString(com.ifriend.chat.presentation.R.string.level_popup_title, levelPopupState.getBotName()));
        if (levelPopupState.getAvatar() != null) {
            RequestOptions optionalTransform = new RequestOptions().optionalTransform(new RoundedCorners((int) UIUtils.INSTANCE.getToPx((Number) 1000)));
            Intrinsics.checkNotNullExpressionValue(optionalTransform, "run(...)");
            Glide.with(binding.avatar.getContext()).load(levelPopupState.getAvatar()).apply((BaseRequestOptions<?>) optionalTransform).into(binding.avatar);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        resultForCommon(CommonPopupResultModel.CANCEL);
    }

    private final void resultForCommon(CommonPopupResultModel commonPopupResultModel) {
        getParentFragmentManager().setFragmentResult(String.valueOf(getTag()), BundleKt.bundleOf(TuplesKt.to(PopupResultModelKt.CommonPopupResultKey, commonPopupResultModel)));
    }

    /* compiled from: LevelPopupDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupDialog$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupDialog;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LevelPopupDialog newInstance() {
            return new LevelPopupDialog();
        }
    }

    public LevelPopupDialog() {
        LevelPopupDialog levelPopupDialog = this;
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(levelPopupDialog, new LevelPopupDialog$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new LevelPopupDialog$special$$inlined$viewModels$default$2(new LevelPopupDialog$special$$inlined$viewModels$default$1(levelPopupDialog)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(levelPopupDialog, Reflection.getOrCreateKotlinClass(LevelPopupViewModel.class), new LevelPopupDialog$special$$inlined$viewModels$default$3(lazy), new LevelPopupDialog$special$$inlined$viewModels$default$4(null, lazy), new LevelPopupDialog$viewModel$2(this));
    }
}
