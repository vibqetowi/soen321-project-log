package cv;

import cv.e;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class v implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f12114a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends v {

        /* renamed from: b  reason: collision with root package name */
        public final int f12115b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i6) {
            super(r0.toString());
            String str;
            StringBuilder u10 = defpackage.c.u("must have at least ", i6, " value parameter");
            if (i6 > 1) {
                str = "s";
            } else {
                str = "";
            }
            u10.append(str);
            this.f12115b = i6;
        }

        @Override // cv.e
        public final boolean c(gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.i().size() >= this.f12115b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends v {

        /* renamed from: b  reason: collision with root package name */
        public final int f12116b;

        public b() {
            super("must have exactly 2 value parameters");
            this.f12116b = 2;
        }

        @Override // cv.e
        public final boolean c(gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.i().size() == this.f12116b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends v {

        /* renamed from: b  reason: collision with root package name */
        public static final c f12117b = new c();

        public c() {
            super("must have no value parameters");
        }

        @Override // cv.e
        public final boolean c(gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class d extends v {

        /* renamed from: b  reason: collision with root package name */
        public static final d f12118b = new d();

        public d() {
            super("must have a single value parameter");
        }

        @Override // cv.e
        public final boolean c(gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.i().size() == 1) {
                return true;
            }
            return false;
        }
    }

    public v(String str) {
        this.f12114a = str;
    }

    @Override // cv.e
    public final String a() {
        return this.f12114a;
    }

    @Override // cv.e
    public final String b(gt.u uVar) {
        return e.a.a(this, uVar);
    }
}
