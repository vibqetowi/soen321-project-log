package vf;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import uf.k;
/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class q {
    public static final vf.u A;
    public static final u B;

    /* renamed from: a  reason: collision with root package name */
    public static final vf.r f35039a = new vf.r(Class.class, new sf.u(new k()));

    /* renamed from: b  reason: collision with root package name */
    public static final vf.r f35040b = new vf.r(BitSet.class, new sf.u(new v()));

    /* renamed from: c  reason: collision with root package name */
    public static final x f35041c;

    /* renamed from: d  reason: collision with root package name */
    public static final vf.s f35042d;

    /* renamed from: e  reason: collision with root package name */
    public static final vf.s f35043e;
    public static final vf.s f;

    /* renamed from: g  reason: collision with root package name */
    public static final vf.s f35044g;

    /* renamed from: h  reason: collision with root package name */
    public static final vf.r f35045h;

    /* renamed from: i  reason: collision with root package name */
    public static final vf.r f35046i;

    /* renamed from: j  reason: collision with root package name */
    public static final vf.r f35047j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f35048k;

    /* renamed from: l  reason: collision with root package name */
    public static final vf.s f35049l;

    /* renamed from: m  reason: collision with root package name */
    public static final g f35050m;

    /* renamed from: n  reason: collision with root package name */
    public static final h f35051n;

    /* renamed from: o  reason: collision with root package name */
    public static final i f35052o;

    /* renamed from: p  reason: collision with root package name */
    public static final vf.r f35053p;

    /* renamed from: q  reason: collision with root package name */
    public static final vf.r f35054q;
    public static final vf.r r;

    /* renamed from: s  reason: collision with root package name */
    public static final vf.r f35055s;

    /* renamed from: t  reason: collision with root package name */
    public static final vf.r f35056t;

    /* renamed from: u  reason: collision with root package name */
    public static final vf.u f35057u;

    /* renamed from: v  reason: collision with root package name */
    public static final vf.r f35058v;

    /* renamed from: w  reason: collision with root package name */
    public static final vf.r f35059w;

    /* renamed from: x  reason: collision with root package name */
    public static final vf.t f35060x;

    /* renamed from: y  reason: collision with root package name */
    public static final vf.r f35061y;

    /* renamed from: z  reason: collision with root package name */
    public static final t f35062z;

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class a extends sf.v<AtomicIntegerArray> {
        @Override // sf.v
        public final AtomicIntegerArray a(yf.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.J()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.f0()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            aVar.j();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i6 = 0; i6 < size; i6++) {
                atomicIntegerArray.set(i6, ((Integer) arrayList.get(i6)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // sf.v
        public final void b(yf.b bVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            bVar.e();
            int length = atomicIntegerArray2.length();
            for (int i6 = 0; i6 < length; i6++) {
                bVar.O(atomicIntegerArray2.get(i6));
            }
            bVar.j();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class a0 extends sf.v<Number> {
        @Override // sf.v
        public final Number a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.f0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, Number number) {
            bVar.c0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class b extends sf.v<Number> {
        @Override // sf.v
        public final Number a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            try {
                return Long.valueOf(aVar.h0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, Number number) {
            bVar.c0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class b0 extends sf.v<AtomicInteger> {
        @Override // sf.v
        public final AtomicInteger a(yf.a aVar) {
            try {
                return new AtomicInteger(aVar.f0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, AtomicInteger atomicInteger) {
            bVar.O(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class c extends sf.v<Number> {
        @Override // sf.v
        public final Number a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return Float.valueOf((float) aVar.e0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, Number number) {
            bVar.c0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class c0 extends sf.v<AtomicBoolean> {
        @Override // sf.v
        public final AtomicBoolean a(yf.a aVar) {
            return new AtomicBoolean(aVar.c0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, AtomicBoolean atomicBoolean) {
            bVar.f0(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class d extends sf.v<Number> {
        @Override // sf.v
        public final Number a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return Double.valueOf(aVar.e0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, Number number) {
            bVar.c0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public static final class d0<T extends Enum<T>> extends sf.v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f35063a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f35064b = new HashMap();

        /* compiled from: TypeAdapters.java */
        /* loaded from: classes.dex */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f35065a;

            public a(Class cls) {
                this.f35065a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f35065a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public d0(Class<T> cls) {
            Field[] fieldArr;
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    tf.b bVar = (tf.b) field.getAnnotation(tf.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f35063a.put(str, r42);
                        }
                    }
                    this.f35063a.put(name, r42);
                    this.f35064b.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // sf.v
        public final Object a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return (Enum) this.f35063a.get(aVar.v0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, Object obj) {
            String str;
            Enum r32 = (Enum) obj;
            if (r32 == null) {
                str = null;
            } else {
                str = (String) this.f35064b.get(r32);
            }
            bVar.e0(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class e extends sf.v<Character> {
        @Override // sf.v
        public final Character a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            String v02 = aVar.v0();
            if (v02.length() == 1) {
                return Character.valueOf(v02.charAt(0));
            }
            StringBuilder g5 = defpackage.d.g("Expecting character, got: ", v02, "; at ");
            g5.append(aVar.I());
            throw new JsonSyntaxException(g5.toString());
        }

        @Override // sf.v
        public final void b(yf.b bVar, Character ch2) {
            String valueOf;
            Character ch3 = ch2;
            if (ch3 == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch3);
            }
            bVar.e0(valueOf);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class f extends sf.v<String> {
        @Override // sf.v
        public final String a(yf.a aVar) {
            int y02 = aVar.y0();
            if (y02 == 9) {
                aVar.p0();
                return null;
            } else if (y02 == 8) {
                return Boolean.toString(aVar.c0());
            } else {
                return aVar.v0();
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, String str) {
            bVar.e0(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class g extends sf.v<BigDecimal> {
        @Override // sf.v
        public final BigDecimal a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            String v02 = aVar.v0();
            try {
                return new BigDecimal(v02);
            } catch (NumberFormatException e10) {
                StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as BigDecimal; at path ");
                g5.append(aVar.I());
                throw new JsonSyntaxException(g5.toString(), e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, BigDecimal bigDecimal) {
            bVar.c0(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class h extends sf.v<BigInteger> {
        @Override // sf.v
        public final BigInteger a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            String v02 = aVar.v0();
            try {
                return new BigInteger(v02);
            } catch (NumberFormatException e10) {
                StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as BigInteger; at path ");
                g5.append(aVar.I());
                throw new JsonSyntaxException(g5.toString(), e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, BigInteger bigInteger) {
            bVar.c0(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class i extends sf.v<uf.j> {
        @Override // sf.v
        public final uf.j a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return new uf.j(aVar.v0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, uf.j jVar) {
            bVar.c0(jVar);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class j extends sf.v<StringBuilder> {
        @Override // sf.v
        public final StringBuilder a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return new StringBuilder(aVar.v0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, StringBuilder sb2) {
            String sb3;
            StringBuilder sb4 = sb2;
            if (sb4 == null) {
                sb3 = null;
            } else {
                sb3 = sb4.toString();
            }
            bVar.e0(sb3);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class k extends sf.v<Class> {
        @Override // sf.v
        public final Class a(yf.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // sf.v
        public final void b(yf.b bVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class l extends sf.v<StringBuffer> {
        @Override // sf.v
        public final StringBuffer a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return new StringBuffer(aVar.v0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, StringBuffer stringBuffer) {
            String stringBuffer2;
            StringBuffer stringBuffer3 = stringBuffer;
            if (stringBuffer3 == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer3.toString();
            }
            bVar.e0(stringBuffer2);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class m extends sf.v<URL> {
        @Override // sf.v
        public final URL a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
            } else {
                String v02 = aVar.v0();
                if (!"null".equals(v02)) {
                    return new URL(v02);
                }
            }
            return null;
        }

        @Override // sf.v
        public final void b(yf.b bVar, URL url) {
            String externalForm;
            URL url2 = url;
            if (url2 == null) {
                externalForm = null;
            } else {
                externalForm = url2.toExternalForm();
            }
            bVar.e0(externalForm);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class n extends sf.v<URI> {
        @Override // sf.v
        public final URI a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
            } else {
                try {
                    String v02 = aVar.v0();
                    if (!"null".equals(v02)) {
                        return new URI(v02);
                    }
                } catch (URISyntaxException e10) {
                    throw new JsonIOException(e10);
                }
            }
            return null;
        }

        @Override // sf.v
        public final void b(yf.b bVar, URI uri) {
            String aSCIIString;
            URI uri2 = uri;
            if (uri2 == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri2.toASCIIString();
            }
            bVar.e0(aSCIIString);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class o extends sf.v<InetAddress> {
        @Override // sf.v
        public final InetAddress a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return InetAddress.getByName(aVar.v0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, InetAddress inetAddress) {
            String hostAddress;
            InetAddress inetAddress2 = inetAddress;
            if (inetAddress2 == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress2.getHostAddress();
            }
            bVar.e0(hostAddress);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class p extends sf.v<UUID> {
        @Override // sf.v
        public final UUID a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            String v02 = aVar.v0();
            try {
                return UUID.fromString(v02);
            } catch (IllegalArgumentException e10) {
                StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as UUID; at path ");
                g5.append(aVar.I());
                throw new JsonSyntaxException(g5.toString(), e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, UUID uuid) {
            String uuid2;
            UUID uuid3 = uuid;
            if (uuid3 == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid3.toString();
            }
            bVar.e0(uuid2);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: vf.q$q  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0593q extends sf.v<Currency> {
        @Override // sf.v
        public final Currency a(yf.a aVar) {
            String v02 = aVar.v0();
            try {
                return Currency.getInstance(v02);
            } catch (IllegalArgumentException e10) {
                StringBuilder g5 = defpackage.d.g("Failed parsing '", v02, "' as Currency; at path ");
                g5.append(aVar.I());
                throw new JsonSyntaxException(g5.toString(), e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, Currency currency) {
            bVar.e0(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class r extends sf.v<Calendar> {
        @Override // sf.v
        public final Calendar a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            aVar.e();
            int i6 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (aVar.y0() != 4) {
                String k02 = aVar.k0();
                int f02 = aVar.f0();
                if ("year".equals(k02)) {
                    i6 = f02;
                } else if ("month".equals(k02)) {
                    i10 = f02;
                } else if ("dayOfMonth".equals(k02)) {
                    i11 = f02;
                } else if ("hourOfDay".equals(k02)) {
                    i12 = f02;
                } else if ("minute".equals(k02)) {
                    i13 = f02;
                } else if ("second".equals(k02)) {
                    i14 = f02;
                }
            }
            aVar.m();
            return new GregorianCalendar(i6, i10, i11, i12, i13, i14);
        }

        @Override // sf.v
        public final void b(yf.b bVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                bVar.G();
                return;
            }
            bVar.g();
            bVar.o("year");
            bVar.O(calendar2.get(1));
            bVar.o("month");
            bVar.O(calendar2.get(2));
            bVar.o("dayOfMonth");
            bVar.O(calendar2.get(5));
            bVar.o("hourOfDay");
            bVar.O(calendar2.get(11));
            bVar.o("minute");
            bVar.O(calendar2.get(12));
            bVar.o("second");
            bVar.O(calendar2.get(13));
            bVar.m();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class s extends sf.v<Locale> {
        @Override // sf.v
        public final Locale a(yf.a aVar) {
            String str;
            String str2;
            String str3 = null;
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.v0(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // sf.v
        public final void b(yf.b bVar, Locale locale) {
            String locale2;
            Locale locale3 = locale;
            if (locale3 == null) {
                locale2 = null;
            } else {
                locale2 = locale3.toString();
            }
            bVar.e0(locale2);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class t extends sf.v<sf.m> {
        public static sf.m c(yf.a aVar) {
            if (aVar instanceof vf.f) {
                vf.f fVar = (vf.f) aVar;
                int y02 = fVar.y0();
                if (y02 != 5 && y02 != 2 && y02 != 4 && y02 != 10) {
                    sf.m mVar = (sf.m) fVar.Q0();
                    fVar.N0();
                    return mVar;
                }
                throw new IllegalStateException("Unexpected " + r1.b0.k(y02) + " when reading a JsonElement.");
            }
            int d10 = v.h.d(aVar.y0());
            if (d10 != 0) {
                if (d10 != 2) {
                    if (d10 != 5) {
                        if (d10 != 6) {
                            if (d10 != 7) {
                                if (d10 == 8) {
                                    aVar.p0();
                                    return sf.n.f31510u;
                                }
                                throw new IllegalArgumentException();
                            }
                            return new sf.p(Boolean.valueOf(aVar.c0()));
                        }
                        return new sf.p(new uf.j(aVar.v0()));
                    }
                    return new sf.p(aVar.v0());
                }
                sf.o oVar = new sf.o();
                aVar.e();
                while (aVar.J()) {
                    String k02 = aVar.k0();
                    sf.m c10 = c(aVar);
                    if (c10 == null) {
                        c10 = sf.n.f31510u;
                    }
                    oVar.f31511u.put(k02, c10);
                }
                aVar.m();
                return oVar;
            }
            sf.k kVar = new sf.k();
            aVar.a();
            while (aVar.J()) {
                Object c11 = c(aVar);
                if (c11 == null) {
                    c11 = sf.n.f31510u;
                }
                kVar.f31509u.add(c11);
            }
            aVar.j();
            return kVar;
        }

        public static void d(sf.m mVar, yf.b bVar) {
            boolean z10;
            if (mVar != null && !(mVar instanceof sf.n)) {
                boolean z11 = mVar instanceof sf.p;
                if (z11) {
                    if (z11) {
                        sf.p pVar = (sf.p) mVar;
                        Serializable serializable = pVar.f31512u;
                        if (serializable instanceof Number) {
                            bVar.c0(pVar.q());
                            return;
                        } else if (serializable instanceof Boolean) {
                            bVar.f0(pVar.o());
                            return;
                        } else {
                            bVar.e0(pVar.m());
                            return;
                        }
                    }
                    throw new IllegalStateException("Not a JSON Primitive: " + mVar);
                }
                boolean z12 = mVar instanceof sf.k;
                if (z12) {
                    bVar.e();
                    if (z12) {
                        Iterator<sf.m> it = ((sf.k) mVar).iterator();
                        while (it.hasNext()) {
                            d(it.next(), bVar);
                        }
                        bVar.j();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + mVar);
                } else if (mVar instanceof sf.o) {
                    bVar.g();
                    uf.k kVar = uf.k.this;
                    k.e eVar = kVar.f34079y.f34090x;
                    int i6 = kVar.f34078x;
                    while (true) {
                        k.e eVar2 = kVar.f34079y;
                        if (eVar != eVar2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (eVar != eVar2) {
                                if (kVar.f34078x == i6) {
                                    k.e eVar3 = eVar.f34090x;
                                    bVar.o((String) eVar.f34092z);
                                    d((sf.m) eVar.A, bVar);
                                    eVar = eVar3;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            bVar.m();
                            return;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Couldn't write " + mVar.getClass());
                }
            } else {
                bVar.G();
            }
        }

        @Override // sf.v
        public final /* bridge */ /* synthetic */ sf.m a(yf.a aVar) {
            return c(aVar);
        }

        @Override // sf.v
        public final /* bridge */ /* synthetic */ void b(yf.b bVar, sf.m mVar) {
            d(mVar, bVar);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class u implements sf.w {
        @Override // sf.w
        public final <T> sf.v<T> a(sf.i iVar, TypeToken<T> typeToken) {
            Class rawType = typeToken.getRawType();
            if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                if (!rawType.isEnum()) {
                    rawType = (Class<? super Object>) rawType.getSuperclass();
                }
                return new d0(rawType);
            }
            return null;
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class v extends sf.v<BitSet> {
        @Override // sf.v
        public final BitSet a(yf.a aVar) {
            boolean z10;
            BitSet bitSet = new BitSet();
            aVar.a();
            int y02 = aVar.y0();
            int i6 = 0;
            while (y02 != 2) {
                int d10 = v.h.d(y02);
                if (d10 != 5 && d10 != 6) {
                    if (d10 == 7) {
                        z10 = aVar.c0();
                    } else {
                        throw new JsonSyntaxException("Invalid bitset value type: " + r1.b0.k(y02) + "; at path " + aVar.s());
                    }
                } else {
                    int f02 = aVar.f0();
                    if (f02 == 0) {
                        z10 = false;
                    } else if (f02 == 1) {
                        z10 = true;
                    } else {
                        StringBuilder u10 = defpackage.c.u("Invalid bitset value ", f02, ", expected 0 or 1; at path ");
                        u10.append(aVar.I());
                        throw new JsonSyntaxException(u10.toString());
                    }
                }
                if (z10) {
                    bitSet.set(i6);
                }
                i6++;
                y02 = aVar.y0();
            }
            aVar.j();
            return bitSet;
        }

        @Override // sf.v
        public final void b(yf.b bVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            bVar.e();
            int length = bitSet2.length();
            for (int i6 = 0; i6 < length; i6++) {
                bVar.O(bitSet2.get(i6) ? 1L : 0L);
            }
            bVar.j();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class w extends sf.v<Boolean> {
        @Override // sf.v
        public final Boolean a(yf.a aVar) {
            int y02 = aVar.y0();
            if (y02 == 9) {
                aVar.p0();
                return null;
            } else if (y02 == 6) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.v0()));
            } else {
                return Boolean.valueOf(aVar.c0());
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, Boolean bool) {
            bVar.R(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class x extends sf.v<Boolean> {
        @Override // sf.v
        public final Boolean a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            return Boolean.valueOf(aVar.v0());
        }

        @Override // sf.v
        public final void b(yf.b bVar, Boolean bool) {
            String bool2;
            Boolean bool3 = bool;
            if (bool3 == null) {
                bool2 = "null";
            } else {
                bool2 = bool3.toString();
            }
            bVar.e0(bool2);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class y extends sf.v<Number> {
        @Override // sf.v
        public final Number a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            try {
                int f02 = aVar.f0();
                if (f02 <= 255 && f02 >= -128) {
                    return Byte.valueOf((byte) f02);
                }
                StringBuilder u10 = defpackage.c.u("Lossy conversion from ", f02, " to byte; at path ");
                u10.append(aVar.I());
                throw new JsonSyntaxException(u10.toString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, Number number) {
            bVar.c0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class z extends sf.v<Number> {
        @Override // sf.v
        public final Number a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            try {
                int f02 = aVar.f0();
                if (f02 <= 65535 && f02 >= -32768) {
                    return Short.valueOf((short) f02);
                }
                StringBuilder u10 = defpackage.c.u("Lossy conversion from ", f02, " to short; at path ");
                u10.append(aVar.I());
                throw new JsonSyntaxException(u10.toString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, Number number) {
            bVar.c0(number);
        }
    }

    static {
        w wVar = new w();
        f35041c = new x();
        f35042d = new vf.s(Boolean.TYPE, Boolean.class, wVar);
        f35043e = new vf.s(Byte.TYPE, Byte.class, new y());
        f = new vf.s(Short.TYPE, Short.class, new z());
        f35044g = new vf.s(Integer.TYPE, Integer.class, new a0());
        f35045h = new vf.r(AtomicInteger.class, new sf.u(new b0()));
        f35046i = new vf.r(AtomicBoolean.class, new sf.u(new c0()));
        f35047j = new vf.r(AtomicIntegerArray.class, new sf.u(new a()));
        f35048k = new b();
        new c();
        new d();
        f35049l = new vf.s(Character.TYPE, Character.class, new e());
        f fVar = new f();
        f35050m = new g();
        f35051n = new h();
        f35052o = new i();
        f35053p = new vf.r(String.class, fVar);
        f35054q = new vf.r(StringBuilder.class, new j());
        r = new vf.r(StringBuffer.class, new l());
        f35055s = new vf.r(URL.class, new m());
        f35056t = new vf.r(URI.class, new n());
        f35057u = new vf.u(InetAddress.class, new o());
        f35058v = new vf.r(UUID.class, new p());
        f35059w = new vf.r(Currency.class, new sf.u(new C0593q()));
        f35060x = new vf.t(new r());
        f35061y = new vf.r(Locale.class, new s());
        t tVar = new t();
        f35062z = tVar;
        A = new vf.u(sf.m.class, tVar);
        B = new u();
    }
}
