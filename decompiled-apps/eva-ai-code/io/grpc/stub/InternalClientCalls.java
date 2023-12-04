package io.grpc.stub;

import io.grpc.CallOptions;
import io.grpc.stub.ClientCalls;
/* loaded from: classes4.dex */
public final class InternalClientCalls {
    public static CallOptions.Key<ClientCalls.StubType> getStubTypeOption() {
        return ClientCalls.STUB_TYPE_OPTION;
    }

    public static StubType getStubType(CallOptions callOptions) {
        return StubType.of((ClientCalls.StubType) callOptions.getOption(ClientCalls.STUB_TYPE_OPTION));
    }

    public static CallOptions setStubType(CallOptions callOptions, StubType stubType) {
        return callOptions.withOption(ClientCalls.STUB_TYPE_OPTION, stubType.internalType);
    }

    /* loaded from: classes4.dex */
    public enum StubType {
        BLOCKING(ClientCalls.StubType.BLOCKING),
        ASYNC(ClientCalls.StubType.ASYNC),
        FUTURE(ClientCalls.StubType.FUTURE);
        
        private final ClientCalls.StubType internalType;

        StubType(ClientCalls.StubType stubType) {
            this.internalType = stubType;
        }

        public static StubType of(ClientCalls.StubType stubType) {
            StubType[] values;
            for (StubType stubType2 : values()) {
                if (stubType2.internalType == stubType) {
                    return stubType2;
                }
            }
            throw new AssertionError("Unknown StubType: " + stubType.name());
        }
    }
}
