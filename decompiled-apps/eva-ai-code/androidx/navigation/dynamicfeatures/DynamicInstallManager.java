package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.dynamicfeatures.DynamicGraphNavigator;
import com.facebook.bolts.AppLinks;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DynamicInstallManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J$\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicInstallManager;", "", "context", "Landroid/content/Context;", "splitInstallManager", "Lcom/google/android/play/core/splitinstall/SplitInstallManager;", "(Landroid/content/Context;Lcom/google/android/play/core/splitinstall/SplitInstallManager;)V", "needsInstall", "", "module", "", "performInstall", "Landroidx/navigation/NavDestination;", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/navigation/dynamicfeatures/DynamicExtras;", "moduleName", "requestInstall", "", "installMonitor", "Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;", "Companion", "SplitInstallListenerWrapper", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DynamicInstallManager {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final SplitInstallManager splitInstallManager;

    public DynamicInstallManager(Context context, SplitInstallManager splitInstallManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(splitInstallManager, "splitInstallManager");
        this.context = context;
        this.splitInstallManager = splitInstallManager;
    }

    /* compiled from: DynamicInstallManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicInstallManager$Companion;", "", "()V", "terminateLiveData", "", "status", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "terminateLiveData$navigation_dynamic_features_runtime_release", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void terminateLiveData$navigation_dynamic_features_runtime_release(MutableLiveData<SplitInstallSessionState> status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (!(!status.hasActiveObservers())) {
                throw new IllegalStateException("This DynamicInstallMonitor will not emit any more status updates. You should remove all Observers after null has been emitted.".toString());
            }
        }
    }

    public final NavDestination performInstall(NavBackStackEntry backStackEntry, DynamicExtras dynamicExtras, String moduleName) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if ((dynamicExtras != null ? dynamicExtras.getInstallMonitor() : null) != null) {
            requestInstall(moduleName, dynamicExtras.getInstallMonitor());
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.DESTINATION_ID, backStackEntry.getDestination().getId());
        bundle.putBundle(Constants.DESTINATION_ARGS, backStackEntry.getArguments());
        DynamicGraphNavigator.DynamicNavGraph orThrow$navigation_dynamic_features_runtime_release = DynamicGraphNavigator.DynamicNavGraph.Companion.getOrThrow$navigation_dynamic_features_runtime_release(backStackEntry.getDestination());
        Navigator navigator = orThrow$navigation_dynamic_features_runtime_release.getNavigatorProvider$navigation_dynamic_features_runtime_release().getNavigator(orThrow$navigation_dynamic_features_runtime_release.getNavigatorName());
        if (navigator instanceof DynamicGraphNavigator) {
            ((DynamicGraphNavigator) navigator).navigateToProgressDestination$navigation_dynamic_features_runtime_release(orThrow$navigation_dynamic_features_runtime_release, bundle);
            return null;
        }
        throw new IllegalStateException("You must use a DynamicNavGraph to perform a module installation.");
    }

    public final boolean needsInstall(String module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return !this.splitInstallManager.getInstalledModules().contains(module);
    }

    private final void requestInstall(final String str, final DynamicInstallMonitor dynamicInstallMonitor) {
        if (!(!dynamicInstallMonitor.isUsed$navigation_dynamic_features_runtime_release())) {
            throw new IllegalStateException("You must pass in a fresh DynamicInstallMonitor in DynamicExtras every time you call navigate().".toString());
        }
        LiveData<SplitInstallSessionState> status = dynamicInstallMonitor.getStatus();
        Intrinsics.checkNotNull(status, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.google.android.play.core.splitinstall.SplitInstallSessionState>");
        final MutableLiveData mutableLiveData = (MutableLiveData) status;
        dynamicInstallMonitor.setInstallRequired$navigation_dynamic_features_runtime_release(true);
        SplitInstallRequest build = SplitInstallRequest.newBuilder().addModule(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …ule)\n            .build()");
        Task<Integer> startInstall = this.splitInstallManager.startInstall(build);
        final DynamicInstallManager$requestInstall$2 dynamicInstallManager$requestInstall$2 = new DynamicInstallManager$requestInstall$2(dynamicInstallMonitor, this, mutableLiveData, str);
        startInstall.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.navigation.dynamicfeatures.DynamicInstallManager$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                DynamicInstallManager.requestInstall$lambda$2(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.navigation.dynamicfeatures.DynamicInstallManager$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DynamicInstallManager.requestInstall$lambda$3(str, dynamicInstallMonitor, mutableLiveData, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestInstall$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestInstall$lambda$3(String module, DynamicInstallMonitor installMonitor, MutableLiveData status, Exception exception) {
        Intrinsics.checkNotNullParameter(module, "$module");
        Intrinsics.checkNotNullParameter(installMonitor, "$installMonitor");
        Intrinsics.checkNotNullParameter(status, "$status");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Log.i("DynamicInstallManager", "Error requesting install of " + module + ": " + exception.getMessage());
        installMonitor.setException$navigation_dynamic_features_runtime_release(exception);
        status.setValue(SplitInstallSessionState.create(0, 6, exception instanceof SplitInstallException ? ((SplitInstallException) exception).getErrorCode() : -100, 0L, 0L, CollectionsKt.listOf(module), CollectionsKt.emptyList()));
        Companion.terminateLiveData$navigation_dynamic_features_runtime_release(status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DynamicInstallManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicInstallManager$SplitInstallListenerWrapper;", "Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;", "context", "Landroid/content/Context;", "status", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "installMonitor", "Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;", "(Landroid/content/Context;Landroidx/lifecycle/MutableLiveData;Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;)V", "onStateUpdate", "", "splitInstallSessionState", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SplitInstallListenerWrapper implements SplitInstallStateUpdatedListener {
        private final Context context;
        private final DynamicInstallMonitor installMonitor;
        private final MutableLiveData<SplitInstallSessionState> status;

        public SplitInstallListenerWrapper(Context context, MutableLiveData<SplitInstallSessionState> status, DynamicInstallMonitor installMonitor) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(installMonitor, "installMonitor");
            this.context = context;
            this.status = status;
            this.installMonitor = installMonitor;
        }

        @Override // com.google.android.play.core.listener.StateUpdatedListener
        public void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
            Intrinsics.checkNotNullParameter(splitInstallSessionState, "splitInstallSessionState");
            if (splitInstallSessionState.sessionId() == this.installMonitor.getSessionId()) {
                if (splitInstallSessionState.status() == 5) {
                    SplitCompat.install(this.context);
                    SplitInstallHelper.updateAppInfo(this.context);
                }
                this.status.setValue(splitInstallSessionState);
                if (splitInstallSessionState.hasTerminalStatus()) {
                    SplitInstallManager splitInstallManager = this.installMonitor.getSplitInstallManager();
                    Intrinsics.checkNotNull(splitInstallManager);
                    splitInstallManager.unregisterListener(this);
                    DynamicInstallManager.Companion.terminateLiveData$navigation_dynamic_features_runtime_release(this.status);
                }
            }
        }
    }
}
