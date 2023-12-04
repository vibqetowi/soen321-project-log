package com.ifiend.billing.impl.manager;

import com.android.billingclient.api.BillingResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingConnectionResult;", "", "isConnected", "", "()Z", "BillingConnected", "BillingConnectionError", "BillingServiceDisconnected", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult$BillingConnected;", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult$BillingConnectionError;", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult$BillingServiceDisconnected;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
interface BillingConnectionResult {
    boolean isConnected();

    /* compiled from: BillingManagerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean isConnected(BillingConnectionResult billingConnectionResult) {
            return billingConnectionResult instanceof BillingConnected;
        }
    }

    /* compiled from: BillingManagerImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingConnectionResult$BillingConnected;", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingConnected implements BillingConnectionResult {
        public static final BillingConnected INSTANCE = new BillingConnected();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingConnected) {
                BillingConnected billingConnected = (BillingConnected) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -444869168;
        }

        public String toString() {
            return "BillingConnected";
        }

        private BillingConnected() {
        }

        @Override // com.ifiend.billing.impl.manager.BillingConnectionResult
        public boolean isConnected() {
            return DefaultImpls.isConnected(this);
        }
    }

    /* compiled from: BillingManagerImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingConnectionResult$BillingConnectionError;", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult;", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "(Lcom/android/billingclient/api/BillingResult;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingConnectionError implements BillingConnectionResult {
        private final BillingResult billingResult;

        public static /* synthetic */ BillingConnectionError copy$default(BillingConnectionError billingConnectionError, BillingResult billingResult, int i, Object obj) {
            if ((i & 1) != 0) {
                billingResult = billingConnectionError.billingResult;
            }
            return billingConnectionError.copy(billingResult);
        }

        public final BillingResult component1() {
            return this.billingResult;
        }

        public final BillingConnectionError copy(BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            return new BillingConnectionError(billingResult);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BillingConnectionError) && Intrinsics.areEqual(this.billingResult, ((BillingConnectionError) obj).billingResult);
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        public String toString() {
            BillingResult billingResult = this.billingResult;
            return "BillingConnectionError(billingResult=" + billingResult + ")";
        }

        public BillingConnectionError(BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        @Override // com.ifiend.billing.impl.manager.BillingConnectionResult
        public boolean isConnected() {
            return DefaultImpls.isConnected(this);
        }
    }

    /* compiled from: BillingManagerImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingConnectionResult$BillingServiceDisconnected;", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingServiceDisconnected implements BillingConnectionResult {
        public static final BillingServiceDisconnected INSTANCE = new BillingServiceDisconnected();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingServiceDisconnected) {
                BillingServiceDisconnected billingServiceDisconnected = (BillingServiceDisconnected) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 960083863;
        }

        public String toString() {
            return "BillingServiceDisconnected";
        }

        private BillingServiceDisconnected() {
        }

        @Override // com.ifiend.billing.impl.manager.BillingConnectionResult
        public boolean isConnected() {
            return DefaultImpls.isConnected(this);
        }
    }
}
