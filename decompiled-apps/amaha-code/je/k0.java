package je;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import je.s0;
import je.y0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements oe.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21860b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f21861c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f21862d;

    public /* synthetic */ k0(int i6, Object obj, Object obj2, Object obj3) {
        this.f21859a = i6;
        this.f21860b = obj;
        this.f21861c = obj2;
        this.f21862d = obj3;
    }

    @Override // oe.d
    public final void accept(Object obj) {
        boolean z10;
        int i6 = this.f21859a;
        Object obj2 = this.f21862d;
        Object obj3 = this.f21861c;
        Object obj4 = this.f21860b;
        switch (i6) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((SortedSet) obj4).add(new ie.a(((ke.l) obj3).d(), (ke.i) obj2, cursor.getBlob(0), cursor.getBlob(1)));
                return;
            case 1:
                o0 o0Var = (o0) obj4;
                int[] iArr = (int[]) obj3;
                List list = (List) obj2;
                o0Var.getClass();
                ke.i iVar = new ke.i(ca.a.O(((Cursor) obj).getString(0)));
                boolean d10 = o0Var.f21890y.d(iVar);
                s0 s0Var = o0Var.f21886u;
                ke.p pVar = iVar.f23275u;
                if (d10) {
                    z10 = true;
                } else {
                    s0.d G = s0Var.G("SELECT 1 FROM document_mutations WHERE path = ?");
                    G.a(ca.a.R(pVar));
                    Cursor e10 = G.e();
                    try {
                        boolean z11 = !e10.moveToFirst();
                        e10.close();
                        z10 = !z11;
                    } catch (Throwable th2) {
                        if (e10 != null) {
                            try {
                                e10.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                if (!z10) {
                    iArr[0] = iArr[0] + 1;
                    list.add(iVar);
                    s0Var.F("DELETE FROM target_documents WHERE path = ? AND target_id = 0", ca.a.R(pVar));
                    return;
                }
                return;
            case 2:
                q0 q0Var = (q0) obj4;
                Set set = (Set) obj3;
                List list2 = (List) obj2;
                Cursor cursor2 = (Cursor) obj;
                q0Var.getClass();
                int i10 = cursor2.getInt(0);
                if (!set.contains(Integer.valueOf(i10))) {
                    set.add(Integer.valueOf(i10));
                    list2.add(q0Var.k(cursor2.getBlob(1), i10));
                    return;
                }
                return;
            case 3:
                ((u0) obj4).i((Cursor) obj, (oe.c) obj3, null, (Map) obj2);
                return;
            case 4:
                y0 y0Var = (y0) obj4;
                he.d0 d0Var = (he.d0) obj3;
                y0.b bVar = (y0.b) obj2;
                y0Var.getClass();
                try {
                    b1 d11 = y0Var.f21972b.d(me.c.d0(((Cursor) obj).getBlob(0)));
                    if (d0Var.equals(d11.f21796a)) {
                        bVar.f21977a = d11;
                        return;
                    }
                    return;
                } catch (InvalidProtocolBufferException e11) {
                    ca.a.V("TargetData failed to parse: %s", e11);
                    throw null;
                }
            default:
                y0 y0Var2 = (y0) obj4;
                int[] iArr2 = (int[]) obj2;
                y0Var2.getClass();
                int i11 = ((Cursor) obj).getInt(0);
                if (((SparseArray) obj3).get(i11) == null) {
                    Object[] objArr = {Integer.valueOf(i11)};
                    s0 s0Var2 = y0Var2.f21971a;
                    s0Var2.F("DELETE FROM target_documents WHERE target_id = ?", objArr);
                    s0Var2.F("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i11));
                    y0Var2.f--;
                    iArr2[0] = iArr2[0] + 1;
                    return;
                }
                return;
        }
    }
}
