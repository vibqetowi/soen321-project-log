package com.ifriend.popup.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.popup.api.NoInternetPopupResultModel;
import com.ifriend.popup.api.PopupResultModelKt;
import com.ifriend.popup.impl.databinding.FragmentNoInternetConnectionPopupDialogBinding;
import com.ifriend.ui.base.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: NoInternetConnectionPopupDialog.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/ifriend/popup/impl/NoInternetConnectionPopupDialog;", "Lcom/ifriend/ui/base/dialog/BaseDialogFragment;", "()V", "binding", "Lcom/ifriend/popup/impl/databinding/FragmentNoInternetConnectionPopupDialogBinding;", "getBinding", "()Lcom/ifriend/popup/impl/databinding/FragmentNoInternetConnectionPopupDialogBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "resultForCommon", "result", "Lcom/ifriend/popup/api/NoInternetPopupResultModel;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoInternetConnectionPopupDialog extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NoInternetConnectionPopupDialog.class, "binding", "getBinding()Lcom/ifriend/popup/impl/databinding/FragmentNoInternetConnectionPopupDialogBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    private final ViewBindingProperty binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(this, new NoInternetConnectionPopupDialog$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());

    /* compiled from: NoInternetConnectionPopupDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/popup/impl/NoInternetConnectionPopupDialog$Companion;", "", "()V", "newInstance", "Landroidx/fragment/app/DialogFragment;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DialogFragment newInstance() {
            return new NoInternetConnectionPopupDialog();
        }
    }

    private final FragmentNoInternetConnectionPopupDialogBinding getBinding() {
        return (FragmentNoInternetConnectionPopupDialogBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_no_internet_connection_popup_dialog, viewGroup);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        FragmentNoInternetConnectionPopupDialogBinding binding = getBinding();
        binding.labelAction.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.NoInternetConnectionPopupDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NoInternetConnectionPopupDialog.onViewCreated$lambda$2$lambda$0(NoInternetConnectionPopupDialog.this, view2);
            }
        });
        binding.popupActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.popup.impl.NoInternetConnectionPopupDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NoInternetConnectionPopupDialog.onViewCreated$lambda$2$lambda$1(NoInternetConnectionPopupDialog.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$0(NoInternetConnectionPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resultForCommon(NoInternetPopupResultModel.OPEN_SETTINGS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(NoInternetConnectionPopupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resultForCommon(NoInternetPopupResultModel.TRY_AGAIN_CLICK);
    }

    private final void resultForCommon(NoInternetPopupResultModel noInternetPopupResultModel) {
        getParentFragmentManager().setFragmentResult(String.valueOf(getTag()), BundleKt.bundleOf(TuplesKt.to(PopupResultModelKt.CommonPopupResultKey, noInternetPopupResultModel)));
    }
}
