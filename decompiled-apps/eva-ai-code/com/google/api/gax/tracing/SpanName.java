package com.google.api.gax.tracing;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
@InternalApi("For google-cloud-java client use only")
@BetaApi("Surface for tracing is not yet stable")
/* loaded from: classes7.dex */
public abstract class SpanName {
    public abstract String getClientName();

    public abstract String getMethodName();

    public static SpanName of(String str, String str2) {
        return new AutoValue_SpanName(str, str2);
    }

    public String toString() {
        return getClientName() + "." + getMethodName();
    }
}
