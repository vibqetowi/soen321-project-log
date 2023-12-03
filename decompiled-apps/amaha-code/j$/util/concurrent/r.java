package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r extends l {

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.b f21167h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f21168i;

    /* renamed from: e  reason: collision with root package name */
    s f21169e;
    volatile s f;

    /* renamed from: g  reason: collision with root package name */
    volatile Thread f21170g;
    volatile int lockState;

    static {
        j$.sun.misc.b h10 = j$.sun.misc.b.h();
        f21167h = h10;
        f21168i = h10.j(r.class, "lockState");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        super(-2, null, null);
        int d10;
        int i6;
        this.f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            s sVar3 = (s) sVar.f21155d;
            sVar.f21172g = null;
            sVar.f = null;
            if (sVar2 == null) {
                sVar.f21171e = null;
                sVar.f21174i = false;
            } else {
                Object obj = sVar.f21153b;
                int i10 = sVar.f21152a;
                s sVar4 = sVar2;
                Class cls = null;
                while (true) {
                    Object obj2 = sVar4.f21153b;
                    int i11 = sVar4.f21152a;
                    i6 = i11 > i10 ? -1 : i11 < i10 ? 1 : ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) ? i(obj, obj2) : d10;
                    s sVar5 = i6 <= 0 ? sVar4.f : sVar4.f21172g;
                    if (sVar5 == null) {
                        break;
                    }
                    sVar4 = sVar5;
                }
                sVar.f21171e = sVar4;
                if (i6 <= 0) {
                    sVar4.f = sVar;
                } else {
                    sVar4.f21172g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
            sVar = sVar3;
        }
        this.f21169e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.f21171e;
            if (sVar3 == null) {
                sVar2.f21174i = false;
                return sVar2;
            } else if (sVar2.f21174i) {
                sVar2.f21174i = false;
                return sVar;
            } else {
                s sVar4 = sVar3.f;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.f21172g;
                    if (sVar4 != null && sVar4.f21174i) {
                        sVar4.f21174i = false;
                        sVar3.f21174i = true;
                        sVar = g(sVar, sVar3);
                        sVar3 = sVar2.f21171e;
                        sVar4 = sVar3 == null ? null : sVar3.f21172g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar5 = sVar4.f;
                        s sVar6 = sVar4.f21172g;
                        if ((sVar6 != null && sVar6.f21174i) || (sVar5 != null && sVar5.f21174i)) {
                            if (sVar6 == null || !sVar6.f21174i) {
                                if (sVar5 != null) {
                                    sVar5.f21174i = false;
                                }
                                sVar4.f21174i = true;
                                sVar = h(sVar, sVar4);
                                sVar3 = sVar2.f21171e;
                                sVar4 = sVar3 != null ? sVar3.f21172g : null;
                            }
                            if (sVar4 != null) {
                                sVar4.f21174i = sVar3 == null ? false : sVar3.f21174i;
                                s sVar7 = sVar4.f21172g;
                                if (sVar7 != null) {
                                    sVar7.f21174i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f21174i = false;
                                sVar = g(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f21174i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.f21174i) {
                        sVar4.f21174i = false;
                        sVar3.f21174i = true;
                        sVar = h(sVar, sVar3);
                        sVar3 = sVar2.f21171e;
                        sVar4 = sVar3 == null ? null : sVar3.f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar8 = sVar4.f;
                        s sVar9 = sVar4.f21172g;
                        if ((sVar8 != null && sVar8.f21174i) || (sVar9 != null && sVar9.f21174i)) {
                            if (sVar8 == null || !sVar8.f21174i) {
                                if (sVar9 != null) {
                                    sVar9.f21174i = false;
                                }
                                sVar4.f21174i = true;
                                sVar = g(sVar, sVar4);
                                sVar3 = sVar2.f21171e;
                                sVar4 = sVar3 != null ? sVar3.f : null;
                            }
                            if (sVar4 != null) {
                                sVar4.f21174i = sVar3 == null ? false : sVar3.f21174i;
                                s sVar10 = sVar4.f;
                                if (sVar10 != null) {
                                    sVar10.f21174i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f21174i = false;
                                sVar = h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f21174i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.f21174i = true;
        while (true) {
            s sVar4 = sVar2.f21171e;
            if (sVar4 == null) {
                sVar2.f21174i = false;
                return sVar2;
            } else if (!sVar4.f21174i || (sVar3 = sVar4.f21171e) == null) {
                break;
            } else {
                s sVar5 = sVar3.f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f21172g;
                    if (sVar5 == null || !sVar5.f21174i) {
                        if (sVar2 == sVar4.f21172g) {
                            sVar = g(sVar, sVar4);
                            s sVar6 = sVar4.f21171e;
                            sVar3 = sVar6 == null ? null : sVar6.f21171e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f21174i = false;
                            if (sVar3 != null) {
                                sVar3.f21174i = true;
                                sVar = h(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f21174i = false;
                        sVar4.f21174i = false;
                        sVar3.f21174i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f21174i) {
                    if (sVar2 == sVar4.f) {
                        sVar = h(sVar, sVar4);
                        s sVar7 = sVar4.f21171e;
                        sVar3 = sVar7 == null ? null : sVar7.f21171e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f21174i = false;
                        if (sVar3 != null) {
                            sVar3.f21174i = true;
                            sVar = g(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f21174i = false;
                    sVar4.f21174i = false;
                    sVar3.f21174i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    private final void d() {
        if (f21167h.c(this, f21168i, 0, 1)) {
            return;
        }
        boolean z10 = false;
        while (true) {
            int i6 = this.lockState;
            if ((i6 & (-3)) == 0) {
                if (f21167h.c(this, f21168i, i6, 1)) {
                    break;
                }
            } else if ((i6 & 2) == 0) {
                if (f21167h.c(this, f21168i, i6, i6 | 2)) {
                    this.f21170g = Thread.currentThread();
                    z10 = true;
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.f21170g = null;
        }
    }

    static s g(s sVar, s sVar2) {
        s sVar3 = sVar2.f21172g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f;
            sVar2.f21172g = sVar4;
            if (sVar4 != null) {
                sVar4.f21171e = sVar2;
            }
            s sVar5 = sVar2.f21171e;
            sVar3.f21171e = sVar5;
            if (sVar5 == null) {
                sVar3.f21174i = false;
                sVar = sVar3;
            } else if (sVar5.f == sVar2) {
                sVar5.f = sVar3;
            } else {
                sVar5.f21172g = sVar3;
            }
            sVar3.f = sVar2;
            sVar2.f21171e = sVar3;
        }
        return sVar;
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f;
        if (sVar3 != null) {
            s sVar4 = sVar3.f21172g;
            sVar2.f = sVar4;
            if (sVar4 != null) {
                sVar4.f21171e = sVar2;
            }
            s sVar5 = sVar2.f21171e;
            sVar3.f21171e = sVar5;
            if (sVar5 == null) {
                sVar3.f21174i = false;
                sVar = sVar3;
            } else if (sVar5.f21172g == sVar2) {
                sVar5.f21172g = sVar3;
            } else {
                sVar5.f = sVar3;
            }
            sVar3.f21172g = sVar2;
            sVar2.f21171e = sVar3;
        }
        return sVar;
    }

    static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(Object obj, int i6) {
        Object obj2;
        Thread thread;
        Thread thread2;
        s sVar = null;
        if (obj != null) {
            l lVar = this.f;
            while (lVar != null) {
                int i10 = this.lockState;
                if ((i10 & 3) == 0) {
                    j$.sun.misc.b bVar = f21167h;
                    long j10 = f21168i;
                    if (bVar.c(this, j10, i10, i10 + 4)) {
                        try {
                            s sVar2 = this.f21169e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i6, obj, null);
                            }
                            if (bVar.f(this, j10) == 6 && (thread2 = this.f21170g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th2) {
                            if (f21167h.f(this, f21168i) == 6 && (thread = this.f21170g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th2;
                        }
                    }
                } else if (lVar.f21152a == i6 && ((obj2 = lVar.f21153b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                } else {
                    lVar = lVar.f21155d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s e(int i6, Object obj, Object obj2) {
        int d10;
        int i10;
        s sVar;
        s sVar2 = this.f21169e;
        Class cls = null;
        boolean z10 = false;
        while (true) {
            if (sVar2 == null) {
                s sVar3 = new s(i6, obj, obj2, null, null);
                this.f21169e = sVar3;
                this.f = sVar3;
                break;
            }
            int i11 = sVar2.f21152a;
            if (i11 > i6) {
                i10 = -1;
            } else if (i11 < i6) {
                i10 = 1;
            } else {
                Object obj3 = sVar2.f21153b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    break;
                } else if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj3)) == 0) {
                    if (!z10) {
                        s sVar4 = sVar2.f;
                        if ((sVar4 == null || (r3 = sVar4.b(i6, obj, cls)) == null) && ((sVar = sVar2.f21172g) == null || (r3 = sVar.b(i6, obj, cls)) == null)) {
                            z10 = true;
                        }
                    }
                    i10 = i(obj, obj3);
                } else {
                    i10 = d10;
                }
            }
            s sVar5 = i10 <= 0 ? sVar2.f : sVar2.f21172g;
            if (sVar5 == null) {
                s sVar6 = this.f;
                s sVar7 = new s(i6, obj, obj2, sVar6, sVar2);
                this.f = sVar7;
                if (sVar6 != null) {
                    sVar6.f21173h = sVar7;
                }
                if (i10 <= 0) {
                    sVar2.f = sVar7;
                } else {
                    sVar2.f21172g = sVar7;
                }
                if (sVar2.f21174i) {
                    d();
                    try {
                        this.f21169e = c(this.f21169e, sVar7);
                    } finally {
                        this.lockState = 0;
                    }
                } else {
                    sVar7.f21174i = true;
                }
            } else {
                sVar2 = sVar5;
            }
        }
        return sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(s sVar) {
        s sVar2;
        s sVar3;
        s sVar4 = (s) sVar.f21155d;
        s sVar5 = sVar.f21173h;
        if (sVar5 == null) {
            this.f = sVar4;
        } else {
            sVar5.f21155d = sVar4;
        }
        if (sVar4 != null) {
            sVar4.f21173h = sVar5;
        }
        if (this.f == null) {
            this.f21169e = null;
            return true;
        }
        s sVar6 = this.f21169e;
        if (sVar6 == null || sVar6.f21172g == null || (sVar2 = sVar6.f) == null || sVar2.f == null) {
            return true;
        }
        d();
        try {
            s sVar7 = sVar.f;
            s sVar8 = sVar.f21172g;
            if (sVar7 == null || sVar8 == null) {
                if (sVar7 == null) {
                    if (sVar8 != null) {
                        sVar7 = sVar8;
                    }
                    sVar7 = sVar;
                }
                if (sVar7 != sVar) {
                    s sVar9 = sVar.f21171e;
                    sVar7.f21171e = sVar9;
                    if (sVar9 == null) {
                        sVar6 = sVar7;
                    } else if (sVar == sVar9.f) {
                        sVar9.f = sVar7;
                    } else {
                        sVar9.f21172g = sVar7;
                    }
                    sVar.f21171e = null;
                    sVar.f21172g = null;
                    sVar.f = null;
                }
                if (!sVar.f21174i) {
                    sVar6 = b(sVar6, sVar7);
                }
                this.f21169e = sVar6;
                if (sVar == sVar7 && (sVar3 = sVar.f21171e) != null) {
                    if (sVar != sVar3.f) {
                        sVar3.f = null;
                    } else if (sVar == sVar3.f21172g) {
                        sVar3.f21172g = null;
                    }
                    sVar.f21171e = null;
                }
                return false;
            }
            s sVar10 = sVar8;
            while (true) {
                s sVar11 = sVar10.f;
                if (sVar11 == null) {
                    break;
                }
                sVar10 = sVar11;
            }
            boolean z10 = sVar10.f21174i;
            sVar10.f21174i = sVar.f21174i;
            sVar.f21174i = z10;
            s sVar12 = sVar10.f21172g;
            s sVar13 = sVar.f21171e;
            if (sVar10 == sVar8) {
                sVar.f21171e = sVar10;
                sVar10.f21172g = sVar;
            } else {
                s sVar14 = sVar10.f21171e;
                sVar.f21171e = sVar14;
                if (sVar14 != null) {
                    if (sVar10 == sVar14.f) {
                        sVar14.f = sVar;
                    } else {
                        sVar14.f21172g = sVar;
                    }
                }
                sVar10.f21172g = sVar8;
                sVar8.f21171e = sVar10;
            }
            sVar.f = null;
            sVar.f21172g = sVar12;
            if (sVar12 != null) {
                sVar12.f21171e = sVar;
            }
            sVar10.f = sVar7;
            sVar7.f21171e = sVar10;
            sVar10.f21171e = sVar13;
            if (sVar13 == null) {
                sVar6 = sVar10;
            } else if (sVar == sVar13.f) {
                sVar13.f = sVar10;
            } else {
                sVar13.f21172g = sVar10;
            }
            if (sVar12 != null) {
                sVar7 = sVar12;
                if (sVar7 != sVar) {
                }
                if (!sVar.f21174i) {
                }
                this.f21169e = sVar6;
                if (sVar == sVar7) {
                    if (sVar != sVar3.f) {
                    }
                    sVar.f21171e = null;
                }
                return false;
            }
            sVar7 = sVar;
            if (sVar7 != sVar) {
            }
            if (!sVar.f21174i) {
            }
            this.f21169e = sVar6;
            if (sVar == sVar7) {
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }
}
