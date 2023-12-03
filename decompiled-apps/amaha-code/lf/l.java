package lf;

import com.google.protobuf.y;
/* compiled from: SessionVerbosity.java */
/* loaded from: classes.dex */
public enum l implements y.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: u  reason: collision with root package name */
    public final int f24256u;

    /* compiled from: SessionVerbosity.java */
    /* loaded from: classes.dex */
    public static final class a implements y.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24257a = new a();

        @Override // com.google.protobuf.y.b
        public final boolean a(int i6) {
            l lVar;
            if (i6 != 0) {
                if (i6 != 1) {
                    lVar = null;
                } else {
                    lVar = l.GAUGES_AND_SYSTEM_EVENTS;
                }
            } else {
                lVar = l.SESSION_VERBOSITY_NONE;
            }
            if (lVar != null) {
                return true;
            }
            return false;
        }
    }

    l(int i6) {
        this.f24256u = i6;
    }

    @Override // com.google.protobuf.y.a
    public final int e() {
        return this.f24256u;
    }
}
