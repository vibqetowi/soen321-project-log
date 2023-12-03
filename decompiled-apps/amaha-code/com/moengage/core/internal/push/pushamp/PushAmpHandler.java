package com.moengage.core.internal.push.pushamp;

import android.content.Context;
import androidx.annotation.Keep;
import ih.p;
import kotlin.Metadata;
/* compiled from: PushAmpHandler.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/moengage/core/internal/push/pushamp/PushAmpHandler;", "", "Landroid/content/Context;", "context", "Lih/p;", "sdkInstance", "Lhs/k;", "onAppOpen", "onLogout", "initialise", "setupPushAmpForBackgroundMode", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface PushAmpHandler {
    void initialise(Context context);

    void onAppOpen(Context context, p pVar);

    void onLogout(Context context, p pVar);

    void setupPushAmpForBackgroundMode(Context context, p pVar);
}
