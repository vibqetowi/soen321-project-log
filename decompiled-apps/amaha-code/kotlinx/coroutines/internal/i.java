package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public final class i<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f23603a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23604b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23605c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f23606d;

    /* renamed from: g  reason: collision with root package name */
    public static final r f23602g = new r("REMOVE_FROZEN");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23601e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(i.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f23607a;

        public a(int i6) {
            this.f23607a = i6;
        }
    }

    public i(int i6, boolean z10) {
        boolean z11;
        this.f23603a = i6;
        this.f23604b = z10;
        int i10 = i6 - 1;
        this.f23605c = i10;
        this.f23606d = new AtomicReferenceArray(i6);
        if (i10 <= 1073741823) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((i6 & i10) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) == 0) {
                    return 1;
                }
                return 2;
            }
            int i6 = (int) ((1073741823 & j10) >> 0);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f23605c;
            if (((i10 + 2) & i11) == (i6 & i11)) {
                return 1;
            }
            if (!this.f23604b && this.f23606d.get(i10 & i11) != null) {
                int i12 = this.f23603a;
                if (i12 < 1024 || ((i10 - i6) & 1073741823) > (i12 >> 1)) {
                    break;
                }
            } else if (f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i10 + 1) & 1073741823) << 30))) {
                this.f23606d.set(i10 & i11, e10);
                i<E> iVar = this;
                while ((iVar._state & 1152921504606846976L) != 0) {
                    iVar = iVar.e();
                    AtomicReferenceArray atomicReferenceArray = iVar.f23606d;
                    int i13 = iVar.f23605c & i10;
                    Object obj = atomicReferenceArray.get(i13);
                    if ((obj instanceof a) && ((a) obj).f23607a == i10) {
                        atomicReferenceArray.set(i13, e10);
                        continue;
                    } else {
                        iVar = null;
                        continue;
                    }
                    if (iVar == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    public final boolean d() {
        long j10 = this._state;
        if (((int) ((1073741823 & j10) >> 0)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<E> e() {
        long j10;
        while (true) {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) == 0) {
                long j11 = j10 | 1152921504606846976L;
                if (f.compareAndSet(this, j10, j11)) {
                    j10 = j11;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            i<E> iVar = (i) this._next;
            if (iVar != null) {
                return iVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23601e;
            i iVar2 = new i(this.f23603a * 2, this.f23604b);
            int i6 = (int) ((1073741823 & j10) >> 0);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i11 = this.f23605c;
                int i12 = i6 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = this.f23606d.get(i12);
                if (obj == null) {
                    obj = new a(i6);
                }
                iVar2.f23606d.set(iVar2.f23605c & i6, obj);
                i6++;
            }
            iVar2._state = (-1152921504606846977L) & j10;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f23602g;
            }
            int i6 = (int) ((j10 & 1073741823) >> 0);
            int i10 = this.f23605c;
            int i11 = ((int) ((1152921503533105152L & j10) >> 30)) & i10;
            int i12 = i10 & i6;
            if (i11 == i12) {
                return null;
            }
            Object obj = this.f23606d.get(i12);
            if (obj == null) {
                if (this.f23604b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((i6 + 1) & 1073741823) << 0;
                if (f.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    this.f23606d.set(this.f23605c & i6, null);
                    return obj;
                } else if (this.f23604b) {
                    i<E> iVar = this;
                    while (true) {
                        long j12 = iVar._state;
                        int i13 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            iVar = iVar.e();
                        } else {
                            if (f.compareAndSet(iVar, j12, (j12 & (-1073741824)) | j11)) {
                                iVar.f23606d.set(iVar.f23605c & i13, null);
                                iVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (iVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
