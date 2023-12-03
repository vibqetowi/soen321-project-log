package wr;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: OkHttpFrameLogger.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f37164a;

    /* renamed from: b  reason: collision with root package name */
    public final Level f37165b;

    /* compiled from: OkHttpFrameLogger.java */
    /* loaded from: classes2.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER_TABLE_SIZE(1),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLE_PUSH(2),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_CONCURRENT_STREAMS(4),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_FRAME_SIZE(5),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_HEADER_LIST_SIZE(6),
        /* JADX INFO: Fake field, exist only in values array */
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f37167u;

        a(int i6) {
            this.f37167u = i6;
        }
    }

    public j(Level level) {
        Logger logger = Logger.getLogger(i.class.getName());
        sc.b.w(level, "level");
        this.f37165b = level;
        sc.b.w(logger, "logger");
        this.f37164a = logger;
    }

    public static String h(zv.e eVar) {
        long j10 = eVar.f39885v;
        if (j10 <= 64) {
            return eVar.q0().i();
        }
        int min = (int) Math.min(j10, 64L);
        return eVar.v0(min).i() + "...";
    }

    public final boolean a() {
        return this.f37164a.isLoggable(this.f37165b);
    }

    public final void b(int i6, int i10, zv.e eVar, int i11, boolean z10) {
        if (a()) {
            this.f37164a.log(this.f37165b, pl.a.n(i6) + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + h(eVar));
        }
    }

    public final void c(int i6, int i10, yr.a aVar, zv.i iVar) {
        if (a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pl.a.n(i6));
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i10);
            sb2.append(" errorCode=");
            sb2.append(aVar);
            sb2.append(" length=");
            sb2.append(iVar.h());
            sb2.append(" bytes=");
            zv.e eVar = new zv.e();
            eVar.B0(iVar);
            sb2.append(h(eVar));
            this.f37164a.log(this.f37165b, sb2.toString());
        }
    }

    public final void d(int i6, long j10) {
        if (a()) {
            this.f37164a.log(this.f37165b, pl.a.n(i6) + " PING: ack=false bytes=" + j10);
        }
    }

    public final void e(int i6, int i10, yr.a aVar) {
        if (a()) {
            this.f37164a.log(this.f37165b, pl.a.n(i6) + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar);
        }
    }

    public final void f(int i6, hg.a aVar) {
        a[] values;
        if (a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pl.a.n(i6));
            sb2.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(a.class);
            for (a aVar2 : a.values()) {
                if (aVar.c(aVar2.f37167u)) {
                    enumMap.put((EnumMap) aVar2, (a) Integer.valueOf(((int[]) aVar.f17598d)[aVar2.f37167u]));
                }
            }
            sb2.append(enumMap.toString());
            this.f37164a.log(this.f37165b, sb2.toString());
        }
    }

    public final void g(int i6, int i10, long j10) {
        if (a()) {
            this.f37164a.log(this.f37165b, pl.a.n(i6) + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }
}
