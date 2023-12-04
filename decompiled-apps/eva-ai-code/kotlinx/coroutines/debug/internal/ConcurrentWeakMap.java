package kotlinx.coroutines.debug.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.Symbol;
/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0003()*B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0006\u0010'\u001a\u00020\u001aR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001f\u0010\n\u001a\u0018\u0012\u0014\u0012\u00120\fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000bX\u0082\u0004R&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableMap;", "weakRefQueue", "", "(Z)V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "core", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "getKeys", "size", "", "getSize", "()I", "Ljava/lang/ref/ReferenceQueue;", "cleanWeakRef", "", "w", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "clear", "decrementSize", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putSynchronized", "remove", "runWeakRefQueueCleaningLoopUntilInterrupted", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {
    private static final AtomicIntegerFieldUpdater _size$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");
    private static final AtomicReferenceFieldUpdater core$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core");
    @Volatile
    private volatile int _size;
    @Volatile
    private volatile Object core;
    private final ReferenceQueue<K> weakRefQueue;

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core = new Core(16);
        this.weakRefQueue = z ? new ReferenceQueue<>() : null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return _size$FU.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        _size$FU.decrementAndGet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((Core) core$FU.get(this)).getImpl(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Symbol symbol;
        V v2 = (V) Core.putImpl$default((Core) core$FU.get(this), k, v, null, 4, null);
        symbol = ConcurrentWeakMapKt.REHASH;
        if (v2 == symbol) {
            v2 = putSynchronized(k, v);
        }
        if (v2 == null) {
            _size$FU.incrementAndGet(this);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Symbol symbol;
        if (obj == 0) {
            return null;
        }
        V v = (V) Core.putImpl$default((Core) core$FU.get(this), obj, null, null, 4, null);
        symbol = ConcurrentWeakMapKt.REHASH;
        if (v == symbol) {
            v = putSynchronized(obj, null);
        }
        if (v != null) {
            _size$FU.decrementAndGet(this);
        }
        return v;
    }

    private final synchronized V putSynchronized(K k, V v) {
        V v2;
        Symbol symbol;
        Core core = (Core) core$FU.get(this);
        while (true) {
            v2 = (V) Core.putImpl$default(core, k, v, null, 4, null);
            symbol = ConcurrentWeakMapKt.REHASH;
            if (v2 == symbol) {
                core = core.rehash();
                core$FU.set(this, core);
            }
        }
        return v2;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new KeyValueSet(ConcurrentWeakMap$keys$1.INSTANCE);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(ConcurrentWeakMap$entries$1.INSTANCE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k : keySet()) {
            remove(k);
        }
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (!(this.weakRefQueue != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.weakRefQueue.remove();
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                cleanWeakRef((HashedWeakRef) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    private final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
        ((Core) core$FU.get(this)).cleanWeakRef(hashedWeakRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0015\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0002\u0010\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00170\u0019J1\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0006X\u0082\u0004R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "allocated", "", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", UserMetadata.KEYDATA_FILENAME, "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "load", "Lkotlinx/atomicfu/AtomicInt;", "shift", "threshold", "values", "cleanWeakRef", "", "weakRef", "getImpl", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "hash", "keyValueIterator", "", ExifInterface.LONGITUDE_EAST, "factory", "Lkotlin/Function2;", "putImpl", "value", "weakKey0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "rehash", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "removeCleanedAt", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final class Core {
        private static final AtomicIntegerFieldUpdater load$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load");
        private final int allocated;
        private final AtomicReferenceArray keys;
        @Volatile
        private volatile int load;
        private final int shift;
        private final int threshold;
        private final AtomicReferenceArray values;

        private final void update$atomicfu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Integer> function1, Object obj) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, function1.invoke(Integer.valueOf(i)).intValue()));
        }

        public Core(int i) {
            this.allocated = i;
            this.shift = Integer.numberOfLeadingZeros(i) + 1;
            this.threshold = (i * 2) / 3;
            this.keys = new AtomicReferenceArray(i);
            this.values = new AtomicReferenceArray(i);
        }

        private final int index(int i) {
            return (i * (-1640531527)) >>> this.shift;
        }

        public final V getImpl(K k) {
            int index = index(k.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) this.keys.get(index);
                if (hashedWeakRef == null) {
                    return null;
                }
                Object obj = hashedWeakRef.get();
                if (Intrinsics.areEqual(k, obj)) {
                    V v = (V) this.values.get(index);
                    return v instanceof Marked ? (V) ((Marked) v).ref : v;
                }
                if (obj == null) {
                    removeCleanedAt(index);
                }
                if (index == 0) {
                    index = this.allocated;
                }
                index--;
            }
        }

        private final void removeCleanedAt(int i) {
            Object obj;
            do {
                obj = this.values.get(i);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
            } while (!Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(this.values, i, obj, null));
            ConcurrentWeakMap.this.decrementSize();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i, Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
            r6 = r5.values.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
            if ((r6 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
            r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
            if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(r5.values, r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
            return r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object putImpl(K k, V v, HashedWeakRef<K> hashedWeakRef) {
            int i;
            Symbol symbol;
            int index = index(k.hashCode());
            boolean z = false;
            while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) this.keys.get(index);
                if (hashedWeakRef2 != null) {
                    Object obj = hashedWeakRef2.get();
                    if (!Intrinsics.areEqual(k, obj)) {
                        if (obj == null) {
                            removeCleanedAt(index);
                        }
                        if (index == 0) {
                            index = this.allocated;
                        }
                        index--;
                    } else if (z) {
                        load$FU.decrementAndGet(this);
                    }
                } else if (v != null) {
                    if (!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = load$FU;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.threshold) {
                                symbol = ConcurrentWeakMapKt.REHASH;
                                return symbol;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (hashedWeakRef == null) {
                        hashedWeakRef = new HashedWeakRef<>(k, ((ConcurrentWeakMap) ConcurrentWeakMap.this).weakRefQueue);
                    }
                    if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(this.keys, index, null, hashedWeakRef)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
            Object obj;
            Symbol symbol;
            Marked mark;
            while (true) {
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) new Core(Integer.highestOneBit(RangesKt.coerceAtLeast(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.allocated;
                for (int i2 = 0; i2 < i; i2++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.keys.get(i2);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i2);
                    }
                    while (true) {
                        obj = this.values.get(i2);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).ref;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.values;
                        mark = ConcurrentWeakMapKt.mark(obj);
                        if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i2, obj, mark)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object putImpl = core.putImpl(obj2, obj, hashedWeakRef);
                        symbol = ConcurrentWeakMapKt.REHASH;
                        if (putImpl != symbol) {
                        }
                    }
                }
                return core;
            }
        }

        public final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
            int index = index(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef<?> hashedWeakRef2 = (HashedWeakRef) this.keys.get(index);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    removeCleanedAt(index);
                    return;
                }
                if (index == 0) {
                    index = this.allocated;
                }
                index--;
            }
        }

        public final <E> Iterator<E> keyValueIterator(Function2<? super K, ? super V, ? extends E> function2) {
            return new KeyValueIterator(function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ConcurrentWeakMap.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", ExifInterface.LONGITUDE_EAST, "", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", FirebaseAnalytics.Param.INDEX, "", "key", "Ljava/lang/Object;", "value", "findNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {
            private final Function2<K, V, E> factory;
            private int index = -1;
            private K key;
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(Function2<? super K, ? super V, ? extends E> function2) {
                this.factory = function2;
                findNext();
            }

            private final void findNext() {
                K k;
                while (true) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i >= ((Core) Core.this).allocated) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) ((Core) Core.this).keys.get(this.index);
                    if (hashedWeakRef != null && (k = (K) hashedWeakRef.get()) != null) {
                        this.key = k;
                        V v = (V) ((Core) Core.this).values.get(this.index);
                        if (v instanceof Marked) {
                            v = (V) ((Marked) v).ref;
                        }
                        if (v != null) {
                            this.value = v;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((Core) Core.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((Core) Core.this).allocated) {
                    throw new NoSuchElementException();
                }
                Function2<K, V, E> function2 = this.factory;
                K k = this.key;
                if (k == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("key");
                    k = (K) Unit.INSTANCE;
                }
                V v = this.value;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("value");
                    v = (V) Unit.INSTANCE;
                }
                E invoke = function2.invoke(k, v);
                findNext();
                return invoke;
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.noImpl();
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final K key;
        private final V value;

        public Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0096\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableSet;", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    private final class KeyValueSet<E> extends AbstractMutableSet<E> {
        private final Function2<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(Function2<? super K, ? super V, ? extends E> function2) {
            this.factory = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.core$FU.get(ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }
}
