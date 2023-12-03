package n6;

import v.h;
/* compiled from: Easing.java */
/* loaded from: classes.dex */
public final class b {
    public static c a() {
        switch (h.d(4)) {
            case 1:
                return a.f25893b;
            case 2:
                return a.f25894c;
            case 3:
                return a.f25895d;
            case 4:
                return a.f25896e;
            case 5:
                return a.f;
            case 6:
                return a.f25897g;
            case 7:
                return a.f25898h;
            case 8:
                return a.f25899i;
            case 9:
                return a.f25900j;
            case 10:
                return a.f25901k;
            case 11:
                return a.f25902l;
            case 12:
                return a.f25903m;
            case 13:
                return a.f25904n;
            case 14:
                return a.f25905o;
            case 15:
                return a.f25906p;
            case 16:
                return a.f25907q;
            case 17:
                return a.r;
            case 18:
                return a.f25908s;
            case 19:
                return a.f25909t;
            case 20:
                return a.f25910u;
            case 21:
                return a.f25911v;
            case 22:
                return a.f25912w;
            case 23:
                return a.f25913x;
            case 24:
                return a.f25914y;
            case 25:
                return a.f25915z;
            case 26:
                return a.A;
            case 27:
                return a.B;
            default:
                return a.f25892a;
        }
    }

    /* compiled from: Easing.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f25892a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final u f25893b = new u();

        /* renamed from: c  reason: collision with root package name */
        public static final v f25894c = new v();

        /* renamed from: d  reason: collision with root package name */
        public static final w f25895d = new w();

        /* renamed from: e  reason: collision with root package name */
        public static final x f25896e = new x();
        public static final y f = new y();

        /* renamed from: g  reason: collision with root package name */
        public static final z f25897g = new z();

        /* renamed from: h  reason: collision with root package name */
        public static final a0 f25898h = new a0();

        /* renamed from: i  reason: collision with root package name */
        public static final b0 f25899i = new b0();

        /* renamed from: j  reason: collision with root package name */
        public static final C0424a f25900j = new C0424a();

        /* renamed from: k  reason: collision with root package name */
        public static final C0425b f25901k = new C0425b();

        /* renamed from: l  reason: collision with root package name */
        public static final c f25902l = new c();

        /* renamed from: m  reason: collision with root package name */
        public static final d f25903m = new d();

        /* renamed from: n  reason: collision with root package name */
        public static final e f25904n = new e();

        /* renamed from: o  reason: collision with root package name */
        public static final f f25905o = new f();

        /* renamed from: p  reason: collision with root package name */
        public static final g f25906p = new g();

        /* renamed from: q  reason: collision with root package name */
        public static final h f25907q = new h();
        public static final i r = new i();

        /* renamed from: s  reason: collision with root package name */
        public static final j f25908s = new j();

        /* renamed from: t  reason: collision with root package name */
        public static final l f25909t = new l();

        /* renamed from: u  reason: collision with root package name */
        public static final m f25910u = new m();

        /* renamed from: v  reason: collision with root package name */
        public static final n f25911v = new n();

        /* renamed from: w  reason: collision with root package name */
        public static final o f25912w = new o();

        /* renamed from: x  reason: collision with root package name */
        public static final p f25913x = new p();

        /* renamed from: y  reason: collision with root package name */
        public static final q f25914y = new q();

        /* renamed from: z  reason: collision with root package name */
        public static final r f25915z = new r();
        public static final s A = new s();
        public static final t B = new t();

        /* compiled from: Easing.java */
        /* renamed from: n6.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0424a implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    return 0.5f * f2 * f2 * f2 * f2;
                }
                float f10 = f2 - 2.0f;
                return ((((f10 * f10) * f10) * f10) - 2.0f) * (-0.5f);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class a0 implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f;
            }
        }

        /* compiled from: Easing.java */
        /* renamed from: n6.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0425b implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (-((float) Math.cos(f * 1.5707963267948966d))) + 1.0f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class b0 implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return -((((f2 * f2) * f2) * f2) - 1.0f);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class c implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (float) Math.sin(f * 1.5707963267948966d);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class d implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (((float) Math.cos(f * 3.141592653589793d)) - 1.0f) * (-0.5f);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class e implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                return (float) Math.pow(2.0d, (f - 1.0f) * 10.0f);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class f implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                if (f == 1.0f) {
                    return 1.0f;
                }
                return -((float) Math.pow(2.0d, (f + 1.0f) * (-10.0f)));
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class g implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                float f10 = f / 0.5f;
                if (f10 < 1.0f) {
                    f2 = (float) Math.pow(2.0d, (f10 - 1.0f) * 10.0f);
                } else {
                    f2 = (-((float) Math.pow(2.0d, (f10 - 1.0f) * (-10.0f)))) + 2.0f;
                }
                return f2 * 0.5f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class h implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return -(((float) Math.sqrt(1.0f - (f * f))) - 1.0f);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class i implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (float) Math.sqrt(1.0f - (f2 * f2));
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class j implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float sqrt;
                float f2 = 0.5f;
                float f10 = f / 0.5f;
                if (f10 < 1.0f) {
                    sqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) - 1.0f;
                    f2 = -0.5f;
                } else {
                    float f11 = f10 - 2.0f;
                    sqrt = ((float) Math.sqrt(1.0f - (f11 * f11))) + 1.0f;
                }
                return sqrt * f2;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class l implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                float f2 = f - 1.0f;
                return -(((float) Math.pow(2.0d, 10.0f * f2)) * ((float) Math.sin(((f2 - (0.047746483f * ((float) Math.asin(1.0d)))) * 6.283185307179586d) / 0.3f)));
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class m implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                return (((float) Math.pow(2.0d, (-10.0f) * f)) * ((float) Math.sin(((f - (0.047746483f * ((float) Math.asin(1.0d)))) * 6.283185307179586d) / 0.3f))) + 1.0f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class n implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                float f2 = f / 0.5f;
                if (f2 == 2.0f) {
                    return 1.0f;
                }
                float asin = 0.07161973f * ((float) Math.asin(1.0d));
                if (f2 < 1.0f) {
                    float f10 = f2 - 1.0f;
                    return ((float) Math.pow(2.0d, 10.0f * f10)) * ((float) Math.sin((((f10 * 1.0f) - asin) * 6.283185307179586d) / 0.45000002f)) * (-0.5f);
                }
                float f11 = f2 - 1.0f;
                return (((float) Math.pow(2.0d, (-10.0f) * f11)) * ((float) Math.sin((((f11 * 1.0f) - asin) * 6.283185307179586d) / 0.45000002f)) * 0.5f) + 1.0f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class o implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return ((f * 2.70158f) - 1.70158f) * f * f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class p implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (((f2 * 2.70158f) + 1.70158f) * f2 * f2) + 1.0f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class q implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                float f10 = f / 0.5f;
                if (f10 < 1.0f) {
                    f2 = ((3.5949094f * f10) - 2.5949094f) * f10 * f10;
                } else {
                    float f11 = f10 - 2.0f;
                    f2 = (((3.5949094f * f11) + 2.5949094f) * f11 * f11) + 2.0f;
                }
                return f2 * 0.5f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class r implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                float f10;
                float f11;
                float f12 = 1.0f - f;
                if (f12 < 0.36363637f) {
                    f11 = 7.5625f * f12 * f12;
                } else {
                    if (f12 < 0.72727275f) {
                        float f13 = f12 - 0.54545456f;
                        f2 = 7.5625f * f13 * f13;
                        f10 = 0.75f;
                    } else if (f12 < 0.90909094f) {
                        float f14 = f12 - 0.8181818f;
                        f2 = 7.5625f * f14 * f14;
                        f10 = 0.9375f;
                    } else {
                        float f15 = f12 - 0.95454544f;
                        f2 = 7.5625f * f15 * f15;
                        f10 = 0.984375f;
                    }
                    f11 = f2 + f10;
                }
                return 1.0f - f11;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class s implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f2 = f - 0.54545456f;
                    return (7.5625f * f2 * f2) + 0.75f;
                } else if (f < 0.90909094f) {
                    float f10 = f - 0.8181818f;
                    return (7.5625f * f10 * f10) + 0.9375f;
                } else {
                    float f11 = f - 0.95454544f;
                    return (7.5625f * f11 * f11) + 0.984375f;
                }
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class t implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                float f10;
                float f11;
                if (f < 0.5f) {
                    return a.f25915z.getInterpolation(f * 2.0f) * 0.5f;
                }
                float f12 = (f * 2.0f) - 1.0f;
                if (f12 < 0.36363637f) {
                    f11 = 7.5625f * f12 * f12;
                } else {
                    if (f12 < 0.72727275f) {
                        float f13 = f12 - 0.54545456f;
                        f2 = 7.5625f * f13 * f13;
                        f10 = 0.75f;
                    } else if (f12 < 0.90909094f) {
                        float f14 = f12 - 0.8181818f;
                        f2 = 7.5625f * f14 * f14;
                        f10 = 0.9375f;
                    } else {
                        float f15 = f12 - 0.95454544f;
                        f2 = 7.5625f * f15 * f15;
                        f10 = 0.984375f;
                    }
                    f11 = f2 + f10;
                }
                return (f11 * 0.5f) + 0.5f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class u implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class v implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (f - 2.0f) * (-f);
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class w implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                float f10 = f / 0.5f;
                if (f10 < 1.0f) {
                    f2 = 0.5f * f10;
                } else {
                    float f11 = f10 - 1.0f;
                    f2 = ((f11 - 2.0f) * f11) - 1.0f;
                    f10 = -0.5f;
                }
                return f2 * f10;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class x implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class y implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2) + 1.0f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class z implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    return 0.5f * f2 * f2 * f2;
                }
                float f10 = f2 - 2.0f;
                return ((f10 * f10 * f10) + 2.0f) * 0.5f;
            }
        }

        /* compiled from: Easing.java */
        /* loaded from: classes.dex */
        public static class k implements n6.c {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f;
            }
        }
    }
}
