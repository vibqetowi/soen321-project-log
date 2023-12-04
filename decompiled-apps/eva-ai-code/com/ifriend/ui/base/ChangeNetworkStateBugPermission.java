package com.ifriend.ui.base;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChangeNetworkStateBugPermission.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/ui/base/ChangeNetworkStateBugPermission;", "", "onPermission", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "isBugVersion", "", "()Z", "isBugVersion$delegate", "Lkotlin/Lazy;", "isRequested", "checkPermissionGrantedOnResume", "context", "Landroid/content/Context;", "isPermissionGranted", "isScreenOpened", "request", "showPermissionInformation", "Lcom/ifriend/ui/base/ShowPermissionInformation;", "saveScreenOpened", "showChangePermissionScreen", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChangeNetworkStateBugPermission {
    private static final String BUG_VERSION_NAME = "6.0";
    private static final String CHANGE_NETWORK_STATE_STORAGE_KEY = "changeNetworkStateStorage";
    private final Lazy isBugVersion$delegate;
    private boolean isRequested;
    private final Function0<Unit> onPermission;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ChangeNetworkStateBugPermission(Function0<Unit> onPermission) {
        Intrinsics.checkNotNullParameter(onPermission, "onPermission");
        this.onPermission = onPermission;
        this.isBugVersion$delegate = LazyKt.lazy(ChangeNetworkStateBugPermission$isBugVersion$2.INSTANCE);
    }

    private final boolean isBugVersion() {
        return ((Boolean) this.isBugVersion$delegate.getValue()).booleanValue();
    }

    /* compiled from: ChangeNetworkStateBugPermission.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/ui/base/ChangeNetworkStateBugPermission$Companion;", "", "()V", "BUG_VERSION_NAME", "", "CHANGE_NETWORK_STATE_STORAGE_KEY", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void request(Context context, ShowPermissionInformation showPermissionInformation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showPermissionInformation, "showPermissionInformation");
        if (!isBugVersion()) {
            this.onPermission.invoke();
        } else if (isPermissionGranted(context)) {
            this.onPermission.invoke();
        } else if (isScreenOpened(context)) {
        } else {
            showPermissionInformation.invoke(new ChangeNetworkStateBugPermission$request$1(this, context));
        }
    }

    private final boolean isScreenOpened(Context context) {
        return context.getSharedPreferences(CHANGE_NETWORK_STATE_STORAGE_KEY, 0).getBoolean(CHANGE_NETWORK_STATE_STORAGE_KEY, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScreenOpened(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(CHANGE_NETWORK_STATE_STORAGE_KEY, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(CHANGE_NETWORK_STATE_STORAGE_KEY, true);
        editor.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showChangePermissionScreen(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        String packageName = context.getPackageName();
        intent.setData(Uri.parse("package:" + packageName));
        context.startActivity(intent);
    }

    public final void checkPermissionGrantedOnResume(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isRequested && isPermissionGranted(context)) {
            this.isRequested = false;
            this.onPermission.invoke();
        }
    }

    private final boolean isPermissionGranted(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.CHANGE_NETWORK_STATE") == 0 || Settings.System.canWrite(context);
    }
}
