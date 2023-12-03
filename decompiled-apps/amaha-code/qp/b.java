package qp;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import hs.k;
import is.u;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.q;
import v.h;
/* compiled from: DashboardProviderEntryVariant2Adapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final q<String, String, Integer, k> A;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<TherapistPackagesModel> f29985x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f29986y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f29987z;

    /* compiled from: DashboardProviderEntryVariant2Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f29988u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f29989v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f29990w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f29991x;

        /* renamed from: y  reason: collision with root package name */
        public final AppCompatImageView f29992y;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvRowDbProviderEntryVar2Provider);
            i.f(findViewById, "itemView.findViewById(R.…roviderEntryVar2Provider)");
            this.f29988u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point1);
            i.f(findViewById2, "itemView.findViewById(R.…bProviderEntryVar2Point1)");
            this.f29989v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point2);
            i.f(findViewById3, "itemView.findViewById(R.…bProviderEntryVar2Point2)");
            this.f29990w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point3);
            i.f(findViewById4, "itemView.findViewById(R.…bProviderEntryVar2Point3)");
            this.f29991x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ivRowDbProviderEntryVar2Provider);
            i.f(findViewById5, "itemView.findViewById(R.…roviderEntryVar2Provider)");
            this.f29992y = (AppCompatImageView) findViewById5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ArrayList<TherapistPackagesModel> providerList, boolean z10, boolean z11, q<? super String, ? super String, ? super Integer, k> qVar) {
        i.g(providerList, "providerList");
        this.f29985x = providerList;
        this.f29986y = z10;
        this.f29987z = z11;
        this.A = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        if (this.f29985x.size() > 0) {
            return 10001;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r1 != 4) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 != 3) goto L71;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        String str;
        Integer num;
        a aVar2 = aVar;
        int size = i6 % this.f29985x.size();
        int i10 = 3;
        int i11 = 0;
        if (size != 0) {
            if (size != 1) {
                if (size == 2) {
                    int size2 = this.f29985x.size();
                    if (size2 != 3) {
                        if (size2 != 4) {
                            i10 = 4;
                        }
                    }
                }
                i10 = 0;
            } else {
                int size3 = this.f29985x.size();
                if (size3 != 3) {
                }
                i10 = 2;
            }
        } else {
            int size4 = this.f29985x.size();
            if (size4 != 3) {
            }
            i10 = 1;
        }
        TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) u.j2(i10, this.f29985x);
        if (therapistPackagesModel != null) {
            String str2 = "";
            StringBuilder sb2 = new StringBuilder("");
            String firstname = therapistPackagesModel.getFirstname();
            if (firstname == null) {
                firstname = "";
            }
            sb2.append(firstname);
            sb2.append(' ');
            String lastname = therapistPackagesModel.getLastname();
            if (lastname == null) {
                lastname = "";
            }
            sb2.append(lastname);
            aVar2.f29988u.setText(sb2.toString());
            ArrayList<EducationPackagesModel> educations = therapistPackagesModel.getEducations();
            if (educations == null) {
                str = "";
            } else {
                int i12 = 0;
                str = "";
                for (Object obj : educations) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        EducationPackagesModel educationPackagesModel = (EducationPackagesModel) obj;
                        StringBuilder c10 = h.c(str);
                        String degree = educationPackagesModel.getDegree();
                        if (degree == null) {
                            degree = "";
                        }
                        c10.append(degree);
                        c10.append(' ');
                        String major = educationPackagesModel.getMajor();
                        if (major == null) {
                            major = "";
                        }
                        c10.append(major);
                        str = c10.toString();
                        ArrayList<EducationPackagesModel> educations2 = therapistPackagesModel.getEducations();
                        i.d(educations2);
                        if (i12 != educations2.size() - 1 && !n.B0(str)) {
                            str = str.concat(", ");
                        }
                        i12 = i13;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
            }
            aVar2.f29989v.setText(str);
            StringBuilder sb3 = new StringBuilder();
            ExperiencePackagesModel experience = therapistPackagesModel.getExperience();
            if (experience != null) {
                num = Integer.valueOf(experience.getYear());
            } else {
                num = null;
            }
            sb3.append(num);
            sb3.append(" yrs. exp.");
            aVar2.f29990w.setText(sb3.toString());
            ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
            if (languages != null) {
                for (Object obj2 : languages) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        StringBuilder c11 = h.c(str2);
                        c11.append(((LanguagePackagesModel) obj2).getName());
                        str2 = c11.toString();
                        ArrayList<LanguagePackagesModel> languages2 = therapistPackagesModel.getLanguages();
                        i.d(languages2);
                        if (i11 != languages2.size() - 1 && (!n.B0(str2))) {
                            str2 = str2.concat(", ");
                        }
                        i11 = i14;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
            }
            aVar2.f29991x.setText(str2);
            View view = aVar2.f2751a;
            f g5 = Glide.g(view.getContext());
            g5.getClass();
            AppCompatImageView appCompatImageView = aVar2.f29992y;
            g5.b(new f.b(appCompatImageView));
            Glide.g(view.getContext()).p("https:" + therapistPackagesModel.getImage()).B(appCompatImageView);
            view.setOnClickListener(new bm.f(this, i10, i6, therapistPackagesModel, 2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (this.f29986y) {
            return new a(e.h(parent, R.layout.row_dashboard_provider_entry_layout_not_v4, parent, false, "from(parent.context).inf…ut_not_v4, parent, false)"));
        }
        if (this.f29987z) {
            return new a(e.h(parent, R.layout.row_dashboard_provider_entry_layout_variant_2, parent, false, "from(parent.context).inf…variant_2, parent, false)"));
        }
        return new a(e.h(parent, R.layout.row_provider_a3_var_b, parent, false, "from(parent.context).inf…_a3_var_b, parent, false)"));
    }
}
