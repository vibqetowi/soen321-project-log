package lf;

import com.google.protobuf.y;
/* compiled from: ApplicationProcessState.java */
/* loaded from: classes.dex */
public enum d implements y.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: u  reason: collision with root package name */
    public final int f24238u;

    /* compiled from: ApplicationProcessState.java */
    /* loaded from: classes.dex */
    public static final class a implements y.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24239a = new a();

        @Override // com.google.protobuf.y.b
        public final boolean a(int i6) {
            d dVar;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            dVar = null;
                        } else {
                            dVar = d.FOREGROUND_BACKGROUND;
                        }
                    } else {
                        dVar = d.BACKGROUND;
                    }
                } else {
                    dVar = d.FOREGROUND;
                }
            } else {
                dVar = d.APPLICATION_PROCESS_STATE_UNKNOWN;
            }
            if (dVar != null) {
                return true;
            }
            return false;
        }
    }

    d(int i6) {
        this.f24238u = i6;
    }

    @Override // com.google.protobuf.y.a
    public final int e() {
        return this.f24238u;
    }
}
