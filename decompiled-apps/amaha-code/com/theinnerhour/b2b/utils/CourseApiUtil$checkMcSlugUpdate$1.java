package com.theinnerhour.b2b.utils;

import android.content.Context;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import gv.r;
import is.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: CourseApiUtil.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "success", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/MiniCourseInfoMeta;", "Lkotlin/collections/ArrayList;", "mcMetaList", "Lhs/k;", "invoke", "(ZLjava/util/ArrayList;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CourseApiUtil$checkMcSlugUpdate$1 extends kotlin.jvm.internal.k implements p<Boolean, ArrayList<MiniCourseInfoMeta>, hs.k> {
    final /* synthetic */ int $attempt;
    final /* synthetic */ Context $context;
    final /* synthetic */ CourseApiUtil this$0;

    /* compiled from: CourseApiUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.CourseApiUtil$checkMcSlugUpdate$1$1", f = "CourseApiUtil.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.CourseApiUtil$checkMcSlugUpdate$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ HashSet<String> $assetsToBeDeleted;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HashSet<String> hashSet, ls.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$assetsToBeDeleted = hashSet;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass1(this.$context, this.$assetsToBeDeleted, dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sp.b.d0(obj);
                String[] fileList = this.$context.fileList();
                kotlin.jvm.internal.i.f(fileList, "context.fileList()");
                for (String str : fileList) {
                    if (this.$assetsToBeDeleted.contains(str)) {
                        this.$context.deleteFile(str);
                    }
                }
                return hs.k.f19476a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((AnonymousClass1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* compiled from: CourseApiUtil.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "element", "Lcom/theinnerhour/b2b/model/OfflineAsset;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/theinnerhour/b2b/model/OfflineAsset;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: com.theinnerhour.b2b.utils.CourseApiUtil$checkMcSlugUpdate$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.k implements ss.l<OfflineAsset, Boolean> {
        final /* synthetic */ HashMap<String, String[]> $updateMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HashMap<String, String[]> hashMap) {
            super(1);
            this.$updateMap = hashMap;
        }

        @Override // ss.l
        public final Boolean invoke(OfflineAsset offlineAsset) {
            ArrayList<String> metaInfo = offlineAsset.getMetaInfo();
            kotlin.jvm.internal.i.f(metaInfo, "element.metaInfo");
            boolean z10 = true;
            return Boolean.valueOf(((metaInfo.isEmpty() ^ true) && this.$updateMap.containsKey(offlineAsset.getMetaInfo().get(0))) ? false : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseApiUtil$checkMcSlugUpdate$1(CourseApiUtil courseApiUtil, int i6, Context context) {
        super(2);
        this.this$0 = courseApiUtil;
        this.$attempt = i6;
        this.$context = context;
    }

    @Override // ss.p
    public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool, ArrayList<MiniCourseInfoMeta> arrayList) {
        invoke(bool.booleanValue(), arrayList);
        return hs.k.f19476a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0280, code lost:
        r1 = r16.this$0.miniFetchUtilInterface;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z10, ArrayList<MiniCourseInfoMeta> mcMetaList) {
        CourseApiUtil.MiniCourseFetchUtilInterface miniCourseFetchUtilInterface;
        CourseApiUtil.MiniCourseFetchUtilInterface miniCourseFetchUtilInterface2;
        kotlin.jvm.internal.i.g(mcMetaList, "mcMetaList");
        if (z10 && (!mcMetaList.isEmpty())) {
            sf.i iVar = new sf.i();
            ApplicationPersistence.getInstance().setStringValue("mc_meta_list", iVar.g(mcMetaList));
            HashMap hashMap = new HashMap();
            Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getCourseAssets().iterator();
            while (it.hasNext()) {
                OfflineAsset next = it.next();
                ArrayList<String> metaInfo = next.getMetaInfo();
                kotlin.jvm.internal.i.f(metaInfo, "tt.metaInfo");
                if (!metaInfo.isEmpty()) {
                    String str = next.getMetaInfo().get(0);
                    kotlin.jvm.internal.i.f(str, "tt.metaInfo[0]");
                    String fileUrl = next.getFileUrl();
                    kotlin.jvm.internal.i.f(fileUrl, "tt.fileUrl");
                    hashMap.put(str, fileUrl);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            HashMap hashMap2 = new HashMap();
            Iterator<MiniCourseInfoMeta> it2 = mcMetaList.iterator();
            while (it2.hasNext()) {
                MiniCourseInfoMeta next2 = it2.next();
                arrayList.add(next2.getSlug());
                if (!hashMap.containsKey(next2.getSlug())) {
                    OfflineAsset offlineAsset = new OfflineAsset(next2.getAssets().get(0));
                    String str2 = next2.getAssets().get(0);
                    kotlin.jvm.internal.i.f(str2, "tt.assets[0]");
                    String[] strArr = (String[]) r.a1(str2, new String[]{"/"}, 0, 6).toArray(new String[0]);
                    offlineAsset.setMetaInfo(ca.a.k(next2.getSlug(), strArr[strArr.length - 1], next2.getAssets().get(1), next2.getAssets().get(2)));
                    arrayList2.add(offlineAsset);
                } else if (hashMap.containsKey(next2.getSlug()) && !kotlin.jvm.internal.i.b(next2.getAssets().get(0), hashMap.get(next2.getSlug()))) {
                    String slug = next2.getSlug();
                    String str3 = next2.getAssets().get(0);
                    kotlin.jvm.internal.i.f(str3, "tt.assets[0]");
                    String str4 = next2.getAssets().get(1);
                    kotlin.jvm.internal.i.f(str4, "tt.assets[1]");
                    String str5 = next2.getAssets().get(2);
                    kotlin.jvm.internal.i.f(str5, "tt.assets[2]");
                    hashMap2.put(slug, new String[]{str3, str4, str5});
                }
            }
            ApplicationPersistence.getInstance().setStringValue("mc_slug_list", iVar.g(arrayList));
            Set keySet = hashMap2.keySet();
            kotlin.jvm.internal.i.f(keySet, "updateMap.keys");
            if (!keySet.isEmpty()) {
                Iterator<OfflineAsset> it3 = ApplicationPersistence.getInstance().getCourseAssets().iterator();
                while (it3.hasNext()) {
                    OfflineAsset next3 = it3.next();
                    ArrayList<String> metaInfo2 = next3.getMetaInfo();
                    kotlin.jvm.internal.i.f(metaInfo2, "asset.metaInfo");
                    if ((!metaInfo2.isEmpty()) && hashMap2.containsKey(next3.getMetaInfo().get(0))) {
                        hashSet.add(next3.getMetaInfo().get(1));
                    }
                }
                v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new AnonymousClass1(this.$context, hashSet, null), 3);
                ArrayList<OfflineAsset> courseAssets = ApplicationPersistence.getInstance().getCourseAssets();
                kotlin.jvm.internal.i.f(courseAssets, "getInstance().courseAssets");
                q.U1(courseAssets, new AnonymousClass2(hashMap2));
                for (String str6 : hashMap2.keySet()) {
                    Object obj = hashMap2.get(str6);
                    kotlin.jvm.internal.i.d(obj);
                    OfflineAsset offlineAsset2 = new OfflineAsset(((String[]) obj)[0]);
                    Object obj2 = hashMap2.get(str6);
                    kotlin.jvm.internal.i.d(obj2);
                    String[] strArr2 = (String[]) r.a1(((String[]) obj2)[0], new String[]{"/"}, 0, 6).toArray(new String[0]);
                    String str7 = strArr2[strArr2.length - 1];
                    Object obj3 = hashMap2.get(str6);
                    kotlin.jvm.internal.i.d(obj3);
                    Object obj4 = hashMap2.get(str6);
                    kotlin.jvm.internal.i.d(obj4);
                    offlineAsset2.setMetaInfo(ca.a.k(str6, str7, ((String[]) obj3)[1], ((String[]) obj4)[2]));
                    arrayList2.add(offlineAsset2);
                }
            }
            ApplicationPersistence.getInstance().getCourseAssets().addAll(arrayList2);
            ApplicationPersistence.getInstance().updateCourseAssetsSP();
            MyApplication.V.a().g();
            miniCourseFetchUtilInterface = this.this$0.miniFetchUtilInterface;
            if (miniCourseFetchUtilInterface == null || miniCourseFetchUtilInterface2 == null) {
                return;
            }
            miniCourseFetchUtilInterface2.miniCourseFetchComplete(true);
            return;
        }
        int i6 = this.$attempt;
        if (i6 < 3) {
            this.this$0.checkMcSlugUpdate(i6 + 1, this.$context);
        }
    }
}
