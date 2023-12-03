package u3;

import hs.k;
import java.util.ArrayList;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;
/* compiled from: Storage.kt */
/* loaded from: classes.dex */
public interface g {

    /* compiled from: Storage.kt */
    /* loaded from: classes.dex */
    public enum a {
        LAST_EVENT_ID("last_event_id"),
        PREVIOUS_SESSION_ID("previous_session_id"),
        LAST_EVENT_TIME("last_event_time"),
        /* JADX INFO: Fake field, exist only in values array */
        OPT_OUT("opt_out"),
        /* JADX INFO: Fake field, exist only in values array */
        Events("events");
        

        /* renamed from: u  reason: collision with root package name */
        public final String f33792u;

        a(String str) {
            this.f33792u = str;
        }
    }

    ArrayList a();

    k b(a aVar, String str);

    y3.h c(w3.f fVar, e eVar, d0 d0Var, a0 a0Var, Object obj, String str);

    Object f(ls.d<? super k> dVar);

    Object g(Object obj, w3.d dVar);

    Object h(v3.a aVar, ls.d<? super k> dVar);

    String j(a aVar);
}
