package zs;

import au.h;
import gt.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import ss.p;
import su.y;
/* compiled from: reflectLambda.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends f implements p<y, h, p0> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f39837u = new a();

    public a() {
        super(2);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return kotlin.jvm.internal.y.a(y.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // ss.p
    public final p0 invoke(y yVar, h hVar) {
        y p02 = yVar;
        h p12 = hVar;
        i.g(p02, "p0");
        i.g(p12, "p1");
        return p02.e(p12);
    }
}
