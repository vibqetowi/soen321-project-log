package com.facebook;

import h5.n;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: FacebookServiceException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {

    /* renamed from: v  reason: collision with root package name */
    public final n f6110v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(n requestError, String str) {
        super(str);
        i.g(requestError, "requestError");
        this.f6110v = requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        n nVar = this.f6110v;
        sb2.append(nVar.f17259u);
        sb2.append(", facebookErrorCode: ");
        sb2.append(nVar.f17260v);
        sb2.append(", facebookErrorType: ");
        sb2.append(nVar.f17262x);
        sb2.append(", message: ");
        sb2.append(nVar.a());
        sb2.append("}");
        String sb3 = sb2.toString();
        i.f(sb3, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }
}
