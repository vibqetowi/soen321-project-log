package com.ifriend.popup.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.navigation.compose.DialogNavigator;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.popup.api.UpgradePopupModel;
import com.ifriend.popup.api.UpgradePopupResultModel;
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
/* compiled from: UpgradePopupDialog.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, d2 = {"Lcom/ifriend/popup/impl/UpgradePopupDialog;", "Lcom/ifriend/ui/base/dialog/BaseDialogFragment;", "()V", "binding", "Lcom/ifriend/popup/impl/databinding/FragmentPopupDialogBinding;", "getBinding", "()Lcom/ifriend/popup/impl/databinding/FragmentPopupDialogBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "popupModel", "Lcom/ifriend/popup/api/UpgradePopupModel;", "getPopupModel", "()Lcom/ifriend/popup/api/UpgradePopupModel;", "popupModel$delegate", "Lkotlin/Lazy;", "onCancel", "", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "resultForUpgrade", "result", "Lcom/ifriend/popup/api/UpgradePopupResultModel;", "setupUpgradePopup", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class UpgradePopupDialog extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UpgradePopupDialog.class, "binding", "getBinding()Lcom/ifriend/popup/impl/databinding/FragmentPopupDialogBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    private static final String POPUP_MODEL_KEY = "POPUP_MODEL_KEY";
    private final Lazy popupModel$delegate = LazyKt.lazy(new UpgradePopupDialog$popupModel$2(this));
    private final ViewBindingProperty binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(this, new UpgradePopupDialog$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());

    protected final UpgradePopupModel getPopupModel() {
        return (UpgradePopupModel) this.popupModel$delegate.getValue();
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
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.UpgradePopupDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UpgradePopupDialog.onViewCreated$lambda$1$lambda$0(UpgradePopupDialog.this, view2);
            }
        });
        setupUpgradePopup(getPopupModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(UpgradePopupDialog this$0, View view) {
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
        resultForUpgrade(UpgradePopupResultModel.CANCEL);
    }

    private final void setupUpgradePopup(UpgradePopupModel upgradePopupModel) {
        FragmentPopupDialogBinding binding = getBinding();
        AppButton popupActionButton = binding.popupActionButton;
        Intrinsics.checkNotNullExpressionValue(popupActionButton, "popupActionButton");
        popupActionButton.setVisibility(8);
        TextView popupText = binding.popupText;
        Intrinsics.checkNotNullExpressionValue(popupText, "popupText");
        popupText.setVisibility(8);
        ImageView popupIcon = binding.popupIcon;
        Intrinsics.checkNotNullExpressionValue(popupIcon, "popupIcon");
        popupIcon.setVisibility(8);
        binding.popupTitle.setText(upgradePopupModel.getTitle());
        binding.upgradeLinkText.setText(upgradePopupModel.getSecondaryButtonText());
        binding.upgradeLinkText.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.UpgradePopupDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradePopupDialog.setupUpgradePopup$lambda$4$lambda$2(UpgradePopupDialog.this, view);
            }
        });
        binding.upgradeButtonGradient.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.UpgradePopupDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradePopupDialog.setupUpgradePopup$lambda$4$lambda$3(UpgradePopupDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupUpgradePopup$lambda$4$lambda$2(UpgradePopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        this$0.resultForUpgrade(UpgradePopupResultModel.SECOND_BUTTON_CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupUpgradePopup$lambda$4$lambda$3(UpgradePopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        this$0.resultForUpgrade(UpgradePopupResultModel.UPGRADE_CLICK);
    }

    private final void resultForUpgrade(UpgradePopupResultModel upgradePopupResultModel) {
        getParentFragmentManager().setFragmentResult(String.valueOf(getTag()), BundleKt.bundleOf(TuplesKt.to("UpgradePopupResultKey", upgradePopupResultModel)));
    }

    /* compiled from: UpgradePopupDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/popup/impl/UpgradePopupDialog$Companion;", "", "()V", UpgradePopupDialog.POPUP_MODEL_KEY, "", "newInstance", "Lcom/ifriend/popup/impl/UpgradePopupDialog;", "popupModel", "Lcom/ifriend/popup/api/UpgradePopupModel;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UpgradePopupDialog newInstance(UpgradePopupModel popupModel) {
            Intrinsics.checkNotNullParameter(popupModel, "popupModel");
            UpgradePopupDialog upgradePopupDialog = new UpgradePopupDialog();
            upgradePopupDialog.setArguments(BundleKt.bundleOf(TuplesKt.to(UpgradePopupDialog.POPUP_MODEL_KEY, popupModel)));
            return upgradePopupDialog;
        }
    }
}
