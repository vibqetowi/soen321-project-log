package nt;

import gt.b1;
import gt.c1;
import java.lang.reflect.Modifier;
/* compiled from: ReflectJavaModifierListOwner.kt */
/* loaded from: classes2.dex */
public interface c0 extends wt.r {

    /* compiled from: ReflectJavaModifierListOwner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c1 a(c0 c0Var) {
            int modifiers = c0Var.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                return b1.h.f16775c;
            }
            if (Modifier.isPrivate(modifiers)) {
                return b1.e.f16772c;
            }
            if (Modifier.isProtected(modifiers)) {
                if (Modifier.isStatic(modifiers)) {
                    return lt.c.f24526c;
                }
                return lt.b.f24525c;
            }
            return lt.a.f24524c;
        }
    }

    int getModifiers();
}
