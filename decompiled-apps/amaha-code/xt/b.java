package xt;

import java.util.Map;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.k implements ss.l<Integer, g> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ v f38007u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g[] f38008v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, g[] gVarArr) {
        super(1);
        this.f38007u = vVar;
        this.f38008v = gVarArr;
    }

    @Override // ss.l
    public final g invoke(Integer num) {
        Map<Integer, g> map;
        g gVar;
        int intValue = num.intValue();
        v vVar = this.f38007u;
        if (vVar == null || (map = vVar.f38089a) == null || (gVar = map.get(Integer.valueOf(intValue))) == null) {
            if (intValue >= 0) {
                g[] gVarArr = this.f38008v;
                kotlin.jvm.internal.i.g(gVarArr, "<this>");
                if (intValue <= gVarArr.length - 1) {
                    return gVarArr[intValue];
                }
            }
            return g.f38018e;
        }
        return gVar;
    }
}
