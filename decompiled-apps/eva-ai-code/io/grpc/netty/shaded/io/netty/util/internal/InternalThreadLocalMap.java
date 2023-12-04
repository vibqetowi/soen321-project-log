package io.grpc.netty.shaded.io.netty.util.internal;

import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocalThread;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes4.dex */
public final class InternalThreadLocalMap extends UnpaddedInternalThreadLocalMap {
    private static final int DEFAULT_ARRAY_LIST_INITIAL_CAPACITY = 8;
    private static final int HANDLER_SHARABLE_CACHE_INITIAL_CAPACITY = 4;
    private static final int INDEXED_VARIABLE_TABLE_INITIAL_SIZE = 32;
    private static final int STRING_BUILDER_INITIAL_SIZE;
    private static final int STRING_BUILDER_MAX_SIZE;
    public static final Object UNSET;
    private static final InternalLogger logger;
    private BitSet cleanerFlags;
    public long rp1;
    public long rp2;
    public long rp3;
    public long rp4;
    public long rp5;
    public long rp6;
    public long rp7;
    public long rp8;
    public long rp9;

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(InternalThreadLocalMap.class);
        logger = internalLoggerFactory;
        UNSET = new Object();
        int i = SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.threadLocalMap.stringBuilder.initialSize", 1024);
        STRING_BUILDER_INITIAL_SIZE = i;
        internalLoggerFactory.debug("-Dio.netty.threadLocalMap.stringBuilder.initialSize: {}", Integer.valueOf(i));
        int i2 = SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.threadLocalMap.stringBuilder.maxSize", 4096);
        STRING_BUILDER_MAX_SIZE = i2;
        internalLoggerFactory.debug("-Dio.netty.threadLocalMap.stringBuilder.maxSize: {}", Integer.valueOf(i2));
    }

    public static InternalThreadLocalMap getIfSet() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof FastThreadLocalThread) {
            return ((FastThreadLocalThread) currentThread).threadLocalMap();
        }
        return slowThreadLocalMap.get();
    }

    public static InternalThreadLocalMap get() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof FastThreadLocalThread) {
            return fastGet((FastThreadLocalThread) currentThread);
        }
        return slowGet();
    }

    private static InternalThreadLocalMap fastGet(FastThreadLocalThread fastThreadLocalThread) {
        InternalThreadLocalMap threadLocalMap = fastThreadLocalThread.threadLocalMap();
        if (threadLocalMap == null) {
            InternalThreadLocalMap internalThreadLocalMap = new InternalThreadLocalMap();
            fastThreadLocalThread.setThreadLocalMap(internalThreadLocalMap);
            return internalThreadLocalMap;
        }
        return threadLocalMap;
    }

    private static InternalThreadLocalMap slowGet() {
        ThreadLocal<InternalThreadLocalMap> threadLocal = UnpaddedInternalThreadLocalMap.slowThreadLocalMap;
        InternalThreadLocalMap internalThreadLocalMap = threadLocal.get();
        if (internalThreadLocalMap == null) {
            InternalThreadLocalMap internalThreadLocalMap2 = new InternalThreadLocalMap();
            threadLocal.set(internalThreadLocalMap2);
            return internalThreadLocalMap2;
        }
        return internalThreadLocalMap;
    }

    public static void remove() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof FastThreadLocalThread) {
            ((FastThreadLocalThread) currentThread).setThreadLocalMap(null);
        } else {
            slowThreadLocalMap.remove();
        }
    }

    public static void destroy() {
        slowThreadLocalMap.remove();
    }

    public static int nextVariableIndex() {
        int andIncrement = nextIndex.getAndIncrement();
        if (andIncrement >= 0) {
            return andIncrement;
        }
        nextIndex.decrementAndGet();
        throw new IllegalStateException("too many thread-local indexed variables");
    }

    public static int lastVariableIndex() {
        return nextIndex.get() - 1;
    }

    private InternalThreadLocalMap() {
        super(newIndexedVariableTable());
    }

    private static Object[] newIndexedVariableTable() {
        Object[] objArr = new Object[32];
        Arrays.fill(objArr, UNSET);
        return objArr;
    }

    public int size() {
        int i = this.futureListenerStackDepth != 0 ? 1 : 0;
        if (this.localChannelReaderStackDepth != 0) {
            i++;
        }
        if (this.handlerSharableCache != null) {
            i++;
        }
        if (this.counterHashCode != null) {
            i++;
        }
        if (this.random != null) {
            i++;
        }
        if (this.typeParameterMatcherGetCache != null) {
            i++;
        }
        if (this.typeParameterMatcherFindCache != null) {
            i++;
        }
        if (this.stringBuilder != null) {
            i++;
        }
        if (this.charsetEncoderCache != null) {
            i++;
        }
        if (this.charsetDecoderCache != null) {
            i++;
        }
        if (this.arrayList != null) {
            i++;
        }
        for (Object obj : this.indexedVariables) {
            if (obj != UNSET) {
                i++;
            }
        }
        return i - 1;
    }

    public StringBuilder stringBuilder() {
        StringBuilder sb = this.stringBuilder;
        if (sb == null) {
            StringBuilder sb2 = new StringBuilder(STRING_BUILDER_INITIAL_SIZE);
            this.stringBuilder = sb2;
            return sb2;
        }
        if (sb.capacity() > STRING_BUILDER_MAX_SIZE) {
            sb.setLength(STRING_BUILDER_INITIAL_SIZE);
            sb.trimToSize();
        }
        sb.setLength(0);
        return sb;
    }

    public Map<Charset, CharsetEncoder> charsetEncoderCache() {
        Map<Charset, CharsetEncoder> map = this.charsetEncoderCache;
        if (map == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            this.charsetEncoderCache = identityHashMap;
            return identityHashMap;
        }
        return map;
    }

    public Map<Charset, CharsetDecoder> charsetDecoderCache() {
        Map<Charset, CharsetDecoder> map = this.charsetDecoderCache;
        if (map == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            this.charsetDecoderCache = identityHashMap;
            return identityHashMap;
        }
        return map;
    }

    public <E> ArrayList<E> arrayList() {
        return arrayList(8);
    }

    public <E> ArrayList<E> arrayList(int i) {
        ArrayList<E> arrayList = (ArrayList<E>) this.arrayList;
        if (arrayList == null) {
            this.arrayList = new ArrayList<>(i);
            return (ArrayList<E>) this.arrayList;
        }
        arrayList.clear();
        arrayList.ensureCapacity(i);
        return arrayList;
    }

    public int futureListenerStackDepth() {
        return this.futureListenerStackDepth;
    }

    public void setFutureListenerStackDepth(int i) {
        this.futureListenerStackDepth = i;
    }

    public ThreadLocalRandom random() {
        ThreadLocalRandom threadLocalRandom = this.random;
        if (threadLocalRandom == null) {
            ThreadLocalRandom threadLocalRandom2 = new ThreadLocalRandom();
            this.random = threadLocalRandom2;
            return threadLocalRandom2;
        }
        return threadLocalRandom;
    }

    public Map<Class<?>, TypeParameterMatcher> typeParameterMatcherGetCache() {
        Map<Class<?>, TypeParameterMatcher> map = this.typeParameterMatcherGetCache;
        if (map == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            this.typeParameterMatcherGetCache = identityHashMap;
            return identityHashMap;
        }
        return map;
    }

    public Map<Class<?>, Map<String, TypeParameterMatcher>> typeParameterMatcherFindCache() {
        Map<Class<?>, Map<String, TypeParameterMatcher>> map = this.typeParameterMatcherFindCache;
        if (map == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            this.typeParameterMatcherFindCache = identityHashMap;
            return identityHashMap;
        }
        return map;
    }

    @Deprecated
    public IntegerHolder counterHashCode() {
        return this.counterHashCode;
    }

    @Deprecated
    public void setCounterHashCode(IntegerHolder integerHolder) {
        this.counterHashCode = integerHolder;
    }

    public Map<Class<?>, Boolean> handlerSharableCache() {
        Map<Class<?>, Boolean> map = this.handlerSharableCache;
        if (map == null) {
            WeakHashMap weakHashMap = new WeakHashMap(4);
            this.handlerSharableCache = weakHashMap;
            return weakHashMap;
        }
        return map;
    }

    public int localChannelReaderStackDepth() {
        return this.localChannelReaderStackDepth;
    }

    public void setLocalChannelReaderStackDepth(int i) {
        this.localChannelReaderStackDepth = i;
    }

    public Object indexedVariable(int i) {
        Object[] objArr = this.indexedVariables;
        return i < objArr.length ? objArr[i] : UNSET;
    }

    public boolean setIndexedVariable(int i, Object obj) {
        Object[] objArr = this.indexedVariables;
        if (i < objArr.length) {
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2 == UNSET;
        }
        expandIndexedVariableTableAndSet(i, obj);
        return true;
    }

    private void expandIndexedVariableTableAndSet(int i, Object obj) {
        Object[] objArr = this.indexedVariables;
        int length = objArr.length;
        int i2 = (i >>> 1) | i;
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        Object[] copyOf = Arrays.copyOf(objArr, (i5 | (i5 >>> 16)) + 1);
        Arrays.fill(copyOf, length, copyOf.length, UNSET);
        copyOf[i] = obj;
        this.indexedVariables = copyOf;
    }

    public Object removeIndexedVariable(int i) {
        Object[] objArr = this.indexedVariables;
        if (i < objArr.length) {
            Object obj = objArr[i];
            objArr[i] = UNSET;
            return obj;
        }
        return UNSET;
    }

    public boolean isIndexedVariableSet(int i) {
        Object[] objArr = this.indexedVariables;
        return i < objArr.length && objArr[i] != UNSET;
    }

    public boolean isCleanerFlagSet(int i) {
        BitSet bitSet = this.cleanerFlags;
        return bitSet != null && bitSet.get(i);
    }

    public void setCleanerFlag(int i) {
        if (this.cleanerFlags == null) {
            this.cleanerFlags = new BitSet();
        }
        this.cleanerFlags.set(i);
    }
}
