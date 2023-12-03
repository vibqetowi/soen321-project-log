package je;

import android.database.Cursor;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import je.s0;
/* compiled from: SQLiteDocumentOverlayCache.java */
/* loaded from: classes.dex */
public final class g0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f21827a;

    /* renamed from: b  reason: collision with root package name */
    public final i f21828b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21829c;

    public g0(s0 s0Var, i iVar, ge.e eVar) {
        boolean z10;
        this.f21827a = s0Var;
        this.f21828b = iVar;
        String str = eVar.f16468a;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21829c = z10 ? str : "";
    }

    @Override // je.b
    public final void a(int i6, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            ke.i iVar = (ke.i) entry.getKey();
            le.f fVar = (le.f) entry.getValue();
            Object[] objArr = {iVar};
            if (fVar != null) {
                ke.p pVar = iVar.f23275u;
                String l2 = pVar.l(pVar.p() - 2);
                ke.p pVar2 = iVar.f23275u;
                this.f21827a.F("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f21829c, l2, ca.a.R(pVar2.t()), pVar2.k(), Integer.valueOf(i6), this.f21828b.f21836a.i(fVar).q());
            } else {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
        }
    }

    @Override // je.b
    public final le.j b(ke.i iVar) {
        String R = ca.a.R(iVar.f23275u.t());
        String k10 = iVar.f23275u.k();
        s0.d G = this.f21827a.G("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        G.a(this.f21829c, R, k10);
        return (le.j) G.c(new am.w(4, this));
    }

    @Override // je.b
    public final HashMap c(int i6, int i10, String str) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final oe.c cVar = new oe.c();
        s0 s0Var = this.f21827a;
        s0.d G = s0Var.G("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        String str2 = this.f21829c;
        G.a(str2, str, Integer.valueOf(i6), Integer.valueOf(i10));
        G.d(new oe.d() { // from class: je.f0
            @Override // oe.d
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                g0 g0Var = g0.this;
                g0Var.getClass();
                iArr[0] = cursor.getInt(1);
                strArr[0] = cursor.getString(2);
                strArr2[0] = cursor.getString(3);
                g0Var.h(cVar, hashMap, cursor);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        s0.d G2 = s0Var.G("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str3 = strArr[0];
        G2.a(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0]));
        G2.d(new e0(this, cVar, hashMap, 2));
        cVar.a();
        return hashMap;
    }

    @Override // je.b
    public final HashMap d(TreeSet treeSet) {
        boolean z10;
        if (treeSet.comparator() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "getOverlays() requires natural order", new Object[0]);
        HashMap hashMap = new HashMap();
        oe.c cVar = new oe.c();
        ke.p pVar = ke.p.f23292v;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            if (!pVar.equals(iVar.i())) {
                i(hashMap, cVar, pVar, arrayList);
                pVar = iVar.i();
                arrayList.clear();
            }
            arrayList.add(iVar.f23275u.k());
        }
        i(hashMap, cVar, pVar, arrayList);
        cVar.a();
        return hashMap;
    }

    @Override // je.b
    public final void e(int i6) {
        this.f21827a.F("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f21829c, Integer.valueOf(i6));
    }

    @Override // je.b
    public final HashMap f(ke.p pVar, int i6) {
        HashMap hashMap = new HashMap();
        oe.c cVar = new oe.c();
        s0.d G = this.f21827a.G("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        G.a(this.f21829c, ca.a.R(pVar), Integer.valueOf(i6));
        G.d(new e0(this, cVar, hashMap, 1));
        cVar.a();
        return hashMap;
    }

    public final le.b g(byte[] bArr, int i6) {
        try {
            return new le.b(i6, this.f21828b.f21836a.c(rf.t.g0(bArr)));
        } catch (InvalidProtocolBufferException e10) {
            ca.a.V("Overlay failed to parse: %s", e10);
            throw null;
        }
    }

    public final void h(oe.c cVar, Map<ke.i, le.j> map, Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        int i6 = cursor.getInt(1);
        Executor executor = cVar;
        if (cursor.isLast()) {
            executor = oe.g.f27421b;
        }
        executor.execute(new j7.e(this, blob, i6, map, 1));
    }

    public final void i(HashMap hashMap, oe.c cVar, ke.p pVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        s0.b bVar = new s0.b(this.f21827a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f21829c, ca.a.R(pVar)), arrayList, ")");
        while (bVar.f.hasNext()) {
            bVar.a().d(new e0(this, cVar, hashMap, 0));
        }
    }
}
