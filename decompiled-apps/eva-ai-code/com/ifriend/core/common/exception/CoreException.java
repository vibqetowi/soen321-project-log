package com.ifriend.core.common.exception;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CoreException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\nB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException;", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "NetworkException", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CoreException extends Throwable {
    private final String message;
    private final Throwable throwable;

    public CoreException() {
        this(null, null, 3, null);
    }

    public /* synthetic */ CoreException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public CoreException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.throwable = th;
    }

    /* compiled from: CoreException.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "Lcom/ifriend/core/common/exception/CoreException;", "()V", "EmptyResponseException", "HttpStatusException", "InvalidToken", "NetworkConnection", "ResponseException", "TimeoutException", "TooManyRequests", "Unauthorized", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$EmptyResponseException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$HttpStatusException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$InvalidToken;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$NetworkConnection;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$ResponseException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$TimeoutException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$TooManyRequests;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$Unauthorized;", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class NetworkException extends CoreException {
        public /* synthetic */ NetworkException(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NetworkException() {
            super(null, null, 3, null);
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$NetworkConnection;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NetworkConnection extends NetworkException {
            public static final NetworkConnection INSTANCE = new NetworkConnection();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof NetworkConnection) {
                    NetworkConnection networkConnection = (NetworkConnection) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -769695036;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NetworkConnection";
            }

            private NetworkConnection() {
                super(null);
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$TimeoutException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class TimeoutException extends NetworkException {
            public static final TimeoutException INSTANCE = new TimeoutException();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof TimeoutException) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -125121066;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "TimeoutException";
            }

            private TimeoutException() {
                super(null);
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$HttpStatusException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "httpStatus", "", "(I)V", "getHttpStatus", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class HttpStatusException extends NetworkException {
            private final int httpStatus;

            public static /* synthetic */ HttpStatusException copy$default(HttpStatusException httpStatusException, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpStatusException.httpStatus;
                }
                return httpStatusException.copy(i);
            }

            public final int component1() {
                return this.httpStatus;
            }

            public final HttpStatusException copy(int i) {
                return new HttpStatusException(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HttpStatusException) && this.httpStatus == ((HttpStatusException) obj).httpStatus;
            }

            public int hashCode() {
                return this.httpStatus;
            }

            @Override // java.lang.Throwable
            public String toString() {
                int i = this.httpStatus;
                return "HttpStatusException(httpStatus=" + i + ")";
            }

            public HttpStatusException(int i) {
                super(null);
                this.httpStatus = i;
            }

            public final int getHttpStatus() {
                return this.httpStatus;
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$ResponseException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "httpStatus", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "description", "(ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getHttpStatus", "()I", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ResponseException extends NetworkException {
            private final String description;
            private final int httpStatus;
            private final String message;

            public static /* synthetic */ ResponseException copy$default(ResponseException responseException, int i, String str, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = responseException.httpStatus;
                }
                if ((i2 & 2) != 0) {
                    str = responseException.message;
                }
                if ((i2 & 4) != 0) {
                    str2 = responseException.description;
                }
                return responseException.copy(i, str, str2);
            }

            public final int component1() {
                return this.httpStatus;
            }

            public final String component2() {
                return this.message;
            }

            public final String component3() {
                return this.description;
            }

            public final ResponseException copy(int i, String message, String description) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(description, "description");
                return new ResponseException(i, message, description);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ResponseException) {
                    ResponseException responseException = (ResponseException) obj;
                    return this.httpStatus == responseException.httpStatus && Intrinsics.areEqual(this.message, responseException.message) && Intrinsics.areEqual(this.description, responseException.description);
                }
                return false;
            }

            public int hashCode() {
                return (((this.httpStatus * 31) + this.message.hashCode()) * 31) + this.description.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                int i = this.httpStatus;
                String str = this.message;
                String str2 = this.description;
                return "ResponseException(httpStatus=" + i + ", message=" + str + ", description=" + str2 + ")";
            }

            public final int getHttpStatus() {
                return this.httpStatus;
            }

            @Override // com.ifriend.core.common.exception.CoreException, java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public final String getDescription() {
                return this.description;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResponseException(int i, String message, String description) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(description, "description");
                this.httpStatus = i;
                this.message = message;
                this.description = description;
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$Unauthorized;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Unauthorized extends NetworkException {
            public static final Unauthorized INSTANCE = new Unauthorized();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Unauthorized) {
                    Unauthorized unauthorized = (Unauthorized) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1672267044;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Unauthorized";
            }

            private Unauthorized() {
                super(null);
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$TooManyRequests;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class TooManyRequests extends NetworkException {
            public static final TooManyRequests INSTANCE = new TooManyRequests();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof TooManyRequests) {
                    TooManyRequests tooManyRequests = (TooManyRequests) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1305565233;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "TooManyRequests";
            }

            private TooManyRequests() {
                super(null);
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$EmptyResponseException;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class EmptyResponseException extends NetworkException {
            public static final EmptyResponseException INSTANCE = new EmptyResponseException();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof EmptyResponseException) {
                    EmptyResponseException emptyResponseException = (EmptyResponseException) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 884085545;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "EmptyResponseException";
            }

            private EmptyResponseException() {
                super(null);
            }
        }

        /* compiled from: CoreException.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/core/common/exception/CoreException$NetworkException$InvalidToken;", "Lcom/ifriend/core/common/exception/CoreException$NetworkException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class InvalidToken extends NetworkException {
            public static final InvalidToken INSTANCE = new InvalidToken();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof InvalidToken) {
                    InvalidToken invalidToken = (InvalidToken) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1776264150;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "InvalidToken";
            }

            private InvalidToken() {
                super(null);
            }
        }
    }
}
