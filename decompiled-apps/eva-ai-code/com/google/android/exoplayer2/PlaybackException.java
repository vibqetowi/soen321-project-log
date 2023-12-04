package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* loaded from: classes2.dex */
public class PlaybackException extends Exception implements Bundleable {
    public static final Bundleable.Creator<PlaybackException> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.PlaybackException$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return new PlaybackException(bundle);
        }
    };
    public static final int CUSTOM_ERROR_CODE_BASE = 1000000;
    public static final int ERROR_CODE_AUDIO_TRACK_INIT_FAILED = 5001;
    public static final int ERROR_CODE_AUDIO_TRACK_WRITE_FAILED = 5002;
    public static final int ERROR_CODE_BEHIND_LIVE_WINDOW = 1002;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_DECODER_QUERY_FAILED = 4002;
    public static final int ERROR_CODE_DECODING_FAILED = 4003;
    public static final int ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 4004;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 4005;
    public static final int ERROR_CODE_DRM_CONTENT_ERROR = 6003;
    public static final int ERROR_CODE_DRM_DEVICE_REVOKED = 6007;
    public static final int ERROR_CODE_DRM_DISALLOWED_OPERATION = 6005;
    public static final int ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED = 6004;
    public static final int ERROR_CODE_DRM_LICENSE_EXPIRED = 6008;
    public static final int ERROR_CODE_DRM_PROVISIONING_FAILED = 6002;
    public static final int ERROR_CODE_DRM_SCHEME_UNSUPPORTED = 6001;
    public static final int ERROR_CODE_DRM_SYSTEM_ERROR = 6006;
    public static final int ERROR_CODE_DRM_UNSPECIFIED = 6000;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1004;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_PARSING_CONTAINER_MALFORMED = 3001;
    public static final int ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_PARSING_MANIFEST_MALFORMED = 3002;
    public static final int ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED = 3004;
    public static final int ERROR_CODE_REMOTE_ERROR = 1001;
    public static final int ERROR_CODE_TIMEOUT = 1003;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final int FIELD_INT_ERROR_CODE = 0;
    private static final int FIELD_LONG_TIMESTAMP_MS = 1;
    private static final int FIELD_STRING_CAUSE_CLASS_NAME = 3;
    private static final int FIELD_STRING_CAUSE_MESSAGE = 4;
    private static final int FIELD_STRING_MESSAGE = 2;
    public final int errorCode;
    public final long timestampMs;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ErrorCode {
    }

    public static String getErrorCodeName(int i) {
        if (i != 5001) {
            if (i != 5002) {
                switch (i) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case 1004:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case ERROR_CODE_IO_NETWORK_CONNECTION_FAILED /* 2001 */:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT /* 2002 */:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE /* 2003 */:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case ERROR_CODE_IO_BAD_HTTP_STATUS /* 2004 */:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case ERROR_CODE_IO_FILE_NOT_FOUND /* 2005 */:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case ERROR_CODE_IO_NO_PERMISSION /* 2006 */:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED /* 2007 */:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case 3003:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case 3004:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case ERROR_CODE_DECODER_INIT_FAILED /* 4001 */:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case ERROR_CODE_DECODER_QUERY_FAILED /* 4002 */:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case ERROR_CODE_DECODING_FAILED /* 4003 */:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES /* 4004 */:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case ERROR_CODE_DECODING_FORMAT_UNSUPPORTED /* 4005 */:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            default:
                                                switch (i) {
                                                    case ERROR_CODE_DRM_UNSPECIFIED /* 6000 */:
                                                        return "ERROR_CODE_DRM_UNSPECIFIED";
                                                    case ERROR_CODE_DRM_SCHEME_UNSUPPORTED /* 6001 */:
                                                        return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    case ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                                                        return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    case ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                                                        return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    case ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                                                        return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    case ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                                                        return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    case ERROR_CODE_DRM_SYSTEM_ERROR /* 6006 */:
                                                        return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    case ERROR_CODE_DRM_DEVICE_REVOKED /* 6007 */:
                                                        return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    case ERROR_CODE_DRM_LICENSE_EXPIRED /* 6008 */:
                                                        return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    default:
                                                        return i >= 1000000 ? "custom error code" : "invalid error code";
                                                }
                                        }
                                }
                        }
                }
            }
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
    }

    public final String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public PlaybackException(String str, Throwable th, int i) {
        this(str, th, i, Clock.DEFAULT.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PlaybackException(Bundle bundle) {
        this(bundle.getString(keyForField(2)), getCauseFromBundle(bundle), bundle.getInt(keyForField(0), 1000), bundle.getLong(keyForField(1), SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r3 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null) {
                }
            } else if (!Util.areEqual(cause.getMessage(), cause2.getMessage()) || !Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            return this.errorCode == playbackException.errorCode && Util.areEqual(getMessage(), playbackException.getMessage()) && this.timestampMs == playbackException.timestampMs;
        }
        return false;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), this.errorCode);
        bundle.putLong(keyForField(1), this.timestampMs);
        bundle.putString(keyForField(2), getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(keyForField(3), cause.getClass().getName());
            bundle.putString(keyForField(4), cause.getMessage());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    private static Throwable createThrowable(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static RemoteException createRemoteException(String str) {
        return new RemoteException(str);
    }

    private static Throwable getCauseFromBundle(Bundle bundle) {
        String string = bundle.getString(keyForField(3));
        String string2 = bundle.getString(keyForField(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable createThrowable = Throwable.class.isAssignableFrom(cls) ? createThrowable(cls, string2) : null;
            if (createThrowable != null) {
                return createThrowable;
            }
        } catch (Throwable unused) {
        }
        return createRemoteException(string2);
    }
}
