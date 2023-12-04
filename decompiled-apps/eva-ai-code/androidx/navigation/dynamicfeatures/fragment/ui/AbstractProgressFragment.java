package androidx.navigation.dynamicfeatures.fragment.ui;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.NavOptions;
import androidx.navigation.dynamicfeatures.Constants;
import androidx.navigation.dynamicfeatures.DynamicExtras;
import androidx.navigation.dynamicfeatures.DynamicInstallMonitor;
import androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment;
import androidx.navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AbstractProgressFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u001cH$J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010!\u001a\u00020\u001c2\b\b\u0001\u0010\"\u001a\u00020\u0004H$J\b\u0010#\u001a\u00020\u001cH\u0014J\"\u0010$\u001a\u00020\u001c2\b\b\u0001\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H$J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment;", "Landroidx/fragment/app/Fragment;", "()V", "contentLayoutId", "", "(I)V", "destinationArgs", "Landroid/os/Bundle;", "getDestinationArgs", "()Landroid/os/Bundle;", "destinationArgs$delegate", "Lkotlin/Lazy;", "destinationId", "getDestinationId", "()I", "destinationId$delegate", "installViewModel", "Landroidx/navigation/dynamicfeatures/fragment/ui/InstallViewModel;", "getInstallViewModel", "()Landroidx/navigation/dynamicfeatures/fragment/ui/InstallViewModel;", "installViewModel$delegate", "intentSenderLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "navigated", "", "navigate", "", "navigate$navigation_dynamic_features_fragment_release", "onCancelled", "onCreate", "savedInstanceState", "onFailed", "errorCode", "onInstalled", "onProgress", "status", "bytesDownloaded", "", "bytesTotal", "onSaveInstanceState", "outState", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "Companion", "StateObserver", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractProgressFragment extends Fragment {
    public static final Companion Companion = new Companion(null);
    private static final int INSTALL_REQUEST_CODE = 1;
    private static final String TAG = "AbstractProgress";
    private final Lazy destinationArgs$delegate;
    private final Lazy destinationId$delegate;
    private final Lazy installViewModel$delegate;
    private final ActivityResultLauncher<IntentSenderRequest> intentSenderLauncher;
    private boolean navigated;

    protected abstract void onCancelled();

    protected abstract void onFailed(int i);

    protected void onInstalled() {
    }

    protected abstract void onProgress(int i, long j, long j2);

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment$Companion;", "", "()V", "INSTALL_REQUEST_CODE", "", "TAG", "", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final InstallViewModel getInstallViewModel() {
        return (InstallViewModel) this.installViewModel$delegate.getValue();
    }

    private final int getDestinationId() {
        return ((Number) this.destinationId$delegate.getValue()).intValue();
    }

    private final Bundle getDestinationArgs() {
        return (Bundle) this.destinationArgs$delegate.getValue();
    }

    public AbstractProgressFragment() {
        this.installViewModel$delegate = LazyKt.lazy(new AbstractProgressFragment$installViewModel$2(this));
        this.destinationId$delegate = LazyKt.lazy(new AbstractProgressFragment$destinationId$2(this));
        this.destinationArgs$delegate = LazyKt.lazy(new AbstractProgressFragment$destinationArgs$2(this));
        ActivityResultLauncher<IntentSenderRequest> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractProgressFragment.intentSenderLauncher$lambda$0(AbstractProgressFragment.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…ncelled()\n        }\n    }");
        this.intentSenderLauncher = registerForActivityResult;
    }

    public AbstractProgressFragment(int i) {
        super(i);
        this.installViewModel$delegate = LazyKt.lazy(new AbstractProgressFragment$installViewModel$2(this));
        this.destinationId$delegate = LazyKt.lazy(new AbstractProgressFragment$destinationId$2(this));
        this.destinationArgs$delegate = LazyKt.lazy(new AbstractProgressFragment$destinationArgs$2(this));
        ActivityResultLauncher<IntentSenderRequest> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractProgressFragment.intentSenderLauncher$lambda$0(AbstractProgressFragment.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…ncelled()\n        }\n    }");
        this.intentSenderLauncher = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void intentSenderLauncher$lambda$0(AbstractProgressFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == 0) {
            this$0.onCancelled();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.navigated = bundle.getBoolean(Constants.KEY_NAVIGATED, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.navigated) {
            FragmentKt.findNavController(this).popBackStack();
            return;
        }
        DynamicInstallMonitor installMonitor = getInstallViewModel().getInstallMonitor();
        if (installMonitor == null) {
            Log.i(TAG, "onViewCreated: monitor is null, navigating");
            navigate$navigation_dynamic_features_fragment_release();
            installMonitor = getInstallViewModel().getInstallMonitor();
        }
        if (installMonitor != null) {
            Log.i(TAG, "onViewCreated: monitor is now not null, observing");
            installMonitor.getStatus().observe(getViewLifecycleOwner(), new StateObserver(this, installMonitor));
        }
    }

    public final void navigate$navigation_dynamic_features_fragment_release() {
        Log.i(TAG, "navigate: ");
        DynamicInstallMonitor dynamicInstallMonitor = new DynamicInstallMonitor();
        FragmentKt.findNavController(this).navigate(getDestinationId(), getDestinationArgs(), (NavOptions) null, new DynamicExtras(dynamicInstallMonitor, null, 2, null));
        if (!dynamicInstallMonitor.isInstallRequired()) {
            Log.i(TAG, "navigate: install not required");
            this.navigated = true;
            return;
        }
        Log.i(TAG, "navigate: setting install monitor");
        getInstallViewModel().setInstallMonitor(dynamicInstallMonitor);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(Constants.KEY_NAVIGATED, this.navigated);
    }

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment$StateObserver;", "Landroidx/lifecycle/Observer;", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "monitor", "Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;", "(Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment;Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;)V", "onChanged", "", "sessionState", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private final class StateObserver implements Observer<SplitInstallSessionState> {
        private final DynamicInstallMonitor monitor;
        final /* synthetic */ AbstractProgressFragment this$0;

        public StateObserver(AbstractProgressFragment abstractProgressFragment, DynamicInstallMonitor monitor) {
            Intrinsics.checkNotNullParameter(monitor, "monitor");
            this.this$0 = abstractProgressFragment;
            this.monitor = monitor;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(SplitInstallSessionState sessionState) {
            Intrinsics.checkNotNullParameter(sessionState, "sessionState");
            if (sessionState.hasTerminalStatus()) {
                this.monitor.getStatus().removeObserver(this);
            }
            switch (sessionState.status()) {
                case 0:
                    this.this$0.onFailed(-100);
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 9:
                    this.this$0.onProgress(sessionState.status(), sessionState.bytesDownloaded(), sessionState.totalBytesToDownload());
                    return;
                case 5:
                    this.this$0.onInstalled();
                    this.this$0.navigate$navigation_dynamic_features_fragment_release();
                    return;
                case 6:
                    this.this$0.onFailed(sessionState.errorCode());
                    return;
                case 7:
                    this.this$0.onCancelled();
                    return;
                case 8:
                    try {
                        SplitInstallManager splitInstallManager = this.monitor.getSplitInstallManager();
                        if (splitInstallManager == null) {
                            this.this$0.onFailed(-100);
                            return;
                        }
                        final AbstractProgressFragment abstractProgressFragment = this.this$0;
                        splitInstallManager.startConfirmationDialogForResult(sessionState, new IntentSenderForResultStarter() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$StateObserver$$ExternalSyntheticLambda0
                            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
                            public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
                                AbstractProgressFragment.StateObserver.onChanged$lambda$0(AbstractProgressFragment.this, intentSender, i, intent, i2, i3, i4, bundle);
                            }
                        }, 1);
                        return;
                    } catch (IntentSender.SendIntentException unused) {
                        this.this$0.onFailed(-100);
                        return;
                    }
                default:
                    return;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onChanged$lambda$0(AbstractProgressFragment this$0, IntentSender intent, int i, Intent intent2, int i2, int i3, int i4, Bundle bundle) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this$0.intentSenderLauncher.launch(new IntentSenderRequest.Builder(intent).setFillInIntent(intent2).setFlags(i3, i2).build());
        }
    }
}
