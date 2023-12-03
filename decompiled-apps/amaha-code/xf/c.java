package xf;

import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import sf.i;
import sf.v;
import sf.w;
/* compiled from: SqlTimestampTypeAdapter.java */
/* loaded from: classes.dex */
public final class c extends v<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37754b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final v<Date> f37755a;

    /* compiled from: SqlTimestampTypeAdapter.java */
    /* loaded from: classes.dex */
    public class a implements w {
        @Override // sf.w
        public final <T> v<T> a(i iVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                iVar.getClass();
                return new c(iVar.d(TypeToken.get(Date.class)));
            }
            return null;
        }
    }

    public c(v vVar) {
        this.f37755a = vVar;
    }

    @Override // sf.v
    public final Timestamp a(yf.a aVar) {
        Date a10 = this.f37755a.a(aVar);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    @Override // sf.v
    public final void b(yf.b bVar, Timestamp timestamp) {
        this.f37755a.b(bVar, timestamp);
    }
}
