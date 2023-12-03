package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.List;
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class j implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final i f9967a;

    /* renamed from: b  reason: collision with root package name */
    public int f9968b;

    /* renamed from: c  reason: collision with root package name */
    public int f9969c;

    /* renamed from: d  reason: collision with root package name */
    public int f9970d = 0;

    public j(i iVar) {
        Charset charset = y.f10086a;
        if (iVar != null) {
            this.f9967a = iVar;
            iVar.f9940d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public static void y(int i6) {
        if ((i6 & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static void z(int i6) {
        if ((i6 & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.g();
    }

    public final int a() {
        int i6 = this.f9970d;
        if (i6 != 0) {
            this.f9968b = i6;
            this.f9970d = 0;
        } else {
            this.f9968b = this.f9967a.x();
        }
        int i10 = this.f9968b;
        if (i10 != 0 && i10 != this.f9969c) {
            return i10 >>> 3;
        }
        return SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final <T> void b(T t3, g1<T> g1Var, n nVar) {
        int i6 = this.f9969c;
        this.f9969c = ((this.f9968b >>> 3) << 3) | 4;
        try {
            g1Var.e(t3, this, nVar);
            if (this.f9968b == this.f9969c) {
                return;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f9969c = i6;
        }
    }

    public final <T> void c(T t3, g1<T> g1Var, n nVar) {
        i iVar = this.f9967a;
        int y10 = iVar.y();
        if (iVar.f9937a < iVar.f9938b) {
            int h10 = iVar.h(y10);
            iVar.f9937a++;
            g1Var.e(t3, this, nVar);
            iVar.a(0);
            iVar.f9937a--;
            iVar.g(h10);
            return;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void d(List<Boolean> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof g;
        i iVar = this.f9967a;
        if (z10) {
            g gVar = (g) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        gVar.g(iVar.i());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                gVar.g(iVar.i());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Boolean.valueOf(iVar.i()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Boolean.valueOf(iVar.i()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final h e() {
        w(2);
        return this.f9967a.j();
    }

    public final void f(List<h> list) {
        int x10;
        if ((this.f9968b & 7) == 2) {
            do {
                list.add(e());
                i iVar = this.f9967a;
                if (iVar.e()) {
                    return;
                }
                x10 = iVar.x();
            } while (x10 == this.f9968b);
            this.f9970d = x10;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void g(List<Double> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof l;
        i iVar = this.f9967a;
        if (z10) {
            l lVar = (l) list;
            int i6 = this.f9968b & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int y10 = iVar.y();
                    z(y10);
                    int d10 = iVar.d() + y10;
                    do {
                        lVar.g(iVar.k());
                    } while (iVar.d() < d10);
                    return;
                }
                int i10 = InvalidProtocolBufferException.f9872w;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                lVar.g(iVar.k());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i11 = this.f9968b & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int y11 = iVar.y();
                z(y11);
                int d11 = iVar.d() + y11;
                do {
                    list.add(Double.valueOf(iVar.k()));
                } while (iVar.d() < d11);
                return;
            }
            int i12 = InvalidProtocolBufferException.f9872w;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            list.add(Double.valueOf(iVar.k()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void h(List<Integer> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof x;
        i iVar = this.f9967a;
        if (z10) {
            x xVar = (x) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        xVar.g(iVar.l());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                xVar.g(iVar.l());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Integer.valueOf(iVar.l()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(iVar.l()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final Object i(s1 s1Var, Class<?> cls, n nVar) {
        int ordinal = s1Var.ordinal();
        i iVar = this.f9967a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(iVar.k());
            case 1:
                w(5);
                return Float.valueOf(iVar.o());
            case 2:
                w(0);
                return Long.valueOf(iVar.q());
            case 3:
                w(0);
                return Long.valueOf(iVar.z());
            case 4:
                w(0);
                return Integer.valueOf(iVar.p());
            case 5:
                w(1);
                return Long.valueOf(iVar.n());
            case 6:
                w(5);
                return Integer.valueOf(iVar.m());
            case 7:
                w(0);
                return Boolean.valueOf(iVar.i());
            case 8:
                w(2);
                return iVar.w();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                g1 a10 = b1.f9887c.a(cls);
                Object i6 = a10.i();
                c(i6, a10, nVar);
                a10.c(i6);
                return i6;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(iVar.y());
            case 13:
                w(0);
                return Integer.valueOf(iVar.l());
            case 14:
                w(5);
                return Integer.valueOf(iVar.r());
            case 15:
                w(1);
                return Long.valueOf(iVar.s());
            case 16:
                w(0);
                return Integer.valueOf(iVar.t());
            case 17:
                w(0);
                return Long.valueOf(iVar.u());
        }
    }

    public final void j(List<Integer> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof x;
        i iVar = this.f9967a;
        if (z10) {
            x xVar = (x) list;
            int i6 = this.f9968b & 7;
            if (i6 != 2) {
                if (i6 == 5) {
                    do {
                        xVar.g(iVar.m());
                        if (iVar.e()) {
                            return;
                        }
                        x11 = iVar.x();
                    } while (x11 == this.f9968b);
                    this.f9970d = x11;
                    return;
                }
                int i10 = InvalidProtocolBufferException.f9872w;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int y10 = iVar.y();
            y(y10);
            int d10 = iVar.d() + y10;
            do {
                xVar.g(iVar.m());
            } while (iVar.d() < d10);
            return;
        }
        int i11 = this.f9968b & 7;
        if (i11 != 2) {
            if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(iVar.m()));
                    if (iVar.e()) {
                        return;
                    }
                    x10 = iVar.x();
                } while (x10 == this.f9968b);
                this.f9970d = x10;
                return;
            }
            int i12 = InvalidProtocolBufferException.f9872w;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int y11 = iVar.y();
        y(y11);
        int d11 = iVar.d() + y11;
        do {
            list.add(Integer.valueOf(iVar.m()));
        } while (iVar.d() < d11);
    }

    public final void k(List<Long> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof h0;
        i iVar = this.f9967a;
        if (z10) {
            h0 h0Var = (h0) list;
            int i6 = this.f9968b & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int y10 = iVar.y();
                    z(y10);
                    int d10 = iVar.d() + y10;
                    do {
                        h0Var.g(iVar.n());
                    } while (iVar.d() < d10);
                    return;
                }
                int i10 = InvalidProtocolBufferException.f9872w;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                h0Var.g(iVar.n());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i11 = this.f9968b & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int y11 = iVar.y();
                z(y11);
                int d11 = iVar.d() + y11;
                do {
                    list.add(Long.valueOf(iVar.n()));
                } while (iVar.d() < d11);
                return;
            }
            int i12 = InvalidProtocolBufferException.f9872w;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            list.add(Long.valueOf(iVar.n()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void l(List<Float> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof t;
        i iVar = this.f9967a;
        if (z10) {
            t tVar = (t) list;
            int i6 = this.f9968b & 7;
            if (i6 != 2) {
                if (i6 == 5) {
                    do {
                        tVar.g(iVar.o());
                        if (iVar.e()) {
                            return;
                        }
                        x11 = iVar.x();
                    } while (x11 == this.f9968b);
                    this.f9970d = x11;
                    return;
                }
                int i10 = InvalidProtocolBufferException.f9872w;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int y10 = iVar.y();
            y(y10);
            int d10 = iVar.d() + y10;
            do {
                tVar.g(iVar.o());
            } while (iVar.d() < d10);
            return;
        }
        int i11 = this.f9968b & 7;
        if (i11 != 2) {
            if (i11 == 5) {
                do {
                    list.add(Float.valueOf(iVar.o()));
                    if (iVar.e()) {
                        return;
                    }
                    x10 = iVar.x();
                } while (x10 == this.f9968b);
                this.f9970d = x10;
                return;
            }
            int i12 = InvalidProtocolBufferException.f9872w;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int y11 = iVar.y();
        y(y11);
        int d11 = iVar.d() + y11;
        do {
            list.add(Float.valueOf(iVar.o()));
        } while (iVar.d() < d11);
    }

    public final void m(List<Integer> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof x;
        i iVar = this.f9967a;
        if (z10) {
            x xVar = (x) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        xVar.g(iVar.p());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                xVar.g(iVar.p());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Integer.valueOf(iVar.p()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(iVar.p()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void n(List<Long> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof h0;
        i iVar = this.f9967a;
        if (z10) {
            h0 h0Var = (h0) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        h0Var.g(iVar.q());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                h0Var.g(iVar.q());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Long.valueOf(iVar.q()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(iVar.q()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void o(List<Integer> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof x;
        i iVar = this.f9967a;
        if (z10) {
            x xVar = (x) list;
            int i6 = this.f9968b & 7;
            if (i6 != 2) {
                if (i6 == 5) {
                    do {
                        xVar.g(iVar.r());
                        if (iVar.e()) {
                            return;
                        }
                        x11 = iVar.x();
                    } while (x11 == this.f9968b);
                    this.f9970d = x11;
                    return;
                }
                int i10 = InvalidProtocolBufferException.f9872w;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int y10 = iVar.y();
            y(y10);
            int d10 = iVar.d() + y10;
            do {
                xVar.g(iVar.r());
            } while (iVar.d() < d10);
            return;
        }
        int i11 = this.f9968b & 7;
        if (i11 != 2) {
            if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(iVar.r()));
                    if (iVar.e()) {
                        return;
                    }
                    x10 = iVar.x();
                } while (x10 == this.f9968b);
                this.f9970d = x10;
                return;
            }
            int i12 = InvalidProtocolBufferException.f9872w;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int y11 = iVar.y();
        y(y11);
        int d11 = iVar.d() + y11;
        do {
            list.add(Integer.valueOf(iVar.r()));
        } while (iVar.d() < d11);
    }

    public final void p(List<Long> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof h0;
        i iVar = this.f9967a;
        if (z10) {
            h0 h0Var = (h0) list;
            int i6 = this.f9968b & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int y10 = iVar.y();
                    z(y10);
                    int d10 = iVar.d() + y10;
                    do {
                        h0Var.g(iVar.s());
                    } while (iVar.d() < d10);
                    return;
                }
                int i10 = InvalidProtocolBufferException.f9872w;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                h0Var.g(iVar.s());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i11 = this.f9968b & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int y11 = iVar.y();
                z(y11);
                int d11 = iVar.d() + y11;
                do {
                    list.add(Long.valueOf(iVar.s()));
                } while (iVar.d() < d11);
                return;
            }
            int i12 = InvalidProtocolBufferException.f9872w;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            list.add(Long.valueOf(iVar.s()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void q(List<Integer> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof x;
        i iVar = this.f9967a;
        if (z10) {
            x xVar = (x) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        xVar.g(iVar.t());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                xVar.g(iVar.t());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Integer.valueOf(iVar.t()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(iVar.t()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void r(List<Long> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof h0;
        i iVar = this.f9967a;
        if (z10) {
            h0 h0Var = (h0) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        h0Var.g(iVar.u());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                h0Var.g(iVar.u());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Long.valueOf(iVar.u()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(iVar.u()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void s(List<String> list, boolean z10) {
        String v10;
        int x10;
        int x11;
        if ((this.f9968b & 7) == 2) {
            boolean z11 = list instanceof f0;
            i iVar = this.f9967a;
            if (z11 && !z10) {
                f0 f0Var = (f0) list;
                do {
                    f0Var.B(e());
                    if (iVar.e()) {
                        return;
                    }
                    x11 = iVar.x();
                } while (x11 == this.f9968b);
                this.f9970d = x11;
                return;
            }
            do {
                if (z10) {
                    w(2);
                    v10 = iVar.w();
                } else {
                    w(2);
                    v10 = iVar.v();
                }
                list.add(v10);
                if (iVar.e()) {
                    return;
                }
                x10 = iVar.x();
            } while (x10 == this.f9968b);
            this.f9970d = x10;
            return;
        }
        int i6 = InvalidProtocolBufferException.f9872w;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final void t(List<Integer> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof x;
        i iVar = this.f9967a;
        if (z10) {
            x xVar = (x) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        xVar.g(iVar.y());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                xVar.g(iVar.y());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Integer.valueOf(iVar.y()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(iVar.y()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void u(List<Long> list) {
        int x10;
        int x11;
        boolean z10 = list instanceof h0;
        i iVar = this.f9967a;
        if (z10) {
            h0 h0Var = (h0) list;
            int i6 = this.f9968b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int d10 = iVar.d() + iVar.y();
                    do {
                        h0Var.g(iVar.z());
                    } while (iVar.d() < d10);
                    v(d10);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                h0Var.g(iVar.z());
                if (iVar.e()) {
                    return;
                }
                x11 = iVar.x();
            } while (x11 == this.f9968b);
            this.f9970d = x11;
            return;
        }
        int i10 = this.f9968b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int d11 = iVar.d() + iVar.y();
                do {
                    list.add(Long.valueOf(iVar.z()));
                } while (iVar.d() < d11);
                v(d11);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(iVar.z()));
            if (iVar.e()) {
                return;
            }
            x10 = iVar.x();
        } while (x10 == this.f9968b);
        this.f9970d = x10;
    }

    public final void v(int i6) {
        if (this.f9967a.d() == i6) {
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    public final void w(int i6) {
        if ((this.f9968b & 7) == i6) {
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public final boolean x() {
        int i6;
        i iVar = this.f9967a;
        if (!iVar.e() && (i6 = this.f9968b) != this.f9969c) {
            return iVar.A(i6);
        }
        return false;
    }
}
