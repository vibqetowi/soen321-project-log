package androidx.compose.runtime;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001'B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006("}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "currentRecord", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()Ljava/lang/Object;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "value", "getValue", "current", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readable", "forceDependencyReads", "", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DerivedSnapshotState<T> implements StateObject, DerivedState<T> {
    private final Function0<T> calculation;
    private ResultRecord<T> first;
    private final SnapshotMutationPolicy<T> policy;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return StateObject.CC.$default$mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(Function0<? extends T> calculation, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.calculation = calculation;
        this.policy = snapshotMutationPolicy;
        this.first = new ResultRecord<>();
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001/B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\u001a\u0010(\u001a\u00020)2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-J\u001a\u0010.\u001a\u00020\b2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u00060"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "()V", "_dependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "get_dependencies", "()Landroidx/compose/runtime/collection/IdentityArrayMap;", "set_dependencies", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "dependencies", "", "", "getDependencies", "()[Ljava/lang/Object;", "result", "getResult", "setResult", "(Ljava/lang/Object;)V", "resultHash", "getResultHash", "()I", "setResultHash", "(I)V", "validSnapshotId", "getValidSnapshotId", "setValidSnapshotId", "validSnapshotWriteCount", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private IdentityArrayMap<StateObject, Integer> _dependencies;
        private Object result = Unset;
        private int resultHash;
        private int validSnapshotId;
        private int validSnapshotWriteCount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        /* compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final void setValidSnapshotId(int i) {
            this.validSnapshotId = i;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.validSnapshotWriteCount = i;
        }

        public final IdentityArrayMap<StateObject, Integer> get_dependencies() {
            return this._dependencies;
        }

        public final void set_dependencies(IdentityArrayMap<StateObject, Integer> identityArrayMap) {
            this._dependencies = identityArrayMap;
        }

        public final Object getResult() {
            return this.result;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ResultRecord resultRecord = (ResultRecord) value;
            this._dependencies = resultRecord._dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public Object[] getDependencies() {
            Object[] keys;
            IdentityArrayMap<StateObject, Integer> identityArrayMap = this._dependencies;
            return (identityArrayMap == null || (keys = identityArrayMap.getKeys()) == null) ? new Object[0] : keys;
        }

        public final boolean isValid(DerivedState<?> derivedState, Snapshot snapshot) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                z = false;
                if (this.validSnapshotId == snapshot.getId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount$runtime_release()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.result != Unset && (!z2 || this.resultHash == readableHash(derivedState, snapshot))) {
                z = true;
            }
            if (z && z2) {
                synchronized (SnapshotKt.getLock()) {
                    this.validSnapshotId = snapshot.getId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount$runtime_release();
                    Unit unit = Unit.INSTANCE;
                }
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:13:0x0030, B:15:0x0037, B:23:0x0074, B:18:0x0053, B:20:0x0057, B:22:0x0066, B:21:0x005e, B:24:0x0077), top: B:45:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int readableHash(DerivedState<?> derivedState, Snapshot snapshot) {
            IdentityArrayMap<StateObject, Integer> identityArrayMap;
            int size;
            int i;
            int size2;
            StateRecord current;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                identityArrayMap = this._dependencies;
            }
            int i2 = 7;
            if (identityArrayMap != null) {
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                int size3 = derivedStateObservers.getSize();
                int i3 = 0;
                if (size3 > 0) {
                    DerivedStateObserver[] content = derivedStateObservers.getContent();
                    int i4 = 0;
                    do {
                        content[i4].start(derivedState);
                        i4++;
                    } while (i4 < size3);
                    try {
                        size = identityArrayMap.getSize();
                        for (i = 0; i < size; i++) {
                            Object obj = identityArrayMap.getKeys()[i];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            StateObject stateObject = (StateObject) obj;
                            if (((Number) identityArrayMap.getValues()[i]).intValue() == 1) {
                                if (stateObject instanceof DerivedSnapshotState) {
                                    current = ((DerivedSnapshotState) stateObject).current(snapshot);
                                } else {
                                    current = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                }
                                i2 = (((i2 * 31) + ActualJvm_jvmKt.identityHashCode(current)) * 31) + current.getSnapshotId$runtime_release();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        size2 = derivedStateObservers.getSize();
                        if (size2 > 0) {
                            DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                            do {
                                content2[i3].done(derivedState);
                                i3++;
                            } while (i3 < size2);
                        }
                    } catch (Throwable th) {
                        int size4 = derivedStateObservers.getSize();
                        if (size4 > 0) {
                            DerivedStateObserver[] content3 = derivedStateObservers.getContent();
                            do {
                                content3[i3].done(derivedState);
                                i3++;
                            } while (i3 < size4);
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    size = identityArrayMap.getSize();
                    while (i < size) {
                    }
                    Unit unit2 = Unit.INSTANCE;
                    size2 = derivedStateObservers.getSize();
                    if (size2 > 0) {
                    }
                }
            }
            return i2;
        }
    }

    public final StateRecord current(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:10:0x0026, B:12:0x0036, B:15:0x003e, B:17:0x0045, B:19:0x0070, B:20:0x0073, B:21:0x0076), top: B:81:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:10:0x0026, B:12:0x0036, B:15:0x003e, B:17:0x0045, B:19:0x0070, B:20:0x0073, B:21:0x0076), top: B:81:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z, Function0<? extends T> function0) {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        SnapshotThreadLocal snapshotThreadLocal3;
        int size;
        int size2;
        IdentityArrayMap<StateObject, Integer> identityArrayMap;
        SnapshotThreadLocal snapshotThreadLocal4;
        SnapshotThreadLocal snapshotThreadLocal5;
        int size3;
        SnapshotThreadLocal snapshotThreadLocal6;
        DerivedSnapshotState<T> derivedSnapshotState = this;
        int i = 1;
        int i2 = 0;
        if (resultRecord.isValid(derivedSnapshotState, snapshot)) {
            if (z) {
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                int size4 = derivedStateObservers.getSize();
                if (size4 <= 0) {
                    identityArrayMap = resultRecord.get_dependencies();
                    snapshotThreadLocal4 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                    Integer num = (Integer) snapshotThreadLocal4.get();
                    if (num == null) {
                    }
                    if (identityArrayMap != null) {
                    }
                    snapshotThreadLocal5 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                    snapshotThreadLocal5.set(Integer.valueOf(r1));
                    Unit unit = Unit.INSTANCE;
                    size3 = derivedStateObservers.getSize();
                    if (size3 > 0) {
                    }
                } else {
                    DerivedStateObserver[] content = derivedStateObservers.getContent();
                    int i3 = 0;
                    do {
                        content[i3].start(derivedSnapshotState);
                        i3++;
                    } while (i3 < size4);
                    try {
                        identityArrayMap = resultRecord.get_dependencies();
                        snapshotThreadLocal4 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                        Integer num2 = (Integer) snapshotThreadLocal4.get();
                        int intValue = num2 == null ? num2.intValue() : 0;
                        if (identityArrayMap != null) {
                            int size5 = identityArrayMap.getSize();
                            for (int i4 = 0; i4 < size5; i4++) {
                                Object obj = identityArrayMap.getKeys()[i4];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                                int intValue2 = ((Number) identityArrayMap.getValues()[i4]).intValue();
                                StateObject stateObject = (StateObject) obj;
                                snapshotThreadLocal6 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                                snapshotThreadLocal6.set(Integer.valueOf(intValue2 + intValue));
                                Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
                                if (readObserver$runtime_release != null) {
                                    readObserver$runtime_release.invoke(stateObject);
                                }
                            }
                        }
                        snapshotThreadLocal5 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                        snapshotThreadLocal5.set(Integer.valueOf(intValue));
                        Unit unit2 = Unit.INSTANCE;
                        size3 = derivedStateObservers.getSize();
                        if (size3 > 0) {
                            DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                            do {
                                content2[i2].done(derivedSnapshotState);
                                i2++;
                            } while (i2 < size3);
                        }
                    } catch (Throwable th) {
                        if (size2 > 0) {
                            throw th;
                        }
                        throw th;
                    }
                }
            }
            return resultRecord;
        }
        snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
        Integer num3 = (Integer) snapshotThreadLocal.get();
        int intValue3 = num3 != null ? num3.intValue() : 0;
        IdentityArrayMap<StateObject, Integer> identityArrayMap2 = new IdentityArrayMap<>(0, 1, null);
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        int size6 = derivedStateObservers2.getSize();
        if (size6 <= 0) {
            snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
            snapshotThreadLocal2.set(Integer.valueOf(intValue3 + 1));
            T t = (T) Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$result$1(this, identityArrayMap2, intValue3), null, function0);
            snapshotThreadLocal3 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
            snapshotThreadLocal3.set(Integer.valueOf(intValue3));
            size = derivedStateObservers2.getSize();
            if (size <= 0) {
            }
        } else {
            DerivedStateObserver[] content3 = derivedStateObservers2.getContent();
            int i5 = 0;
            do {
                content3[i5].start(derivedSnapshotState);
                i5++;
            } while (i5 < size6);
            try {
                snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                snapshotThreadLocal2.set(Integer.valueOf(intValue3 + 1));
                T t2 = (T) Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$result$1(this, identityArrayMap2, intValue3), null, function0);
                snapshotThreadLocal3 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                snapshotThreadLocal3.set(Integer.valueOf(intValue3));
                size = derivedStateObservers2.getSize();
                if (size <= 0) {
                    DerivedStateObserver[] content4 = derivedStateObservers2.getContent();
                    int i6 = 0;
                    do {
                        content4[i6].done(derivedSnapshotState);
                        i6++;
                    } while (i6 < size);
                    synchronized (SnapshotKt.getLock()) {
                        Snapshot current = Snapshot.Companion.getCurrent();
                        if (resultRecord.getResult() != ResultRecord.Companion.getUnset()) {
                            SnapshotMutationPolicy<T> policy = getPolicy();
                            if (policy == null || !policy.equivalent(t2, (T) resultRecord.getResult())) {
                                i = 0;
                            }
                            if (i != 0) {
                                resultRecord.set_dependencies(identityArrayMap2);
                                resultRecord.setResultHash(resultRecord.readableHash(this, current));
                                resultRecord.setValidSnapshotId(snapshot.getId());
                                resultRecord.setValidSnapshotWriteCount(snapshot.getWriteCount$runtime_release());
                            }
                        }
                        resultRecord = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                        resultRecord.set_dependencies(identityArrayMap2);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                        resultRecord.setValidSnapshotId(snapshot.getId());
                        resultRecord.setValidSnapshotWriteCount(snapshot.getWriteCount$runtime_release());
                        resultRecord.setResult(t2);
                    }
                    if (intValue3 == 0) {
                        Snapshot.Companion.notifyObjectsInitialized();
                    }
                    return resultRecord;
                }
                synchronized (SnapshotKt.getLock()) {
                }
            } finally {
                int size7 = derivedStateObservers2.getSize();
                if (size7 > 0) {
                    DerivedStateObserver[] content5 = derivedStateObservers2.getContent();
                    do {
                        content5[i2].done(derivedSnapshotState);
                        i2++;
                    } while (i2 < size7);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.first = (ResultRecord) value;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Function1<Object, Unit> readObserver$runtime_release = Snapshot.Companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.Companion.getCurrent(), true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record<T> getCurrentRecord() {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.Companion.getCurrent(), false, this.calculation);
    }

    public String toString() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return resultRecord.isValid(this, Snapshot.Companion.getCurrent()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>";
    }
}
