package je;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements oe.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21834a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f21835b;

    public /* synthetic */ h0(int i6, ArrayList arrayList) {
        this.f21834a = i6;
        this.f21835b = arrayList;
    }

    @Override // oe.d
    public final void accept(Object obj) {
        int i6 = this.f21834a;
        List list = this.f21835b;
        switch (i6) {
            case 0:
                list.add(new ke.i(ke.p.u(((Cursor) obj).getString(0))));
                return;
            case 1:
                list.add(((Cursor) obj).getString(0));
                return;
            default:
                list.add(ca.a.O(((Cursor) obj).getString(0)));
                return;
        }
    }
}
