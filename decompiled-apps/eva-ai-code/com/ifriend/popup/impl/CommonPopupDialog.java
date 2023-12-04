package com.ifriend.popup.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.navigation.compose.DialogNavigator;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.popup.api.CommonPopupModel;
import com.ifriend.popup.api.CommonPopupResultModel;
import com.ifriend.popup.api.PopupResultModelKt;
import com.ifriend.popup.impl.databinding.FragmentPopupDialogBinding;
import com.ifriend.ui.base.dialog.BaseDialogFragment;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.utils.extensions.ViewKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: CommonPopupDialog.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, d2 = {"Lcom/ifriend/popup/impl/CommonPopupDialog;", "Lcom/ifriend/ui/base/dialog/BaseDialogFragment;", "()V", "binding", "Lcom/ifriend/popup/impl/databinding/FragmentPopupDialogBinding;", "getBinding", "()Lcom/ifriend/popup/impl/databinding/FragmentPopupDialogBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "popupModel", "Lcom/ifriend/popup/api/CommonPopupModel;", "getPopupModel", "()Lcom/ifriend/popup/api/CommonPopupModel;", "popupModel$delegate", "Lkotlin/Lazy;", "onCancel", "", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "resultForCommon", "result", "Lcom/ifriend/popup/api/CommonPopupResultModel;", "setupCommonPopup", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CommonPopupDialog extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CommonPopupDialog.class, "binding", "getBinding()Lcom/ifriend/popup/impl/databinding/FragmentPopupDialogBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    private static final String POPUP_MODEL_KEY = "POPUP_MODEL_KEY";
    private final Lazy popupModel$delegate = LazyKt.lazy(new CommonPopupDialog$popupModel$2(this));
    private final ViewBindingProperty binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(this, new CommonPopupDialog$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());

    protected final CommonPopupModel getPopupModel() {
        return (CommonPopupModel) this.popupModel$delegate.getValue();
    }

    protected final FragmentPopupDialogBinding getBinding() {
        return (FragmentPopupDialogBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_popup_dialog, viewGroup);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        boolean isCancelable = getPopupModel().isCancelable();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(isCancelable);
        }
        ImageView imageView = getBinding().popupClose;
        Intrinsics.checkNotNull(imageView);
        ImageView imageView2 = imageView;
        imageView2.setVisibility(isCancelable ? 0 : 8);
        if (isCancelable) {
            ViewKt.expandClickableArea$default(imageView2, 0, 1, null);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.CommonPopupDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommonPopupDialog.onViewCreated$lambda$1$lambda$0(CommonPopupDialog.this, view2);
            }
        });
        setupCommonPopup(getPopupModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(CommonPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        resultForCommon(CommonPopupResultModel.CANCEL);
    }

    private final void setupCommonPopup(final CommonPopupModel commonPopupModel) {
        FragmentPopupDialogBinding binding = getBinding();
        Group upgradeGroup = binding.upgradeGroup;
        Intrinsics.checkNotNullExpressionValue(upgradeGroup, "upgradeGroup");
        upgradeGroup.setVisibility(8);
        binding.popupTitle.setText(commonPopupModel.getTitle());
        ImageView popupIcon = binding.popupIcon;
        Intrinsics.checkNotNullExpressionValue(popupIcon, "popupIcon");
        popupIcon.setVisibility(commonPopupModel.getIcon() != null ? 0 : 8);
        Integer icon = commonPopupModel.getIcon();
        if (icon != null) {
            binding.popupIcon.setImageResource(icon.intValue());
        }
        TextView popupText = binding.popupText;
        Intrinsics.checkNotNullExpressionValue(popupText, "popupText");
        popupText.setVisibility(commonPopupModel.getText() != null ? 0 : 8);
        CharSequence text = commonPopupModel.getText();
        if (text != null) {
            binding.popupText.setText(text);
        }
        AppButton popupActionButton = binding.popupActionButton;
        Intrinsics.checkNotNullExpressionValue(popupActionButton, "popupActionButton");
        popupActionButton.setVisibility(commonPopupModel.getButtonText() != null ? 0 : 8);
        String buttonText = commonPopupModel.getButtonText();
        if (buttonText != null) {
            binding.popupActionButton.setText(buttonText);
        }
        binding.popupActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.CommonPopupDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonPopupDialog.setupCommonPopup$lambda$6$lambda$5(CommonPopupModel.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCommonPopup$lambda$6$lambda$5(CommonPopupModel popupModel, CommonPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(popupModel, "$popupModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (popupModel.getShouldDismissOnActionClick()) {
            this$0.dismiss();
        }
        this$0.resultForCommon(CommonPopupResultModel.ACTION_CLICK);
    }

    private final void resultForCommon(CommonPopupResultModel commonPopupResultModel) {
        getParentFragmentManager().setFragmentResult(String.valueOf(getTag()), BundleKt.bundleOf(TuplesKt.to(PopupResultModelKt.CommonPopupResultKey, commonPopupResultModel)));
    }

    /* compiled from: CommonPopupDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/popup/impl/CommonPopupDialog$Companion;", "", "()V", CommonPopupDialog.POPUP_MODEL_KEY, "", "newInstance", "Lcom/ifriend/popup/impl/CommonPopupDialog;", "popupModel", "Lcom/ifriend/popup/api/CommonPopupModel;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CommonPopupDialog newInstance(CommonPopupModel popupModel) {
            Intrinsics.checkNotNullParameter(popupModel, "popupModel");
            CommonPopupDialog commonPopupDialog = new CommonPopupDialog();
            commonPopupDialog.setArguments(BundleKt.bundleOf(TuplesKt.to(CommonPopupDialog.POPUP_MODEL_KEY, popupModel)));
            return commonPopupDialog;
        }
    }
}
