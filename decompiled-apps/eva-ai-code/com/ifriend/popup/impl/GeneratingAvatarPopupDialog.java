package com.ifriend.popup.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.navigation.compose.DialogNavigator;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.popup.api.GeneratingAvatarPopupResultModel;
import com.ifriend.popup.api.PopupResultModelKt;
import com.ifriend.popup.impl.databinding.GeneratingAvatarFragmentPopupDialogBinding;
import com.ifriend.ui.base.dialog.BaseDialogFragment;
import com.ifriend.ui.utils.extensions.ViewKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: GeneratingAvatarPopupDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/ifriend/popup/impl/GeneratingAvatarPopupDialog;", "Lcom/ifriend/ui/base/dialog/BaseDialogFragment;", "()V", "binding", "Lcom/ifriend/popup/impl/databinding/GeneratingAvatarFragmentPopupDialogBinding;", "getBinding", "()Lcom/ifriend/popup/impl/databinding/GeneratingAvatarFragmentPopupDialogBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "onCancel", "", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "returnResult", "result", "Lcom/ifriend/popup/api/GeneratingAvatarPopupResultModel;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class GeneratingAvatarPopupDialog extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GeneratingAvatarPopupDialog.class, "binding", "getBinding()Lcom/ifriend/popup/impl/databinding/GeneratingAvatarFragmentPopupDialogBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    private final ViewBindingProperty binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(this, new GeneratingAvatarPopupDialog$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());

    protected final GeneratingAvatarFragmentPopupDialogBinding getBinding() {
        return (GeneratingAvatarFragmentPopupDialogBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.generating_avatar_fragment_popup_dialog, viewGroup);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        ImageView imageView = getBinding().popupClose;
        Intrinsics.checkNotNull(imageView);
        ViewKt.expandClickableArea$default(imageView, 0, 1, null);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.GeneratingAvatarPopupDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GeneratingAvatarPopupDialog.onViewCreated$lambda$1$lambda$0(GeneratingAvatarPopupDialog.this, view2);
            }
        });
        getBinding().popupActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.GeneratingAvatarPopupDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GeneratingAvatarPopupDialog.onViewCreated$lambda$2(GeneratingAvatarPopupDialog.this, view2);
            }
        });
        DialogSizeExtensionsKt.setHorizontalMargin(this, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(GeneratingAvatarPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(GeneratingAvatarPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        this$0.returnResult(GeneratingAvatarPopupResultModel.ACTION_CLICK);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        returnResult(GeneratingAvatarPopupResultModel.CANCEL);
    }

    private final void returnResult(GeneratingAvatarPopupResultModel generatingAvatarPopupResultModel) {
        getParentFragmentManager().setFragmentResult(String.valueOf(getTag()), BundleKt.bundleOf(TuplesKt.to(PopupResultModelKt.GeneratingAvatarPopupResultKey, generatingAvatarPopupResultModel)));
    }

    /* compiled from: GeneratingAvatarPopupDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/popup/impl/GeneratingAvatarPopupDialog$Companion;", "", "()V", "newInstance", "Lcom/ifriend/popup/impl/GeneratingAvatarPopupDialog;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GeneratingAvatarPopupDialog newInstance() {
            return new GeneratingAvatarPopupDialog();
        }
    }
}
