package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.ResourceLeakTracker;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.nio.ByteOrder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class SimpleLeakAwareByteBuf extends WrappedByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final ResourceLeakTracker<ByteBuf> leak;
    private final ByteBuf trackedByteBuf;

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public ByteBuf touch() {
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public ByteBuf touch(Object obj) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleLeakAwareByteBuf(ByteBuf byteBuf, ByteBuf byteBuf2, ResourceLeakTracker<ByteBuf> resourceLeakTracker) {
        super(byteBuf);
        this.trackedByteBuf = (ByteBuf) ObjectUtil.checkNotNull(byteBuf2, "trackedByteBuf");
        this.leak = (ResourceLeakTracker) ObjectUtil.checkNotNull(resourceLeakTracker, "leak");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleLeakAwareByteBuf(ByteBuf byteBuf, ResourceLeakTracker<ByteBuf> resourceLeakTracker) {
        this(byteBuf, byteBuf, resourceLeakTracker);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf slice() {
        return newSharedLeakAwareByteBuf(super.slice());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedSlice() {
        return unwrappedDerived(super.retainedSlice());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedSlice(int i, int i2) {
        return unwrappedDerived(super.retainedSlice(i, i2));
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedDuplicate() {
        return unwrappedDerived(super.retainedDuplicate());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readRetainedSlice(int i) {
        return unwrappedDerived(super.readRetainedSlice(i));
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf slice(int i, int i2) {
        return newSharedLeakAwareByteBuf(super.slice(i, i2));
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf duplicate() {
        return newSharedLeakAwareByteBuf(super.duplicate());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readSlice(int i) {
        return newSharedLeakAwareByteBuf(super.readSlice(i));
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf asReadOnly() {
        return newSharedLeakAwareByteBuf(super.asReadOnly());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public boolean release() {
        if (super.release()) {
            closeLeak();
            return true;
        }
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public boolean release(int i) {
        if (super.release(i)) {
            closeLeak();
            return true;
        }
        return false;
    }

    private void closeLeak() {
        this.leak.close(this.trackedByteBuf);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.WrappedByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf order(ByteOrder byteOrder) {
        return order() == byteOrder ? this : newSharedLeakAwareByteBuf(super.order(byteOrder));
    }

    private ByteBuf unwrappedDerived(ByteBuf byteBuf) {
        ByteBuf unwrapSwapped = unwrapSwapped(byteBuf);
        if (unwrapSwapped instanceof AbstractPooledDerivedByteBuf) {
            ((AbstractPooledDerivedByteBuf) unwrapSwapped).parent(this);
            ResourceLeakTracker<ByteBuf> track = AbstractByteBuf.leakDetector.track(byteBuf);
            return track == null ? byteBuf : newLeakAwareByteBuf(byteBuf, track);
        }
        return newSharedLeakAwareByteBuf(byteBuf);
    }

    private static ByteBuf unwrapSwapped(ByteBuf byteBuf) {
        if (byteBuf instanceof SwappedByteBuf) {
            do {
                byteBuf = byteBuf.unwrap();
            } while (byteBuf instanceof SwappedByteBuf);
            return byteBuf;
        }
        return byteBuf;
    }

    private SimpleLeakAwareByteBuf newSharedLeakAwareByteBuf(ByteBuf byteBuf) {
        return newLeakAwareByteBuf(byteBuf, this.trackedByteBuf, this.leak);
    }

    private SimpleLeakAwareByteBuf newLeakAwareByteBuf(ByteBuf byteBuf, ResourceLeakTracker<ByteBuf> resourceLeakTracker) {
        return newLeakAwareByteBuf(byteBuf, byteBuf, resourceLeakTracker);
    }

    protected SimpleLeakAwareByteBuf newLeakAwareByteBuf(ByteBuf byteBuf, ByteBuf byteBuf2, ResourceLeakTracker<ByteBuf> resourceLeakTracker) {
        return new SimpleLeakAwareByteBuf(byteBuf, byteBuf2, resourceLeakTracker);
    }
}
