package org.apache.commons.lang3.concurrent.locks;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableFunction;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* loaded from: classes5.dex */
public class LockingVisitors {

    /* loaded from: classes5.dex */
    public static class LockVisitor<O, L> {
        private final L lock;
        private final O object;
        private final Supplier<Lock> readLockSupplier;
        private final Supplier<Lock> writeLockSupplier;

        protected LockVisitor(O o, L l, Supplier<Lock> supplier, Supplier<Lock> supplier2) {
            this.object = (O) Objects.requireNonNull(o, "object");
            this.lock = (L) Objects.requireNonNull(l, "lock");
            this.readLockSupplier = Platform$$ExternalSyntheticApiModelOutline0.m9078m(Objects.requireNonNull(supplier, "readLockSupplier"));
            this.writeLockSupplier = Platform$$ExternalSyntheticApiModelOutline0.m9078m(Objects.requireNonNull(supplier2, "writeLockSupplier"));
        }

        public void acceptReadLocked(FailableConsumer<O, ?> failableConsumer) {
            lockAcceptUnlock(this.readLockSupplier, failableConsumer);
        }

        public void acceptWriteLocked(FailableConsumer<O, ?> failableConsumer) {
            lockAcceptUnlock(this.writeLockSupplier, failableConsumer);
        }

        public <T> T applyReadLocked(FailableFunction<O, T, ?> failableFunction) {
            return (T) lockApplyUnlock(this.readLockSupplier, failableFunction);
        }

        public <T> T applyWriteLocked(FailableFunction<O, T, ?> failableFunction) {
            return (T) lockApplyUnlock(this.writeLockSupplier, failableFunction);
        }

        public L getLock() {
            return this.lock;
        }

        public O getObject() {
            return this.object;
        }

        protected void lockAcceptUnlock(Supplier<Lock> supplier, FailableConsumer<O, ?> failableConsumer) {
            Object obj;
            obj = supplier.get();
            ((Lock) obj).lock();
            try {
                failableConsumer.accept(this.object);
            } finally {
            }
        }

        protected <T> T lockApplyUnlock(Supplier<Lock> supplier, FailableFunction<O, T, ?> failableFunction) {
            Object obj;
            obj = supplier.get();
            ((Lock) obj).lock();
            try {
                return failableFunction.apply(this.object);
            } finally {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ReadWriteLockVisitor<O> extends LockVisitor<O, ReadWriteLock> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected ReadWriteLockVisitor(O o, final ReadWriteLock readWriteLock) {
            super(o, readWriteLock, r0, new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return readWriteLock.writeLock();
                }
            });
            readWriteLock.getClass();
            Supplier supplier = new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return readWriteLock.readLock();
                }
            };
            readWriteLock.getClass();
        }
    }

    /* loaded from: classes5.dex */
    public static class StampedLockVisitor<O> extends LockVisitor<O, StampedLock> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected StampedLockVisitor(O o, final StampedLock stampedLock) {
            super(o, stampedLock, r0, new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda3
                @Override // java.util.function.Supplier
                public final Object get() {
                    Lock asWriteLock;
                    asWriteLock = stampedLock.asWriteLock();
                    return asWriteLock;
                }
            });
            stampedLock.getClass();
            Supplier supplier = new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda2
                @Override // java.util.function.Supplier
                public final Object get() {
                    Lock asReadLock;
                    asReadLock = stampedLock.asReadLock();
                    return asReadLock;
                }
            };
            stampedLock.getClass();
        }
    }

    public static <O> ReadWriteLockVisitor<O> reentrantReadWriteLockVisitor(O o) {
        return new ReadWriteLockVisitor<>(o, new ReentrantReadWriteLock());
    }

    public static <O> StampedLockVisitor<O> stampedLockVisitor(O o) {
        return new StampedLockVisitor<>(o, Platform$$ExternalSyntheticApiModelOutline0.m9077m());
    }
}
