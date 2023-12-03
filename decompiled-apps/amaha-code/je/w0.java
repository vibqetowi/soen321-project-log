package je;

import android.database.Cursor;
import com.google.protobuf.InvalidProtocolBufferException;
import me.c;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements oe.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21965a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x0 f21966b;

    public /* synthetic */ w0(x0 x0Var, int i6) {
        this.f21965a = i6;
        this.f21966b = x0Var;
    }

    @Override // oe.d
    public final void accept(Object obj) {
        int i6 = this.f21965a;
        x0 x0Var = this.f21966b;
        switch (i6) {
            case 0:
                Cursor cursor = (Cursor) obj;
                x0Var.getClass();
                int i10 = cursor.getInt(0);
                try {
                    x0Var.f21967a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{x0Var.f21968b.d(me.c.d0(cursor.getBlob(1))).f21796a.b(), Integer.valueOf(i10)});
                    return;
                } catch (InvalidProtocolBufferException unused) {
                    ca.a.V("Failed to decode Query data for target %s", Integer.valueOf(i10));
                    throw null;
                }
            case 1:
                Cursor cursor2 = (Cursor) obj;
                x0Var.getClass();
                String string = cursor2.getString(0);
                c2.a aVar = new c2.a(2, new Object[]{string, Long.valueOf(cursor2.getLong(1))});
                l0 l0Var = new l0(x0Var, 4, string);
                Cursor rawQueryWithFactory = x0Var.f21967a.rawQueryWithFactory(aVar, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
                while (rawQueryWithFactory.moveToNext()) {
                    try {
                        l0Var.accept(rawQueryWithFactory);
                    } catch (Throwable th2) {
                        if (rawQueryWithFactory != null) {
                            try {
                                rawQueryWithFactory.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                rawQueryWithFactory.close();
                return;
            default:
                Cursor cursor3 = (Cursor) obj;
                x0Var.getClass();
                int i11 = cursor3.getInt(0);
                try {
                    c.a a10 = me.c.d0(cursor3.getBlob(1)).a();
                    a10.u();
                    me.c.P((me.c) a10.f10073v);
                    x0Var.f21967a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{a10.r().q(), Integer.valueOf(i11)});
                    return;
                } catch (InvalidProtocolBufferException unused2) {
                    ca.a.V("Failed to decode Query data for target %s", Integer.valueOf(i11));
                    throw null;
                }
        }
    }
}
