package com.google.api.gax.rpc;

import com.google.api.gax.rpc.StatusCode;
/* loaded from: classes7.dex */
public class ApiExceptionFactory {
    private ApiExceptionFactory() {
    }

    /* renamed from: com.google.api.gax.rpc.ApiExceptionFactory$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$gax$rpc$StatusCode$Code;

        static {
            int[] iArr = new int[StatusCode.Code.values().length];
            $SwitchMap$com$google$api$gax$rpc$StatusCode$Code = iArr;
            try {
                iArr[StatusCode.Code.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.DEADLINE_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.ALREADY_EXISTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.PERMISSION_DENIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.RESOURCE_EXHAUSTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.FAILED_PRECONDITION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.ABORTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.OUT_OF_RANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.UNIMPLEMENTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.INTERNAL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.UNAVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.DATA_LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$api$gax$rpc$StatusCode$Code[StatusCode.Code.UNAUTHENTICATED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static ApiException createException(Throwable th, StatusCode statusCode, boolean z) {
        switch (AnonymousClass1.$SwitchMap$com$google$api$gax$rpc$StatusCode$Code[statusCode.getCode().ordinal()]) {
            case 1:
                return new CancelledException(th, statusCode, z);
            case 2:
                return new NotFoundException(th, statusCode, z);
            case 3:
                return new UnknownException(th, statusCode, z);
            case 4:
                return new InvalidArgumentException(th, statusCode, z);
            case 5:
                return new DeadlineExceededException(th, statusCode, z);
            case 6:
                return new AlreadyExistsException(th, statusCode, z);
            case 7:
                return new PermissionDeniedException(th, statusCode, z);
            case 8:
                return new ResourceExhaustedException(th, statusCode, z);
            case 9:
                return new FailedPreconditionException(th, statusCode, z);
            case 10:
                return new AbortedException(th, statusCode, z);
            case 11:
                return new OutOfRangeException(th, statusCode, z);
            case 12:
                return new UnimplementedException(th, statusCode, z);
            case 13:
                return new InternalException(th, statusCode, z);
            case 14:
                return new UnavailableException(th, statusCode, z);
            case 15:
                return new DataLossException(th, statusCode, z);
            case 16:
                return new UnauthenticatedException(th, statusCode, z);
            default:
                return new UnknownException(th, statusCode, z);
        }
    }

    public static ApiException createException(String str, Throwable th, StatusCode statusCode, boolean z) {
        switch (AnonymousClass1.$SwitchMap$com$google$api$gax$rpc$StatusCode$Code[statusCode.getCode().ordinal()]) {
            case 1:
                return new CancelledException(str, th, statusCode, z);
            case 2:
                return new NotFoundException(str, th, statusCode, z);
            case 3:
                return new UnknownException(str, th, statusCode, z);
            case 4:
                return new InvalidArgumentException(str, th, statusCode, z);
            case 5:
                return new DeadlineExceededException(str, th, statusCode, z);
            case 6:
                return new AlreadyExistsException(str, th, statusCode, z);
            case 7:
                return new PermissionDeniedException(str, th, statusCode, z);
            case 8:
                return new ResourceExhaustedException(str, th, statusCode, z);
            case 9:
                return new FailedPreconditionException(str, th, statusCode, z);
            case 10:
                return new AbortedException(str, th, statusCode, z);
            case 11:
                return new OutOfRangeException(str, th, statusCode, z);
            case 12:
                return new UnimplementedException(str, th, statusCode, z);
            case 13:
                return new InternalException(str, th, statusCode, z);
            case 14:
                return new UnavailableException(str, th, statusCode, z);
            case 15:
                return new DataLossException(str, th, statusCode, z);
            case 16:
                return new UnauthenticatedException(str, th, statusCode, z);
            default:
                return new UnknownException(th, statusCode, z);
        }
    }
}
