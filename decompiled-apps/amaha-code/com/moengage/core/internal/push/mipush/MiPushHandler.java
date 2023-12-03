package com.moengage.core.internal.push.mipush;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
/* compiled from: MiPushHandler.kt */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/moengage/core/internal/push/mipush/MiPushHandler;", "", "Landroid/content/Context;", "context", "Lhs/k;", "onAppOpen", "initialiseModule", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface MiPushHandler {
    void initialiseModule(Context context);

    void onAppOpen(Context context);
}
