package com.google.api.gax.grpc;

import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.StatusCode;
import com.google.longrunning.Operation;
import io.grpc.Status;
/* loaded from: classes7.dex */
class GrpcOperationSnapshot implements OperationSnapshot {
    private final Operation operation;

    public GrpcOperationSnapshot(Operation operation) {
        this.operation = operation;
    }

    @Override // com.google.api.gax.longrunning.OperationSnapshot
    public String getName() {
        return this.operation.getName();
    }

    @Override // com.google.api.gax.longrunning.OperationSnapshot
    public Object getMetadata() {
        return this.operation.getMetadata();
    }

    @Override // com.google.api.gax.longrunning.OperationSnapshot
    public boolean isDone() {
        return this.operation.getDone();
    }

    @Override // com.google.api.gax.longrunning.OperationSnapshot
    public Object getResponse() {
        return this.operation.getResponse();
    }

    @Override // com.google.api.gax.longrunning.OperationSnapshot
    public StatusCode getErrorCode() {
        return GrpcStatusCode.of(Status.fromCodeValue(this.operation.getError().getCode()).getCode());
    }

    @Override // com.google.api.gax.longrunning.OperationSnapshot
    public String getErrorMessage() {
        return this.operation.getError().getMessage();
    }

    public static GrpcOperationSnapshot create(Operation operation) {
        return new GrpcOperationSnapshot(operation);
    }
}
