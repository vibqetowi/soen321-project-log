package com.bugsnag.android.internal.dag;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ContextModule.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/internal/dag/ContextModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ctx", "getCtx", "()Landroid/content/Context;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ContextModule extends DependencyModule {
    private final Context ctx;

    public ContextModule(Context appContext) {
        i.h(appContext, "appContext");
        if (appContext.getApplicationContext() != null) {
            appContext = appContext.getApplicationContext();
            i.c(appContext, "appContext.applicationContext");
        }
        this.ctx = appContext;
    }

    public final Context getCtx() {
        return this.ctx;
    }
}
