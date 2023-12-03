package vf;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import sf.v;
import sf.w;
/* compiled from: DateTypeAdapter.java */
/* loaded from: classes.dex */
public final class c extends v<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35001b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f35002a;

    /* compiled from: DateTypeAdapter.java */
    /* loaded from: classes.dex */
    public class a implements w {
        @Override // sf.w
        public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f35002a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (uf.i.f34073a >= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(ca.a.s0(2, 2));
        }
    }

    @Override // sf.v
    public final Date a(yf.a aVar) {
        Date b10;
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        String v02 = aVar.v0();
        synchronized (this.f35002a) {
            Iterator it = this.f35002a.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b10 = ((DateFormat) it.next()).parse(v02);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        b10 = wf.a.b(v02, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as Date; at path ");
                        g5.append(aVar.I());
                        throw new JsonSyntaxException(g5.toString(), e10);
                    }
                }
            }
        }
        return b10;
    }

    @Override // sf.v
    public final void b(yf.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.G();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f35002a.get(0);
        synchronized (this.f35002a) {
            format = dateFormat.format(date2);
        }
        bVar.e0(format);
    }
}
