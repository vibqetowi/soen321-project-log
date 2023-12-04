package com.google.protobuf;
/* loaded from: classes6.dex */
public final class RpcUtil {
    /* JADX WARN: Multi-variable type inference failed */
    public static <Type extends Message> RpcCallback<Type> specializeCallback(RpcCallback<Message> rpcCallback) {
        return rpcCallback;
    }

    private RpcUtil() {
    }

    public static <Type extends Message> RpcCallback<Message> generalizeCallback(final RpcCallback<Type> rpcCallback, final Class<Type> cls, final Type type) {
        return new RpcCallback<Message>() { // from class: com.google.protobuf.RpcUtil.1
            @Override // com.google.protobuf.RpcCallback
            public void run(Message message) {
                Message copyAsType;
                try {
                    copyAsType = (Message) cls.cast(message);
                } catch (ClassCastException unused) {
                    copyAsType = RpcUtil.copyAsType(type, message);
                }
                rpcCallback.run(copyAsType);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Type extends Message> Type copyAsType(Type type, Message message) {
        return (Type) type.newBuilderForType().mergeFrom(message).build();
    }

    public static <ParameterType> RpcCallback<ParameterType> newOneTimeCallback(final RpcCallback<ParameterType> rpcCallback) {
        return new RpcCallback<ParameterType>() { // from class: com.google.protobuf.RpcUtil.2
            private boolean alreadyCalled = false;

            @Override // com.google.protobuf.RpcCallback
            public void run(ParameterType parametertype) {
                synchronized (this) {
                    if (this.alreadyCalled) {
                        throw new AlreadyCalledException();
                    }
                    this.alreadyCalled = true;
                }
                RpcCallback.this.run(parametertype);
            }
        };
    }

    /* loaded from: classes6.dex */
    public static final class AlreadyCalledException extends RuntimeException {
        private static final long serialVersionUID = 5469741279507848266L;

        public AlreadyCalledException() {
            super("This RpcCallback was already called and cannot be called multiple times.");
        }
    }
}
