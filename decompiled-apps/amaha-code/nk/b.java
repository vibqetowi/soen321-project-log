package nk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import hc.d;
import hs.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.i;
import mk.f;
import ri.e;
import ss.l;
/* compiled from: BookmarkedActivitiesListAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<C0430b> implements Filterable {
    public final l<Boolean, k> A;
    public final l<CourseDayDomainModelV1, k> B;
    public final String C;
    public final LayoutInflater D;
    public ArrayList<CourseDayDomainModelV1> E;
    public final a F;
    public final d G;

    /* renamed from: x  reason: collision with root package name */
    public final Context f26381x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<CourseDayDomainModelV1> f26382y;

    /* renamed from: z  reason: collision with root package name */
    public final l<CourseDayDomainModelV1, k> f26383z;

    /* compiled from: BookmarkedActivitiesListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends Filter {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x002c A[SYNTHETIC] */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            boolean z10;
            boolean z11;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence != null && !n.B0(charSequence)) {
                z10 = false;
            } else {
                z10 = true;
            }
            b bVar = b.this;
            if (z10) {
                ArrayList<CourseDayDomainModelV1> arrayList = bVar.f26382y;
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<CourseDayDomainModelV1> it = bVar.f26382y.iterator();
                while (it.hasNext()) {
                    CourseDayDomainModelV1 next = it.next();
                    String content_label = next.getDayModelV1().getContent_label();
                    if (content_label != null) {
                        Locale locale = Locale.ENGLISH;
                        String e10 = e.e(locale, "ENGLISH", content_label, locale, "this as java.lang.String).toLowerCase(locale)");
                        String lowerCase = charSequence.toString().toLowerCase(locale);
                        i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (r.J0(e10, lowerCase)) {
                            z11 = true;
                            if (!z11) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                filterResults.values = arrayList2;
                filterResults.count = arrayList2.size();
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj;
            ArrayList<CourseDayDomainModelV1> arrayList = null;
            if (filterResults != null) {
                obj = filterResults.values;
            } else {
                obj = null;
            }
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            b bVar = b.this;
            bVar.E = arrayList;
            bVar.i();
            bVar.A.invoke(Boolean.valueOf(bVar.E.isEmpty()));
        }
    }

    /* compiled from: BookmarkedActivitiesListAdapter.kt */
    /* renamed from: nk.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0430b extends RecyclerView.c0 {
        public C0430b(View view) {
            super(view);
        }
    }

    public b(BookmarkingActivity bookmarkingActivity, ArrayList bookmarkedActivitiesList, mk.d dVar, mk.e eVar, f fVar) {
        i.g(bookmarkedActivitiesList, "bookmarkedActivitiesList");
        this.f26381x = bookmarkingActivity;
        this.f26382y = bookmarkedActivitiesList;
        this.f26383z = dVar;
        this.A = eVar;
        this.B = fVar;
        this.C = LogHelper.INSTANCE.makeLogTag(b.class);
        Object systemService = bookmarkingActivity.getSystemService("layout_inflater");
        i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.D = (LayoutInflater) systemService;
        this.E = bookmarkedActivitiesList;
        this.F = new a();
        this.G = new d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.E.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0430b c0430b, int i6) {
        String str;
        View view = c0430b.f2751a;
        try {
            CourseDayDomainModelV1 courseDayDomainModelV1 = this.E.get(i6);
            i.f(courseDayDomainModelV1, "filteredList[position]");
            final CourseDayDomainModelV1 courseDayDomainModelV12 = courseDayDomainModelV1;
            ((RobertoTextView) view.findViewById(R.id.tvHeaderTitle)).setText(courseDayDomainModelV12.getDayModelV1().getContent_label());
            ArrayList<LogModel> arrayList = kn.a.f23436a;
            ((RobertoTextView) view.findViewById(R.id.tvCourseName)).setText(kn.a.j(courseDayDomainModelV12.getCourseName()));
            String courseName = courseDayDomainModelV12.getCourseName();
            CourseDayModelV1 dayModelV1 = courseDayDomainModelV12.getDayModelV1();
            boolean isEmpty = TextUtils.isEmpty(courseName);
            Context context = this.f26381x;
            d dVar = this.G;
            if (!isEmpty) {
                String symptom = dayModelV1.getSymptom();
                i.d(symptom);
                dVar.getClass();
                Integer Z = d.Z(courseName, symptom);
                if (Z != null) {
                    str = context.getString(Z.intValue());
                } else {
                    str = dayModelV1.getSymptom();
                    i.d(str);
                }
                i.f(str, "{\n            val sympto…delV1.symptom!!\n        }");
            } else {
                str = "";
            }
            ((RobertoTextView) view.findViewById(R.id.tvActivitySymptomsAndDuration)).setText(context.getString(R.string.dbRaExperimentSubHeader, str, courseDayDomainModelV12.getDuration()));
            String courseName2 = courseDayDomainModelV12.getCourseName();
            dVar.getClass();
            Integer E = d.E(courseName2);
            if (E != null) {
                ((RobertoTextView) view.findViewById(R.id.tvCourseName)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(view.getContext(), E.intValue())));
            }
            Integer I = d.I(courseDayDomainModelV12.getCourseName());
            if (I != null) {
                ((AppCompatImageView) view.findViewById(R.id.ivBookMarkedItem)).setImageResource(I.intValue());
            }
            if (courseDayDomainModelV12.getDayModelV1().getLast_accessed_date() != 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(courseDayDomainModelV12.getDayModelV1().getLast_accessed_date() * 1000);
                ((RobertoTextView) view.findViewById(R.id.tvActivityLastAccessedOn)).setText(context.getString(R.string.BookmarkingLastAccessedOn, new SimpleDateFormat("MMM dd, yyyy").format(calendar.getTime()).toString()));
            }
            view.setOnClickListener(new View.OnClickListener(this) { // from class: nk.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f26379v;

                {
                    this.f26379v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r3;
                    CourseDayDomainModelV1 model = courseDayDomainModelV12;
                    b this$0 = this.f26379v;
                    switch (i10) {
                        case 0:
                            i.g(this$0, "this$0");
                            i.g(model, "$model");
                            this$0.f26383z.invoke(model);
                            return;
                        default:
                            i.g(this$0, "this$0");
                            i.g(model, "$model");
                            this$0.B.invoke(model);
                            return;
                    }
                }
            });
            ((AppCompatImageView) view.findViewById(R.id.ivBookmark)).setOnClickListener(new View.OnClickListener(this) { // from class: nk.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f26379v;

                {
                    this.f26379v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r3;
                    CourseDayDomainModelV1 model = courseDayDomainModelV12;
                    b this$0 = this.f26379v;
                    switch (i10) {
                        case 0:
                            i.g(this$0, "this$0");
                            i.g(model, "$model");
                            this$0.f26383z.invoke(model);
                            return;
                        default:
                            i.g(this$0, "this$0");
                            i.g(model, "$model");
                            this$0.B.invoke(model);
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        View inflate = this.D.inflate(R.layout.bookmarking_activity_item, (ViewGroup) parent, false);
        i.f(inflate, "inflater.inflate(R.layou…vity_item, parent, false)");
        return new C0430b(inflate);
    }
}
