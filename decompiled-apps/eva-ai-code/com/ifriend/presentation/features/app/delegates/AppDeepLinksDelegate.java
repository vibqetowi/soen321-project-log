package com.ifriend.presentation.features.app.delegates;

import android.content.Intent;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
/* compiled from: AppDeepLinksDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&R\u00020\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppDeepLinksDelegate;", "", "handleDeepLinks", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "intent", "Landroid/content/Intent;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Landroid/content/Intent;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppDeepLinksDelegate {
    void handleDeepLinks(AppViewModel appViewModel, Intent intent);
}
