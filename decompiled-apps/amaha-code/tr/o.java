package tr;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
import j$.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tr.f;
/* compiled from: DecompressorRegistry.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c  reason: collision with root package name */
    public static final s5 f33538c = new s5(String.valueOf(','), 3);

    /* renamed from: d  reason: collision with root package name */
    public static final o f33539d = new o(f.b.f33465a, false, new o(new f.a(), true, new o()));

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f33540a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f33541b;

    /* compiled from: DecompressorRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f33542a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33543b;

        public a(n nVar, boolean z10) {
            sc.b.w(nVar, "decompressor");
            this.f33542a = nVar;
            this.f33543b = z10;
        }
    }

    public o(f fVar, boolean z10, o oVar) {
        String a10 = fVar.a();
        sc.b.s("Comma is currently not allowed in message encoding", !a10.contains(","));
        int size = oVar.f33540a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(oVar.f33540a.containsKey(fVar.a()) ? size : size + 1);
        for (a aVar : oVar.f33540a.values()) {
            String a11 = aVar.f33542a.a();
            if (!a11.equals(a10)) {
                linkedHashMap.put(a11, new a(aVar.f33542a, aVar.f33543b));
            }
        }
        linkedHashMap.put(a10, new a(fVar, z10));
        Map<String, a> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f33540a = unmodifiableMap;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry<String, a> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().f33543b) {
                hashSet.add(entry.getKey());
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        s5 s5Var = f33538c;
        s5Var.getClass();
        Iterator it = unmodifiableSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) s5Var.f8126v);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            this.f33541b = sb2.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public o() {
        this.f33540a = new LinkedHashMap(0);
        this.f33541b = new byte[0];
    }
}
