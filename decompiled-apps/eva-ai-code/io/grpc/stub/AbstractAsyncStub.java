package io.grpc.stub;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.stub.AbstractAsyncStub;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ClientCalls;
import javax.annotation.CheckReturnValue;
@CheckReturnValue
/* loaded from: classes4.dex */
public abstract class AbstractAsyncStub<S extends AbstractAsyncStub<S>> extends AbstractStub<S> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractAsyncStub(Channel channel, CallOptions callOptions) {
        super(channel, callOptions);
    }

    public static <T extends AbstractStub<T>> T newStub(AbstractStub.StubFactory<T> stubFactory, Channel channel) {
        return (T) newStub(stubFactory, channel, CallOptions.DEFAULT);
    }

    public static <T extends AbstractStub<T>> T newStub(AbstractStub.StubFactory<T> stubFactory, Channel channel, CallOptions callOptions) {
        return stubFactory.newStub(channel, callOptions.withOption(ClientCalls.STUB_TYPE_OPTION, ClientCalls.StubType.ASYNC));
    }
}
