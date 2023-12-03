package tr;

import j$.util.concurrent.ConcurrentHashMap;
import tr.f;
/* compiled from: CompressorRegistry.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final i f33478b = new i(new f.a(), f.b.f33465a);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f33479a = new ConcurrentHashMap();

    public i(h... hVarArr) {
        for (h hVar : hVarArr) {
            this.f33479a.put(hVar.a(), hVar);
        }
    }
}
