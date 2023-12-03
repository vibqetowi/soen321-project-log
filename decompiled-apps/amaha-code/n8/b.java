package n8;

import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
/* compiled from: SpliceCommand.java */
/* loaded from: classes.dex */
public abstract class b implements a.b {
    @Override // g8.a.b
    public final /* synthetic */ n C() {
        return null;
    }

    @Override // g8.a.b
    public final /* synthetic */ byte[] c0() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        if (simpleName.length() != 0) {
            return "SCTE-35 splice command: type=".concat(simpleName);
        }
        return new String("SCTE-35 splice command: type=");
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
