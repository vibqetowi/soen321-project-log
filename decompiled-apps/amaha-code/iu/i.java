package iu;

import gt.a1;
import gt.k0;
import gt.l0;
import gt.v;
import gt.x0;
import wu.b0;
import wu.i0;
/* compiled from: inlineClassesUtils.kt */
/* loaded from: classes2.dex */
public final class i {
    static {
        fu.b.l(new fu.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(gt.u uVar) {
        kotlin.jvm.internal.i.g(uVar, "<this>");
        if (uVar instanceof l0) {
            k0 correspondingProperty = ((l0) uVar).E0();
            kotlin.jvm.internal.i.f(correspondingProperty, "correspondingProperty");
            if (d(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(gt.j jVar) {
        kotlin.jvm.internal.i.g(jVar, "<this>");
        if ((jVar instanceof gt.e) && (((gt.e) jVar).B0() instanceof v)) {
            return true;
        }
        return false;
    }

    public static final boolean c(b0 b0Var) {
        gt.g a10 = b0Var.O0().a();
        if (a10 != null) {
            return b(a10);
        }
        return false;
    }

    public static final boolean d(a1 a1Var) {
        gt.e eVar;
        v vVar;
        if (a1Var.k0() == null) {
            gt.j c10 = a1Var.c();
            fu.e eVar2 = null;
            if (c10 instanceof gt.e) {
                eVar = (gt.e) c10;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                int i6 = mu.a.f25746a;
                x0<i0> B0 = eVar.B0();
                if (B0 instanceof v) {
                    vVar = (v) B0;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    eVar2 = vVar.f16821a;
                }
            }
            if (kotlin.jvm.internal.i.b(eVar2, a1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final i0 e(b0 b0Var) {
        v vVar;
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        gt.g a10 = b0Var.O0().a();
        if (!(a10 instanceof gt.e)) {
            a10 = null;
        }
        gt.e eVar = (gt.e) a10;
        if (eVar == null) {
            return null;
        }
        int i6 = mu.a.f25746a;
        x0<i0> B0 = eVar.B0();
        if (B0 instanceof v) {
            vVar = (v) B0;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return (i0) vVar.f16822b;
    }
}
