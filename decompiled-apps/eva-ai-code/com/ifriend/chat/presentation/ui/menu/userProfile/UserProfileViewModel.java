package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.chat.presentation.ui.purchase.premium.old.PremiumBenefitsScreen;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
/* compiled from: UserProfileViewModel.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u0010/\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u00101\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u00102\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u00103\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0010H\u0096Aø\u0001\u0000¢\u0006\u0002\u00107J\u001b\u00108\u001a\u0004\u0018\u0001092\u0006\u00106\u001a\u00020\u0010H\u0096Aø\u0001\u0000¢\u0006\u0002\u00107J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u0002090;H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020+J\u0012\u0010>\u001a\u00020+H\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010?J\u000e\u0010@\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0011\u0010A\u001a\u00020BH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010<J\u000e\u0010C\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0006\u0010D\u001a\u00020+R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0012R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "billingPurchaseDelegate", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;", "(Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;)V", "age", "Landroidx/lifecycle/MutableLiveData;", "", "getAge", "()Landroidx/lifecycle/MutableLiveData;", "billingPurchaseFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "getBillingPurchaseFlow", "()Lkotlinx/coroutines/flow/Flow;", "changeIconEnabled", "", "getChangeIconEnabled", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileFragment;)V", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "isPremium", "name", "getName", "premium", "getPremium", "premiumActive", "getPremiumActive", "changeAge", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "changeGender", "changeIcon", "changeName", "changePremium", "closeClick", "delete", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseProduct", "Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchaseProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "initPurchasesProductUpdates", "(Landroidx/lifecycle/ViewModel;)V", "logout", "restoreBillingPurchases", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "restorePurchases", "startLogout", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserProfileViewModel extends ViewModel implements BillingPurchaseDelegate {
    public static final int $stable = 8;
    private final /* synthetic */ BillingPurchaseDelegateImpl $$delegate_0;
    private final MutableLiveData<String> age;
    private final AppConfigUseCase appConfigUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final BillingPurchaseDelegate.Factory billingPurchaseDelegate;
    private final MutableLiveData<Boolean> changeIconEnabled;
    private UserProfileFragment fragment;
    private final MutableLiveData<String> gender;
    private final GetUserUseCase getUserUseCase;
    private final MutableLiveData<Boolean> isPremium;
    private final MutableLiveData<String> name;
    private final MutableLiveData<String> premium;
    private final MutableLiveData<String> premiumActive;
    private final RouterProvider routerProvider;

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getBillingFlowParams(String str, Continuation<? super BillingFlowParams> continuation) {
        return this.$$delegate_0.getBillingFlowParams(str, continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Flow<ProductPurchaseEvent> getBillingPurchaseFlow() {
        return this.$$delegate_0.getBillingPurchaseFlow();
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getPurchaseProduct(String str, Continuation<? super BillingProduct> continuation) {
        return this.$$delegate_0.getPurchaseProduct(str, continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getPurchaseProducts(Continuation<? super List<BillingProduct>> continuation) {
        return this.$$delegate_0.getPurchaseProducts(continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public void initPurchasesProductUpdates(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_0.initPurchasesProductUpdates(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object restoreBillingPurchases(Continuation<? super RestorePurchasesResult> continuation) {
        return this.$$delegate_0.restoreBillingPurchases(continuation);
    }

    @Inject
    public UserProfileViewModel(GetUserUseCase getUserUseCase, AppConfigUseCase appConfigUseCase, RouterProvider routerProvider, AppEventsEmitter appEventsEmitter, BillingPurchaseDelegate.Factory billingPurchaseDelegate) {
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(routerProvider, "routerProvider");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        this.getUserUseCase = getUserUseCase;
        this.appConfigUseCase = appConfigUseCase;
        this.routerProvider = routerProvider;
        this.appEventsEmitter = appEventsEmitter;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.$$delegate_0 = billingPurchaseDelegate.create(BillingPurchaseProductType.SUBSCRIPTION, PurchaseReason.Purchase.INSTANCE, PurchaseSource.RESTORE, "");
        this.name = new MutableLiveData<>();
        this.gender = new MutableLiveData<>();
        this.age = new MutableLiveData<>();
        this.premium = new MutableLiveData<>();
        this.premiumActive = new MutableLiveData<>();
        this.isPremium = new MutableLiveData<>();
        this.changeIconEnabled = new MutableLiveData<>();
    }

    public final UserProfileFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(UserProfileFragment userProfileFragment) {
        this.fragment = userProfileFragment;
    }

    public final MutableLiveData<String> getName() {
        return this.name;
    }

    public final MutableLiveData<String> getGender() {
        return this.gender;
    }

    public final MutableLiveData<String> getAge() {
        return this.age;
    }

    public final MutableLiveData<String> getPremium() {
        return this.premium;
    }

    public final MutableLiveData<String> getPremiumActive() {
        return this.premiumActive;
    }

    public final MutableLiveData<Boolean> isPremium() {
        return this.isPremium;
    }

    public final MutableLiveData<Boolean> getChangeIconEnabled() {
        return this.changeIconEnabled;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserProfileViewModel$init$1(this, null), 3, null);
    }

    public final void closeClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.routerProvider.getRoute().exit();
    }

    public final void changeName(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.routerProvider.getRoute().navigateTo(UserNameScreen.INSTANCE);
    }

    public final void changeGender(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.routerProvider.getRoute().navigateTo(UserGenderScreen.INSTANCE);
    }

    public final void changeAge(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.routerProvider.getRoute().navigateTo(UserAgeScreen.INSTANCE);
    }

    public final void changePremium(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!Intrinsics.areEqual((Object) this.isPremium.getValue(), (Object) true)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserProfileViewModel$changePremium$1(this, null), 3, null);
        } else {
            this.routerProvider.getRoute().navigateTo(PremiumBenefitsScreen.INSTANCE);
        }
    }

    public final void restorePurchases(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Handler handler = new Handler(Looper.getMainLooper());
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new UserProfileViewModel$restorePurchases$1(handler, this, null), null, new UserProfileViewModel$restorePurchases$2(this, handler, null), 2, null);
    }

    public final void changeIcon(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.routerProvider.getRoute().navigateTo(ChangeAppIconScreen.INSTANCE);
    }

    public final void logout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserProfileFragment userProfileFragment = this.fragment;
        if (userProfileFragment != null) {
            userProfileFragment.showLogoutDialog();
        }
    }

    public final void startLogout() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserProfileViewModel$startLogout$1(this, null), 3, null);
    }

    public final void delete(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.routerProvider.getRoute().navigateTo(UserProfileDeleteScreen.INSTANCE);
    }
}
