package ap;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityContentModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityHintListModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import fe.q;
import fe.r;
import gv.n;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
/* compiled from: RecommendedActivityRepository.kt */
/* loaded from: classes2.dex */
public final class d<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j<hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> f3389a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f3390b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String[] f3391c;

    public d(k kVar, f fVar, String[] strArr) {
        this.f3389a = kVar;
        this.f3390b = fVar;
        this.f3391c = strArr;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a7, B:52:0x00c3, B:53:0x00c6, B:54:0x00ce, B:56:0x00d4, B:60:0x00e9, B:62:0x00ed, B:64:0x00f3, B:65:0x00f7, B:67:0x00fd, B:69:0x010d, B:78:0x0129, B:79:0x012d, B:81:0x0133, B:82:0x013c, B:84:0x0142), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a7, B:52:0x00c3, B:53:0x00c6, B:54:0x00ce, B:56:0x00d4, B:60:0x00e9, B:62:0x00ed, B:64:0x00f3, B:65:0x00f7, B:67:0x00fd, B:69:0x010d, B:78:0x0129, B:79:0x012d, B:81:0x0133, B:82:0x013c, B:84:0x0142), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a7, B:52:0x00c3, B:53:0x00c6, B:54:0x00ce, B:56:0x00d4, B:60:0x00e9, B:62:0x00ed, B:64:0x00f3, B:65:0x00f7, B:67:0x00fd, B:69:0x010d, B:78:0x0129, B:79:0x012d, B:81:0x0133, B:82:0x013c, B:84:0x0142), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a7, B:52:0x00c3, B:53:0x00c6, B:54:0x00ce, B:56:0x00d4, B:60:0x00e9, B:62:0x00ed, B:64:0x00f3, B:65:0x00f7, B:67:0x00fd, B:69:0x010d, B:78:0x0129, B:79:0x012d, B:81:0x0133, B:82:0x013c, B:84:0x0142), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a7, B:52:0x00c3, B:53:0x00c6, B:54:0x00ce, B:56:0x00d4, B:60:0x00e9, B:62:0x00ed, B:64:0x00f3, B:65:0x00f7, B:67:0x00fd, B:69:0x010d, B:78:0x0129, B:79:0x012d, B:81:0x0133, B:82:0x013c, B:84:0x0142), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    @Override // ya.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ya.h<fe.r> r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.d.a(ya.h):void");
    }
}
