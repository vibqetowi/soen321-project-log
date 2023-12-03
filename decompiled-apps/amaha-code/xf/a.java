package xf;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import sf.i;
import sf.v;
import sf.w;
/* compiled from: SqlDateTypeAdapter.java */
/* loaded from: classes.dex */
public final class a extends v<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final C0634a f37750b = new C0634a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f37751a = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter.java */
    /* renamed from: xf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0634a implements w {
        @Override // sf.w
        public final <T> v<T> a(i iVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new a();
            }
            return null;
        }
    }

    @Override // sf.v
    public final Date a(yf.a aVar) {
        java.util.Date parse;
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        String v02 = aVar.v0();
        try {
            synchronized (this) {
                parse = this.f37751a.parse(v02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as SQL Date; at path ");
            g5.append(aVar.I());
            throw new JsonSyntaxException(g5.toString(), e10);
        }
    }

    @Override // sf.v
    public final void b(yf.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.G();
            return;
        }
        synchronized (this) {
            format = this.f37751a.format((java.util.Date) date2);
        }
        bVar.e0(format);
    }
}
