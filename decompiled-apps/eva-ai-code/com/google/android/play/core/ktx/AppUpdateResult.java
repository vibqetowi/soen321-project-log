package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "()V", "Available", "Downloaded", "InProgress", "NotAvailable", "Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class AppUpdateResult {

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u0014\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "startFlexibleUpdate", "", "activity", "Landroid/app/Activity;", "requestCode", "", "fragment", "Landroidx/fragment/app/Fragment;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "startImmediateUpdate", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Available extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;
        private final AppUpdateInfo updateInfo;

        public final AppUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(AppUpdateManager appUpdateManager, AppUpdateInfo updateInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            this.appUpdateManager = appUpdateManager;
            this.updateInfo = updateInfo;
        }

        public final boolean startFlexibleUpdate(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(0).build());
        }

        public final boolean startFlexibleUpdate(Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(0).build(), i);
        }

        public final boolean startFlexibleUpdate(Fragment fragment, int i) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions build = AppUpdateOptions.newBuilder(0).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder(AppUpdateType.FLEXIBLE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, build, i);
        }

        public final boolean startImmediateUpdate(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(1).build());
        }

        public final boolean startImmediateUpdate(Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(1).build(), i);
        }

        public final boolean startImmediateUpdate(Fragment fragment, int i) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions build = AppUpdateOptions.newBuilder(1).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder(AppUpdateType.IMMEDIATE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, build, i);
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "completeUpdate", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Downloaded extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;

        public final Object completeUpdate(Continuation<? super Unit> continuation) {
            Object requestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.appUpdateManager, continuation);
            return requestCompleteUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? requestCompleteUpdate : Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(AppUpdateManager appUpdateManager) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            this.appUpdateManager = appUpdateManager;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "installState", "Lcom/google/android/play/core/install/InstallState;", "(Lcom/google/android/play/core/install/InstallState;)V", "getInstallState", "()Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class InProgress extends AppUpdateResult {
        private final InstallState installState;

        public final InstallState getInstallState() {
            return this.installState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(InstallState installState) {
            super(null);
            Intrinsics.checkNotNullParameter(installState, "installState");
            this.installState = installState;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "()V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotAvailable extends AppUpdateResult {
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    private AppUpdateResult() {
    }

    public /* synthetic */ AppUpdateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
