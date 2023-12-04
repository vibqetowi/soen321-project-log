package com.ifriend.presentation.features.app.delegates;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
/* compiled from: AppReloadDataDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H&R\u00020\u0004¢\u0006\u0002\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegate;", "", "tryReloadData", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "initAppReloadData", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppReloadDataDelegate {
    void initAppReloadData(AppViewModel appViewModel);

    void tryReloadData(ViewModel viewModel);
}
