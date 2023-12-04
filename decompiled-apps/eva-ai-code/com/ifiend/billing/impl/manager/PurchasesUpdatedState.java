package com.ifiend.billing.impl.manager;

import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PurchasesUpdatedState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "", "Failure", "Successful", "SuccessfulWithEmptyPurchase", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState$Failure;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState$Successful;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState$SuccessfulWithEmptyPurchase;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PurchasesUpdatedState {

    /* compiled from: PurchasesUpdatedState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState$Successful;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "purchase", "", "Lcom/android/billingclient/api/Purchase;", "(Ljava/util/List;)V", "getPurchase", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Successful implements PurchasesUpdatedState {
        private final List<Purchase> purchase;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Successful copy$default(Successful successful, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = successful.purchase;
            }
            return successful.copy(list);
        }

        public final List<Purchase> component1() {
            return this.purchase;
        }

        public final Successful copy(List<? extends Purchase> purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            return new Successful(purchase);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && Intrinsics.areEqual(this.purchase, ((Successful) obj).purchase);
        }

        public int hashCode() {
            return this.purchase.hashCode();
        }

        public String toString() {
            List<Purchase> list = this.purchase;
            return "Successful(purchase=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Successful(List<? extends Purchase> purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.purchase = purchase;
        }

        public final List<Purchase> getPurchase() {
            return this.purchase;
        }
    }

    /* compiled from: PurchasesUpdatedState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState$SuccessfulWithEmptyPurchase;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SuccessfulWithEmptyPurchase implements PurchasesUpdatedState {
        public static final SuccessfulWithEmptyPurchase INSTANCE = new SuccessfulWithEmptyPurchase();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SuccessfulWithEmptyPurchase) {
                SuccessfulWithEmptyPurchase successfulWithEmptyPurchase = (SuccessfulWithEmptyPurchase) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1833489122;
        }

        public String toString() {
            return "SuccessfulWithEmptyPurchase";
        }

        private SuccessfulWithEmptyPurchase() {
        }
    }

    /* compiled from: PurchasesUpdatedState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState$Failure;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "responseCode", "", "errorMessage", "", "(ILjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getResponseCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Failure implements PurchasesUpdatedState {
        private final String errorMessage;
        private final int responseCode;

        public static /* synthetic */ Failure copy$default(Failure failure, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failure.responseCode;
            }
            if ((i2 & 2) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(i, str);
        }

        public final int component1() {
            return this.responseCode;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final Failure copy(int i, String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new Failure(i, errorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                return this.responseCode == failure.responseCode && Intrinsics.areEqual(this.errorMessage, failure.errorMessage);
            }
            return false;
        }

        public int hashCode() {
            return (this.responseCode * 31) + this.errorMessage.hashCode();
        }

        public String toString() {
            int i = this.responseCode;
            String str = this.errorMessage;
            return "Failure(responseCode=" + i + ", errorMessage=" + str + ")";
        }

        public Failure(int i, String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.responseCode = i;
            this.errorMessage = errorMessage;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }
}
