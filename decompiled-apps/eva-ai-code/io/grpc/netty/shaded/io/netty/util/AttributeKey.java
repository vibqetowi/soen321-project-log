package io.grpc.netty.shaded.io.netty.util;
/* loaded from: classes4.dex */
public final class AttributeKey<T> extends AbstractConstant<AttributeKey<T>> {
    private static final ConstantPool<AttributeKey<Object>> pool = new ConstantPool<AttributeKey<Object>>() { // from class: io.grpc.netty.shaded.io.netty.util.AttributeKey.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.grpc.netty.shaded.io.netty.util.ConstantPool
        public AttributeKey<Object> newConstant(int i, String str) {
            return new AttributeKey<>(i, str);
        }
    };

    public static <T> AttributeKey<T> valueOf(String str) {
        return (AttributeKey<T>) pool.valueOf(str);
    }

    public static boolean exists(String str) {
        return pool.exists(str);
    }

    public static <T> AttributeKey<T> newInstance(String str) {
        return (AttributeKey<T>) pool.newInstance(str);
    }

    public static <T> AttributeKey<T> valueOf(Class<?> cls, String str) {
        return (AttributeKey<T>) pool.valueOf(cls, str);
    }

    private AttributeKey(int i, String str) {
        super(i, str);
    }
}
