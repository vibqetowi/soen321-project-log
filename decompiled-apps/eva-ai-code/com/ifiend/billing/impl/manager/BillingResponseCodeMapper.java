package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
/* compiled from: BillingResponseCodeMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingResponseCodeMapper;", "", "()V", "map", "", "responseCode", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingResponseCodeMapper {
    public final String map(int i) {
        if (i != -2) {
            if (i != -1) {
                if (i != 12) {
                    switch (i) {
                        case 1:
                            return "Purchase has been canceled by the user.";
                        case 2:
                        case 3:
                            return "Billing service is currently unavailable.";
                        case 4:
                            return "The requested item is currently not available for purchase.";
                        case 5:
                            return "An error occurred while processing the request.";
                        case 6:
                            return "Critical error occurred during the payment process.";
                        case 7:
                            return "You already own this item, and no further action is required.";
                        case 8:
                            return "You do not own this item.";
                        default:
                            return "An unknown error occurred.";
                    }
                }
                return "Network error occurred during the operation";
            }
            return "Billing service has been disconnected.";
        }
        return "This feature is not supported on your device.";
    }
}
