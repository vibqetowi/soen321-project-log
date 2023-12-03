package ke;

import com.google.protobuf.l1;
/* compiled from: ServerTimestamps.java */
/* loaded from: classes.dex */
public final class q {
    public static l1 a(rf.s sVar) {
        return sVar.e0().R("__local_write_time__").h0();
    }

    public static rf.s b(rf.s sVar) {
        rf.s Q = sVar.e0().Q("__previous_value__");
        if (c(Q)) {
            return b(Q);
        }
        return Q;
    }

    public static boolean c(rf.s sVar) {
        rf.s Q;
        if (sVar == null) {
            Q = null;
        } else {
            Q = sVar.e0().Q("__type__");
        }
        if (Q != null && "server_timestamp".equals(Q.g0())) {
            return true;
        }
        return false;
    }
}
