package xf;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import sf.i;
import sf.v;
import sf.w;
/* compiled from: SqlTimeTypeAdapter.java */
/* loaded from: classes.dex */
public final class b extends v<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37752b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f37753a = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: SqlTimeTypeAdapter.java */
    /* loaded from: classes.dex */
    public class a implements w {
        @Override // sf.w
        public final <T> v<T> a(i iVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new b();
            }
            return null;
        }
    }

    @Override // sf.v
    public final Time a(yf.a aVar) {
        Time time;
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        String v02 = aVar.v0();
        try {
            synchronized (this) {
                time = new Time(this.f37753a.parse(v02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as SQL Time; at path ");
            g5.append(aVar.I());
            throw new JsonSyntaxException(g5.toString(), e10);
        }
    }

    @Override // sf.v
    public final void b(yf.b bVar, Time time) {
        String format;
        Time time2 = time;
        if (time2 == null) {
            bVar.G();
            return;
        }
        synchronized (this) {
            format = this.f37753a.format((Date) time2);
        }
        bVar.e0(format);
    }
}
