package com.ifriend.presentation.features.purchases.billing.models;

import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProductPurchaseEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "", "BuyProductFailure", "BuyProductSuccessful", "BuyProductUserCanceled", "InAppPurchaseFailure", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$BuyProductFailure;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$BuyProductSuccessful;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$BuyProductUserCanceled;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$InAppPurchaseFailure;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProductPurchaseEvent {

    /* compiled from: ProductPurchaseEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$BuyProductSuccessful;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "purchase", "", "Lcom/android/billingclient/api/Purchase;", "(Ljava/util/List;)V", "getPurchase", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BuyProductSuccessful implements ProductPurchaseEvent {
        public static final int $stable = 8;
        private final List<Purchase> purchase;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BuyProductSuccessful copy$default(BuyProductSuccessful buyProductSuccessful, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = buyProductSuccessful.purchase;
            }
            return buyProductSuccessful.copy(list);
        }

        public final List<Purchase> component1() {
            return this.purchase;
        }

        public final BuyProductSuccessful copy(List<? extends Purchase> purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            return new BuyProductSuccessful(purchase);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyProductSuccessful) && Intrinsics.areEqual(this.purchase, ((BuyProductSuccessful) obj).purchase);
        }

        public int hashCode() {
            return this.purchase.hashCode();
        }

        public String toString() {
            List<Purchase> list = this.purchase;
            return "BuyProductSuccessful(purchase=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuyProductSuccessful(List<? extends Purchase> purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.purchase = purchase;
        }

        public final List<Purchase> getPurchase() {
            return this.purchase;
        }
    }

    /* compiled from: ProductPurchaseEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$BuyProductFailure;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BuyProductFailure implements ProductPurchaseEvent {
        public static final int $stable = 0;
        public static final BuyProductFailure INSTANCE = new BuyProductFailure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BuyProductFailure) {
                BuyProductFailure buyProductFailure = (BuyProductFailure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1175254849;
        }

        public String toString() {
            return "BuyProductFailure";
        }

        private BuyProductFailure() {
        }
    }

    /* compiled from: ProductPurchaseEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$BuyProductUserCanceled;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BuyProductUserCanceled implements ProductPurchaseEvent {
        public static final int $stable = 0;
        public static final BuyProductUserCanceled INSTANCE = new BuyProductUserCanceled();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BuyProductUserCanceled) {
                BuyProductUserCanceled buyProductUserCanceled = (BuyProductUserCanceled) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1762397741;
        }

        public String toString() {
            return "BuyProductUserCanceled";
        }

        private BuyProductUserCanceled() {
        }
    }

    /* compiled from: ProductPurchaseEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent$InAppPurchaseFailure;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InAppPurchaseFailure implements ProductPurchaseEvent {
        public static final int $stable = 0;
        public static final InAppPurchaseFailure INSTANCE = new InAppPurchaseFailure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InAppPurchaseFailure) {
                InAppPurchaseFailure inAppPurchaseFailure = (InAppPurchaseFailure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -755665555;
        }

        public String toString() {
            return "InAppPurchaseFailure";
        }

        private InAppPurchaseFailure() {
        }
    }
}
