package com.google.api.gax.grpc;

import com.google.api.core.InternalExtensionOnly;
import com.google.api.gax.rpc.StatusCode;
import io.grpc.Status;
@InternalExtensionOnly
/* loaded from: classes7.dex */
public abstract class GrpcStatusCode implements StatusCode {
    @Override // com.google.api.gax.rpc.StatusCode
    public abstract Status.Code getTransportCode();

    public static GrpcStatusCode of(Status.Code code) {
        return new AutoValue_GrpcStatusCode(code);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.api.gax.grpc.GrpcStatusCode$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$grpc$Status$Code;

        static {
            int[] iArr = new int[Status.Code.values().length];
            $SwitchMap$io$grpc$Status$Code = iArr;
            try {
                iArr[Status.Code.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.DEADLINE_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.NOT_FOUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.ALREADY_EXISTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.PERMISSION_DENIED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.RESOURCE_EXHAUSTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.FAILED_PRECONDITION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.ABORTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.OUT_OF_RANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.UNIMPLEMENTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.INTERNAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.UNAVAILABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.DATA_LOSS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$grpc$Status$Code[Status.Code.UNAUTHENTICATED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StatusCode.Code grpcCodeToStatusCode(Status.Code code) {
        switch (AnonymousClass1.$SwitchMap$io$grpc$Status$Code[code.ordinal()]) {
            case 1:
                return StatusCode.Code.OK;
            case 2:
                return StatusCode.Code.CANCELLED;
            case 3:
                return StatusCode.Code.UNKNOWN;
            case 4:
                return StatusCode.Code.INVALID_ARGUMENT;
            case 5:
                return StatusCode.Code.DEADLINE_EXCEEDED;
            case 6:
                return StatusCode.Code.NOT_FOUND;
            case 7:
                return StatusCode.Code.ALREADY_EXISTS;
            case 8:
                return StatusCode.Code.PERMISSION_DENIED;
            case 9:
                return StatusCode.Code.RESOURCE_EXHAUSTED;
            case 10:
                return StatusCode.Code.FAILED_PRECONDITION;
            case 11:
                return StatusCode.Code.ABORTED;
            case 12:
                return StatusCode.Code.OUT_OF_RANGE;
            case 13:
                return StatusCode.Code.UNIMPLEMENTED;
            case 14:
                return StatusCode.Code.INTERNAL;
            case 15:
                return StatusCode.Code.UNAVAILABLE;
            case 16:
                return StatusCode.Code.DATA_LOSS;
            case 17:
                return StatusCode.Code.UNAUTHENTICATED;
            default:
                throw new IllegalStateException("Unrecognized status code: " + code);
        }
    }

    @Override // com.google.api.gax.rpc.StatusCode
    public StatusCode.Code getCode() {
        return grpcCodeToStatusCode(getTransportCode());
    }
}
