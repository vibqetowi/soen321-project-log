package an;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import t0.d0;
import t0.o0;
/* compiled from: LibraryAllTopPicksFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan/j;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends rr.b {
    public static final /* synthetic */ int G = 0;
    public cn.i A;
    public String[] B;
    public final androidx.activity.result.c<Intent> C;
    public final androidx.activity.result.c<Intent> D;
    public final androidx.activity.result.c<Intent> E;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f729u = LogHelper.INSTANCE.makeLogTag("AllTopPicksFragment");

    /* renamed from: v  reason: collision with root package name */
    public String f730v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f731w = "";

    /* renamed from: x  reason: collision with root package name */
    public Chip f732x;

    /* renamed from: y  reason: collision with root package name */
    public final String[] f733y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f734z;

    /* compiled from: LibraryAllTopPicksFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<LibraryCollection, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ cn.i f735u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ j f736v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, cn.i iVar) {
            super(1);
            this.f735u = iVar;
            this.f736v = jVar;
        }

        @Override // ss.l
        public final hs.k invoke(LibraryCollection libraryCollection) {
            String j02;
            LibraryCollection libraryCollection2 = libraryCollection;
            ArrayList<LibraryCollectionItem> itemList = libraryCollection2.getItemList();
            ArrayList arrayList = new ArrayList(is.i.H1(itemList, 10));
            for (LibraryCollectionItem libraryCollectionItem : itemList) {
                arrayList.add(libraryCollectionItem.getId());
            }
            cn.i iVar = this.f735u;
            iVar.getClass();
            try {
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    ta.v.H(kc.f.H(iVar), null, 0, new cn.e(iVar, arrayList, j02, null), 3);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(iVar.f5567y, e10);
            }
            String id2 = libraryCollection2.getId();
            if (id2 == null) {
                id2 = "";
            }
            this.f736v.f731w = id2;
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryAllTopPicksFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends RecommendedActivityModel>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent) {
            RecommendedActivityModel contentIfNotHandled;
            SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                j jVar = j.this;
                jVar.E.a(new Intent(jVar.requireActivity(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", contentIfNotHandled).putExtra("source", "library"));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryAllTopPicksFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends LearningHubModel>, hs.k> {
        public c() {
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
                j jVar = j.this;
                jVar.startActivity(new Intent(jVar.requireActivity(), LearningHubArticleExperimentActivity.class).putExtra("model", contentIfNotHandled));
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

    /* compiled from: LibraryAllTopPicksFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<HashMap<String, hs.f<? extends Boolean, ? extends Boolean>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ cn.i f740v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(cn.i iVar) {
            super(1);
            this.f740v = iVar;
        }

        @Override // ss.l
        public final hs.k invoke(HashMap<String, hs.f<? extends Boolean, ? extends Boolean>> hashMap) {
            ArrayList<LibraryCollectionItem> arrayList;
            LibraryActivity libraryActivity;
            HashMap<String, hs.f<? extends Boolean, ? extends Boolean>> it = hashMap;
            LibraryCollection d10 = this.f740v.f5568z.d();
            HashMap<String, String> hashMap2 = null;
            if (d10 != null) {
                arrayList = d10.getItemList();
            } else {
                arrayList = null;
            }
            kotlin.jvm.internal.i.f(it, "it");
            j jVar = j.this;
            String str = jVar.f729u;
            if (arrayList != null) {
                try {
                    if (arrayList.size() > 1) {
                        is.p.P1(arrayList, new k());
                    }
                    RecyclerView recyclerView = (RecyclerView) jVar._$_findCachedViewById(R.id.rvTpItemsRecycler);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(jVar.requireContext(), 1, false));
                    }
                    RecyclerView recyclerView2 = (RecyclerView) jVar._$_findCachedViewById(R.id.rvTpItemsRecycler);
                    if (recyclerView2 != null) {
                        androidx.fragment.app.p requireActivity = jVar.requireActivity();
                        if (requireActivity instanceof LibraryActivity) {
                            libraryActivity = (LibraryActivity) requireActivity;
                        } else {
                            libraryActivity = null;
                        }
                        if (libraryActivity != null) {
                            hashMap2 = libraryActivity.f11295z;
                        }
                        recyclerView2.setAdapter(new zm.c(arrayList, it, hashMap2, false, new l(jVar)));
                    }
                    ChipGroup chipGroup = (ChipGroup) jVar._$_findCachedViewById(R.id.cgTpFilters);
                    if (chipGroup != null) {
                        chipGroup.removeAllViews();
                    }
                    HashSet hashSet = new HashSet();
                    try {
                        for (LibraryCollectionItem libraryCollectionItem : arrayList) {
                            hashSet.addAll(libraryCollectionItem.getChips());
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, e10);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        Locale ENGLISH = Locale.ENGLISH;
                        kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                        String upperCase = str2.toUpperCase(ENGLISH);
                        kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                        String lowerCase = str2.toLowerCase(ENGLISH);
                        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        jVar.J(upperCase, kotlin.jvm.internal.i.b(lowerCase, "all"));
                    }
                    try {
                        ChipGroup chipGroup2 = (ChipGroup) jVar._$_findCachedViewById(R.id.cgTpFilters);
                        if (chipGroup2 != null) {
                            chipGroup2.setOnCheckedStateChangeListener(new fq.s(jVar, 1));
                        }
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(str, e11);
                    }
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) jVar._$_findCachedViewById(R.id.shimmerTpHeader);
                    if (shimmerFrameLayout != null) {
                        shimmerFrameLayout.c();
                    }
                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) jVar._$_findCachedViewById(R.id.shimmerTpSubHeader);
                    if (shimmerFrameLayout2 != null) {
                        shimmerFrameLayout2.c();
                    }
                    ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) jVar._$_findCachedViewById(R.id.shimmerTpCta);
                    if (shimmerFrameLayout3 != null) {
                        shimmerFrameLayout3.c();
                    }
                    CardView cardView = (CardView) jVar._$_findCachedViewById(R.id.cvTpLoader);
                    if (cardView != null) {
                        cardView.setVisibility(8);
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(str, e12);
                }
            }
            return hs.k.f19476a;
        }
    }

    public j() {
        String[] strArr = new String[3];
        for (int i6 = 0; i6 < 3; i6++) {
            strArr[i6] = "";
        }
        this.f733y = strArr;
        String[] strArr2 = new String[3];
        for (int i10 = 0; i10 < 3; i10++) {
            strArr2[i10] = "";
        }
        this.B = strArr2;
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.i

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ j f728v;

            {
                this.f728v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i11 = r2;
                zm.c cVar = null;
                j this$0 = this.f728v;
                boolean z16 = true;
                switch (i11) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i12 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f733y;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < length) {
                                            if (gv.n.B0(strArr3[i13])) {
                                                z13 = false;
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        cn.i iVar = this$0.A;
                                        if (iVar != null) {
                                            iVar.e(strArr3[0], strArr3[1], strArr3[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < length2) {
                                        if (gv.n.B0(strArr3[i14])) {
                                            z16 = false;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f729u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i15 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar2.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f733y;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < length3) {
                                            if (gv.n.B0(strArr4[i16])) {
                                                z15 = false;
                                            } else {
                                                i16++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        cn.i iVar2 = this$0.A;
                                        if (iVar2 != null) {
                                            iVar2.e(strArr4[0], strArr4[1], strArr4[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < length4) {
                                        if (gv.n.B0(strArr4[i17])) {
                                            z16 = false;
                                        } else {
                                            i17++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f729u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i18 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar3.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f733y;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length5) {
                                            if (gv.n.B0(strArr5[i19])) {
                                                z11 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        cn.i iVar3 = this$0.A;
                                        if (iVar3 != null) {
                                            iVar3.e(strArr5[0], strArr5[1], strArr5[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length6) {
                                        if (gv.n.B0(strArr5[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f729u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.C = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.i

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ j f728v;

            {
                this.f728v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i11 = r2;
                zm.c cVar = null;
                j this$0 = this.f728v;
                boolean z16 = true;
                switch (i11) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i12 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f733y;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < length) {
                                            if (gv.n.B0(strArr3[i13])) {
                                                z13 = false;
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        cn.i iVar = this$0.A;
                                        if (iVar != null) {
                                            iVar.e(strArr3[0], strArr3[1], strArr3[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < length2) {
                                        if (gv.n.B0(strArr3[i14])) {
                                            z16 = false;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f729u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i15 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar2.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f733y;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < length3) {
                                            if (gv.n.B0(strArr4[i16])) {
                                                z15 = false;
                                            } else {
                                                i16++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        cn.i iVar2 = this$0.A;
                                        if (iVar2 != null) {
                                            iVar2.e(strArr4[0], strArr4[1], strArr4[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < length4) {
                                        if (gv.n.B0(strArr4[i17])) {
                                            z16 = false;
                                        } else {
                                            i17++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f729u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i18 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar3.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f733y;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length5) {
                                            if (gv.n.B0(strArr5[i19])) {
                                                z11 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        cn.i iVar3 = this$0.A;
                                        if (iVar3 != null) {
                                            iVar3.e(strArr5[0], strArr5[1], strArr5[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length6) {
                                        if (gv.n.B0(strArr5[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f729u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.D = registerForActivityResult2;
        androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.i

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ j f728v;

            {
                this.f728v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i11 = r2;
                zm.c cVar = null;
                j this$0 = this.f728v;
                boolean z16 = true;
                switch (i11) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i12 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f733y;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < length) {
                                            if (gv.n.B0(strArr3[i13])) {
                                                z13 = false;
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        cn.i iVar = this$0.A;
                                        if (iVar != null) {
                                            iVar.e(strArr3[0], strArr3[1], strArr3[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < length2) {
                                        if (gv.n.B0(strArr3[i14])) {
                                            z16 = false;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f729u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i15 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar2.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f733y;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < length3) {
                                            if (gv.n.B0(strArr4[i16])) {
                                                z15 = false;
                                            } else {
                                                i16++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        cn.i iVar2 = this$0.A;
                                        if (iVar2 != null) {
                                            iVar2.e(strArr4[0], strArr4[1], strArr4[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < length4) {
                                        if (gv.n.B0(strArr4[i17])) {
                                            z16 = false;
                                        } else {
                                            i17++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f729u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i18 = j.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar3.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f733y;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length5) {
                                            if (gv.n.B0(strArr5[i19])) {
                                                z11 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        cn.i iVar3 = this$0.A;
                                        if (iVar3 != null) {
                                            iVar3.e(strArr5[0], strArr5[1], strArr5[2], this$0.f731w, this$0.f734z);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length6) {
                                        if (gv.n.B0(strArr5[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f729u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.E = registerForActivityResult3;
    }

    public final void J(String str, boolean z10) {
        try {
            int i6 = bn.a.f4534a;
            ChipGroup cgTpFilters = (ChipGroup) _$_findCachedViewById(R.id.cgTpFilters);
            kotlin.jvm.internal.i.f(cgTpFilters, "cgTpFilters");
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            Chip b10 = bn.a.b(requireContext, cgTpFilters, str);
            if (b10 != null) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                b10.setId(d0.e.a());
            } else {
                b10 = null;
            }
            ((ChipGroup) _$_findCachedViewById(R.id.cgTpFilters)).addView(b10);
            if (z10) {
                this.f730v = str;
                if (b10 != null) {
                    b10.setChecked(true);
                }
                if (b10 != null) {
                    b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                }
                if (b10 != null) {
                    b10.setChipStrokeColorResource(R.color.title_high_contrast);
                }
                if (b10 != null) {
                    b10.setTextColor(g0.a.b(requireActivity(), R.color.white));
                }
                this.f732x = b10;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f729u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.F;
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
        return inflater.inflate(R.layout.fragment_library_all_top_picks, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f732x = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.F.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f729u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            l0 a10 = new androidx.lifecycle.o0(this, new jl.b0(new e1(), 4)).a(cn.i.class);
            cn.i iVar = (cn.i) a10;
            iVar.f5568z.e(getViewLifecycleOwner(), new qm.c(18, new a(this, iVar)));
            iVar.A.e(getViewLifecycleOwner(), new qm.c(19, new b()));
            iVar.B.e(getViewLifecycleOwner(), new qm.c(20, new c()));
            iVar.C.e(getViewLifecycleOwner(), new qm.c(21, new d(iVar)));
            ta.v.H(kc.f.H(iVar), null, 0, new cn.h(iVar, null), 3);
            this.A = (cn.i) a10;
            try {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivTpBack);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new ol.k(23, this));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }
}
