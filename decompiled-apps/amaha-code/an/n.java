package an;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import pl.w0;
/* compiled from: LibraryCollectionDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {
    public static final /* synthetic */ int I = 0;
    public LibraryCollection A;
    public String B;
    public AnimatorSet C;
    public final boolean D;
    public final androidx.activity.result.c<Intent> E;
    public final androidx.activity.result.c<Intent> F;
    public final androidx.activity.result.c<Intent> G;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f744u = LogHelper.INSTANCE.makeLogTag("CollectionFragment");

    /* renamed from: v  reason: collision with root package name */
    public boolean f745v;

    /* renamed from: w  reason: collision with root package name */
    public cn.o f746w;

    /* renamed from: x  reason: collision with root package name */
    public final String[] f747x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f748y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, Object> f749z;

    /* compiled from: LibraryCollectionDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends RecommendedActivityModel>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent) {
            RecommendedActivityModel contentIfNotHandled;
            SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                n nVar = n.this;
                nVar.G.a(new Intent(nVar.requireActivity(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", contentIfNotHandled).putExtra("source", "library"));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryCollectionDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends LearningHubModel>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends LearningHubModel> singleUseEvent) {
            LearningHubModel contentIfNotHandled;
            Boolean bool;
            ArrayList<PostsRead> postsRead;
            ArrayList<PostsRead> postsRead2;
            boolean z10;
            SingleUseEvent<? extends LearningHubModel> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                n nVar = n.this;
                nVar.startActivity(new Intent(nVar.requireActivity(), LearningHubExperimentActivity.class).putExtra("model", contentIfNotHandled));
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null && (postsRead2 = user.getPostsRead()) != null) {
                    if (!postsRead2.isEmpty()) {
                        for (PostsRead postsRead3 : postsRead2) {
                            if (kotlin.jvm.internal.i.b(postsRead3.getPostId(), contentIfNotHandled.getId())) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = null;
                }
                if (kotlin.jvm.internal.i.b(bool, Boolean.FALSE)) {
                    User user2 = firebasePersistence.getUser();
                    if (user2 != null && (postsRead = user2.getPostsRead()) != null) {
                        PostsRead postsRead4 = new PostsRead();
                        postsRead4.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        postsRead4.setPostId(contentIfNotHandled.getId());
                        postsRead.add(postsRead4);
                    }
                    firebasePersistence.updateUserOnFirebase();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Integer.valueOf(((LibraryCollectionItem) t3).getPosition()), Integer.valueOf(((LibraryCollectionItem) t10).getPosition()));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(((LibraryCollectionItem) t3).getFillerPosition(), ((LibraryCollectionItem) t10).getFillerPosition());
        }
    }

    /* compiled from: LibraryCollectionDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ LibraryCollection f753v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LibraryCollection libraryCollection) {
            super(10);
            this.f753v = libraryCollection;
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x0357, code lost:
            if (r3 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
            if (r15.equals("filler_activity") == false) goto L163;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
            if (r15.equals("main_activity") == false) goto L163;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x013e, code lost:
            r12 = r47;
            r25 = "parent_activity";
            r26 = "main_activity";
            r27 = "collection_name";
            r28 = r9;
            r21 = "activity_position_in_list";
            r29 = "paid_activity";
            r23 = "filler_activity";
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
            if (r56 == null) goto L162;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0156, code lost:
            if (gv.n.B0(r56) == false) goto L154;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
            r25 = "parent_activity";
            r21 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x015e, code lost:
            r25 = "parent_activity";
            r21 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0162, code lost:
            r26 = "main_activity";
            r27 = "collection_name";
            r28 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0170, code lost:
            if (r21 == false) goto L161;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
            r21 = "activity_position_in_list";
            r10 = new android.content.Intent(r8.getActivity(), com.theinnerhour.b2b.activity.TemplateActivity.class);
            r11 = new com.theinnerhour.b2b.model.CourseDayModelV1();
            r11.setContent_label(r49);
            r12 = r47;
            r23 = "filler_activity";
            r11.setContent_id(r12);
            r29 = "paid_activity";
            r11.setAssessment(java.lang.Boolean.FALSE);
            r14 = hs.k.f19476a;
            r10.putExtra("day_plan", r11);
            r10.putExtra("type", "daily");
            r10.putExtra("goalSource", "library");
            r10.putExtra("showAltFeedback", true);
            r10.putExtra("mcCourse", com.theinnerhour.b2b.utils.Constants.LIBRARY_GOAL_COURSE);
            r10.putExtra("mcCourseId", com.theinnerhour.b2b.utils.Constants.LIBRARY_GOAL_COURSE_ID);
            r8.E.a(r10);
            r3 = 0;
            r4 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01c0, code lost:
            r12 = r47;
            r21 = "activity_position_in_list";
            r29 = "paid_activity";
            r23 = "filler_activity";
            r0 = new android.content.Intent(r8.requireActivity(), com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity.class);
            r0.putExtra("activity_id", r12);
            r0.putExtra("activity_name", r49);
            r0.putExtra(com.theinnerhour.b2b.utils.Constants.COURSE_NAME, com.theinnerhour.b2b.utils.Constants.LIBRARY_GOAL_COURSE);
            r0.putExtra("goalSource", "library");
            r0.putExtra("isMainActivity", r7);
            r4 = 1;
            r0.putExtra("showAltFeedback", true);
            r8.F.a(r0);
            r3 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01f2, code lost:
            r1[r3] = r12;
            r1[r4] = r15;
            r1[2] = r49;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x034d  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0374  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x037d A[Catch: Exception -> 0x0397, TryCatch #6 {Exception -> 0x0397, blocks: (B:117:0x0375, B:119:0x037d, B:122:0x0383, B:125:0x038e), top: B:199:0x0375 }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0383 A[Catch: Exception -> 0x0397, TryCatch #6 {Exception -> 0x0397, blocks: (B:117:0x0375, B:119:0x037d, B:122:0x0383, B:125:0x038e), top: B:199:0x0375 }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x03a7  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03f0  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x03fe  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x040c  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0418  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0428  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0438  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0486  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x049c  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x04a1  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x04ab  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x04b5  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x04d4  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0280  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x030e  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0341  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x034a  */
        @Override // ss.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object x(String id2, String type, String str, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Integer num, String str4) {
            String str5;
            String str6;
            String str7;
            String str8;
            boolean z10;
            String str9;
            String str10;
            String str11;
            String str12;
            Object obj;
            cn.o oVar;
            cn.o oVar2;
            String str13;
            LibraryCollection libraryCollection;
            boolean z11;
            n nVar;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            boolean z12;
            int i6;
            zm.f fVar;
            int i10;
            Object obj2;
            String str22;
            n nVar2;
            zm.f fVar2;
            boolean z13;
            String str23;
            boolean z14;
            String str24;
            String str25;
            Bundle arguments;
            String str26;
            Integer num2;
            Object obj3;
            Object obj4;
            Bundle bundle;
            boolean z15;
            boolean z16;
            n nVar3;
            String str27;
            boolean z17;
            LibraryActivity libraryActivity;
            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
            AnimatorSet animatorSet;
            String str28;
            int i11;
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            int intValue = num.intValue();
            kotlin.jvm.internal.i.g(id2, "id");
            kotlin.jvm.internal.i.g(type, "type");
            LibraryCollection libraryCollection2 = this.f753v;
            n nVar4 = n.this;
            if (!booleanValue2 && kotlin.jvm.internal.i.b(bool3, Boolean.FALSE)) {
                Toast.makeText(nVar4.getContext(), nVar4.getString(R.string.fillerActivityAccessToast), 0).show();
                String str29 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("collection_name", libraryCollection2.getStrings().get(0));
                bundle2.putString("activity_name", str);
                bundle2.putString("parent_activity", str2);
                bundle2.putString("status_of_activity_when_clicked", str3);
                bundle2.putBoolean("main_activity", booleanValue2);
                bundle2.putBoolean("paid_activity", true ^ booleanValue);
                if (booleanValue2) {
                    bundle2.putInt("activity_position_in_list", intValue);
                }
                if (!booleanValue2) {
                    bundle2.putBoolean("parent_activity_completed", bool3.booleanValue());
                }
                Bundle arguments2 = nVar4.getArguments();
                if (arguments2 != null) {
                    i11 = arguments2.getInt("collection_pos", -1);
                    str28 = "collection_position_in_list";
                } else {
                    str28 = "collection_position_in_list";
                    i11 = -1;
                }
                bundle2.putInt(str28, i11);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle2, "lib_collect_inside_activity_click");
            } else if (!booleanValue && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                androidx.fragment.app.p requireActivity = nVar4.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                Intent s10 = tr.r.s(requireActivity, false);
                Bundle arguments3 = nVar4.getArguments();
                nVar4.startActivity(s10.putExtra("source", (arguments3 == null || (r1 = arguments3.getString("collection_id")) == null) ? "collection" : "collection"));
            } else {
                nVar4.f748y = booleanValue;
                int hashCode = type.hashCode();
                String[] strArr = nVar4.f747x;
                switch (hashCode) {
                    case -1983070683:
                        str5 = id2;
                        str6 = "parent_activity";
                        str7 = "main_activity";
                        str8 = "collection_name";
                        z10 = booleanValue;
                        str9 = "activity_position_in_list";
                        str10 = "status_of_activity_when_clicked";
                        str11 = "paid_activity";
                        str12 = type;
                        obj = "filler_activity";
                        if (str12.equals("resources") && (oVar = nVar4.f746w) != null) {
                            try {
                                try {
                                    ta.v.H(kc.f.H(oVar), null, 0, new cn.n(oVar, str5, null), 3);
                                } catch (Exception e10) {
                                    e = e10;
                                    LogHelper.INSTANCE.e(oVar.f5660y, e);
                                    oVar2 = nVar4.f746w;
                                    if (oVar2 == null) {
                                    }
                                    nVar2 = nVar;
                                    RecyclerView recyclerView = (RecyclerView) nVar2._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                    if (recyclerView != null) {
                                    }
                                    if (r0 instanceof zm.f) {
                                    }
                                    if (fVar2 != null) {
                                    }
                                    androidx.fragment.app.p requireActivity2 = nVar2.requireActivity();
                                    if (requireActivity2 instanceof LibraryActivity) {
                                    }
                                    if (libraryActivity != 0) {
                                        HashMap<String, LibraryCollectionItemAccessModel> hashMap = libraryActivity.f11294y;
                                        libraryCollectionItemAccessModel.setAccessed(z13);
                                        hashMap.put(str22, libraryCollectionItemAccessModel);
                                        break;
                                    }
                                    if (kotlin.jvm.internal.i.b(str12, obj2)) {
                                    }
                                    HashMap<String, Object> hashMap2 = nVar2.f749z;
                                    String str30 = str21;
                                    hashMap2.put(str30, libraryCollection.getStrings().get(i6));
                                    String str31 = str13;
                                    hashMap2.put(str31, str);
                                    String str32 = str19;
                                    hashMap2.put(str32, str2);
                                    String str33 = str10;
                                    hashMap2.put(str33, str3);
                                    str23 = str20;
                                    hashMap2.put(str23, Boolean.valueOf(z11));
                                    boolean z18 = !z12;
                                    String str34 = str11;
                                    hashMap2.put(str34, Boolean.valueOf(z18));
                                    z14 = z11;
                                    if (z14) {
                                    }
                                    if (z14) {
                                    }
                                    arguments = nVar2.getArguments();
                                    String str35 = str15;
                                    if (arguments != null) {
                                    }
                                    hashMap2.put(str26, num2);
                                    if (kotlin.jvm.internal.i.b(str12, str23)) {
                                    }
                                    if (str4 != null) {
                                        break;
                                    }
                                    obj4 = obj3;
                                    hashMap2.put("dynamicV1", Boolean.valueOf(!(str4 != null || gv.n.B0(str4))));
                                    String str36 = gk.a.f16573a;
                                    bundle = new Bundle();
                                    bundle.putString(str30, libraryCollection.getStrings().get(0));
                                    bundle.putString(str31, str);
                                    bundle.putString(str32, str2);
                                    bundle.putString(str33, str3);
                                    bundle.putBoolean(str23, z14);
                                    bundle.putBoolean(str34, z18);
                                    if (z14) {
                                    }
                                    if (!z14) {
                                    }
                                    Bundle arguments4 = nVar2.getArguments();
                                    bundle.putInt(str26, arguments4 == null ? arguments4.getInt(str35, -1) : -1);
                                    if (!kotlin.jvm.internal.i.b(str12, str23)) {
                                    }
                                    if (str4 != null) {
                                    }
                                    z15 = true;
                                    z16 = true;
                                    bundle.putBoolean("dynamicV1", z15 ^ z16);
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(bundle, str14);
                                    nVar3 = nVar2;
                                    animatorSet = nVar3.C;
                                    if (animatorSet != null) {
                                    }
                                    return hs.k.f19476a;
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                        }
                        break;
                    case -38716301:
                        str5 = id2;
                        str6 = "parent_activity";
                        str7 = "main_activity";
                        str8 = "collection_name";
                        z10 = booleanValue;
                        str9 = "activity_position_in_list";
                        str10 = "status_of_activity_when_clicked";
                        str11 = "paid_activity";
                        str12 = type;
                        obj = "filler_activity";
                        if (str12.equals("recommended_activity")) {
                            cn.o oVar3 = nVar4.f746w;
                            if (oVar3 != null) {
                                try {
                                    ta.v.H(kc.f.H(oVar3), null, 0, new cn.m(oVar3, str5, null), 3);
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e(oVar3.f5660y, e12);
                                }
                            }
                            strArr[0] = str5;
                            strArr[1] = str12;
                            strArr[2] = str;
                            break;
                        }
                    case 606502613:
                        str10 = "status_of_activity_when_clicked";
                        str12 = type;
                        break;
                    case 2034013438:
                        str10 = "status_of_activity_when_clicked";
                        str12 = type;
                        break;
                    default:
                        str5 = id2;
                        str6 = "parent_activity";
                        str7 = "main_activity";
                        str8 = "collection_name";
                        z10 = booleanValue;
                        str9 = "activity_position_in_list";
                        str10 = "status_of_activity_when_clicked";
                        str11 = "paid_activity";
                        str12 = type;
                        obj = "filler_activity";
                        break;
                }
                oVar2 = nVar4.f746w;
                if (oVar2 == null) {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    boolean b10 = kotlin.jvm.internal.i.b(str12, "resource");
                    String id3 = libraryCollection2.getId();
                    if (id3 == null) {
                        id3 = "";
                    }
                    try {
                        str13 = "activity_name";
                        str15 = "collection_pos";
                        str14 = "lib_collect_inside_activity_click";
                        str19 = str6;
                        str18 = str9;
                        str20 = str7;
                        str17 = "collection_position_in_list";
                        str21 = str8;
                        libraryCollection = libraryCollection2;
                        str16 = "parent_activity_completed";
                        i10 = intValue;
                        z11 = booleanValue2;
                        nVar = nVar4;
                        z12 = z10;
                        obj2 = "resource";
                        str22 = str5;
                        try {
                            i6 = 0;
                            fVar = null;
                        } catch (Exception e13) {
                            e = e13;
                            i6 = 0;
                            fVar = null;
                        }
                        try {
                            ta.v.H(kc.f.H(oVar2), null, 0, new cn.j(oVar2, id2, type, str, timeInMillis, b10, id3, "collections", z12, null), 3);
                        } catch (Exception e14) {
                            e = e14;
                            LogHelper.INSTANCE.e(oVar2.f5660y, e);
                            nVar2 = nVar;
                            RecyclerView recyclerView2 = (RecyclerView) nVar2._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                            if (recyclerView2 != null) {
                            }
                            if (r0 instanceof zm.f) {
                            }
                            if (fVar2 != null) {
                            }
                            androidx.fragment.app.p requireActivity22 = nVar2.requireActivity();
                            if (requireActivity22 instanceof LibraryActivity) {
                            }
                            if (libraryActivity != 0) {
                            }
                            if (kotlin.jvm.internal.i.b(str12, obj2)) {
                            }
                            HashMap<String, Object> hashMap22 = nVar2.f749z;
                            String str302 = str21;
                            hashMap22.put(str302, libraryCollection.getStrings().get(i6));
                            String str312 = str13;
                            hashMap22.put(str312, str);
                            String str322 = str19;
                            hashMap22.put(str322, str2);
                            String str332 = str10;
                            hashMap22.put(str332, str3);
                            str23 = str20;
                            hashMap22.put(str23, Boolean.valueOf(z11));
                            boolean z182 = !z12;
                            String str342 = str11;
                            hashMap22.put(str342, Boolean.valueOf(z182));
                            z14 = z11;
                            if (z14) {
                            }
                            if (z14) {
                            }
                            arguments = nVar2.getArguments();
                            String str352 = str15;
                            if (arguments != null) {
                            }
                            hashMap22.put(str26, num2);
                            if (kotlin.jvm.internal.i.b(str12, str23)) {
                            }
                            obj4 = obj3;
                            hashMap22.put("dynamicV1", Boolean.valueOf(!(str4 != null || gv.n.B0(str4))));
                            String str362 = gk.a.f16573a;
                            bundle = new Bundle();
                            bundle.putString(str302, libraryCollection.getStrings().get(0));
                            bundle.putString(str312, str);
                            bundle.putString(str322, str2);
                            bundle.putString(str332, str3);
                            bundle.putBoolean(str23, z14);
                            bundle.putBoolean(str342, z182);
                            if (z14) {
                            }
                            if (!z14) {
                            }
                            Bundle arguments42 = nVar2.getArguments();
                            bundle.putInt(str26, arguments42 == null ? arguments42.getInt(str352, -1) : -1);
                            if (!kotlin.jvm.internal.i.b(str12, str23)) {
                            }
                            if (str4 != null) {
                            }
                            z15 = true;
                            z16 = true;
                            bundle.putBoolean("dynamicV1", z15 ^ z16);
                            hs.k kVar22 = hs.k.f19476a;
                            gk.a.b(bundle, str14);
                            nVar3 = nVar2;
                            animatorSet = nVar3.C;
                            if (animatorSet != null) {
                            }
                            return hs.k.f19476a;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        str13 = "activity_name";
                        libraryCollection = libraryCollection2;
                        z11 = booleanValue2;
                        nVar = nVar4;
                        str14 = "lib_collect_inside_activity_click";
                        str15 = "collection_pos";
                        str16 = "parent_activity_completed";
                        str17 = "collection_position_in_list";
                        str18 = str9;
                        str19 = str6;
                        str20 = str7;
                        str21 = str8;
                        z12 = z10;
                        i6 = 0;
                        fVar = null;
                        i10 = intValue;
                        obj2 = "resource";
                        str22 = str5;
                    }
                } else {
                    str13 = "activity_name";
                    libraryCollection = libraryCollection2;
                    z11 = booleanValue2;
                    nVar = nVar4;
                    str14 = "lib_collect_inside_activity_click";
                    str15 = "collection_pos";
                    str16 = "parent_activity_completed";
                    str17 = "collection_position_in_list";
                    str18 = str9;
                    str19 = str6;
                    str20 = str7;
                    str21 = str8;
                    z12 = z10;
                    i6 = 0;
                    fVar = null;
                    i10 = intValue;
                    obj2 = "resource";
                    str22 = str5;
                }
                nVar2 = nVar;
                RecyclerView recyclerView22 = (RecyclerView) nVar2._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                RecyclerView.e adapter = recyclerView22 != null ? recyclerView22.getAdapter() : fVar;
                fVar2 = adapter instanceof zm.f ? (zm.f) adapter : fVar;
                if (fVar2 != null) {
                    HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = fVar2.f39638y;
                    if (hashMap3 != null) {
                        try {
                            libraryCollectionItemAccessModel2 = hashMap3.get(str22);
                        } catch (Exception e16) {
                            e = e16;
                            z13 = true;
                            LogHelper.INSTANCE.e(fVar2.F, e);
                            androidx.fragment.app.p requireActivity222 = nVar2.requireActivity();
                            if (requireActivity222 instanceof LibraryActivity) {
                            }
                            if (libraryActivity != 0) {
                            }
                            if (kotlin.jvm.internal.i.b(str12, obj2)) {
                            }
                            HashMap<String, Object> hashMap222 = nVar2.f749z;
                            String str3022 = str21;
                            hashMap222.put(str3022, libraryCollection.getStrings().get(i6));
                            String str3122 = str13;
                            hashMap222.put(str3122, str);
                            String str3222 = str19;
                            hashMap222.put(str3222, str2);
                            String str3322 = str10;
                            hashMap222.put(str3322, str3);
                            str23 = str20;
                            hashMap222.put(str23, Boolean.valueOf(z11));
                            boolean z1822 = !z12;
                            String str3422 = str11;
                            hashMap222.put(str3422, Boolean.valueOf(z1822));
                            z14 = z11;
                            if (z14) {
                            }
                            if (z14) {
                            }
                            arguments = nVar2.getArguments();
                            String str3522 = str15;
                            if (arguments != null) {
                            }
                            hashMap222.put(str26, num2);
                            if (kotlin.jvm.internal.i.b(str12, str23)) {
                            }
                            obj4 = obj3;
                            hashMap222.put("dynamicV1", Boolean.valueOf(!(str4 != null || gv.n.B0(str4))));
                            String str3622 = gk.a.f16573a;
                            bundle = new Bundle();
                            bundle.putString(str3022, libraryCollection.getStrings().get(0));
                            bundle.putString(str3122, str);
                            bundle.putString(str3222, str2);
                            bundle.putString(str3322, str3);
                            bundle.putBoolean(str23, z14);
                            bundle.putBoolean(str3422, z1822);
                            if (z14) {
                            }
                            if (!z14) {
                            }
                            Bundle arguments422 = nVar2.getArguments();
                            bundle.putInt(str26, arguments422 == null ? arguments422.getInt(str3522, -1) : -1);
                            if (!kotlin.jvm.internal.i.b(str12, str23)) {
                            }
                            if (str4 != null) {
                            }
                            z15 = true;
                            z16 = true;
                            bundle.putBoolean("dynamicV1", z15 ^ z16);
                            hs.k kVar222 = hs.k.f19476a;
                            gk.a.b(bundle, str14);
                            nVar3 = nVar2;
                            animatorSet = nVar3.C;
                            if (animatorSet != null) {
                            }
                            return hs.k.f19476a;
                        }
                    }
                    libraryCollectionItemAccessModel2 = new LibraryCollectionItemAccessModel();
                    z13 = true;
                    try {
                        libraryCollectionItemAccessModel2.setAccessed(true);
                        if (hashMap3 != null) {
                            hashMap3.put(str22, libraryCollectionItemAccessModel2);
                        }
                    } catch (Exception e17) {
                        e = e17;
                        LogHelper.INSTANCE.e(fVar2.F, e);
                        androidx.fragment.app.p requireActivity2222 = nVar2.requireActivity();
                        if (requireActivity2222 instanceof LibraryActivity) {
                        }
                        if (libraryActivity != 0) {
                        }
                        if (kotlin.jvm.internal.i.b(str12, obj2)) {
                        }
                        HashMap<String, Object> hashMap2222 = nVar2.f749z;
                        String str30222 = str21;
                        hashMap2222.put(str30222, libraryCollection.getStrings().get(i6));
                        String str31222 = str13;
                        hashMap2222.put(str31222, str);
                        String str32222 = str19;
                        hashMap2222.put(str32222, str2);
                        String str33222 = str10;
                        hashMap2222.put(str33222, str3);
                        str23 = str20;
                        hashMap2222.put(str23, Boolean.valueOf(z11));
                        boolean z18222 = !z12;
                        String str34222 = str11;
                        hashMap2222.put(str34222, Boolean.valueOf(z18222));
                        z14 = z11;
                        if (z14) {
                        }
                        if (z14) {
                        }
                        arguments = nVar2.getArguments();
                        String str35222 = str15;
                        if (arguments != null) {
                        }
                        hashMap2222.put(str26, num2);
                        if (kotlin.jvm.internal.i.b(str12, str23)) {
                        }
                        obj4 = obj3;
                        hashMap2222.put("dynamicV1", Boolean.valueOf(!(str4 != null || gv.n.B0(str4))));
                        String str36222 = gk.a.f16573a;
                        bundle = new Bundle();
                        bundle.putString(str30222, libraryCollection.getStrings().get(0));
                        bundle.putString(str31222, str);
                        bundle.putString(str32222, str2);
                        bundle.putString(str33222, str3);
                        bundle.putBoolean(str23, z14);
                        bundle.putBoolean(str34222, z18222);
                        if (z14) {
                        }
                        if (!z14) {
                        }
                        Bundle arguments4222 = nVar2.getArguments();
                        bundle.putInt(str26, arguments4222 == null ? arguments4222.getInt(str35222, -1) : -1);
                        if (!kotlin.jvm.internal.i.b(str12, str23)) {
                        }
                        if (str4 != null) {
                        }
                        z15 = true;
                        z16 = true;
                        bundle.putBoolean("dynamicV1", z15 ^ z16);
                        hs.k kVar2222 = hs.k.f19476a;
                        gk.a.b(bundle, str14);
                        nVar3 = nVar2;
                        animatorSet = nVar3.C;
                        if (animatorSet != null) {
                        }
                        return hs.k.f19476a;
                    }
                } else {
                    z13 = true;
                }
                try {
                    androidx.fragment.app.p requireActivity22222 = nVar2.requireActivity();
                    libraryActivity = requireActivity22222 instanceof LibraryActivity ? (LibraryActivity) requireActivity22222 : fVar;
                    if (libraryActivity != 0 && (libraryCollectionItemAccessModel = libraryActivity.f11294y.get(str22)) != null) {
                        HashMap<String, LibraryCollectionItemAccessModel> hashMap4 = libraryActivity.f11294y;
                        libraryCollectionItemAccessModel.setAccessed(z13);
                        hashMap4.put(str22, libraryCollectionItemAccessModel);
                    }
                } catch (Exception e18) {
                    LogHelper.INSTANCE.e(nVar2.f744u, e18);
                }
                if (kotlin.jvm.internal.i.b(str12, obj2)) {
                    nVar2.J(str22);
                }
                HashMap<String, Object> hashMap22222 = nVar2.f749z;
                String str302222 = str21;
                hashMap22222.put(str302222, libraryCollection.getStrings().get(i6));
                String str312222 = str13;
                hashMap22222.put(str312222, str);
                String str322222 = str19;
                hashMap22222.put(str322222, str2);
                String str332222 = str10;
                hashMap22222.put(str332222, str3);
                str23 = str20;
                hashMap22222.put(str23, Boolean.valueOf(z11));
                boolean z182222 = !z12;
                String str342222 = str11;
                hashMap22222.put(str342222, Boolean.valueOf(z182222));
                z14 = z11;
                if (z14) {
                    str24 = str18;
                    hashMap22222.put(str24, Integer.valueOf(i10));
                } else {
                    str24 = str18;
                }
                if (z14) {
                    str25 = str24;
                } else {
                    str25 = str24;
                    hashMap22222.put(str16, bool3);
                }
                arguments = nVar2.getArguments();
                String str352222 = str15;
                if (arguments != null) {
                    num2 = Integer.valueOf(arguments.getInt(str352222, -1));
                    str26 = str17;
                } else {
                    str26 = str17;
                    num2 = null;
                }
                hashMap22222.put(str26, num2);
                if (kotlin.jvm.internal.i.b(str12, str23)) {
                    obj3 = obj;
                } else {
                    obj3 = obj;
                    if (!kotlin.jvm.internal.i.b(str12, obj3)) {
                        obj4 = obj3;
                        String str362222 = gk.a.f16573a;
                        bundle = new Bundle();
                        bundle.putString(str302222, libraryCollection.getStrings().get(0));
                        bundle.putString(str312222, str);
                        bundle.putString(str322222, str2);
                        bundle.putString(str332222, str3);
                        bundle.putBoolean(str23, z14);
                        bundle.putBoolean(str342222, z182222);
                        if (z14) {
                            bundle.putInt(str25, i10);
                        }
                        if (!z14) {
                            if (bool3 != null) {
                                z17 = bool3.booleanValue();
                                str27 = str16;
                            } else {
                                str27 = str16;
                                z17 = false;
                            }
                            bundle.putBoolean(str27, z17);
                        }
                        Bundle arguments42222 = nVar2.getArguments();
                        bundle.putInt(str26, arguments42222 == null ? arguments42222.getInt(str352222, -1) : -1);
                        if (!kotlin.jvm.internal.i.b(str12, str23) || kotlin.jvm.internal.i.b(str12, obj4)) {
                            if (str4 != null || gv.n.B0(str4)) {
                                z15 = true;
                                z16 = true;
                            } else {
                                z15 = true;
                                z16 = false;
                            }
                            bundle.putBoolean("dynamicV1", z15 ^ z16);
                        }
                        hs.k kVar22222 = hs.k.f19476a;
                        gk.a.b(bundle, str14);
                        nVar3 = nVar2;
                        animatorSet = nVar3.C;
                        if (animatorSet != null) {
                            animatorSet.end();
                            animatorSet.removeAllListeners();
                        }
                        return hs.k.f19476a;
                    }
                }
                obj4 = obj3;
                hashMap22222.put("dynamicV1", Boolean.valueOf(!(str4 != null || gv.n.B0(str4))));
                String str3622222 = gk.a.f16573a;
                bundle = new Bundle();
                bundle.putString(str302222, libraryCollection.getStrings().get(0));
                bundle.putString(str312222, str);
                bundle.putString(str322222, str2);
                bundle.putString(str332222, str3);
                bundle.putBoolean(str23, z14);
                bundle.putBoolean(str342222, z182222);
                if (z14) {
                }
                if (!z14) {
                }
                Bundle arguments422222 = nVar2.getArguments();
                bundle.putInt(str26, arguments422222 == null ? arguments422222.getInt(str352222, -1) : -1);
                if (!kotlin.jvm.internal.i.b(str12, str23)) {
                }
                if (str4 != null) {
                }
                z15 = true;
                z16 = true;
                bundle.putBoolean("dynamicV1", z15 ^ z16);
                hs.k kVar222222 = hs.k.f19476a;
                gk.a.b(bundle, str14);
                nVar3 = nVar2;
                animatorSet = nVar3.C;
                if (animatorSet != null) {
                }
                return hs.k.f19476a;
            }
            nVar3 = nVar4;
            animatorSet = nVar3.C;
            if (animatorSet != null) {
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryCollectionDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ LibraryCollection f755v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LibraryCollection libraryCollection) {
            super(11);
            this.f755v = libraryCollection;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
            if (r8 == null) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0118 A[Catch: Exception -> 0x0137, LOOP:0: B:42:0x00c6->B:64:0x0118, LOOP_END, TryCatch #1 {Exception -> 0x0137, blocks: (B:35:0x00aa, B:38:0x00b7, B:40:0x00bc, B:41:0x00bf, B:42:0x00c6, B:44:0x00cc, B:46:0x00e0, B:48:0x00e8, B:66:0x011c, B:74:0x012f, B:64:0x0118, B:51:0x00f2, B:52:0x00f6, B:54:0x00fc, B:37:0x00b2), top: B:122:0x00aa }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0147 A[Catch: Exception -> 0x0162, TryCatch #4 {Exception -> 0x0162, blocks: (B:78:0x013f, B:80:0x0147, B:83:0x014e, B:86:0x0159), top: B:128:0x013f }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x014e A[Catch: Exception -> 0x0162, TryCatch #4 {Exception -> 0x0162, blocks: (B:78:0x013f, B:80:0x0147, B:83:0x014e, B:86:0x0159), top: B:128:0x013f }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Number] */
        /* JADX WARN: Type inference failed for: r1v3, types: [android.os.Bundle, android.os.BaseBundle] */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18, types: [com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity] */
        @Override // ss.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object q(String id2, String type, String str, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Integer num, Boolean bool4, String str4) {
            LibraryCollection libraryCollection;
            zm.f fVar;
            n nVar;
            boolean z10;
            int i6;
            int i10;
            n nVar2;
            RecyclerView recyclerView;
            RecyclerView.e eVar;
            zm.f fVar2;
            int i11;
            String str5;
            ?? bundle;
            Bundle arguments;
            boolean z11;
            androidx.fragment.app.p requireActivity;
            LibraryActivity libraryActivity;
            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
            boolean z12;
            boolean z13;
            boolean z14;
            cn.o oVar;
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            int intValue = num.intValue();
            boolean booleanValue3 = bool4.booleanValue();
            kotlin.jvm.internal.i.g(id2, "id");
            kotlin.jvm.internal.i.g(type, "type");
            n nVar3 = n.this;
            cn.o oVar2 = nVar3.f746w;
            LibraryCollection libraryCollection2 = this.f755v;
            if (oVar2 != null) {
                String id3 = libraryCollection2.getId();
                if (id3 == null) {
                    id3 = "";
                }
                try {
                    libraryCollection = libraryCollection2;
                    oVar = oVar2;
                    nVar = nVar3;
                    z10 = booleanValue3;
                    i6 = intValue;
                } catch (Exception e10) {
                    e = e10;
                    libraryCollection = libraryCollection2;
                    fVar = null;
                    oVar = oVar2;
                    nVar = nVar3;
                    z10 = booleanValue3;
                    i6 = intValue;
                }
                try {
                    fVar = null;
                    i10 = 0;
                } catch (Exception e11) {
                    e = e11;
                    fVar = null;
                    i10 = 0;
                    LogHelper.INSTANCE.e(oVar.f5660y, e);
                    nVar2 = nVar;
                    recyclerView = (RecyclerView) nVar2._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                    if (recyclerView != null) {
                    }
                    if (eVar instanceof zm.f) {
                    }
                    int i12 = -1;
                    if (fVar2 != null) {
                    }
                    requireActivity = nVar2.requireActivity();
                    if (requireActivity instanceof LibraryActivity) {
                    }
                    if (libraryActivity != 0) {
                        HashMap<String, LibraryCollectionItemAccessModel> hashMap = libraryActivity.f11294y;
                        libraryCollectionItemAccessModel.setBookmarked(z10);
                        hashMap.put(id2, libraryCollectionItemAccessModel);
                    }
                    Context requireContext = nVar2.requireContext();
                    if (z10) {
                    }
                    Toast.makeText(requireContext, nVar2.getString(i11), i10).show();
                    String str6 = gk.a.f16573a;
                    if (z10) {
                    }
                    bundle = new Bundle();
                    bundle.putString("collection_name", libraryCollection.getStrings().get(i10));
                    bundle.putString("activity_name", str);
                    bundle.putString("parent_activity", str2);
                    bundle.putString("status_of_activity_when_clicked", str3);
                    bundle.putBoolean("main_activity", booleanValue2);
                    bundle.putBoolean("paid_activity", !booleanValue);
                    if (booleanValue2) {
                    }
                    if (!booleanValue2) {
                    }
                    arguments = nVar2.getArguments();
                    if (arguments != null) {
                    }
                    bundle.putInt("collection_position_in_list", i12);
                    if (!kotlin.jvm.internal.i.b(type, "main_activity")) {
                    }
                    bundle.putBoolean("dynamicV1", ((str4 != null || gv.n.B0(str4)) ? 1 : 1) ^ 1);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, str5);
                    return hs.k.f19476a;
                }
                try {
                    ta.v.H(kc.f.H(oVar2), null, 0, new cn.k(oVar2, id2, type, str, booleanValue3, id3, "collections", booleanValue, null), 3);
                } catch (Exception e12) {
                    e = e12;
                    LogHelper.INSTANCE.e(oVar.f5660y, e);
                    nVar2 = nVar;
                    recyclerView = (RecyclerView) nVar2._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                    if (recyclerView != null) {
                    }
                    if (eVar instanceof zm.f) {
                    }
                    int i122 = -1;
                    if (fVar2 != null) {
                    }
                    requireActivity = nVar2.requireActivity();
                    if (requireActivity instanceof LibraryActivity) {
                    }
                    if (libraryActivity != 0) {
                    }
                    Context requireContext2 = nVar2.requireContext();
                    if (z10) {
                    }
                    Toast.makeText(requireContext2, nVar2.getString(i11), i10).show();
                    String str62 = gk.a.f16573a;
                    if (z10) {
                    }
                    bundle = new Bundle();
                    bundle.putString("collection_name", libraryCollection.getStrings().get(i10));
                    bundle.putString("activity_name", str);
                    bundle.putString("parent_activity", str2);
                    bundle.putString("status_of_activity_when_clicked", str3);
                    bundle.putBoolean("main_activity", booleanValue2);
                    bundle.putBoolean("paid_activity", !booleanValue);
                    if (booleanValue2) {
                    }
                    if (!booleanValue2) {
                    }
                    arguments = nVar2.getArguments();
                    if (arguments != null) {
                    }
                    bundle.putInt("collection_position_in_list", i122);
                    if (!kotlin.jvm.internal.i.b(type, "main_activity")) {
                    }
                    bundle.putBoolean("dynamicV1", ((str4 != null || gv.n.B0(str4)) ? 1 : 1) ^ 1);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle, str5);
                    return hs.k.f19476a;
                }
            } else {
                libraryCollection = libraryCollection2;
                fVar = null;
                nVar = nVar3;
                z10 = booleanValue3;
                i6 = intValue;
                i10 = 0;
            }
            nVar2 = nVar;
            recyclerView = (RecyclerView) nVar2._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = fVar;
            }
            if (eVar instanceof zm.f) {
                fVar2 = (zm.f) eVar;
            } else {
                fVar2 = fVar;
            }
            int i1222 = -1;
            if (fVar2 != null) {
                HashMap<String, LibraryCollectionItemAccessModel> hashMap2 = fVar2.f39638y;
                if (hashMap2 != null) {
                    try {
                        libraryCollectionItemAccessModel2 = hashMap2.get(id2);
                    } catch (Exception e13) {
                        LogHelper.INSTANCE.e(fVar2.F, e13);
                    }
                }
                libraryCollectionItemAccessModel2 = new LibraryCollectionItemAccessModel();
                libraryCollectionItemAccessModel2.setBookmarked(z10);
                if (hashMap2 != null) {
                    hashMap2.put(id2, libraryCollectionItemAccessModel2);
                }
                Iterator<hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>>> it = fVar2.f39637x.iterator();
                int i13 = 0;
                while (true) {
                    if (it.hasNext()) {
                        hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>> next = it.next();
                        if (!kotlin.jvm.internal.i.b(next.f19464u.getId(), id2)) {
                            ArrayList<LibraryCollectionItem> arrayList = next.f19465v;
                            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                for (LibraryCollectionItem libraryCollectionItem : arrayList) {
                                    if (kotlin.jvm.internal.i.b(libraryCollectionItem.getId(), id2)) {
                                        z14 = true;
                                        break;
                                    }
                                }
                            }
                            z14 = false;
                            if (!z14) {
                                z13 = false;
                                if (!z13) {
                                    break;
                                }
                                i13++;
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i13);
                if (valueOf.intValue() == -1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Integer num2 = !z12 ? valueOf : fVar;
                if (num2 != 0) {
                    fVar2.j(num2.intValue());
                }
            }
            try {
                requireActivity = nVar2.requireActivity();
                if (requireActivity instanceof LibraryActivity) {
                    libraryActivity = (LibraryActivity) requireActivity;
                } else {
                    libraryActivity = fVar;
                }
                if (libraryActivity != 0 && (libraryCollectionItemAccessModel = libraryActivity.f11294y.get(id2)) != null) {
                    HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = libraryActivity.f11294y;
                    libraryCollectionItemAccessModel.setBookmarked(z10);
                    hashMap3.put(id2, libraryCollectionItemAccessModel);
                }
            } catch (Exception e14) {
                LogHelper.INSTANCE.e(nVar2.f744u, e14);
            }
            Context requireContext22 = nVar2.requireContext();
            if (z10) {
                i11 = R.string.notV4BookmarkSavedToast;
            } else {
                i11 = R.string.notV4BookmarkUnsavedToast;
            }
            Toast.makeText(requireContext22, nVar2.getString(i11), i10).show();
            String str622 = gk.a.f16573a;
            if (z10) {
                str5 = "lib_collect_inside_activity_bookmark";
            } else {
                str5 = "lib_collect_inside_activity_bookmark_un";
            }
            bundle = new Bundle();
            bundle.putString("collection_name", libraryCollection.getStrings().get(i10));
            bundle.putString("activity_name", str);
            bundle.putString("parent_activity", str2);
            bundle.putString("status_of_activity_when_clicked", str3);
            bundle.putBoolean("main_activity", booleanValue2);
            bundle.putBoolean("paid_activity", !booleanValue);
            if (booleanValue2) {
                bundle.putInt("activity_position_in_list", i6);
            }
            if (!booleanValue2) {
                if (bool3 != null) {
                    z11 = bool3.booleanValue();
                } else {
                    z11 = false;
                }
                bundle.putBoolean("parent_activity_completed", z11);
            }
            arguments = nVar2.getArguments();
            if (arguments != null) {
                i1222 = arguments.getInt("collection_pos", -1);
            }
            bundle.putInt("collection_position_in_list", i1222);
            if (!kotlin.jvm.internal.i.b(type, "main_activity") || kotlin.jvm.internal.i.b(type, "filler_activity")) {
                bundle.putBoolean("dynamicV1", ((str4 != null || gv.n.B0(str4)) ? 1 : 1) ^ 1);
            }
            hs.k kVar22 = hs.k.f19476a;
            gk.a.b(bundle, str5);
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryCollectionDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f756a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n f757b;

        public g(View view, n nVar) {
            this.f756a = view;
            this.f757b = nVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            try {
                this.f756a.setVisibility(8);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f757b.f744u, e10);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            try {
                this.f756a.setVisibility(8);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f757b.f744u, e10);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    public n() {
        boolean z10;
        boolean z11;
        String[] strArr = new String[3];
        for (int i6 = 0; i6 < 3; i6++) {
            strArr[i6] = "";
        }
        this.f747x = strArr;
        this.f749z = new HashMap<>();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            HashMap<String, Object> appConfig = user.getAppConfig();
            if (appConfig != null && appConfig.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && !kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                z10 = true;
                this.D = z10;
                androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f743v;

                    {
                        this.f743v = this;
                    }

                    @Override // androidx.activity.result.b
                    public final void b(Object obj) {
                        boolean z12;
                        boolean z13;
                        RecyclerView.e eVar;
                        zm.f fVar;
                        String str;
                        String id2;
                        boolean z14;
                        boolean z15;
                        RecyclerView.e eVar2;
                        zm.f fVar2;
                        String str2;
                        String id3;
                        boolean z16;
                        boolean z17;
                        RecyclerView.e eVar3;
                        zm.f fVar3;
                        String str3;
                        String id4;
                        int i10 = r2;
                        n this$0 = this.f743v;
                        boolean z18 = true;
                        switch (i10) {
                            case 0:
                                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                                int i11 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr2 = this$0.f747x;
                                try {
                                    Intent intent = aVar.f977v;
                                    if (intent != null && intent.hasExtra("showSelling")) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    HashMap<String, Object> hashMap = this$0.f749z;
                                    if (z14) {
                                        if (strArr2.length == 3) {
                                            int length = strArr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length) {
                                                    if (gv.n.B0(strArr2[i12])) {
                                                        z15 = false;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else {
                                                    z15 = true;
                                                }
                                            }
                                            if (z15) {
                                                cn.o oVar = this$0.f746w;
                                                if (oVar != null) {
                                                    String str4 = strArr2[0];
                                                    String str5 = strArr2[1];
                                                    String str6 = strArr2[2];
                                                    LibraryCollection libraryCollection = this$0.A;
                                                    if (libraryCollection != null && (id3 = libraryCollection.getId()) != null) {
                                                        str2 = id3;
                                                        oVar.e(str4, str5, str6, str2, this$0.f748y);
                                                    }
                                                    str2 = "";
                                                    oVar.e(str4, str5, str6, str2, this$0.f748y);
                                                }
                                                RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView != null) {
                                                    eVar2 = recyclerView.getAdapter();
                                                } else {
                                                    eVar2 = null;
                                                }
                                                if (eVar2 instanceof zm.f) {
                                                    fVar2 = (zm.f) eVar2;
                                                } else {
                                                    fVar2 = null;
                                                }
                                                if (fVar2 != null) {
                                                    fVar2.x(strArr2[0]);
                                                }
                                                this$0.J(strArr2[0]);
                                            }
                                        }
                                        String str7 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        Set<String> keySet = hashMap.keySet();
                                        kotlin.jvm.internal.i.f(keySet, "activityCompletionAnalyticsValues.keys");
                                        for (String str8 : keySet) {
                                            Object obj2 = hashMap.get(str8);
                                            if (obj2 instanceof String) {
                                                bundle.putString(str8, (String) obj2);
                                            } else if (obj2 instanceof Integer) {
                                                bundle.putInt(str8, ((Number) obj2).intValue());
                                            } else if (obj2 instanceof Boolean) {
                                                bundle.putBoolean(str8, ((Boolean) obj2).booleanValue());
                                            }
                                        }
                                        Intent intent2 = aVar.f977v;
                                        if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                            z18 = false;
                                        }
                                        bundle.putBoolean("feedback_helpful", z18);
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "lib_collect_activity_complete");
                                    } else {
                                        String str9 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        Set<String> keySet2 = hashMap.keySet();
                                        kotlin.jvm.internal.i.f(keySet2, "activityCompletionAnalyticsValues.keys");
                                        for (String str10 : keySet2) {
                                            Object obj3 = hashMap.get(str10);
                                            if (obj3 instanceof String) {
                                                bundle2.putString(str10, (String) obj3);
                                            } else if (obj3 instanceof Integer) {
                                                bundle2.putInt(str10, ((Number) obj3).intValue());
                                            } else if (obj3 instanceof Boolean) {
                                                bundle2.putBoolean(str10, ((Boolean) obj3).booleanValue());
                                            }
                                        }
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "lib_collect_activity_incomplete");
                                    }
                                    hashMap.clear();
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e10);
                                    return;
                                }
                            case 1:
                                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                                int i13 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr3 = this$0.f747x;
                                try {
                                    Intent intent3 = aVar2.f977v;
                                    if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    HashMap<String, Object> hashMap2 = this$0.f749z;
                                    if (z16) {
                                        if (strArr3.length == 3) {
                                            int length2 = strArr3.length;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < length2) {
                                                    if (gv.n.B0(strArr3[i14])) {
                                                        z17 = false;
                                                    } else {
                                                        i14++;
                                                    }
                                                } else {
                                                    z17 = true;
                                                }
                                            }
                                            if (z17) {
                                                cn.o oVar2 = this$0.f746w;
                                                if (oVar2 != null) {
                                                    String str11 = strArr3[0];
                                                    String str12 = strArr3[1];
                                                    String str13 = strArr3[2];
                                                    LibraryCollection libraryCollection2 = this$0.A;
                                                    if (libraryCollection2 != null && (id4 = libraryCollection2.getId()) != null) {
                                                        str3 = id4;
                                                        oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                                    }
                                                    str3 = "";
                                                    oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                                }
                                                RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView2 != null) {
                                                    eVar3 = recyclerView2.getAdapter();
                                                } else {
                                                    eVar3 = null;
                                                }
                                                if (eVar3 instanceof zm.f) {
                                                    fVar3 = (zm.f) eVar3;
                                                } else {
                                                    fVar3 = null;
                                                }
                                                if (fVar3 != null) {
                                                    fVar3.x(strArr3[0]);
                                                }
                                                this$0.J(strArr3[0]);
                                            }
                                        }
                                        String str14 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        Set<String> keySet3 = hashMap2.keySet();
                                        kotlin.jvm.internal.i.f(keySet3, "activityCompletionAnalyticsValues.keys");
                                        for (String str15 : keySet3) {
                                            Object obj4 = hashMap2.get(str15);
                                            if (obj4 instanceof String) {
                                                bundle3.putString(str15, (String) obj4);
                                            } else if (obj4 instanceof Integer) {
                                                bundle3.putInt(str15, ((Number) obj4).intValue());
                                            } else if (obj4 instanceof Boolean) {
                                                bundle3.putBoolean(str15, ((Boolean) obj4).booleanValue());
                                            }
                                        }
                                        Intent intent4 = aVar2.f977v;
                                        if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                            z18 = false;
                                        }
                                        bundle3.putBoolean("feedback_helpful", z18);
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "lib_collect_activity_complete");
                                    } else {
                                        String str16 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        Set<String> keySet4 = hashMap2.keySet();
                                        kotlin.jvm.internal.i.f(keySet4, "activityCompletionAnalyticsValues.keys");
                                        for (String str17 : keySet4) {
                                            Object obj5 = hashMap2.get(str17);
                                            if (obj5 instanceof String) {
                                                bundle4.putString(str17, (String) obj5);
                                            } else if (obj5 instanceof Integer) {
                                                bundle4.putInt(str17, ((Number) obj5).intValue());
                                            } else if (obj5 instanceof Boolean) {
                                                bundle4.putBoolean(str17, ((Boolean) obj5).booleanValue());
                                            }
                                        }
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "lib_collect_activity_incomplete");
                                    }
                                    hashMap2.clear();
                                    return;
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e11);
                                    return;
                                }
                            default:
                                androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                                int i15 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr4 = this$0.f747x;
                                try {
                                    Intent intent5 = aVar3.f977v;
                                    if (intent5 != null && intent5.getBooleanExtra("wasActivityPlayed", false)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    HashMap<String, Object> hashMap3 = this$0.f749z;
                                    Intent intent6 = aVar3.f977v;
                                    if (z12) {
                                        if (strArr4.length == 3) {
                                            int length3 = strArr4.length;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 < length3) {
                                                    if (gv.n.B0(strArr4[i16])) {
                                                        z13 = false;
                                                    } else {
                                                        i16++;
                                                    }
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                            if (z13) {
                                                cn.o oVar3 = this$0.f746w;
                                                if (oVar3 != null) {
                                                    String str18 = strArr4[0];
                                                    String str19 = strArr4[1];
                                                    String str20 = strArr4[2];
                                                    LibraryCollection libraryCollection3 = this$0.A;
                                                    if (libraryCollection3 != null && (id2 = libraryCollection3.getId()) != null) {
                                                        str = id2;
                                                        oVar3.e(str18, str19, str20, str, this$0.f748y);
                                                    }
                                                    str = "";
                                                    oVar3.e(str18, str19, str20, str, this$0.f748y);
                                                }
                                                RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView3 != null) {
                                                    eVar = recyclerView3.getAdapter();
                                                } else {
                                                    eVar = null;
                                                }
                                                if (eVar instanceof zm.f) {
                                                    fVar = (zm.f) eVar;
                                                } else {
                                                    fVar = null;
                                                }
                                                if (fVar != null) {
                                                    fVar.x(strArr4[0]);
                                                }
                                                this$0.J(strArr4[0]);
                                            }
                                        }
                                        String str21 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        Set<String> keySet5 = hashMap3.keySet();
                                        kotlin.jvm.internal.i.f(keySet5, "activityCompletionAnalyticsValues.keys");
                                        for (String str22 : keySet5) {
                                            Object obj6 = hashMap3.get(str22);
                                            if (obj6 instanceof String) {
                                                bundle5.putString(str22, (String) obj6);
                                            } else if (obj6 instanceof Integer) {
                                                bundle5.putInt(str22, ((Number) obj6).intValue());
                                            } else if (obj6 instanceof Boolean) {
                                                bundle5.putBoolean(str22, ((Boolean) obj6).booleanValue());
                                            }
                                        }
                                        if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                            z18 = false;
                                        }
                                        bundle5.putBoolean("ra_goal_added", z18);
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "lib_collect_activity_complete");
                                    } else {
                                        String str23 = gk.a.f16573a;
                                        Bundle bundle6 = new Bundle();
                                        Set<String> keySet6 = hashMap3.keySet();
                                        kotlin.jvm.internal.i.f(keySet6, "activityCompletionAnalyticsValues.keys");
                                        for (String str24 : keySet6) {
                                            Object obj7 = hashMap3.get(str24);
                                            if (obj7 instanceof String) {
                                                bundle6.putString(str24, (String) obj7);
                                            } else if (obj7 instanceof Integer) {
                                                bundle6.putInt(str24, ((Number) obj7).intValue());
                                            } else if (obj7 instanceof Boolean) {
                                                bundle6.putBoolean(str24, ((Boolean) obj7).booleanValue());
                                            }
                                        }
                                        if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                            z18 = false;
                                        }
                                        bundle6.putBoolean("ra_goal_added", z18);
                                        hs.k kVar6 = hs.k.f19476a;
                                        gk.a.b(bundle6, "lib_collect_activity_incomplete");
                                    }
                                    hashMap3.clear();
                                    return;
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e12);
                                    return;
                                }
                        }
                    }
                });
                kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…e(TAG, e)\n        }\n    }");
                this.E = registerForActivityResult;
                androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f743v;

                    {
                        this.f743v = this;
                    }

                    @Override // androidx.activity.result.b
                    public final void b(Object obj) {
                        boolean z12;
                        boolean z13;
                        RecyclerView.e eVar;
                        zm.f fVar;
                        String str;
                        String id2;
                        boolean z14;
                        boolean z15;
                        RecyclerView.e eVar2;
                        zm.f fVar2;
                        String str2;
                        String id3;
                        boolean z16;
                        boolean z17;
                        RecyclerView.e eVar3;
                        zm.f fVar3;
                        String str3;
                        String id4;
                        int i10 = r2;
                        n this$0 = this.f743v;
                        boolean z18 = true;
                        switch (i10) {
                            case 0:
                                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                                int i11 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr2 = this$0.f747x;
                                try {
                                    Intent intent = aVar.f977v;
                                    if (intent != null && intent.hasExtra("showSelling")) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    HashMap<String, Object> hashMap = this$0.f749z;
                                    if (z14) {
                                        if (strArr2.length == 3) {
                                            int length = strArr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length) {
                                                    if (gv.n.B0(strArr2[i12])) {
                                                        z15 = false;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else {
                                                    z15 = true;
                                                }
                                            }
                                            if (z15) {
                                                cn.o oVar = this$0.f746w;
                                                if (oVar != null) {
                                                    String str4 = strArr2[0];
                                                    String str5 = strArr2[1];
                                                    String str6 = strArr2[2];
                                                    LibraryCollection libraryCollection = this$0.A;
                                                    if (libraryCollection != null && (id3 = libraryCollection.getId()) != null) {
                                                        str2 = id3;
                                                        oVar.e(str4, str5, str6, str2, this$0.f748y);
                                                    }
                                                    str2 = "";
                                                    oVar.e(str4, str5, str6, str2, this$0.f748y);
                                                }
                                                RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView != null) {
                                                    eVar2 = recyclerView.getAdapter();
                                                } else {
                                                    eVar2 = null;
                                                }
                                                if (eVar2 instanceof zm.f) {
                                                    fVar2 = (zm.f) eVar2;
                                                } else {
                                                    fVar2 = null;
                                                }
                                                if (fVar2 != null) {
                                                    fVar2.x(strArr2[0]);
                                                }
                                                this$0.J(strArr2[0]);
                                            }
                                        }
                                        String str7 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        Set<String> keySet = hashMap.keySet();
                                        kotlin.jvm.internal.i.f(keySet, "activityCompletionAnalyticsValues.keys");
                                        for (String str8 : keySet) {
                                            Object obj2 = hashMap.get(str8);
                                            if (obj2 instanceof String) {
                                                bundle.putString(str8, (String) obj2);
                                            } else if (obj2 instanceof Integer) {
                                                bundle.putInt(str8, ((Number) obj2).intValue());
                                            } else if (obj2 instanceof Boolean) {
                                                bundle.putBoolean(str8, ((Boolean) obj2).booleanValue());
                                            }
                                        }
                                        Intent intent2 = aVar.f977v;
                                        if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                            z18 = false;
                                        }
                                        bundle.putBoolean("feedback_helpful", z18);
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "lib_collect_activity_complete");
                                    } else {
                                        String str9 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        Set<String> keySet2 = hashMap.keySet();
                                        kotlin.jvm.internal.i.f(keySet2, "activityCompletionAnalyticsValues.keys");
                                        for (String str10 : keySet2) {
                                            Object obj3 = hashMap.get(str10);
                                            if (obj3 instanceof String) {
                                                bundle2.putString(str10, (String) obj3);
                                            } else if (obj3 instanceof Integer) {
                                                bundle2.putInt(str10, ((Number) obj3).intValue());
                                            } else if (obj3 instanceof Boolean) {
                                                bundle2.putBoolean(str10, ((Boolean) obj3).booleanValue());
                                            }
                                        }
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "lib_collect_activity_incomplete");
                                    }
                                    hashMap.clear();
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e10);
                                    return;
                                }
                            case 1:
                                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                                int i13 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr3 = this$0.f747x;
                                try {
                                    Intent intent3 = aVar2.f977v;
                                    if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    HashMap<String, Object> hashMap2 = this$0.f749z;
                                    if (z16) {
                                        if (strArr3.length == 3) {
                                            int length2 = strArr3.length;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < length2) {
                                                    if (gv.n.B0(strArr3[i14])) {
                                                        z17 = false;
                                                    } else {
                                                        i14++;
                                                    }
                                                } else {
                                                    z17 = true;
                                                }
                                            }
                                            if (z17) {
                                                cn.o oVar2 = this$0.f746w;
                                                if (oVar2 != null) {
                                                    String str11 = strArr3[0];
                                                    String str12 = strArr3[1];
                                                    String str13 = strArr3[2];
                                                    LibraryCollection libraryCollection2 = this$0.A;
                                                    if (libraryCollection2 != null && (id4 = libraryCollection2.getId()) != null) {
                                                        str3 = id4;
                                                        oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                                    }
                                                    str3 = "";
                                                    oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                                }
                                                RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView2 != null) {
                                                    eVar3 = recyclerView2.getAdapter();
                                                } else {
                                                    eVar3 = null;
                                                }
                                                if (eVar3 instanceof zm.f) {
                                                    fVar3 = (zm.f) eVar3;
                                                } else {
                                                    fVar3 = null;
                                                }
                                                if (fVar3 != null) {
                                                    fVar3.x(strArr3[0]);
                                                }
                                                this$0.J(strArr3[0]);
                                            }
                                        }
                                        String str14 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        Set<String> keySet3 = hashMap2.keySet();
                                        kotlin.jvm.internal.i.f(keySet3, "activityCompletionAnalyticsValues.keys");
                                        for (String str15 : keySet3) {
                                            Object obj4 = hashMap2.get(str15);
                                            if (obj4 instanceof String) {
                                                bundle3.putString(str15, (String) obj4);
                                            } else if (obj4 instanceof Integer) {
                                                bundle3.putInt(str15, ((Number) obj4).intValue());
                                            } else if (obj4 instanceof Boolean) {
                                                bundle3.putBoolean(str15, ((Boolean) obj4).booleanValue());
                                            }
                                        }
                                        Intent intent4 = aVar2.f977v;
                                        if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                            z18 = false;
                                        }
                                        bundle3.putBoolean("feedback_helpful", z18);
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "lib_collect_activity_complete");
                                    } else {
                                        String str16 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        Set<String> keySet4 = hashMap2.keySet();
                                        kotlin.jvm.internal.i.f(keySet4, "activityCompletionAnalyticsValues.keys");
                                        for (String str17 : keySet4) {
                                            Object obj5 = hashMap2.get(str17);
                                            if (obj5 instanceof String) {
                                                bundle4.putString(str17, (String) obj5);
                                            } else if (obj5 instanceof Integer) {
                                                bundle4.putInt(str17, ((Number) obj5).intValue());
                                            } else if (obj5 instanceof Boolean) {
                                                bundle4.putBoolean(str17, ((Boolean) obj5).booleanValue());
                                            }
                                        }
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "lib_collect_activity_incomplete");
                                    }
                                    hashMap2.clear();
                                    return;
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e11);
                                    return;
                                }
                            default:
                                androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                                int i15 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr4 = this$0.f747x;
                                try {
                                    Intent intent5 = aVar3.f977v;
                                    if (intent5 != null && intent5.getBooleanExtra("wasActivityPlayed", false)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    HashMap<String, Object> hashMap3 = this$0.f749z;
                                    Intent intent6 = aVar3.f977v;
                                    if (z12) {
                                        if (strArr4.length == 3) {
                                            int length3 = strArr4.length;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 < length3) {
                                                    if (gv.n.B0(strArr4[i16])) {
                                                        z13 = false;
                                                    } else {
                                                        i16++;
                                                    }
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                            if (z13) {
                                                cn.o oVar3 = this$0.f746w;
                                                if (oVar3 != null) {
                                                    String str18 = strArr4[0];
                                                    String str19 = strArr4[1];
                                                    String str20 = strArr4[2];
                                                    LibraryCollection libraryCollection3 = this$0.A;
                                                    if (libraryCollection3 != null && (id2 = libraryCollection3.getId()) != null) {
                                                        str = id2;
                                                        oVar3.e(str18, str19, str20, str, this$0.f748y);
                                                    }
                                                    str = "";
                                                    oVar3.e(str18, str19, str20, str, this$0.f748y);
                                                }
                                                RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView3 != null) {
                                                    eVar = recyclerView3.getAdapter();
                                                } else {
                                                    eVar = null;
                                                }
                                                if (eVar instanceof zm.f) {
                                                    fVar = (zm.f) eVar;
                                                } else {
                                                    fVar = null;
                                                }
                                                if (fVar != null) {
                                                    fVar.x(strArr4[0]);
                                                }
                                                this$0.J(strArr4[0]);
                                            }
                                        }
                                        String str21 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        Set<String> keySet5 = hashMap3.keySet();
                                        kotlin.jvm.internal.i.f(keySet5, "activityCompletionAnalyticsValues.keys");
                                        for (String str22 : keySet5) {
                                            Object obj6 = hashMap3.get(str22);
                                            if (obj6 instanceof String) {
                                                bundle5.putString(str22, (String) obj6);
                                            } else if (obj6 instanceof Integer) {
                                                bundle5.putInt(str22, ((Number) obj6).intValue());
                                            } else if (obj6 instanceof Boolean) {
                                                bundle5.putBoolean(str22, ((Boolean) obj6).booleanValue());
                                            }
                                        }
                                        if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                            z18 = false;
                                        }
                                        bundle5.putBoolean("ra_goal_added", z18);
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "lib_collect_activity_complete");
                                    } else {
                                        String str23 = gk.a.f16573a;
                                        Bundle bundle6 = new Bundle();
                                        Set<String> keySet6 = hashMap3.keySet();
                                        kotlin.jvm.internal.i.f(keySet6, "activityCompletionAnalyticsValues.keys");
                                        for (String str24 : keySet6) {
                                            Object obj7 = hashMap3.get(str24);
                                            if (obj7 instanceof String) {
                                                bundle6.putString(str24, (String) obj7);
                                            } else if (obj7 instanceof Integer) {
                                                bundle6.putInt(str24, ((Number) obj7).intValue());
                                            } else if (obj7 instanceof Boolean) {
                                                bundle6.putBoolean(str24, ((Boolean) obj7).booleanValue());
                                            }
                                        }
                                        if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                            z18 = false;
                                        }
                                        bundle6.putBoolean("ra_goal_added", z18);
                                        hs.k kVar6 = hs.k.f19476a;
                                        gk.a.b(bundle6, "lib_collect_activity_incomplete");
                                    }
                                    hashMap3.clear();
                                    return;
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e12);
                                    return;
                                }
                        }
                    }
                });
                kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…e(TAG, e)\n        }\n    }");
                this.F = registerForActivityResult2;
                androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f743v;

                    {
                        this.f743v = this;
                    }

                    @Override // androidx.activity.result.b
                    public final void b(Object obj) {
                        boolean z12;
                        boolean z13;
                        RecyclerView.e eVar;
                        zm.f fVar;
                        String str;
                        String id2;
                        boolean z14;
                        boolean z15;
                        RecyclerView.e eVar2;
                        zm.f fVar2;
                        String str2;
                        String id3;
                        boolean z16;
                        boolean z17;
                        RecyclerView.e eVar3;
                        zm.f fVar3;
                        String str3;
                        String id4;
                        int i10 = r2;
                        n this$0 = this.f743v;
                        boolean z18 = true;
                        switch (i10) {
                            case 0:
                                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                                int i11 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr2 = this$0.f747x;
                                try {
                                    Intent intent = aVar.f977v;
                                    if (intent != null && intent.hasExtra("showSelling")) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    HashMap<String, Object> hashMap = this$0.f749z;
                                    if (z14) {
                                        if (strArr2.length == 3) {
                                            int length = strArr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length) {
                                                    if (gv.n.B0(strArr2[i12])) {
                                                        z15 = false;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else {
                                                    z15 = true;
                                                }
                                            }
                                            if (z15) {
                                                cn.o oVar = this$0.f746w;
                                                if (oVar != null) {
                                                    String str4 = strArr2[0];
                                                    String str5 = strArr2[1];
                                                    String str6 = strArr2[2];
                                                    LibraryCollection libraryCollection = this$0.A;
                                                    if (libraryCollection != null && (id3 = libraryCollection.getId()) != null) {
                                                        str2 = id3;
                                                        oVar.e(str4, str5, str6, str2, this$0.f748y);
                                                    }
                                                    str2 = "";
                                                    oVar.e(str4, str5, str6, str2, this$0.f748y);
                                                }
                                                RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView != null) {
                                                    eVar2 = recyclerView.getAdapter();
                                                } else {
                                                    eVar2 = null;
                                                }
                                                if (eVar2 instanceof zm.f) {
                                                    fVar2 = (zm.f) eVar2;
                                                } else {
                                                    fVar2 = null;
                                                }
                                                if (fVar2 != null) {
                                                    fVar2.x(strArr2[0]);
                                                }
                                                this$0.J(strArr2[0]);
                                            }
                                        }
                                        String str7 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        Set<String> keySet = hashMap.keySet();
                                        kotlin.jvm.internal.i.f(keySet, "activityCompletionAnalyticsValues.keys");
                                        for (String str8 : keySet) {
                                            Object obj2 = hashMap.get(str8);
                                            if (obj2 instanceof String) {
                                                bundle.putString(str8, (String) obj2);
                                            } else if (obj2 instanceof Integer) {
                                                bundle.putInt(str8, ((Number) obj2).intValue());
                                            } else if (obj2 instanceof Boolean) {
                                                bundle.putBoolean(str8, ((Boolean) obj2).booleanValue());
                                            }
                                        }
                                        Intent intent2 = aVar.f977v;
                                        if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                            z18 = false;
                                        }
                                        bundle.putBoolean("feedback_helpful", z18);
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "lib_collect_activity_complete");
                                    } else {
                                        String str9 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        Set<String> keySet2 = hashMap.keySet();
                                        kotlin.jvm.internal.i.f(keySet2, "activityCompletionAnalyticsValues.keys");
                                        for (String str10 : keySet2) {
                                            Object obj3 = hashMap.get(str10);
                                            if (obj3 instanceof String) {
                                                bundle2.putString(str10, (String) obj3);
                                            } else if (obj3 instanceof Integer) {
                                                bundle2.putInt(str10, ((Number) obj3).intValue());
                                            } else if (obj3 instanceof Boolean) {
                                                bundle2.putBoolean(str10, ((Boolean) obj3).booleanValue());
                                            }
                                        }
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "lib_collect_activity_incomplete");
                                    }
                                    hashMap.clear();
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e10);
                                    return;
                                }
                            case 1:
                                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                                int i13 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr3 = this$0.f747x;
                                try {
                                    Intent intent3 = aVar2.f977v;
                                    if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    HashMap<String, Object> hashMap2 = this$0.f749z;
                                    if (z16) {
                                        if (strArr3.length == 3) {
                                            int length2 = strArr3.length;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < length2) {
                                                    if (gv.n.B0(strArr3[i14])) {
                                                        z17 = false;
                                                    } else {
                                                        i14++;
                                                    }
                                                } else {
                                                    z17 = true;
                                                }
                                            }
                                            if (z17) {
                                                cn.o oVar2 = this$0.f746w;
                                                if (oVar2 != null) {
                                                    String str11 = strArr3[0];
                                                    String str12 = strArr3[1];
                                                    String str13 = strArr3[2];
                                                    LibraryCollection libraryCollection2 = this$0.A;
                                                    if (libraryCollection2 != null && (id4 = libraryCollection2.getId()) != null) {
                                                        str3 = id4;
                                                        oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                                    }
                                                    str3 = "";
                                                    oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                                }
                                                RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView2 != null) {
                                                    eVar3 = recyclerView2.getAdapter();
                                                } else {
                                                    eVar3 = null;
                                                }
                                                if (eVar3 instanceof zm.f) {
                                                    fVar3 = (zm.f) eVar3;
                                                } else {
                                                    fVar3 = null;
                                                }
                                                if (fVar3 != null) {
                                                    fVar3.x(strArr3[0]);
                                                }
                                                this$0.J(strArr3[0]);
                                            }
                                        }
                                        String str14 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        Set<String> keySet3 = hashMap2.keySet();
                                        kotlin.jvm.internal.i.f(keySet3, "activityCompletionAnalyticsValues.keys");
                                        for (String str15 : keySet3) {
                                            Object obj4 = hashMap2.get(str15);
                                            if (obj4 instanceof String) {
                                                bundle3.putString(str15, (String) obj4);
                                            } else if (obj4 instanceof Integer) {
                                                bundle3.putInt(str15, ((Number) obj4).intValue());
                                            } else if (obj4 instanceof Boolean) {
                                                bundle3.putBoolean(str15, ((Boolean) obj4).booleanValue());
                                            }
                                        }
                                        Intent intent4 = aVar2.f977v;
                                        if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                            z18 = false;
                                        }
                                        bundle3.putBoolean("feedback_helpful", z18);
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "lib_collect_activity_complete");
                                    } else {
                                        String str16 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        Set<String> keySet4 = hashMap2.keySet();
                                        kotlin.jvm.internal.i.f(keySet4, "activityCompletionAnalyticsValues.keys");
                                        for (String str17 : keySet4) {
                                            Object obj5 = hashMap2.get(str17);
                                            if (obj5 instanceof String) {
                                                bundle4.putString(str17, (String) obj5);
                                            } else if (obj5 instanceof Integer) {
                                                bundle4.putInt(str17, ((Number) obj5).intValue());
                                            } else if (obj5 instanceof Boolean) {
                                                bundle4.putBoolean(str17, ((Boolean) obj5).booleanValue());
                                            }
                                        }
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "lib_collect_activity_incomplete");
                                    }
                                    hashMap2.clear();
                                    return;
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e11);
                                    return;
                                }
                            default:
                                androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                                int i15 = n.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String[] strArr4 = this$0.f747x;
                                try {
                                    Intent intent5 = aVar3.f977v;
                                    if (intent5 != null && intent5.getBooleanExtra("wasActivityPlayed", false)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    HashMap<String, Object> hashMap3 = this$0.f749z;
                                    Intent intent6 = aVar3.f977v;
                                    if (z12) {
                                        if (strArr4.length == 3) {
                                            int length3 = strArr4.length;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 < length3) {
                                                    if (gv.n.B0(strArr4[i16])) {
                                                        z13 = false;
                                                    } else {
                                                        i16++;
                                                    }
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                            if (z13) {
                                                cn.o oVar3 = this$0.f746w;
                                                if (oVar3 != null) {
                                                    String str18 = strArr4[0];
                                                    String str19 = strArr4[1];
                                                    String str20 = strArr4[2];
                                                    LibraryCollection libraryCollection3 = this$0.A;
                                                    if (libraryCollection3 != null && (id2 = libraryCollection3.getId()) != null) {
                                                        str = id2;
                                                        oVar3.e(str18, str19, str20, str, this$0.f748y);
                                                    }
                                                    str = "";
                                                    oVar3.e(str18, str19, str20, str, this$0.f748y);
                                                }
                                                RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                                if (recyclerView3 != null) {
                                                    eVar = recyclerView3.getAdapter();
                                                } else {
                                                    eVar = null;
                                                }
                                                if (eVar instanceof zm.f) {
                                                    fVar = (zm.f) eVar;
                                                } else {
                                                    fVar = null;
                                                }
                                                if (fVar != null) {
                                                    fVar.x(strArr4[0]);
                                                }
                                                this$0.J(strArr4[0]);
                                            }
                                        }
                                        String str21 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        Set<String> keySet5 = hashMap3.keySet();
                                        kotlin.jvm.internal.i.f(keySet5, "activityCompletionAnalyticsValues.keys");
                                        for (String str22 : keySet5) {
                                            Object obj6 = hashMap3.get(str22);
                                            if (obj6 instanceof String) {
                                                bundle5.putString(str22, (String) obj6);
                                            } else if (obj6 instanceof Integer) {
                                                bundle5.putInt(str22, ((Number) obj6).intValue());
                                            } else if (obj6 instanceof Boolean) {
                                                bundle5.putBoolean(str22, ((Boolean) obj6).booleanValue());
                                            }
                                        }
                                        if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                            z18 = false;
                                        }
                                        bundle5.putBoolean("ra_goal_added", z18);
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "lib_collect_activity_complete");
                                    } else {
                                        String str23 = gk.a.f16573a;
                                        Bundle bundle6 = new Bundle();
                                        Set<String> keySet6 = hashMap3.keySet();
                                        kotlin.jvm.internal.i.f(keySet6, "activityCompletionAnalyticsValues.keys");
                                        for (String str24 : keySet6) {
                                            Object obj7 = hashMap3.get(str24);
                                            if (obj7 instanceof String) {
                                                bundle6.putString(str24, (String) obj7);
                                            } else if (obj7 instanceof Integer) {
                                                bundle6.putInt(str24, ((Number) obj7).intValue());
                                            } else if (obj7 instanceof Boolean) {
                                                bundle6.putBoolean(str24, ((Boolean) obj7).booleanValue());
                                            }
                                        }
                                        if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                            z18 = false;
                                        }
                                        bundle6.putBoolean("ra_goal_added", z18);
                                        hs.k kVar6 = hs.k.f19476a;
                                        gk.a.b(bundle6, "lib_collect_activity_incomplete");
                                    }
                                    hashMap3.clear();
                                    return;
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e(this$0.f744u, e12);
                                    return;
                                }
                        }
                    }
                });
                kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…e(TAG, e)\n        }\n    }");
                this.G = registerForActivityResult3;
            }
        }
        z10 = false;
        this.D = z10;
        androidx.activity.result.c<Intent> registerForActivityResult4 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ n f743v;

            {
                this.f743v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z12;
                boolean z13;
                RecyclerView.e eVar;
                zm.f fVar;
                String str;
                String id2;
                boolean z14;
                boolean z15;
                RecyclerView.e eVar2;
                zm.f fVar2;
                String str2;
                String id3;
                boolean z16;
                boolean z17;
                RecyclerView.e eVar3;
                zm.f fVar3;
                String str3;
                String id4;
                int i10 = r2;
                n this$0 = this.f743v;
                boolean z18 = true;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr2 = this$0.f747x;
                        try {
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            HashMap<String, Object> hashMap = this$0.f749z;
                            if (z14) {
                                if (strArr2.length == 3) {
                                    int length = strArr2.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length) {
                                            if (gv.n.B0(strArr2[i12])) {
                                                z15 = false;
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        cn.o oVar = this$0.f746w;
                                        if (oVar != null) {
                                            String str4 = strArr2[0];
                                            String str5 = strArr2[1];
                                            String str6 = strArr2[2];
                                            LibraryCollection libraryCollection = this$0.A;
                                            if (libraryCollection != null && (id3 = libraryCollection.getId()) != null) {
                                                str2 = id3;
                                                oVar.e(str4, str5, str6, str2, this$0.f748y);
                                            }
                                            str2 = "";
                                            oVar.e(str4, str5, str6, str2, this$0.f748y);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView != null) {
                                            eVar2 = recyclerView.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.f) {
                                            fVar2 = (zm.f) eVar2;
                                        } else {
                                            fVar2 = null;
                                        }
                                        if (fVar2 != null) {
                                            fVar2.x(strArr2[0]);
                                        }
                                        this$0.J(strArr2[0]);
                                    }
                                }
                                String str7 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                Set<String> keySet = hashMap.keySet();
                                kotlin.jvm.internal.i.f(keySet, "activityCompletionAnalyticsValues.keys");
                                for (String str8 : keySet) {
                                    Object obj2 = hashMap.get(str8);
                                    if (obj2 instanceof String) {
                                        bundle.putString(str8, (String) obj2);
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str8, ((Number) obj2).intValue());
                                    } else if (obj2 instanceof Boolean) {
                                        bundle.putBoolean(str8, ((Boolean) obj2).booleanValue());
                                    }
                                }
                                Intent intent2 = aVar.f977v;
                                if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                    z18 = false;
                                }
                                bundle.putBoolean("feedback_helpful", z18);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "lib_collect_activity_complete");
                            } else {
                                String str9 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                Set<String> keySet2 = hashMap.keySet();
                                kotlin.jvm.internal.i.f(keySet2, "activityCompletionAnalyticsValues.keys");
                                for (String str10 : keySet2) {
                                    Object obj3 = hashMap.get(str10);
                                    if (obj3 instanceof String) {
                                        bundle2.putString(str10, (String) obj3);
                                    } else if (obj3 instanceof Integer) {
                                        bundle2.putInt(str10, ((Number) obj3).intValue());
                                    } else if (obj3 instanceof Boolean) {
                                        bundle2.putBoolean(str10, ((Boolean) obj3).booleanValue());
                                    }
                                }
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "lib_collect_activity_incomplete");
                            }
                            hashMap.clear();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f744u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i13 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr3 = this$0.f747x;
                        try {
                            Intent intent3 = aVar2.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            HashMap<String, Object> hashMap2 = this$0.f749z;
                            if (z16) {
                                if (strArr3.length == 3) {
                                    int length2 = strArr3.length;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < length2) {
                                            if (gv.n.B0(strArr3[i14])) {
                                                z17 = false;
                                            } else {
                                                i14++;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                    }
                                    if (z17) {
                                        cn.o oVar2 = this$0.f746w;
                                        if (oVar2 != null) {
                                            String str11 = strArr3[0];
                                            String str12 = strArr3[1];
                                            String str13 = strArr3[2];
                                            LibraryCollection libraryCollection2 = this$0.A;
                                            if (libraryCollection2 != null && (id4 = libraryCollection2.getId()) != null) {
                                                str3 = id4;
                                                oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                            }
                                            str3 = "";
                                            oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                        }
                                        RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView2 != null) {
                                            eVar3 = recyclerView2.getAdapter();
                                        } else {
                                            eVar3 = null;
                                        }
                                        if (eVar3 instanceof zm.f) {
                                            fVar3 = (zm.f) eVar3;
                                        } else {
                                            fVar3 = null;
                                        }
                                        if (fVar3 != null) {
                                            fVar3.x(strArr3[0]);
                                        }
                                        this$0.J(strArr3[0]);
                                    }
                                }
                                String str14 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                Set<String> keySet3 = hashMap2.keySet();
                                kotlin.jvm.internal.i.f(keySet3, "activityCompletionAnalyticsValues.keys");
                                for (String str15 : keySet3) {
                                    Object obj4 = hashMap2.get(str15);
                                    if (obj4 instanceof String) {
                                        bundle3.putString(str15, (String) obj4);
                                    } else if (obj4 instanceof Integer) {
                                        bundle3.putInt(str15, ((Number) obj4).intValue());
                                    } else if (obj4 instanceof Boolean) {
                                        bundle3.putBoolean(str15, ((Boolean) obj4).booleanValue());
                                    }
                                }
                                Intent intent4 = aVar2.f977v;
                                if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                    z18 = false;
                                }
                                bundle3.putBoolean("feedback_helpful", z18);
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_collect_activity_complete");
                            } else {
                                String str16 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                Set<String> keySet4 = hashMap2.keySet();
                                kotlin.jvm.internal.i.f(keySet4, "activityCompletionAnalyticsValues.keys");
                                for (String str17 : keySet4) {
                                    Object obj5 = hashMap2.get(str17);
                                    if (obj5 instanceof String) {
                                        bundle4.putString(str17, (String) obj5);
                                    } else if (obj5 instanceof Integer) {
                                        bundle4.putInt(str17, ((Number) obj5).intValue());
                                    } else if (obj5 instanceof Boolean) {
                                        bundle4.putBoolean(str17, ((Boolean) obj5).booleanValue());
                                    }
                                }
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle4, "lib_collect_activity_incomplete");
                            }
                            hashMap2.clear();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f744u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i15 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr4 = this$0.f747x;
                        try {
                            Intent intent5 = aVar3.f977v;
                            if (intent5 != null && intent5.getBooleanExtra("wasActivityPlayed", false)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            HashMap<String, Object> hashMap3 = this$0.f749z;
                            Intent intent6 = aVar3.f977v;
                            if (z12) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < length3) {
                                            if (gv.n.B0(strArr4[i16])) {
                                                z13 = false;
                                            } else {
                                                i16++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        cn.o oVar3 = this$0.f746w;
                                        if (oVar3 != null) {
                                            String str18 = strArr4[0];
                                            String str19 = strArr4[1];
                                            String str20 = strArr4[2];
                                            LibraryCollection libraryCollection3 = this$0.A;
                                            if (libraryCollection3 != null && (id2 = libraryCollection3.getId()) != null) {
                                                str = id2;
                                                oVar3.e(str18, str19, str20, str, this$0.f748y);
                                            }
                                            str = "";
                                            oVar3.e(str18, str19, str20, str, this$0.f748y);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView3 != null) {
                                            eVar = recyclerView3.getAdapter();
                                        } else {
                                            eVar = null;
                                        }
                                        if (eVar instanceof zm.f) {
                                            fVar = (zm.f) eVar;
                                        } else {
                                            fVar = null;
                                        }
                                        if (fVar != null) {
                                            fVar.x(strArr4[0]);
                                        }
                                        this$0.J(strArr4[0]);
                                    }
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle5 = new Bundle();
                                Set<String> keySet5 = hashMap3.keySet();
                                kotlin.jvm.internal.i.f(keySet5, "activityCompletionAnalyticsValues.keys");
                                for (String str22 : keySet5) {
                                    Object obj6 = hashMap3.get(str22);
                                    if (obj6 instanceof String) {
                                        bundle5.putString(str22, (String) obj6);
                                    } else if (obj6 instanceof Integer) {
                                        bundle5.putInt(str22, ((Number) obj6).intValue());
                                    } else if (obj6 instanceof Boolean) {
                                        bundle5.putBoolean(str22, ((Boolean) obj6).booleanValue());
                                    }
                                }
                                if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                    z18 = false;
                                }
                                bundle5.putBoolean("ra_goal_added", z18);
                                hs.k kVar5 = hs.k.f19476a;
                                gk.a.b(bundle5, "lib_collect_activity_complete");
                            } else {
                                String str23 = gk.a.f16573a;
                                Bundle bundle6 = new Bundle();
                                Set<String> keySet6 = hashMap3.keySet();
                                kotlin.jvm.internal.i.f(keySet6, "activityCompletionAnalyticsValues.keys");
                                for (String str24 : keySet6) {
                                    Object obj7 = hashMap3.get(str24);
                                    if (obj7 instanceof String) {
                                        bundle6.putString(str24, (String) obj7);
                                    } else if (obj7 instanceof Integer) {
                                        bundle6.putInt(str24, ((Number) obj7).intValue());
                                    } else if (obj7 instanceof Boolean) {
                                        bundle6.putBoolean(str24, ((Boolean) obj7).booleanValue());
                                    }
                                }
                                if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                    z18 = false;
                                }
                                bundle6.putBoolean("ra_goal_added", z18);
                                hs.k kVar6 = hs.k.f19476a;
                                gk.a.b(bundle6, "lib_collect_activity_incomplete");
                            }
                            hashMap3.clear();
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f744u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult4, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.E = registerForActivityResult4;
        androidx.activity.result.c<Intent> registerForActivityResult22 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ n f743v;

            {
                this.f743v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z12;
                boolean z13;
                RecyclerView.e eVar;
                zm.f fVar;
                String str;
                String id2;
                boolean z14;
                boolean z15;
                RecyclerView.e eVar2;
                zm.f fVar2;
                String str2;
                String id3;
                boolean z16;
                boolean z17;
                RecyclerView.e eVar3;
                zm.f fVar3;
                String str3;
                String id4;
                int i10 = r2;
                n this$0 = this.f743v;
                boolean z18 = true;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr2 = this$0.f747x;
                        try {
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            HashMap<String, Object> hashMap = this$0.f749z;
                            if (z14) {
                                if (strArr2.length == 3) {
                                    int length = strArr2.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length) {
                                            if (gv.n.B0(strArr2[i12])) {
                                                z15 = false;
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        cn.o oVar = this$0.f746w;
                                        if (oVar != null) {
                                            String str4 = strArr2[0];
                                            String str5 = strArr2[1];
                                            String str6 = strArr2[2];
                                            LibraryCollection libraryCollection = this$0.A;
                                            if (libraryCollection != null && (id3 = libraryCollection.getId()) != null) {
                                                str2 = id3;
                                                oVar.e(str4, str5, str6, str2, this$0.f748y);
                                            }
                                            str2 = "";
                                            oVar.e(str4, str5, str6, str2, this$0.f748y);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView != null) {
                                            eVar2 = recyclerView.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.f) {
                                            fVar2 = (zm.f) eVar2;
                                        } else {
                                            fVar2 = null;
                                        }
                                        if (fVar2 != null) {
                                            fVar2.x(strArr2[0]);
                                        }
                                        this$0.J(strArr2[0]);
                                    }
                                }
                                String str7 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                Set<String> keySet = hashMap.keySet();
                                kotlin.jvm.internal.i.f(keySet, "activityCompletionAnalyticsValues.keys");
                                for (String str8 : keySet) {
                                    Object obj2 = hashMap.get(str8);
                                    if (obj2 instanceof String) {
                                        bundle.putString(str8, (String) obj2);
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str8, ((Number) obj2).intValue());
                                    } else if (obj2 instanceof Boolean) {
                                        bundle.putBoolean(str8, ((Boolean) obj2).booleanValue());
                                    }
                                }
                                Intent intent2 = aVar.f977v;
                                if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                    z18 = false;
                                }
                                bundle.putBoolean("feedback_helpful", z18);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "lib_collect_activity_complete");
                            } else {
                                String str9 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                Set<String> keySet2 = hashMap.keySet();
                                kotlin.jvm.internal.i.f(keySet2, "activityCompletionAnalyticsValues.keys");
                                for (String str10 : keySet2) {
                                    Object obj3 = hashMap.get(str10);
                                    if (obj3 instanceof String) {
                                        bundle2.putString(str10, (String) obj3);
                                    } else if (obj3 instanceof Integer) {
                                        bundle2.putInt(str10, ((Number) obj3).intValue());
                                    } else if (obj3 instanceof Boolean) {
                                        bundle2.putBoolean(str10, ((Boolean) obj3).booleanValue());
                                    }
                                }
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "lib_collect_activity_incomplete");
                            }
                            hashMap.clear();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f744u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i13 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr3 = this$0.f747x;
                        try {
                            Intent intent3 = aVar2.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            HashMap<String, Object> hashMap2 = this$0.f749z;
                            if (z16) {
                                if (strArr3.length == 3) {
                                    int length2 = strArr3.length;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < length2) {
                                            if (gv.n.B0(strArr3[i14])) {
                                                z17 = false;
                                            } else {
                                                i14++;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                    }
                                    if (z17) {
                                        cn.o oVar2 = this$0.f746w;
                                        if (oVar2 != null) {
                                            String str11 = strArr3[0];
                                            String str12 = strArr3[1];
                                            String str13 = strArr3[2];
                                            LibraryCollection libraryCollection2 = this$0.A;
                                            if (libraryCollection2 != null && (id4 = libraryCollection2.getId()) != null) {
                                                str3 = id4;
                                                oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                            }
                                            str3 = "";
                                            oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                        }
                                        RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView2 != null) {
                                            eVar3 = recyclerView2.getAdapter();
                                        } else {
                                            eVar3 = null;
                                        }
                                        if (eVar3 instanceof zm.f) {
                                            fVar3 = (zm.f) eVar3;
                                        } else {
                                            fVar3 = null;
                                        }
                                        if (fVar3 != null) {
                                            fVar3.x(strArr3[0]);
                                        }
                                        this$0.J(strArr3[0]);
                                    }
                                }
                                String str14 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                Set<String> keySet3 = hashMap2.keySet();
                                kotlin.jvm.internal.i.f(keySet3, "activityCompletionAnalyticsValues.keys");
                                for (String str15 : keySet3) {
                                    Object obj4 = hashMap2.get(str15);
                                    if (obj4 instanceof String) {
                                        bundle3.putString(str15, (String) obj4);
                                    } else if (obj4 instanceof Integer) {
                                        bundle3.putInt(str15, ((Number) obj4).intValue());
                                    } else if (obj4 instanceof Boolean) {
                                        bundle3.putBoolean(str15, ((Boolean) obj4).booleanValue());
                                    }
                                }
                                Intent intent4 = aVar2.f977v;
                                if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                    z18 = false;
                                }
                                bundle3.putBoolean("feedback_helpful", z18);
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_collect_activity_complete");
                            } else {
                                String str16 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                Set<String> keySet4 = hashMap2.keySet();
                                kotlin.jvm.internal.i.f(keySet4, "activityCompletionAnalyticsValues.keys");
                                for (String str17 : keySet4) {
                                    Object obj5 = hashMap2.get(str17);
                                    if (obj5 instanceof String) {
                                        bundle4.putString(str17, (String) obj5);
                                    } else if (obj5 instanceof Integer) {
                                        bundle4.putInt(str17, ((Number) obj5).intValue());
                                    } else if (obj5 instanceof Boolean) {
                                        bundle4.putBoolean(str17, ((Boolean) obj5).booleanValue());
                                    }
                                }
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle4, "lib_collect_activity_incomplete");
                            }
                            hashMap2.clear();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f744u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i15 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr4 = this$0.f747x;
                        try {
                            Intent intent5 = aVar3.f977v;
                            if (intent5 != null && intent5.getBooleanExtra("wasActivityPlayed", false)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            HashMap<String, Object> hashMap3 = this$0.f749z;
                            Intent intent6 = aVar3.f977v;
                            if (z12) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < length3) {
                                            if (gv.n.B0(strArr4[i16])) {
                                                z13 = false;
                                            } else {
                                                i16++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        cn.o oVar3 = this$0.f746w;
                                        if (oVar3 != null) {
                                            String str18 = strArr4[0];
                                            String str19 = strArr4[1];
                                            String str20 = strArr4[2];
                                            LibraryCollection libraryCollection3 = this$0.A;
                                            if (libraryCollection3 != null && (id2 = libraryCollection3.getId()) != null) {
                                                str = id2;
                                                oVar3.e(str18, str19, str20, str, this$0.f748y);
                                            }
                                            str = "";
                                            oVar3.e(str18, str19, str20, str, this$0.f748y);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView3 != null) {
                                            eVar = recyclerView3.getAdapter();
                                        } else {
                                            eVar = null;
                                        }
                                        if (eVar instanceof zm.f) {
                                            fVar = (zm.f) eVar;
                                        } else {
                                            fVar = null;
                                        }
                                        if (fVar != null) {
                                            fVar.x(strArr4[0]);
                                        }
                                        this$0.J(strArr4[0]);
                                    }
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle5 = new Bundle();
                                Set<String> keySet5 = hashMap3.keySet();
                                kotlin.jvm.internal.i.f(keySet5, "activityCompletionAnalyticsValues.keys");
                                for (String str22 : keySet5) {
                                    Object obj6 = hashMap3.get(str22);
                                    if (obj6 instanceof String) {
                                        bundle5.putString(str22, (String) obj6);
                                    } else if (obj6 instanceof Integer) {
                                        bundle5.putInt(str22, ((Number) obj6).intValue());
                                    } else if (obj6 instanceof Boolean) {
                                        bundle5.putBoolean(str22, ((Boolean) obj6).booleanValue());
                                    }
                                }
                                if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                    z18 = false;
                                }
                                bundle5.putBoolean("ra_goal_added", z18);
                                hs.k kVar5 = hs.k.f19476a;
                                gk.a.b(bundle5, "lib_collect_activity_complete");
                            } else {
                                String str23 = gk.a.f16573a;
                                Bundle bundle6 = new Bundle();
                                Set<String> keySet6 = hashMap3.keySet();
                                kotlin.jvm.internal.i.f(keySet6, "activityCompletionAnalyticsValues.keys");
                                for (String str24 : keySet6) {
                                    Object obj7 = hashMap3.get(str24);
                                    if (obj7 instanceof String) {
                                        bundle6.putString(str24, (String) obj7);
                                    } else if (obj7 instanceof Integer) {
                                        bundle6.putInt(str24, ((Number) obj7).intValue());
                                    } else if (obj7 instanceof Boolean) {
                                        bundle6.putBoolean(str24, ((Boolean) obj7).booleanValue());
                                    }
                                }
                                if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                    z18 = false;
                                }
                                bundle6.putBoolean("ra_goal_added", z18);
                                hs.k kVar6 = hs.k.f19476a;
                                gk.a.b(bundle6, "lib_collect_activity_incomplete");
                            }
                            hashMap3.clear();
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f744u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult22, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.F = registerForActivityResult22;
        androidx.activity.result.c<Intent> registerForActivityResult32 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ n f743v;

            {
                this.f743v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z12;
                boolean z13;
                RecyclerView.e eVar;
                zm.f fVar;
                String str;
                String id2;
                boolean z14;
                boolean z15;
                RecyclerView.e eVar2;
                zm.f fVar2;
                String str2;
                String id3;
                boolean z16;
                boolean z17;
                RecyclerView.e eVar3;
                zm.f fVar3;
                String str3;
                String id4;
                int i10 = r2;
                n this$0 = this.f743v;
                boolean z18 = true;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr2 = this$0.f747x;
                        try {
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            HashMap<String, Object> hashMap = this$0.f749z;
                            if (z14) {
                                if (strArr2.length == 3) {
                                    int length = strArr2.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length) {
                                            if (gv.n.B0(strArr2[i12])) {
                                                z15 = false;
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        cn.o oVar = this$0.f746w;
                                        if (oVar != null) {
                                            String str4 = strArr2[0];
                                            String str5 = strArr2[1];
                                            String str6 = strArr2[2];
                                            LibraryCollection libraryCollection = this$0.A;
                                            if (libraryCollection != null && (id3 = libraryCollection.getId()) != null) {
                                                str2 = id3;
                                                oVar.e(str4, str5, str6, str2, this$0.f748y);
                                            }
                                            str2 = "";
                                            oVar.e(str4, str5, str6, str2, this$0.f748y);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView != null) {
                                            eVar2 = recyclerView.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.f) {
                                            fVar2 = (zm.f) eVar2;
                                        } else {
                                            fVar2 = null;
                                        }
                                        if (fVar2 != null) {
                                            fVar2.x(strArr2[0]);
                                        }
                                        this$0.J(strArr2[0]);
                                    }
                                }
                                String str7 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                Set<String> keySet = hashMap.keySet();
                                kotlin.jvm.internal.i.f(keySet, "activityCompletionAnalyticsValues.keys");
                                for (String str8 : keySet) {
                                    Object obj2 = hashMap.get(str8);
                                    if (obj2 instanceof String) {
                                        bundle.putString(str8, (String) obj2);
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str8, ((Number) obj2).intValue());
                                    } else if (obj2 instanceof Boolean) {
                                        bundle.putBoolean(str8, ((Boolean) obj2).booleanValue());
                                    }
                                }
                                Intent intent2 = aVar.f977v;
                                if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                    z18 = false;
                                }
                                bundle.putBoolean("feedback_helpful", z18);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "lib_collect_activity_complete");
                            } else {
                                String str9 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                Set<String> keySet2 = hashMap.keySet();
                                kotlin.jvm.internal.i.f(keySet2, "activityCompletionAnalyticsValues.keys");
                                for (String str10 : keySet2) {
                                    Object obj3 = hashMap.get(str10);
                                    if (obj3 instanceof String) {
                                        bundle2.putString(str10, (String) obj3);
                                    } else if (obj3 instanceof Integer) {
                                        bundle2.putInt(str10, ((Number) obj3).intValue());
                                    } else if (obj3 instanceof Boolean) {
                                        bundle2.putBoolean(str10, ((Boolean) obj3).booleanValue());
                                    }
                                }
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "lib_collect_activity_incomplete");
                            }
                            hashMap.clear();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f744u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i13 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr3 = this$0.f747x;
                        try {
                            Intent intent3 = aVar2.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            HashMap<String, Object> hashMap2 = this$0.f749z;
                            if (z16) {
                                if (strArr3.length == 3) {
                                    int length2 = strArr3.length;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < length2) {
                                            if (gv.n.B0(strArr3[i14])) {
                                                z17 = false;
                                            } else {
                                                i14++;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                    }
                                    if (z17) {
                                        cn.o oVar2 = this$0.f746w;
                                        if (oVar2 != null) {
                                            String str11 = strArr3[0];
                                            String str12 = strArr3[1];
                                            String str13 = strArr3[2];
                                            LibraryCollection libraryCollection2 = this$0.A;
                                            if (libraryCollection2 != null && (id4 = libraryCollection2.getId()) != null) {
                                                str3 = id4;
                                                oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                            }
                                            str3 = "";
                                            oVar2.e(str11, str12, str13, str3, this$0.f748y);
                                        }
                                        RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView2 != null) {
                                            eVar3 = recyclerView2.getAdapter();
                                        } else {
                                            eVar3 = null;
                                        }
                                        if (eVar3 instanceof zm.f) {
                                            fVar3 = (zm.f) eVar3;
                                        } else {
                                            fVar3 = null;
                                        }
                                        if (fVar3 != null) {
                                            fVar3.x(strArr3[0]);
                                        }
                                        this$0.J(strArr3[0]);
                                    }
                                }
                                String str14 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                Set<String> keySet3 = hashMap2.keySet();
                                kotlin.jvm.internal.i.f(keySet3, "activityCompletionAnalyticsValues.keys");
                                for (String str15 : keySet3) {
                                    Object obj4 = hashMap2.get(str15);
                                    if (obj4 instanceof String) {
                                        bundle3.putString(str15, (String) obj4);
                                    } else if (obj4 instanceof Integer) {
                                        bundle3.putInt(str15, ((Number) obj4).intValue());
                                    } else if (obj4 instanceof Boolean) {
                                        bundle3.putBoolean(str15, ((Boolean) obj4).booleanValue());
                                    }
                                }
                                Intent intent4 = aVar2.f977v;
                                if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                    z18 = false;
                                }
                                bundle3.putBoolean("feedback_helpful", z18);
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_collect_activity_complete");
                            } else {
                                String str16 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                Set<String> keySet4 = hashMap2.keySet();
                                kotlin.jvm.internal.i.f(keySet4, "activityCompletionAnalyticsValues.keys");
                                for (String str17 : keySet4) {
                                    Object obj5 = hashMap2.get(str17);
                                    if (obj5 instanceof String) {
                                        bundle4.putString(str17, (String) obj5);
                                    } else if (obj5 instanceof Integer) {
                                        bundle4.putInt(str17, ((Number) obj5).intValue());
                                    } else if (obj5 instanceof Boolean) {
                                        bundle4.putBoolean(str17, ((Boolean) obj5).booleanValue());
                                    }
                                }
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle4, "lib_collect_activity_incomplete");
                            }
                            hashMap2.clear();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f744u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i15 = n.I;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String[] strArr4 = this$0.f747x;
                        try {
                            Intent intent5 = aVar3.f977v;
                            if (intent5 != null && intent5.getBooleanExtra("wasActivityPlayed", false)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            HashMap<String, Object> hashMap3 = this$0.f749z;
                            Intent intent6 = aVar3.f977v;
                            if (z12) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < length3) {
                                            if (gv.n.B0(strArr4[i16])) {
                                                z13 = false;
                                            } else {
                                                i16++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        cn.o oVar3 = this$0.f746w;
                                        if (oVar3 != null) {
                                            String str18 = strArr4[0];
                                            String str19 = strArr4[1];
                                            String str20 = strArr4[2];
                                            LibraryCollection libraryCollection3 = this$0.A;
                                            if (libraryCollection3 != null && (id2 = libraryCollection3.getId()) != null) {
                                                str = id2;
                                                oVar3.e(str18, str19, str20, str, this$0.f748y);
                                            }
                                            str = "";
                                            oVar3.e(str18, str19, str20, str, this$0.f748y);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                                        if (recyclerView3 != null) {
                                            eVar = recyclerView3.getAdapter();
                                        } else {
                                            eVar = null;
                                        }
                                        if (eVar instanceof zm.f) {
                                            fVar = (zm.f) eVar;
                                        } else {
                                            fVar = null;
                                        }
                                        if (fVar != null) {
                                            fVar.x(strArr4[0]);
                                        }
                                        this$0.J(strArr4[0]);
                                    }
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle5 = new Bundle();
                                Set<String> keySet5 = hashMap3.keySet();
                                kotlin.jvm.internal.i.f(keySet5, "activityCompletionAnalyticsValues.keys");
                                for (String str22 : keySet5) {
                                    Object obj6 = hashMap3.get(str22);
                                    if (obj6 instanceof String) {
                                        bundle5.putString(str22, (String) obj6);
                                    } else if (obj6 instanceof Integer) {
                                        bundle5.putInt(str22, ((Number) obj6).intValue());
                                    } else if (obj6 instanceof Boolean) {
                                        bundle5.putBoolean(str22, ((Boolean) obj6).booleanValue());
                                    }
                                }
                                if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                    z18 = false;
                                }
                                bundle5.putBoolean("ra_goal_added", z18);
                                hs.k kVar5 = hs.k.f19476a;
                                gk.a.b(bundle5, "lib_collect_activity_complete");
                            } else {
                                String str23 = gk.a.f16573a;
                                Bundle bundle6 = new Bundle();
                                Set<String> keySet6 = hashMap3.keySet();
                                kotlin.jvm.internal.i.f(keySet6, "activityCompletionAnalyticsValues.keys");
                                for (String str24 : keySet6) {
                                    Object obj7 = hashMap3.get(str24);
                                    if (obj7 instanceof String) {
                                        bundle6.putString(str24, (String) obj7);
                                    } else if (obj7 instanceof Integer) {
                                        bundle6.putInt(str24, ((Number) obj7).intValue());
                                    } else if (obj7 instanceof Boolean) {
                                        bundle6.putBoolean(str24, ((Boolean) obj7).booleanValue());
                                    }
                                }
                                if (intent6 == null || !intent6.getBooleanExtra("wasGoalAddedInCurrentSession", false)) {
                                    z18 = false;
                                }
                                bundle6.putBoolean("ra_goal_added", z18);
                                hs.k kVar6 = hs.k.f19476a;
                                gk.a.b(bundle6, "lib_collect_activity_incomplete");
                            }
                            hashMap3.clear();
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f744u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult32, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.G = registerForActivityResult32;
    }

    @Override // rr.b
    public final boolean I() {
        String str;
        ArrayList<String> strings;
        try {
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            LibraryCollection libraryCollection = this.A;
            if (libraryCollection != null && (strings = libraryCollection.getStrings()) != null) {
                str = strings.get(0);
            } else {
                str = null;
            }
            bundle.putString("collection_name", str);
            Bundle arguments = getArguments();
            int i6 = -1;
            if (arguments != null) {
                i6 = arguments.getInt("collection_pos", -1);
            }
            bundle.putInt("collection_position_in_list", i6);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "lib_collect_inside_back_click");
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f744u, e10);
            return true;
        }
    }

    public final void J(String str) {
        LibraryActivity libraryActivity;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
        try {
            androidx.fragment.app.p requireActivity = requireActivity();
            if (requireActivity instanceof LibraryActivity) {
                libraryActivity = (LibraryActivity) requireActivity;
            } else {
                libraryActivity = null;
            }
            if (libraryActivity == null || (libraryCollectionItemAccessModel = libraryActivity.f11294y.get(str)) == null) {
                return;
            }
            HashMap<String, LibraryCollectionItemAccessModel> hashMap = libraryActivity.f11294y;
            libraryCollectionItemAccessModel.setCompleted(true);
            hashMap.put(str, libraryCollectionItemAccessModel);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f744u, e10);
        }
    }

    public final void K(LibraryCollection libraryCollection) {
        AppCompatImageView appCompatImageView;
        String[] strArr;
        String str = this.f744u;
        try {
            String str2 = libraryCollection.getAssets().get("bg_asset");
            if (str2 != null) {
                Glide.g(requireContext()).p(str2).B((AppCompatImageView) _$_findCachedViewById(R.id.tvAcImage));
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvAcHeaderText);
            String str3 = "";
            if (robertoTextView != null) {
                String str4 = (String) is.u.j2(0, libraryCollection.getStrings());
                if (str4 == null) {
                    str4 = "";
                }
                robertoTextView.setText(str4);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvAcSubHeaderText);
            if (robertoTextView2 != null) {
                String str5 = (String) is.u.j2(1, libraryCollection.getStrings());
                if (str5 == null) {
                    str5 = "";
                }
                robertoTextView2.setText(str5);
            }
            String str6 = (String) is.u.j2(8, libraryCollection.getStrings());
            if (str6 != null && (strArr = (String[]) gv.r.a1(str6, new String[]{","}, 0, 6).toArray(new String[0])) != null) {
                for (String str7 : strArr) {
                    String obj = gv.r.i1(str7).toString();
                    String str8 = libraryCollection.getAssets().get("text_color");
                    String str9 = libraryCollection.getAssets().get("text_color_bg");
                    try {
                        int i6 = bn.a.f4534a;
                        ChipGroup cgAcFilters = (ChipGroup) _$_findCachedViewById(R.id.cgAcFilters);
                        kotlin.jvm.internal.i.f(cgAcFilters, "cgAcFilters");
                        ((ChipGroup) _$_findCachedViewById(R.id.cgAcFilters)).addView(bn.a.a(obj, cgAcFilters, str8, str9));
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, e10);
                    }
                }
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvExpandCollapseCta);
            if (robertoTextView3 != null) {
                String str10 = (String) is.u.j2(5, libraryCollection.getStrings());
                if (str10 == null) {
                    str10 = "";
                }
                robertoTextView3.setText(str10);
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvCollectionContentText);
            if (robertoTextView4 != null) {
                String str11 = (String) is.u.j2(7, libraryCollection.getStrings());
                if (str11 == null) {
                    str11 = "";
                }
                robertoTextView4.setText(str11);
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvAcDescriptionText);
            if (robertoTextView5 != null) {
                String str12 = (String) is.u.j2(4, libraryCollection.getStrings());
                if (str12 != null) {
                    str3 = str12;
                }
                robertoTextView5.setText(r0.b.a(str3, 0));
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewExpandCollapseCta);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(new w0(this, 19, libraryCollection));
            }
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvRowAcImageContainerLoader);
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.c();
            }
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvRowAcImageContainerLoader);
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvAcHeaderTextLoader);
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.c();
            }
            ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvAcHeaderTextLoader);
            if (shimmerFrameLayout4 != null) {
                shimmerFrameLayout4.setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvAcSubHeaderTextLoader);
            if (shimmerFrameLayout5 != null) {
                shimmerFrameLayout5.c();
            }
            ShimmerFrameLayout shimmerFrameLayout6 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvAcSubHeaderTextLoader);
            if (shimmerFrameLayout6 != null) {
                shimmerFrameLayout6.setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout7 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvCollectionContentTextLoader);
            if (shimmerFrameLayout7 != null) {
                shimmerFrameLayout7.c();
            }
            ShimmerFrameLayout shimmerFrameLayout8 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvCollectionContentTextLoader);
            if (shimmerFrameLayout8 != null) {
                shimmerFrameLayout8.setVisibility(8);
            }
            String str13 = libraryCollection.getAssets().get("text_color");
            if (str13 != null && (appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivCollectionContentIcon)) != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(Color.parseColor(str13)));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivAcBack);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new ol.k(24, this));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
        ((java.util.ArrayList) ((hs.f) r4).f19465v).add(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(LibraryCollection libraryCollection, HashMap<String, LibraryCollectionItemAccessModel> hashMap) {
        RecyclerView recyclerView;
        try {
            ArrayList<LibraryCollectionItem> itemList = libraryCollection.getItemList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : itemList) {
                if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) obj).getItemType(), "main_activity")) {
                    arrayList.add(obj);
                }
            }
            List<LibraryCollectionItem> D2 = is.u.D2(arrayList, new c());
            ArrayList arrayList2 = new ArrayList(is.i.H1(D2, 10));
            for (LibraryCollectionItem libraryCollectionItem : D2) {
                arrayList2.add(new hs.f(libraryCollectionItem, new ArrayList()));
            }
            ArrayList<LibraryCollectionItem> itemList2 = libraryCollection.getItemList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : itemList2) {
                if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) obj2).getItemType(), "filler_activity")) {
                    arrayList3.add(obj2);
                }
            }
            for (LibraryCollectionItem libraryCollectionItem2 : is.u.D2(arrayList3, new d())) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) ((hs.f) next).f19464u).getId(), libraryCollectionItem2.getParentItem())) {
                        break;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(new zm.f(arrayList2, hashMap, this.D, (String) is.u.j2(9, libraryCollection.getStrings()), libraryCollection.getAssets().get("text_color"), libraryCollection.getAssets().get("text_color_bg"), new e(libraryCollection), new f(libraryCollection)));
            }
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvCollectionContentRecyclerHeaderLoader);
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.c();
            }
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvCollectionContentRecyclerHeaderLoader);
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvCollectionContentRecyclerSubHeaderLoader);
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.c();
            }
            ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.tvCollectionContentRecyclerSubHeaderLoader);
            if (shimmerFrameLayout4 != null) {
                shimmerFrameLayout4.setVisibility(8);
            }
            String str = this.B;
            if (str != null) {
                if (gv.n.B0(str)) {
                    str = null;
                }
                if (str != null && (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvCollectionActivitiesRecycler)) != null) {
                    recyclerView.post(new ne.u(this, 29, str));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f744u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.H;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_library_collection_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.H.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Serializable serializable;
        LibraryCollection libraryCollection;
        LibraryActivity libraryActivity;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            hs.k kVar = null;
            HashMap<String, LibraryCollectionItemAccessModel> hashMap = null;
            if (arguments != null) {
                str = arguments.getString("scroll_and_highlight_id", "");
            } else {
                str = null;
            }
            this.B = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("collection");
            } else {
                serializable = null;
            }
            if (serializable instanceof LibraryCollection) {
                libraryCollection = (LibraryCollection) serializable;
            } else {
                libraryCollection = null;
            }
            if (libraryCollection != null) {
                this.A = libraryCollection;
                K(libraryCollection);
                androidx.fragment.app.p requireActivity = requireActivity();
                if (requireActivity instanceof LibraryActivity) {
                    libraryActivity = (LibraryActivity) requireActivity;
                } else {
                    libraryActivity = null;
                }
                if (libraryActivity != null) {
                    hashMap = libraryActivity.f11294y;
                }
                M(libraryCollection, hashMap);
                l0 a10 = new o0(this, new jl.b0(new e1(), 5)).a(cn.o.class);
                cn.o oVar = (cn.o) a10;
                oVar.f5661z.e(getViewLifecycleOwner(), new qm.c(22, new a()));
                oVar.A.e(getViewLifecycleOwner(), new qm.c(23, new b()));
                this.f746w = (cn.o) a10;
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                Toast.makeText(requireActivity(), getString(R.string.telecommunicationsError), 0).show();
                requireActivity().onBackPressed();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f744u, e10);
        }
    }
}
