package il;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.j1;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ss.s;
/* compiled from: NewDashboardSavedItemsAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {
    public final HashMap<String, MiniCourse> A;
    public final HashMap<String, MiniCourseMetadata> B;
    public final HashMap<String, String> C;
    public final s<String, String, String, String, UserLibraryItemAccessModel, hs.k> D;
    public final String E = LogHelper.INSTANCE.makeLogTag("LibraryAllTopPicksAdapter");
    public final ArrayList<UserLibraryItemAccessModel> F;
    public String G;
    public final s5 H;

    /* renamed from: x  reason: collision with root package name */
    public List<UserLibraryItemAccessModel> f20353x;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, LearningHubModel> f20354y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, LibraryCollection> f20355z;

    /* compiled from: NewDashboardSavedItemsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public c(List list, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, HashMap hashMap5, fl.p pVar) {
        this.f20353x = list;
        this.f20354y = hashMap;
        this.f20355z = hashMap2;
        this.A = hashMap3;
        this.B = hashMap4;
        this.C = hashMap5;
        this.D = pVar;
        ArrayList<UserLibraryItemAccessModel> arrayList = new ArrayList<>();
        this.F = arrayList;
        this.G = "all";
        this.H = new s5(12);
        arrayList.addAll(this.f20353x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.F.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        String str;
        LearningHubModel learningHubModel;
        UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) u.j2(i6, this.F);
        String str2 = null;
        if (userLibraryItemAccessModel != null) {
            str = userLibraryItemAccessModel.getParentType();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1617276757:
                    if (str.equals("suggested_activity")) {
                        return 6;
                    }
                    break;
                case -341064690:
                    if (str.equals("resource")) {
                        HashMap<String, LearningHubModel> hashMap = this.f20354y;
                        if (hashMap != null && (learningHubModel = hashMap.get(userLibraryItemAccessModel.getId())) != null) {
                            str2 = learningHubModel.getPost_type();
                        }
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1864532585:
                                    if (str2.equals("Quotes")) {
                                        return 3;
                                    }
                                    break;
                                case -1732810888:
                                    if (str2.equals("Videos")) {
                                        return 4;
                                    }
                                    break;
                                case -1692490108:
                                    if (str2.equals("Creatives")) {
                                        return 1;
                                    }
                                    break;
                                case -1164233123:
                                    if (str2.equals("Articles")) {
                                        return 2;
                                    }
                                    break;
                                case -312086034:
                                    if (str2.equals("Therapist says")) {
                                        return 0;
                                    }
                                    break;
                                case 2606936:
                                    str2.equals("Tips");
                                    break;
                            }
                        }
                        return 5;
                    }
                    break;
                case 955611395:
                    if (str.equals("mini_course")) {
                        return 7;
                    }
                    break;
                case 1853891989:
                    str.equals("collections");
                    break;
            }
        }
        return 8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        switch (i6) {
            case 0:
                return new a(defpackage.e.h(parent, R.layout.row_new_db_resource_quotes, parent, false, "from(parent.context).inf…ce_quotes, parent, false)"));
            case 1:
                return new a(defpackage.e.h(parent, R.layout.row_new_db_resource_creatives, parent, false, "from(parent.context).inf…creatives, parent, false)"));
            case 2:
                return new a(defpackage.e.h(parent, R.layout.row_new_db_resource_article, parent, false, "from(parent.context).inf…e_article, parent, false)"));
            case 3:
                return new a(defpackage.e.h(parent, R.layout.row_new_db_resource_quotes, parent, false, "from(parent.context).inf…ce_quotes, parent, false)"));
            case 4:
                return new a(defpackage.e.h(parent, R.layout.row_new_db_resource_video, parent, false, "from(parent.context).inf…rce_video, parent, false)"));
            case 5:
                return new a(defpackage.e.h(parent, R.layout.row_new_db_resource_quotes, parent, false, "from(parent.context).inf…ce_quotes, parent, false)"));
            case 6:
                return new a(defpackage.e.h(parent, R.layout.row_all_top_picks_saved_item, parent, false, "from(parent.context).inf…aved_item, parent, false)"));
            case 7:
                return new a(defpackage.e.h(parent, R.layout.row_all_top_picks_saved_item, parent, false, "from(parent.context).inf…aved_item, parent, false)"));
            case 8:
                return new a(defpackage.e.h(parent, R.layout.row_all_top_picks_saved_item, parent, false, "from(parent.context).inf…aved_item, parent, false)"));
            default:
                return new a(defpackage.e.h(parent, R.layout.row_all_top_picks_saved_item, parent, false, "from(parent.context).inf…aved_item, parent, false)"));
        }
    }

    public final boolean v(String chipFilter, boolean z10) {
        kotlin.jvm.internal.i.g(chipFilter, "chipFilter");
        try {
            if (!kotlin.jvm.internal.i.b(this.G, chipFilter) || z10) {
                ArrayList<UserLibraryItemAccessModel> arrayList = this.F;
                arrayList.clear();
                this.G = chipFilter;
                switch (chipFilter.hashCode()) {
                    case -1983070683:
                        if (chipFilter.equals("resources")) {
                            List<UserLibraryItemAccessModel> list = this.f20353x;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list) {
                                if (kotlin.jvm.internal.i.b(((UserLibraryItemAccessModel) obj).getParentType(), "resource")) {
                                    arrayList2.add(obj);
                                }
                            }
                            arrayList.addAll(arrayList2);
                            break;
                        } else {
                            break;
                        }
                    case 96673:
                        if (chipFilter.equals("all")) {
                            arrayList.addAll(this.f20353x);
                            break;
                        } else {
                            break;
                        }
                    case 957948856:
                        if (chipFilter.equals("courses")) {
                            List<UserLibraryItemAccessModel> list2 = this.f20353x;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (kotlin.jvm.internal.i.b(((UserLibraryItemAccessModel) obj2).getParentType(), "mini_course")) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList.addAll(arrayList3);
                            break;
                        } else {
                            break;
                        }
                    case 2048605165:
                        if (chipFilter.equals(Constants.SCREEN_ACTIVITIES)) {
                            List<UserLibraryItemAccessModel> list3 = this.f20353x;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : list3) {
                                if (is.k.Q1(((UserLibraryItemAccessModel) obj3).getParentType(), new String[]{"collections", "suggested_activity"})) {
                                    arrayList4.add(obj3);
                                }
                            }
                            arrayList.addAll(arrayList4);
                            break;
                        } else {
                            break;
                        }
                }
                i();
                return arrayList.isEmpty();
            }
            return false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x040f A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x046f A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0478 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04e1 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0525 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0539 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05ca A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x062a A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0633 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x069c A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x06e0 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06f4 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x074a A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0754 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x07bd A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0801 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0808 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0813 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0827 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x08b8 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:3:0x0002, B:5:0x000e, B:9:0x003e, B:11:0x0042, B:13:0x004f, B:15:0x0055, B:16:0x0065, B:18:0x006d, B:19:0x007d, B:27:0x0092, B:38:0x00b1, B:64:0x0112, B:74:0x012d, B:76:0x0135, B:78:0x013b, B:81:0x0144, B:83:0x0158, B:87:0x0164, B:89:0x016b, B:67:0x011b, B:69:0x0121, B:73:0x012a, B:42:0x00bc, B:44:0x00c2, B:45:0x00c6, B:47:0x00cc, B:51:0x00e4, B:53:0x00e8, B:55:0x00ee, B:57:0x00f6, B:63:0x010f, B:31:0x009d, B:33:0x00a3, B:37:0x00ae, B:22:0x0086, B:26:0x008f, B:90:0x0170, B:92:0x0174, B:94:0x0181, B:96:0x0185, B:98:0x0192, B:100:0x0198, B:101:0x01a8, B:103:0x01b0, B:104:0x01c0, B:112:0x01d5, B:137:0x0243, B:147:0x025e, B:156:0x0275, B:158:0x0280, B:160:0x0286, B:163:0x028f, B:165:0x0295, B:169:0x02a1, B:171:0x02a8, B:151:0x0269, B:155:0x0272, B:140:0x024c, B:142:0x0252, B:146:0x025b, B:115:0x01de, B:117:0x01e4, B:119:0x01e9, B:121:0x01ef, B:122:0x01f4, B:124:0x01fa, B:130:0x0219, B:132:0x0223, B:134:0x0229, B:135:0x0235, B:127:0x020f, B:136:0x023e, B:107:0x01c9, B:111:0x01d2, B:172:0x02ad, B:174:0x02b3, B:177:0x02c1, B:179:0x02ca, B:181:0x02d2, B:182:0x02db, B:184:0x02e3, B:185:0x02f3, B:193:0x0308, B:207:0x0337, B:217:0x0352, B:221:0x0366, B:223:0x0371, B:225:0x0377, B:228:0x0380, B:230:0x0386, B:234:0x0392, B:236:0x0399, B:220:0x035b, B:210:0x0340, B:212:0x0346, B:216:0x034f, B:196:0x0311, B:198:0x0315, B:200:0x031b, B:202:0x0329, B:206:0x0334, B:188:0x02fc, B:192:0x0305, B:238:0x03a0, B:240:0x03ad, B:250:0x03ce, B:274:0x041d, B:276:0x0428, B:254:0x03dc, B:256:0x03e2, B:257:0x03e6, B:259:0x03ec, B:263:0x0400, B:265:0x0404, B:267:0x040b, B:269:0x040f, B:273:0x041a, B:243:0x03b9, B:245:0x03bf, B:249:0x03cb, B:278:0x043c, B:280:0x0449, B:302:0x04a0, B:328:0x04f0, B:330:0x04f6, B:331:0x04fa, B:333:0x0500, B:337:0x0516, B:339:0x051a, B:341:0x0521, B:343:0x0525, B:346:0x052d, B:352:0x0539, B:354:0x0544, B:306:0x04ae, B:308:0x04b4, B:309:0x04b8, B:311:0x04be, B:315:0x04d2, B:317:0x04d6, B:319:0x04dd, B:321:0x04e1, B:326:0x04eb, B:284:0x0457, B:287:0x0460, B:294:0x046f, B:301:0x049d, B:295:0x0478, B:297:0x048c, B:300:0x0494, B:356:0x055b, B:358:0x0568, B:368:0x0589, B:392:0x05d8, B:394:0x05e3, B:372:0x0597, B:374:0x059d, B:375:0x05a1, B:377:0x05a7, B:381:0x05bb, B:383:0x05bf, B:385:0x05c6, B:387:0x05ca, B:391:0x05d5, B:361:0x0574, B:363:0x057a, B:367:0x0586, B:396:0x05f7, B:398:0x0604, B:420:0x065b, B:446:0x06ab, B:448:0x06b1, B:449:0x06b5, B:451:0x06bb, B:455:0x06d1, B:457:0x06d5, B:459:0x06dc, B:461:0x06e0, B:464:0x06e8, B:470:0x06f4, B:472:0x06ff, B:424:0x0669, B:426:0x066f, B:427:0x0673, B:429:0x0679, B:433:0x068d, B:435:0x0691, B:437:0x0698, B:439:0x069c, B:444:0x06a6, B:402:0x0612, B:405:0x061b, B:412:0x062a, B:419:0x0658, B:413:0x0633, B:415:0x0647, B:418:0x064f, B:474:0x0716, B:476:0x0723, B:498:0x077c, B:524:0x07cc, B:526:0x07d2, B:527:0x07d6, B:529:0x07dc, B:533:0x07f2, B:535:0x07f6, B:537:0x07fd, B:539:0x0801, B:542:0x0808, B:544:0x080f, B:546:0x0813, B:549:0x081b, B:555:0x0827, B:557:0x0832, B:502:0x078a, B:504:0x0790, B:505:0x0794, B:507:0x079a, B:511:0x07ae, B:513:0x07b2, B:515:0x07b9, B:517:0x07bd, B:522:0x07c7, B:480:0x0732, B:483:0x073b, B:490:0x074a, B:497:0x0779, B:491:0x0754, B:493:0x0768, B:496:0x0770, B:559:0x0849, B:561:0x0856, B:571:0x0877, B:595:0x08c6, B:597:0x08d1, B:575:0x0885, B:577:0x088b, B:578:0x088f, B:580:0x0895, B:584:0x08a9, B:586:0x08ad, B:588:0x08b4, B:590:0x08b8, B:594:0x08c3, B:564:0x0862, B:566:0x0868, B:570:0x0874, B:598:0x08e1), top: B:603:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x08c1  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        LearningHubModel learningHubModel;
        String str;
        Object obj;
        String str2;
        ArrayList<LearningHubFieldModel> fields;
        Object obj2;
        LearningHubModel learningHubModel2;
        String str3;
        boolean z10;
        String string;
        Object obj3;
        String str4;
        ArrayList<LearningHubFieldModel> fields2;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        Object obj6;
        String str5;
        boolean z11;
        AppCompatImageView appCompatImageView;
        ArrayList<LearningHubFieldModel> fields3;
        Object obj7;
        LearningHubModel learningHubModel3;
        String str6;
        boolean z12;
        String string2;
        Object obj8;
        String str7;
        ArrayList<LearningHubFieldModel> fields4;
        Object obj9;
        Object obj10;
        String str8;
        boolean z13;
        AppCompatImageView appCompatImageView2;
        ArrayList<LearningHubFieldModel> fields5;
        Object obj11;
        LearningHubModel learningHubModel4;
        String str9;
        Object obj12;
        String str10;
        ArrayList<LearningHubFieldModel> fields6;
        Object obj13;
        LearningHubModel learningHubModel5;
        String str11;
        boolean z14;
        String string3;
        Object obj14;
        String str12;
        ArrayList<LearningHubFieldModel> fields7;
        Object obj15;
        Object obj16;
        String str13;
        boolean z15;
        AppCompatImageView appCompatImageView3;
        ArrayList<LearningHubFieldModel> fields8;
        Object obj17;
        LearningHubModel learningHubModel6;
        String str14;
        Object obj18;
        String str15;
        ArrayList<LearningHubFieldModel> fields9;
        Object obj19;
        String str16;
        String str17;
        String str18;
        int i10;
        String str19;
        int i11;
        MiniCourseMetadata miniCourseMetadata;
        MiniCourse miniCourse;
        int i12;
        ArrayList<CourseDayModelV1> plan;
        ArrayList<CourseDayModelV1> plan2;
        String str20;
        String str21;
        int i13;
        String str22;
        LibraryCollection libraryCollection;
        String str23;
        ArrayList<String> strings;
        String str24;
        ArrayList<LibraryCollectionItem> itemList;
        Object obj20;
        ArrayList<String> strings2;
        String str25;
        String str26;
        int i14;
        String str27;
        try {
            UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) u.j2(i6, this.F);
            if (userLibraryItemAccessModel != null) {
                View view = aVar.f2751a;
                int g5 = aVar.g();
                HashMap<String, LearningHubModel> hashMap = this.f20354y;
                String str28 = null;
                switch (g5) {
                    case 0:
                        if (hashMap != null) {
                            learningHubModel = hashMap.get(userLibraryItemAccessModel.getId());
                        } else {
                            learningHubModel = null;
                        }
                        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesDescription);
                        if (robertoTextView != null) {
                            Context context = view.getContext();
                            if (context == null || (str = context.getString(R.string.therapistSays)) == null) {
                                str = "";
                            }
                            robertoTextView.setText(str);
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesHeader);
                        if (robertoTextView2 != null) {
                            if (learningHubModel != null && (fields = learningHubModel.getFields()) != null) {
                                Iterator<T> it = fields.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj2).getData_title(), "short_desc")) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj2;
                                if (learningHubFieldModel != null) {
                                    obj = learningHubFieldModel.getValue();
                                    if (obj instanceof String) {
                                        str28 = obj;
                                    }
                                    if (str28 != null) {
                                        str2 = "";
                                    } else {
                                        str2 = str28;
                                    }
                                    robertoTextView2.setText(str2);
                                }
                            }
                            obj = null;
                            if (obj instanceof String) {
                            }
                            if (str28 != null) {
                            }
                            robertoTextView2.setText(str2);
                        }
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesQuotes);
                        if (appCompatImageView4 != null) {
                            appCompatImageView4.setImageDrawable(g0.a.d(view.getContext(), R.drawable.ic_resources_therapist_says_bg));
                            hs.k kVar = hs.k.f19476a;
                            break;
                        }
                        break;
                    case 1:
                        if (hashMap != null) {
                            learningHubModel2 = hashMap.get(userLibraryItemAccessModel.getId());
                        } else {
                            learningHubModel2 = null;
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesCreativesDescription);
                        if (robertoTextView3 != null) {
                            if (learningHubModel2 != null) {
                                str3 = learningHubModel2.getDuration();
                            } else {
                                str3 = null;
                            }
                            if (str3 != null && !gv.n.B0(str3)) {
                                z10 = false;
                                if (!z10) {
                                    string = view.getContext().getString(R.string.creative);
                                } else {
                                    Context context2 = view.getContext();
                                    Object[] objArr = new Object[2];
                                    objArr[0] = view.getContext().getString(R.string.creative);
                                    objArr[1] = (learningHubModel2 == null || (r5 = learningHubModel2.getDuration()) == null) ? "" : "";
                                    string = context2.getString(R.string.dbRaExperimentSubHeader, objArr);
                                }
                                robertoTextView3.setText(string);
                            }
                            z10 = true;
                            if (!z10) {
                            }
                            robertoTextView3.setText(string);
                        }
                        RobertoTextView robertoTextView4 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesCreativesHeader);
                        if (robertoTextView4 != null) {
                            if (learningHubModel2 != null && (fields2 = learningHubModel2.getFields()) != null) {
                                Iterator<T> it2 = fields2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj4).getData_title(), "title")) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj4;
                                if (learningHubFieldModel2 != null) {
                                    obj3 = learningHubFieldModel2.getValue();
                                    if (!(obj3 instanceof String)) {
                                        str4 = (String) obj3;
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        str4 = "";
                                    }
                                    robertoTextView4.setText(str4);
                                }
                            }
                            obj3 = null;
                            if (!(obj3 instanceof String)) {
                            }
                            if (str4 != null) {
                            }
                            robertoTextView4.setText(str4);
                        }
                        if (learningHubModel2 != null && (fields3 = learningHubModel2.getFields()) != null) {
                            Iterator<T> it3 = fields3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj7 = it3.next();
                                    if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj7).getData_title(), "infographic")) {
                                    }
                                } else {
                                    obj7 = null;
                                }
                            }
                            LearningHubFieldModel learningHubFieldModel3 = (LearningHubFieldModel) obj7;
                            if (learningHubFieldModel3 != null) {
                                obj5 = learningHubFieldModel3.getValue();
                                if (!(obj5 instanceof ArrayList)) {
                                    arrayList = (ArrayList) obj5;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null) {
                                    obj6 = u.i2(arrayList);
                                } else {
                                    obj6 = null;
                                }
                                if (obj6 instanceof String) {
                                    str28 = (String) obj6;
                                }
                                str5 = str28;
                                if (str5 != null && !gv.n.B0(str5)) {
                                    z11 = false;
                                    if (!z11 && (appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesCreatives)) != null) {
                                        com.bumptech.glide.e<Bitmap> a10 = Glide.g(view.getContext()).a();
                                        a10.Z = str5;
                                        a10.f5953b0 = true;
                                        a10.B(appCompatImageView);
                                        break;
                                    }
                                }
                                z11 = true;
                                if (!z11) {
                                    com.bumptech.glide.e<Bitmap> a102 = Glide.g(view.getContext()).a();
                                    a102.Z = str5;
                                    a102.f5953b0 = true;
                                    a102.B(appCompatImageView);
                                }
                            }
                        }
                        obj5 = null;
                        if (!(obj5 instanceof ArrayList)) {
                        }
                        if (arrayList == null) {
                        }
                        if (obj6 instanceof String) {
                        }
                        str5 = str28;
                        if (str5 != null) {
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        break;
                    case 2:
                        if (hashMap != null) {
                            learningHubModel3 = hashMap.get(userLibraryItemAccessModel.getId());
                        } else {
                            learningHubModel3 = null;
                        }
                        RobertoTextView robertoTextView5 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription);
                        if (robertoTextView5 != null) {
                            if (learningHubModel3 != null) {
                                str6 = learningHubModel3.getDuration();
                            } else {
                                str6 = null;
                            }
                            if (str6 != null && !gv.n.B0(str6)) {
                                z12 = false;
                                if (!z12) {
                                    string2 = view.getContext().getString(R.string.article);
                                } else {
                                    Context context3 = view.getContext();
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = view.getContext().getString(R.string.article);
                                    objArr2[1] = (learningHubModel3 == null || (r6 = learningHubModel3.getDuration()) == null) ? "" : "";
                                    string2 = context3.getString(R.string.dbRaExperimentSubHeader, objArr2);
                                }
                                robertoTextView5.setText(string2);
                            }
                            z12 = true;
                            if (!z12) {
                            }
                            robertoTextView5.setText(string2);
                        }
                        RobertoTextView robertoTextView6 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleHeader);
                        if (robertoTextView6 != null) {
                            if (learningHubModel3 != null && (fields4 = learningHubModel3.getFields()) != null) {
                                Iterator<T> it4 = fields4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj9 = it4.next();
                                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj9).getData_title(), "title")) {
                                        }
                                    } else {
                                        obj9 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel4 = (LearningHubFieldModel) obj9;
                                if (learningHubFieldModel4 != null) {
                                    obj8 = learningHubFieldModel4.getValue();
                                    if (!(obj8 instanceof String)) {
                                        str7 = (String) obj8;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        str7 = "";
                                    }
                                    robertoTextView6.setText(str7);
                                }
                            }
                            obj8 = null;
                            if (!(obj8 instanceof String)) {
                            }
                            if (str7 != null) {
                            }
                            robertoTextView6.setText(str7);
                        }
                        if (learningHubModel3 != null && (fields5 = learningHubModel3.getFields()) != null) {
                            Iterator<T> it5 = fields5.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    obj11 = it5.next();
                                    if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj11).getData_title(), "cover")) {
                                    }
                                } else {
                                    obj11 = null;
                                }
                            }
                            LearningHubFieldModel learningHubFieldModel5 = (LearningHubFieldModel) obj11;
                            if (learningHubFieldModel5 != null) {
                                obj10 = learningHubFieldModel5.getValue();
                                if (obj10 instanceof String) {
                                    str28 = obj10;
                                }
                                str8 = str28;
                                if (str8 != null && !gv.n.B0(str8)) {
                                    z13 = false;
                                    if (!z13 && (appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesArticle)) != null) {
                                        com.bumptech.glide.e<Bitmap> a11 = Glide.g(view.getContext()).a();
                                        a11.Z = str8;
                                        a11.f5953b0 = true;
                                        a11.B(appCompatImageView2);
                                        break;
                                    }
                                }
                                z13 = true;
                                if (!z13) {
                                    com.bumptech.glide.e<Bitmap> a112 = Glide.g(view.getContext()).a();
                                    a112.Z = str8;
                                    a112.f5953b0 = true;
                                    a112.B(appCompatImageView2);
                                }
                            }
                        }
                        obj10 = null;
                        if (obj10 instanceof String) {
                        }
                        str8 = str28;
                        if (str8 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        break;
                    case 3:
                        if (hashMap != null) {
                            learningHubModel4 = hashMap.get(userLibraryItemAccessModel.getId());
                        } else {
                            learningHubModel4 = null;
                        }
                        RobertoTextView robertoTextView7 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesDescription);
                        if (robertoTextView7 != null) {
                            Context context4 = view.getContext();
                            if (context4 == null || (str9 = context4.getString(R.string.quote)) == null) {
                                str9 = "";
                            }
                            robertoTextView7.setText(str9);
                        }
                        RobertoTextView robertoTextView8 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesHeader);
                        if (robertoTextView8 != null) {
                            if (learningHubModel4 != null && (fields6 = learningHubModel4.getFields()) != null) {
                                Iterator<T> it6 = fields6.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj13 = it6.next();
                                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj13).getData_title(), "short_desc")) {
                                        }
                                    } else {
                                        obj13 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel6 = (LearningHubFieldModel) obj13;
                                if (learningHubFieldModel6 != null) {
                                    obj12 = learningHubFieldModel6.getValue();
                                    if (obj12 instanceof String) {
                                        str28 = obj12;
                                    }
                                    if (str28 != null) {
                                        str10 = "";
                                    } else {
                                        str10 = str28;
                                    }
                                    robertoTextView8.setText(str10);
                                }
                            }
                            obj12 = null;
                            if (obj12 instanceof String) {
                            }
                            if (str28 != null) {
                            }
                            robertoTextView8.setText(str10);
                        }
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesQuotes);
                        if (appCompatImageView5 != null) {
                            appCompatImageView5.setImageDrawable(g0.a.d(view.getContext(), R.drawable.ic_resources_quotes_bg));
                            hs.k kVar2 = hs.k.f19476a;
                            break;
                        }
                        break;
                    case 4:
                        if (hashMap != null) {
                            learningHubModel5 = hashMap.get(userLibraryItemAccessModel.getId());
                        } else {
                            learningHubModel5 = null;
                        }
                        RobertoTextView robertoTextView9 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesVideoDescription);
                        if (robertoTextView9 != null) {
                            if (learningHubModel5 != null) {
                                str11 = learningHubModel5.getDuration();
                            } else {
                                str11 = null;
                            }
                            if (str11 != null && !gv.n.B0(str11)) {
                                z14 = false;
                                if (!z14) {
                                    string3 = view.getContext().getString(R.string.video);
                                } else {
                                    Context context5 = view.getContext();
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = view.getContext().getString(R.string.video);
                                    objArr3[1] = (learningHubModel5 == null || (r6 = learningHubModel5.getDuration()) == null) ? "" : "";
                                    string3 = context5.getString(R.string.dbRaExperimentSubHeader, objArr3);
                                }
                                robertoTextView9.setText(string3);
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            robertoTextView9.setText(string3);
                        }
                        RobertoTextView robertoTextView10 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesVideoHeader);
                        if (robertoTextView10 != null) {
                            if (learningHubModel5 != null && (fields7 = learningHubModel5.getFields()) != null) {
                                Iterator<T> it7 = fields7.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        obj15 = it7.next();
                                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj15).getData_title(), "title")) {
                                        }
                                    } else {
                                        obj15 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel7 = (LearningHubFieldModel) obj15;
                                if (learningHubFieldModel7 != null) {
                                    obj14 = learningHubFieldModel7.getValue();
                                    if (!(obj14 instanceof String)) {
                                        str12 = (String) obj14;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 != null) {
                                        str12 = "";
                                    }
                                    robertoTextView10.setText(str12);
                                }
                            }
                            obj14 = null;
                            if (!(obj14 instanceof String)) {
                            }
                            if (str12 != null) {
                            }
                            robertoTextView10.setText(str12);
                        }
                        if (learningHubModel5 != null && (fields8 = learningHubModel5.getFields()) != null) {
                            Iterator<T> it8 = fields8.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    obj17 = it8.next();
                                    if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj17).getData_title(), "thumbnail")) {
                                    }
                                } else {
                                    obj17 = null;
                                }
                            }
                            LearningHubFieldModel learningHubFieldModel8 = (LearningHubFieldModel) obj17;
                            if (learningHubFieldModel8 != null) {
                                obj16 = learningHubFieldModel8.getValue();
                                if (obj16 instanceof String) {
                                    str28 = obj16;
                                }
                                str13 = str28;
                                if (str13 != null && !gv.n.B0(str13)) {
                                    z15 = false;
                                    if (!z15 && (appCompatImageView3 = (AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesVideo)) != null) {
                                        com.bumptech.glide.e<Bitmap> a12 = Glide.g(view.getContext()).a();
                                        a12.Z = str13;
                                        a12.f5953b0 = true;
                                        a12.B(appCompatImageView3);
                                        break;
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                    com.bumptech.glide.e<Bitmap> a122 = Glide.g(view.getContext()).a();
                                    a122.Z = str13;
                                    a122.f5953b0 = true;
                                    a122.B(appCompatImageView3);
                                }
                            }
                        }
                        obj16 = null;
                        if (obj16 instanceof String) {
                        }
                        str13 = str28;
                        if (str13 != null) {
                            z15 = false;
                            if (!z15) {
                            }
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        break;
                    case 5:
                        if (hashMap != null) {
                            learningHubModel6 = hashMap.get(userLibraryItemAccessModel.getId());
                        } else {
                            learningHubModel6 = null;
                        }
                        RobertoTextView robertoTextView11 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesDescription);
                        if (robertoTextView11 != null) {
                            Context context6 = view.getContext();
                            if (context6 == null || (str14 = context6.getString(R.string.tips)) == null) {
                                str14 = "";
                            }
                            robertoTextView11.setText(str14);
                        }
                        RobertoTextView robertoTextView12 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesHeader);
                        if (robertoTextView12 != null) {
                            if (learningHubModel6 != null && (fields9 = learningHubModel6.getFields()) != null) {
                                Iterator<T> it9 = fields9.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        obj19 = it9.next();
                                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj19).getData_title(), "short_desc")) {
                                        }
                                    } else {
                                        obj19 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel9 = (LearningHubFieldModel) obj19;
                                if (learningHubFieldModel9 != null) {
                                    obj18 = learningHubFieldModel9.getValue();
                                    if (obj18 instanceof String) {
                                        str28 = obj18;
                                    }
                                    if (str28 != null) {
                                        str15 = "";
                                    } else {
                                        str15 = str28;
                                    }
                                    robertoTextView12.setText(str15);
                                }
                            }
                            obj18 = null;
                            if (obj18 instanceof String) {
                            }
                            if (str28 != null) {
                            }
                            robertoTextView12.setText(str15);
                        }
                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesQuotes);
                        if (appCompatImageView6 != null) {
                            appCompatImageView6.setImageDrawable(g0.a.d(view.getContext(), R.drawable.ic_resources_tips_bg));
                            hs.k kVar3 = hs.k.f19476a;
                            break;
                        }
                        break;
                    case 6:
                        View findViewById = view.findViewById(R.id.clRowTpContainer);
                        if (findViewById != null) {
                            Context context7 = view.getContext();
                            s5 s5Var = this.H;
                            String parentId = userLibraryItemAccessModel.getParentId();
                            if (parentId == null) {
                                parentId = "";
                            }
                            s5Var.getClass();
                            Integer e10 = s5.e(parentId);
                            if (e10 != null) {
                                i11 = e10.intValue();
                            } else {
                                i11 = R.color.newDbDomainDepression;
                            }
                            findViewById.setBackgroundColor(g0.a.b(context7, i11));
                            hs.k kVar4 = hs.k.f19476a;
                        }
                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) view.findViewById(R.id.tvRowTpBackgroundImage);
                        if (appCompatImageView7 != null) {
                            appCompatImageView7.setImageDrawable(g0.a.d(view.getContext(), R.drawable.ic_new_db_saved_minicourse_bg));
                            hs.k kVar5 = hs.k.f19476a;
                        }
                        RobertoTextView robertoTextView13 = (RobertoTextView) view.findViewById(R.id.tvRowTpHeader);
                        if (robertoTextView13 != null) {
                            String label = userLibraryItemAccessModel.getLabel();
                            if (label == null) {
                                label = "";
                            }
                            robertoTextView13.setText(label);
                        }
                        RobertoTextView robertoTextView14 = (RobertoTextView) view.findViewById(R.id.tvRowTpSubHeader);
                        if (robertoTextView14 != null) {
                            HashMap<String, String> hashMap2 = this.C;
                            if (hashMap2 != null) {
                                String id2 = userLibraryItemAccessModel.getId();
                                if (id2 != null) {
                                    str17 = id2.substring(10);
                                    kotlin.jvm.internal.i.f(str17, "this as java.lang.String).substring(startIndex)");
                                } else {
                                    str17 = null;
                                }
                                str16 = hashMap2.get(str17);
                                if (str16 != null) {
                                    robertoTextView14.setText(str16);
                                }
                            }
                            str16 = "";
                            robertoTextView14.setText(str16);
                        }
                        RobertoTextView robertoTextView15 = (RobertoTextView) view.findViewById(R.id.tvRowTpCtaText);
                        if (robertoTextView15 != null) {
                            Context context8 = view.getContext();
                            if (context8 == null || (str18 = context8.getString(R.string.depressionExercisesExercisePlayStartCTA)) == null) {
                                str18 = "";
                            }
                            robertoTextView15.setText(str18);
                        }
                        RobertoTextView robertoTextView16 = (RobertoTextView) view.findViewById(R.id.tvRowTpDescription);
                        if (robertoTextView16 != null) {
                            robertoTextView16.setText(Constants.getCourseDisplayName(userLibraryItemAccessModel.getParentId()));
                        }
                        RobertoTextView robertoTextView17 = (RobertoTextView) view.findViewById(R.id.tvRowTpPremiumIndicator);
                        if (robertoTextView17 != null) {
                            if (!userLibraryItemAccessModel.isFree() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                Context context9 = robertoTextView17.getContext();
                                if (context9 == null || (str19 = context9.getString(R.string.librarySideNavPremiumTitle)) == null) {
                                    str19 = "";
                                }
                                robertoTextView17.setText(str19);
                                i10 = 0;
                                robertoTextView17.setVisibility(i10);
                                break;
                            }
                            i10 = 8;
                            robertoTextView17.setVisibility(i10);
                        }
                        break;
                    case 7:
                        HashMap<String, MiniCourseMetadata> hashMap3 = this.B;
                        if (hashMap3 != null) {
                            miniCourseMetadata = hashMap3.get(userLibraryItemAccessModel.getParentId());
                        } else {
                            miniCourseMetadata = null;
                        }
                        HashMap<String, MiniCourse> hashMap4 = this.A;
                        if (hashMap4 != null) {
                            miniCourse = hashMap4.get(userLibraryItemAccessModel.getParentId());
                        } else {
                            miniCourse = null;
                        }
                        View findViewById2 = view.findViewById(R.id.clRowTpContainer);
                        if (findViewById2 != null) {
                            findViewById2.setBackgroundColor(g0.a.b(view.getContext(), R.color.libraryShortCoursesBackground));
                            hs.k kVar6 = hs.k.f19476a;
                        }
                        AppCompatImageView appCompatImageView8 = (AppCompatImageView) view.findViewById(R.id.tvRowTpBackgroundImage);
                        if (appCompatImageView8 != null) {
                            appCompatImageView8.setImageDrawable(g0.a.d(view.getContext(), R.drawable.ic_new_db_saved_minicourse_bg));
                            hs.k kVar7 = hs.k.f19476a;
                        }
                        RobertoTextView robertoTextView18 = (RobertoTextView) view.findViewById(R.id.tvRowTpHeader);
                        if (robertoTextView18 != null) {
                            String label2 = userLibraryItemAccessModel.getLabel();
                            if (label2 == null) {
                                label2 = "";
                            }
                            robertoTextView18.setText(label2);
                        }
                        RobertoTextView robertoTextView19 = (RobertoTextView) view.findViewById(R.id.tvRowTpSubHeader);
                        if (robertoTextView19 != null) {
                            Context context10 = view.getContext();
                            if (context10 != null) {
                                Object[] objArr4 = new Object[2];
                                if (miniCourse != null && (plan2 = miniCourse.getPlan()) != null) {
                                    Iterator<CourseDayModelV1> it10 = plan2.iterator();
                                    i12 = 0;
                                    while (true) {
                                        if (it10.hasNext()) {
                                            if (!kotlin.jvm.internal.i.b(it10.next().getContent_id(), userLibraryItemAccessModel.getId())) {
                                                i12++;
                                            }
                                        } else {
                                            i12 = -1;
                                        }
                                    }
                                } else {
                                    i12 = 0;
                                }
                                objArr4[0] = String.valueOf(i12 + 1);
                                if (miniCourse != null && (plan = miniCourse.getPlan()) != null) {
                                    str28 = Integer.valueOf(plan.size()).toString();
                                }
                                objArr4[1] = str28;
                                str28 = context10.getString(R.string.miniCourseDayOfTotal, objArr4);
                            }
                            robertoTextView19.setText(str28);
                        }
                        RobertoTextView robertoTextView20 = (RobertoTextView) view.findViewById(R.id.tvRowTpCtaText);
                        if (robertoTextView20 != null) {
                            Context context11 = view.getContext();
                            if (context11 == null || (str20 = context11.getString(R.string.depressionExercisesExercisePlayStartCTA)) == null) {
                                str20 = "";
                            }
                            robertoTextView20.setText(str20);
                        }
                        RobertoTextView robertoTextView21 = (RobertoTextView) view.findViewById(R.id.tvRowTpDescription);
                        if (robertoTextView21 != null) {
                            if (miniCourseMetadata == null || (str21 = miniCourseMetadata.getName()) == null) {
                                str21 = "";
                            }
                            robertoTextView21.setText(str21);
                        }
                        RobertoTextView robertoTextView22 = (RobertoTextView) view.findViewById(R.id.tvRowTpPremiumIndicator);
                        if (robertoTextView22 != null) {
                            if (!userLibraryItemAccessModel.isFree() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                Context context12 = robertoTextView22.getContext();
                                if (context12 == null || (str22 = context12.getString(R.string.librarySideNavPremiumTitle)) == null) {
                                    str22 = "";
                                }
                                robertoTextView22.setText(str22);
                                i13 = 0;
                                robertoTextView22.setVisibility(i13);
                                break;
                            }
                            i13 = 8;
                            robertoTextView22.setVisibility(i13);
                        }
                        break;
                    case 8:
                        HashMap<String, LibraryCollection> hashMap5 = this.f20355z;
                        if (hashMap5 != null) {
                            libraryCollection = hashMap5.get(userLibraryItemAccessModel.getParentId());
                        } else {
                            libraryCollection = null;
                        }
                        View findViewById3 = view.findViewById(R.id.clRowTpContainer);
                        if (findViewById3 != null) {
                            findViewById3.setBackgroundColor(g0.a.b(view.getContext(), R.color.libraryCollectionBackground));
                            hs.k kVar8 = hs.k.f19476a;
                        }
                        AppCompatImageView appCompatImageView9 = (AppCompatImageView) view.findViewById(R.id.tvRowTpBackgroundImage);
                        if (appCompatImageView9 != null) {
                            appCompatImageView9.setImageDrawable(g0.a.d(view.getContext(), R.drawable.ic_new_db_saved_collection_bg));
                            hs.k kVar9 = hs.k.f19476a;
                        }
                        RobertoTextView robertoTextView23 = (RobertoTextView) view.findViewById(R.id.tvRowTpHeader);
                        if (robertoTextView23 != null) {
                            String label3 = userLibraryItemAccessModel.getLabel();
                            if (label3 == null) {
                                label3 = "";
                            }
                            robertoTextView23.setText(label3);
                        }
                        RobertoTextView robertoTextView24 = (RobertoTextView) view.findViewById(R.id.tvRowTpDescription);
                        if (robertoTextView24 != null) {
                            if (libraryCollection == null || (strings = libraryCollection.getStrings()) == null || (str23 = (String) u.i2(strings)) == null) {
                                str23 = "";
                            }
                            robertoTextView24.setText(str23);
                        }
                        RobertoTextView robertoTextView25 = (RobertoTextView) view.findViewById(R.id.tvRowTpSubHeader);
                        if (robertoTextView25 != null) {
                            if (libraryCollection != null && (itemList = libraryCollection.getItemList()) != null) {
                                Iterator<T> it11 = itemList.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        obj20 = it11.next();
                                        if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) obj20).getId(), userLibraryItemAccessModel.getId())) {
                                        }
                                    } else {
                                        obj20 = null;
                                    }
                                }
                                LibraryCollectionItem libraryCollectionItem = (LibraryCollectionItem) obj20;
                                if (libraryCollectionItem != null && (strings2 = libraryCollectionItem.getStrings()) != null && (str25 = (String) u.j2(1, strings2)) != null) {
                                    if (!Boolean.valueOf(kotlin.jvm.internal.i.b(str25, "-")).booleanValue()) {
                                        str28 = str25;
                                    }
                                    if (str28 != null) {
                                        str24 = str28;
                                        robertoTextView25.setText(str24);
                                    }
                                }
                            }
                            str24 = "";
                            robertoTextView25.setText(str24);
                        }
                        RobertoTextView robertoTextView26 = (RobertoTextView) view.findViewById(R.id.tvRowTpCtaText);
                        if (robertoTextView26 != null) {
                            Context context13 = view.getContext();
                            if (context13 == null || (str26 = context13.getString(R.string.depressionExercisesExercisePlayStartCTA)) == null) {
                                str26 = "";
                            }
                            robertoTextView26.setText(str26);
                        }
                        RobertoTextView robertoTextView27 = (RobertoTextView) view.findViewById(R.id.tvRowTpPremiumIndicator);
                        if (robertoTextView27 != null) {
                            if (!userLibraryItemAccessModel.isFree() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                robertoTextView27.setBackgroundTintList(g0.a.c(R.color.newDbSavedItemCollectionPremiumBg, robertoTextView27.getContext()));
                                Context context14 = robertoTextView27.getContext();
                                if (context14 == null || (str27 = context14.getString(R.string.librarySideNavPremiumTitle)) == null) {
                                    str27 = "";
                                }
                                robertoTextView27.setText(str27);
                                i14 = 0;
                                robertoTextView27.setVisibility(i14);
                                break;
                            }
                            i14 = 8;
                            robertoTextView27.setVisibility(i14);
                        }
                        break;
                }
                view.setOnClickListener(new j1(this, 20, userLibraryItemAccessModel));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.E, e11);
        }
    }
}
