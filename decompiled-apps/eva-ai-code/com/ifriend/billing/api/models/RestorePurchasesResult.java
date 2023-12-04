package com.ifriend.billing.api.models;

import kotlin.Metadata;
/* compiled from: RestorePurchasesResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "", "NoPurchases", "Successful", "Lcom/ifriend/billing/api/models/RestorePurchasesResult$NoPurchases;", "Lcom/ifriend/billing/api/models/RestorePurchasesResult$Successful;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RestorePurchasesResult {

    /* compiled from: RestorePurchasesResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/models/RestorePurchasesResult$Successful;", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Successful implements RestorePurchasesResult {
        public static final Successful INSTANCE = new Successful();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Successful) {
                Successful successful = (Successful) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1810152638;
        }

        public String toString() {
            return "Successful";
        }

        private Successful() {
        }
    }

    /* compiled from: RestorePurchasesResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/models/RestorePurchasesResult$NoPurchases;", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NoPurchases implements RestorePurchasesResult {
        public static final NoPurchases INSTANCE = new NoPurchases();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NoPurchases) {
                NoPurchases noPurchases = (NoPurchases) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1326041389;
        }

        public String toString() {
            return "NoPurchases";
        }

        private NoPurchases() {
        }
    }
}
