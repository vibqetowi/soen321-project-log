package com.google.common.util.concurrent;

import com.google.common.collect.u;
import com.google.common.collect.x;
import com.google.common.collect.y;
import com.google.common.collect.z;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class CycleDetectingLockFactory {

    /* loaded from: classes.dex */
    public static final class PotentialDeadlockException extends b {
        @Override // java.lang.Throwable
        public final String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            return new StringBuilder(message).toString();
        }
    }

    /* loaded from: classes.dex */
    public class a extends ThreadLocal<ArrayList<c>> {
        @Override // java.lang.ThreadLocal
        public final ArrayList<c> initialValue() {
            x.a(3, "initialArraySize");
            return new ArrayList<>(3);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IllegalStateException {
        static {
            u.J(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    static {
        boolean z10;
        y yVar = new y();
        z.p.b bVar = z.p.f9512v;
        z.p pVar = yVar.f9475d;
        if (pVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.z(pVar, "Key strength was already set to %s", z10);
        yVar.f9475d = bVar;
        yVar.f9472a = true;
        yVar.b();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new a();
    }
}
