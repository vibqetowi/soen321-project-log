package com.ifriend.domain.models.authorization;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: EmailLoginResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "EmailInvalid", "EmailNotRegistered", "Failure", "PasswordIsWrong", "Success", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse$EmailInvalid;", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse$EmailNotRegistered;", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse$Failure;", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse$PasswordIsWrong;", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse$Success;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EmailLoginResponse<T> {
    public /* synthetic */ EmailLoginResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: EmailLoginResponse.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/models/authorization/EmailLoginResponse$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Success<T> extends EmailLoginResponse<T> {
        private final T data;

        public Success(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }

    private EmailLoginResponse() {
    }

    /* compiled from: EmailLoginResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/models/authorization/EmailLoginResponse$Failure;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Failure<T> extends EmailLoginResponse<T> {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: EmailLoginResponse.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/domain/models/authorization/EmailLoginResponse$EmailNotRegistered;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class EmailNotRegistered<T> extends EmailLoginResponse<T> {
        public EmailNotRegistered() {
            super(null);
        }
    }

    /* compiled from: EmailLoginResponse.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/domain/models/authorization/EmailLoginResponse$PasswordIsWrong;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PasswordIsWrong<T> extends EmailLoginResponse<T> {
        public PasswordIsWrong() {
            super(null);
        }
    }

    /* compiled from: EmailLoginResponse.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/domain/models/authorization/EmailLoginResponse$EmailInvalid;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class EmailInvalid<T> extends EmailLoginResponse<T> {
        public EmailInvalid() {
            super(null);
        }
    }
}
