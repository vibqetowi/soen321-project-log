package r7;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: u  reason: collision with root package name */
    public int f30528u;

    public final void j(int i6) {
        this.f30528u = i6 | this.f30528u;
    }

    public final boolean k(int i6) {
        if ((this.f30528u & i6) == i6) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return k(LinearLayoutManager.INVALID_OFFSET);
    }
}
