package su;

import gt.b;
import gt.p;
/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes2.dex */
public final class h0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32020a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f32021b;

        static {
            int[] iArr = new int[au.i.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32020a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[au.w.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f32021b = iArr3;
        }
    }

    public static final gt.o a(au.w wVar) {
        int i6;
        if (wVar == null) {
            i6 = -1;
        } else {
            i6 = a.f32021b[wVar.ordinal()];
        }
        switch (i6) {
            case 1:
                p.g INTERNAL = gt.p.f16803d;
                kotlin.jvm.internal.i.f(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                p.d PRIVATE = gt.p.f16800a;
                kotlin.jvm.internal.i.f(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                p.e PRIVATE_TO_THIS = gt.p.f16801b;
                kotlin.jvm.internal.i.f(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                p.f PROTECTED = gt.p.f16802c;
                kotlin.jvm.internal.i.f(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                p.h PUBLIC = gt.p.f16804e;
                kotlin.jvm.internal.i.f(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                p.i LOCAL = gt.p.f;
                kotlin.jvm.internal.i.f(LOCAL, "LOCAL");
                return LOCAL;
            default:
                p.d PRIVATE2 = gt.p.f16800a;
                kotlin.jvm.internal.i.f(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final b.a b(au.i iVar) {
        int i6;
        if (iVar == null) {
            i6 = -1;
        } else {
            i6 = a.f32020a[iVar.ordinal()];
        }
        b.a aVar = b.a.DECLARATION;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        return b.a.SYNTHESIZED;
                    }
                    return aVar;
                }
                return b.a.DELEGATION;
            }
            return b.a.FAKE_OVERRIDE;
        }
        return aVar;
    }
}
