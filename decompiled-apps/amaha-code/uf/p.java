package uf;
/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class p extends androidx.work.k {
    @Override // androidx.work.k
    public final <T> T x(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
