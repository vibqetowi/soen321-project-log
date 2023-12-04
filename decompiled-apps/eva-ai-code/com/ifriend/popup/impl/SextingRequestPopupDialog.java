package com.ifriend.popup.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.navigation.compose.DialogNavigator;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.popup.api.SextingRequestResultModel;
import com.ifriend.popup.impl.databinding.FragmentPopupSextingRequestBinding;
import com.ifriend.ui.base.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: SextingRequestPopupDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/ifriend/popup/impl/SextingRequestPopupDialog;", "Lcom/ifriend/ui/base/dialog/BaseDialogFragment;", "()V", "binding", "Lcom/ifriend/popup/impl/databinding/FragmentPopupSextingRequestBinding;", "getBinding", "()Lcom/ifriend/popup/impl/databinding/FragmentPopupSextingRequestBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "dismissWithResult", "", "result", "Lcom/ifriend/popup/api/SextingRequestResultModel;", "onCancel", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setupPopup", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SextingRequestPopupDialog extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SextingRequestPopupDialog.class, "binding", "getBinding()Lcom/ifriend/popup/impl/databinding/FragmentPopupSextingRequestBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    private final ViewBindingProperty binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(this, new SextingRequestPopupDialog$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());

    private final FragmentPopupSextingRequestBinding getBinding() {
        return (FragmentPopupSextingRequestBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_popup_sexting_request, viewGroup);
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
        setupPopup();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        dismissWithResult(SextingRequestResultModel.CANCEL);
    }

    private final void setupPopup() {
        FragmentPopupSextingRequestBinding binding = getBinding();
        binding.popupPositiveButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.SextingRequestPopupDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SextingRequestPopupDialog.setupPopup$lambda$2$lambda$0(SextingRequestPopupDialog.this, view);
            }
        });
        binding.popupNegativeButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.SextingRequestPopupDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SextingRequestPopupDialog.setupPopup$lambda$2$lambda$1(SextingRequestPopupDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPopup$lambda$2$lambda$0(SextingRequestPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissWithResult(SextingRequestResultModel.REQUEST_SEXTING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPopup$lambda$2$lambda$1(SextingRequestPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissWithResult(SextingRequestResultModel.CANCEL);
    }

    private final void dismissWithResult(SextingRequestResultModel sextingRequestResultModel) {
        dismiss();
        getParentFragmentManager().setFragmentResult(String.valueOf(getTag()), BundleKt.bundleOf(TuplesKt.to("UpgradePopupResultKey", sextingRequestResultModel)));
    }

    /* compiled from: SextingRequestPopupDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/popup/impl/SextingRequestPopupDialog$Companion;", "", "()V", "newInstance", "Lcom/ifriend/popup/impl/SextingRequestPopupDialog;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SextingRequestPopupDialog newInstance() {
            return new SextingRequestPopupDialog();
        }
    }
}
