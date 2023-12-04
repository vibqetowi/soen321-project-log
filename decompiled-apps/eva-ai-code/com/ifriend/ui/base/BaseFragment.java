package com.ifriend.ui.base;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import cc.cloudist.acplibrary.ACProgressFlower;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0014J \u00106\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u000203082\b\b\u0002\u00109\u001a\u00020\u0014H\u0004J\b\u0010:\u001a\u000203H\u0017J\u0010\u0010;\u001a\u0002032\u0006\u0010<\u001a\u000205H\u0017J\b\u0010=\u001a\u000203H\u0002J\b\u0010>\u001a\u000203H\u0002J\b\u0010?\u001a\u000203H\u0002J\u0010\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000203H\u0014J\b\u0010D\u001a\u000203H\u0016J\b\u0010E\u001a\u000203H\u0016J\u001a\u0010F\u001a\u0002032\u0006\u0010<\u001a\u0002052\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J(\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u000203\u0018\u000108J\b\u0010N\u001a\u000203H\u0017J$\u0010O\u001a\u000203*\u0002052\f\u00107\u001a\b\u0012\u0004\u0012\u000203082\b\b\u0002\u00109\u001a\u00020\u0014H\u0004R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006P"}, d2 = {"Lcom/ifriend/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "layoutId", "", "(I)V", "changeNetworkStateBugPermission", "Lcom/ifriend/ui/base/ChangeNetworkStateBugPermission;", "internalNotificationHandlersRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "getInternalNotificationHandlersRegister", "()Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "setInternalNotificationHandlersRegister", "(Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "internetConnection", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "getInternetConnection", "()Lcom/ifriend/domain/infrastucture/InternetConnection;", "setInternetConnection", "(Lcom/ifriend/domain/infrastucture/InternetConnection;)V", "lastDebounce", "", "Ljava/lang/Long;", "logger", "Lcom/ifriend/common_utils/Logger;", "getLogger", "()Lcom/ifriend/common_utils/Logger;", "setLogger", "(Lcom/ifriend/common_utils/Logger;)V", "progressDialog", "Lcc/cloudist/acplibrary/ACProgressFlower;", "getProgressDialog", "()Lcc/cloudist/acplibrary/ACProgressFlower;", "setProgressDialog", "(Lcc/cloudist/acplibrary/ACProgressFlower;)V", "progressJob", "Lkotlinx/coroutines/Job;", "router", "Lcom/ifriend/base/navigation/api/AppRouter;", "getRouter", "()Lcom/ifriend/base/navigation/api/AppRouter;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "getRouterProvider", "()Lcom/ifriend/base/navigation/api/RouterProvider;", "setRouterProvider", "(Lcom/ifriend/base/navigation/api/RouterProvider;)V", "shouldReloadOnReconnect", "", "getShouldReloadOnReconnect", "()Z", "applyWindowInsets", "", "rootView", "Landroid/view/View;", "debounce", "block", "Lkotlin/Function0;", RtspHeaders.Values.TIME, "hideLoading", "init", ViewHierarchyConstants.VIEW_KEY, "initInternetStateListener", "initInternetStateListenerWithBugPermission", "initOnBackPressed", "onAttach", "context", "Landroid/content/Context;", "onBackPressed", "onInternetAccessAvailable", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "title", "", "text", "onClick", "showLoading", "setScreenDebouncedOnClickListener", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseFragment extends Fragment {
    public static final int $stable = 8;
    private ChangeNetworkStateBugPermission changeNetworkStateBugPermission;
    @Inject
    public InternalNotificationHandlersRegister internalNotificationHandlersRegister;
    @Inject
    public InternetConnection internetConnection;
    private Long lastDebounce;
    @Inject
    public Logger logger;
    private ACProgressFlower progressDialog;
    private Job progressJob;
    @Inject
    public RouterProvider routerProvider;

    public boolean getShouldReloadOnReconnect() {
        return false;
    }

    @Deprecated(message = "Use onViewCreated instead or onInternetAccessAvailable if you need to reload data after internet connection available")
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void onInternetAccessAvailable() {
    }

    public BaseFragment(int i) {
        super(i);
    }

    public final InternetConnection getInternetConnection() {
        InternetConnection internetConnection = this.internetConnection;
        if (internetConnection != null) {
            return internetConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internetConnection");
        return null;
    }

    public final void setInternetConnection(InternetConnection internetConnection) {
        Intrinsics.checkNotNullParameter(internetConnection, "<set-?>");
        this.internetConnection = internetConnection;
    }

    public final InternalNotificationHandlersRegister getInternalNotificationHandlersRegister() {
        InternalNotificationHandlersRegister internalNotificationHandlersRegister = this.internalNotificationHandlersRegister;
        if (internalNotificationHandlersRegister != null) {
            return internalNotificationHandlersRegister;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalNotificationHandlersRegister");
        return null;
    }

    public final void setInternalNotificationHandlersRegister(InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        Intrinsics.checkNotNullParameter(internalNotificationHandlersRegister, "<set-?>");
        this.internalNotificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    public final void setLogger(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<set-?>");
        this.logger = logger;
    }

    public final RouterProvider getRouterProvider() {
        RouterProvider routerProvider = this.routerProvider;
        if (routerProvider != null) {
            return routerProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routerProvider");
        return null;
    }

    public final void setRouterProvider(RouterProvider routerProvider) {
        Intrinsics.checkNotNullParameter(routerProvider, "<set-?>");
        this.routerProvider = routerProvider;
    }

    public AppRouter getRouter() {
        return getRouterProvider().getRoute();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        initOnBackPressed();
    }

    private final void initOnBackPressed() {
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new BaseFragment$initOnBackPressed$1(this), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onBackPressed() {
        getRouter().exit();
    }

    private final void initInternetStateListenerWithBugPermission() {
        ChangeNetworkStateBugPermission changeNetworkStateBugPermission = new ChangeNetworkStateBugPermission(new BaseFragment$initInternetStateListenerWithBugPermission$1(this));
        this.changeNetworkStateBugPermission = changeNetworkStateBugPermission;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        changeNetworkStateBugPermission.request(requireContext, new ShowPermissionInformation() { // from class: com.ifriend.ui.base.BaseFragment$initInternetStateListenerWithBugPermission$2
            @Override // com.ifriend.ui.base.ShowPermissionInformation
            public void invoke(Function0<Unit> onUserSaw) {
                Intrinsics.checkNotNullParameter(onUserSaw, "onUserSaw");
                BaseFragment baseFragment = BaseFragment.this;
                String string = baseFragment.getString(R.string.allow_change_network_state_permission);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = BaseFragment.this.getString(R.string.permission_required_to_handle_internet_state);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                baseFragment.showDialog(string, string2, new BaseFragment$initInternetStateListenerWithBugPermission$2$invoke$1(onUserSaw));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInternetStateListener$onInternetConnectionAvailable(final BaseFragment baseFragment) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ifriend.ui.base.BaseFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseFragment.initInternetStateListener$onInternetConnectionAvailable$lambda$1(BaseFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInternetStateListener$onInternetConnectionAvailable$lambda$1(BaseFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.getView();
        if (view != null) {
            this$0.init(view);
        }
        this$0.onInternetAccessAvailable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initInternetStateListener() {
        if (getShouldReloadOnReconnect()) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BaseFragment$initInternetStateListener$1(this, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChangeNetworkStateBugPermission changeNetworkStateBugPermission = this.changeNetworkStateBugPermission;
        if (changeNetworkStateBugPermission != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            changeNetworkStateBugPermission.checkPermissionGrantedOnResume(requireContext);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        applyWindowInsets(view);
        initInternetStateListenerWithBugPermission();
        init(view);
    }

    protected void applyWindowInsets(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        InsetsExtensionsKt.doOnApplyWindowInsets(rootView, BaseFragment$applyWindowInsets$1.INSTANCE);
    }

    public final ACProgressFlower getProgressDialog() {
        return this.progressDialog;
    }

    public final void setProgressDialog(ACProgressFlower aCProgressFlower) {
        this.progressDialog = aCProgressFlower;
    }

    @Deprecated(message = "не использовать")
    public void showLoading() {
        Job job = this.progressJob;
        boolean z = true;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ACProgressFlower aCProgressFlower = this.progressDialog;
        if (aCProgressFlower == null || !aCProgressFlower.isShowing()) {
            z = false;
        }
        if (z) {
            return;
        }
        this.progressJob = LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new BaseFragment$showLoading$1(this, activity, null));
    }

    @Deprecated(message = "не использовать")
    public void hideLoading() {
        Job job = this.progressJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.progressJob = LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new BaseFragment$hideLoading$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDialog$default(BaseFragment baseFragment, String str, String str2, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        baseFragment.showDialog(str, str2, function0);
    }

    public final void showDialog(String title, String text, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AlertDialog create = new AlertDialog.Builder(activity).create();
        create.setTitle(title);
        create.setMessage(text);
        create.setButton(-3, "OK", new DialogInterface.OnClickListener() { // from class: com.ifriend.ui.base.BaseFragment$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BaseFragment.showDialog$lambda$3$lambda$2(Function0.this, dialogInterface, i);
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$3$lambda$2(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void debounce$default(BaseFragment baseFragment, Function0 function0, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debounce");
        }
        if ((i & 2) != 0) {
            j = 1000;
        }
        baseFragment.debounce(function0, j);
    }

    protected final void debounce(Function0<Unit> block, long j) {
        Intrinsics.checkNotNullParameter(block, "block");
        Long l = this.lastDebounce;
        if (l == null || System.currentTimeMillis() - l.longValue() >= j) {
            this.lastDebounce = Long.valueOf(System.currentTimeMillis());
            block.invoke();
        }
    }

    public static /* synthetic */ void setScreenDebouncedOnClickListener$default(BaseFragment baseFragment, View view, Function0 function0, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setScreenDebouncedOnClickListener");
        }
        if ((i & 2) != 0) {
            j = 1000;
        }
        baseFragment.setScreenDebouncedOnClickListener(view, function0, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setScreenDebouncedOnClickListener(View view, final Function0<Unit> block, final long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.base.BaseFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseFragment.setScreenDebouncedOnClickListener$lambda$4(BaseFragment.this, block, j, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenDebouncedOnClickListener$lambda$4(BaseFragment this$0, Function0 block, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        this$0.debounce(block, j);
    }
}
