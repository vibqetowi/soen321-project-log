package com.ifriend.billing.api.models;

import com.android.billingclient.api.Purchase;
import com.ifiend.billing.impl.manager.BillingManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingPurchasesResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "", "Failure", "Successful", "UserCanceledFailure", "Lcom/ifriend/billing/api/models/BillingPurchasesResult$Failure;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult$Successful;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult$UserCanceledFailure;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BillingPurchasesResult {

    /* compiled from: BillingPurchasesResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPurchasesResult$Successful;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult;", BillingManagerImpl.PURCHASES_KEY, "", "Lcom/android/billingclient/api/Purchase;", "(Ljava/util/List;)V", "getPurchases", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Successful implements BillingPurchasesResult {
        private final List<Purchase> purchases;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Successful copy$default(Successful successful, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = successful.purchases;
            }
            return successful.copy(list);
        }

        public final List<Purchase> component1() {
            return this.purchases;
        }

        public final Successful copy(List<? extends Purchase> purchases) {
            Intrinsics.checkNotNullParameter(purchases, "purchases");
            return new Successful(purchases);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && Intrinsics.areEqual(this.purchases, ((Successful) obj).purchases);
        }

        public int hashCode() {
            return this.purchases.hashCode();
        }

        public String toString() {
            List<Purchase> list = this.purchases;
            return "Successful(purchases=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Successful(List<? extends Purchase> purchases) {
            Intrinsics.checkNotNullParameter(purchases, "purchases");
            this.purchases = purchases;
        }

        public final List<Purchase> getPurchases() {
            return this.purchases;
        }
    }

    /* compiled from: BillingPurchasesResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPurchasesResult$Failure;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Failure implements BillingPurchasesResult {
        public static final Failure INSTANCE = new Failure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 875431769;
        }

        public String toString() {
            return "Failure";
        }

        private Failure() {
        }
    }

    /* compiled from: BillingPurchasesResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPurchasesResult$UserCanceledFailure;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserCanceledFailure implements BillingPurchasesResult {
        public static final UserCanceledFailure INSTANCE = new UserCanceledFailure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UserCanceledFailure) {
                UserCanceledFailure userCanceledFailure = (UserCanceledFailure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1740404043;
        }

        public String toString() {
            return "UserCanceledFailure";
        }

        private UserCanceledFailure() {
        }
    }
}
