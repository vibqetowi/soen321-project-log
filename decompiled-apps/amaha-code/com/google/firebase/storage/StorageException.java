package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import v9.o;
/* loaded from: classes.dex */
public class StorageException extends FirebaseException {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ERROR_BUCKET_NOT_FOUND = -13011;
    public static final int ERROR_CANCELED = -13040;
    public static final int ERROR_INVALID_CHECKSUM = -13031;
    public static final int ERROR_NOT_AUTHENTICATED = -13020;
    public static final int ERROR_NOT_AUTHORIZED = -13021;
    public static final int ERROR_OBJECT_NOT_FOUND = -13010;
    public static final int ERROR_PROJECT_NOT_FOUND = -13012;
    public static final int ERROR_QUOTA_EXCEEDED = -13013;
    public static final int ERROR_RETRY_LIMIT_EXCEEDED = -13030;
    public static final int ERROR_UNKNOWN = -13000;
    private static final int NETWORK_UNAVAILABLE = -2;
    private static final String TAG = "StorageException";
    private Throwable cause;
    private final int errorCode;
    private final int httpResultCode;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ErrorCode {
    }

    public StorageException(int i6, Throwable th2, int i10) {
        super(getErrorMessageForCode(i6));
        this.cause = th2;
        this.errorCode = i6;
        this.httpResultCode = i10;
        Log.e(TAG, "StorageException has occurred.\n" + getErrorMessageForCode(i6) + "\n Code: " + i6 + " HttpResult: " + i10);
        Throwable th3 = this.cause;
        if (th3 != null) {
            Log.e(TAG, th3.getMessage(), this.cause);
        }
    }

    private static int calculateErrorCode(Status status) {
        return status.f7298v == 16 ? ERROR_CANCELED : status.equals(Status.C) ? ERROR_RETRY_LIMIT_EXCEEDED : ERROR_UNKNOWN;
    }

    public static StorageException fromErrorStatus(Status status) {
        o.h(status);
        o.b(!status.f0());
        return new StorageException(calculateErrorCode(status), null, 0);
    }

    public static StorageException fromException(Throwable th2) {
        return fromExceptionAndHttpCode(th2, 0);
    }

    public static StorageException fromExceptionAndHttpCode(Throwable th2, int i6) {
        if (th2 instanceof StorageException) {
            return (StorageException) th2;
        }
        if (isResultSuccess(i6) && th2 == null) {
            return null;
        }
        return new StorageException(calculateErrorCode(th2, i6), th2, i6);
    }

    public static String getErrorMessageForCode(int i6) {
        if (i6 != -13040) {
            if (i6 != -13031) {
                if (i6 != -13030) {
                    if (i6 != -13021) {
                        if (i6 != -13020) {
                            switch (i6) {
                                case ERROR_QUOTA_EXCEEDED /* -13013 */:
                                    return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
                                case ERROR_PROJECT_NOT_FOUND /* -13012 */:
                                    return "Project does not exist.";
                                case ERROR_BUCKET_NOT_FOUND /* -13011 */:
                                    return "Bucket does not exist.";
                                case ERROR_OBJECT_NOT_FOUND /* -13010 */:
                                    return "Object does not exist at location.";
                                default:
                                    return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
                            }
                        }
                        return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
                    }
                    return "User does not have permission to access this object.";
                }
                return "The operation retry limit has been exceeded.";
            }
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        return "The operation was cancelled.";
    }

    private static boolean isResultSuccess(int i6) {
        if (i6 != 0 && (i6 < 200 || i6 >= 300)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th2 = this.cause;
        if (th2 == this) {
            return null;
        }
        return th2;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getHttpResultCode() {
        return this.httpResultCode;
    }

    public boolean getIsRecoverableException() {
        if (getErrorCode() == -13030) {
            return true;
        }
        return false;
    }

    private static int calculateErrorCode(Throwable th2, int i6) {
        return th2 instanceof CancelException ? ERROR_CANCELED : i6 != -2 ? i6 != 401 ? i6 != 409 ? i6 != 403 ? i6 != 404 ? ERROR_UNKNOWN : ERROR_OBJECT_NOT_FOUND : ERROR_NOT_AUTHORIZED : ERROR_INVALID_CHECKSUM : ERROR_NOT_AUTHENTICATED : ERROR_RETRY_LIMIT_EXCEEDED;
    }
}
