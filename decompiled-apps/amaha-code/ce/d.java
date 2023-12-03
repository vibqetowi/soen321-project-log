package ce;

import ae.f;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes.dex */
public final class d implements be.a<d> {

    /* renamed from: e  reason: collision with root package name */
    public static final ce.a f5246e = new ce.a(0);
    public static final b f = new ae.e() { // from class: ce.b
        @Override // ae.a
        public final void a(Object obj, f fVar) {
            switch (r1) {
                case 0:
                    fVar.c((String) obj);
                    return;
                default:
                    fVar.d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final b f5247g = new ae.e() { // from class: ce.b
        @Override // ae.a
        public final void a(Object obj, f fVar) {
            switch (r1) {
                case 0:
                    fVar.c((String) obj);
                    return;
                default:
                    fVar.d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public static final a f5248h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5249a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5250b;

    /* renamed from: c  reason: collision with root package name */
    public final ce.a f5251c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5252d;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes.dex */
    public static final class a implements ae.e<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f5253a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f5253a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        @Override // ae.a
        public final void a(Object obj, f fVar) {
            fVar.c(f5253a.format((Date) obj));
        }
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f5249a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f5250b = hashMap2;
        this.f5251c = f5246e;
        this.f5252d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f5247g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f5248h);
        hashMap.remove(Date.class);
    }

    public final be.a a(Class cls, ae.c cVar) {
        this.f5249a.put(cls, cVar);
        this.f5250b.remove(cls);
        return this;
    }
}
