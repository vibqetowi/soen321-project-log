package io.grpc.netty.shaded.io.netty.util.internal;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PlatformDependent0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long ADDRESS_FIELD_OFFSET;
    private static final Method ALLOCATE_ARRAY_METHOD;
    private static final long BYTE_ARRAY_BASE_OFFSET;
    private static final Constructor<?> DIRECT_BUFFER_CONSTRUCTOR;
    private static final Throwable EXPLICIT_NO_UNSAFE_CAUSE;
    static final int HASH_CODE_ASCII_SEED = -1028477387;
    static final int HASH_CODE_C1 = -862048943;
    static final int HASH_CODE_C2 = 461845907;
    private static final Object INTERNAL_UNSAFE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    private static final boolean IS_ANDROID;
    private static final boolean IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE;
    private static final int JAVA_VERSION;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final boolean RUNNING_IN_NATIVE_IMAGE;
    private static final boolean UNALIGNED;
    static final Unsafe UNSAFE;
    private static final long UNSAFE_COPY_THRESHOLD = 1048576;
    private static final Throwable UNSAFE_UNAVAILABILITY_CAUSE;
    private static final InternalLogger logger;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int hashCodeAsciiSanitize(byte b) {
        return b & Ascii.US;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int hashCodeAsciiSanitize(int i) {
        return i & 522133279;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int hashCodeAsciiSanitize(short s) {
        return s & 7967;
    }

    static {
        final ByteBuffer allocateDirect;
        final Unsafe unsafe;
        Field field;
        long j;
        Constructor<?> constructor;
        boolean z;
        Method method;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(PlatformDependent0.class);
        logger = internalLoggerFactory;
        Throwable explicitNoUnsafeCause0 = explicitNoUnsafeCause0();
        EXPLICIT_NO_UNSAFE_CAUSE = explicitNoUnsafeCause0;
        JAVA_VERSION = javaVersion0();
        IS_ANDROID = isAndroid0();
        IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE = explicitTryReflectionSetAccessible0();
        RUNNING_IN_NATIVE_IMAGE = SystemPropertyUtil.contains("org.graalvm.nativeimage.imagecode");
        Method method2 = null;
        if (explicitNoUnsafeCause0 != null) {
            allocateDirect = null;
            unsafe = null;
            field = null;
        } else {
            allocateDirect = ByteBuffer.allocateDirect(1);
            Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                        Throwable trySetAccessible = ReflectionUtil.trySetAccessible(declaredField, false);
                        return trySetAccessible != null ? trySetAccessible : declaredField.get(null);
                    } catch (IllegalAccessException e) {
                        return e;
                    } catch (NoClassDefFoundError e2) {
                        return e2;
                    } catch (NoSuchFieldException e3) {
                        return e3;
                    } catch (SecurityException e4) {
                        return e4;
                    }
                }
            });
            if (doPrivileged instanceof Throwable) {
                explicitNoUnsafeCause0 = (Throwable) doPrivileged;
                internalLoggerFactory.debug("sun.misc.Unsafe.theUnsafe: unavailable", explicitNoUnsafeCause0);
                unsafe = null;
            } else {
                unsafe = (Unsafe) doPrivileged;
                internalLoggerFactory.debug("sun.misc.Unsafe.theUnsafe: available");
            }
            if (unsafe != null) {
                Object doPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            unsafe.getClass().getDeclaredMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                            return null;
                        } catch (NoSuchMethodException e) {
                            return e;
                        } catch (SecurityException e2) {
                            return e2;
                        }
                    }
                });
                if (doPrivileged2 == null) {
                    internalLoggerFactory.debug("sun.misc.Unsafe.copyMemory: available");
                } else {
                    explicitNoUnsafeCause0 = (Throwable) doPrivileged2;
                    internalLoggerFactory.debug("sun.misc.Unsafe.copyMemory: unavailable", explicitNoUnsafeCause0);
                    unsafe = null;
                }
            }
            if (unsafe != null) {
                Object doPrivileged3 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.3
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Field declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                            if (unsafe.getLong(allocateDirect, unsafe.objectFieldOffset(declaredField)) == 0) {
                                return null;
                            }
                            return declaredField;
                        } catch (NoSuchFieldException e) {
                            return e;
                        } catch (SecurityException e2) {
                            return e2;
                        }
                    }
                });
                if (doPrivileged3 instanceof Field) {
                    field = (Field) doPrivileged3;
                    internalLoggerFactory.debug("java.nio.Buffer.address: available");
                } else {
                    Throwable th = (Throwable) doPrivileged3;
                    internalLoggerFactory.debug("java.nio.Buffer.address: unavailable", th);
                    unsafe = null;
                    explicitNoUnsafeCause0 = th;
                    field = null;
                }
            } else {
                field = null;
            }
            if (unsafe != null) {
                long arrayIndexScale = unsafe.arrayIndexScale(byte[].class);
                if (arrayIndexScale != 1) {
                    internalLoggerFactory.debug("unsafe.arrayIndexScale is {} (expected: 1). Not using unsafe.", Long.valueOf(arrayIndexScale));
                    explicitNoUnsafeCause0 = new UnsupportedOperationException("Unexpected unsafe.arrayIndexScale");
                    unsafe = null;
                }
            }
        }
        UNSAFE_UNAVAILABILITY_CAUSE = explicitNoUnsafeCause0;
        UNSAFE = unsafe;
        if (unsafe == null) {
            ADDRESS_FIELD_OFFSET = -1L;
            BYTE_ARRAY_BASE_OFFSET = -1L;
            LONG_ARRAY_BASE_OFFSET = -1L;
            LONG_ARRAY_INDEX_SCALE = -1L;
            INT_ARRAY_BASE_OFFSET = -1L;
            INT_ARRAY_INDEX_SCALE = -1L;
            UNALIGNED = false;
            DIRECT_BUFFER_CONSTRUCTOR = null;
            ALLOCATE_ARRAY_METHOD = null;
        } else {
            try {
                Object doPrivileged4 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.4
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Constructor<?> declaredConstructor = allocateDirect.getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                            Throwable trySetAccessible = ReflectionUtil.trySetAccessible(declaredConstructor, true);
                            return trySetAccessible != null ? trySetAccessible : declaredConstructor;
                        } catch (NoSuchMethodException e) {
                            return e;
                        } catch (SecurityException e2) {
                            return e2;
                        }
                    }
                });
                if (doPrivileged4 instanceof Constructor) {
                    j = unsafe.allocateMemory(1L);
                    try {
                        ((Constructor) doPrivileged4).newInstance(Long.valueOf(j), 1);
                        constructor = (Constructor) doPrivileged4;
                        internalLoggerFactory.debug("direct buffer constructor: available");
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        constructor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (j != -1) {
                            UNSAFE.freeMemory(j);
                        }
                        throw th;
                    }
                } else {
                    internalLoggerFactory.debug("direct buffer constructor: unavailable", (Throwable) doPrivileged4);
                    constructor = null;
                    j = -1;
                }
                if (j != -1) {
                    UNSAFE.freeMemory(j);
                }
                DIRECT_BUFFER_CONSTRUCTOR = constructor;
                ADDRESS_FIELD_OFFSET = objectFieldOffset(field);
                Unsafe unsafe2 = UNSAFE;
                BYTE_ARRAY_BASE_OFFSET = unsafe2.arrayBaseOffset(byte[].class);
                INT_ARRAY_BASE_OFFSET = unsafe2.arrayBaseOffset(int[].class);
                INT_ARRAY_INDEX_SCALE = unsafe2.arrayIndexScale(int[].class);
                LONG_ARRAY_BASE_OFFSET = unsafe2.arrayBaseOffset(long[].class);
                LONG_ARRAY_INDEX_SCALE = unsafe2.arrayIndexScale(long[].class);
                Object doPrivileged5 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.5
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Class<?> cls = Class.forName("java.nio.Bits", false, PlatformDependent0.getSystemClassLoader());
                            int javaVersion = PlatformDependent0.javaVersion();
                            if (PlatformDependent0.unsafeStaticFieldOffsetSupported() && javaVersion >= 9) {
                                try {
                                    Field declaredField = cls.getDeclaredField(javaVersion >= 11 ? "UNALIGNED" : "unaligned");
                                    if (declaredField.getType() == Boolean.TYPE) {
                                        return Boolean.valueOf(PlatformDependent0.UNSAFE.getBoolean(PlatformDependent0.UNSAFE.staticFieldBase(declaredField), PlatformDependent0.UNSAFE.staticFieldOffset(declaredField)));
                                    }
                                } catch (NoSuchFieldException unused2) {
                                }
                            }
                            Method declaredMethod = cls.getDeclaredMethod("unaligned", new Class[0]);
                            Throwable trySetAccessible = ReflectionUtil.trySetAccessible(declaredMethod, true);
                            return trySetAccessible != null ? trySetAccessible : declaredMethod.invoke(null, new Object[0]);
                        } catch (ClassNotFoundException e) {
                            return e;
                        } catch (IllegalAccessException e2) {
                            return e2;
                        } catch (NoSuchMethodException e3) {
                            return e3;
                        } catch (SecurityException e4) {
                            return e4;
                        } catch (InvocationTargetException e5) {
                            return e5;
                        }
                    }
                });
                if (doPrivileged5 instanceof Boolean) {
                    z = ((Boolean) doPrivileged5).booleanValue();
                    logger.debug("java.nio.Bits.unaligned: available, {}", Boolean.valueOf(z));
                } else {
                    boolean matches = SystemPropertyUtil.get("os.arch", "").matches("^(i[3-6]86|x86(_64)?|x64|amd64)$");
                    logger.debug("java.nio.Bits.unaligned: unavailable {}", Boolean.valueOf(matches), (Throwable) doPrivileged5);
                    z = matches;
                }
                UNALIGNED = z;
                if (javaVersion() >= 9) {
                    final Object doPrivileged6 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.6
                        @Override // java.security.PrivilegedAction
                        public Object run() {
                            try {
                                return PlatformDependent0.getClassLoader(PlatformDependent0.class).loadClass("jdk.internal.misc.Unsafe").getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
                            } catch (Throwable th3) {
                                return th3;
                            }
                        }
                    });
                    if (doPrivileged6 instanceof Throwable) {
                        method = null;
                    } else {
                        Object doPrivileged7 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.7
                            @Override // java.security.PrivilegedAction
                            public Object run() {
                                try {
                                    return doPrivileged6.getClass().getDeclaredMethod("allocateUninitializedArray", Class.class, Integer.TYPE);
                                } catch (NoSuchMethodException e) {
                                    return e;
                                } catch (SecurityException e2) {
                                    return e2;
                                }
                            }
                        });
                        if (doPrivileged7 instanceof Method) {
                            try {
                                Method method3 = (Method) doPrivileged7;
                                byte[] bArr = (byte[]) method3.invoke(doPrivileged6, Byte.TYPE, 8);
                                method = doPrivileged6;
                                doPrivileged6 = doPrivileged7;
                                method2 = method3;
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                method = doPrivileged6;
                                doPrivileged6 = e;
                            }
                        } else {
                            method = doPrivileged6;
                            doPrivileged6 = doPrivileged7;
                        }
                    }
                    if (doPrivileged6 instanceof Throwable) {
                        logger.debug("jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable", (Throwable) doPrivileged6);
                    } else {
                        logger.debug("jdk.internal.misc.Unsafe.allocateUninitializedArray(int): available");
                    }
                } else {
                    logger.debug("jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable prior to Java9");
                    method = null;
                }
                ALLOCATE_ARRAY_METHOD = method2;
                method2 = method;
            } catch (Throwable th3) {
                th = th3;
                j = -1;
            }
        }
        INTERNAL_UNSAFE = method2;
        logger.debug("java.nio.DirectByteBuffer.<init>(long, int): {}", DIRECT_BUFFER_CONSTRUCTOR != null ? "available" : "unavailable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean unsafeStaticFieldOffsetSupported() {
        return !RUNNING_IN_NATIVE_IMAGE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isExplicitNoUnsafe() {
        return EXPLICIT_NO_UNSAFE_CAUSE != null;
    }

    private static Throwable explicitNoUnsafeCause0() {
        boolean z = SystemPropertyUtil.getBoolean("io.grpc.netty.shaded.io.netty.noUnsafe", false);
        InternalLogger internalLogger = logger;
        internalLogger.debug("-Dio.netty.noUnsafe: {}", Boolean.valueOf(z));
        if (z) {
            internalLogger.debug("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
        }
        String str = SystemPropertyUtil.contains("io.grpc.netty.shaded.io.netty.tryUnsafe") ? "io.grpc.netty.shaded.io.netty.tryUnsafe" : "org.jboss.netty.tryUnsafe";
        if (SystemPropertyUtil.getBoolean(str, true)) {
            return null;
        }
        String str2 = "sun.misc.Unsafe: unavailable (" + str + ")";
        internalLogger.debug(str2);
        return new UnsupportedOperationException(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isUnaligned() {
        return UNALIGNED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafe() {
        return UNSAFE != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Throwable getUnsafeUnavailabilityCause() {
        return UNSAFE_UNAVAILABILITY_CAUSE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean unalignedAccess() {
        return UNALIGNED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void throwException(Throwable th) {
        UNSAFE.throwException((Throwable) ObjectUtil.checkNotNull(th, "cause"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasDirectBufferNoCleanerConstructor() {
        return DIRECT_BUFFER_CONSTRUCTOR != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer reallocateDirectNoCleaner(ByteBuffer byteBuffer, int i) {
        return newDirectBuffer(UNSAFE.reallocateMemory(directBufferAddress(byteBuffer), i), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer allocateDirectNoCleaner(int i) {
        return newDirectBuffer(UNSAFE.allocateMemory(Math.max(1, i)), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasAllocateArrayMethod() {
        return ALLOCATE_ARRAY_METHOD != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] allocateUninitializedArray(int i) {
        try {
            return (byte[]) ALLOCATE_ARRAY_METHOD.invoke(INTERNAL_UNSAFE, Byte.TYPE, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (InvocationTargetException e2) {
            throw new Error(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer newDirectBuffer(long j, int i) {
        ObjectUtil.checkPositiveOrZero(i, "capacity");
        try {
            return (ByteBuffer) DIRECT_BUFFER_CONSTRUCTOR.newInstance(Long.valueOf(j), Integer.valueOf(i));
        } catch (Throwable th) {
            if (th instanceof Error) {
                throw th;
            }
            throw new Error(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long directBufferAddress(ByteBuffer byteBuffer) {
        return getLong(byteBuffer, ADDRESS_FIELD_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long byteArrayBaseOffset() {
        return BYTE_ARRAY_BASE_OFFSET;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getObject(Object obj, long j) {
        return UNSAFE.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(Object obj, long j) {
        return UNSAFE.getInt(obj, j);
    }

    private static long getLong(Object obj, long j) {
        return UNSAFE.getLong(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long objectFieldOffset(Field field) {
        return UNSAFE.objectFieldOffset(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(long j) {
        return UNSAFE.getByte(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short getShort(long j) {
        return UNSAFE.getShort(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(long j) {
        return UNSAFE.getInt(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(long j) {
        return UNSAFE.getLong(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(byte[] bArr, int i) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(byte[] bArr, long j) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short getShort(byte[] bArr, int i) {
        return UNSAFE.getShort(bArr, BYTE_ARRAY_BASE_OFFSET + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(byte[] bArr, int i) {
        return UNSAFE.getInt(bArr, BYTE_ARRAY_BASE_OFFSET + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(int[] iArr, long j) {
        return UNSAFE.getInt(iArr, INT_ARRAY_BASE_OFFSET + (INT_ARRAY_INDEX_SCALE * j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(byte[] bArr, int i) {
        return UNSAFE.getLong(bArr, BYTE_ARRAY_BASE_OFFSET + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(long[] jArr, long j) {
        return UNSAFE.getLong(jArr, LONG_ARRAY_BASE_OFFSET + (LONG_ARRAY_INDEX_SCALE * j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(long j, byte b) {
        UNSAFE.putByte(j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putShort(long j, short s) {
        UNSAFE.putShort(j, s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putInt(long j, int i) {
        UNSAFE.putInt(j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putLong(long j, long j2) {
        UNSAFE.putLong(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(byte[] bArr, int i, byte b) {
        UNSAFE.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + i, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putShort(byte[] bArr, int i, short s) {
        UNSAFE.putShort(bArr, BYTE_ARRAY_BASE_OFFSET + i, s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putInt(byte[] bArr, int i, int i2) {
        UNSAFE.putInt(bArr, BYTE_ARRAY_BASE_OFFSET + i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putLong(byte[] bArr, int i, long j) {
        UNSAFE.putLong(bArr, BYTE_ARRAY_BASE_OFFSET + i, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putObject(Object obj, long j, Object obj2) {
        UNSAFE.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(long j, long j2, long j3) {
        if (javaVersion() <= 8) {
            copyMemoryWithSafePointPolling(j, j2, j3);
        } else {
            UNSAFE.copyMemory(j, j2, j3);
        }
    }

    private static void copyMemoryWithSafePointPolling(long j, long j2, long j3) {
        while (j3 > 0) {
            long min = Math.min(j3, 1048576L);
            UNSAFE.copyMemory(j, j2, min);
            j3 -= min;
            j += min;
            j2 += min;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(Object obj, long j, Object obj2, long j2, long j3) {
        if (javaVersion() <= 8) {
            copyMemoryWithSafePointPolling(obj, j, obj2, j2, j3);
        } else {
            UNSAFE.copyMemory(obj, j, obj2, j2, j3);
        }
    }

    private static void copyMemoryWithSafePointPolling(Object obj, long j, Object obj2, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        while (j6 > 0) {
            long min = Math.min(j6, 1048576L);
            UNSAFE.copyMemory(obj, j4, obj2, j5, min);
            j6 -= min;
            j4 += min;
            j5 += min;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setMemory(long j, long j2, byte b) {
        UNSAFE.setMemory(j, j2, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setMemory(Object obj, long j, long j2, byte b) {
        UNSAFE.setMemory(obj, j, j2, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean equals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 & 7;
        long j = BYTE_ARRAY_BASE_OFFSET + i;
        long j2 = i2 - i;
        if (i3 >= 8) {
            long j3 = i4 + j;
            long j4 = (j - 8) + i3;
            while (j4 >= j3) {
                Unsafe unsafe = UNSAFE;
                long j5 = j3;
                if (unsafe.getLong(bArr, j4) != unsafe.getLong(bArr2, j4 + j2)) {
                    return false;
                }
                j4 -= 8;
                j3 = j5;
            }
        }
        if (i4 >= 4) {
            i4 -= 4;
            long j6 = i4 + j;
            Unsafe unsafe2 = UNSAFE;
            if (unsafe2.getInt(bArr, j6) != unsafe2.getInt(bArr2, j6 + j2)) {
                return false;
            }
        }
        long j7 = j2 + j;
        if (i4 >= 2) {
            Unsafe unsafe3 = UNSAFE;
            return unsafe3.getChar(bArr, j) == unsafe3.getChar(bArr2, j7) && (i4 == 2 || unsafe3.getByte(bArr, j + 2) == unsafe3.getByte(bArr2, j7 + 2));
        }
        if (i4 != 0) {
            Unsafe unsafe4 = UNSAFE;
            if (unsafe4.getByte(bArr, j) != unsafe4.getByte(bArr2, j7)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int equalsConstantTime(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        long j = i3 & 7;
        long j2 = BYTE_ARRAY_BASE_OFFSET + i;
        long j3 = j2 + j;
        long j4 = i2 - i;
        long j5 = 0;
        for (long j6 = (j2 - 8) + i3; j6 >= j3; j6 -= 8) {
            Unsafe unsafe = UNSAFE;
            j5 |= unsafe.getLong(bArr, j6) ^ unsafe.getLong(bArr2, j6 + j4);
        }
        if (j >= 4) {
            Unsafe unsafe2 = UNSAFE;
            j5 |= unsafe2.getInt(bArr2, j2 + j4) ^ unsafe2.getInt(bArr, j2);
            j -= 4;
        }
        if (j >= 2) {
            long j7 = j3 - j;
            Unsafe unsafe3 = UNSAFE;
            j5 |= unsafe3.getChar(bArr2, j7 + j4) ^ unsafe3.getChar(bArr, j7);
            j -= 2;
        }
        if (j == 1) {
            long j8 = j3 - 1;
            Unsafe unsafe4 = UNSAFE;
            j5 |= unsafe4.getByte(bArr, j8) ^ unsafe4.getByte(bArr2, j8 + j4);
        }
        return ConstantTimeUtils.equalsConstantTime(j5, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isZero(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return true;
        }
        long j = BYTE_ARRAY_BASE_OFFSET + i;
        int i3 = i2 & 7;
        long j2 = i3 + j;
        for (long j3 = (j - 8) + i2; j3 >= j2; j3 -= 8) {
            if (UNSAFE.getLong(bArr, j3) != 0) {
                return false;
            }
        }
        if (i3 >= 4) {
            i3 -= 4;
            if (UNSAFE.getInt(bArr, i3 + j) != 0) {
                return false;
            }
        }
        return i3 >= 2 ? UNSAFE.getChar(bArr, j) == 0 && (i3 == 2 || bArr[i + 2] == 0) : bArr[i] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int hashCodeAscii(byte[] bArr, int i, int i2) {
        int i3;
        long j = BYTE_ARRAY_BASE_OFFSET + i;
        int i4 = i2 & 7;
        long j2 = i4 + j;
        int i5 = HASH_CODE_ASCII_SEED;
        for (long j3 = (j - 8) + i2; j3 >= j2; j3 -= 8) {
            i5 = hashCodeAsciiCompute(UNSAFE.getLong(bArr, j3), i5);
        }
        if (i4 == 0) {
            return i5;
        }
        boolean z = (i4 != 2) & (i4 != 4) & (i4 != 6);
        int i6 = HASH_CODE_C2;
        if (z) {
            i5 = (i5 * HASH_CODE_C1) + hashCodeAsciiSanitize(UNSAFE.getByte(bArr, j));
            j++;
            i3 = HASH_CODE_C2;
        } else {
            i3 = HASH_CODE_C1;
        }
        if ((i4 != 5) & (i4 != 1) & (i4 != 4)) {
            i5 = (i5 * i3) + hashCodeAsciiSanitize(UNSAFE.getShort(bArr, j));
            if (i3 != HASH_CODE_C1) {
                i6 = HASH_CODE_C1;
            }
            j += 2;
            i3 = i6;
        }
        return i4 >= 4 ? (i5 * i3) + hashCodeAsciiSanitize(UNSAFE.getInt(bArr, j)) : i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int hashCodeAsciiCompute(long j, int i) {
        return (i * HASH_CODE_C1) + (hashCodeAsciiSanitize((int) j) * HASH_CODE_C2) + ((int) ((j & 2242545357458243584L) >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader getClassLoader(final Class<?> cls) {
        if (System.getSecurityManager() == null) {
            return cls.getClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return cls.getClassLoader();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader getContextClassLoader() {
        if (System.getSecurityManager() == null) {
            return Thread.currentThread().getContextClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return Thread.currentThread().getContextClassLoader();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader getSystemClassLoader() {
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int addressSize() {
        return UNSAFE.addressSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long allocateMemory(long j) {
        return UNSAFE.allocateMemory(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void freeMemory(long j) {
        UNSAFE.freeMemory(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long reallocateMemory(long j, long j2) {
        return UNSAFE.reallocateMemory(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isAndroid() {
        return IS_ANDROID;
    }

    private static boolean isAndroid0() {
        boolean equals = "Dalvik".equals(SystemPropertyUtil.get("java.vm.name"));
        if (equals) {
            logger.debug("Platform: Android");
        }
        return equals;
    }

    private static boolean explicitTryReflectionSetAccessible0() {
        return SystemPropertyUtil.getBoolean("io.grpc.netty.shaded.io.netty.tryReflectionSetAccessible", javaVersion() < 9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isExplicitTryReflectionSetAccessible() {
        return IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int javaVersion() {
        return JAVA_VERSION;
    }

    private static int javaVersion0() {
        int majorVersionFromJavaSpecificationVersion = isAndroid0() ? 6 : majorVersionFromJavaSpecificationVersion();
        logger.debug("Java version: {}", Integer.valueOf(majorVersionFromJavaSpecificationVersion));
        return majorVersionFromJavaSpecificationVersion;
    }

    static int majorVersionFromJavaSpecificationVersion() {
        return majorVersion(SystemPropertyUtil.get("java.specification.version", "1.6"));
    }

    static int majorVersion(String str) {
        String[] split = str.split("\\.");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = Integer.parseInt(split[i]);
        }
        int i2 = iArr[0];
        return i2 == 1 ? iArr[1] : i2;
    }

    private PlatformDependent0() {
    }
}
