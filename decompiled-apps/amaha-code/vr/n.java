package vr;

import java.text.MessageFormat;
import java.util.logging.Level;
import tr.b;
import tr.t;
/* compiled from: ChannelLoggerImpl.java */
/* loaded from: classes2.dex */
public final class n extends tr.b {

    /* renamed from: a  reason: collision with root package name */
    public final o f35772a;

    /* renamed from: b  reason: collision with root package name */
    public final j3 f35773b;

    public n(o oVar, j3 j3Var) {
        this.f35772a = oVar;
        sc.b.w(j3Var, "time");
        this.f35773b = j3Var;
    }

    public static Level c(b.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    @Override // tr.b
    public final void a(b.a aVar, String str) {
        t.a aVar2;
        boolean z10;
        o oVar = this.f35772a;
        tr.w wVar = oVar.f35800b;
        Level c10 = c(aVar);
        if (o.f35798d.isLoggable(c10)) {
            o.a(wVar, c10, str);
        }
        b.a aVar3 = b.a.DEBUG;
        boolean z11 = false;
        if (aVar != aVar3) {
            o oVar2 = this.f35772a;
            synchronized (oVar2.f35799a) {
                if (oVar2.f35801c != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11 && aVar != aVar3) {
            int ordinal = aVar.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    aVar2 = t.a.CT_INFO;
                } else {
                    aVar2 = t.a.CT_ERROR;
                }
            } else {
                aVar2 = t.a.CT_WARNING;
            }
            t.a aVar4 = aVar2;
            Long valueOf = Long.valueOf(this.f35773b.a());
            sc.b.w(str, "description");
            sc.b.w(valueOf, "timestampNanos");
            oVar.c(new tr.t(str, aVar4, valueOf.longValue(), null));
        }
    }

    @Override // tr.b
    public final void b(b.a aVar, String str, Object... objArr) {
        String format;
        boolean z10;
        Level c10 = c(aVar);
        boolean z11 = false;
        if (aVar != b.a.DEBUG) {
            o oVar = this.f35772a;
            synchronized (oVar.f35799a) {
                if (oVar.f35801c != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        if (!z11 && !o.f35798d.isLoggable(c10)) {
            format = null;
        } else {
            format = MessageFormat.format(str, objArr);
        }
        a(aVar, format);
    }
}
