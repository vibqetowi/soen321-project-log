package com.ifriend.base.app.activity;

import android.os.Bundle;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.ui.base.BaseFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FlowFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ifriend/base/app/activity/FlowFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "layoutId", "", "(I)V", "cicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "getCicerone", "()Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "ciceroneHolder", "Lcom/ifriend/base/navigation/api/CiceroneHolder;", "getCiceroneHolder", "()Lcom/ifriend/base/navigation/api/CiceroneHolder;", "setCiceroneHolder", "(Lcom/ifriend/base/navigation/api/CiceroneHolder;)V", "containerTag", "", "getContainerTag", "()Ljava/lang/String;", "navigator", "Lcom/ifriend/base/app/activity/FlowNavigator;", "getNavigator", "()Lcom/ifriend/base/app/activity/FlowNavigator;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FlowFragment extends BaseFragment {
    @Inject
    public CiceroneHolder ciceroneHolder;

    public abstract String getContainerTag();

    public abstract FlowNavigator getNavigator();

    public FlowFragment(int i) {
        super(i);
    }

    public final CiceroneHolder getCiceroneHolder() {
        CiceroneHolder ciceroneHolder = this.ciceroneHolder;
        if (ciceroneHolder != null) {
            return ciceroneHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ciceroneHolder");
        return null;
    }

    public final void setCiceroneHolder(CiceroneHolder ciceroneHolder) {
        Intrinsics.checkNotNullParameter(ciceroneHolder, "<set-?>");
        this.ciceroneHolder = ciceroneHolder;
    }

    public Cicerone<AppRouter> getCicerone() {
        return CiceroneHolder.DefaultImpls.getCicerone$default(getCiceroneHolder(), getContainerTag(), null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getCicerone().getRouter();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getCiceroneHolder().clearCicerone(getContainerTag());
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getCicerone().getNavigatorHolder().setNavigator(getNavigator());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        getCicerone().getNavigatorHolder().removeNavigator();
        super.onPause();
    }
}
