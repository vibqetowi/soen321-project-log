package com.ifriend.base.app.activity;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.ifriend.base.navigation.impl.ExtendNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FlowFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/base/app/activity/FlowNavigator;", "Lcom/ifriend/base/navigation/impl/ExtendNavigator;", "flowFragment", "Lcom/ifriend/base/app/activity/FlowFragment;", "containerId", "", "(Lcom/ifriend/base/app/activity/FlowFragment;I)V", "activityBack", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FlowNavigator extends ExtendNavigator {
    private final FlowFragment flowFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FlowNavigator(FlowFragment flowFragment, int i) {
        super(r0, i, r1, r2);
        Intrinsics.checkNotNullParameter(flowFragment, "flowFragment");
        FragmentActivity requireActivity = flowFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        FragmentManager childFragmentManager = flowFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        FragmentFactory fragmentFactory = flowFragment.getChildFragmentManager().getFragmentFactory();
        Intrinsics.checkNotNullExpressionValue(fragmentFactory, "getFragmentFactory(...)");
        this.flowFragment = flowFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.base.navigation.impl.cicerone.AppNavigator
    public void activityBack() {
        if (this.flowFragment.getParentFragment() != null) {
            this.flowFragment.getParentFragmentManager().popBackStack();
        } else {
            super.activityBack();
        }
    }
}
