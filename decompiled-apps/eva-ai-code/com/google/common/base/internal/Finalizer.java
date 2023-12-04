package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes7.dex */
public class Finalizer implements Runnable {
    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    @NullableDecl
    private static final Constructor<Thread> bigThreadConstructor;
    @NullableDecl
    private static final Field inheritableThreadLocals;
    private static final Logger logger = Logger.getLogger(Finalizer.class.getName());
    private final WeakReference<Class<?>> finalizableReferenceClassReference;
    private final PhantomReference<Object> frqReference;
    private final ReferenceQueue<Object> queue;

    static {
        Constructor<Thread> bigThreadConstructor2 = getBigThreadConstructor();
        bigThreadConstructor = bigThreadConstructor2;
        inheritableThreadLocals = bigThreadConstructor2 == null ? getInheritableThreadLocalsField() : null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        com.google.common.base.internal.Finalizer.logger.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:15:0x005a, B:17:0x005e), top: B:25:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startFinalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        Thread thread;
        Field field;
        if (!cls.getName().equals(FINALIZABLE_REFERENCE)) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        Finalizer finalizer = new Finalizer(cls, referenceQueue, phantomReference);
        String name = Finalizer.class.getName();
        Constructor<Thread> constructor = bigThreadConstructor;
        if (constructor != null) {
            try {
                ThreadGroup threadGroup = null;
                thread = constructor.newInstance(null, finalizer, name, 0L, false);
            } catch (Throwable th) {
                logger.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
            }
            if (thread == null) {
                thread = new Thread(null, finalizer, name);
            }
            thread.setDaemon(true);
            field = inheritableThreadLocals;
            if (field != null) {
                field.set(thread, null);
            }
            thread.start();
        }
        thread = null;
        if (thread == null) {
        }
        thread.setDaemon(true);
        field = inheritableThreadLocals;
        if (field != null) {
        }
        thread.start();
    }

    private Finalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.queue = referenceQueue;
        this.finalizableReferenceClassReference = new WeakReference<>(cls);
        this.frqReference = phantomReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }

    private boolean cleanUp(Reference<?> reference) {
        Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.frqReference) {
                return false;
            }
            try {
                finalizeReferentMethod.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                logger.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.queue.poll();
        } while (reference != null);
        return true;
    }

    @NullableDecl
    private Method getFinalizeReferentMethod() {
        Class<?> cls = this.finalizableReferenceClassReference.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @NullableDecl
    private static Field getInheritableThreadLocalsField() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    @NullableDecl
    private static Constructor<Thread> getBigThreadConstructor() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }
}
