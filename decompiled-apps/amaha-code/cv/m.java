package cv;

import cv.e;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f12071a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends m {

        /* renamed from: b  reason: collision with root package name */
        public static final a f12072b = new a();

        public a() {
            super("must be a member function");
        }

        @Override // cv.e
        public final boolean c(gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.f0() != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends m {

        /* renamed from: b  reason: collision with root package name */
        public static final b f12073b = new b();

        public b() {
            super("must be a member or an extension function");
        }

        @Override // cv.e
        public final boolean c(gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.f0() == null && functionDescriptor.k0() == null) {
                return false;
            }
            return true;
        }
    }

    public m(String str) {
        this.f12071a = str;
    }

    @Override // cv.e
    public final String a() {
        return this.f12071a;
    }

    @Override // cv.e
    public final String b(gt.u uVar) {
        return e.a.a(this, uVar);
    }
}
