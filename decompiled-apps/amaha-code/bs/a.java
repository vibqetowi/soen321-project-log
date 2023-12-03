package bs;

import io.grpc.b;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;
/* compiled from: ClientCalls.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b.C0308b<EnumC0093a> f4670a;

    /* compiled from: ClientCalls.java */
    /* renamed from: bs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0093a {
        /* JADX INFO: Fake field, exist only in values array */
        BLOCKING,
        /* JADX INFO: Fake field, exist only in values array */
        FUTURE,
        ASYNC
    }

    static {
        Logger.getLogger(a.class.getName());
        if (!h.K(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f4670a = new b.C0308b<>("internal-stub-type");
    }
}
