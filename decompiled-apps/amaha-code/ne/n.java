package ne;

import android.content.Context;
import java.util.BitSet;
import tr.c0;
/* compiled from: FirestoreChannel.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: g  reason: collision with root package name */
    public static final c0.b f26244g;

    /* renamed from: h  reason: collision with root package name */
    public static final c0.b f26245h;

    /* renamed from: i  reason: collision with root package name */
    public static final c0.b f26246i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile String f26247j;

    /* renamed from: a  reason: collision with root package name */
    public final oe.a f26248a;

    /* renamed from: b  reason: collision with root package name */
    public final com.android.volley.toolbox.a f26249b;

    /* renamed from: c  reason: collision with root package name */
    public final com.android.volley.toolbox.a f26250c;

    /* renamed from: d  reason: collision with root package name */
    public final p f26251d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26252e;
    public final q f;

    static {
        c0.a aVar = tr.c0.f33440d;
        BitSet bitSet = c0.d.f33445d;
        f26244g = new c0.b("x-goog-api-client", aVar);
        f26245h = new c0.b("google-cloud-resource-prefix", aVar);
        f26246i = new c0.b("x-goog-request-params", aVar);
        f26247j = "gl-java/";
    }

    public n(Context context, e9.c cVar, com.android.volley.toolbox.a aVar, com.android.volley.toolbox.a aVar2, q qVar, oe.a aVar3) {
        this.f26248a = aVar3;
        this.f = qVar;
        this.f26249b = aVar;
        this.f26250c = aVar2;
        this.f26251d = new p(aVar3, context, cVar, new j(aVar, aVar2));
        ke.f fVar = (ke.f) cVar.f13869c;
        this.f26252e = String.format("projects/%s/databases/%s", fVar.f23269u, fVar.f23270v);
    }
}
