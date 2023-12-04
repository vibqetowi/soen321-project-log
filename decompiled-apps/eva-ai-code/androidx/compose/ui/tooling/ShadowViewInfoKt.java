package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
/* compiled from: ShadowViewInfo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"stitchTrees", "", "Landroidx/compose/ui/tooling/ViewInfo;", "allViewInfoRoots", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShadowViewInfoKt {
    public static final List<ViewInfo> stitchTrees(List<ViewInfo> allViewInfoRoots) {
        Intrinsics.checkNotNullParameter(allViewInfoRoots, "allViewInfoRoots");
        if (allViewInfoRoots.size() < 2) {
            return allViewInfoRoots;
        }
        List<ViewInfo> list = allViewInfoRoots;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ViewInfo viewInfo : list) {
            arrayList.add(new ShadowViewInfo(viewInfo));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList<ShadowViewInfo> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        for (ShadowViewInfo shadowViewInfo : arrayList3) {
            CollectionsKt.addAll(arrayList4, shadowViewInfo.getAllNodes());
        }
        ArrayList<ShadowViewInfo> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (ShadowViewInfo shadowViewInfo2 : arrayList5) {
            arrayList6.add(TuplesKt.to(shadowViewInfo2.getLayoutInfo(), shadowViewInfo2));
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj : arrayList6) {
            if (((Pair) obj).getFirst() != null) {
                arrayList7.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList7) {
            LayoutInfo layoutInfo = (LayoutInfo) ((Pair) obj2).getFirst();
            Object obj3 = linkedHashMap.get(layoutInfo);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap.put(layoutInfo, obj3);
            }
            ((List) obj3).add(obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList2);
        for (ShadowViewInfo shadowViewInfo3 : arrayList3) {
            ShadowViewInfo shadowViewInfo4 = (ShadowViewInfo) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(SequencesKt.flatMapIterable(shadowViewInfo3.getAllNodes(), new ShadowViewInfoKt$stitchTrees$1$1(linkedHashMap)), new ShadowViewInfoKt$stitchTrees$1$2(shadowViewInfo3)), ShadowViewInfoKt$stitchTrees$1$3.INSTANCE));
            if (shadowViewInfo4 != null) {
                shadowViewInfo3.setNewParent(shadowViewInfo4);
                linkedHashSet.remove(shadowViewInfo3);
            }
        }
        LinkedHashSet<ShadowViewInfo> linkedHashSet2 = linkedHashSet;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet2, 10));
        for (ShadowViewInfo shadowViewInfo5 : linkedHashSet2) {
            arrayList8.add(shadowViewInfo5.toViewInfo());
        }
        return arrayList8;
    }
}
