package com.bugsnag.android;

import is.u;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: StrictModeOnErrorCallback.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/StrictModeOnErrorCallback;", "Lcom/bugsnag/android/OnErrorCallback;", "errMsg", "", "(Ljava/lang/String;)V", "onError", "", "event", "Lcom/bugsnag/android/Event;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StrictModeOnErrorCallback implements OnErrorCallback {
    private final String errMsg;

    public StrictModeOnErrorCallback(String errMsg) {
        i.h(errMsg, "errMsg");
        this.errMsg = errMsg;
    }

    @Override // com.bugsnag.android.OnErrorCallback
    public boolean onError(Event event) {
        i.h(event, "event");
        event.updateSeverityInternal(Severity.INFO);
        event.updateSeverityReason("strictMode");
        List<Error> errors = event.getErrors();
        i.c(errors, "event.errors");
        Error error = (Error) u.i2(errors);
        if (error != null) {
            error.setErrorMessage(this.errMsg);
            return true;
        }
        return true;
    }
}
