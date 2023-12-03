package com.facebook;

import h5.n;
import h5.u;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: FacebookGraphResponseException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: v  reason: collision with root package name */
    public final u f6109v;

    public FacebookGraphResponseException(u uVar, String str) {
        super(str);
        this.f6109v = uVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        n nVar;
        u uVar = this.f6109v;
        if (uVar == null) {
            nVar = null;
        } else {
            nVar = uVar.f17318c;
        }
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (nVar != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(nVar.f17259u);
            sb2.append(", facebookErrorCode: ");
            sb2.append(nVar.f17260v);
            sb2.append(", facebookErrorType: ");
            sb2.append(nVar.f17262x);
            sb2.append(", message: ");
            sb2.append(nVar.a());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        i.f(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
