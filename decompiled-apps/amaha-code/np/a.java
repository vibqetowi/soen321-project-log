package np;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import hs.k;
import is.u;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import op.c;
import ss.q;
import v.h;
/* compiled from: DashboardProviderEntryVariantDAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0438a> {

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<ProviderListModel> f26707x;

    /* renamed from: y  reason: collision with root package name */
    public final q<String, String, Integer, k> f26708y;

    /* compiled from: DashboardProviderEntryVariantDAdapter.kt */
    /* renamed from: np.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0438a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f26709u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f26710v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f26711w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f26712x;

        /* renamed from: y  reason: collision with root package name */
        public final AppCompatImageView f26713y;

        public C0438a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvRowDbProviderEntryVar2Provider);
            i.f(findViewById, "itemView.findViewById(R.…roviderEntryVar2Provider)");
            this.f26709u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point1);
            i.f(findViewById2, "itemView.findViewById(R.…bProviderEntryVar2Point1)");
            this.f26710v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point2);
            i.f(findViewById3, "itemView.findViewById(R.…bProviderEntryVar2Point2)");
            this.f26711w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point3);
            i.f(findViewById4, "itemView.findViewById(R.…bProviderEntryVar2Point3)");
            this.f26712x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ivRowDbProviderEntryVar2Provider);
            i.f(findViewById5, "itemView.findViewById(R.…roviderEntryVar2Provider)");
            this.f26713y = (AppCompatImageView) findViewById5;
        }
    }

    public a(ArrayList arrayList, c cVar) {
        this.f26707x = arrayList;
        this.f26708y = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        if (this.f26707x.size() > 0) {
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
    public final void n(C0438a c0438a, int i6) {
        String str;
        Integer num;
        C0438a c0438a2 = c0438a;
        int size = i6 % this.f26707x.size();
        int i10 = 3;
        int i11 = 0;
        if (size != 0) {
            if (size != 1) {
                if (size == 2) {
                    int size2 = this.f26707x.size();
                    if (size2 != 3) {
                        if (size2 != 4) {
                            i10 = 4;
                        }
                    }
                }
                i10 = 0;
            } else {
                int size3 = this.f26707x.size();
                if (size3 != 3) {
                }
                i10 = 2;
            }
        } else {
            int size4 = this.f26707x.size();
            if (size4 != 3) {
            }
            i10 = 1;
        }
        ProviderListModel providerListModel = (ProviderListModel) u.j2(i10, this.f26707x);
        if (providerListModel != null) {
            String str2 = "";
            StringBuilder sb2 = new StringBuilder("");
            String firstname = providerListModel.getFirstname();
            if (firstname == null) {
                firstname = "";
            }
            sb2.append(firstname);
            sb2.append(' ');
            String lastname = providerListModel.getLastname();
            if (lastname == null) {
                lastname = "";
            }
            sb2.append(lastname);
            c0438a2.f26709u.setText(sb2.toString());
            ArrayList<EducationPackagesModel> educations = providerListModel.getEducations();
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
                        ArrayList<EducationPackagesModel> educations2 = providerListModel.getEducations();
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
            c0438a2.f26710v.setText(str);
            StringBuilder sb3 = new StringBuilder();
            ExperiencePackagesModel experience = providerListModel.getExperience();
            if (experience != null) {
                num = Integer.valueOf(experience.getYear());
            } else {
                num = null;
            }
            sb3.append(num);
            sb3.append(" yrs. exp.");
            c0438a2.f26711w.setText(sb3.toString());
            ArrayList<LanguagePackagesModel> languages = providerListModel.getLanguages();
            if (languages != null) {
                for (Object obj2 : languages) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        StringBuilder c11 = h.c(str2);
                        c11.append(((LanguagePackagesModel) obj2).getName());
                        str2 = c11.toString();
                        ArrayList<LanguagePackagesModel> languages2 = providerListModel.getLanguages();
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
            c0438a2.f26712x.setText(str2);
            View view = c0438a2.f2751a;
            f g5 = Glide.g(view.getContext());
            g5.getClass();
            AppCompatImageView appCompatImageView = c0438a2.f26713y;
            g5.b(new f.b(appCompatImageView));
            Glide.g(view.getContext()).p("https:" + providerListModel.getImage()).B(appCompatImageView);
            view.setOnClickListener(new bm.f(this, i10, i6, providerListModel, 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new C0438a(e.h(parent, R.layout.row_dashboard_provider_entry_layout_variant_2, parent, false, "from(parent.context).inf…variant_2, parent, false)"));
    }
}
