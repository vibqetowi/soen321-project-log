package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: FacebookDialogException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookDialogException extends FacebookException {

    /* renamed from: v  reason: collision with root package name */
    public final int f6106v;

    /* renamed from: w  reason: collision with root package name */
    public final String f6107w;

    public FacebookDialogException(String str, int i6, String str2) {
        super(str);
        this.f6106v = i6;
        this.f6107w = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f6106v + ", message: " + getMessage() + ", url: " + this.f6107w + "}";
        i.f(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
