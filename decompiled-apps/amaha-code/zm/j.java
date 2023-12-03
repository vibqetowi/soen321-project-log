package zm;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ss.r;
/* compiled from: LibraryDbShortCoursesAdapter.kt */
/* loaded from: classes2.dex */
public final class j extends RecyclerView.e<a> {
    public final String A;
    public ArrayList<MiniCourseMetadata> B;
    public ArrayList<MiniCourse> C;
    public final Context D;

    /* renamed from: x  reason: collision with root package name */
    public final String f39661x;

    /* renamed from: y  reason: collision with root package name */
    public String f39662y;

    /* renamed from: z  reason: collision with root package name */
    public final r<MiniCourseMetadata, MiniCourse, String, Integer, hs.k> f39663z;

    /* compiled from: LibraryDbShortCoursesAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public j(ArrayList mcMetaDataList, ArrayList miniCourseList, String str, String str2, p pVar, r rVar) {
        kotlin.jvm.internal.i.g(mcMetaDataList, "mcMetaDataList");
        kotlin.jvm.internal.i.g(miniCourseList, "miniCourseList");
        this.f39661x = str;
        this.f39662y = str2;
        this.f39663z = rVar;
        this.A = LogHelper.INSTANCE.makeLogTag(j.class);
        this.B = new ArrayList<>();
        new ArrayList();
        this.B = mcMetaDataList;
        this.C = miniCourseList;
        this.D = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.B.size();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:2|3|(1:5)(1:157)|6|(1:8)(1:156)|9|(1:11)(3:98|(1:155)(3:102|(2:103|(4:105|(1:107)(1:152)|108|(2:110|111))(2:153|154))|112)|(3:114|(4:118|(2:119|(4:121|(1:123)(1:130)|124|(2:126|127))(2:131|132))|128|129)|133)(3:134|(4:138|(2:139|(4:141|(1:143)(1:149)|144|(2:146|147))(2:150|151))|148|129)|133))|(1:13)(1:97)|14|(1:16)|17|(1:19)(1:96)|20|(12:25|26|27|(2:29|30)(1:92)|31|32|(1:38)|(8:42|(2:43|(2:45|(3:62|(2:67|(3:69|70|71)(1:73))(3:74|75|(3:77|78|79)(1:80))|72)(3:49|50|(1:52)(0)))(1:82))|53|(1:55)|56|(1:58)|59|(1:61))|83|(1:85)(1:90)|86|88)|95|26|27|(0)(0)|31|32|(3:34|36|38)|(9:40|42|(3:43|(0)(0)|72)|53|(0)|56|(0)|59|(0))|83|(0)(0)|86|88) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018f, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r11, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7 A[Catch: Exception -> 0x02f7, TryCatch #1 {Exception -> 0x02f7, blocks: (B:3:0x000e, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:67:0x00f0, B:69:0x00f7, B:71:0x0102, B:72:0x0106, B:74:0x010c, B:78:0x011d, B:81:0x0126, B:83:0x013a, B:91:0x0194, B:93:0x01a8, B:95:0x01ae, B:97:0x01b6, B:99:0x01d7, B:101:0x01dd, B:102:0x01e1, B:104:0x01e7, B:106:0x01f6, B:108:0x0200, B:110:0x0208, B:111:0x0214, B:113:0x021a, B:115:0x0224, B:117:0x022c, B:118:0x0238, B:120:0x0240, B:121:0x024c, B:123:0x0254, B:124:0x0262, B:126:0x026a, B:127:0x0275, B:129:0x027d, B:130:0x02a8, B:132:0x02c6, B:134:0x02dc, B:133:0x02d2, B:90:0x018f, B:82:0x0130, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:19:0x0055, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:29:0x0076, B:32:0x007c, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:41:0x00a3, B:43:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00be, B:52:0x00c4, B:53:0x00c8, B:55:0x00ce, B:57:0x00db, B:59:0x00e1, B:63:0x00e9, B:86:0x0170, B:87:0x017f), top: B:142:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0254 A[Catch: Exception -> 0x02f7, TryCatch #1 {Exception -> 0x02f7, blocks: (B:3:0x000e, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:67:0x00f0, B:69:0x00f7, B:71:0x0102, B:72:0x0106, B:74:0x010c, B:78:0x011d, B:81:0x0126, B:83:0x013a, B:91:0x0194, B:93:0x01a8, B:95:0x01ae, B:97:0x01b6, B:99:0x01d7, B:101:0x01dd, B:102:0x01e1, B:104:0x01e7, B:106:0x01f6, B:108:0x0200, B:110:0x0208, B:111:0x0214, B:113:0x021a, B:115:0x0224, B:117:0x022c, B:118:0x0238, B:120:0x0240, B:121:0x024c, B:123:0x0254, B:124:0x0262, B:126:0x026a, B:127:0x0275, B:129:0x027d, B:130:0x02a8, B:132:0x02c6, B:134:0x02dc, B:133:0x02d2, B:90:0x018f, B:82:0x0130, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:19:0x0055, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:29:0x0076, B:32:0x007c, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:41:0x00a3, B:43:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00be, B:52:0x00c4, B:53:0x00c8, B:55:0x00ce, B:57:0x00db, B:59:0x00e1, B:63:0x00e9, B:86:0x0170, B:87:0x017f), top: B:142:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a A[Catch: Exception -> 0x02f7, TryCatch #1 {Exception -> 0x02f7, blocks: (B:3:0x000e, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:67:0x00f0, B:69:0x00f7, B:71:0x0102, B:72:0x0106, B:74:0x010c, B:78:0x011d, B:81:0x0126, B:83:0x013a, B:91:0x0194, B:93:0x01a8, B:95:0x01ae, B:97:0x01b6, B:99:0x01d7, B:101:0x01dd, B:102:0x01e1, B:104:0x01e7, B:106:0x01f6, B:108:0x0200, B:110:0x0208, B:111:0x0214, B:113:0x021a, B:115:0x0224, B:117:0x022c, B:118:0x0238, B:120:0x0240, B:121:0x024c, B:123:0x0254, B:124:0x0262, B:126:0x026a, B:127:0x0275, B:129:0x027d, B:130:0x02a8, B:132:0x02c6, B:134:0x02dc, B:133:0x02d2, B:90:0x018f, B:82:0x0130, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:19:0x0055, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:29:0x0076, B:32:0x007c, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:41:0x00a3, B:43:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00be, B:52:0x00c4, B:53:0x00c8, B:55:0x00ce, B:57:0x00db, B:59:0x00e1, B:63:0x00e9, B:86:0x0170, B:87:0x017f), top: B:142:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027d A[Catch: Exception -> 0x02f7, TryCatch #1 {Exception -> 0x02f7, blocks: (B:3:0x000e, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:67:0x00f0, B:69:0x00f7, B:71:0x0102, B:72:0x0106, B:74:0x010c, B:78:0x011d, B:81:0x0126, B:83:0x013a, B:91:0x0194, B:93:0x01a8, B:95:0x01ae, B:97:0x01b6, B:99:0x01d7, B:101:0x01dd, B:102:0x01e1, B:104:0x01e7, B:106:0x01f6, B:108:0x0200, B:110:0x0208, B:111:0x0214, B:113:0x021a, B:115:0x0224, B:117:0x022c, B:118:0x0238, B:120:0x0240, B:121:0x024c, B:123:0x0254, B:124:0x0262, B:126:0x026a, B:127:0x0275, B:129:0x027d, B:130:0x02a8, B:132:0x02c6, B:134:0x02dc, B:133:0x02d2, B:90:0x018f, B:82:0x0130, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:19:0x0055, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:29:0x0076, B:32:0x007c, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:41:0x00a3, B:43:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00be, B:52:0x00c4, B:53:0x00c8, B:55:0x00ce, B:57:0x00db, B:59:0x00e1, B:63:0x00e9, B:86:0x0170, B:87:0x017f), top: B:142:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c6 A[Catch: Exception -> 0x02f7, TryCatch #1 {Exception -> 0x02f7, blocks: (B:3:0x000e, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:67:0x00f0, B:69:0x00f7, B:71:0x0102, B:72:0x0106, B:74:0x010c, B:78:0x011d, B:81:0x0126, B:83:0x013a, B:91:0x0194, B:93:0x01a8, B:95:0x01ae, B:97:0x01b6, B:99:0x01d7, B:101:0x01dd, B:102:0x01e1, B:104:0x01e7, B:106:0x01f6, B:108:0x0200, B:110:0x0208, B:111:0x0214, B:113:0x021a, B:115:0x0224, B:117:0x022c, B:118:0x0238, B:120:0x0240, B:121:0x024c, B:123:0x0254, B:124:0x0262, B:126:0x026a, B:127:0x0275, B:129:0x027d, B:130:0x02a8, B:132:0x02c6, B:134:0x02dc, B:133:0x02d2, B:90:0x018f, B:82:0x0130, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:19:0x0055, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:29:0x0076, B:32:0x007c, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:41:0x00a3, B:43:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00be, B:52:0x00c4, B:53:0x00c8, B:55:0x00ce, B:57:0x00db, B:59:0x00e1, B:63:0x00e9, B:86:0x0170, B:87:0x017f), top: B:142:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d2 A[Catch: Exception -> 0x02f7, TryCatch #1 {Exception -> 0x02f7, blocks: (B:3:0x000e, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:67:0x00f0, B:69:0x00f7, B:71:0x0102, B:72:0x0106, B:74:0x010c, B:78:0x011d, B:81:0x0126, B:83:0x013a, B:91:0x0194, B:93:0x01a8, B:95:0x01ae, B:97:0x01b6, B:99:0x01d7, B:101:0x01dd, B:102:0x01e1, B:104:0x01e7, B:106:0x01f6, B:108:0x0200, B:110:0x0208, B:111:0x0214, B:113:0x021a, B:115:0x0224, B:117:0x022c, B:118:0x0238, B:120:0x0240, B:121:0x024c, B:123:0x0254, B:124:0x0262, B:126:0x026a, B:127:0x0275, B:129:0x027d, B:130:0x02a8, B:132:0x02c6, B:134:0x02dc, B:133:0x02d2, B:90:0x018f, B:82:0x0130, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:19:0x0055, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:29:0x0076, B:32:0x007c, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:41:0x00a3, B:43:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00be, B:52:0x00c4, B:53:0x00c8, B:55:0x00ce, B:57:0x00db, B:59:0x00e1, B:63:0x00e9, B:86:0x0170, B:87:0x017f), top: B:142:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024c A[EDGE_INSN: B:145:0x024c->B:121:0x024c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #0 {Exception -> 0x018e, blocks: (B:86:0x0170, B:87:0x017f), top: B:140:0x016c, outer: #1 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        String str;
        String str2;
        MiniCourse miniCourse;
        ArrayList<MiniCourse> topicalCourseList;
        Object obj;
        MiniCourse miniCourse2;
        String str3;
        MiniCourse miniCourse3;
        ArrayList<MiniCourse> miniCourses;
        Object obj2;
        String str4;
        ArrayList<MiniCourse> miniCourses2;
        Object obj3;
        String str5;
        ArrayList<CourseDayModelV1> arrayList;
        boolean z10;
        int v10;
        HashMap<String, Object> libraryContent;
        Iterator<CourseDayModelV1> it;
        Object obj4;
        Object obj5;
        Object obj6;
        HashMap<String, Object> libraryContent2;
        Object obj7;
        a aVar2 = aVar;
        Context context = this.D;
        String str6 = this.A;
        View view = aVar2.f2751a;
        try {
            MiniCourseMetadata miniCourseMetadata = this.B.get(i6);
            String str7 = null;
            if (miniCourseMetadata != null) {
                str = miniCourseMetadata.getSlug();
            } else {
                str = null;
            }
            MiniCourse miniCourse4 = this.C.get(i6);
            if (miniCourse4 != null) {
                str2 = miniCourse4.getDomain();
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.i.b(str, str2)) {
                miniCourse3 = this.C.get(i6);
            } else {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (miniCourses2 = user.getMiniCourses()) != null) {
                    Iterator<T> it2 = miniCourses2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            String domain = ((MiniCourse) obj3).getDomain();
                            if (miniCourseMetadata != null) {
                                str5 = miniCourseMetadata.getSlug();
                            } else {
                                str5 = null;
                            }
                            if (kotlin.jvm.internal.i.b(domain, str5)) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    miniCourse = (MiniCourse) obj3;
                } else {
                    miniCourse = null;
                }
                if (miniCourse != null) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (miniCourses = user2.getMiniCourses()) != null) {
                        Iterator<T> it3 = miniCourses.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                String domain2 = ((MiniCourse) obj2).getDomain();
                                if (miniCourseMetadata != null) {
                                    str4 = miniCourseMetadata.getSlug();
                                } else {
                                    str4 = null;
                                }
                                if (kotlin.jvm.internal.i.b(domain2, str4)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        miniCourse2 = (MiniCourse) obj2;
                        miniCourse3 = miniCourse2;
                    }
                    miniCourse3 = null;
                } else {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null && (topicalCourseList = user3.getTopicalCourseList()) != null) {
                        Iterator<T> it4 = topicalCourseList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj = it4.next();
                                String domain3 = ((MiniCourse) obj).getDomain();
                                if (miniCourseMetadata != null) {
                                    str3 = miniCourseMetadata.getSlug();
                                } else {
                                    str3 = null;
                                }
                                if (kotlin.jvm.internal.i.b(domain3, str3)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        miniCourse2 = (MiniCourse) obj;
                        miniCourse3 = miniCourse2;
                    }
                    miniCourse3 = null;
                }
            }
            if (miniCourse3 != null) {
                arrayList = miniCourse3.getPlan();
            } else {
                arrayList = null;
            }
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowScHeader);
            if (miniCourseMetadata != null) {
                str7 = miniCourseMetadata.getName();
            }
            robertoTextView.setText(str7);
            if (miniCourseMetadata != null) {
                z10 = kotlin.jvm.internal.i.b(miniCourseMetadata.isFree(), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (!z10 && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                ((RobertoTextView) view.findViewById(R.id.tvLibraryShortCoursesPremiumTag2)).setVisibility(0);
                ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).setLayoutManager(new LinearLayoutManager(context, 1, false));
                ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).suppressLayout(false);
                ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).setNestedScrollingEnabled(true);
                kotlin.jvm.internal.i.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                v10 = v(arrayList);
                ArrayList arrayList2 = new ArrayList();
                if (v10 <= 0) {
                    arrayList2.add(arrayList.get(v10 - 1));
                    arrayList2.add(arrayList.get(v10));
                } else {
                    arrayList2.add(arrayList.get(0));
                    arrayList2.add(arrayList.get(1));
                }
                ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).setAdapter(new h(arrayList2, v10, arrayList.size(), context));
                if (miniCourseMetadata != null && (libraryContent2 = miniCourseMetadata.getLibraryContent()) != null && (obj7 = libraryContent2.get("libraryBanner")) != null) {
                    Glide.g(context).p((String) obj7).x(new z4.f()).B((AppCompatImageView) view.findViewById(R.id.tvRowScImage));
                }
                if (miniCourseMetadata != null && (libraryContent = miniCourseMetadata.getLibraryContent()) != null) {
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        CourseDayModelV1 next = it.next();
                        if (!next.isCompleted() && kotlin.jvm.internal.i.b(next, u.g2(arrayList))) {
                            Object obj8 = libraryContent.get("libraryCtaNew");
                            if (obj8 != null) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowScCtaText)).setText((String) obj8);
                            }
                        } else if (next.isCompleted() && kotlin.jvm.internal.i.b(next, u.o2(arrayList))) {
                            Object obj9 = libraryContent.get("libraryCtaComplete");
                            if (obj9 != null) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowScCtaText)).setText((String) obj9);
                            }
                        } else {
                            Object obj10 = libraryContent.get("libraryCtaProgress");
                            if (obj10 != null) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowScCtaText)).setText((String) obj10);
                            }
                        }
                    }
                    obj4 = libraryContent.get("libraryCourseDescription");
                    if (obj4 != null) {
                        ((RobertoTextView) view.findViewById(R.id.tvRowScSubHeader)).setText((String) obj4);
                    }
                    obj5 = libraryContent.get("libraryPremiumTag");
                    if (obj5 != null) {
                        ((RobertoTextView) view.findViewById(R.id.tvLibraryShortCoursesPremiumTag2)).setText((String) obj5);
                    }
                    obj6 = libraryContent.get("libraryProgress");
                    if (obj6 != null) {
                        ((RobertoTextView) view.findViewById(R.id.tvRowScDescription)).setText(n.F0(n.F0((String) obj6, "'x'", String.valueOf(v(arrayList) + 1)), "'y'", String.valueOf(arrayList.size())));
                    }
                }
                view.findViewById(R.id.viewRowScAnimationClick).setOnClickListener(new i(aVar2, miniCourseMetadata, i6, this, arrayList, miniCourse3));
                if (i6 != 0) {
                    ((MotionLayout) view.findViewById(R.id.clRowScContainer)).setProgress(1.0f);
                } else {
                    ((MotionLayout) view.findViewById(R.id.clRowScContainer)).setProgress(0.0f);
                }
                ((ConstraintLayout) view.findViewById(R.id.clRowScCtaContainer)).setOnClickListener(new i(this, miniCourseMetadata, miniCourse3, i6, aVar2, arrayList));
            }
            ((RobertoTextView) view.findViewById(R.id.tvLibraryShortCoursesPremiumTag2)).setVisibility(4);
            ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).setLayoutManager(new LinearLayoutManager(context, 1, false));
            ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).suppressLayout(false);
            ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).setNestedScrollingEnabled(true);
            kotlin.jvm.internal.i.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
            v10 = v(arrayList);
            ArrayList arrayList22 = new ArrayList();
            if (v10 <= 0) {
            }
            ((RecyclerView) view.findViewById(R.id.rvShortCoursesPlan)).setAdapter(new h(arrayList22, v10, arrayList.size(), context));
            if (miniCourseMetadata != null) {
                Glide.g(context).p((String) obj7).x(new z4.f()).B((AppCompatImageView) view.findViewById(R.id.tvRowScImage));
            }
            if (miniCourseMetadata != null) {
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                obj4 = libraryContent.get("libraryCourseDescription");
                if (obj4 != null) {
                }
                obj5 = libraryContent.get("libraryPremiumTag");
                if (obj5 != null) {
                }
                obj6 = libraryContent.get("libraryProgress");
                if (obj6 != null) {
                }
            }
            view.findViewById(R.id.viewRowScAnimationClick).setOnClickListener(new i(aVar2, miniCourseMetadata, i6, this, arrayList, miniCourse3));
            if (i6 != 0) {
            }
            ((ConstraintLayout) view.findViewById(R.id.clRowScCtaContainer)).setOnClickListener(new i(this, miniCourseMetadata, miniCourse3, i6, aVar2, arrayList));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str6, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_short_courses, parent, false, "from(parent.context)\n   …t_courses, parent, false)"));
        aVar.s(false);
        return aVar;
    }

    public final int v(ArrayList<CourseDayModelV1> arrayList) {
        boolean z10;
        int i6 = 0;
        try {
            Iterator<CourseDayModelV1> it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                try {
                    CourseDayModelV1 next = it.next();
                    if (next != null) {
                        z10 = true;
                        if (next.isCompleted()) {
                            if (!z10 && !kotlin.jvm.internal.i.b(next, u.o2(arrayList))) {
                                i10++;
                            }
                        }
                    }
                    z10 = false;
                    return !z10 ? i10 : i10;
                } catch (Exception e10) {
                    e = e10;
                    i6 = i10;
                    LogHelper.INSTANCE.e(this.A, e);
                    return i6;
                }
            }
            return i10;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void w(String str, ArrayList mcMetaDataList, ArrayList miniCourseList) {
        kotlin.jvm.internal.i.g(mcMetaDataList, "mcMetaDataList");
        kotlin.jvm.internal.i.g(miniCourseList, "miniCourseList");
        try {
            this.B = mcMetaDataList;
            this.C = miniCourseList;
            this.f39662y = str;
            i();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }
}
