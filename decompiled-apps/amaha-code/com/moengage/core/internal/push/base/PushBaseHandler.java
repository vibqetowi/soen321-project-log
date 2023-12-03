package com.moengage.core.internal.push.base;

import android.content.Context;
import androidx.annotation.Keep;
import ih.p;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PushBaseHandler.kt */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lcom/moengage/core/internal/push/base/PushBaseHandler;", "", "Landroid/content/Context;", "context", "Lhs/k;", "onAppOpen", "Lih/p;", "sdkInstance", "onLogout", "updateNotificationPermission", "", "", "payload", "requestPushPermission", "navigateToSettings", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface PushBaseHandler {
    void navigateToSettings(Context context);

    void onAppOpen(Context context);

    void onLogout(Context context, p pVar);

    void requestPushPermission(Context context, Map<String, String> map);

    void updateNotificationPermission(Context context, p pVar);
}
