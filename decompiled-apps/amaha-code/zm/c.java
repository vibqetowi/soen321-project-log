package zm;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import pl.w0;
import ss.u;
/* compiled from: LibraryAllTopPicksAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {
    public final boolean A;
    public final u<String, String, String, Boolean, String, Integer, String, hs.k> B;
    public final String C;
    public final ArrayList<LibraryCollectionItem> D;
    public String E;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<LibraryCollectionItem> f39619x;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, hs.f<Boolean, Boolean>> f39620y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, String> f39621z;

    /* compiled from: LibraryAllTopPicksAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final View A;
        public final AppCompatImageView B;
        public final RobertoTextView C;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f39622u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f39623v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f39624w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f39625x;

        /* renamed from: y  reason: collision with root package name */
        public final AppCompatImageView f39626y;

        /* renamed from: z  reason: collision with root package name */
        public final View f39627z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvRowTpHeader);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.tvRowTpHeader)");
            this.f39622u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowTpSubHeader);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvRowTpSubHeader)");
            this.f39623v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowTpDescription);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvRowTpDescription)");
            this.f39624w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowTpCtaText);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowTpCtaText)");
            this.f39625x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ivRowTpCtaIcon);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.ivRowTpCtaIcon)");
            this.f39626y = (AppCompatImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.clRowTpCtaContainer);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.clRowTpCtaContainer)");
            this.f39627z = findViewById6;
            View findViewById7 = view.findViewById(R.id.clRowTpContainer);
            kotlin.jvm.internal.i.f(findViewById7, "view.findViewById(R.id.clRowTpContainer)");
            this.A = findViewById7;
            View findViewById8 = view.findViewById(R.id.tvRowTpBackgroundImage);
            kotlin.jvm.internal.i.f(findViewById8, "view.findViewById(R.id.tvRowTpBackgroundImage)");
            this.B = (AppCompatImageView) findViewById8;
            View findViewById9 = view.findViewById(R.id.tvRowTpPremiumIndicator);
            kotlin.jvm.internal.i.f(findViewById9, "view.findViewById(R.id.tvRowTpPremiumIndicator)");
            this.C = (RobertoTextView) findViewById9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(ArrayList<LibraryCollectionItem> itemList, HashMap<String, hs.f<Boolean, Boolean>> activityAccessSet, HashMap<String, String> hashMap, boolean z10, u<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super Integer, ? super String, hs.k> uVar) {
        kotlin.jvm.internal.i.g(itemList, "itemList");
        kotlin.jvm.internal.i.g(activityAccessSet, "activityAccessSet");
        this.f39619x = itemList;
        this.f39620y = activityAccessSet;
        this.f39621z = hashMap;
        this.A = z10;
        this.B = uVar;
        this.C = LogHelper.INSTANCE.makeLogTag("LibraryAllTopPicksAdapter");
        ArrayList<LibraryCollectionItem> arrayList = new ArrayList<>();
        this.D = arrayList;
        this.E = "all";
        arrayList.addAll(itemList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.D.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x020f, code lost:
        if (r2 == null) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0222 A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027f A[Catch: Exception -> 0x0320, TRY_ENTER, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ae A[Catch: Exception -> 0x0320, TRY_ENTER, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b9 A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c6 A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d6 A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02eb A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:15:0x0040, B:17:0x0052, B:24:0x0066, B:26:0x0078, B:33:0x008c, B:35:0x009e, B:37:0x00a2, B:39:0x00ae, B:46:0x00c3, B:49:0x00cd, B:51:0x00d9, B:133:0x0212, B:135:0x0222, B:141:0x0235, B:145:0x024b, B:148:0x0268, B:151:0x027f, B:158:0x028c, B:159:0x029d, B:163:0x02ae, B:166:0x02b5, B:167:0x02b9, B:170:0x02c2, B:171:0x02c6, B:174:0x02cf, B:175:0x02d6, B:178:0x02df, B:179:0x02e5, B:181:0x02eb, B:185:0x02f7, B:189:0x030a, B:57:0x00ed, B:60:0x00f6, B:62:0x0102, B:68:0x0116, B:71:0x011f, B:73:0x012b, B:79:0x013f, B:81:0x014b, B:87:0x015f, B:89:0x016b, B:95:0x017f, B:97:0x018b, B:102:0x019a, B:104:0x01a6, B:110:0x01b9, B:112:0x01c5, B:117:0x01d4, B:119:0x01e0, B:125:0x01f3, B:127:0x01ff), top: B:194:0x000c }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int hashCode;
        int i10;
        String str8;
        a aVar2 = aVar;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap = this.f39620y;
        RobertoTextView robertoTextView = aVar2.C;
        try {
            LibraryCollectionItem libraryCollectionItem = (LibraryCollectionItem) is.u.j2(i6, this.D);
            if (libraryCollectionItem != null) {
                RobertoTextView robertoTextView2 = aVar2.f39622u;
                String str9 = (String) is.u.j2(0, libraryCollectionItem.getStrings());
                String str10 = "";
                String str11 = null;
                if (str9 != null) {
                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str9, "-")).booleanValue()) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        robertoTextView2.setText(str9);
                        RobertoTextView robertoTextView3 = aVar2.f39623v;
                        boolean z12 = true;
                        str = (String) is.u.j2(1, libraryCollectionItem.getStrings());
                        if (str != null) {
                            if (Boolean.valueOf(kotlin.jvm.internal.i.b(str, "-")).booleanValue()) {
                                str = null;
                            }
                            if (str != null) {
                                robertoTextView3.setText(str);
                                RobertoTextView robertoTextView4 = aVar2.f39624w;
                                str2 = (String) is.u.j2(2, libraryCollectionItem.getStrings());
                                if (str2 != null) {
                                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str2, "-")).booleanValue()) {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        robertoTextView4.setText(str2);
                                        RobertoTextView robertoTextView5 = aVar2.f39625x;
                                        if (!kotlin.jvm.internal.i.b(libraryCollectionItem.getItemType(), "mini_course")) {
                                            HashMap<String, String> hashMap2 = this.f39621z;
                                            if (hashMap2 != null) {
                                                String str12 = hashMap2.get(libraryCollectionItem.getId());
                                                if (str12 != null) {
                                                    int hashCode2 = str12.hashCode();
                                                    if (hashCode2 != -1402931637) {
                                                        if (hashCode2 != -753541113) {
                                                            if (hashCode2 == 815402773 && str12.equals("not_started")) {
                                                                str3 = (String) is.u.j2(3, libraryCollectionItem.getStrings());
                                                                if (str3 != null) {
                                                                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                                        str3 = null;
                                                                    }
                                                                    if (str3 == null) {
                                                                    }
                                                                }
                                                                str3 = "";
                                                            }
                                                        } else if (str12.equals("in_progress")) {
                                                            str3 = (String) is.u.j2(4, libraryCollectionItem.getStrings());
                                                            if (str3 != null) {
                                                                if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                                    str3 = null;
                                                                }
                                                                if (str3 == null) {
                                                                }
                                                            }
                                                            str3 = "";
                                                        }
                                                    } else if (str12.equals("completed")) {
                                                        str3 = (String) is.u.j2(5, libraryCollectionItem.getStrings());
                                                        if (str3 != null) {
                                                            if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                                str3 = null;
                                                            }
                                                            if (str3 == null) {
                                                            }
                                                        }
                                                        str3 = "";
                                                    }
                                                    robertoTextView5.setText(str3);
                                                    str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                                    if (str4 != null) {
                                                        if (Boolean.valueOf(kotlin.jvm.internal.i.b(str4, "-")).booleanValue()) {
                                                            str4 = null;
                                                        }
                                                        if (str4 != null) {
                                                            str10 = str4;
                                                        }
                                                    }
                                                    robertoTextView.setText(str10);
                                                    View view = aVar2.f39627z;
                                                    str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                                    String str13 = "#00C2CE";
                                                    if (str5 == null) {
                                                        str5 = "#00C2CE";
                                                    }
                                                    view.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                                    View view2 = aVar2.A;
                                                    str6 = libraryCollectionItem.getAssets().get("bg_color");
                                                    if (str6 == null) {
                                                        str6 = "#FF9AA2";
                                                    }
                                                    view2.setBackgroundColor(Color.parseColor(str6));
                                                    str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                                    View view3 = aVar2.f2751a;
                                                    if (str7 != null) {
                                                        if (str7.length() != 0) {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            str11 = str7;
                                                        }
                                                        if (str11 != null) {
                                                            Glide.g(view3.getContext()).p(str11).B(aVar2.B);
                                                        }
                                                    }
                                                    String itemType = libraryCollectionItem.getItemType();
                                                    hashCode = itemType.hashCode();
                                                    AppCompatImageView appCompatImageView = aVar2.f39626y;
                                                    switch (hashCode) {
                                                        case -341064690:
                                                            if (!itemType.equals("resource")) {
                                                                break;
                                                            } else {
                                                                appCompatImageView.setImageResource(R.drawable.ic_library_tp_book);
                                                                break;
                                                            }
                                                        case -38716301:
                                                            if (!itemType.equals("recommended_activity")) {
                                                                break;
                                                            } else {
                                                                appCompatImageView.setImageResource(R.drawable.ic_library_tp_headphone);
                                                                break;
                                                            }
                                                        case 606502613:
                                                            if (!itemType.equals("main_activity")) {
                                                                break;
                                                            } else {
                                                                appCompatImageView.setImageResource(R.drawable.ic_library_tp_arrow);
                                                                break;
                                                            }
                                                        case 955611395:
                                                            if (!itemType.equals("mini_course")) {
                                                                break;
                                                            } else {
                                                                appCompatImageView.setImageResource(R.drawable.ic_library_tp_arrow);
                                                                break;
                                                            }
                                                    }
                                                    if (libraryCollectionItem.isFree() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                                        i10 = 0;
                                                    } else {
                                                        i10 = 8;
                                                    }
                                                    robertoTextView.setVisibility(i10);
                                                    str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                                    if (str8 == null) {
                                                        str13 = str8;
                                                    }
                                                    robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str13)));
                                                    view3.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                                    return;
                                                }
                                                str3 = (String) is.u.j2(3, libraryCollectionItem.getStrings());
                                                if (str3 != null) {
                                                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                        str3 = null;
                                                    }
                                                    if (str3 == null) {
                                                    }
                                                    robertoTextView5.setText(str3);
                                                    str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                                    if (str4 != null) {
                                                    }
                                                    robertoTextView.setText(str10);
                                                    View view4 = aVar2.f39627z;
                                                    str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                                    String str132 = "#00C2CE";
                                                    if (str5 == null) {
                                                    }
                                                    view4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                                    View view22 = aVar2.A;
                                                    str6 = libraryCollectionItem.getAssets().get("bg_color");
                                                    if (str6 == null) {
                                                    }
                                                    view22.setBackgroundColor(Color.parseColor(str6));
                                                    str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                                    View view32 = aVar2.f2751a;
                                                    if (str7 != null) {
                                                    }
                                                    String itemType2 = libraryCollectionItem.getItemType();
                                                    hashCode = itemType2.hashCode();
                                                    AppCompatImageView appCompatImageView2 = aVar2.f39626y;
                                                    switch (hashCode) {
                                                        case -341064690:
                                                            break;
                                                        case -38716301:
                                                            break;
                                                        case 606502613:
                                                            break;
                                                        case 955611395:
                                                            break;
                                                    }
                                                    if (libraryCollectionItem.isFree()) {
                                                    }
                                                    i10 = 8;
                                                    robertoTextView.setVisibility(i10);
                                                    str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                                    if (str8 == null) {
                                                    }
                                                    robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str132)));
                                                    view32.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                                    return;
                                                }
                                                str3 = "";
                                                robertoTextView5.setText(str3);
                                                str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                                if (str4 != null) {
                                                }
                                                robertoTextView.setText(str10);
                                                View view42 = aVar2.f39627z;
                                                str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                                String str1322 = "#00C2CE";
                                                if (str5 == null) {
                                                }
                                                view42.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                                View view222 = aVar2.A;
                                                str6 = libraryCollectionItem.getAssets().get("bg_color");
                                                if (str6 == null) {
                                                }
                                                view222.setBackgroundColor(Color.parseColor(str6));
                                                str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                                View view322 = aVar2.f2751a;
                                                if (str7 != null) {
                                                }
                                                String itemType22 = libraryCollectionItem.getItemType();
                                                hashCode = itemType22.hashCode();
                                                AppCompatImageView appCompatImageView22 = aVar2.f39626y;
                                                switch (hashCode) {
                                                    case -341064690:
                                                        break;
                                                    case -38716301:
                                                        break;
                                                    case 606502613:
                                                        break;
                                                    case 955611395:
                                                        break;
                                                }
                                                if (libraryCollectionItem.isFree()) {
                                                }
                                                i10 = 8;
                                                robertoTextView.setVisibility(i10);
                                                str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                                if (str8 == null) {
                                                }
                                                robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str1322)));
                                                view322.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                                return;
                                            }
                                            str3 = (String) is.u.j2(3, libraryCollectionItem.getStrings());
                                            if (str3 != null) {
                                                if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                }
                                                robertoTextView5.setText(str3);
                                                str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                                if (str4 != null) {
                                                }
                                                robertoTextView.setText(str10);
                                                View view422 = aVar2.f39627z;
                                                str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                                String str13222 = "#00C2CE";
                                                if (str5 == null) {
                                                }
                                                view422.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                                View view2222 = aVar2.A;
                                                str6 = libraryCollectionItem.getAssets().get("bg_color");
                                                if (str6 == null) {
                                                }
                                                view2222.setBackgroundColor(Color.parseColor(str6));
                                                str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                                View view3222 = aVar2.f2751a;
                                                if (str7 != null) {
                                                }
                                                String itemType222 = libraryCollectionItem.getItemType();
                                                hashCode = itemType222.hashCode();
                                                AppCompatImageView appCompatImageView222 = aVar2.f39626y;
                                                switch (hashCode) {
                                                    case -341064690:
                                                        break;
                                                    case -38716301:
                                                        break;
                                                    case 606502613:
                                                        break;
                                                    case 955611395:
                                                        break;
                                                }
                                                if (libraryCollectionItem.isFree()) {
                                                }
                                                i10 = 8;
                                                robertoTextView.setVisibility(i10);
                                                str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                                if (str8 == null) {
                                                }
                                                robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str13222)));
                                                view3222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                                return;
                                            }
                                            str3 = "";
                                            robertoTextView5.setText(str3);
                                            str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                            if (str4 != null) {
                                            }
                                            robertoTextView.setText(str10);
                                            View view4222 = aVar2.f39627z;
                                            str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                            String str132222 = "#00C2CE";
                                            if (str5 == null) {
                                            }
                                            view4222.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                            View view22222 = aVar2.A;
                                            str6 = libraryCollectionItem.getAssets().get("bg_color");
                                            if (str6 == null) {
                                            }
                                            view22222.setBackgroundColor(Color.parseColor(str6));
                                            str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                            View view32222 = aVar2.f2751a;
                                            if (str7 != null) {
                                            }
                                            String itemType2222 = libraryCollectionItem.getItemType();
                                            hashCode = itemType2222.hashCode();
                                            AppCompatImageView appCompatImageView2222 = aVar2.f39626y;
                                            switch (hashCode) {
                                                case -341064690:
                                                    break;
                                                case -38716301:
                                                    break;
                                                case 606502613:
                                                    break;
                                                case 955611395:
                                                    break;
                                            }
                                            if (libraryCollectionItem.isFree()) {
                                            }
                                            i10 = 8;
                                            robertoTextView.setVisibility(i10);
                                            str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                            if (str8 == null) {
                                            }
                                            robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str132222)));
                                            view32222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                            return;
                                        }
                                        hs.f<Boolean, Boolean> fVar = hashMap.get(libraryCollectionItem.getId());
                                        if (fVar != null && fVar.f19465v.booleanValue()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            str3 = (String) is.u.j2(5, libraryCollectionItem.getStrings());
                                            if (str3 != null) {
                                                if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                }
                                                robertoTextView5.setText(str3);
                                                str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                                if (str4 != null) {
                                                }
                                                robertoTextView.setText(str10);
                                                View view42222 = aVar2.f39627z;
                                                str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                                String str1322222 = "#00C2CE";
                                                if (str5 == null) {
                                                }
                                                view42222.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                                View view222222 = aVar2.A;
                                                str6 = libraryCollectionItem.getAssets().get("bg_color");
                                                if (str6 == null) {
                                                }
                                                view222222.setBackgroundColor(Color.parseColor(str6));
                                                str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                                View view322222 = aVar2.f2751a;
                                                if (str7 != null) {
                                                }
                                                String itemType22222 = libraryCollectionItem.getItemType();
                                                hashCode = itemType22222.hashCode();
                                                AppCompatImageView appCompatImageView22222 = aVar2.f39626y;
                                                switch (hashCode) {
                                                    case -341064690:
                                                        break;
                                                    case -38716301:
                                                        break;
                                                    case 606502613:
                                                        break;
                                                    case 955611395:
                                                        break;
                                                }
                                                if (libraryCollectionItem.isFree()) {
                                                }
                                                i10 = 8;
                                                robertoTextView.setVisibility(i10);
                                                str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                                if (str8 == null) {
                                                }
                                                robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str1322222)));
                                                view322222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                                return;
                                            }
                                            str3 = "";
                                            robertoTextView5.setText(str3);
                                            str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                            if (str4 != null) {
                                            }
                                            robertoTextView.setText(str10);
                                            View view422222 = aVar2.f39627z;
                                            str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                            String str13222222 = "#00C2CE";
                                            if (str5 == null) {
                                            }
                                            view422222.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                            View view2222222 = aVar2.A;
                                            str6 = libraryCollectionItem.getAssets().get("bg_color");
                                            if (str6 == null) {
                                            }
                                            view2222222.setBackgroundColor(Color.parseColor(str6));
                                            str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                            View view3222222 = aVar2.f2751a;
                                            if (str7 != null) {
                                            }
                                            String itemType222222 = libraryCollectionItem.getItemType();
                                            hashCode = itemType222222.hashCode();
                                            AppCompatImageView appCompatImageView222222 = aVar2.f39626y;
                                            switch (hashCode) {
                                                case -341064690:
                                                    break;
                                                case -38716301:
                                                    break;
                                                case 606502613:
                                                    break;
                                                case 955611395:
                                                    break;
                                            }
                                            if (libraryCollectionItem.isFree()) {
                                            }
                                            i10 = 8;
                                            robertoTextView.setVisibility(i10);
                                            str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                            if (str8 == null) {
                                            }
                                            robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str13222222)));
                                            view3222222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                            return;
                                        }
                                        hs.f<Boolean, Boolean> fVar2 = hashMap.get(libraryCollectionItem.getId());
                                        if (fVar2 != null && fVar2.f19464u.booleanValue()) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            str3 = (String) is.u.j2(4, libraryCollectionItem.getStrings());
                                            if (str3 != null) {
                                                if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                }
                                                robertoTextView5.setText(str3);
                                                str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                                if (str4 != null) {
                                                }
                                                robertoTextView.setText(str10);
                                                View view4222222 = aVar2.f39627z;
                                                str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                                String str132222222 = "#00C2CE";
                                                if (str5 == null) {
                                                }
                                                view4222222.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                                View view22222222 = aVar2.A;
                                                str6 = libraryCollectionItem.getAssets().get("bg_color");
                                                if (str6 == null) {
                                                }
                                                view22222222.setBackgroundColor(Color.parseColor(str6));
                                                str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                                View view32222222 = aVar2.f2751a;
                                                if (str7 != null) {
                                                }
                                                String itemType2222222 = libraryCollectionItem.getItemType();
                                                hashCode = itemType2222222.hashCode();
                                                AppCompatImageView appCompatImageView2222222 = aVar2.f39626y;
                                                switch (hashCode) {
                                                    case -341064690:
                                                        break;
                                                    case -38716301:
                                                        break;
                                                    case 606502613:
                                                        break;
                                                    case 955611395:
                                                        break;
                                                }
                                                if (libraryCollectionItem.isFree()) {
                                                }
                                                i10 = 8;
                                                robertoTextView.setVisibility(i10);
                                                str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                                if (str8 == null) {
                                                }
                                                robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str132222222)));
                                                view32222222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                                return;
                                            }
                                            str3 = "";
                                            robertoTextView5.setText(str3);
                                            str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                            if (str4 != null) {
                                            }
                                            robertoTextView.setText(str10);
                                            View view42222222 = aVar2.f39627z;
                                            str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                            String str1322222222 = "#00C2CE";
                                            if (str5 == null) {
                                            }
                                            view42222222.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                            View view222222222 = aVar2.A;
                                            str6 = libraryCollectionItem.getAssets().get("bg_color");
                                            if (str6 == null) {
                                            }
                                            view222222222.setBackgroundColor(Color.parseColor(str6));
                                            str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                            View view322222222 = aVar2.f2751a;
                                            if (str7 != null) {
                                            }
                                            String itemType22222222 = libraryCollectionItem.getItemType();
                                            hashCode = itemType22222222.hashCode();
                                            AppCompatImageView appCompatImageView22222222 = aVar2.f39626y;
                                            switch (hashCode) {
                                                case -341064690:
                                                    break;
                                                case -38716301:
                                                    break;
                                                case 606502613:
                                                    break;
                                                case 955611395:
                                                    break;
                                            }
                                            if (libraryCollectionItem.isFree()) {
                                            }
                                            i10 = 8;
                                            robertoTextView.setVisibility(i10);
                                            str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                            if (str8 == null) {
                                            }
                                            robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str1322222222)));
                                            view322222222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                            return;
                                        }
                                        str3 = (String) is.u.j2(3, libraryCollectionItem.getStrings());
                                        if (str3 != null) {
                                            if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                str3 = null;
                                            }
                                        }
                                        str3 = "";
                                        robertoTextView5.setText(str3);
                                        str4 = (String) is.u.j2(6, libraryCollectionItem.getStrings());
                                        if (str4 != null) {
                                        }
                                        robertoTextView.setText(str10);
                                        View view422222222 = aVar2.f39627z;
                                        str5 = libraryCollectionItem.getAssets().get("bg_color_cta");
                                        String str13222222222 = "#00C2CE";
                                        if (str5 == null) {
                                        }
                                        view422222222.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                        View view2222222222 = aVar2.A;
                                        str6 = libraryCollectionItem.getAssets().get("bg_color");
                                        if (str6 == null) {
                                        }
                                        view2222222222.setBackgroundColor(Color.parseColor(str6));
                                        str7 = libraryCollectionItem.getAssets().get("bg_asset");
                                        View view3222222222 = aVar2.f2751a;
                                        if (str7 != null) {
                                        }
                                        String itemType222222222 = libraryCollectionItem.getItemType();
                                        hashCode = itemType222222222.hashCode();
                                        AppCompatImageView appCompatImageView222222222 = aVar2.f39626y;
                                        switch (hashCode) {
                                            case -341064690:
                                                break;
                                            case -38716301:
                                                break;
                                            case 606502613:
                                                break;
                                            case 955611395:
                                                break;
                                        }
                                        if (libraryCollectionItem.isFree()) {
                                        }
                                        i10 = 8;
                                        robertoTextView.setVisibility(i10);
                                        str8 = libraryCollectionItem.getAssets().get("bg_lock_indicator");
                                        if (str8 == null) {
                                        }
                                        robertoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str13222222222)));
                                        view3222222222.setOnClickListener(new w0(this, 14, libraryCollectionItem));
                                        return;
                                    }
                                }
                                str2 = "";
                                robertoTextView4.setText(str2);
                                RobertoTextView robertoTextView52 = aVar2.f39625x;
                                if (!kotlin.jvm.internal.i.b(libraryCollectionItem.getItemType(), "mini_course")) {
                                }
                            }
                        }
                        str = "";
                        robertoTextView3.setText(str);
                        RobertoTextView robertoTextView42 = aVar2.f39624w;
                        str2 = (String) is.u.j2(2, libraryCollectionItem.getStrings());
                        if (str2 != null) {
                        }
                        str2 = "";
                        robertoTextView42.setText(str2);
                        RobertoTextView robertoTextView522 = aVar2.f39625x;
                        if (!kotlin.jvm.internal.i.b(libraryCollectionItem.getItemType(), "mini_course")) {
                        }
                    }
                }
                str9 = "";
                robertoTextView2.setText(str9);
                RobertoTextView robertoTextView32 = aVar2.f39623v;
                boolean z122 = true;
                str = (String) is.u.j2(1, libraryCollectionItem.getStrings());
                if (str != null) {
                }
                str = "";
                robertoTextView32.setText(str);
                RobertoTextView robertoTextView422 = aVar2.f39624w;
                str2 = (String) is.u.j2(2, libraryCollectionItem.getStrings());
                if (str2 != null) {
                }
                str2 = "";
                robertoTextView422.setText(str2);
                RobertoTextView robertoTextView5222 = aVar2.f39625x;
                if (!kotlin.jvm.internal.i.b(libraryCollectionItem.getItemType(), "mini_course")) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        int i10;
        kotlin.jvm.internal.i.g(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (this.A) {
            i10 = R.layout.row_all_top_picks_dashboard;
        } else {
            i10 = R.layout.row_all_top_picks;
        }
        View inflate = from.inflate(i10, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "from(parent.context).inf…top_picks, parent, false)");
        return new a(inflate);
    }

    public final void v(String chip) {
        List list;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(chip, "chip");
        try {
            this.E = chip;
            ArrayList<LibraryCollectionItem> arrayList = this.D;
            arrayList.clear();
            boolean z12 = this.A;
            ArrayList<LibraryCollectionItem> arrayList2 = this.f39619x;
            if (z12) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    ArrayList<String> chips = ((LibraryCollectionItem) obj).getChips();
                    if (!(chips instanceof Collection) || !chips.isEmpty()) {
                        for (String str : chips) {
                            if (n.A0(str, chip, true)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                        arrayList3.add(obj);
                    }
                }
                list = is.u.E2(arrayList3, 6);
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    ArrayList<String> chips2 = ((LibraryCollectionItem) obj2).getChips();
                    if (!(chips2 instanceof Collection) || !chips2.isEmpty()) {
                        for (String str2 : chips2) {
                            if (n.A0(str2, chip, true)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        arrayList4.add(obj2);
                    }
                }
                list = arrayList4;
            }
            arrayList.addAll(list);
            i();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x0015, B:11:0x001f, B:13:0x0025, B:14:0x0029, B:16:0x002f, B:20:0x0044, B:35:0x007c, B:37:0x0089, B:57:0x00ca, B:59:0x00ce, B:60:0x00d3, B:61:0x00da, B:63:0x00e1, B:68:0x00f8, B:76:0x010a, B:77:0x0111, B:66:0x00f4, B:43:0x009b, B:45:0x00a3, B:48:0x00ab, B:49:0x00af, B:51:0x00b5, B:21:0x0047, B:23:0x0051, B:25:0x0057, B:26:0x005b, B:28:0x0061, B:32:0x0076), top: B:82:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.f<String, String> w(String[] strArr) {
        ArrayList<MiniCourse> miniCourses;
        Object obj;
        MiniCourse miniCourse;
        boolean z10;
        boolean z11;
        String str;
        ArrayList<MiniCourse> topicalCourseList;
        Object obj2;
        if (strArr != null) {
            try {
                if (strArr.length == 3) {
                    boolean z12 = true;
                    if (kotlin.jvm.internal.i.b(strArr[2], Constants.COURSE_GENERIC)) {
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                            Iterator<T> it = topicalCourseList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), strArr[1])) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            miniCourse = (MiniCourse) obj2;
                            if (miniCourse != null) {
                                CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) is.u.i2(miniCourse.getPlan());
                                if (courseDayModelV1 != null && courseDayModelV1.getStart_date() == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    str = "not_started";
                                } else {
                                    ArrayList<CourseDayModelV1> plan = miniCourse.getPlan();
                                    if (!(plan instanceof Collection) || !plan.isEmpty()) {
                                        for (CourseDayModelV1 courseDayModelV12 : plan) {
                                            if (!courseDayModelV12.isCompleted()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    z11 = true;
                                    if (z11) {
                                        str = "completed";
                                    } else {
                                        str = "in_progress";
                                    }
                                }
                                HashMap<String, String> hashMap = this.f39621z;
                                if (hashMap != null) {
                                    hashMap.put(strArr[0], str);
                                }
                                Iterator<LibraryCollectionItem> it2 = this.D.iterator();
                                int i6 = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (kotlin.jvm.internal.i.b(it2.next().getId(), strArr[0])) {
                                            break;
                                        }
                                        i6++;
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
                                return new hs.f<>(strArr[0], str);
                            }
                        }
                        miniCourse = null;
                        if (miniCourse != null) {
                        }
                    } else {
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null && (miniCourses = user2.getMiniCourses()) != null) {
                            Iterator<T> it3 = miniCourses.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj = it3.next();
                                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), strArr[1])) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            miniCourse = (MiniCourse) obj;
                            if (miniCourse != null) {
                            }
                        }
                        miniCourse = null;
                        if (miniCourse != null) {
                        }
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.C, e10);
            }
        }
        return null;
    }

    public final void x(String id2) {
        boolean z10;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap = this.f39620y;
        kotlin.jvm.internal.i.g(id2, "id");
        try {
            hs.f<Boolean, Boolean> fVar = hashMap.get(id2);
            Boolean bool = Boolean.TRUE;
            boolean z11 = false;
            if (fVar != null) {
                z10 = fVar.f19465v.booleanValue();
            } else {
                z10 = false;
            }
            hashMap.put(id2, new hs.f<>(bool, Boolean.valueOf(z10)));
            Iterator<LibraryCollectionItem> it = this.D.iterator();
            int i6 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.i.b(it.next().getId(), id2)) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i6);
            if (valueOf.intValue() == -1) {
                z11 = true;
            }
            if (z11) {
                valueOf = null;
            }
            if (valueOf != null) {
                j(valueOf.intValue());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    public final void y(String id2) {
        boolean z10;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap = this.f39620y;
        kotlin.jvm.internal.i.g(id2, "id");
        try {
            hs.f<Boolean, Boolean> fVar = hashMap.get(id2);
            boolean z11 = true;
            if (fVar != null) {
                z10 = fVar.f19464u.booleanValue();
            } else {
                z10 = true;
            }
            hashMap.put(id2, new hs.f<>(Boolean.valueOf(z10), Boolean.TRUE));
            Iterator<LibraryCollectionItem> it = this.D.iterator();
            int i6 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.i.b(it.next().getId(), id2)) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i6);
            if (valueOf.intValue() != -1) {
                z11 = false;
            }
            if (z11) {
                valueOf = null;
            }
            if (valueOf != null) {
                j(valueOf.intValue());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    public final void z(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return;
        }
        try {
            this.f39621z = hashMap;
            int i6 = 0;
            for (Object obj : this.D) {
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) obj).getItemType(), "mini_course")) {
                        j(i6);
                    }
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }
}
