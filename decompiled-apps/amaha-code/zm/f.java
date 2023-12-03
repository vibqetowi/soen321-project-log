package zm;

import an.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: LibraryCollectionsPageAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<a> {
    public final String A;
    public final String B;
    public final String C;
    public final ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> D;
    public final ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> E;
    public final String F = LogHelper.INSTANCE.makeLogTag("LibraryCollectionsPageAdapter");

    /* renamed from: x  reason: collision with root package name */
    public final List<hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>>> f39637x;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, LibraryCollectionItemAccessModel> f39638y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f39639z;

    /* compiled from: LibraryCollectionsPageAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final AppCompatImageView A;
        public final AppCompatImageView B;
        public final LinearLayout C;

        /* renamed from: u  reason: collision with root package name */
        public final View f39640u;

        /* renamed from: v  reason: collision with root package name */
        public final View f39641v;

        /* renamed from: w  reason: collision with root package name */
        public final View f39642w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f39643x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f39644y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f39645z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.viewRowCACPremiumDivider);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.viewRowCACPremiumDivider)");
            this.f39640u = findViewById;
            View findViewById2 = view.findViewById(R.id.viewRowCACParentActivity);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.viewRowCACParentActivity)");
            this.f39641v = findViewById2;
            View findViewById3 = view.findViewById(R.id.viewRowCACPremiumBackground);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.v…wRowCACPremiumBackground)");
            this.f39642w = findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowCACPremiumTab);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowCACPremiumTab)");
            this.f39643x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowCACParentActivityHeader);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.t…wCACParentActivityHeader)");
            this.f39644y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvRowCACParentActivitySubHeader);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.t…CParentActivitySubHeader)");
            this.f39645z = (RobertoTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.ivRowCACParentActivityStatus);
            kotlin.jvm.internal.i.f(findViewById7, "view.findViewById(R.id.i…wCACParentActivityStatus)");
            this.A = (AppCompatImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.ivRowCACParentActivityBookmark);
            kotlin.jvm.internal.i.f(findViewById8, "view.findViewById(R.id.i…ACParentActivityBookmark)");
            this.B = (AppCompatImageView) findViewById8;
            View findViewById9 = view.findViewById(R.id.llRowCACFillerActivityContainer);
            kotlin.jvm.internal.i.f(findViewById9, "view.findViewById(R.id.l…CFillerActivityContainer)");
            this.C = (LinearLayout) findViewById9;
        }
    }

    /* compiled from: LibraryCollectionsPageAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f39646a;

        /* renamed from: b  reason: collision with root package name */
        public final Integer f39647b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f39648c;

        public b(int i6, Integer num, boolean z10) {
            this.f39646a = i6;
            this.f39647b = num;
            this.f39648c = z10;
        }
    }

    public f(ArrayList arrayList, HashMap hashMap, boolean z10, String str, String str2, String str3, n.e eVar, n.f fVar) {
        this.f39637x = arrayList;
        this.f39638y = hashMap;
        this.f39639z = z10;
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = eVar;
        this.E = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f39637x.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0283 A[Catch: Exception -> 0x0289, TRY_LEAVE, TryCatch #0 {Exception -> 0x0289, blocks: (B:3:0x0010, B:6:0x001d, B:9:0x0032, B:14:0x0043, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:25:0x008a, B:29:0x0095, B:33:0x00c4, B:36:0x00d8, B:43:0x00ee, B:45:0x0101, B:52:0x0118, B:55:0x011f, B:57:0x012e, B:64:0x0141, B:65:0x0151, B:67:0x0157, B:69:0x015f, B:74:0x017f, B:76:0x018e, B:82:0x01a0, B:84:0x01ac, B:89:0x01b9, B:90:0x01fb, B:91:0x01fe, B:92:0x01ff, B:95:0x0217, B:96:0x023c, B:99:0x0242, B:101:0x024b, B:103:0x025d, B:111:0x0271, B:112:0x0283, B:30:0x009d, B:22:0x0084, B:15:0x0052, B:32:0x00a8), top: B:117:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101 A[Catch: Exception -> 0x0289, TryCatch #0 {Exception -> 0x0289, blocks: (B:3:0x0010, B:6:0x001d, B:9:0x0032, B:14:0x0043, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:25:0x008a, B:29:0x0095, B:33:0x00c4, B:36:0x00d8, B:43:0x00ee, B:45:0x0101, B:52:0x0118, B:55:0x011f, B:57:0x012e, B:64:0x0141, B:65:0x0151, B:67:0x0157, B:69:0x015f, B:74:0x017f, B:76:0x018e, B:82:0x01a0, B:84:0x01ac, B:89:0x01b9, B:90:0x01fb, B:91:0x01fe, B:92:0x01ff, B:95:0x0217, B:96:0x023c, B:99:0x0242, B:101:0x024b, B:103:0x025d, B:111:0x0271, B:112:0x0283, B:30:0x009d, B:22:0x0084, B:15:0x0052, B:32:0x00a8), top: B:117:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[Catch: Exception -> 0x0289, TRY_ENTER, TryCatch #0 {Exception -> 0x0289, blocks: (B:3:0x0010, B:6:0x001d, B:9:0x0032, B:14:0x0043, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:25:0x008a, B:29:0x0095, B:33:0x00c4, B:36:0x00d8, B:43:0x00ee, B:45:0x0101, B:52:0x0118, B:55:0x011f, B:57:0x012e, B:64:0x0141, B:65:0x0151, B:67:0x0157, B:69:0x015f, B:74:0x017f, B:76:0x018e, B:82:0x01a0, B:84:0x01ac, B:89:0x01b9, B:90:0x01fb, B:91:0x01fe, B:92:0x01ff, B:95:0x0217, B:96:0x023c, B:99:0x0242, B:101:0x024b, B:103:0x025d, B:111:0x0271, B:112:0x0283, B:30:0x009d, B:22:0x0084, B:15:0x0052, B:32:0x00a8), top: B:117:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157 A[Catch: Exception -> 0x0289, TryCatch #0 {Exception -> 0x0289, blocks: (B:3:0x0010, B:6:0x001d, B:9:0x0032, B:14:0x0043, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:25:0x008a, B:29:0x0095, B:33:0x00c4, B:36:0x00d8, B:43:0x00ee, B:45:0x0101, B:52:0x0118, B:55:0x011f, B:57:0x012e, B:64:0x0141, B:65:0x0151, B:67:0x0157, B:69:0x015f, B:74:0x017f, B:76:0x018e, B:82:0x01a0, B:84:0x01ac, B:89:0x01b9, B:90:0x01fb, B:91:0x01fe, B:92:0x01ff, B:95:0x0217, B:96:0x023c, B:99:0x0242, B:101:0x024b, B:103:0x025d, B:111:0x0271, B:112:0x0283, B:30:0x009d, B:22:0x0084, B:15:0x0052, B:32:0x00a8), top: B:117:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0217 A[Catch: Exception -> 0x0289, TRY_ENTER, TryCatch #0 {Exception -> 0x0289, blocks: (B:3:0x0010, B:6:0x001d, B:9:0x0032, B:14:0x0043, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:25:0x008a, B:29:0x0095, B:33:0x00c4, B:36:0x00d8, B:43:0x00ee, B:45:0x0101, B:52:0x0118, B:55:0x011f, B:57:0x012e, B:64:0x0141, B:65:0x0151, B:67:0x0157, B:69:0x015f, B:74:0x017f, B:76:0x018e, B:82:0x01a0, B:84:0x01ac, B:89:0x01b9, B:90:0x01fb, B:91:0x01fe, B:92:0x01ff, B:95:0x0217, B:96:0x023c, B:99:0x0242, B:101:0x024b, B:103:0x025d, B:111:0x0271, B:112:0x0283, B:30:0x009d, B:22:0x0084, B:15:0x0052, B:32:0x00a8), top: B:117:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0242 A[Catch: Exception -> 0x0289, TRY_ENTER, TryCatch #0 {Exception -> 0x0289, blocks: (B:3:0x0010, B:6:0x001d, B:9:0x0032, B:14:0x0043, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:25:0x008a, B:29:0x0095, B:33:0x00c4, B:36:0x00d8, B:43:0x00ee, B:45:0x0101, B:52:0x0118, B:55:0x011f, B:57:0x012e, B:64:0x0141, B:65:0x0151, B:67:0x0157, B:69:0x015f, B:74:0x017f, B:76:0x018e, B:82:0x01a0, B:84:0x01ac, B:89:0x01b9, B:90:0x01fb, B:91:0x01fe, B:92:0x01ff, B:95:0x0217, B:96:0x023c, B:99:0x0242, B:101:0x024b, B:103:0x025d, B:111:0x0271, B:112:0x0283, B:30:0x009d, B:22:0x0084, B:15:0x0052, B:32:0x00a8), top: B:117:0x0010 }] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r8v1 */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, final int i6) {
        String str;
        String str2;
        String str3;
        HashMap<String, LibraryCollectionItemAccessModel> hashMap;
        boolean z10;
        int i10;
        String str4;
        boolean z11;
        final int i11;
        boolean z12;
        int i12;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
        boolean z13;
        LinearLayout linearLayout;
        boolean z14;
        boolean z15;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel3;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel4;
        a aVar2 = aVar;
        List<hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>>> list = this.f39637x;
        AppCompatImageView appCompatImageView = aVar2.A;
        RobertoTextView robertoTextView = aVar2.f39645z;
        RobertoTextView robertoTextView2 = aVar2.f39644y;
        try {
            final hs.f fVar = (hs.f) u.j2(i6, list);
            if (fVar != null) {
                Object obj = fVar.f19465v;
                Object obj2 = fVar.f19464u;
                boolean isFree = ((LibraryCollectionItem) obj2).isFree();
                View view = aVar2.f39640u;
                View view2 = aVar2.f2751a;
                RobertoTextView robertoTextView3 = aVar2.f39643x;
                View view3 = aVar2.f39642w;
                if (isFree || SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    str = "";
                    view3.setBackgroundResource(0);
                    view3.setBackgroundColor(g0.a.b(view2.getContext(), R.color.white));
                    robertoTextView3.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    String str5 = this.C;
                    if (str5 != null) {
                        str = "";
                        view3.setBackgroundResource(R.drawable.background_rectangle);
                        view3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                    } else {
                        str = "";
                        view3.setBackgroundResource(0);
                        view3.setBackgroundColor(g0.a.b(view2.getContext(), R.color.transparent_blue));
                    }
                    Iterator<hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>>> it = list.iterator();
                    int i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().f19464u.isFree()) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    if (i6 == i13) {
                        robertoTextView3.setVisibility(0);
                        String str6 = this.A;
                        if (str6 == null) {
                            str6 = str;
                        }
                        robertoTextView3.setText(str6);
                        view.setVisibility(0);
                    } else {
                        robertoTextView3.setVisibility(8);
                        view.setVisibility(8);
                    }
                }
                String str7 = (String) u.j2(0, ((LibraryCollectionItem) obj2).getStrings());
                if (str7 != null) {
                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str7, "-")).booleanValue()) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        robertoTextView2.setText(str7);
                        str2 = (String) u.j2(1, ((LibraryCollectionItem) obj2).getStrings());
                        if (str2 != null) {
                            if (Boolean.valueOf(kotlin.jvm.internal.i.b(str2, "-")).booleanValue()) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                str3 = str2;
                                robertoTextView.setText(str3);
                                hashMap = this.f39638y;
                                if (hashMap == null && (libraryCollectionItemAccessModel4 = hashMap.get(((LibraryCollectionItem) obj2).getId())) != null && libraryCollectionItemAccessModel4.isCompleted()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i10 = R.drawable.ic_check_transparent_grey_bg;
                                } else {
                                    i10 = R.drawable.ic_collection_status_active;
                                }
                                appCompatImageView.setImageResource(i10);
                                aVar2.C.removeAllViews();
                                int i14 = 0;
                                for (Object obj3 : (Iterable) obj) {
                                    int i15 = i14 + 1;
                                    if (i14 >= 0) {
                                        LibraryCollectionItem libraryCollectionItem = (LibraryCollectionItem) obj3;
                                        Context context = view2.getContext();
                                        kotlin.jvm.internal.i.f(context, "itemView.context");
                                        LinearLayout linearLayout2 = aVar2.C;
                                        if (i14 == obj.size() - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (hashMap != null && (libraryCollectionItemAccessModel3 = hashMap.get(obj2.getId())) != null) {
                                            linearLayout = linearLayout2;
                                            if (libraryCollectionItemAccessModel3.isCompleted()) {
                                                z14 = true;
                                                if (hashMap == null && (libraryCollectionItemAccessModel2 = hashMap.get(libraryCollectionItem.getId())) != null) {
                                                    if (libraryCollectionItemAccessModel2.isCompleted()) {
                                                        z15 = true;
                                                        w(context, linearLayout, libraryCollectionItem, z13, z14, z15, (String) u.j2(0, obj2.getStrings()));
                                                        hashMap = hashMap;
                                                        obj2 = obj2;
                                                        i14 = i15;
                                                        view2 = view2;
                                                        obj = obj;
                                                        robertoTextView3 = robertoTextView3;
                                                    }
                                                }
                                                z15 = false;
                                                w(context, linearLayout, libraryCollectionItem, z13, z14, z15, (String) u.j2(0, obj2.getStrings()));
                                                hashMap = hashMap;
                                                obj2 = obj2;
                                                i14 = i15;
                                                view2 = view2;
                                                obj = obj;
                                                robertoTextView3 = robertoTextView3;
                                            }
                                        } else {
                                            linearLayout = linearLayout2;
                                        }
                                        z14 = false;
                                        if (hashMap == null) {
                                        }
                                        z15 = false;
                                        w(context, linearLayout, libraryCollectionItem, z13, z14, z15, (String) u.j2(0, obj2.getStrings()));
                                        hashMap = hashMap;
                                        obj2 = obj2;
                                        i14 = i15;
                                        view2 = view2;
                                        obj = obj;
                                        robertoTextView3 = robertoTextView3;
                                    } else {
                                        ca.a.t1();
                                        throw null;
                                    }
                                }
                                HashMap<String, LibraryCollectionItemAccessModel> hashMap2 = hashMap;
                                RobertoTextView robertoTextView4 = robertoTextView3;
                                View view4 = view2;
                                LibraryCollectionItem libraryCollectionItem2 = obj2;
                                View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: zm.d

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ f f39629v;

                                    {
                                        this.f39629v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view5) {
                                        boolean z16;
                                        boolean z17;
                                        String str8;
                                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                                        boolean z18;
                                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel7;
                                        String str9;
                                        boolean z19;
                                        String str10;
                                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel8;
                                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel9;
                                        int i16 = r4;
                                        int i17 = i6;
                                        String str11 = "";
                                        hs.f it2 = fVar;
                                        f this$0 = this.f39629v;
                                        boolean z20 = false;
                                        switch (i16) {
                                            case 0:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(it2, "$it");
                                                ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                                LibraryCollectionItem libraryCollectionItem3 = (LibraryCollectionItem) it2.f19464u;
                                                String id2 = libraryCollectionItem3.getId();
                                                String itemType = libraryCollectionItem3.getItemType();
                                                String str12 = (String) u.j2(0, libraryCollectionItem3.getStrings());
                                                if (str12 == null) {
                                                    str9 = "";
                                                } else {
                                                    str9 = str12;
                                                }
                                                Boolean valueOf = Boolean.valueOf(libraryCollectionItem3.isFree());
                                                Boolean bool = Boolean.TRUE;
                                                HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = this$0.f39638y;
                                                if (hashMap3 != null && (libraryCollectionItemAccessModel9 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel9.isCompleted()) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (z19) {
                                                    str10 = "completed";
                                                } else {
                                                    if (hashMap3 != null && (libraryCollectionItemAccessModel8 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel8.isAccessed()) {
                                                        z20 = true;
                                                    }
                                                    if (z20) {
                                                        str10 = "incomplete";
                                                    } else {
                                                        str10 = "not_started";
                                                    }
                                                }
                                                bVar.x(id2, itemType, str9, valueOf, bool, null, str10, null, Integer.valueOf(i17), libraryCollectionItem3.getDynamicVariant());
                                                return;
                                            default:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(it2, "$it");
                                                ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                                LibraryCollectionItem libraryCollectionItem4 = (LibraryCollectionItem) it2.f19464u;
                                                String id3 = libraryCollectionItem4.getId();
                                                String itemType2 = libraryCollectionItem4.getItemType();
                                                String str13 = (String) u.j2(0, libraryCollectionItem4.getStrings());
                                                if (str13 != null) {
                                                    str11 = str13;
                                                }
                                                Boolean valueOf2 = Boolean.valueOf(libraryCollectionItem4.isFree());
                                                Boolean bool2 = Boolean.TRUE;
                                                HashMap<String, LibraryCollectionItemAccessModel> hashMap4 = this$0.f39638y;
                                                if (hashMap4 != null && (libraryCollectionItemAccessModel7 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel7.isCompleted()) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    str8 = "completed";
                                                } else {
                                                    if (hashMap4 != null && (libraryCollectionItemAccessModel5 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        str8 = "incomplete";
                                                    } else {
                                                        str8 = "not_started";
                                                    }
                                                }
                                                Integer valueOf3 = Integer.valueOf(i17);
                                                if (hashMap4 != null && (libraryCollectionItemAccessModel6 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel6.isBookmarked()) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                cVar.q(id3, itemType2, str11, valueOf2, bool2, null, str8, null, valueOf3, Boolean.valueOf(!z18), libraryCollectionItem4.getDynamicVariant());
                                                return;
                                        }
                                    }
                                };
                                robertoTextView2.setOnClickListener(onClickListener);
                                robertoTextView.setOnClickListener(onClickListener);
                                str4 = this.B;
                                if (str4 != null) {
                                    appCompatImageView.setImageTintList(ColorStateList.valueOf(Color.parseColor(str4)));
                                    aVar2.f39641v.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str4)));
                                    robertoTextView4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str4)));
                                }
                                z11 = this.f39639z;
                                AppCompatImageView appCompatImageView2 = aVar2.B;
                                if (z11) {
                                    appCompatImageView2.setVisibility(0);
                                    Context context2 = view4.getContext();
                                    if (hashMap2 != null && (libraryCollectionItemAccessModel = hashMap2.get(libraryCollectionItem2.getId())) != null) {
                                        i11 = 1;
                                        if (libraryCollectionItemAccessModel.isBookmarked()) {
                                            z12 = true;
                                            if (!z12) {
                                                i12 = R.drawable.ic_saved;
                                            } else {
                                                i12 = R.drawable.ic_unsaved;
                                            }
                                            Object obj4 = g0.a.f16164a;
                                            appCompatImageView2.setImageDrawable(a.c.b(context2, i12));
                                            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: zm.d

                                                /* renamed from: v  reason: collision with root package name */
                                                public final /* synthetic */ f f39629v;

                                                {
                                                    this.f39629v = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view5) {
                                                    boolean z16;
                                                    boolean z17;
                                                    String str8;
                                                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                                                    boolean z18;
                                                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                                                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel7;
                                                    String str9;
                                                    boolean z19;
                                                    String str10;
                                                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel8;
                                                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel9;
                                                    int i16 = i11;
                                                    int i17 = i6;
                                                    String str11 = "";
                                                    hs.f it2 = fVar;
                                                    f this$0 = this.f39629v;
                                                    boolean z20 = false;
                                                    switch (i16) {
                                                        case 0:
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            kotlin.jvm.internal.i.g(it2, "$it");
                                                            ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                                            LibraryCollectionItem libraryCollectionItem3 = (LibraryCollectionItem) it2.f19464u;
                                                            String id2 = libraryCollectionItem3.getId();
                                                            String itemType = libraryCollectionItem3.getItemType();
                                                            String str12 = (String) u.j2(0, libraryCollectionItem3.getStrings());
                                                            if (str12 == null) {
                                                                str9 = "";
                                                            } else {
                                                                str9 = str12;
                                                            }
                                                            Boolean valueOf = Boolean.valueOf(libraryCollectionItem3.isFree());
                                                            Boolean bool = Boolean.TRUE;
                                                            HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = this$0.f39638y;
                                                            if (hashMap3 != null && (libraryCollectionItemAccessModel9 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel9.isCompleted()) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            if (z19) {
                                                                str10 = "completed";
                                                            } else {
                                                                if (hashMap3 != null && (libraryCollectionItemAccessModel8 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel8.isAccessed()) {
                                                                    z20 = true;
                                                                }
                                                                if (z20) {
                                                                    str10 = "incomplete";
                                                                } else {
                                                                    str10 = "not_started";
                                                                }
                                                            }
                                                            bVar.x(id2, itemType, str9, valueOf, bool, null, str10, null, Integer.valueOf(i17), libraryCollectionItem3.getDynamicVariant());
                                                            return;
                                                        default:
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            kotlin.jvm.internal.i.g(it2, "$it");
                                                            ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                                            LibraryCollectionItem libraryCollectionItem4 = (LibraryCollectionItem) it2.f19464u;
                                                            String id3 = libraryCollectionItem4.getId();
                                                            String itemType2 = libraryCollectionItem4.getItemType();
                                                            String str13 = (String) u.j2(0, libraryCollectionItem4.getStrings());
                                                            if (str13 != null) {
                                                                str11 = str13;
                                                            }
                                                            Boolean valueOf2 = Boolean.valueOf(libraryCollectionItem4.isFree());
                                                            Boolean bool2 = Boolean.TRUE;
                                                            HashMap<String, LibraryCollectionItemAccessModel> hashMap4 = this$0.f39638y;
                                                            if (hashMap4 != null && (libraryCollectionItemAccessModel7 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel7.isCompleted()) {
                                                                z16 = true;
                                                            } else {
                                                                z16 = false;
                                                            }
                                                            if (z16) {
                                                                str8 = "completed";
                                                            } else {
                                                                if (hashMap4 != null && (libraryCollectionItemAccessModel5 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                                                    z17 = true;
                                                                } else {
                                                                    z17 = false;
                                                                }
                                                                if (z17) {
                                                                    str8 = "incomplete";
                                                                } else {
                                                                    str8 = "not_started";
                                                                }
                                                            }
                                                            Integer valueOf3 = Integer.valueOf(i17);
                                                            if (hashMap4 != null && (libraryCollectionItemAccessModel6 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel6.isBookmarked()) {
                                                                z18 = true;
                                                            } else {
                                                                z18 = false;
                                                            }
                                                            cVar.q(id3, itemType2, str11, valueOf2, bool2, null, str8, null, valueOf3, Boolean.valueOf(!z18), libraryCollectionItem4.getDynamicVariant());
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    } else {
                                        i11 = 1;
                                    }
                                    z12 = false;
                                    if (!z12) {
                                    }
                                    Object obj42 = g0.a.f16164a;
                                    appCompatImageView2.setImageDrawable(a.c.b(context2, i12));
                                    appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: zm.d

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ f f39629v;

                                        {
                                            this.f39629v = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view5) {
                                            boolean z16;
                                            boolean z17;
                                            String str8;
                                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                                            boolean z18;
                                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel7;
                                            String str9;
                                            boolean z19;
                                            String str10;
                                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel8;
                                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel9;
                                            int i16 = i11;
                                            int i17 = i6;
                                            String str11 = "";
                                            hs.f it2 = fVar;
                                            f this$0 = this.f39629v;
                                            boolean z20 = false;
                                            switch (i16) {
                                                case 0:
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    kotlin.jvm.internal.i.g(it2, "$it");
                                                    ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                                    LibraryCollectionItem libraryCollectionItem3 = (LibraryCollectionItem) it2.f19464u;
                                                    String id2 = libraryCollectionItem3.getId();
                                                    String itemType = libraryCollectionItem3.getItemType();
                                                    String str12 = (String) u.j2(0, libraryCollectionItem3.getStrings());
                                                    if (str12 == null) {
                                                        str9 = "";
                                                    } else {
                                                        str9 = str12;
                                                    }
                                                    Boolean valueOf = Boolean.valueOf(libraryCollectionItem3.isFree());
                                                    Boolean bool = Boolean.TRUE;
                                                    HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = this$0.f39638y;
                                                    if (hashMap3 != null && (libraryCollectionItemAccessModel9 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel9.isCompleted()) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    if (z19) {
                                                        str10 = "completed";
                                                    } else {
                                                        if (hashMap3 != null && (libraryCollectionItemAccessModel8 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel8.isAccessed()) {
                                                            z20 = true;
                                                        }
                                                        if (z20) {
                                                            str10 = "incomplete";
                                                        } else {
                                                            str10 = "not_started";
                                                        }
                                                    }
                                                    bVar.x(id2, itemType, str9, valueOf, bool, null, str10, null, Integer.valueOf(i17), libraryCollectionItem3.getDynamicVariant());
                                                    return;
                                                default:
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    kotlin.jvm.internal.i.g(it2, "$it");
                                                    ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                                    LibraryCollectionItem libraryCollectionItem4 = (LibraryCollectionItem) it2.f19464u;
                                                    String id3 = libraryCollectionItem4.getId();
                                                    String itemType2 = libraryCollectionItem4.getItemType();
                                                    String str13 = (String) u.j2(0, libraryCollectionItem4.getStrings());
                                                    if (str13 != null) {
                                                        str11 = str13;
                                                    }
                                                    Boolean valueOf2 = Boolean.valueOf(libraryCollectionItem4.isFree());
                                                    Boolean bool2 = Boolean.TRUE;
                                                    HashMap<String, LibraryCollectionItemAccessModel> hashMap4 = this$0.f39638y;
                                                    if (hashMap4 != null && (libraryCollectionItemAccessModel7 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel7.isCompleted()) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (z16) {
                                                        str8 = "completed";
                                                    } else {
                                                        if (hashMap4 != null && (libraryCollectionItemAccessModel5 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                                            z17 = true;
                                                        } else {
                                                            z17 = false;
                                                        }
                                                        if (z17) {
                                                            str8 = "incomplete";
                                                        } else {
                                                            str8 = "not_started";
                                                        }
                                                    }
                                                    Integer valueOf3 = Integer.valueOf(i17);
                                                    if (hashMap4 != null && (libraryCollectionItemAccessModel6 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel6.isBookmarked()) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    cVar.q(id3, itemType2, str11, valueOf2, bool2, null, str8, null, valueOf3, Boolean.valueOf(!z18), libraryCollectionItem4.getDynamicVariant());
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                appCompatImageView2.setVisibility(8);
                                return;
                            }
                        }
                        str3 = str;
                        robertoTextView.setText(str3);
                        hashMap = this.f39638y;
                        if (hashMap == null) {
                        }
                        z10 = false;
                        if (z10) {
                        }
                        appCompatImageView.setImageResource(i10);
                        aVar2.C.removeAllViews();
                        int i142 = 0;
                        while (r19.hasNext()) {
                        }
                        HashMap<String, LibraryCollectionItemAccessModel> hashMap22 = hashMap;
                        RobertoTextView robertoTextView42 = robertoTextView3;
                        View view42 = view2;
                        LibraryCollectionItem libraryCollectionItem22 = obj2;
                        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: zm.d

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ f f39629v;

                            {
                                this.f39629v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                boolean z16;
                                boolean z17;
                                String str8;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                                boolean z18;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel7;
                                String str9;
                                boolean z19;
                                String str10;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel8;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel9;
                                int i16 = i11;
                                int i17 = i6;
                                String str11 = "";
                                hs.f it2 = fVar;
                                f this$0 = this.f39629v;
                                boolean z20 = false;
                                switch (i16) {
                                    case 0:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(it2, "$it");
                                        ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                        LibraryCollectionItem libraryCollectionItem3 = (LibraryCollectionItem) it2.f19464u;
                                        String id2 = libraryCollectionItem3.getId();
                                        String itemType = libraryCollectionItem3.getItemType();
                                        String str12 = (String) u.j2(0, libraryCollectionItem3.getStrings());
                                        if (str12 == null) {
                                            str9 = "";
                                        } else {
                                            str9 = str12;
                                        }
                                        Boolean valueOf = Boolean.valueOf(libraryCollectionItem3.isFree());
                                        Boolean bool = Boolean.TRUE;
                                        HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = this$0.f39638y;
                                        if (hashMap3 != null && (libraryCollectionItemAccessModel9 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel9.isCompleted()) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z19) {
                                            str10 = "completed";
                                        } else {
                                            if (hashMap3 != null && (libraryCollectionItemAccessModel8 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel8.isAccessed()) {
                                                z20 = true;
                                            }
                                            if (z20) {
                                                str10 = "incomplete";
                                            } else {
                                                str10 = "not_started";
                                            }
                                        }
                                        bVar.x(id2, itemType, str9, valueOf, bool, null, str10, null, Integer.valueOf(i17), libraryCollectionItem3.getDynamicVariant());
                                        return;
                                    default:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(it2, "$it");
                                        ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                        LibraryCollectionItem libraryCollectionItem4 = (LibraryCollectionItem) it2.f19464u;
                                        String id3 = libraryCollectionItem4.getId();
                                        String itemType2 = libraryCollectionItem4.getItemType();
                                        String str13 = (String) u.j2(0, libraryCollectionItem4.getStrings());
                                        if (str13 != null) {
                                            str11 = str13;
                                        }
                                        Boolean valueOf2 = Boolean.valueOf(libraryCollectionItem4.isFree());
                                        Boolean bool2 = Boolean.TRUE;
                                        HashMap<String, LibraryCollectionItemAccessModel> hashMap4 = this$0.f39638y;
                                        if (hashMap4 != null && (libraryCollectionItemAccessModel7 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel7.isCompleted()) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            str8 = "completed";
                                        } else {
                                            if (hashMap4 != null && (libraryCollectionItemAccessModel5 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                str8 = "incomplete";
                                            } else {
                                                str8 = "not_started";
                                            }
                                        }
                                        Integer valueOf3 = Integer.valueOf(i17);
                                        if (hashMap4 != null && (libraryCollectionItemAccessModel6 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel6.isBookmarked()) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        cVar.q(id3, itemType2, str11, valueOf2, bool2, null, str8, null, valueOf3, Boolean.valueOf(!z18), libraryCollectionItem4.getDynamicVariant());
                                        return;
                                }
                            }
                        };
                        robertoTextView2.setOnClickListener(onClickListener2);
                        robertoTextView.setOnClickListener(onClickListener2);
                        str4 = this.B;
                        if (str4 != null) {
                        }
                        z11 = this.f39639z;
                        AppCompatImageView appCompatImageView22 = aVar2.B;
                        if (z11) {
                        }
                    }
                }
                str7 = str;
                robertoTextView2.setText(str7);
                str2 = (String) u.j2(1, ((LibraryCollectionItem) obj2).getStrings());
                if (str2 != null) {
                }
                str3 = str;
                robertoTextView.setText(str3);
                hashMap = this.f39638y;
                if (hashMap == null) {
                }
                z10 = false;
                if (z10) {
                }
                appCompatImageView.setImageResource(i10);
                aVar2.C.removeAllViews();
                int i1422 = 0;
                while (r19.hasNext()) {
                }
                HashMap<String, LibraryCollectionItemAccessModel> hashMap222 = hashMap;
                RobertoTextView robertoTextView422 = robertoTextView3;
                View view422 = view2;
                LibraryCollectionItem libraryCollectionItem222 = obj2;
                View.OnClickListener onClickListener22 = new View.OnClickListener(this) { // from class: zm.d

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f39629v;

                    {
                        this.f39629v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        boolean z16;
                        boolean z17;
                        String str8;
                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                        boolean z18;
                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel7;
                        String str9;
                        boolean z19;
                        String str10;
                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel8;
                        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel9;
                        int i16 = i11;
                        int i17 = i6;
                        String str11 = "";
                        hs.f it2 = fVar;
                        f this$0 = this.f39629v;
                        boolean z20 = false;
                        switch (i16) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                LibraryCollectionItem libraryCollectionItem3 = (LibraryCollectionItem) it2.f19464u;
                                String id2 = libraryCollectionItem3.getId();
                                String itemType = libraryCollectionItem3.getItemType();
                                String str12 = (String) u.j2(0, libraryCollectionItem3.getStrings());
                                if (str12 == null) {
                                    str9 = "";
                                } else {
                                    str9 = str12;
                                }
                                Boolean valueOf = Boolean.valueOf(libraryCollectionItem3.isFree());
                                Boolean bool = Boolean.TRUE;
                                HashMap<String, LibraryCollectionItemAccessModel> hashMap3 = this$0.f39638y;
                                if (hashMap3 != null && (libraryCollectionItemAccessModel9 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel9.isCompleted()) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    str10 = "completed";
                                } else {
                                    if (hashMap3 != null && (libraryCollectionItemAccessModel8 = hashMap3.get(libraryCollectionItem3.getId())) != null && libraryCollectionItemAccessModel8.isAccessed()) {
                                        z20 = true;
                                    }
                                    if (z20) {
                                        str10 = "incomplete";
                                    } else {
                                        str10 = "not_started";
                                    }
                                }
                                bVar.x(id2, itemType, str9, valueOf, bool, null, str10, null, Integer.valueOf(i17), libraryCollectionItem3.getDynamicVariant());
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                LibraryCollectionItem libraryCollectionItem4 = (LibraryCollectionItem) it2.f19464u;
                                String id3 = libraryCollectionItem4.getId();
                                String itemType2 = libraryCollectionItem4.getItemType();
                                String str13 = (String) u.j2(0, libraryCollectionItem4.getStrings());
                                if (str13 != null) {
                                    str11 = str13;
                                }
                                Boolean valueOf2 = Boolean.valueOf(libraryCollectionItem4.isFree());
                                Boolean bool2 = Boolean.TRUE;
                                HashMap<String, LibraryCollectionItemAccessModel> hashMap4 = this$0.f39638y;
                                if (hashMap4 != null && (libraryCollectionItemAccessModel7 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel7.isCompleted()) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    str8 = "completed";
                                } else {
                                    if (hashMap4 != null && (libraryCollectionItemAccessModel5 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        str8 = "incomplete";
                                    } else {
                                        str8 = "not_started";
                                    }
                                }
                                Integer valueOf3 = Integer.valueOf(i17);
                                if (hashMap4 != null && (libraryCollectionItemAccessModel6 = hashMap4.get(libraryCollectionItem4.getId())) != null && libraryCollectionItemAccessModel6.isBookmarked()) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                cVar.q(id3, itemType2, str11, valueOf2, bool2, null, str8, null, valueOf3, Boolean.valueOf(!z18), libraryCollectionItem4.getDynamicVariant());
                                return;
                        }
                    }
                };
                robertoTextView2.setOnClickListener(onClickListener22);
                robertoTextView.setOnClickListener(onClickListener22);
                str4 = this.B;
                if (str4 != null) {
                }
                z11 = this.f39639z;
                AppCompatImageView appCompatImageView222 = aVar2.B;
                if (z11) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.F, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_collection_activities_container, parent, false, "from(parent.context).inf…container, parent, false)"));
    }

    public final b v(String str) {
        boolean z10;
        Iterator<T> it = this.f39637x.iterator();
        int i6 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                return null;
            }
            Object next = it.next();
            int i10 = i6 + 1;
            if (i6 >= 0) {
                hs.f fVar = (hs.f) next;
                if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) fVar.f19464u).getId(), str)) {
                    return new b(i6, null, false);
                }
                Iterator it2 = ((List) fVar.f19465v).iterator();
                int i11 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) it2.next()).getId(), str)) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i11);
                if (valueOf.intValue() == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    num = valueOf;
                }
                if (num != null) {
                    return new b(i6, Integer.valueOf(num.intValue()), true);
                }
                i6 = i10;
            } else {
                ca.a.t1();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:3:0x0005, B:6:0x002b, B:13:0x003f, B:15:0x0058, B:20:0x006a, B:24:0x0082, B:27:0x0094, B:31:0x00a7, B:37:0x00c2, B:40:0x00da, B:41:0x00fa, B:43:0x0101, B:45:0x0114, B:47:0x0120, B:53:0x0130, B:55:0x015a, B:54:0x014f), top: B:60:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[Catch: Exception -> 0x015e, TRY_ENTER, TryCatch #0 {Exception -> 0x015e, blocks: (B:3:0x0005, B:6:0x002b, B:13:0x003f, B:15:0x0058, B:20:0x006a, B:24:0x0082, B:27:0x0094, B:31:0x00a7, B:37:0x00c2, B:40:0x00da, B:41:0x00fa, B:43:0x0101, B:45:0x0114, B:47:0x0120, B:53:0x0130, B:55:0x015a, B:54:0x014f), top: B:60:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:3:0x0005, B:6:0x002b, B:13:0x003f, B:15:0x0058, B:20:0x006a, B:24:0x0082, B:27:0x0094, B:31:0x00a7, B:37:0x00c2, B:40:0x00da, B:41:0x00fa, B:43:0x0101, B:45:0x0114, B:47:0x0120, B:53:0x0130, B:55:0x015a, B:54:0x014f), top: B:60:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:3:0x0005, B:6:0x002b, B:13:0x003f, B:15:0x0058, B:20:0x006a, B:24:0x0082, B:27:0x0094, B:31:0x00a7, B:37:0x00c2, B:40:0x00da, B:41:0x00fa, B:43:0x0101, B:45:0x0114, B:47:0x0120, B:53:0x0130, B:55:0x015a, B:54:0x014f), top: B:60:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(Context context, LinearLayout linearLayout, final LibraryCollectionItem libraryCollectionItem, boolean z10, final boolean z11, boolean z12, final String str) {
        String str2;
        int i6;
        int i10;
        int i11;
        String str3;
        int i12;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
        try {
            boolean z13 = false;
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_collection_filler_activity, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivityHeader);
            String str4 = (String) u.j2(0, libraryCollectionItem.getStrings());
            String str5 = null;
            String str6 = "";
            if (str4 != null) {
                if (Boolean.valueOf(kotlin.jvm.internal.i.b(str4, "-")).booleanValue()) {
                    str4 = null;
                }
                if (str4 != null) {
                    robertoTextView.setText(str4);
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivitySubHeader);
                    str2 = (String) u.j2(1, libraryCollectionItem.getStrings());
                    if (str2 != null) {
                        if (!Boolean.valueOf(kotlin.jvm.internal.i.b(str2, "-")).booleanValue()) {
                            str5 = str2;
                        }
                        if (str5 != null) {
                            str6 = str5;
                        }
                    }
                    robertoTextView2.setText(str6);
                    RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivityHeader);
                    int i13 = R.color.title_high_contrast_54_opacity;
                    if (!z11) {
                        i6 = R.color.title_high_contrast;
                    } else {
                        i6 = R.color.title_high_contrast_54_opacity;
                    }
                    robertoTextView3.setTextColor(g0.a.b(context, i6));
                    RobertoTextView robertoTextView4 = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivitySubHeader);
                    if (z11) {
                        i13 = R.color.title_high_contrast;
                    }
                    robertoTextView4.setTextColor(g0.a.b(context, i13));
                    View findViewById = inflate.findViewById(R.id.viewRowCAFBottom);
                    if (!z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    findViewById.setVisibility(i10);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityStatus);
                    if (!z12) {
                        i11 = R.drawable.ic_check_transparent_grey_bg;
                    } else if (z11) {
                        i11 = R.drawable.ic_collection_status_active;
                    } else {
                        i11 = R.drawable.ic_collection_status_locked;
                    }
                    appCompatImageView.setImageResource(i11);
                    inflate.setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ f f39633v;

                        {
                            this.f39633v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z14;
                            boolean z15;
                            String str7;
                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
                            boolean z16;
                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel3;
                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel4;
                            boolean z17;
                            boolean z18;
                            String str8;
                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                            LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                            int i14 = r5;
                            boolean z19 = z11;
                            LibraryCollectionItem activity = libraryCollectionItem;
                            f this$0 = this.f39633v;
                            switch (i14) {
                                case 0:
                                    String str9 = str;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(activity, "$activity");
                                    ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                    String id2 = activity.getId();
                                    String itemType = activity.getItemType();
                                    String str10 = (String) u.j2(0, activity.getStrings());
                                    if (str10 == null) {
                                        str10 = "";
                                    }
                                    Boolean valueOf = Boolean.valueOf(activity.isFree());
                                    Boolean bool = Boolean.FALSE;
                                    HashMap<String, LibraryCollectionItemAccessModel> hashMap = this$0.f39638y;
                                    if (hashMap != null && (libraryCollectionItemAccessModel6 = hashMap.get(activity.getId())) != null && libraryCollectionItemAccessModel6.isCompleted()) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        str8 = "completed";
                                    } else {
                                        if (hashMap != null && (libraryCollectionItemAccessModel5 = hashMap.get(activity.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (z18) {
                                            str8 = "incomplete";
                                        } else {
                                            str8 = "not_started";
                                        }
                                    }
                                    bVar.x(id2, itemType, str10, valueOf, bool, str9, str8, Boolean.valueOf(z19), -1, activity.getDynamicVariant());
                                    return;
                                default:
                                    String str11 = str;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(activity, "$activity");
                                    ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                    String id3 = activity.getId();
                                    String itemType2 = activity.getItemType();
                                    String str12 = (String) u.j2(0, activity.getStrings());
                                    if (str12 == null) {
                                        str12 = "";
                                    }
                                    Boolean valueOf2 = Boolean.valueOf(activity.isFree());
                                    Boolean bool2 = Boolean.FALSE;
                                    HashMap<String, LibraryCollectionItemAccessModel> hashMap2 = this$0.f39638y;
                                    if (hashMap2 != null && (libraryCollectionItemAccessModel4 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel4.isCompleted()) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        str7 = "completed";
                                    } else {
                                        if (hashMap2 != null && (libraryCollectionItemAccessModel2 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel2.isAccessed()) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            str7 = "incomplete";
                                        } else {
                                            str7 = "not_started";
                                        }
                                    }
                                    Boolean valueOf3 = Boolean.valueOf(z19);
                                    if (hashMap2 != null && (libraryCollectionItemAccessModel3 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel3.isBookmarked()) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    cVar.q(id3, itemType2, str12, valueOf2, bool2, str11, str7, valueOf3, -1, Boolean.valueOf(!z16), activity.getDynamicVariant());
                                    return;
                            }
                        }
                    });
                    str3 = this.B;
                    if (str3 != null) {
                        inflate.findViewById(R.id.viewRowCAFBottom).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                        ((AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityStatus)).setImageTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                    }
                    if (!this.f39639z) {
                        ((AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityBookmark)).setVisibility(0);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityBookmark);
                        HashMap<String, LibraryCollectionItemAccessModel> hashMap = this.f39638y;
                        if (hashMap != null && (libraryCollectionItemAccessModel = hashMap.get(libraryCollectionItem.getId())) != null && libraryCollectionItemAccessModel.isBookmarked()) {
                            z13 = true;
                        }
                        if (z13) {
                            i12 = R.drawable.ic_saved;
                        } else {
                            i12 = R.drawable.ic_unsaved;
                        }
                        appCompatImageView2.setImageDrawable(a.c.b(context, i12));
                        ((AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityBookmark)).setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ f f39633v;

                            {
                                this.f39633v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z14;
                                boolean z15;
                                String str7;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
                                boolean z16;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel3;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel4;
                                boolean z17;
                                boolean z18;
                                String str8;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                                LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                                int i14 = r5;
                                boolean z19 = z11;
                                LibraryCollectionItem activity = libraryCollectionItem;
                                f this$0 = this.f39633v;
                                switch (i14) {
                                    case 0:
                                        String str9 = str;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(activity, "$activity");
                                        ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                                        String id2 = activity.getId();
                                        String itemType = activity.getItemType();
                                        String str10 = (String) u.j2(0, activity.getStrings());
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        Boolean valueOf = Boolean.valueOf(activity.isFree());
                                        Boolean bool = Boolean.FALSE;
                                        HashMap<String, LibraryCollectionItemAccessModel> hashMap2 = this$0.f39638y;
                                        if (hashMap2 != null && (libraryCollectionItemAccessModel6 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel6.isCompleted()) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            str8 = "completed";
                                        } else {
                                            if (hashMap2 != null && (libraryCollectionItemAccessModel5 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18) {
                                                str8 = "incomplete";
                                            } else {
                                                str8 = "not_started";
                                            }
                                        }
                                        bVar.x(id2, itemType, str10, valueOf, bool, str9, str8, Boolean.valueOf(z19), -1, activity.getDynamicVariant());
                                        return;
                                    default:
                                        String str11 = str;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(activity, "$activity");
                                        ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                                        String id3 = activity.getId();
                                        String itemType2 = activity.getItemType();
                                        String str12 = (String) u.j2(0, activity.getStrings());
                                        if (str12 == null) {
                                            str12 = "";
                                        }
                                        Boolean valueOf2 = Boolean.valueOf(activity.isFree());
                                        Boolean bool2 = Boolean.FALSE;
                                        HashMap<String, LibraryCollectionItemAccessModel> hashMap22 = this$0.f39638y;
                                        if (hashMap22 != null && (libraryCollectionItemAccessModel4 = hashMap22.get(activity.getId())) != null && libraryCollectionItemAccessModel4.isCompleted()) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            str7 = "completed";
                                        } else {
                                            if (hashMap22 != null && (libraryCollectionItemAccessModel2 = hashMap22.get(activity.getId())) != null && libraryCollectionItemAccessModel2.isAccessed()) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (z15) {
                                                str7 = "incomplete";
                                            } else {
                                                str7 = "not_started";
                                            }
                                        }
                                        Boolean valueOf3 = Boolean.valueOf(z19);
                                        if (hashMap22 != null && (libraryCollectionItemAccessModel3 = hashMap22.get(activity.getId())) != null && libraryCollectionItemAccessModel3.isBookmarked()) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        cVar.q(id3, itemType2, str12, valueOf2, bool2, str11, str7, valueOf3, -1, Boolean.valueOf(!z16), activity.getDynamicVariant());
                                        return;
                                }
                            }
                        });
                    } else {
                        ((AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityBookmark)).setVisibility(8);
                    }
                    linearLayout.addView(inflate);
                }
            }
            str4 = "";
            robertoTextView.setText(str4);
            RobertoTextView robertoTextView22 = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivitySubHeader);
            str2 = (String) u.j2(1, libraryCollectionItem.getStrings());
            if (str2 != null) {
            }
            robertoTextView22.setText(str6);
            RobertoTextView robertoTextView32 = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivityHeader);
            int i132 = R.color.title_high_contrast_54_opacity;
            if (!z11) {
            }
            robertoTextView32.setTextColor(g0.a.b(context, i6));
            RobertoTextView robertoTextView42 = (RobertoTextView) inflate.findViewById(R.id.tvRowCAFParentActivitySubHeader);
            if (z11) {
            }
            robertoTextView42.setTextColor(g0.a.b(context, i132));
            View findViewById2 = inflate.findViewById(R.id.viewRowCAFBottom);
            if (!z10) {
            }
            findViewById2.setVisibility(i10);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) inflate.findViewById(R.id.ivRowCAFParentActivityStatus);
            if (!z12) {
            }
            appCompatImageView3.setImageResource(i11);
            inflate.setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f f39633v;

                {
                    this.f39633v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z14;
                    boolean z15;
                    String str7;
                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
                    boolean z16;
                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel3;
                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel4;
                    boolean z17;
                    boolean z18;
                    String str8;
                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel5;
                    LibraryCollectionItemAccessModel libraryCollectionItemAccessModel6;
                    int i14 = r5;
                    boolean z19 = z11;
                    LibraryCollectionItem activity = libraryCollectionItem;
                    f this$0 = this.f39633v;
                    switch (i14) {
                        case 0:
                            String str9 = str;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(activity, "$activity");
                            ss.b<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, String, hs.k> bVar = this$0.D;
                            String id2 = activity.getId();
                            String itemType = activity.getItemType();
                            String str10 = (String) u.j2(0, activity.getStrings());
                            if (str10 == null) {
                                str10 = "";
                            }
                            Boolean valueOf = Boolean.valueOf(activity.isFree());
                            Boolean bool = Boolean.FALSE;
                            HashMap<String, LibraryCollectionItemAccessModel> hashMap2 = this$0.f39638y;
                            if (hashMap2 != null && (libraryCollectionItemAccessModel6 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel6.isCompleted()) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                str8 = "completed";
                            } else {
                                if (hashMap2 != null && (libraryCollectionItemAccessModel5 = hashMap2.get(activity.getId())) != null && libraryCollectionItemAccessModel5.isAccessed()) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (z18) {
                                    str8 = "incomplete";
                                } else {
                                    str8 = "not_started";
                                }
                            }
                            bVar.x(id2, itemType, str10, valueOf, bool, str9, str8, Boolean.valueOf(z19), -1, activity.getDynamicVariant());
                            return;
                        default:
                            String str11 = str;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(activity, "$activity");
                            ss.c<String, String, String, Boolean, Boolean, String, String, Boolean, Integer, Boolean, String, hs.k> cVar = this$0.E;
                            String id3 = activity.getId();
                            String itemType2 = activity.getItemType();
                            String str12 = (String) u.j2(0, activity.getStrings());
                            if (str12 == null) {
                                str12 = "";
                            }
                            Boolean valueOf2 = Boolean.valueOf(activity.isFree());
                            Boolean bool2 = Boolean.FALSE;
                            HashMap<String, LibraryCollectionItemAccessModel> hashMap22 = this$0.f39638y;
                            if (hashMap22 != null && (libraryCollectionItemAccessModel4 = hashMap22.get(activity.getId())) != null && libraryCollectionItemAccessModel4.isCompleted()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                str7 = "completed";
                            } else {
                                if (hashMap22 != null && (libraryCollectionItemAccessModel2 = hashMap22.get(activity.getId())) != null && libraryCollectionItemAccessModel2.isAccessed()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    str7 = "incomplete";
                                } else {
                                    str7 = "not_started";
                                }
                            }
                            Boolean valueOf3 = Boolean.valueOf(z19);
                            if (hashMap22 != null && (libraryCollectionItemAccessModel3 = hashMap22.get(activity.getId())) != null && libraryCollectionItemAccessModel3.isBookmarked()) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            cVar.q(id3, itemType2, str12, valueOf2, bool2, str11, str7, valueOf3, -1, Boolean.valueOf(!z16), activity.getDynamicVariant());
                            return;
                    }
                }
            });
            str3 = this.B;
            if (str3 != null) {
            }
            if (!this.f39639z) {
            }
            linearLayout.addView(inflate);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.F, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 == null) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: Exception -> 0x0097, LOOP:0: B:11:0x0027->B:32:0x0079, LOOP_END, TryCatch #0 {Exception -> 0x0097, blocks: (B:4:0x0009, B:7:0x0016, B:9:0x001c, B:10:0x001f, B:11:0x0027, B:13:0x002e, B:15:0x0042, B:17:0x004a, B:34:0x007d, B:42:0x008f, B:32:0x0079, B:20:0x0055, B:21:0x0059, B:23:0x005f, B:6:0x0011), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(String id2) {
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(id2, "id");
        HashMap<String, LibraryCollectionItemAccessModel> hashMap = this.f39638y;
        if (hashMap != null) {
            try {
                libraryCollectionItemAccessModel = hashMap.get(id2);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.F, e10);
                return;
            }
        }
        libraryCollectionItemAccessModel = new LibraryCollectionItemAccessModel();
        boolean z12 = true;
        libraryCollectionItemAccessModel.setCompleted(true);
        if (hashMap != null) {
            hashMap.put(id2, libraryCollectionItemAccessModel);
        }
        Iterator<hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>>> it = this.f39637x.iterator();
        int i6 = 0;
        while (true) {
            if (it.hasNext()) {
                hs.f<LibraryCollectionItem, ArrayList<LibraryCollectionItem>> next = it.next();
                if (!kotlin.jvm.internal.i.b(next.f19464u.getId(), id2)) {
                    ArrayList<LibraryCollectionItem> arrayList = next.f19465v;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        for (LibraryCollectionItem libraryCollectionItem : arrayList) {
                            if (kotlin.jvm.internal.i.b(libraryCollectionItem.getId(), id2)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        z10 = false;
                        if (!z10) {
                            break;
                        }
                        i6++;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            } else {
                i6 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i6);
        if (valueOf.intValue() != -1) {
            z12 = false;
        }
        if (z12) {
            valueOf = null;
        }
        if (valueOf != null) {
            j(valueOf.intValue());
        }
    }
}
