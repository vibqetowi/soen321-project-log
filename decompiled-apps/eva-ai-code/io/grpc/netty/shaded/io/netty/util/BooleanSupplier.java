package io.grpc.netty.shaded.io.netty.util;
/* loaded from: classes4.dex */
public interface BooleanSupplier {
    public static final BooleanSupplier FALSE_SUPPLIER = new BooleanSupplier() { // from class: io.grpc.netty.shaded.io.netty.util.BooleanSupplier.1
        @Override // io.grpc.netty.shaded.io.netty.util.BooleanSupplier
        public boolean get() {
            return false;
        }
    };
    public static final BooleanSupplier TRUE_SUPPLIER = new BooleanSupplier() { // from class: io.grpc.netty.shaded.io.netty.util.BooleanSupplier.2
        @Override // io.grpc.netty.shaded.io.netty.util.BooleanSupplier
        public boolean get() {
            return true;
        }
    };

    boolean get() throws Exception;
}
