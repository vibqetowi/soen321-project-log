package io.grpc;
/* loaded from: classes4.dex */
public abstract class Channel {
    public abstract String authority();

    public abstract <RequestT, ResponseT> ClientCall<RequestT, ResponseT> newCall(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions);
}
