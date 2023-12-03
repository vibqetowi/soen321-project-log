package androidx.work;

import androidx.work.w;
/* compiled from: OneTimeWorkRequest.kt */
/* loaded from: classes.dex */
public final class r extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a builder) {
        super(builder.f3354a, builder.f3355b, builder.f3356c);
        kotlin.jvm.internal.i.g(builder, "builder");
    }

    /* compiled from: OneTimeWorkRequest.kt */
    /* loaded from: classes.dex */
    public static final class a extends w.a<a, r> {
        public a(Class<? extends p> cls) {
            super(cls);
            this.f3355b.f34737d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.w.a
        public final r b() {
            return new r(this);
        }

        @Override // androidx.work.w.a
        public final a c() {
            return this;
        }
    }
}
