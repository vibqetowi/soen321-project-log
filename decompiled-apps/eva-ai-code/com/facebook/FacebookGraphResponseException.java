package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FacebookGraphResponseException.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "graphResponse", "Lcom/facebook/GraphResponse;", "errorMessage", "", "(Lcom/facebook/GraphResponse;Ljava/lang/String;)V", "getGraphResponse", "()Lcom/facebook/GraphResponse;", "toString", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookGraphResponseException extends FacebookException {
    private final GraphResponse graphResponse;

    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.graphResponse = graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        GraphResponse graphResponse = this.graphResponse;
        FacebookRequestError error = graphResponse == null ? null : graphResponse.getError();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().append(\"{FacebookGraphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (error != null) {
            sb.append("httpResponseCode: ");
            sb.append(error.getRequestStatusCode());
            sb.append(", facebookErrorCode: ");
            sb.append(error.getErrorCode());
            sb.append(", facebookErrorType: ");
            sb.append(error.getErrorType());
            sb.append(", message: ");
            sb.append(error.getErrorMessage());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
