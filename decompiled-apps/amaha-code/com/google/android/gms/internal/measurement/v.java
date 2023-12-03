package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class v implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f8626u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v.c f8627v;

    public v(i iVar, v.c cVar) {
        this.f8626u = iVar;
        this.f8627v = cVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        if (oVar instanceof s) {
            if (!(oVar2 instanceof s)) {
                return 1;
            }
            return 0;
        } else if (oVar2 instanceof s) {
            return -1;
        } else {
            i iVar = this.f8626u;
            if (iVar == null) {
                return oVar.g().compareTo(oVar2.g());
            }
            return (int) l3.a(iVar.a(this.f8627v, Arrays.asList(oVar, oVar2)).f().doubleValue());
        }
    }
}
