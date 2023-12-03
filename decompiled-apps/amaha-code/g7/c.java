package g7;
/* compiled from: LogEventDropped.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f16363a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16364b;

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes.dex */
    public enum a implements de.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f16370u;

        a(int i6) {
            this.f16370u = i6;
        }

        @Override // de.c
        public final int e() {
            return this.f16370u;
        }
    }

    public c(long j10, a aVar) {
        this.f16363a = j10;
        this.f16364b = aVar;
    }
}
