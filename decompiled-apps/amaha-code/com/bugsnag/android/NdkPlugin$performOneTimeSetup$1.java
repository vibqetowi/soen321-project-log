package com.bugsnag.android;

import com.bugsnag.android.NdkPlugin;
import kotlin.jvm.internal.i;
/* compiled from: NdkPlugin.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bugsnag/android/Event;", "onError"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NdkPlugin$performOneTimeSetup$1 implements OnErrorCallback {
    public static final NdkPlugin$performOneTimeSetup$1 INSTANCE = new NdkPlugin$performOneTimeSetup$1();

    @Override // com.bugsnag.android.OnErrorCallback
    public final boolean onError(Event it) {
        NdkPlugin.Companion unused;
        i.h(it, "it");
        Error error = it.getErrors().get(0);
        i.c(error, "error");
        error.setErrorClass("NdkLinkError");
        unused = NdkPlugin.Companion;
        error.setErrorMessage("Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors");
        return true;
    }
}
