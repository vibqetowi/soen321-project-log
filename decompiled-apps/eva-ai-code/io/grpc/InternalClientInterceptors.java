package io.grpc;

import io.grpc.MethodDescriptor;
/* loaded from: classes4.dex */
public final class InternalClientInterceptors {
    public static <ReqT, RespT> ClientInterceptor wrapClientInterceptor(ClientInterceptor clientInterceptor, MethodDescriptor.Marshaller<ReqT> marshaller, MethodDescriptor.Marshaller<RespT> marshaller2) {
        return ClientInterceptors.wrapClientInterceptor(clientInterceptor, marshaller, marshaller2);
    }
}
