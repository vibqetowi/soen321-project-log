package com.ifriend.billing.api.exception;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingManagerException.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ifriend/billing/api/exception/BillingManagerException;", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "BillingClientCanNotConnectionException", "BillingClientCanNotFindProductException", "BillingClientFetchProductsException", "BillingClientNotReadyException", "BuyProductException", "Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientCanNotConnectionException;", "Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientCanNotFindProductException;", "Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientFetchProductsException;", "Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientNotReadyException;", "Lcom/ifriend/billing/api/exception/BillingManagerException$BuyProductException;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BillingManagerException extends Throwable {
    private final String message;
    private final Throwable throwable;

    public /* synthetic */ BillingManagerException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public /* synthetic */ BillingManagerException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    private BillingManagerException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.throwable = th;
    }

    /* compiled from: BillingManagerException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientNotReadyException;", "Lcom/ifriend/billing/api/exception/BillingManagerException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingClientNotReadyException extends BillingManagerException {
        public static final BillingClientNotReadyException INSTANCE = new BillingClientNotReadyException();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingClientNotReadyException) {
                BillingClientNotReadyException billingClientNotReadyException = (BillingClientNotReadyException) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 399838372;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BillingClientNotReadyException";
        }

        private BillingClientNotReadyException() {
            super(null, null, 3, null);
        }
    }

    /* compiled from: BillingManagerException.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientCanNotConnectionException;", "Lcom/ifriend/billing/api/exception/BillingManagerException;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingClientCanNotConnectionException extends BillingManagerException {
        private final String message;

        public BillingClientCanNotConnectionException() {
            this(null, 1, null);
        }

        public static /* synthetic */ BillingClientCanNotConnectionException copy$default(BillingClientCanNotConnectionException billingClientCanNotConnectionException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = billingClientCanNotConnectionException.message;
            }
            return billingClientCanNotConnectionException.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final BillingClientCanNotConnectionException copy(String str) {
            return new BillingClientCanNotConnectionException(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BillingClientCanNotConnectionException) && Intrinsics.areEqual(this.message, ((BillingClientCanNotConnectionException) obj).message);
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            String str = this.message;
            return "BillingClientCanNotConnectionException(message=" + str + ")";
        }

        public /* synthetic */ BillingClientCanNotConnectionException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ifriend.billing.api.exception.BillingManagerException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public BillingClientCanNotConnectionException(String str) {
            super(str, null, 2, null);
            this.message = str;
        }
    }

    /* compiled from: BillingManagerException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientCanNotFindProductException;", "Lcom/ifriend/billing/api/exception/BillingManagerException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingClientCanNotFindProductException extends BillingManagerException {
        public static final BillingClientCanNotFindProductException INSTANCE = new BillingClientCanNotFindProductException();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingClientCanNotFindProductException) {
                BillingClientCanNotFindProductException billingClientCanNotFindProductException = (BillingClientCanNotFindProductException) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -893305321;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BillingClientCanNotFindProductException";
        }

        private BillingClientCanNotFindProductException() {
            super(null, null, 3, null);
        }
    }

    /* compiled from: BillingManagerException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/exception/BillingManagerException$BillingClientFetchProductsException;", "Lcom/ifriend/billing/api/exception/BillingManagerException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingClientFetchProductsException extends BillingManagerException {
        public static final BillingClientFetchProductsException INSTANCE = new BillingClientFetchProductsException();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingClientFetchProductsException) {
                BillingClientFetchProductsException billingClientFetchProductsException = (BillingClientFetchProductsException) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1371326924;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BillingClientFetchProductsException";
        }

        private BillingClientFetchProductsException() {
            super(null, null, 3, null);
        }
    }

    /* compiled from: BillingManagerException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/exception/BillingManagerException$BuyProductException;", "Lcom/ifriend/billing/api/exception/BillingManagerException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BuyProductException extends BillingManagerException {
        public static final BuyProductException INSTANCE = new BuyProductException();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BuyProductException) {
                BuyProductException buyProductException = (BuyProductException) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -915558117;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BuyProductException";
        }

        private BuyProductException() {
            super(null, null, 3, null);
        }
    }
}
