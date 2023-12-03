package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k0  reason: invalid package */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f7927a;

    /* renamed from: b  reason: collision with root package name */
    public int f7928b;

    /* renamed from: c  reason: collision with root package name */
    public int f7929c;

    /* renamed from: d  reason: collision with root package name */
    public int f7930d = 0;

    public k0(j0 j0Var) {
        Charset charset = i1.f7886a;
        this.f7927a = j0Var;
        j0Var.f7901b = this;
    }

    public static final void r(int i6) {
        if ((i6 & 3) == 0) {
            return;
        }
        throw zzadn.d();
    }

    public static final void s(int i6) {
        if ((i6 & 7) == 0) {
            return;
        }
        throw zzadn.d();
    }

    public final void A(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof f1;
        j0 j0Var = this.f7927a;
        if (z10) {
            f1 f1Var = (f1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        f1Var.g(((i0) j0Var).i());
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                f1Var.g(((i0) j0Var).i());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Integer.valueOf(((i0) j0Var).i()));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Integer.valueOf(((i0) j0Var).i()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void B(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof f1;
        j0 j0Var = this.f7927a;
        if (z10) {
            f1 f1Var = (f1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 2) {
                if (i6 == 5) {
                    do {
                        f1Var.g(((i0) j0Var).h());
                        if (j0Var.c()) {
                            return;
                        }
                        b11 = j0Var.b();
                    } while (b11 == this.f7928b);
                    this.f7930d = b11;
                    return;
                }
                throw zzadn.a();
            }
            int i10 = ((i0) j0Var).i();
            r(i10);
            int i11 = ((i0) j0Var).f + i10;
            do {
                f1Var.g(((i0) j0Var).h());
            } while (((i0) j0Var).f < i11);
            return;
        }
        int i12 = this.f7928b & 7;
        if (i12 != 2) {
            if (i12 == 5) {
                do {
                    list.add(Integer.valueOf(((i0) j0Var).h()));
                    if (j0Var.c()) {
                        return;
                    }
                    b10 = j0Var.b();
                } while (b10 == this.f7928b);
                this.f7930d = b10;
                return;
            }
            throw zzadn.a();
        }
        int i13 = ((i0) j0Var).i();
        r(i13);
        int i14 = ((i0) j0Var).f + i13;
        do {
            list.add(Integer.valueOf(((i0) j0Var).h()));
        } while (((i0) j0Var).f < i14);
    }

    public final void a(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof q1;
        j0 j0Var = this.f7927a;
        if (z10) {
            q1 q1Var = (q1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).i();
                    s(i10);
                    int i11 = ((i0) j0Var).f + i10;
                    do {
                        q1Var.g(((i0) j0Var).j());
                    } while (((i0) j0Var).f < i11);
                    return;
                }
                throw zzadn.a();
            }
            do {
                q1Var.g(((i0) j0Var).j());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i12 = this.f7928b & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int i13 = ((i0) j0Var).i();
                s(i13);
                int i14 = ((i0) j0Var).f + i13;
                do {
                    list.add(Long.valueOf(((i0) j0Var).j()));
                } while (((i0) j0Var).f < i14);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Long.valueOf(((i0) j0Var).j()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void b(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof y0;
        j0 j0Var = this.f7927a;
        if (z10) {
            y0 y0Var = (y0) list;
            int i6 = this.f7928b & 7;
            if (i6 != 2) {
                if (i6 == 5) {
                    do {
                        y0Var.g(Float.intBitsToFloat(((i0) j0Var).h()));
                        if (j0Var.c()) {
                            return;
                        }
                        b11 = j0Var.b();
                    } while (b11 == this.f7928b);
                    this.f7930d = b11;
                    return;
                }
                throw zzadn.a();
            }
            int i10 = ((i0) j0Var).i();
            r(i10);
            int i11 = ((i0) j0Var).f + i10;
            do {
                y0Var.g(Float.intBitsToFloat(((i0) j0Var).h()));
            } while (((i0) j0Var).f < i11);
            return;
        }
        int i12 = this.f7928b & 7;
        if (i12 != 2) {
            if (i12 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((i0) j0Var).h())));
                    if (j0Var.c()) {
                        return;
                    }
                    b10 = j0Var.b();
                } while (b10 == this.f7928b);
                this.f7930d = b10;
                return;
            }
            throw zzadn.a();
        }
        int i13 = ((i0) j0Var).i();
        r(i13);
        int i14 = ((i0) j0Var).f + i13;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((i0) j0Var).h())));
        } while (((i0) j0Var).f < i14);
    }

    @Deprecated
    public final void c(List list, m2 m2Var, r0 r0Var) {
        int b10;
        int i6 = this.f7928b;
        if ((i6 & 7) == 3) {
            do {
                e1 d10 = m2Var.d();
                n(d10, m2Var, r0Var);
                m2Var.a(d10);
                list.add(d10);
                j0 j0Var = this.f7927a;
                if (!j0Var.c() && this.f7930d == 0) {
                    b10 = j0Var.b();
                } else {
                    return;
                }
            } while (b10 == i6);
            this.f7930d = b10;
            return;
        }
        int i10 = zzadn.f8297u;
        throw new zzadm();
    }

    public final void d(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof f1;
        j0 j0Var = this.f7927a;
        if (z10) {
            f1 f1Var = (f1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        f1Var.g(((i0) j0Var).i());
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                f1Var.g(((i0) j0Var).i());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Integer.valueOf(((i0) j0Var).i()));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Integer.valueOf(((i0) j0Var).i()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void e(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof q1;
        j0 j0Var = this.f7927a;
        if (z10) {
            q1 q1Var = (q1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        q1Var.g(((i0) j0Var).k());
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                q1Var.g(((i0) j0Var).k());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Long.valueOf(((i0) j0Var).k()));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Long.valueOf(((i0) j0Var).k()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void f(List list, m2 m2Var, r0 r0Var) {
        int b10;
        int i6 = this.f7928b;
        if ((i6 & 7) == 2) {
            do {
                e1 d10 = m2Var.d();
                o(d10, m2Var, r0Var);
                m2Var.a(d10);
                list.add(d10);
                j0 j0Var = this.f7927a;
                if (!j0Var.c() && this.f7930d == 0) {
                    b10 = j0Var.b();
                } else {
                    return;
                }
            } while (b10 == i6);
            this.f7930d = b10;
            return;
        }
        int i10 = zzadn.f8297u;
        throw new zzadm();
    }

    public final void g(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof f1;
        j0 j0Var = this.f7927a;
        if (z10) {
            f1 f1Var = (f1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 2) {
                if (i6 == 5) {
                    do {
                        f1Var.g(((i0) j0Var).h());
                        if (j0Var.c()) {
                            return;
                        }
                        b11 = j0Var.b();
                    } while (b11 == this.f7928b);
                    this.f7930d = b11;
                    return;
                }
                throw zzadn.a();
            }
            int i10 = ((i0) j0Var).i();
            r(i10);
            int i11 = ((i0) j0Var).f + i10;
            do {
                f1Var.g(((i0) j0Var).h());
            } while (((i0) j0Var).f < i11);
            return;
        }
        int i12 = this.f7928b & 7;
        if (i12 != 2) {
            if (i12 == 5) {
                do {
                    list.add(Integer.valueOf(((i0) j0Var).h()));
                    if (j0Var.c()) {
                        return;
                    }
                    b10 = j0Var.b();
                } while (b10 == this.f7928b);
                this.f7930d = b10;
                return;
            }
            throw zzadn.a();
        }
        int i13 = ((i0) j0Var).i();
        r(i13);
        int i14 = ((i0) j0Var).f + i13;
        do {
            list.add(Integer.valueOf(((i0) j0Var).h()));
        } while (((i0) j0Var).f < i14);
    }

    public final void h(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof q1;
        j0 j0Var = this.f7927a;
        if (z10) {
            q1 q1Var = (q1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).i();
                    s(i10);
                    int i11 = ((i0) j0Var).f + i10;
                    do {
                        q1Var.g(((i0) j0Var).j());
                    } while (((i0) j0Var).f < i11);
                    return;
                }
                throw zzadn.a();
            }
            do {
                q1Var.g(((i0) j0Var).j());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i12 = this.f7928b & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int i13 = ((i0) j0Var).i();
                s(i13);
                int i14 = ((i0) j0Var).f + i13;
                do {
                    list.add(Long.valueOf(((i0) j0Var).j()));
                } while (((i0) j0Var).f < i14);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Long.valueOf(((i0) j0Var).j()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void i(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof f1;
        j0 j0Var = this.f7927a;
        if (z10) {
            f1 f1Var = (f1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        f1Var.g(j0.f(((i0) j0Var).i()));
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                f1Var.g(j0.f(((i0) j0Var).i()));
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Integer.valueOf(j0.f(((i0) j0Var).i())));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Integer.valueOf(j0.f(((i0) j0Var).i())));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void j(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof q1;
        j0 j0Var = this.f7927a;
        if (z10) {
            q1 q1Var = (q1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        q1Var.g(j0.g(((i0) j0Var).k()));
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                q1Var.g(j0.g(((i0) j0Var).k()));
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Long.valueOf(j0.g(((i0) j0Var).k())));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Long.valueOf(j0.g(((i0) j0Var).k())));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void k(List list, boolean z10) {
        String v10;
        int b10;
        int b11;
        if ((this.f7928b & 7) == 2) {
            boolean z11 = list instanceof m1;
            j0 j0Var = this.f7927a;
            if (z11 && !z10) {
                m1 m1Var = (m1) list;
                do {
                    m1Var.e0(u());
                    if (j0Var.c()) {
                        return;
                    }
                    b11 = j0Var.b();
                } while (b11 == this.f7928b);
                this.f7930d = b11;
                return;
            }
            do {
                if (z10) {
                    v10 = w();
                } else {
                    v10 = v();
                }
                list.add(v10);
                if (j0Var.c()) {
                    return;
                }
                b10 = j0Var.b();
            } while (b10 == this.f7928b);
            this.f7930d = b10;
            return;
        }
        int i6 = zzadn.f8297u;
        throw new zzadm();
    }

    public final void l(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof f1;
        j0 j0Var = this.f7927a;
        if (z10) {
            f1 f1Var = (f1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        f1Var.g(((i0) j0Var).i());
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                f1Var.g(((i0) j0Var).i());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Integer.valueOf(((i0) j0Var).i()));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Integer.valueOf(((i0) j0Var).i()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void m(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof q1;
        j0 j0Var = this.f7927a;
        if (z10) {
            q1 q1Var = (q1) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        q1Var.g(((i0) j0Var).k());
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                q1Var.g(((i0) j0Var).k());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Long.valueOf(((i0) j0Var).k()));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Long.valueOf(((i0) j0Var).k()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void n(Object obj, m2 m2Var, r0 r0Var) {
        int i6 = this.f7929c;
        this.f7929c = ((this.f7928b >>> 3) << 3) | 4;
        try {
            m2Var.h(obj, this, r0Var);
            if (this.f7928b == this.f7929c) {
                return;
            }
            throw zzadn.d();
        } finally {
            this.f7929c = i6;
        }
    }

    public final void o(Object obj, m2 m2Var, r0 r0Var) {
        j0 j0Var = this.f7927a;
        int i6 = ((i0) j0Var).i();
        if (j0Var.f7900a < 100) {
            int a10 = j0Var.a(i6);
            j0Var.f7900a++;
            m2Var.h(obj, this, r0Var);
            i0 i0Var = (i0) j0Var;
            if (i0Var.f7884g == 0) {
                j0Var.f7900a--;
                i0Var.f7885h = a10;
                int i10 = i0Var.f7882d + i0Var.f7883e;
                i0Var.f7882d = i10;
                if (i10 > a10) {
                    int i11 = i10 - a10;
                    i0Var.f7883e = i11;
                    i0Var.f7882d = i10 - i11;
                    return;
                }
                i0Var.f7883e = 0;
                return;
            }
            throw new zzadn("Protocol message end-group tag did not match expected tag.");
        }
        throw new zzadn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void p(int i6) {
        if (((i0) this.f7927a).f == i6) {
            return;
        }
        throw zzadn.e();
    }

    public final void q(int i6) {
        if ((this.f7928b & 7) == i6) {
            return;
        }
        throw zzadn.a();
    }

    public final int t() {
        int i6 = this.f7930d;
        if (i6 != 0) {
            this.f7928b = i6;
            this.f7930d = 0;
        } else {
            i6 = this.f7927a.b();
            this.f7928b = i6;
        }
        if (i6 != 0 && i6 != this.f7929c) {
            return i6 >>> 3;
        }
        return SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final g0 u() {
        q(2);
        i0 i0Var = (i0) this.f7927a;
        int i6 = i0Var.i();
        byte[] bArr = i0Var.f7881c;
        if (i6 > 0) {
            int i10 = i0Var.f7882d;
            int i11 = i0Var.f;
            if (i6 <= i10 - i11) {
                g0 J = h0.J(i11, bArr, i6);
                i0Var.f += i6;
                return J;
            }
        }
        if (i6 != 0) {
            if (i6 > 0) {
                int i12 = i0Var.f7882d;
                int i13 = i0Var.f;
                if (i6 <= i12 - i13) {
                    int i14 = i6 + i13;
                    i0Var.f = i14;
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                    g0 g0Var = h0.f7869v;
                    return new g0(copyOfRange);
                }
            }
            if (i6 <= 0) {
                throw zzadn.c();
            }
            throw zzadn.e();
        }
        return h0.f7869v;
    }

    public final String v() {
        q(2);
        i0 i0Var = (i0) this.f7927a;
        int i6 = i0Var.i();
        if (i6 > 0) {
            int i10 = i0Var.f7882d;
            int i11 = i0Var.f;
            if (i6 <= i10 - i11) {
                String str = new String(i0Var.f7881c, i11, i6, i1.f7886a);
                i0Var.f += i6;
                return str;
            }
        }
        if (i6 == 0) {
            return "";
        }
        if (i6 < 0) {
            throw zzadn.c();
        }
        throw zzadn.e();
    }

    public final String w() {
        q(2);
        i0 i0Var = (i0) this.f7927a;
        int i6 = i0Var.i();
        if (i6 > 0) {
            int i10 = i0Var.f7882d;
            int i11 = i0Var.f;
            if (i6 <= i10 - i11) {
                String d10 = j3.d(i11, i0Var.f7881c, i6);
                i0Var.f += i6;
                return d10;
            }
        }
        if (i6 == 0) {
            return "";
        }
        if (i6 <= 0) {
            throw zzadn.c();
        }
        throw zzadn.e();
    }

    public final void x(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof b0;
        j0 j0Var = this.f7927a;
        if (z10) {
            b0 b0Var = (b0) list;
            int i6 = this.f7928b & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).f + ((i0) j0Var).i();
                    do {
                        b0Var.g(j0Var.d());
                    } while (((i0) j0Var).f < i10);
                    p(i10);
                    return;
                }
                throw zzadn.a();
            }
            do {
                b0Var.g(j0Var.d());
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i11 = this.f7928b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int i12 = ((i0) j0Var).f + ((i0) j0Var).i();
                do {
                    list.add(Boolean.valueOf(j0Var.d()));
                } while (((i0) j0Var).f < i12);
                p(i12);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Boolean.valueOf(j0Var.d()));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }

    public final void y(List list) {
        int b10;
        if ((this.f7928b & 7) == 2) {
            do {
                list.add(u());
                j0 j0Var = this.f7927a;
                if (j0Var.c()) {
                    return;
                }
                b10 = j0Var.b();
            } while (b10 == this.f7928b);
            this.f7930d = b10;
            return;
        }
        int i6 = zzadn.f8297u;
        throw new zzadm();
    }

    public final void z(List list) {
        int b10;
        int b11;
        boolean z10 = list instanceof p0;
        j0 j0Var = this.f7927a;
        if (z10) {
            p0 p0Var = (p0) list;
            int i6 = this.f7928b & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i10 = ((i0) j0Var).i();
                    s(i10);
                    int i11 = ((i0) j0Var).f + i10;
                    do {
                        p0Var.g(Double.longBitsToDouble(((i0) j0Var).j()));
                    } while (((i0) j0Var).f < i11);
                    return;
                }
                throw zzadn.a();
            }
            do {
                p0Var.g(Double.longBitsToDouble(((i0) j0Var).j()));
                if (j0Var.c()) {
                    return;
                }
                b11 = j0Var.b();
            } while (b11 == this.f7928b);
            this.f7930d = b11;
            return;
        }
        int i12 = this.f7928b & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int i13 = ((i0) j0Var).i();
                s(i13);
                int i14 = ((i0) j0Var).f + i13;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((i0) j0Var).j())));
                } while (((i0) j0Var).f < i14);
                return;
            }
            throw zzadn.a();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((i0) j0Var).j())));
            if (j0Var.c()) {
                return;
            }
            b10 = j0Var.b();
        } while (b10 == this.f7928b);
        this.f7930d = b10;
    }
}
