package com.ifriend.domain.exceptions.features.common;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: FeatureException.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/exceptions/features/common/SubscriptionAccessException;", "Lcom/ifriend/domain/exceptions/features/common/FeatureException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionAccessException extends FeatureException {
    public static final SubscriptionAccessException INSTANCE = new SubscriptionAccessException();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubscriptionAccessException) {
            SubscriptionAccessException subscriptionAccessException = (SubscriptionAccessException) obj;
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1871952776;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SubscriptionAccessException";
    }

    private SubscriptionAccessException() {
    }
}
