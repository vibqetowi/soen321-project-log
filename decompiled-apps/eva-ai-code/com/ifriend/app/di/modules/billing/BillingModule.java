package com.ifriend.app.di.modules.billing;

import com.ifiend.billing.impl.logic.AppLaunchBillingFlowImpl;
import com.ifiend.billing.impl.logic.BillingInteractorImpl;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifiend.billing.impl.manager.BillingManagerImpl;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.billing.api.logic.BillingInteractor;
import dagger.Binds;
import dagger.Module;
import dagger.Reusable;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: BillingModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/ifriend/app/di/modules/billing/BillingModule;", "", "bindsBillingInteractor", "Lcom/ifriend/billing/api/logic/BillingInteractor;", "impl", "Lcom/ifiend/billing/impl/logic/BillingInteractorImpl;", "bindsBillingManager", "Lcom/ifiend/billing/impl/manager/BillingManager;", "Lcom/ifiend/billing/impl/manager/BillingManagerImpl;", "bindsLaunchBillingFlow", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "Lcom/ifiend/billing/impl/logic/AppLaunchBillingFlowImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface BillingModule {
    @Reusable
    @Binds
    BillingInteractor bindsBillingInteractor(BillingInteractorImpl billingInteractorImpl);

    @Singleton
    @Binds
    BillingManager bindsBillingManager(BillingManagerImpl billingManagerImpl);

    @Reusable
    @Binds
    AppLaunchBillingFlow bindsLaunchBillingFlow(AppLaunchBillingFlowImpl appLaunchBillingFlowImpl);
}
