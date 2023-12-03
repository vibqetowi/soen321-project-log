package pt;

import pt.f0;
/* compiled from: JavaTypeEnhancementState.kt */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final y f28965d;

    /* renamed from: a  reason: collision with root package name */
    public final b0 f28966a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<fu.c, h0> f28967b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28968c;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.f implements ss.l<fu.c, h0> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f28969u = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return kotlin.jvm.internal.y.f23470a.c(w.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // ss.l
        public final h0 invoke(fu.c cVar) {
            h0 h0Var;
            fu.c p02 = cVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            fu.c cVar2 = w.f28958a;
            f0.f28900a.getClass();
            g0 configuredReportLevels = f0.a.f28902b;
            hs.c cVar3 = new hs.c(7, 20);
            kotlin.jvm.internal.i.g(configuredReportLevels, "configuredReportLevels");
            h0 h0Var2 = (h0) configuredReportLevels.f28905c.invoke(p02);
            if (h0Var2 == null) {
                g0 g0Var = w.f28959b;
                g0Var.getClass();
                x xVar = (x) g0Var.f28905c.invoke(p02);
                if (xVar == null) {
                    return h0.IGNORE;
                }
                hs.c cVar4 = xVar.f28963b;
                if (cVar4 != null && cVar4.f19463x - cVar3.f19463x <= 0) {
                    h0Var = xVar.f28964c;
                } else {
                    h0Var = xVar.f28962a;
                }
                return h0Var;
            }
            return h0Var2;
        }
    }

    static {
        h0 globalReportLevel;
        h0 h0Var;
        fu.c cVar = w.f28958a;
        hs.c configuredKotlinVersion = hs.c.f19459y;
        kotlin.jvm.internal.i.g(configuredKotlinVersion, "configuredKotlinVersion");
        x xVar = w.f28960c;
        hs.c cVar2 = xVar.f28963b;
        if (cVar2 != null && cVar2.f19463x - configuredKotlinVersion.f19463x <= 0) {
            globalReportLevel = xVar.f28964c;
        } else {
            globalReportLevel = xVar.f28962a;
        }
        kotlin.jvm.internal.i.g(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == h0.WARN) {
            h0Var = null;
        } else {
            h0Var = globalReportLevel;
        }
        f28965d = new y(new b0(globalReportLevel, h0Var), a.f28969u);
    }

    public y(b0 b0Var, a getReportLevelForAnnotation) {
        boolean z10;
        kotlin.jvm.internal.i.g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f28966a = b0Var;
        this.f28967b = getReportLevelForAnnotation;
        if (!b0Var.f28854d && getReportLevelForAnnotation.invoke(w.f28958a) != h0.IGNORE) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f28968c = z10;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f28966a + ", getReportLevelForAnnotation=" + this.f28967b + ')';
    }
}
